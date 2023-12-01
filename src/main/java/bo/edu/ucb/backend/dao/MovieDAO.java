package bo.edu.ucb.backend.dao;

import bo.edu.ucb.backend.dto.MovieDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieDAO extends JpaRepository<MovieDTO, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
