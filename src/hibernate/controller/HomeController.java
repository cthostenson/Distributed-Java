package hibernate.controller;

import hibernate.entity.genre;
import hibernate.service.genreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private genreService GenreService;

    @RequestMapping(path = "/")
    public String showHomePage() {
        return "index";
    }

  //  @RequestMapping(value="/error")
    public String showErrorPage(HttpServletRequest request,
                                Model theModel) {
        int httpErrorCode = (Integer)request.getAttribute("javax.servlet.error.status_code");

        String message;

        switch(httpErrorCode) {
            case 404:
                message = "Error 404: Resource not found";
                break;
            case 500:
                message = "Error 500: Internal server error";
                break;
            case 402:
                message = "Error 402: Payment required";
                break;
            default:
                message = "Oh no! Something bad happened";
        }

        theModel.addAttribute("errorMessage", message);

        return "errors";
    }

    @RequestMapping(value = "/showSearchPage", method = RequestMethod.GET)
    public String showSearchPage() {
        return "search-genres";
    }

    @RequestMapping(value = "/showAddGenrePage", method = RequestMethod.GET)
    public String showAddGenrePage(Model theModel) {
        genre Genre = new genre();

        theModel.addAttribute("aGenre", Genre);

        return "add-genre";
    }

    @PostMapping(value = "/addGenre")
    public String addGenre(Model theModel, @ModelAttribute(name = "aGenre") genre theGenre) {
        GenreService.createGenre(theGenre);
        return "index";
    }


    @RequestMapping(value = "/showEditGenrePage", method = RequestMethod.GET)
    public String showEditGenrePage() {
        return "edit-genre";
    }

    @RequestMapping(value = "/showDeleteGenrePage", method = RequestMethod.GET)
    public String showDeleteGenrePage(Model theModel) {
        List<genre> theList = GenreService.getAllGenres();
        System.out.println(theList);
        theModel.addAttribute("genres",theList);
        return "delete-genre";
    }

    @PostMapping(value = "/deleteGenre")
    public String deleteGenre(Model theModel) {
        return "index";
    }

    @RequestMapping(value = "/showListGenrePage", method = RequestMethod.GET)
    public String showListGenrePage(Model theModel) {
        List<genre> theList = GenreService.getAllGenres();
        System.out.println(theList);
        theModel.addAttribute("genres",theList);

        return "list-genres";
    }


}
