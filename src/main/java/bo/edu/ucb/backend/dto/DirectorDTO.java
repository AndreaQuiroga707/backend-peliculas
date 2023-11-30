package bo.edu.ucb.backend.dto;
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



    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "directorDTO")
    private Set<MovieDirectorDTO> movieDirectorDTOS = new HashSet<>();

    public DirectorDTO() {
    }

    public DirectorDTO(Long directorId, String directorName, Set<MovieDirectorDTO> movieDirectorDTOS) {
        this.directorId = directorId;
        this.directorName = directorName;
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

    public Set<MovieDirectorDTO> getMovieDirectors() {
        return movieDirectorDTOS;
    }

    public void setMovieDirectors(Set<MovieDirectorDTO> movieDirectorDTOS) {
        this.movieDirectorDTOS = movieDirectorDTOS;
    }

    @Override
    public String toString() {
        return "Director{" +
                "directorId=" + directorId +
                ", directorName='" + directorName + '\'' +
                ", movieDirectors=" + movieDirectorDTOS +
                '}';
    }
}
