package mx.edu.ittepic.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-18T22:13:18")
@StaticMetamodel(Obras.class)
public class Obras_ { 

    public static volatile SingularAttribute<Obras, Integer> cantidadVisitas;
    public static volatile SingularAttribute<Obras, String> nombreObra;
    public static volatile SingularAttribute<Obras, String> descripcionLarga;
    public static volatile SingularAttribute<Obras, String> descripcionCorta;
    public static volatile SingularAttribute<Obras, Integer> fkIdArtista;
    public static volatile SingularAttribute<Obras, Integer> anioCreacion;
    public static volatile SingularAttribute<Obras, Double> valoracion;
    public static volatile SingularAttribute<Obras, Integer> idObras;
    public static volatile SingularAttribute<Obras, Integer> fkIdSeccion;

}