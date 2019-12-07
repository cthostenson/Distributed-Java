package hibernate.service;

import hibernate.entity.genre;

import java.util.List;

public interface genreService {
    List<genre> getAllGenres();
    genre getGenre(int id);
    List<genre> getGenreByName(String searchTerm);
    void saveGenre(genre newGenre);
    void deleteGenre(int id);
}
