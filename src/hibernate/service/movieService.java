package hibernate.service;

import hibernate.entity.movie;

import java.util.List;

public interface movieService {
    List<movie> getMovies();
    void getMovie(int id);
    void getMovieByName(String searchTerm);
    void saveMovie(movie newMovie);
    void deleteMovie(int id);

}
