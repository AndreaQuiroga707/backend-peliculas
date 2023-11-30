package bo.edu.ucb.backend.dto;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "DIRECTOR")
public class DirectorDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long directorId;

    private String directorName;

    @Column(name = "TX_USER", length = 255)
    private String txUser;

    @Column(name = "TX_DATE")
    private LocalDateTime txDate;

    @Column(name = "TX_HOST", length = 255)
    private String txHost;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "directorDTO")
    private Set<MovieDirectorDTO> movieDirectorDTOS = new HashSet<>();

    public DirectorDTO() {
    }

    public DirectorDTO(Long directorId, String directorName, String txUser, LocalDateTime txDate, String txHost, Set<MovieDirectorDTO> movieDirectorDTOS) {
        this.directorId = directorId;
        this.directorName = directorName;
        this.txUser = txUser;
        this.txDate = txDate;
        this.txHost = txHost;
        this.movieDirectorDTOS = movieDirectorDTOS;
    }

    public Long getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Long directorId) {
        this.directorId = directorId;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
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

    @Override
    public String toString() {
        return "DirectorDTO{" +
                "directorId=" + directorId +
                ", directorName='" + directorName + '\'' +
                ", txUser='" + txUser + '\'' +
                ", txDate=" + txDate +
                ", txHost='" + txHost + '\'' +
                ", movieDirectorDTOS=" + movieDirectorDTOS +
                '}';
    }
}
