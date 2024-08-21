package eni.tp.app.eni_app;

import eni.tp.app.eni_app.bll.MovieManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

  @Autowired
  MovieManager movieManager;

  @GetMapping("accueil")
  public String landingPage() {
    return "landing-page";
  }

  @GetMapping("liste")
  public String filmList(Model model) {
    model.addAttribute("movies", movieManager.getAllMovies());
    return "film-list";
  }

  @GetMapping("detail")
  public String filmDetail() {
    return "film-detail";
  }
}
