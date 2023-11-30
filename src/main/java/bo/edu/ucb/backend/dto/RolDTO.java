package bo.edu.ucb.backend.dto;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity

@Table(name = "rol")
public class RolDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rolId;
    private String rol;

    @Column(name = "TX_USER", length = 255)
    private String txUser;

    @Column(name = "TX_DATE")
    private LocalDateTime txDate;

    @Column(name = "TX_HOST", length = 255)
    private String txHost;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rolDTO")
    private Set<UserRolDTO> userRoleDTOS = new HashSet<>();


    public RolDTO() {

    }

    public RolDTO(Long rolId, String rol, String txUser, LocalDateTime txDate, String txHost, Set<UserRolDTO> userRoleDTOS) {
        this.rolId = rolId;
        this.rol = rol;
        this.txUser = txUser;
        this.txDate = txDate;
        this.txHost = txHost;
        this.userRoleDTOS = userRoleDTOS;
    }

    public Long getRolId() {
        return rolId;
    }

    public void setRolId(Long rolId) {
        this.rolId = rolId;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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

    public Set<UserRolDTO> getUsuarioRoles() {
        return userRoleDTOS;
    }

    public void setUsuarioRoles(Set<UserRolDTO> userRoleDTOS) {
        this.userRoleDTOS = userRoleDTOS;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "rolId=" + rolId +
                ", rol='" + rol + '\'' +
                ", txUser='" + txUser + '\'' +
                ", txDate=" + txDate +
                ", txHost='" + txHost + '\'' +
                ", usuarioRoles=" + userRoleDTOS +
                '}';
    }
}