import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class Movie {
    private String title;
    private String imdb;

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", imdb='" + imdb + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        String json = "{ \"title\" : \"MIB\", \"imdb\" : \"8.1\" }";
        Movie m1 = mapper.readValue(json, Movie.class);
        System.out.println(m1);

        Movie m2 = mapper.readValue(new File("src/main/java/movie_2.json"), Movie.class);
        System.out.println(m2);

        List<Movie> movies = mapper.readValue(new File("src/main/java/movie_3.json"), new TypeReference<List<Movie>>() {
        });

        for (Movie ele : movies) {
            System.out.println(ele);
        }

        mapper.writeValue(new File("src/main/java/movies.json"), movies);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }
}
