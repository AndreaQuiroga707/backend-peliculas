package bo.edu.ucb.backend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
        import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
        import java.util.Set;
@Entity
@Table(name = "MOVIE")
public class MovieDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;
    @Column(name = "TITLE", length = 100)
    private String title;
    @Column(name = "SYNOPSIS", length = 600)
    private String synopsis;

    @Column(name = "TX_USER", length = 255)
    private String txUser;

    @Column(name = "TX_DATE")
    private LocalDateTime txDate;

    @Column(name = "TX_HOST", length = 255)
    private String txHost;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "movieDTO")
    @JsonIgnore
    private Set<MovieDirectorDTO> movieDirectorDTOS = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "movieDTO")
    private Set<CommentDTO> commentDTOS = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "movieDTO")
    private Set<CommentDTO> ratings = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "movieDTO")
    private Set<CommentDTO> movieGenres = new HashSet<>();


    public MovieDTO() {
    }

    public MovieDTO(Long movieId, String title, String synopsis, String txUser, LocalDateTime txDate, String txHost, Set<MovieDirectorDTO> movieDirectorDTOS, Set<CommentDTO> commentDTOS, Set<CommentDTO> ratings, Set<CommentDTO> movieGenres) {
        this.movieId = movieId;
        this.title = title;
        this.synopsis = synopsis;
        this.txUser = txUser;
        this.txDate = txDate;
        this.txHost = txHost;
        this.movieDirectorDTOS = movieDirectorDTOS;
        this.commentDTOS = commentDTOS;
        this.ratings = ratings;
        this.movieGenres = movieGenres;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
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

    public Set<MovieDirectorDTO> getMovieDirectorDTOS() {
        return movieDirectorDTOS;
    }

    public void setMovieDirectorDTOS(Set<MovieDirectorDTO> movieDirectorDTOS) {
        this.movieDirectorDTOS = movieDirectorDTOS;
    }

    public Set<CommentDTO> getCommentDTOS() {
        return commentDTOS;
    }

    public void setCommentDTOS(Set<CommentDTO> commentDTOS) {
        this.commentDTOS = commentDTOS;
    }

    public Set<CommentDTO> getRatings() {
        return ratings;
    }

    public void setRatings(Set<CommentDTO> ratings) {
        this.ratings = ratings;
    }

    public Set<CommentDTO> getMovieGenres() {
        return movieGenres;
    }

    public void setMovieGenres(Set<CommentDTO> movieGenres) {
        this.movieGenres = movieGenres;
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "movieId=" + movieId +
                ", title='" + title + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", txUser='" + txUser + '\'' +
                ", txDate=" + txDate +
                ", txHost='" + txHost + '\'' +
                ", movieDirectorDTOS=" + movieDirectorDTOS +
                ", commentDTOS=" + commentDTOS +
                ", ratings=" + ratings +
                ", movieGenres=" + movieGenres +
                '}';
    }
}

