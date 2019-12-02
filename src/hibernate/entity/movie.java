package hibernate.entity;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

//@Entity
//@Table(name="movies")
@Repository
public class movie {

    @Autowired
    private SessionFactory sessionFactory;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="movie_id")
    private int id;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    // No cascade delete because when we delete a movie, we don't want to delete the genre with it!
    @ManyToOne(cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name="genre_id")
    private genre theGenre;

    @Column(name="critic_score")
    private int critic_score;

    @Column(name="user_score")
    private int user_score;

    public movie() {
    }

    public movie(String title, String description, int critic_score, int user_score) {
        this.title = title;
        this.description = description;
        this.critic_score = critic_score;
        this.user_score = user_score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public genre getTheGenre() {
        return theGenre;
    }

    public void setTheGenre(genre theGenre) {
        this.theGenre = theGenre;
    }

    public int getCritic_score() {
        return critic_score;
    }

    public void setCritic_score(int critic_score) {
        this.critic_score = critic_score;
    }

    public int getUser_score() {
        return user_score;
    }

    public void setUser_score(int user_score) {
        this.user_score = user_score;
    }

    @Override
    public String toString() {
        return "movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", critic_score=" + critic_score +
                ", user_score='" + user_score + '\'' +
                '}';
    }
}
