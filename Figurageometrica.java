public class Figurageometrica {
    private String nombre;
    private double area;
    private double perimetro;

    public Figurageometrica( String nombre ){
        this.nombre = nombre;
    }

    
    public Figurageometrica(double area) {
        this.area = area;
    }


    //polimorfismo estetico o parametrico
    //sobrecarga de metodos
    public Figurageometrica( String nombre, double area){
        this.nombre = nombre;
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

     //polimorfismo dinamico (sobre-escritura de metodos)
     //sobre-escribit el metodo toString que se hereda de object
     //El metodo debe cumplir con el tuipo de dato de los parametros del heredado
    @Override
    public String toString() {
        return "Figurageometrica [nombre=" + nombre + ", area=" + area + ", perimetro=" + perimetro + "]";
    }
    public String toString(boolean dato){
        if ( dato== true){
            return String.valueOf(this.area);
        }
        //valueOf es un metodo de string que te permite convertir un tipo entero, boleano y true de una cadena
        return String.valueOf(this.perimetro);
        
    }
 
}