import java.util.Scanner;


class MenuPreguntas {
    Scanner teclado = new Scanner(System.in);
    String nombre;
    String edad;
    String sexo;
    Persona persona;
    String opcionP1;
    String opcionP2;
    String opcionP3;
    String opcionP4;
    String opcionP5;

    public MenuPreguntas() {
    }


    public void mostrarP1() {

        System.out.println("ENTRAS EN UN ASCENSOR Y…");
        System.out.println("1. Haces pasar a una chica que crees que baja después que tú…");
        System.out.println("2. Te pones en un rincón");
        System.out.println("3. Saludas a todo el mundo y te pones a hablar");
        System.out.println("4. Te das cuenta de que una persona anda algo “tocada");

        opcionP1 = teclado.nextLine();


    }

    public void mostrarP2() {

        System.out.println("TE ENCUENTRAS CON UNA PERSONA QUE SE HA ACCIDENTADO EN LA CALLE…");
        System.out.println("1. Llamas a emergencias y procuras que la gente no se le agolpe");
        System.out.println("2. Le preguntas lo que ha pasado");
        System.out.println("3. Le das la mano hasta que llega ayuda");
        System.out.println("4. Te interesas por cómo se siente y procuras arroparla");

        opcionP2 = teclado.nextLine();


    }

    public void mostrarP3() {

        System.out.println("UNA AMIGA PREGUNTA CÓMO LE QUEDA UN TOP QUE SE HA COMPRADO Y QUE NO TE ACABA DE GUSTAR. TÚ…");
        System.out.println("1. Le preguntas dónde se lo ha comprado y para qué event");
        System.out.println("2. Se lo alabas. Está tan feliz que qué más da que no sea de tu gusto…\n");
        System.out.println("3. Le sugieres que tal vez lo conjuntarías con otra cosa\n");
        System.out.println("4. Sonríes y evitas mojarte\n");

        opcionP3 = teclado.nextLine();


    }

}

