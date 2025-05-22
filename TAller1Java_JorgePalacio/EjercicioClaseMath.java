public class EjercicioClaseMath {
    public static void main(String[] args) {

        //(1) Crear 2 variables, una llamada “Base” y la otra “Exponente”
        double base = 5;
        double exponente = 3;

        //Calcular la potencia
        double resultadoPotencia = Math.pow(base, exponente);

        //Mostrar el resultado de la operación
        System.out.println(" --- ");
        System.out.println("Clase Math | Ejercicio 1");
        System.out.println("  ");
        System.out.println("Base: " + base);
        System.out.println("Exponente: " + exponente);
        System.out.println("Potencia: " + resultadoPotencia);
        System.out.println("  ");

        /*-----------------------------------------------------------*/

        //(2) Hallar la raíz cuadrada de los siguientes números: 2, 8, 9, 27, 28, 55, 121
        System.out.println(" --- ");
        System.out.println("Clase Math | Ejercicio 2");
        System.out.println("  ");

        int[] numeros = {2, 8, 9, 27, 28, 55, 121};

        for (int num : numeros) {
            double raiz = Math.sqrt(num);
            System.out.println("Raíz cuadrada de " + num + " es: " + raiz);
        }

        System.out.println("  ");

        /*-----------------------------------------------------------*/

        //(3) Generar 5 números aleatorios entre 0 y 10
        double nota1 = Math.random() * 10;
        double nota2 = Math.random() * 10;
        double nota3 = Math.random() * 10;
        double nota4 = Math.random() * 10;
        double nota5 = Math.random() * 10;

        //Calcular el promedio
        double promedioNotas = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        //Mostrar el resultado
        System.out.println(" --- ");
        System.out.println("Clase Math | Ejercicio 3");
        System.out.println("  ");
        System.out.println("Notas generadas:");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
        System.out.println("Nota 5: " + nota5);
        System.out.println("Promedio: " + promedioNotas);
        System.out.println("  ");

        /*-----------------------------------------------------------*/

        //(4) Generar 2 números decimales aleatorios entre 1 y 50
        double num1 = 1 + Math.random() * 49;
        double num2 = 1 + Math.random() * 49;

        //Redondear las dos variables
        long redondeado1 = Math.round(num1);
        long redondeado2 = Math.round(num2);

        //Calcular el número mayor
        long mayor = Math.max(redondeado1, redondeado2);

        //Mostrar el número mayor
        System.out.println(" --- ");
        System.out.println("Clase Math | Ejercicio 4");
        System.out.println("  ");
        System.out.println("Número 1 (original): " + num1 + " | Redondeado: " + redondeado1);
        System.out.println("Número 2 (original): " + num2 + " | Redondeado: " + redondeado2);
        System.out.println("El número mayor es: " + mayor);
        System.out.println("  ");
    }
}

