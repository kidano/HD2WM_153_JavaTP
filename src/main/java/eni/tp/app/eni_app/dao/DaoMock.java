package eni.tp.app.eni_app.dao;

import eni.tp.app.eni_app.Movie;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DaoMock implements IDAOMovie {


  @Override
  public List<Movie> getMovieList() {
    List<Movie> aliments = new ArrayList<Movie>();
    aliments.add(new Movie("Oppenheimer"));
    aliments.add(new Movie("Dune"));
    return aliments;
  }
}
