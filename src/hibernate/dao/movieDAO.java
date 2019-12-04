package hibernate.dao;

import hibernate.entity.movie;

import java.util.List;

public interface movieDAO {
    void createMovie();
    List<movie> readMovies();
    movie readMovie(int id);
    List<movie> readSpecificMovie(String term);
    void updateMovie(int id);
    void deleteMovie(int id);
}
