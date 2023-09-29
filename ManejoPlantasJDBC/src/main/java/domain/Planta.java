package domain;

public class Planta {

    private Integer id_planta;
    private String nombre_científico;
    private String nombre_común;
    private String región;
    private int precio;
    private String tamaño;

    public Planta() {
    }
    public Planta(int id_planta) {
        this.id_planta = id_planta;
        
    }
    public Planta(String nombre_científico, String nombre_común, String región, int precio, String tamaño) {
        this.nombre_científico = nombre_científico;
        this.nombre_común = nombre_común;
        this.región = región;
        this.precio = precio;
        this.tamaño = tamaño;
    }
    public Planta(Integer id_planta, String nombre_científico, String nombre_común, String región, int precio, String tamaño) {
        this.id_planta = id_planta;
        this.nombre_científico = nombre_científico;
        this.nombre_común = nombre_común;
        this.región = región;
        this.precio = precio;
        this.tamaño = tamaño;
    }

    public int getId_planta() {
        return id_planta;
    }
    public void setId_planta(int id_planta) {
        this.id_planta = id_planta;
    }
    public String getNombre_científico() {
        return nombre_científico;
    }
    public void setNombre_científico(String nombre_científico) {
        this.nombre_científico = nombre_científico;
    }
    public String getNombre_común() {
        return nombre_común;
    }
    public void setNombre_común(String nombre_común) {
        this.nombre_común = nombre_común;
    }
    public String getRegión() {
        return región;
    }
    public void setRegión(String región) {
        this.región = región;
    }
    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    public String getTamaño(){
        return tamaño;
    }
    public void setTamaño(String tamaño){
        this.tamaño = tamaño;
    }
    
    @Override
    public String toString(){
        return " { " + " id_planta: " + id_planta + " | nombre científico= " + nombre_científico + 
                " | nombre_común: " + nombre_común + " | región: " + región + " | precio: " + precio +
                " | tamaño: "+ tamaño +" } ";
     }
}
