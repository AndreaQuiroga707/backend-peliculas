package bo.edu.ucb.backend.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "MOVIE_DIRECTOR")
public class MovieDirectorDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovieDirector;

    @ManyToOne(fetch = FetchType.EAGER)
    private MovieDTO movieDTO;

    @ManyToOne
    private DirectorDTO directorDTO;

    public MovieDirectorDTO() {
    }

    public MovieDirectorDTO(Long idMovieDirector, MovieDTO movieDTO, DirectorDTO directorDTO) {
        this.idMovieDirector = idMovieDirector;
        this.movieDTO = movieDTO;
        this.directorDTO = directorDTO;
    }

    public Long getIdMovieDirector() {
        return idMovieDirector;
    }

    public void setIdMovieDirector(Long idMovieDirector) {
        this.idMovieDirector = idMovieDirector;
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
                ", movieDTO=" + movieDTO +
                ", directorDTO=" + directorDTO +
                '}';
    }
}
