import java.util.Scanner;


class AskMenu {
    Scanner keyboard = new Scanner(System.in);

    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String answer5;

    public AskMenu() {
    }


    public void mostrarP1() {

        System.out.println("ENTRAS EN UN ASCENSOR Y…");
        System.out.println("1. Haces pasar a una chica que crees que baja después que tú…");
        System.out.println("2. Te pones en un rincón");
        System.out.println("3. Saludas a todo el mundo y te pones a hablar");
        System.out.println("4. Te das cuenta de que una persona anda algo “tocada");

        answer1 = keyboard.nextLine();


    }

    public void mostrarP2() {

        System.out.println("TE ENCUENTRAS CON UNA PERSONA QUE SE HA ACCIDENTADO EN LA CALLE…");
        System.out.println("1. Llamas a emergencias y procuras que la gente no se le agolpe");
        System.out.println("2. Le preguntas lo que ha pasado");
        System.out.println("3. Le das la mano hasta que llega ayuda");
        System.out.println("4. Te interesas por cómo se siente y procuras arroparla");

        answer2 = keyboard.nextLine();


    }

    public void mostrarP3() {

        System.out.println("UNA AMIGA PREGUNTA CÓMO LE QUEDA UN TOP QUE SE HA COMPRADO Y QUE NO TE ACABA DE GUSTAR. TÚ…");
        System.out.println("1. Le preguntas dónde se lo ha comprado y para qué event");
        System.out.println("2. Se lo alabas. Está tan feliz que qué más da que no sea de tu gusto…");
        System.out.println("3. Le sugieres que tal vez lo conjuntarías con otra cosa");
        System.out.println("4. Sonríes y evitas mojarte");

        answer3 = keyboard.nextLine();


    }

    public void mostrarP4() {

        System.out.println("UNA AMIGA PREGUNTA CÓMO LE QUEDA UN TOP QUE SE HA COMPRADO Y QUE NO TE ACABA DE GUSTAR. TÚ…");
        System.out.println("1. Le preguntas dónde se lo ha comprado y para qué evento");
        System.out.println("2. Se lo alabas. Está tan feliz que qué más da que no sea de tu gusto…");
        System.out.println("3. Le sugieres que tal vez lo conjuntarías con otra cosa");
        System.out.println("4. Sonríes y evitas mojarte");

        answer4 = keyboard.nextLine();


    }

    public void mostrarP5() {

        System.out.println("HAY QUE DECIDIR QUÉ REGALO HACERLE A UNA AMIGA DEL GRUPO QUE CUMPLE AÑOS Y…");
        System.out.println("1. Propones hacer un vídeo con los mejores momentos compartidos");
        System.out.println("2. Todos los amigos te miran a ti");
        System.out.println("3. Propones ir todos a un spa o una actividad de aventura");
        System.out.println("4. Esperas a ver qué opciones hay antes de dar tu opinión");

        answer5 = keyboard.nextLine();


    }

    public Integer calculate() {
        Integer res = 20;
        return res;


    }

}

