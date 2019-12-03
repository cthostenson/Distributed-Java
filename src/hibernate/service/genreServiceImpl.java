package hibernate.service;

import hibernate.dao.genreDAO;
import hibernate.entity.genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class genreServiceImpl implements genreService {

    @Autowired
    private genreDAO GenreDAO;

    @Override
    @Transactional
    public List<genre> getAllGenres() {
        return GenreDAO.readGenres();
    }

    @Override
    @Transactional
    public String getGenre(genre aGenre) {
        return GenreDAO.readGenre(aGenre.getGenreId());
    }

    @Override
    @Transactional
    public getGenreByName(String term) {
        return GenreDAO.getGenreByName(term);
    }

    @Override
    @Transactional
    public void saveGenre(genre aGenre) {
        GenreDAO.updateGenre(aGenre.getGenreId());
    }

    @Override
    @Transactional
    public void deleteGenre(int id) {
        GenreDAO.deleteGenre(id);
    }


}
