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
@Table(name = "artistas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Artistas.findAll", query = "SELECT a FROM Artistas a")
    , @NamedQuery(name = "Artistas.findByIdArtista", query = "SELECT a FROM Artistas a WHERE a.idArtista = :idArtista")
    , @NamedQuery(name = "Artistas.findByNombreArtista", query = "SELECT a FROM Artistas a WHERE a.nombreArtista = :nombreArtista")
    , @NamedQuery(name = "Artistas.findByBiografiaCorta", query = "SELECT a FROM Artistas a WHERE a.biografiaCorta = :biografiaCorta")
    , @NamedQuery(name = "Artistas.findByBiografiaLarga", query = "SELECT a FROM Artistas a WHERE a.biografiaLarga = :biografiaLarga")
    , @NamedQuery(name = "Artistas.findByValoracion", query = "SELECT a FROM Artistas a WHERE a.valoracion = :valoracion")
    , @NamedQuery(name = "Artistas.findByVisitas", query = "SELECT a FROM Artistas a WHERE a.visitas = :visitas")})
public class Artistas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_artista")
    private Integer idArtista;
    @Size(max = 2147483647)
    @Column(name = "nombre_artista")
    private String nombreArtista;
    @Size(max = 2147483647)
    @Column(name = "biografia_corta")
    private String biografiaCorta;
    @Size(max = 2147483647)
    @Column(name = "biografia_larga")
    private String biografiaLarga;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valoracion")
    private Double valoracion;
    @Column(name = "visitas")
    private Integer visitas;

    public Artistas() {
    }

    public Artistas(Integer idArtista) {
        this.idArtista = idArtista;
    }

    public Integer getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(Integer idArtista) {
        this.idArtista = idArtista;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getBiografiaCorta() {
        return biografiaCorta;
    }

    public void setBiografiaCorta(String biografiaCorta) {
        this.biografiaCorta = biografiaCorta;
    }

    public String getBiografiaLarga() {
        return biografiaLarga;
    }

    public void setBiografiaLarga(String biografiaLarga) {
        this.biografiaLarga = biografiaLarga;
    }

    public Double getValoracion() {
        return valoracion;
    }

    public void setValoracion(Double valoracion) {
        this.valoracion = valoracion;
    }

    public Integer getVisitas() {
        return visitas;
    }

    public void setVisitas(Integer visitas) {
        this.visitas = visitas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArtista != null ? idArtista.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artistas)) {
            return false;
        }
        Artistas other = (Artistas) object;
        if ((this.idArtista == null && other.idArtista != null) || (this.idArtista != null && !this.idArtista.equals(other.idArtista))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.ittepic.entidades.Artistas[ idArtista=" + idArtista + " ]";
    }
    
}
