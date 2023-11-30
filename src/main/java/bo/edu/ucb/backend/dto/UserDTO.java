package bo.edu.ucb.backend.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
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
    private String imageLink;
    @Column(name = "TX_USER", length = 255)
    private String txUser;

    @Column(name = "TX_DATE")
    private LocalDateTime txDate;

    @Column(name = "TX_HOST", length = 255)
    private String txHost;

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

    public UserDTO(Long id, String username, String email, String firstName, String lastName, String bio, String imageLink, String txUser, LocalDateTime txDate, String txHost, Set<UserRolDTO> userRoleDTOS, Set<CommentDTO> commentDTOS, Set<CommentDTO> ratings) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        this.imageLink = imageLink;
        this.txUser = txUser;
        this.txDate = txDate;
        this.txHost = txHost;
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

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
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

    public Set<UserRolDTO> getUserRoleDTOS() {
        return userRoleDTOS;
    }

    public void setUserRoleDTOS(Set<UserRolDTO> userRoleDTOS) {
        this.userRoleDTOS = userRoleDTOS;
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

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bio='" + bio + '\'' +
                ", imageLink='" + imageLink + '\'' +
                ", txUser='" + txUser + '\'' +
                ", txDate=" + txDate +
                ", txHost='" + txHost + '\'' +
                ", userRoleDTOS=" + userRoleDTOS +
                ", commentDTOS=" + commentDTOS +
                ", ratings=" + ratings +
                '}';
    }
}