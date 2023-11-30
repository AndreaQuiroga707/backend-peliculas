package bo.edu.ucb.backend.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "COMMENT")
public class CommentDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    @ManyToOne(fetch = FetchType.EAGER)
    private UserDTO userDTO;

    @ManyToOne
    private MovieDTO movieDTO;


    public CommentDTO() {
    }

    public CommentDTO(Long commentId, UserDTO userDTO, MovieDTO movieDTO) {
        this.commentId = commentId;
        this.userDTO = userDTO;
        this.movieDTO = movieDTO;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public UserDTO getUsuario() {
        return userDTO;
    }

    public void setUsuario(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public MovieDTO getMovie() {
        return movieDTO;
    }

    public void setMovie(MovieDTO movieDTO) {
        this.movieDTO = movieDTO;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", usuario=" + userDTO +
                ", movie=" + movieDTO +
                '}';
    }
}