package hibernate.dao;

import hibernate.entity.movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class movieDAOImpl implements movieDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void createMovie() {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        movie newMovie = new movie("Naked Gun 22 1/2","The Second Naked Gun Film",100,100);
        System.out.println(newMovie);
        session.save(newMovie);

        // Commit the transaction
        session.getTransaction().commit();
    }

    @Override
    public void readMovie(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        movie readMovie = session.get(movie.class, id);

        if(readMovie == null) {
            System.out.println("Couldn't Find Movie With ID: " + id);
        } else {
            System.out.println(readMovie);
        }

        // Commit the transaction
        session.getTransaction().commit();
    }

    @Override
    public void updateMovie(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        movie updateMovie = session.get(movie.class, id);

        if(updateMovie != null) {
            updateMovie.setTitle("The Naked Gun");
        } else {
            System.out.println("Could Not Update Movie");
        }

        // Commit the transaction
        session.getTransaction().commit();
    }

    @Override
    public void deleteMovie(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        movie deleteMovie = session.get(movie.class, id);

        if(deleteMovie != null) {
            session.delete(deleteMovie);
        } else {
            System.out.println("Could Not Delete Movie");
        }

        // Commit the transaction
        session.getTransaction().commit();
    }
}
