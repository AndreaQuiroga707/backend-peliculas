package bo.edu.ucb.backend.dto;


import jakarta.persistence.*;

@Entity

@Table(name = "userRol")
public class UserRolDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioRolId;

    @ManyToOne(fetch = FetchType.EAGER)
    private UserDTO userDTO;

    @ManyToOne
    private RolDTO rolDTO;

    public Long getUsuarioRolId() {
        return usuarioRolId;
    }

    public void setUsuarioRolId(Long usuarioRolId) {
        this.usuarioRolId = usuarioRolId;
    }

    public UserDTO getUsuario() {
        return userDTO;
    }

    public void setUsuario(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public RolDTO getRol() {
        return rolDTO;
    }

    public void setRol(RolDTO rolDTO) {
        this.rolDTO = rolDTO;
    }
}
