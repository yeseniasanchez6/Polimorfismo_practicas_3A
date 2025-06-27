public class TestingPolimorfismo {
    public static void main(String[] args) {
        Figurageometrica unafiguraGeometrica = new Figurageometrica("Rombo");
        System.out.println();
        unafiguraGeometrica.setArea(12.45);

        // Ejemplo de polimorfismo estatico:
        // el porgramador indica cual metodo usar segun los parametros que envie
        System.out.println(unafiguraGeometrica.toString());
        System.out.println("Area de la figura: " + unafiguraGeometrica.toString(true));

        Circulo circulo1 = new Circulo("Circulo", 10.5);

        // Ejemplo de polimorfismo dinamico:
        // Java detecta que objeto es para llamar al metodo apropiado
        double a = circulo1.getArea();
        circulo1.setArea(a);
        System.out.println("Info del circulo1 : " + circulo1 );

        Triangulo triangulo2 = new Triangulo("Triangulo equilatero", 15,10, 20);
        triangulo2.setAltura(5);
        double d = triangulo2.getArea();
        triangulo2.setArea(d);
        double e = triangulo2.getPerimetro();
        triangulo2.setPerimetro(e);
        System.out.println("Informacion del triangulo: " + triangulo2.toString());

        Triangulo triangulo3 = new Triangulo("Triangulo rectangulo es:", 12, 15);
        triangulo3.setArea(d);
        System.out.println("Informacion de triangulo rectangulo es:" + triangulo3.toString());
}
}