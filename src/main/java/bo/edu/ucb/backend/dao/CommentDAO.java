package bo.edu.ucb.backend.dao;

import bo.edu.ucb.backend.dto.CommentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentDAO extends JpaRepository<CommentDTO, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
