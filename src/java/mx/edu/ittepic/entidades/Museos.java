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
@Table(name = "museos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Museos.findAll", query = "SELECT m FROM Museos m")
    , @NamedQuery(name = "Museos.findByIdMuseo", query = "SELECT m FROM Museos m WHERE m.idMuseo = :idMuseo")
    , @NamedQuery(name = "Museos.findByNombreMuseo", query = "SELECT m FROM Museos m WHERE m.nombreMuseo = :nombreMuseo")
    , @NamedQuery(name = "Museos.findByCiudadMuseo", query = "SELECT m FROM Museos m WHERE m.ciudadMuseo = :ciudadMuseo")
    , @NamedQuery(name = "Museos.findByDireccionMuseo", query = "SELECT m FROM Museos m WHERE m.direccionMuseo = :direccionMuseo")
    , @NamedQuery(name = "Museos.findByDescripcionCorta", query = "SELECT m FROM Museos m WHERE m.descripcionCorta = :descripcionCorta")
    , @NamedQuery(name = "Museos.findByDescripcionLarga", query = "SELECT m FROM Museos m WHERE m.descripcionLarga = :descripcionLarga")
    , @NamedQuery(name = "Museos.findByCantidadVisitas", query = "SELECT m FROM Museos m WHERE m.cantidadVisitas = :cantidadVisitas")
    , @NamedQuery(name = "Museos.findByFkIdSeccion", query = "SELECT m FROM Museos m WHERE m.fkIdSeccion = :fkIdSeccion")})
public class Museos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_museo")
    private Integer idMuseo;
    @Size(max = 2147483647)
    @Column(name = "nombre_museo")
    private String nombreMuseo;
    @Size(max = 2147483647)
    @Column(name = "ciudad_museo")
    private String ciudadMuseo;
    @Size(max = 2147483647)
    @Column(name = "direccion_museo")
    private String direccionMuseo;
    @Size(max = 2147483647)
    @Column(name = "descripcion_corta")
    private String descripcionCorta;
    @Size(max = 2147483647)
    @Column(name = "descripcion_larga")
    private String descripcionLarga;
    @Column(name = "cantidad_visitas")
    private Integer cantidadVisitas;
    @Size(max = 2147483647)
    @Column(name = "fk_id_seccion")
    private String fkIdSeccion;

    public Museos() {
    }

    public Museos(Integer idMuseo) {
        this.idMuseo = idMuseo;
    }

    public Integer getIdMuseo() {
        return idMuseo;
    }

    public void setIdMuseo(Integer idMuseo) {
        this.idMuseo = idMuseo;
    }

    public String getNombreMuseo() {
        return nombreMuseo;
    }

    public void setNombreMuseo(String nombreMuseo) {
        this.nombreMuseo = nombreMuseo;
    }

    public String getCiudadMuseo() {
        return ciudadMuseo;
    }

    public void setCiudadMuseo(String ciudadMuseo) {
        this.ciudadMuseo = ciudadMuseo;
    }

    public String getDireccionMuseo() {
        return direccionMuseo;
    }

    public void setDireccionMuseo(String direccionMuseo) {
        this.direccionMuseo = direccionMuseo;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public String getDescripcionLarga() {
        return descripcionLarga;
    }

    public void setDescripcionLarga(String descripcionLarga) {
        this.descripcionLarga = descripcionLarga;
    }

    public Integer getCantidadVisitas() {
        return cantidadVisitas;
    }

    public void setCantidadVisitas(Integer cantidadVisitas) {
        this.cantidadVisitas = cantidadVisitas;
    }

    public String getFkIdSeccion() {
        return fkIdSeccion;
    }

    public void setFkIdSeccion(String fkIdSeccion) {
        this.fkIdSeccion = fkIdSeccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMuseo != null ? idMuseo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Museos)) {
            return false;
        }
        Museos other = (Museos) object;
        if ((this.idMuseo == null && other.idMuseo != null) || (this.idMuseo != null && !this.idMuseo.equals(other.idMuseo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.ittepic.entidades.Museos[ idMuseo=" + idMuseo + " ]";
    }
    
}
