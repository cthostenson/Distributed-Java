package hibernate.dao;

import hibernate.entity.genre;

import java.util.List;

public interface genreDAO {
    void createGenre(genre Genre);
    genre readGenre(int id);
    List<genre> readGenres();
    List<genre> readGenresLike(String searchTerm);
    List<genre> readSpecificGenre(String term);
    void updateGenre(genre Genre);
    void deleteGenre(int id);
}
