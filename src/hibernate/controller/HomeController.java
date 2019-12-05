package hibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping(path = "/")
    public String showHomePage() {
        return "index";
    }

    @RequestMapping(value="/error")
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
    public String showAddGenrePage() {
        return "add-genre";
    }

    @RequestMapping(value = "/showEditGenrePage", method = RequestMethod.GET)
    public String showEditGenrePage() {
        return "edit-genre";
    }

    @RequestMapping(value = "/showDeleteGenrePage", method = RequestMethod.GET)
    public String showDeleteGenrePage() {
        return "delete-genre";
    }

    @RequestMapping(value = "/showListGenrePage", method = RequestMethod.GET)
    public String showListGenrePage() {
        return "list-genres";
    }


}
