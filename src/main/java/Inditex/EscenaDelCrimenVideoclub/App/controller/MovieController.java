package Inditex.EscenaDelCrimenVideoclub.App.controller;


import Inditex.EscenaDelCrimenVideoclub.App.model.Movie;
import org.springframework.web.bind.annotation.*;
import Inditex.EscenaDelCrimenVideoclub.App.service.MovieService;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<Movie> getAllMovie(){
        return movieService.getAll();
    }

    @PostMapping("/movies")
    public Movie createMovie(@RequestBody Movie newMovie){
        return movieService.addMovie(newMovie);
    }

    @DeleteMapping("/movies/{id}")
    public void deleteMovieById(@PathVariable int id){
        movieService.deleteMovie(id);
    }

    @PutMapping("/movies/{id}")
    public Movie updateMovie(@PathVariable int id, @RequestBody Movie updatedMovie){
        return movieService.updateMovie(id, updatedMovie);
    }
    @GetMapping("/movies/ASC")
    public List<Movie> getAllByOrder(){
        return movieService.getAllByOrder();
    }

    @GetMapping("/movies/category/{category}")
    public List<Movie> getByCategory(@PathVariable String category){
        return movieService.getByCategory(category);
    }
}
