public class MovieGame {
    public static void main (String arg[]){
        RandomMovie randomMovie= new RandomMovie();
       try{
           randomMovie.importScanner();
           String movie = randomMovie.getMovie ();
           System.out.println(movie);

       }
       catch( Exception exception){
           System.out.println("Error durring import - "+exception.getMessage ());

       }

        String moviemasked = randomMovie.convertUnderscore();
       System.out.println(moviemasked);

    }
}
