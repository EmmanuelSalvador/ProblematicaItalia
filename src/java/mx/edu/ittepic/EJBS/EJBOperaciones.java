/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ittepic.EJBS;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import mx.edu.ittepic.entidades.Museos;
import mx.edu.ittepic.entidades.Usuario;
import mx.edu.ittepic.entidades.Obras;

/**
 *
 * @author DELL
 */
@Stateless
public class EJBOperaciones {

    @PersistenceContext
    EntityManager em;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    //-------------------------------------------------------------------------Museos-----------------------------------------------------------------------------------
   public String nuevoMuseo(String nombre_museo, String ciudad_museo, String direccion_museo, String descripcion_corta, String descripcion_larga, int cantidad_visitas, String fk_id_seccion) {
       Museos museos = new Museos();
       museos.setNombreMuseo(nombre_museo);
       museos.setCiudadMuseo(ciudad_museo);
       museos.setDireccionMuseo(direccion_museo);
       museos.setDescripcionCorta(descripcion_corta);
       museos.setDescripcionLarga(descripcion_larga);
       museos.setCantidadVisitas(cantidad_visitas);
       museos.setFkIdSeccion(fk_id_seccion);
       
       String msj;
        try{
            em.persist(museos);
            msj="{\"Código\":200, \"msj\":\"La operación se realizó correctamente\"}";
        }catch(Exception e){
            msj="{\"Código\":400, \"msj\":\"Error en los tipos de parámetros\"}";
        }
        return msj;
   }
   public String consultaMuseo(){
        try{
           Query q;
           List<Museos> listaRol;
           q=em.createNamedQuery("Museos.findAll");
           listaRol=q.getResultList();//Ejecutar consulta
           
           //Convertir la lista a objetos JSON
           GsonBuilder builder = new GsonBuilder();
           Gson gson = builder.create();
           return gson.toJson(listaRol);
        }catch (Exception e){
            return "{mensaje:'Error}";
        }
    }
    public String actualizaMuseo(int id_museo, String nombre_museo, String ciudad_museo, String direccion_museo, String descripcion_corta, String descripcion_larga, int cantidad_visitas, String fk_id_seccion){
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Museos museo = new Museos();
        String msj;
        try{
            museo = em.find(Museos.class,id_museo);//buscar por idrol
            museo.setNombreMuseo(nombre_museo);
            museo.setCiudadMuseo(ciudad_museo);
            museo.setDireccionMuseo(direccion_museo);
            museo.setDescripcionCorta(descripcion_corta);
            museo.setDescripcionLarga(descripcion_larga);
            museo.setCantidadVisitas(cantidad_visitas);
            museo.setFkIdSeccion(fk_id_seccion);
            
            msj="{\"Código\":200, \"msj\":\"La operación se realizó correctamente\"}";
        } catch (NumberFormatException e){
            msj="{\"Código\":400, \"msj\":\"Error en los tipos de parámetros\"}";
        }
        return msj;
    }
    
     public String eliminaMuseo(int id_museo){
        Museos museo;
        String msj;
        
        try{
            museo = (Museos) em.createNamedQuery("Museos.findByIdMuseo").setParameter("idMuseo", id_museo).getSingleResult();
            em.remove(em.merge(museo));
            msj="{\"Código\":200, \"msj\":\"La operación se realizó correctamente\"}";
        } catch (NumberFormatException e){
            msj="{\"Código\":400, \"msj\":\"Error en los tipos de parámetros\"}";
        }
        return msj;
    }
     
     
     //-------------------------------------------------------------------------Usuarios-----------------------------------------------------------------------------------
     
     
     
    public String nuevoUsuario(String nombre_usuario, String correo_usuario, String password_usuario, int fk_id_rol){
        Usuario r = new Usuario();
      
        r.setNombreUsuario(nombre_usuario);
        r.setCorreoUsuario(correo_usuario);
        r.setPasswordUsuario(password_usuario);
        r.setFkIdRol(fk_id_rol);
        
        String msj;
        try{
            em.persist(r);
            msj="{\"Código\":200, \"msj\":\"La operación se realizó correctamente\"}";
        }catch(Exception e){
            msj="{\"Código\":400, \"msj\":\"Error en los tipos de parámetros\"}";
        }
        return msj;
    }
    
     public String consultaUsuario(){
        try{
           Query q;
           List<Usuario> listaRol;
           q=em.createNamedQuery("Usuario.findAll");
           listaRol=q.getResultList();//Ejecutar consulta
           
           //Convertir la lista a objetos JSON
           GsonBuilder builder = new GsonBuilder();
           Gson gson = builder.create();
           return gson.toJson(listaRol);
        }catch (Exception e){
            return "{mensaje:'Error}";
        }
    }
     
    public String eliminaUsuario(int id_usuario){
        Usuario usuario;
        String msj;
        
        try{
            usuario = (Usuario) em.createNamedQuery("Usuario.findByIdUsuario").setParameter("idUsuario", id_usuario).getSingleResult();
            em.remove(em.merge(usuario));
            msj="{\"Código\":200, \"msj\":\"La operación se realizó correctamente\"}";
        } catch (NumberFormatException e){
            msj="{\"Código\":400, \"msj\":\"Error en los tipos de parámetros\"}";
        }
        return msj;
    }
    
    public String actualizaUsuario(int id_usuario, String nombre_usuario, String correo_usuario, String password_usuario, int fk_id_rol){
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Usuario usuario = new Usuario();
        String msj;
        try{
            usuario = em.find(Usuario.class,id_usuario);//buscar por idrol
            usuario.setNombreUsuario(nombre_usuario);
            usuario.setCorreoUsuario(correo_usuario);
            usuario.setPasswordUsuario(password_usuario);
            usuario.setFkIdRol(fk_id_rol);
            em.merge(usuario);
            msj="{\"Código\":200, \"msj\":\"La operación se realizó correctamente\"}";
        } catch (NumberFormatException e){
            msj="{\"Código\":400, \"msj\":\"Error en los tipos de parámetros\"}";
        }
        return msj;
    }
    
    //-------------------------------------------------------------------------Obras-----------------------------------------------------------------------------------
    
    public String nuevoObra(String nombre_obra, int anio_creacion, int fk_id_artista, String descripcion_corta, String descripcion_larga, double valoracion, int cantidad_visitas, int fk_id_seccion) {
       Obras obra = new Obras();
       obra.setNombreObra(nombre_obra);
       obra.setAnioCreacion(anio_creacion);
       obra.setFkIdArtista(fk_id_artista);
       obra.setDescripcionCorta(descripcion_corta);
       obra.setDescripcionLarga(descripcion_larga);
       obra.setValoracion(valoracion);
       obra.setCantidadVisitas(cantidad_visitas);
       obra.setFkIdSeccion(fk_id_seccion);
       String msj;
        try{
            em.persist(obra);
            msj="{\"Código\":200, \"msj\":\"La operación se realizó correctamente\"}";
        }catch(Exception e){
            msj="{\"Código\":400, \"msj\":\"Error en los tipos de parámetros\"}";
        }
        return msj;
   }
   public String consultaObra(){
        try{
           Query q;
           List<Obras> listaObra;
           q=em.createNamedQuery("Obras.findAll");
           listaObra=q.getResultList();//Ejecutar consulta
           
           //Convertir la lista a objetos JSON
           GsonBuilder builder = new GsonBuilder();
           Gson gson = builder.create();
           return gson.toJson(listaObra);
        }catch (Exception e){
            return "{mensaje:'Error}";
        }
    }
    public String actualizaObra(int id_obra, String nombre_obra, int anio_creacion, int fk_id_artista, String descripcion_corta, String descripcion_larga, double valoracion, int cantidad_visitas, int fk_id_seccion){
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Obras obra = new Obras();
        String msj;
        try{
            obra = em.find(Obras.class,id_obra);//buscar por idrol
            obra.setNombreObra(nombre_obra);
            obra.setAnioCreacion(anio_creacion);
            obra.setFkIdArtista(fk_id_artista);
            obra.setDescripcionCorta(descripcion_corta);
            obra.setDescripcionLarga(descripcion_larga);
            obra.setValoracion(valoracion);
            obra.setCantidadVisitas(cantidad_visitas);
            obra.setFkIdSeccion(fk_id_seccion);
            
            msj="{\"Código\":200, \"msj\":\"La operación se realizó correctamente\"}";
        } catch (NumberFormatException e){
            msj="{\"Código\":400, \"msj\":\"Error en los tipos de parámetros\"}";
        }
        return msj;
    }
    
     public String eliminaObra(int id_obra){
        Obras obra;
        String msj;
        
        try{
            obra = (Obras) em.createNamedQuery("Obras.findByIdObras").setParameter("idObras", id_obra).getSingleResult();
            em.remove(em.merge(obra));
            msj="{\"Código\":200, \"msj\":\"La operación se realizó correctamente\"}";
        } catch (NumberFormatException e){
            msj="{\"Código\":400, \"msj\":\"Error en los tipos de parámetros\"}";
        }
        return msj;
    }
}
