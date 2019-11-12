package hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name="genres")
public class genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="genre_id")
    private int id;

    @Column(name="genre")
    private String genre;

    public genre() {
    }

    public genre(String genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", genre='" + genre + '\'' +
                '}';
    }
}
