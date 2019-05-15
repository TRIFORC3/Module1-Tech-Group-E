import java.util.ArrayList;
import java.util.List;

public class Evaluator {

    List<String> tiposPersonalidad;

    public Evaluator() {

        tiposPersonalidad = new ArrayList<>();
        tiposPersonalidad.add("EXTROVERTIDO");
        tiposPersonalidad.add("AGRADABLE");
        tiposPersonalidad.add("CONCIENTIZADOR");
        tiposPersonalidad.add("NEUROTICO");
        tiposPersonalidad.add("ABIERTO");


    }


    public void evaluate(Integer points) {
        switch (points) {
            case 10:
                System.out.println("EXTROVERTIDO");
                break;
            case 20:
                System.out.println("AGRADABLE");
                break;
            case 30:
                System.out.println("CONCIENTIZADOR");
                break;
            case 40:
                System.out.println("ABIERTO");
                break;
        }


    }
}
