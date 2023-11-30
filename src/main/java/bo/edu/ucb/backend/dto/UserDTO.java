package bo.edu.ucb.backend.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity

public class UserDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String bio;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "userDTO")
    @JsonIgnore
    private Set<UserRolDTO> userRoleDTOS = new HashSet<>();


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "userDTO")
    @JsonIgnore
    private Set<CommentDTO> commentDTOS = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "userDTO")
    @JsonIgnore
    private Set<CommentDTO> ratings = new HashSet<>();


    public UserDTO() {

    }

    public UserDTO(Long id, String username, String email, String firstName, String lastName, String bio, Set<UserRolDTO> userRoleDTOS, Set<CommentDTO> commentDTOS, Set<CommentDTO> ratings) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        this.userRoleDTOS = userRoleDTOS;
        this.commentDTOS = commentDTOS;
        this.ratings = ratings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Set<UserRolDTO> getUsuarioRoles() {
        return userRoleDTOS;
    }

    public void setUsuarioRoles(Set<UserRolDTO> userRoleDTOS) {
        this.userRoleDTOS = userRoleDTOS;
    }

    public Set<CommentDTO> getComments() {
        return commentDTOS;
    }

    public void setComments(Set<CommentDTO> commentDTOS) {
        this.commentDTOS = commentDTOS;
    }

    public Set<CommentDTO> getRatings() {
        return ratings;
    }

    public void setRatings(Set<CommentDTO> ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bio='" + bio + '\'' +
                ", usuarioRoles=" + userRoleDTOS +
                ", comments=" + commentDTOS +
                ", ratings=" + ratings +
                '}';
    }
}