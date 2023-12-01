package bo.edu.ucb.backend.bl;

import bo.edu.ucb.backend.dao.UserDAO;
import bo.edu.ucb.backend.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserBL {

    private final UserDAO userDAO;

    @Autowired
    public UserBL(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    // Método para obtener todos los usuarios
    public List<UserDTO> getAllUsers() {
        return userDAO.findAll();
    }

    // Método para obtener un usuario por ID
    public Optional<UserDTO> getUserById(Long userId) {
        return userDAO.findById(userId);
    }

    // Método para guardar un nuevo usuario
    public UserDTO saveUser(UserDTO user) {
        // Puedes agregar lógica de validación o de negocio aquí
        return userDAO.save(user);
    }

    // Método para actualizar un usuario existente
    public UserDTO updateUser(UserDTO user) {
        // Puedes agregar lógica de validación o de negocio aquí
        return userDAO.save(user);
    }

    // Método para eliminar un usuario por ID
    public void deleteUser(Long userId) {
        userDAO.deleteById(userId);
    }
}
