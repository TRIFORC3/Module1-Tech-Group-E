//import java.util.*;
//
//public class Colgado {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        String palabras[] = {"hola", "chao", "duoc", "corazon", "automovil"};
//
//        String palabraFinal = "";
//
//        Scanner entrada = new Scanner(System.in);
//        String palabraJuego = palabras[(int) (Math.random() * palabras.length)];
//        String letrasPalabras[] = new String[palabraJuego.length()];
//        String palabraOculta = "";
//        String palabraresp[] = new String[palabraJuego.length()];
//
//        for (int i = 0; i < palabraJuego.length(); i++) {
//            letrasPalabras[i] = String.valueOf(palabraJuego.charAt(i));
//            palabraOculta = palabraOculta + "*";
//            palabraresp[i] = "*";
//
//        }
//
//        System.out.println("Buesque la Palabra...");
//        System.out.println();
//        System.out.println(palabraOculta);
//
//        int vidas = 5;
//        String letraIngresada[] = new String[100];
//        for (int q = 0; q < letraIngresada.length; q++) {
//            System.out.println("Ingrese una letra: ");
//            letraIngresada[q] = entrada.nextLine().toLowerCase();
//            if (q >= 1) {
//                for (int a = 0; a < q; a++) {
//                    if (letraIngresada[a].equalsIgnoreCase(letraIngresada[q])) {
//                        System.err.println("Ya Ingresaste esa letra, Intenta denuevo...");
//
//                    }
//                }
//            }
//
//            if (palabraJuego.contains(letraIngresada[q]) == true) {
//
//                if (palabraJuego.equalsIgnoreCase(letraIngresada[q])) {
//
//                    System.out.println("GANASTE, La palabra oculta era: " + palabraJuego);
//                    System.exit(0);
//                }
//                for (int e = 0; e < palabraJuego.length(); e++) {
//                    if (letraIngresada[q].equalsIgnoreCase(letrasPalabras[e])) {
//                        palabraresp[e] = letraIngresada[q];
//
//                    }
//
//                }
//                String palabraW = "";
//                for (int z = 0; z < palabraJuego.length(); z++) {
//                    palabraW = palabraW + palabraresp[z];
//
//                }
//                palabraFinal = palabraW;
//                System.out.println(palabraW);
//                System.out.println();
//
//            } else {
//                System.out.println("no esta, una vida menos");
//                vidas--;
//                String palabraL = "";
//                for (int z = 0; z < palabraJuego.length(); z++) {
//                    palabraL = palabraL + palabraresp[z];
//
//                }
//                System.out.println(palabraL);
//                System.out.println();
//                if (vidas == 0) {
//                    System.out.println("GAME OVER!");
//                    System.exit(0);
//                }
//            }
//            if (palabraFinal.equalsIgnoreCase(palabraJuego)) {
//
//                System.out.println("GANASTE, La palabra oculta era: " + palabraJuego);
//                System.exit(0);
//            }
//
//        }
//    }
//
//}