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
@Table(name = "obras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Obras.findAll", query = "SELECT o FROM Obras o")
    , @NamedQuery(name = "Obras.findByIdObras", query = "SELECT o FROM Obras o WHERE o.idObras = :idObras")
    , @NamedQuery(name = "Obras.findByNombreObra", query = "SELECT o FROM Obras o WHERE o.nombreObra = :nombreObra")
    , @NamedQuery(name = "Obras.findByAnioCreacion", query = "SELECT o FROM Obras o WHERE o.anioCreacion = :anioCreacion")
    , @NamedQuery(name = "Obras.findByFkIdArtista", query = "SELECT o FROM Obras o WHERE o.fkIdArtista = :fkIdArtista")
    , @NamedQuery(name = "Obras.findByDescripcionCorta", query = "SELECT o FROM Obras o WHERE o.descripcionCorta = :descripcionCorta")
    , @NamedQuery(name = "Obras.findByDescripcionLarga", query = "SELECT o FROM Obras o WHERE o.descripcionLarga = :descripcionLarga")
    , @NamedQuery(name = "Obras.findByValoracion", query = "SELECT o FROM Obras o WHERE o.valoracion = :valoracion")
    , @NamedQuery(name = "Obras.findByCantidadVisitas", query = "SELECT o FROM Obras o WHERE o.cantidadVisitas = :cantidadVisitas")
    , @NamedQuery(name = "Obras.findByFkIdSeccion", query = "SELECT o FROM Obras o WHERE o.fkIdSeccion = :fkIdSeccion")})
public class Obras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_obras")
    private Integer idObras;
    @Size(max = 2147483647)
    @Column(name = "nombre_obra")
    private String nombreObra;
    @Column(name = "anio_creacion")
    private Integer anioCreacion;
    @Column(name = "fk_id_artista")
    private Integer fkIdArtista;
    @Size(max = 2147483647)
    @Column(name = "descripcion_corta")
    private String descripcionCorta;
    @Size(max = 2147483647)
    @Column(name = "descripcion_larga")
    private String descripcionLarga;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valoracion")
    private Double valoracion;
    @Column(name = "cantidad_visitas")
    private Integer cantidadVisitas;
    @Column(name = "fk_id_seccion")
    private Integer fkIdSeccion;

    public Obras() {
    }

    public Obras(Integer idObras) {
        this.idObras = idObras;
    }

    public Integer getIdObras() {
        return idObras;
    }

    public void setIdObras(Integer idObras) {
        this.idObras = idObras;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }

    public Integer getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(Integer anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public Integer getFkIdArtista() {
        return fkIdArtista;
    }

    public void setFkIdArtista(Integer fkIdArtista) {
        this.fkIdArtista = fkIdArtista;
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

    public Double getValoracion() {
        return valoracion;
    }

    public void setValoracion(Double valoracion) {
        this.valoracion = valoracion;
    }

    public Integer getCantidadVisitas() {
        return cantidadVisitas;
    }

    public void setCantidadVisitas(Integer cantidadVisitas) {
        this.cantidadVisitas = cantidadVisitas;
    }

    public Integer getFkIdSeccion() {
        return fkIdSeccion;
    }

    public void setFkIdSeccion(Integer fkIdSeccion) {
        this.fkIdSeccion = fkIdSeccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idObras != null ? idObras.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Obras)) {
            return false;
        }
        Obras other = (Obras) object;
        if ((this.idObras == null && other.idObras != null) || (this.idObras != null && !this.idObras.equals(other.idObras))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.ittepic.entidades.Obras[ idObras=" + idObras + " ]";
    }
    
}
