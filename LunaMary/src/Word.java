import java.util.Scanner;

public class Word {


    String palabras[];
    String palabraJuego;
    String letrasPalabras[];
    String palabraOculta;
    String letraIngresada[];
    String palabraresp[];
    String palabraFinal = "";

    public Word() {


    }


    public void setWords(String casa, String hogar, String computadora) {

        palabras = new String[]{casa, hogar, computadora};
    }

    public String[] getPalabras() {
        return palabras;
    }

    public String select_word() {
        String palabras[] = getPalabras();
        palabraJuego = palabras[(int) (Math.random() * palabras.length)];
        System.out.println(palabraJuego);
        return palabraJuego;

    }

    public void printWord(String word) {
        System.out.println("Buesque la Palabra...");
        for (int i = 0; i < word.length(); i++) {
            System.out.print("*");
        }
         letrasPalabras = new String[palabraJuego.length()];


    }

    public void jugar() {
        System.out.println(palabraJuego);
        palabraresp = new String[palabraJuego.length()];

        int vidas = 5;
        letraIngresada = new String[100];

        for (int q = 0; q < letraIngresada.length; q++) {
            System.out.println("Ingrese una letra: ");
            Scanner entrada = new Scanner(System.in);
            letraIngresada[q] = entrada.nextLine().toLowerCase();


            if (q >= 1) {
                for (int a = 0; a < q; a++) {
                    if (letraIngresada[a].equalsIgnoreCase(letraIngresada[q])) {
                        System.err.println("Ya Ingresaste esa letra, Intenta denuevo...");

                    }
                }
            }


            if (palabraJuego.contains(letraIngresada[q]) == true) {

                if (palabraJuego.equalsIgnoreCase(letraIngresada[q])) {

                    System.out.println("GANASTE, La palabra oculta era: " + palabraJuego);
                    System.exit(0);
                }
                for (int e = 0; e < palabraJuego.length(); e++) {
                    if (letraIngresada[q].equalsIgnoreCase(letrasPalabras[e])) {
                        palabraresp[e] = letraIngresada[q];
                        System.out.println("asdasdasdasdsd");

                    }

                }
                String palabraW = "";
                for (int z = 0; z < palabraJuego.length(); z++) {
                    palabraW = palabraW + palabraresp[z];
                    System.out.println(palabraresp[z] +  "  " +palabraW );
                }
                palabraFinal = palabraW;
                System.out.println(palabraW);
                System.out.println();

            } else {
                System.out.println("no esta, una vida menos");
                vidas--;
                String palabraL = "";
                for (int z = 0; z < palabraJuego.length(); z++) {
                    palabraL = palabraL + palabraresp[z];

                }
                System.out.println(palabraL);
                System.out.println();
                if (vidas == 0) {
                    System.out.println("GAME OVER!");
                    System.exit(0);
                }
            }
            if (palabraFinal.equalsIgnoreCase(palabraJuego)) {

                System.out.println("GANASTE, La palabra oculta era: " + palabraJuego);
                System.exit(0);
            }

        }

    }


}
