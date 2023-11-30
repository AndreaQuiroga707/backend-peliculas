package bo.edu.ucb.backend.dto;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "MOVIE_DIRECTOR")
public class MovieDirectorDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovieDirector;

    @Column(name = "TX_USER", length = 255)
    private String txUser;

    @Column(name = "TX_DATE")
    private LocalDateTime txDate;

    @Column(name = "TX_HOST", length = 255)
    private String txHost;

    @ManyToOne(fetch = FetchType.EAGER)
    private MovieDTO movieDTO;

    @ManyToOne
    private DirectorDTO directorDTO;

    public MovieDirectorDTO() {
    }

    public MovieDirectorDTO(Long idMovieDirector, String txUser, LocalDateTime txDate, String txHost, MovieDTO movieDTO, DirectorDTO directorDTO) {
        this.idMovieDirector = idMovieDirector;
        this.txUser = txUser;
        this.txDate = txDate;
        this.txHost = txHost;
        this.movieDTO = movieDTO;
        this.directorDTO = directorDTO;
    }

    public Long getIdMovieDirector() {
        return idMovieDirector;
    }

    public void setIdMovieDirector(Long idMovieDirector) {
        this.idMovieDirector = idMovieDirector;
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

    public MovieDTO getMovieDTO() {
        return movieDTO;
    }

    public void setMovieDTO(MovieDTO movieDTO) {
        this.movieDTO = movieDTO;
    }

    public DirectorDTO getDirectorDTO() {
        return directorDTO;
    }

    public void setDirectorDTO(DirectorDTO directorDTO) {
        this.directorDTO = directorDTO;
    }

    @Override
    public String toString() {
        return "MovieDirectorDTO{" +
                "idMovieDirector=" + idMovieDirector +
                ", txUser='" + txUser + '\'' +
                ", txDate=" + txDate +
                ", txHost='" + txHost + '\'' +
                ", movieDTO=" + movieDTO +
                ", directorDTO=" + directorDTO +
                '}';
    }
}
