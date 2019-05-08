import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String edad;
        String sexo;

        System.out.println("Para iniciar el test responde las siguientes preguntas");
        System.out.println("Cual es tu nombre completo ?");
        nombre = teclado.nextLine();
        System.out.println("¡Hola " + nombre + "!");
        System.out.println("Cual es tu edad?");
        edad = teclado.nextLine();
        System.out.println("Cual es tu sexo?");
        sexo = teclado.nextLine();

        Persona persona = new Persona(nombre, edad, sexo);
        persona.mostrarDatos();
        Menu menu = new Menu();
        menu.mostrarMenu();




    }
}
