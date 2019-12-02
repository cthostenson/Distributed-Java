package hibernate.entity;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity
//@Table(name="genres")
@Repository
public class genre {

    @Autowired
    private SessionFactory sessionFactory;
    // No cascade delete because when we delete a genre, we don't want to delete all the movies with it!

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="genre_id")
    private int genreId;

    @OneToMany(mappedBy = "theGenre", cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH})
    private List<movie> movies;

    @Column(name="genre")
    private String genre;

    public genre() {
    }

    public genre(String genre) {
        this.genre = genre;
    }

    public List<movie> getMovies() {
        return movies;
    }

    public void setMovies(List<movie> movies) {
        this.movies = movies;
    }

    public void add(movie newMovie) {
        if(movies == null) {
            movies = new ArrayList<>();
        }
        movies.add(newMovie);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "genre{" +
                ", genre='" + genre + '\'' +
                '}';
    }
}
