/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sistemagestioncalificaciones;

import java.util.Scanner; 
public class SistemaGestionCalificaciones {


 /**Clase SistemaControlCalificaciones.
     *@author joshua rosales gorgona.
     *
     * 
     */
  
    /**Metodo minimaCalificación:
     * Este método con el tipo de dato int 
     * encuentra el valor mínimo en un array de enteros (int[]) 
     * que representa las calificaciones ingresadas por el usuario.
     * 
     *Declara una variable de tipo int llamada calificacionMinima e inicia su 
     *valor con el primer elemento del array de calificaciones (indice 0).
     *A continuación usa un bucle for para recorrer el array, comenzando desde 
     *el segundo elemento (indice 1) hasta el final.
     *Durante la iteración, se utiliza un if para comparar cada 
     *calificacion con calificacionMinima del primer elemento (indice 0).
     *Si encuentra una calificación menor, actualiza calificacionMinima con ese 
     *valor, calificacionMinima = calificaciones[i]
     *Si no encuentra no se actualizara y seguira comparando hasta encontrar la
     *calificacionMinima.
     *@param calificaciones array de enteros (int[]) que contiene las 
     *calificaciones ingresadas por el usuario
     *@return devuelve el valor mínimo de tipo int almacenado en la 
     *variable calificacionMinima.
     */
    public static int minimaCalificacion(int[] calificaciones) {
        int calificacionMinima = calificaciones[0];

        for (int i = 1; i < calificaciones.length; i++) {
            if (calificaciones[i] < calificacionMinima) {
                calificacionMinima = calificaciones[i];
            }
        }
        return calificacionMinima;
    }

    /**Metodo contarCalificacionesSuperiores:
     *  Este metodo con un tipo de dato int
     * cuenta cuentas calificaciones en un array enteros(int[]) que son superiores
     * a un umbral dado.
     * 
     * Se declara una variable de tipo de dato(int) llamada contador, que se
     * inicializa en 0. 
     * A continuación se utiliza un bucle for para recorrer el array de calificaciones 
     * ingresado por el usuario. 
     * En cada iteración, la condición if se compara la calificación actual (calificaciones[i])
     * con el valor del umbral.
     * Si la calificacion es mayor que el umbral, el contador se incrementa.
     * Si no es mayor, el contador no incrementara.
     * @param calificaciones array de enteros (int[]) que contiene las 
     *calificaciones ingresadas por el usuario
     * @param umbral valor de tipo (int) que representa el umbral ingresado por el 
     * usuario.
     * @return contador devuelve el numero total de calificaciones que son mayores al
     * umbral.
     */
    public static int contarCalificacionesSuperiores(int[] calificaciones, int umbral) {
        int contador = 0;

        for (int i = 0; i < calificaciones.length; i++) {

            if (calificaciones[i] > umbral) {
                contador++;
            }
        }
        return contador;
    }
     /**Metodo clasificarCalificacion:
      * Este metodo con el void (No retorna nada), clasifica en una categoria (Aprobado, Notable y Sobresaliente)  
      * basadas en el valor dadas por el usuario.
      * 
      * Utiliza una estructura de control if-else para determinar en que rango cae la calificación y
      * luego imprime la clasificacion correspondiente.
      *  
      * El rango de comparación se establece utilizando operadores de comparación:
      *  (mayor o igual) >= y (menor o igual) <= defina los limites del rango para cada categoría.
      * El operador logico ´&&´(y) se utiliza para asegurar que este dentro del rango especificado.
      * la condición ultima de else, no imprime nada 
      * porque si la calificación no aparece en los rangos validos, el metodo no imprimira nada.
      * @param calificacion El valor de la calificacion (int) a clasificar dada por el usuario.
      * 
      */
    public static void clasificarCalificacion(int calificacion) {

        if (calificacion >= 0 && calificacion <= 59) {
            System.out.println("La calificacion " + calificacion + " se clasifica como: Aprobado");
        } else if (calificacion >= 60 && calificacion <= 79) {
            System.out.println("La calificacion " + calificacion + " se clasifica como: Notable");
        } else if (calificacion >= 80 && calificacion <= 100) {
           System.out.println("La calificacion " + calificacion + " se clasifica como: Sobresaliente");
        } else { 
       
        }
            
        
    }
 /**Metodo distribución Respuestas:
  *  Este método toma un arreglo de enteros (int[]) que representa las respuestas ingresadas por el usuario, donde cada respuesta.
  * esta en el rango de 1 a 5.
  * 
  *Se declara un array entero llamado contador, que su tamaño de array es 5 para contar las veces que el usuario ingrese 1 al 5 de su satisfacción.
  * Se incluye un bucle for para recorrer el array de respuestas ingresado por el usuario, dentro del bucle for, hay una condición para
  * establecer el rango de 1 a 5 con los signos >= (mayor o igual) y <= (menor o igual) con el operador lógico de && para comprobar si se
  * cumple las dos condiciones.
  * En cada iteración de respuestas se comprobará con una estructura de control de if-else, 
  * si las respuestas son iguales == (operador lógico) a los números dados por el usuario, el índice del contador que va
  * desde 0 a 4, que es de 1 a 5, los índices dan inicialización en 0, por lo tanto, cuando la condición se cumple, por ejemplo: si el usuario ingresa 1, la primera condición
  * de respuestas va a hacer igual a 1, el contador del índice 0 que es 1, incrementará a 1, y así seguido con las otras condiciones, dependiendo del número de respuestas de
  * satisfacción que vaya a ingresar el usuario las veces que va incrementando el índice contador.
  * @param respuestas, un arreglo de tipo entero (int[]) que contiene las respuestas ingresadas por el usuario.
  * @return Contador devuelve la cantidad de respuestas del 1 al 5 ingresadas por usuario en un arreglo de enteros (int[]). 
  *
  * @param respuestas un arreglo de tipo entero (int[]) que contiene las respuestas ingresados por el usuario.
  * @return contador devuelve la cantidad de respuestas del 1 al 5 ingresado por usuario en un arreglo de enteros (int[]). 
  */
    public static int[] distribucionRespuestas(int[] respuestas) {
  int[] contador = new int[5];
        for (int i = 0; i < respuestas.length; i++) {
             
                 if (respuestas[i] >= 1 && respuestas[i] <= 5) {
                     
                     if (respuestas[i] == 1) {
                          contador[0]++;
                     } else if (respuestas[i] == 2) {
                         contador[1]++;
                     } else if (respuestas[i] == 3) {
                            contador[2]++;
                     } else if (respuestas[i] == 4) {
                              contador[3]++;
                     } else if (respuestas[i] == 5) {
                                 contador[4]++;
                             }
                          }
                        }
        return contador;

                     }
            
    

      /**Metodo calcularNotaFinal
       *  Este metodo de tipo de dato (double), calcula la nota final utilizando los siguientes parametros: 
       * arreglos enteros de examenes y trabajos (int[]), variables enteras (int), ponderacionExamen y ponderacionTrabajo ingresadas por el usuario.
       * 
       * Se declara dos variables sumaExamenes y sumaTrabajos, de tipo de dato (int) inicializadas en 0. 
       * Los bucles for recorren los arreglos de examenes y trabajos ingresados por el usuario. Dentro de estos bucles for, las variable sumaExamenes
       * y sumaTrabajos se van sumando con los valores del array de examenes y trabajos, respectivamente.
       *  Por ejemplo (el primer examen y trabajo es 80, sumaExamenes y sumaTrabajos sera 80 (inicialmente era 0), y si
       * el siguiente examen y trabajo es 80 dado por el usuario, sumaExamenes y sumaTrabajos sera 160 debido al igual =.
       * Despues se declaran las variables calcularMediaExamenes y calcularMediaTrabajos de tipo de dato (double), que serán iguales a la suma de las variables sumaExamenes y sumaTrabajos 
       * divididos por la longitud de los arreglos de examenes y trabajos, el tipo de dato (double) adelante asegura que recibira como
       * resultado decimales, al final guardandose el resultado en las variables calcularMediaExamenes y calcularMediaTrabajos.
       * Por ultimo se declara la variable notaFinal con el tipo de dato (double), que será el resultado de la suma de las multiplicaciones 
       * de calcularMediaExamenes por ponderacionExamen y calcularMediaTrabajos por ponderacionTrabajo, ambas ingresadas por el usuario las ponderaciones.
       * Estas multiplicaciones se realizan dentro de parentesis para asegurar que el calculo sea correcto, y la suma de estos productos de como  
       * resultado la nota final, que se guarda en la variable notaFinal.
       * 
       * @param examenes arreglo de enteros que contiene las notas de los examenes ingresados por el usuario.
       * @param trabajos arreglo de enteros que contiene las notas de los trabajos ingresados por el usuario.
       * @param ponderacionExamen Ponderación asignada a los examenes, un valor decimal entre 0 y 1 ingresado por el usuario.
       * @param ponderacionTrabajo Ponderación asignada a los trabajos, un valor decimal entre 0 y 1 ingresado por el usuario.
       * @return notaFinal Devuelve la notaFinal calculado a partir de los examenes, trabajos y sus respectivas ponderaciones.
       */
    public static double calcularNotaFinal(int[] examenes, int[] trabajos, double ponderacionExamen, double ponderacionTrabajo) {
        int sumaExamenes = 0;
        int sumaTrabajos = 0;

        for (int i = 0; i < examenes.length; i++) {
            sumaExamenes += examenes[i];
        }
        double calcularMediaExamenes = (double) sumaExamenes / examenes.length;

        for (int j = 0; j < trabajos.length; j++) {
            sumaTrabajos += trabajos[j];
        }
        double calcularMediaTrabajos = (double) sumaTrabajos / trabajos.length;

        double notaFinal = (calcularMediaExamenes * ponderacionExamen) + (calcularMediaTrabajos * ponderacionTrabajo);

        return notaFinal;
    }

    
    
    /**Metodo main: 
     * El metodo main contiene las entradas y salidas estandar. Las entradas se realizan con la clase Scanner, donde
     * se declara un objeto Scanner llamado ¨entrada¨ para recibir los datos ingresados por el usuario.
     * 
     *Se declara un array(int) llamado calificaciones con un tamaño inicial 0 (sin elementos).
     *Se declara una variable entero llamado cantidadCalificaciones  que se inicializa en 0.
     *Se declara una variable booleana llamado "seguir" con el valor true que se utilizara para la ejecución del bucle y para terminarlo.
     * @param args 
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int[] calificaciones = new int[0];
        int cantidadCalificaciones = 0;
        boolean seguir = true;
      /**Menu:
       *  El menu muestra las opciones disponibles que el usuario puede seleccionar, con entradas validas del 1 al 7.
       * se utiliza una variable entera llamada ¨option¨ para capturar la opción ingresada por el usuario.
       * 
       */
        do {
            System.out.println("---SISTEMA DE CONTROL DE CALIFICACIONES---");
            System.out.println("1. Ingresar calificaciones del estudiante");
            System.out.println("2. Calificacion minima ");
            System.out.println("3. Contar calificaciones superiores ");
            System.out.println("4. Clasificar calificaciones ");
            System.out.println("5. Encuesta de satisfaccion ");
            System.out.println("6. Cálcular la nota final ");
            System.out.println("7. Salir del sistema ");
            System.out.println("Ingrese su opción: ");
            int option = entrada.nextInt();
            
            /**Uso del switch:
             * Se utiliza switch con un parametro option. Dependiendo del valor del usuario, se ejecutara el caso correspondiente.
             *Cada caso dentro del switch ejecuta funciones relacionadas con la opción seleccionada, permitiendo realizar específicas operaciones y
             * mostrar resultados.
             */
            switch (option) {
                /**Case 1:
                 *  Se declara una variable booleano llamada continuar, inicializada en true.
                 * Se utiliza un bucle while con el parametro continuar, que permite ingresar calificaciones del usuario mientras se matenga en true.
                 * Dentro del bucle, se declara una variable entera (int) llamada "nuevaCalificacion" para capturar la entrada del usuario.
                 * El bucle while se detiene si la condición if se cumple, es decir, si "nuevaCalificacion" es igual a -1 ingresado por el usuario.
                 * En ese caso, "continuar" se establece en false para salir del bucle. 
                 * El "break" se utiliza para salir del bucle switch una vez que se ha completado el case.
                 * 
                 * Si "nuevaCalificacion" no es -1, se realiza lo siguiente con la condición else:
                 * Se crea un nuevo array de enteros llamado "unNuevoArreglo" con un tamaño igual a "cantidadCalificaciones" más 1,
                 * para agregar una nueva calificación (Aumentar el tamaño del array).
                 * Se copía el contenido del array actual "calificaciones" al nuevo array "unNuevoArreglo".
                 * Se añade "nuevaCalificacion" en la ultima posición del nuevo array.
                 * Se actualizara el array "calificaciones" para que apunte al nuevo array "unNuevoArreglo".
                 * Por ultimo se incrementa el contador "cantidadCalificaciones" en 1.
                 * 
                 * En resumen, el bucle for asegura que todas las calificaciones previamente almacenadas se mantenga
                 * al copiar los valores al nuevo array. AL final de cada iteración del bucle while, el array 
                 * "calificaciones" contienen todas las calificaciones ingresadas hasta el momento, con la nueva calificación
                 * añadida al final.
                 */
                case 1:
           
                   boolean continuar = true;
                   while (continuar) {
                    
                        System.out.println("Ingrese la calificacion del estudiante (o -1 para terminar): ");
            int nuevaCalificacion = entrada.nextInt();

            if (nuevaCalificacion == -1) {
                continuar = false;
            } else {
                //Aumenta el tamaño del array para agregar una nueva calificacion
                int[] unNuevoArreglo = new int[cantidadCalificaciones + 1]; //Crea un nuevo array con un espacio extra
                for (int i = 0; i < cantidadCalificaciones; i++) {
                    unNuevoArreglo[i] = calificaciones[i];  //Copia las calificaciones actuales al nuevo arreglo
                }
                unNuevoArreglo[cantidadCalificaciones] = nuevaCalificacion; //Añade la nueva calificacion en la posicion siguiente a las calificaciones actuales (al final del arreglo) 
                calificaciones = unNuevoArreglo; //El arreglo calificaciones ahora apunta al nuevo arreglo 
                cantidadCalificaciones++;  //Incrementa el contador de calificaiones
                   }
                    }
                    
                   break;
            
            
                   
                   /**Case 2: 
                    *  Se utiliza una condición if para verificar si el array "calificaciones" tiene al menos una calificación ingresada.
                    * La condición if se cumple si la longitud del array "calificaciones" es mayor que 0 (calificaciones.length > 0),
                    * lo que indica que el usuario ha ingresado calificaciones. 
                    * 
                    * Dentro del bloque if:
                    * Se declara una variable entera llamada "calificacionMinima", que obtiene el valor retornado 
                    * por el metodo "minimaCalificacion(calificaciones)".
                    * El metodo "minimaCalificacion" se encargará de encontrar la calificación más baja en el array de
                    * calificaciones.
                    * 
                    * Por ultimo se imprime el valor de "calificacionMinima" en la salida estandar, 
                    * mostrando al usuario la calificación más baja registrada.
                    * Si el array de "calificaciones" esta vacio (su longitud es 0), no se ejecutara el bloque
                    * if, y no se realizará ninguna acción.
                    * El "break" se utiliza para salir del bucle switch una vez que se ha completado el case.
                    */
                case 2:
                    
                    if (calificaciones.length > 0) {
                        int calificacionMinima = minimaCalificacion(calificaciones);
                        System.out.println("La calificacion más baja es: " + calificacionMinima);
                    
                    }
                   
                    break;
                    
                    /**Case 3: 
                    *  Se utiliza una condición if para verificar si el array "calificaciones" tiene al menos una calificación ingresada.
                    * La condición if se cumple si la longitud del array "calificaciones" es mayor que 0 (calificaciones.length > 0),
                    * lo que indica que el usuario ha ingresado calificaciones. 
                    * 
                    * Dentro del bloque if:
                    * Se le pide al usuario ingresar el umbral, que será  para contar cuántas calificaciones son mayores que dicho umbral.
                    * La entrada del umbral es almacenada en una variable entera llamada "umbral".
                    * Se declara una variable entera llamada "contar", que recibe el valor retornado por el método 
                    * "contarCalificaciones(calificaciones, umbral)",
                    * llamando al metodo contarCalificacionesSuperiores(Calificaciones, umbral).
                    * El método "contarCalificacionesSuperiores" se encarga de contar cuántas calificaciones en el array 
                    * son mayores que el umbral ingresado.
                    * Por ultimo se imprime el valor del umbral ingresado y el número de calificaciones que son superiores
                    * a dicho umbral.
                    * El "break" se utiliza para salir del bucle switch una vez que se ha completado el case.
                    */
                case 3:
                    if (calificaciones.length > 0) {
                        System.out.println("Ingrese el umbral para contar calificaciones superiores: ");
                        int umbral = entrada.nextInt();
                        int contar = contarCalificacionesSuperiores(calificaciones, umbral);
                        System.out.println("Numero de calificaciones superiores a " + umbral + ": " + contar);
                    }
                     break;
                       /**Case 4: 
                    *  Se utiliza una condición if para verificar si el array "calificaciones" tiene al menos una calificación ingresada.
                    * La condición if se cumple si la longitud del array "calificaciones" es mayor que 0 (calificaciones.length > 0),
                    * lo que indica que el usuario ha ingresado calificaciones. 
                    * 
                    * Dentro del bloque if:
                    * Se utiliza un bucle for que itera a través de todas las calificaciones ingresadas por el usuario.
                    * El bucle recorre el array "calificaciones" desde el indice 0 hasta la ultima posición.
                    * En cada iteracción del bucle: Se declara una variable entera llamada "miCalificacion" que
                    * almacena el valor actual del array en la posición "i" (calificaciones[i]).
                    * Se llama al metodo "clasificarCalificacion(miCalificacion), que toma la calificación actual y
                    * la clasifica de acuerdo a los criterios definidos.
                    * 
                    * El metodo "clasificarCalificacion" puede contener la lógica para clasificar la calificación según diferentes
                    * rangos, como por ejemplo, calificaciones bajas, medias o altas.
                    *  El "break" se utiliza para salir del bucle switch una vez que se ha completado el case.
                    */
                case 4:
                    if (calificaciones.length > 0) {
                        for (int i = 0; i < calificaciones.length; i++) {
                            int miCalificacion = calificaciones[i];
                            clasificarCalificacion(miCalificacion);
                        }
                    }
                    break;
                    
                         /**Case 5:
                 * Se declara un array entero (int) llamado repuestas con un tamaño de inicialización 0.
                 * Se declara una variable entero llamado cantidadRepuestas dando inicialización en 0.
                 * Se declara una variable booleano llamado continuarRespuestas dando inicialización true.
                 * Se utiliza un bucle while con el parametro continuarRespuestas, que permite ingresar respuestas del usuario mientras se matenga en true.
                 * Dentro del bucle while, se declara una variable entera (int) llamada "respuesta" para capturar la entrada del usuario.
                 * El bucle while se detiene si la condición if se cumple, es decir, si "respuesta" es igual a -1, en este caso, "break" 
                 * se establece para salir del bucle switch una vez que se ha compleatdo el case. 
                 * 
                 *(mismo metodo implementado para aumentar el tamaño del array y agregar elemento) 
                 * Si "respuesta" no es -1, se realiza lo siguiente con la condición else:
                 * Se crea un nuevo array de enteros llamado "nuevoArreglo" con un tamaño igual a "cantidadRespuestas" más 1,
                 * para agregar una nueva respuesta.
                 * Se copía el contenido del array actual "respuestas" al nuevo array "nuevoArreglo".
                 * Se añade "respuesta" en la ultima posición del nuevo array.
                 * Se actualizara el array "respuestas" para que apunte al nuevo array "nuevoArreglo".
                 * Por ultimo se incrementa el contador "cantidadRespuestas" en 1.
                 * 
                 * Se utiliza una condición if para verificar si el array "respuestas" tiene al menos una respuesta ingresada.
                 * La condición if se cumple si la longitud del array "respuestas" es mayor que 0 (respuestas.length > 0),
                 * lo que indica que el usuario ha ingresado respuestas.
                 * 
                 * Dentro del bloque if:
                 * Se llama al metodo distribucionRespuestas(respuestas) que devuelve un array enteros, el cual representa la 
                 * distribución de las respuestas en diferentes categorias. Este array se almacena en el array de enteros "distribucion".
                 * 
                 * Por ultimo se imprime la distribucion:
                 * Se imprime el mensaje "Distribución de respuestas: " para indicar que se va a
                 * mostrar la distribución.
                 * Un bucle "for" recorre el array "distribucion" desde el indice 0 hasta el último elemento.
                 * En cada iteración , se imprime el número de la categoria (i+1) seguido de la cantidad de respuestas
                 * que pertenecen a esa categoría, almacenada en "distribucion[i]".
                 * La estructura "i + 1" se utiliza para que la salida sea más entendible para el usuario, ya que los índices de
                 * los arrays comienzan en 0, las categorias comienzan en 1.
                 */
                case 5:
                    int[] respuestas = new int[0];
                    int cantidadRespuestas = 0;
                    boolean continuarRespuestas = true;
                    while (continuarRespuestas) {
                        System.out.println("Ingrese la respuesta de la encuesta (o -1 para terminar): ");
                        int respuesta = entrada.nextInt();

                        if (respuesta == -1) {
                            break;
                        } else {
                            
                            int[] nuevoArreglo = new int[cantidadRespuestas + 1]; 
                            for (int i = 0; i < cantidadRespuestas; i++) {
                                nuevoArreglo[i] = respuestas[i];  
                            }
                            nuevoArreglo[cantidadRespuestas] = respuesta; 
                            respuestas = nuevoArreglo; 
                            cantidadRespuestas++;  
                        }
                    }
                    if (respuestas.length > 0) {
                        int[] distribucion = distribucionRespuestas(respuestas);
                        System.out.println("Distribución de respuesta: ");
                        for (int i = 0; i < distribucion.length; i++) {
                            System.out.println((i + 1) + ": " + distribucion[i]);
                        }
                    }

                    break;
                             /**Case 6:
                 *Se declara una array entero (int) llamado examenes con un nuevo entero del indice 0.
                 *Se declara una array entero (int) llamado trabajos con un nuevo entero del indice 0.
                 *Se declara una variable entero llamado cantidadExamenes inicializado en 0.
                 *Se declara una variable entero llamado cantidadTrabajos inicializado en 0.
                 * 
                 * Examen:
                 * Se utiliza un bucle while con el parametro true, que permite ingresar calificaciones del usuario mientras se matenga en true.
                 * Dentro del bucle, se declara una variable entera (int) llamada "examen" para capturar la entrada del usuario.
                 * El bucle while se detiene si la condición if se cumple, es decir, si "examen" es igual a -1, en este caso,
                 * el "break" se utiliza para salir del bucle switch una vez que se ha completado el case.
                 * 
                 * (mismo metodo implementado para aumentar el tamaño del array y agregar elemento)
                 * Si "examen" no es -1, se realiza lo siguiente con la condición else:
                 * Se crea un nuevo array de enteros llamado "arreglo1" con un tamaño igual a "cantidadExamenes" más 1,
                 * para agregar un nuevo examen.
                 * Se copía el contenido del array actual "examenes" al nuevo array "arreglo1".
                 * Se añade "examenes" en la ultima posición del nuevo array.
                 * Se actualizara el array "examenes" para que apunte al nuevo array "arreglo1".
                 * Por ultimo se incrementa el contador "cantidadExamenes" en 1.
                 * 
                 * Trabajo:
                 * Se utiliza un bucle while con el parametro true, que permite ingresar trabajos del usuario mientras se matenga en true.
                 * Dentro del bucle, se declara una variable entera (int) llamada "trabajo" para capturar la entrada del usuario.
                 * El bucle while se detiene si la condición if se cumple, es decir, si "trabajo" es igual a -1, en este caso,
                 * "break" se utiliza para salir del bucle switch una vez que se ha completado el case.
                 * (mismo metodo implementado para aumentar el tamaño del array y agregar elemento) 
                 * Si "trabajo" no es -1, se realiza lo siguiente con la condición else:
                 * Se crea un nuevo array de enteros llamado "arreglo2" con un tamaño igual a "cantidadTrabajos" más 1,
                 * para agregar un nuevo trabajo.
                 * Se copía el contenido del array actual "trabajos" al nuevo array "arreglo2".
                 * Se añade "trabajos" en la ultima posición del nuevo array.
                 * Se actualizara el array "trabajos" para que apunte al nuevo array "arreglo2".
                 * Por ultimo se incrementa el contador "cantidadTrabajos" en 1.
                 * 
                 * Despues de salir de los bucles igual a -1, se le pide al usuario que ingrese las ponderaciones para
                 * exámenes y trabajos:
                 * 
                 * El sistema solicita al usuario ingresar las ponderaciones para los examenes y trabajos, que se utilizan para
                 * calcular la nota final. La ponderación es un número decimal que representa el porcentaje del peso que tienen
                 * los examenes y los trabajos en la nota final.
                 * Primero, se solicita la ponderación para los examenes (por ejemplo, 0.6) y se almacena en la variable
                 * "ponderacionExamen de tipo double.
                 * Luego se solicita al usuario la ponderación para los trabajos (por ejemplo, 0.4) y se almacena en variable "ponderacionTrabajo de tipo double".
                 * 
                 * Validación y cálculo de la nota final:
                 * Se verifica que tanto el array de exámenes como el array de trabajos contengan al menos una nota
                 * antes de realizar el cálculo de la nota final. La condición if comprueba que la longitud de ambos arrays
                 * sea mayor a 0 (examenes.length > 0 && trabajos.length > 0).
                 * 
                 * Si la condición se cumple, se llama al metodo "calcularNotaFinal(examenes, trabajos, ponderacionExamen, ponderacionTrabajo)",
                 * el cual realiza el cálculo de la nota final de las calificaciones y trabajos y las ponderaciones ingresadas por el usuario.
                 * 
                 * El resultado del cálculo se almacena en la variable "notafinal" de tipo double y se imprime con el 
                 * mensaje: "La notaFinal es: "
                 * 
                 * El uso del break asegura que, una vez calculada e impresa la nota final, el programa salga del
                 * bloque de codigo del case actual en un bucle.
                 */
                    
                case 6:
                
                    int[] examenes = new int[0];
                    int[] trabajos = new int[0];
                    int cantidadExamenes = 0;
                    int cantidadTrabajos = 0;

                    while (true) {
                        System.out.println("Ingrese la nota del examen (o -1 para terminar): ");
                        int examen = entrada.nextInt();
                        if (examen == -1) {
                            break;
                        } else {

                           
                            int[] arreglo1 = new int[cantidadExamenes + 1]; 
                            for (int i = 0; i < cantidadExamenes; i++) {
                                arreglo1[i] = examenes[i];  
                            }
                            arreglo1[cantidadExamenes] = examen; 
                            examenes = arreglo1; 
                            cantidadExamenes++;  
                        }
                    }
                    while (true) {
                        System.out.println("Ingrese la nota del trabajo (o -1 para terminar): ");
                        int trabajo = entrada.nextInt();
                        if (trabajo == -1) {
                            break;
                        } else {
                            
                            int[] arreglo2 = new int[cantidadTrabajos + 1];
                            for (int i = 0; i < cantidadTrabajos; i++) {
                                arreglo2[i] = trabajos[i];  
                            }
                            arreglo2[cantidadTrabajos] = trabajo; 
                            trabajos = arreglo2; 
                            cantidadTrabajos++; 
                        }
                    }
                    System.out.println("Ingrese la ponderación para examenes (por ejemplo 0.6): ");
                    double ponderacionExamen = entrada.nextDouble();
                    System.out.println("Ingrese la ponderación para trabajos (por ejemplo 0.4): ");
                    double ponderacionTrabajo = entrada.nextDouble();
                    if (examenes.length > 0 && trabajos.length > 0) {
                        double notaFinal = calcularNotaFinal(examenes, trabajos, ponderacionExamen, ponderacionTrabajo);
                        System.out.println("La notaFinal es: " + notaFinal);
                        break;
                    }
                    
         /**Case 7: 
          * Este bloque representa la opcion 7 del menu, la cual permite al usuario salir del programa.
          * La variable "seguir" se establece en false. Esta acción es crucial ya que la variable booleana "seguir" controla la ejecución del bucle do-while.
          * Al cambiar el valor de seguir a false, el bucle do-while se detendra, finalizando el programa.
          * 
          * El uso del break es necesario para salir del bloque switch despues de que se seleccione la opción 7, asegurando que no se ejecuten
          * otras opciones del menu.
          * 
          * Opción por defecto:
          * En caso de que el usuario ingrese una opción invalida, el blocque default del switch mostrara un mensaje de error.
          * Dado que la variable "seguir" sigue siendo true, el bucle do-while continuara ejecutandose y el menu se mostrara nuevamente  
          * 
          * Final del bucle:
          * El bucle do-while seguira ejecuntadose mientras la variable "seguir" sea "true". Una vez que "seguir" se convierta en false
          * (Despues de seleccionar la opción 7), el bucle termina y el programa procede a cerrar el recurso "entrada" utilizando
          * entrada.close(), lo que es una buena práctica para liberar recursos asociados con la entrada del usuario.
          */
                case 7:
                    System.out.println("Saliendo del programa.... Gracias por usar el sistema");
                   seguir = false;
                    break;

                default:
                    System.out.println("Error: Opción incorrecta... Ingrese nuevamente");
                    }
        } while (seguir);
        entrada.close();
    }
}
