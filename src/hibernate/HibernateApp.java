package hibernate;

import hibernate.entity.genre;
import hibernate.entity.movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateApp {
    private SessionFactory factory;

    public HibernateApp() {
        factory = new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(movie.class)
                        .addAnnotatedClass(genre.class)
                        .buildSessionFactory();
    }

    public static void main(String args[]) {
        HibernateApp demo = new HibernateApp();

        try {
            demo.createMovie();
            //demo.createGenre();
            //demo.readMovie(1);
            //demo.readGenre(1);
            //demo.updateGenre(7);
            //demo.updateMovie(1);
            //demo.deleteGenre(9);
            //demo.deleteMovie(1);

        } finally {
            demo.close();
        }

    }

    private void close() {
        factory.close();
    }

    public void createGenre() {
        Session session = factory.getCurrentSession();
        session.beginTransaction();

        genre newGenre = new genre("Dark Comedy");
        System.out.println(newGenre);
        session.save(newGenre);

        // Commit the transaction
        session.getTransaction().commit();
    }

    public void readGenre(int id) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();

        genre readGenre = session.get(genre.class, id);

        if(readGenre == null) {
            System.out.println("Couldn't Find Genre With ID: " + id);
        } else {
            System.out.println(readGenre);
        }

        // Commit the transaction
        session.getTransaction().commit();
    }

    public void updateGenre(int id) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();

        genre updateGenre = session.get(genre.class, id);

        if(updateGenre != null) {
            updateGenre.setGenre("Drama");
        } else {
            System.out.println("Could Not Update Genre");
        }

        // Commit the transaction
        session.getTransaction().commit();
    }

    public void deleteGenre(int id) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();

        genre deleteGenre = session.get(genre.class, id);

        if(deleteGenre != null) {
            session.delete(deleteGenre);
        } else {
            System.out.println("Could Not Delete Genre");
        }

        // Commit the transaction
        session.getTransaction().commit();
    }

    private void createMovie() {
        Session session = factory.getCurrentSession();
        session.beginTransaction();

        movie newMovie = new movie("Naked Gun 22 1/2","The Second Naked Gun Film",100,100);
        System.out.println(newMovie);
        session.save(newMovie);

        // Commit the transaction
        session.getTransaction().commit();
    }

    public void readMovie(int id) {
        Session session = factory.getCurrentSession();
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

    public void updateMovie(int id) {
        Session session = factory.getCurrentSession();
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

    public void deleteMovie(int id) {
        Session session = factory.getCurrentSession();
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
