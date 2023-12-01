package bo.edu.ucb.backend.bl;

import bo.edu.ucb.backend.dao.MovieDAO;
import bo.edu.ucb.backend.dto.MovieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieBL {

    private final MovieDAO movieDAO;

    @Autowired
    public MovieBL(MovieDAO movieDAO) {
        this.movieDAO = movieDAO;
    }

    // Método para obtener todas las películas
    public List<MovieDTO> getAllMovies() {
        return movieDAO.findAll();
    }

    // Método para obtener una película por ID
    public Optional<MovieDTO> getMovieById(Long movieId) {
        return movieDAO.findById(movieId);
    }

    // Método para guardar una nueva película
    public MovieDTO saveMovie(MovieDTO movie) {
        // Puedes agregar lógica de validación o de negocio aquí
        return movieDAO.save(movie);
    }

    // Método para actualizar una película existente
    public MovieDTO updateMovie(MovieDTO movie) {
        // Puedes agregar lógica de validación o de negocio aquí
        return movieDAO.save(movie);
    }

    // Método para eliminar una película por ID
    public void deleteMovie(Long movieId) {
        movieDAO.deleteById(movieId);
    }
}
