package POJO;
// Generated 22-feb-2016 12:29:51 by Hibernate Tools 4.3.1



/**
 * Direccion generated by hbm2java
 */
public class Direccion  implements java.io.Serializable {


     private Integer id;
     private String calle;
     private int numero;
     private String piso;
     private String ciudad;
     private String zip;
     private Persona persona;

    public Direccion() {
    }

	
    public Direccion(String calle, int numero, String piso, String ciudad, String zip) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
        this.zip = zip;
    }
    public Direccion(String calle, int numero, String piso, String ciudad, String zip, Persona persona) {
       this.calle = calle;
       this.numero = numero;
       this.piso = piso;
       this.ciudad = ciudad;
       this.zip = zip;
       this.persona = persona;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getPiso() {
        return this.piso;
    }
    
    public void setPiso(String piso) {
        this.piso = piso;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getZip() {
        return this.zip;
    }
    
    public void setZip(String zip) {
        this.zip = zip;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }




}


