public class EjercicioOperaciones {
     public static void main(String[] args) {

        //(1 )Relizar los siguientes pasos en su respectivo orden.

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
        double promedio1 = ( n1 + n2 + n3 + n4 + n5 ) / 5;

        //Mostrar el resultado y el nombre del estudiante.
        System.out.println(" --- ");
        System.out.println("Ejercicios operaciones | Ejercicio 1");
        System.out.println("  ");
        System.out.println("El promedio del estudiante " + nombre);
        System.out.println("Es: " + promedio1);
        System.out.println("  ");


        //(2)Relizar los siguientes pasos en su respectivo orden.

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


        //(3)Relizar los siguientes pasos en su respectivo orden.

        /*-----------------------------------------------------------*/

        //Crear una variable nombre “numeroUno” con el valor de 8.
        int numeroUno = 8;

        //Crear una variable nombre “numeroDos” con el valor de 2.
        int numeroDos = 2;

        /*Intercambiar los valores de ambas variables, de modo que “numeroUno” valga 2, y “numeroDos” valga 8. (Utiliza una variable auxiliar)*/
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


        //(2)Relizar los siguientes pasos en su respectivo orden.

        /*-----------------------------------------------------------*/

        //Crear una variable llamada “Estado”
        boolean estado;

        //Realizar la siguiente operación sobre la variable “Estado”: (5 == 2) || (2 > 1)
        estado = (5 == 2) || (2 > 1);

        //Mostrar el resultado de la variable “Estado”
        System.out.println(" --- ");
        System.out.println("Ejercicios operaciones | Ejercicio 3");
        System.out.println("  ");
        System.out.println("El estado es: " + estado);
        System.out.println("  ");

        

     }
}