public class EjercicioOperaciones {
    public static void main(String[] args) {

        //(1) Relizar los siguientes pasos en su respectivo orden.

        /*-----------------------------------------------------------*/

        //variable para almacenar el nombre de un estudiante
        String nombre = "Jorge";

        //5 variables para almacenar 5 diferentes notas decimales
        double n1 = 4.6;
        double n2 = 4.6;
        double n3 = 4.6;
        double n4 = 4.6;
        double n5 = 4.6;

        //calcular el promedio final del estudiante a partir de las 5 notas decimales.
        double promedio1 = (n1 + n2 + n3 + n4 + n5) / 5;

        //Mostrar el resultado y el nombre del estudiante.
        System.out.println(" --- ");
        System.out.println("Ejercicios operaciones | Ejercicio 1");
        System.out.println("  ");
        System.out.println("El promedio del estudiante " + nombre);
        System.out.println("Es: " + promedio1);
        System.out.println("  ");


        //(2) Relizar los siguientes pasos en su respectivo orden.

        /*-----------------------------------------------------------*/

        //variable con el valor de 9
        int a1 = 9;

        //variable con el valor de 7
        int a2 = 7;

        //Calcular la suma de la variable número uno más la variable número dos
        int suma = a1 + a2;

        //Calcular la resta de la variable número uno menos la variable número dos.
        int resta = a1 - a2;

        //Calcular la multiplicación de la variable número uno por la variable número dos
        int multi = a1 * a2;

        //Calcular la división de la variable número uno dividida la variable número dos
        int division = a1 / a2;

        //Mostrar los resultados de cada operación.
        System.out.println(" --- ");
        System.out.println("Ejercicios operaciones | Ejercicio 2");
        System.out.println("  ");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multi);
        System.out.println("Division: " + division);
        System.out.println("  ");


        //(3) Relizar los siguientes pasos en su respectivo orden.

        /*-----------------------------------------------------------*/

        //Crear una variable nombre “numeroUno” con el valor de 8.
        int numeroUno = 8;

        //Crear una variable nombre “numeroDos” con el valor de 2.
        int numeroDos = 2;

        //Intercambiar los valores de ambas variables, de modo que “numeroUno” valga 2, y “numeroDos” valga 8. (Utiliza una variable auxiliar)
        int cambiar = numeroDos;
        numeroDos = numeroUno;
        numeroUno = cambiar;

        //Mostrar los resultados de ambas variables.
        System.out.println(" --- ");
        System.out.println("Ejercicios operaciones | Ejercicio 3");
        System.out.println("  ");
        System.out.println("Numero uno: " + numeroUno);
        System.out.println("Numero dos: " + numeroDos);
        System.out.println("  ");


        //(4) Relizar los siguientes pasos en su respectivo orden.

        /*-----------------------------------------------------------*/

        //Crear una variable llamada “Estado”
        boolean estado;

        //Realizar la siguiente operación sobre la variable “Estado”: (5 == 2) || (2 > 1)
        estado = (5 == 2) || (2 > 1);

        //Mostrar el resultado de la variable “Estado”
        System.out.println(" --- ");
        System.out.println("Ejercicios operaciones | Ejercicio 4");
        System.out.println("  ");
        System.out.println("El estado es: " + estado);
        System.out.println("  ");


        //(5) Relizar los siguientes pasos en su respectivo orden.

        /*-----------------------------------------------------------*/

        //Crear una variable llamada “Resultado”
        double resultado;

        //Dentro de la variable “Resultado”, crear una operación aritmética donde se haga uso de todos los operadores matemáticos
        resultado = ((10 / 2) + 4 * 3 - (2 + 1)) + 5 % 2;

        //Mostrar el resultado de la operación
        System.out.println(" --- ");
        System.out.println("Ejercicios operaciones | Ejercicio 5");
        System.out.println("  ");
        System.out.println("El resultado de la operación es: " + resultado);
        System.out.println("  ");


        //(6) Relizar los siguientes pasos en su respectivo orden.

        /*-----------------------------------------------------------*/

        //Crear una variable llamada “ladoCuadrado” de valor 8
        int ladoCuadrado = 8;

        //Calcular el área y el perímetro del cuadrado
        int areaCuadrado = ladoCuadrado * ladoCuadrado;
        int perimetroCuadrado = ladoCuadrado * 4;

        //Crear una variable llamada “baseTriangulo” de valor 9
        int baseTriangulo = 9;

        //Crear una variable llamada “alturaTriangulo” de valor 8
        int alturaTriangulo = 8;

        //Crear dos variables llamadas “ladoUnoTriangulo” y “ladoDosTriangulo” de valor 8 ambas
        int ladoUnoTriangulo = 8;
        int ladoDosTriangulo = 8;

        //Calcular el área y el perímetro del triángulo
        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2.0;
        int perimetroTriangulo = baseTriangulo + ladoUnoTriangulo + ladoDosTriangulo;

        //Crear una variable llamada “baseRectangulo” de valor 8
        int baseRectangulo = 8;

        //Crear una variable llamada “alturaRectangulo” de valor 6
        int alturaRectangulo = 6;

        //Calcular el área y el perímetro del rectángulo
        int areaRectangulo = baseRectangulo * alturaRectangulo;
        int perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);

        //Mostrar el resultado de las operaciones
        System.out.println(" --- ");
        System.out.println("Ejercicios operaciones | Ejercicio 6");
        System.out.println("  ");
        System.out.println("Área del cuadrado: " + areaCuadrado);
        System.out.println("Perímetro del cuadrado: " + perimetroCuadrado);
        System.out.println("  ");
        System.out.println("Área del triángulo: " + areaTriangulo);
        System.out.println("Perímetro del triángulo: " + perimetroTriangulo);
        System.out.println("  ");
        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
        System.out.println("  ");
    }
}