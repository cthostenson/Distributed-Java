package hibernate.controller;

import hibernate.entity.genre;
import hibernate.service.genreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/genre")
public class GenreController {

        @Autowired
        private genreService GenreService;

        @RequestMapping(value = "/showListGenrePage", method = RequestMethod.GET)
        public String showListGenrePage(Model theModel) {
            List<genre> theList = GenreService.getAllGenres();
            System.out.println(theList);
            theModel.addAttribute("genres",theList);

            return "list-genres";
        }
        /*
        @RequestMapping("/list")
        public String listGenres(Model theModel) {
            List<genre> theList = GenreService.getAllGenres();

            theModel.addAttribute("genres", theList);

            return "list-genres";
        }*/

        @GetMapping("/search")
        public String search(@RequestParam("searchTerm") String theSearchTerm,
                             Model theModel) {

            List<genre> theList = GenreService.getGenreByName(theSearchTerm);

            theModel.addAttribute("donuts", theList);

            return "search-genres";
        }

        @GetMapping("/delete")
        public String deleteGenre(@RequestParam("donutId") int theId){
            GenreService.deleteGenre(theId);

            return "redirect:/donut/list";
        }
/*
        @RequestMapping("/showUpdateDonutForm")
        public String showUpdateGenreForm(@RequestParam("donutId") int theId,
                                          Model theModel) {
            genre existingGenre = GenreService.getGenre(theId);

            theModel.addAttribute("aDonut", existingDonut);

            theModel.addAttribute("shops", donutShopService.getShops());

            return "am/add-donut-form";
        }

        @GetMapping("/showAddDonutForm")
        public String showAddDonutForm(Model theModel) {
            genre newGenre = new genre();

            theModel.addAttribute("genre", newGenre);

            return "add-genre-form";
        }

        @PostMapping("/save")
        public String saveDonut(@RequestParam(name = "donutImage") MultipartFile file,
                                @Valid @ModelAttribute(name = "aDonut") Donut theDonut,
                                BindingResult bindingResult,
                                Model theModel,
                                HttpServletRequest request) {
            if (bindingResult.hasErrors()) {
                System.out.println(bindingResult);

                theModel.addAttribute("shops", donutShopService.getShops());

                return "am/add-donut-form";
            }

            donutService.saveDonut(theDonut, file, request.getServletContext().getRealPath("/"));

            return "redirect:/donut/list";
        }

*/
        @InitBinder
        public void initBinder(WebDataBinder webDataBinder) {
            StringTrimmerEditor ste = new StringTrimmerEditor(true);

            webDataBinder.registerCustomEditor(String.class, ste);
        }


}
