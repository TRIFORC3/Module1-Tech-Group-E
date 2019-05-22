public class Movies {

    private String titleMovie;
    private String typeMovie;
    private String description;

    public Movies() {
        titleMovie = "";
        typeMovie = "";
        description = "";
    }

    public Movies(String titleMovie, String typeMovie, String description) {
        this.titleMovie = titleMovie;
        this.typeMovie = typeMovie;
        this.description = description;
    }

    public String gettitleMovies() {
        return titleMovie;
    }

    public String gettypeMovies() {
        return typeMovie;
    }

    public String getdescription() {
        return description;
    }
}

