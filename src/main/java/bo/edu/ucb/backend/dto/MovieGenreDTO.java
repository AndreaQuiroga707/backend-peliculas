package bo.edu.ucb.backend.dto;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity

public class MovieGenreDTO {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovieGenre;

    @Column(name = "TX_USER", length = 255)
    private String txUser;

    @Column(name = "TX_DATE")
    private LocalDateTime txDate;

    @Column(name = "TX_HOST", length = 255)
    private String txHost;

    @ManyToOne(fetch = FetchType.EAGER)
    private MovieDTO movieDTO;

    @ManyToOne
    private GenreDTO genreDTO;

    public MovieGenreDTO() {
    }

    public MovieGenreDTO(Long idMovieGenre, String txUser, LocalDateTime txDate, String txHost, MovieDTO movieDTO, GenreDTO genreDTO) {
        this.idMovieGenre = idMovieGenre;
        this.txUser = txUser;
        this.txDate = txDate;
        this.txHost = txHost;
        this.movieDTO = movieDTO;
        this.genreDTO = genreDTO;
    }

    public Long getIdMovieGenre() {
        return idMovieGenre;
    }

    public void setIdMovieGenre(Long idMovieGenre) {
        this.idMovieGenre = idMovieGenre;
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

    public GenreDTO getGenreDTO() {
        return genreDTO;
    }

    public void setGenreDTO(GenreDTO genreDTO) {
        this.genreDTO = genreDTO;
    }

    @Override
    public String toString() {
        return "MovieGenreDTO{" +
                "idMovieGenre=" + idMovieGenre +
                ", txUser='" + txUser + '\'' +
                ", txDate=" + txDate +
                ", txHost='" + txHost + '\'' +
                ", movieDTO=" + movieDTO +
                ", genreDTO=" + genreDTO +
                '}';
    }
}
