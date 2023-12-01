package bo.edu.ucb.backend.api;

import bo.edu.ucb.backend.bl.MovieBL;
import bo.edu.ucb.backend.dto.MovieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movie")
public class MovieAPI {

    private final MovieBL movieBL;

    @Autowired
    public MovieAPI(MovieBL movieBL) {
        this.movieBL = movieBL;
    }

    @GetMapping
    public ResponseEntity<List<MovieDTO>> getAllMovies() {
        List<MovieDTO> movies = movieBL.getAllMovies();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieDTO> getMovieById(@PathVariable Long id) {
        return movieBL.getMovieById(id)
                .map(movie -> new ResponseEntity<>(movie, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<MovieDTO> createMovie(@RequestBody MovieDTO movie) {
        MovieDTO createdMovie = movieBL.saveMovie(movie);
        return new ResponseEntity<>(createdMovie, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MovieDTO> updateMovie(@PathVariable Long id, @RequestBody MovieDTO movie) {
        if (movieBL.getMovieById(id).isPresent()) {
            movie.setMovieId(id);
            MovieDTO updatedMovie = movieBL.updateMovie(movie);
            return new ResponseEntity<>(updatedMovie, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        if (movieBL.getMovieById(id).isPresent()) {
            movieBL.deleteMovie(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
