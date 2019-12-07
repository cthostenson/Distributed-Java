package hibernate.service;

import hibernate.dao.movieDAO;
import hibernate.entity.movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class movieServiceImpl implements movieService{

    @Autowired
    private movieDAO MovieDAO;

    @Override
    @Transactional
    public List<movie> getMovies() {
        return MovieDAO.readMovies();
    }

    @Override
    @Transactional
    public void getMovie(int id) {
        movie newReadMovie = MovieDAO.readMovie(id);
        newReadMovie.toString();
    }

    @Override
    @Transactional
    public void getMovieByName(String term) {
        System.out.println(MovieDAO.readSpecificMovie(term));
    }

    @Override
    @Transactional
    public void saveMovie(movie aMovie) {
        MovieDAO.updateMovie(aMovie.getId());
    }

    @Override
    @Transactional
    public void deleteMovie(int id) {
        MovieDAO.deleteMovie(id);
    }

}
