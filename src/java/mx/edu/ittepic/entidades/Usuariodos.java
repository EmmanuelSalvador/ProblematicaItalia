/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ittepic.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "usuariodos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuariodos.findAll", query = "SELECT u FROM Usuariodos u")
    , @NamedQuery(name = "Usuariodos.findByIdUsuario", query = "SELECT u FROM Usuariodos u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "Usuariodos.findByNombreUsuario", query = "SELECT u FROM Usuariodos u WHERE u.nombreUsuario = :nombreUsuario")
    , @NamedQuery(name = "Usuariodos.findByCorreoUsuario", query = "SELECT u FROM Usuariodos u WHERE u.correoUsuario = :correoUsuario")
    , @NamedQuery(name = "Usuariodos.findByPasswordUsuario", query = "SELECT u FROM Usuariodos u WHERE u.passwordUsuario = :passwordUsuario")})
public class Usuariodos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Size(max = 20)
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    @Size(max = 50)
    @Column(name = "correo_usuario")
    private String correoUsuario;
    @Size(max = 16)
    @Column(name = "password_usuario")
    private String passwordUsuario;

    public Usuariodos() {
    }

    public Usuariodos(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuariodos)) {
            return false;
        }
        Usuariodos other = (Usuariodos) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.ittepic.entidades.Usuariodos[ idUsuario=" + idUsuario + " ]";
    }
    
}
