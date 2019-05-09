void setup()
{
  startMills = millis();
  Serial.begin(115200);

  pinMode(5, INPUT_PULLUP);
  //pinMode(5, INPUT); It is not working
  // GPIO state preserved
  pinMode(4, OUTPUT);

  Serial.println("");
  Serial.println("starting setup");
  Serial.println(wifi_station_get_auto_connect());
  WiFi.setAutoConnect(true);
  wifi_fpm_set_sleep_type(LIGHT_SLEEP_T);
  wifi_connect();
  clientName += "esp8266-";
  uint8_t mac[6];
  WiFi.macAddress(mac);
  clientName += macToStr(mac);
  clientName += "-";
  clientName += String(micros() & 0xff, 16);
  

  reconnect();
}

void loop()
    payload += ",\"RSSI\":";
    payload += WiFi.RSSI();
    payload += "}";
    

    sendmqttMsg(topic, payload);
    delay(100);
  }

  client.disconnect();
  Serial.println("going to sleep");
  delay(100);
  wifi_station_disconnect();
  wifi_set_opmode(NULL_MODE);
  wifi_fpm_set_sleep_type(LIGHT_SLEEP_T);
  gpio_pin_wakeup_enable(GPIO_ID_PIN(5), GPIO_PIN_INTR_LOLEVEL);
  wifi_fpm_open();
  wifi_fpm_do_sleep(0xFFFFFFF);
  // after some loop wifi has problem.
  //wifi_fpm_do_sleep(100000000);
  delay(100);

  Serial.println("wake up");
  wifi_fpm_close();
  wifi_set_opmode(STATION_MODE);
  wifi_station_connect();
  digitalWrite(4, HIGH);
  delay(2000);
}