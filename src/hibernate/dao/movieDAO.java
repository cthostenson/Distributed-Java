package hibernate.dao;

public interface movieDAO {
    void createMovie();
    void readMovie(int id);
    void updateMovie(int id);
    void deleteMovie(int id);
}
