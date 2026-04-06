package Inditex.EscenaDelCrimenVideoclub.App.service;

import Inditex.EscenaDelCrimenVideoclub.App.model.Movie;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import Inditex.EscenaDelCrimenVideoclub.App.repository.MovieRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@Service
public class MovieService {
    private final MovieRepository movieRepository;


    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAll(){
        return movieRepository.findAll();
    }

    public Movie addMovie(Movie newMovie){
        return movieRepository.save(newMovie);
    }

    public void deleteMovie(int id){
        movieRepository.deleteById(id);
    }

    public Movie updateMovie(int id, Movie updatedMovie){
        updatedMovie.setId(id);
        return movieRepository.save(updatedMovie);
    }
    public List<Movie> getAllByOrder(){
        return movieRepository.findAll(Sort.by(Sort.Direction.ASC, "title")).reversed();
    }

    public List<Movie> getByCategory(String category){
        return movieRepository.findByCategory(category);
    }


}
