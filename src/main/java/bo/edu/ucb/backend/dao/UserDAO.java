package bo.edu.ucb.backend.dao;

import bo.edu.ucb.backend.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<UserDTO, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
