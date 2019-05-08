import java.util.Scanner;


class Menu {


    public Menu() {
    }


    public void mostrarMenu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eres Casado?");
        System.out.println("1.- SI");
        System.out.println("2.- NO");
        System.out.println("Ingrese una opcion");
        String opcionA = teclado.nextLine();

        switch (opcionA) {
            case "1":

                System.out.println("Cuantos hijos tienes");
                System.out.println("1.- 1 Hijo");
                System.out.println("2.- 2 Hijos");
                System.out.println("3.- Mas de 2 Hijos");
                System.out.println("Ingrese una opcion");
                String opcion1A = teclado.nextLine();

                switch (opcion1A) {

                    case "1":
                        System.out.println("Aqui termina");
                        break;


                }


            case "2":
                System.out.println("Tienes Novia o Pareja");
                System.out.println("1.- SI");
                System.out.println("2.- NO");
                System.out.println("Ingrese una opcion");
                String opcionB = teclado.nextLine();

        }
    }
}

