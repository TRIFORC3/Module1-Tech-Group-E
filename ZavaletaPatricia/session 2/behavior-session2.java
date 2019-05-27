public class behavior {
  public static void main (String arg []){
    //define variables
    int cryes = 0;
    int hitsHimSelf = 0;
    int hitsAuthority = 0;
    int totalCryes = 0;
    int totalHitsHimSelf = 0;
    int totalHitsAuthority = 0;
    int total = 0;
    int valueGiven = 0;
    
    //here is missing a program about the user inserting data

      //Case Cryes: 
      totalCryes = cryes + 1;
      //break;
      //Case HitsHimSelf: 
      totalHitsHimSelf = hitsHimSelf + 1;
      //break;
      //Case HitsAuthority: 
      totalHitsAuthority = hitsAuthority + 1;
      //break;      
      
    //end user counter

 
    total = totalCryes + totalHitsHimSelf + totalHitsAuthority;
    

    System.out.println("Your kid behaved badly " + total + " time(s) this week");
    System.out.println("Your kid cryed " + totalCryes + " time(s) this week");
    System.out.println("Your kid hit himself " + totalHitsHimSelf + " time(s) this week");
    System.out.println("Your kid hit authority " + totalHitsAuthority + " time(s) this week");
    
    valueGiven = (totalCryes) + (totalHitsHimSelf*2) + (totalHitsAuthority*3);
    
    if (valueGiven > 8 ) { 
      System.out.println("The behaivour is dangerous, implementing control behaviour is urgent");
      } else if (valueGiven > 4 ){
      System.out.println("The behaivour is a worry, implementing control behaviour is important");
      } else {
        System.out.println("The behaivour is normal");    

        
      }
  }
}