package hibernate.service;

import hibernate.entity.genre;

import java.util.List;

public interface genreService {
    void createGenre(genre Genre);
    List<genre> getAllGenres();
    genre getGenre(int id);
    List<genre> getGenreByName(String searchTerm);
    List<genre> getGenresByName(String searchTerm);
    void saveGenre(genre newGenre);
    void deleteGenre(int id);
}
