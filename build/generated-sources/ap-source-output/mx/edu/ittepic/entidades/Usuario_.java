package mx.edu.ittepic.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-18T22:13:18")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> correoUsuario;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> passwordUsuario;
    public static volatile SingularAttribute<Usuario, Integer> fkIdRol;
    public static volatile SingularAttribute<Usuario, String> nombreUsuario;

}