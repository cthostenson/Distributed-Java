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

        genre newGenre = new genre("Dark Comedy");
        System.out.println(newGenre);
        session.save(newGenre);

    }

    @Override
    public genre readGenre(int id) {
        Session session = sessionFactory.getCurrentSession();

        genre readGenre = session.get(genre.class, id);

        if(readGenre == null) {
            System.out.println("Couldn't Find Genre With ID: " + id);
        } else {
            System.out.println(readGenre);
        }

        return readGenre;
    }

    @Override
    public List<genre> readSpecificGenre(String term) {
        Session session = sessionFactory.getCurrentSession();

        List<genre> readGenre = session.createQuery("from genre g where g.genre like 'term' ", genre.class).getResultList();

        if(readGenre == null) {
            System.out.println("Couldn't Find Any Genres");
        } else {
            System.out.println(readGenre);
        }

        return readGenre;
    }

    @Override
    public List<genre> readGenres() {
        Session session = sessionFactory.getCurrentSession();

        List<genre> list = session.createQuery("from genre", genre.class).getResultList();

        return list;

    }

    @Override
    public void updateGenre(int id) {
        Session session = sessionFactory.getCurrentSession();

        genre updateGenre = session.get(genre.class, id);

        if(updateGenre != null) {
            updateGenre.setGenre("Drama");
        } else {
            System.out.println("Could Not Update Genre");
        }
    }

    @Override
    public void deleteGenre(int id) {
        Session session = sessionFactory.getCurrentSession();

        genre deleteGenre = session.get(genre.class, id);

        if(deleteGenre != null) {
            session.delete(deleteGenre);
        } else {
            System.out.println("Could Not Delete Genre");
        }
    }
}
