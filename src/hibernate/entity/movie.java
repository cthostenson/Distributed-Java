package hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name="movies")
public class movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="movie_id")
    private int id;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "genre_id")
    @Column(name="genre_id")
    private int genre_id;

    @Column(name="critic_score")
    private int critic_score;

    @Column(name="user_score")
    private int user_score;

    public movie() {
    }

    public movie(String title, String description, int genre_id, int critic_score, int user_score) {
        this.title = title;
        this.description = description;
        this.genre_id = genre_id;
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

    public int getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(int genre_id) {
        this.genre_id = genre_id;
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
                ", genre_id=" + genre_id +
                ", critic_score=" + critic_score +
                ", user_score='" + user_score + '\'' +
                '}';
    }
}
