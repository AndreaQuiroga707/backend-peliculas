package bo.edu.ucb.backend.bl;

import bo.edu.ucb.backend.dao.CommentDAO;
import bo.edu.ucb.backend.dto.CommentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentBL {

    private final CommentDAO commentDAO;

    @Autowired
    public CommentBL(CommentDAO commentDAO) {
        this.commentDAO = commentDAO;
    }

    // Método para obtener todos los comentarios
    public List<CommentDTO> getAllComments() {
        return commentDAO.findAll();
    }

    // Método para obtener un comentario por ID
    public Optional<CommentDTO> getCommentById(Long commentId) {
        return commentDAO.findById(commentId);
    }

    // Método para guardar un nuevo comentario
    public CommentDTO saveComment(CommentDTO comment) {
        // Puedes agregar lógica de validación o de negocio aquí
        return commentDAO.save(comment);
    }

    // Método para actualizar un comentario existente
    public CommentDTO updateComment(CommentDTO comment) {
        // Puedes agregar lógica de validación o de negocio aquí
        return commentDAO.save(comment);
    }

    // Método para eliminar un comentario por ID
    public void deleteComment(Long commentId) {
        commentDAO.deleteById(commentId);
    }
}
