package eni.tp.app.eni_app.bll;

import eni.tp.app.eni_app.Movie;
import eni.tp.app.eni_app.dao.IDAOMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieManager {

  @Autowired
  IDAOMovie daoMovie;

  public List<Movie> getAllMovies() {

    List<Movie> movies = daoMovie.getMovieList();
    return movies;
  }
}
