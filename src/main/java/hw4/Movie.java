package hw4;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
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

    public static Movie getMovieFromJSON(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(json, Movie.class);
    }

    public static Movie getMovieFromJSONFile(String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(new File(path), Movie.class);
    }

    public static List<Movie> getMoviesFromJSONFile(String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(new File(path), new TypeReference<List<Movie>>() {
        });
    }
    public static void writeMoviesToJSONFile(List<Movie> movies, String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(new File(path), movies);
    }

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        Movie m1 = null;
        try {
            m1 = getMovieFromJSON("{ \"title\" : \"MIB\", \"imdb\" : \"8.1\" }");
        } catch (JsonProcessingException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println(m1);

        try {
            m1 = getMovieFromJSONFile("src/main/java/movie_2.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(m1);

        List<Movie> movies = null;
        try {
            movies = getMoviesFromJSONFile("src/main/java/movie_3.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Movie ele : movies) {
            System.out.println(ele);
        }

        try {
            writeMoviesToJSONFile(movies, "src/main/java/movies.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
