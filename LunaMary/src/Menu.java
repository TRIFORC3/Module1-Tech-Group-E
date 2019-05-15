import java.util.Scanner;


class Menu {
    Scanner teclado = new Scanner(System.in);
    private  String nombre;
    private Integer edad;
    private String sexo;
    Person persona;
    AskMenu menuPreguntas;

    public Menu() {
        menuPreguntas = new AskMenu();
    }


    public void mostrarPreguntas() {

        menuPreguntas.mostrarP1();
        menuPreguntas.mostrarP2();
        menuPreguntas.mostrarP3();
    }

    public void registrarPersona() {

        System.out.println("Para iniciar el test responde las siguientes preguntas");
        System.out.println("Ingresa tu nombre completo ?");
        nombre = teclado.nextLine();
        System.out.println("¡Hola " + nombre + "!");
        System.out.println("Ingresa tu edad?");
        edad = Integer.parseInt (teclado.nextLine());
        System.out.println("Ingresa tu sexo  F  o  M ?");
        sexo = teclado.nextLine();
        System.out.println("Gracias! " + nombre + "Ahora sí... ¡haz el test y descubre cómo eres en realidad! Y si te sorprende el resultado... ");
        persona.setNombre(nombre);
        persona.setEdad(edad);
        persona.setSexo(sexo);


    }

}

