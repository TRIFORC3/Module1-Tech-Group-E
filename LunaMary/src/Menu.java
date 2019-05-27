import java.util.Scanner;


class Menu {
    Scanner teclado = new Scanner(System.in);
    private String nombre;
    private Integer edad;
    private String sexo;
    Person person;
    Evaluator evaluator;
    AskMenu askMenu;

    public Menu() {
        askMenu = new AskMenu();
    }


    public void showAsks() {

        askMenu.mostrarP1();
        askMenu.mostrarP2();
        askMenu.mostrarP3();
        askMenu.mostrarP4();
        askMenu.mostrarP5();
        evaluator = new Evaluator();
        evaluator.evaluate(askMenu.calculate());

    }

    public void registerPerson() {

        System.out.println("Para iniciar el test responde las siguientes preguntas");
        System.out.println("Ingresa tu nombre completo? ");
        nombre = teclado.nextLine();
        System.out.println("¡Hola " + nombre + "!");
        System.out.println("Ingresa tu edad? ");
        edad = teclado.nextInt();
        System.out.println("Ingresa tu sexo  F  o  M ? ");
        sexo = teclado.nextLine();
        person = new Person();
        person.setNamePerson(nombre);
        person.setAgePerson(edad);
        person.setSexPerson(sexo);
        person.showDataPerson();

        System.out.println("Gracias! " + nombre + "Ahora sí... ¡haz el test y descubre cómo eres en realidad! Y si te sorprende el resultado... ");
        System.out.println("*********************");


    }

}

