package bo.edu.ucb.backend.dto;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity

@Table(name = "userRol")
public class UserRolDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioRolId;

    @Column(name = "TX_USER", length = 255)
    private String txUser;

    @Column(name = "TX_DATE")
    private LocalDateTime txDate;

    @Column(name = "TX_HOST", length = 255)
    private String txHost;

    @ManyToOne(fetch = FetchType.EAGER)
    private UserDTO userDTO;

    @ManyToOne
    private RolDTO rolDTO;

    public UserRolDTO() {
    }

    public UserRolDTO(Long usuarioRolId, String txUser, LocalDateTime txDate, String txHost, UserDTO userDTO, RolDTO rolDTO) {
        this.usuarioRolId = usuarioRolId;
        this.txUser = txUser;
        this.txDate = txDate;
        this.txHost = txHost;
        this.userDTO = userDTO;
        this.rolDTO = rolDTO;
    }

    public Long getUsuarioRolId() {
        return usuarioRolId;
    }

    public void setUsuarioRolId(Long usuarioRolId) {
        this.usuarioRolId = usuarioRolId;
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

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public RolDTO getRolDTO() {
        return rolDTO;
    }

    public void setRolDTO(RolDTO rolDTO) {
        this.rolDTO = rolDTO;
    }

    @Override
    public String toString() {
        return "UserRolDTO{" +
                "usuarioRolId=" + usuarioRolId +
                ", txUser='" + txUser + '\'' +
                ", txDate=" + txDate +
                ", txHost='" + txHost + '\'' +
                ", userDTO=" + userDTO +
                ", rolDTO=" + rolDTO +
                '}';
    }
}