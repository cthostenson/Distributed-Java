package hibernate.dao;

import hibernate.entity.genre;

import java.util.List;

public interface genreDAO {
    void createGenre(genre Genre);
    genre readGenre(int id);
    List<genre> readGenres();
    List<genre> readSpecificGenre(String term);
    void updateGenre(int id);
    void deleteGenre(int id);
}
