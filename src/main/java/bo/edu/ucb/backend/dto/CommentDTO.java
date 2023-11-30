package bo.edu.ucb.backend.dto;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "COMMENT")
public class CommentDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    @Column(name = "TX_USER", length = 255)
    private String txUser;

    @Column(name = "TX_DATE")
    private LocalDateTime txDate;

    @Column(name = "TX_HOST", length = 255)
    private String txHost;

    @ManyToOne(fetch = FetchType.EAGER)
    private UserDTO userDTO;

    @ManyToOne
    private MovieDTO movieDTO;


    public CommentDTO() {
    }

    public CommentDTO(Long commentId, String txUser, LocalDateTime txDate, String txHost, UserDTO userDTO, MovieDTO movieDTO) {
        this.commentId = commentId;
        this.txUser = txUser;
        this.txDate = txDate;
        this.txHost = txHost;
        this.userDTO = userDTO;
        this.movieDTO = movieDTO;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getTxUser() {
        return txUser;
    }

    public void setTxUser(String txUser) {
        this.txUser = txUser;
    }

    public LocalDateTime getTxDate() {
        return txDate;
    }

    public void setTxDate(LocalDateTime txDate) {
        this.txDate = txDate;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public MovieDTO getMovieDTO() {
        return movieDTO;
    }

    public void setMovieDTO(MovieDTO movieDTO) {
        this.movieDTO = movieDTO;
    }

    @Override
    public String toString() {
        return "CommentDTO{" +
                "commentId=" + commentId +
                ", txUser='" + txUser + '\'' +
                ", txDate=" + txDate +
                ", txHost='" + txHost + '\'' +
                ", userDTO=" + userDTO +
                ", movieDTO=" + movieDTO +
                '}';
    }
}