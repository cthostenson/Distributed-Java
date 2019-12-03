package hibernate.dao;

import hibernate.entity.genre;

import java.util.List;

public interface genreDAO {
    void createGenre();
    void readGenre(int id);
    List<genre> readGenres();
    String readSpecificGenre(String term);
    void updateGenre(int id);
    void deleteGenre(int id);
}
