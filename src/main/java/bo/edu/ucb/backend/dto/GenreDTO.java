package bo.edu.ucb.backend.dto;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class GenreDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long genreId;
    private String genreName;

    @Column(name = "TX_USER", length = 255)
    private String txUser;

    @Column(name = "TX_DATE")
    private LocalDateTime txDate;

    @Column(name = "TX_HOST", length = 255)
    private String txHost;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "genreDTO")
    private Set<MovieGenreDTO> movieGenreDTOS = new HashSet<>();

    public GenreDTO() {
    }

    public GenreDTO(Long genreId, String genreName, String txUser, LocalDateTime txDate, String txHost, Set<MovieGenreDTO> movieGenreDTOS) {
        this.genreId = genreId;
        this.genreName = genreName;
        this.txUser = txUser;
        this.txDate = txDate;
        this.txHost = txHost;
        this.movieGenreDTOS = movieGenreDTOS;
    }

    public Long getGenreId() {
        return genreId;
    }

    public void setGenreId(Long genreId) {
        this.genreId = genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
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

    public Set<MovieGenreDTO> getMovieGenres() {
        return movieGenreDTOS;
    }

    public void setMovieGenres(Set<MovieGenreDTO> movieGenreDTOS) {
        this.movieGenreDTOS = movieGenreDTOS;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genreId=" + genreId +
                ", genreName='" + genreName + '\'' +
                ", txUser='" + txUser + '\'' +
                ", txDate=" + txDate +
                ", txHost='" + txHost + '\'' +
                ", movieGenres=" + movieGenreDTOS +
                '}';
    }
}
