package hibernate.dao;

import hibernate.entity.genre;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class genreDAOImpl implements genreDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void createGenre() {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        genre newGenre = new genre("Dark Comedy");
        System.out.println(newGenre);
        session.save(newGenre);

        // Commit the transaction
        session.getTransaction().commit();
    }

    @Override
    public void readGenre(int id) {
        Session session = sessionFactory.getCurrentSession();
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

    @Override
    public String readSpecificGenre(String term) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        genre readGenre = session.createQuery("from genres where genre = term", genre.class).getResultList();

        if(readGenre == null) {
            System.out.println("Couldn't Find Genre With ID: " + id);
        } else {
            System.out.println(readGenre);
        }

        // Commit the transaction
        session.getTransaction().commit();
    }

    @Override
    public List<genre> readGenres() {
        Session session = sessionFactory.getCurrentSession();
        //session.beginTransaction();

        List<genre> list = session.createQuery("from genres", genre.class).getResultList();

        // Commit the transaction
        //session.getTransaction().commit();

        return list;

    }

    @Override
    public void updateGenre(int id) {
        Session session = sessionFactory.getCurrentSession();
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

    @Override
    public void deleteGenre(int id) {
        Session session = sessionFactory.getCurrentSession();
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
}
