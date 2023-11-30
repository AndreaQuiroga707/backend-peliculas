package bo.edu.ucb.backend.dto;


import jakarta.persistence.*;
@Entity

public class MovieGenreDTO {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovieGenre;

    @ManyToOne(fetch = FetchType.EAGER)
    private MovieDTO movieDTO;

    @ManyToOne
    private GenreDTO genreDTO;

    public MovieGenreDTO() {
    }

    public MovieGenreDTO(Long idMovieGenre, MovieDTO movieDTO, GenreDTO genreDTO) {
        this.idMovieGenre = idMovieGenre;
        this.movieDTO = movieDTO;
        this.genreDTO = genreDTO;
    }

    public Long getIdMovieGenre() {
        return idMovieGenre;
    }

    public void setIdMovieGenre(Long idMovieGenre) {
        this.idMovieGenre = idMovieGenre;
    }

    public MovieDTO getMovie() {
        return movieDTO;
    }

    public void setMovie(MovieDTO movieDTO) {
        this.movieDTO = movieDTO;
    }

    public GenreDTO getGenre() {
        return genreDTO;
    }

    public void setGenre(GenreDTO genreDTO) {
        this.genreDTO = genreDTO;
    }

    @Override
    public String toString() {
        return "MovieGenre{" +
                "idMovieGenre=" + idMovieGenre +
                ", movie=" + movieDTO +
                ", genre=" + genreDTO +
                '}';
    }
}
