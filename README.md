# INFORME DE INVESTIGACION


![alt text](assets/logoUpsCarrera.png)


### *Asignatura:* Estructura de Datos

### *Tema:* Proyecto de Complejidad y Eficiencia de Algoritmos


# Integrantes:
- Renato Martín Amaya Siguenza - https://github.com/MartinAmaya12
- 


# Objetivo General

El objetivo general de este proyecto es comprender y aplicar los conceptos de complejidad y eficiencia de algoritmos en Java.

# Objetivos Específicos

- Comprender las diferentes notaciones de complejidad (O(1), O(n), O(n^2), O(log n), O(n log n)).
- Implementar algoritmos con diferentes complejidades para demostrar su eficiencia.
- Analizar y explicar el rendimiento de los algoritmos implementados.

# Marco Teorico

## **1. Teoría de Complejidad**

### 1.1 La teoría de la complejidad

La teoría de la complejidad es una rama de la informática que se ocupa de estudiar la eficiencia de los algoritmos y la complejidad de los problemas computacionales. 

### 1.2 Importancia de la Complejidad

La complejidad es un concepto fundamental en la informática, ya que permite evaluar la eficiencia de los algoritmos y la eficiencia de los problemas computacionales. 

### 1.3 Eficiencia de algoritmos
La eficiencia se evalúa mediante dos dimensiones principales:

1. **Coste temporal:**

Se refiere al tiempo de ejecución del algoritmo, medido generalmente en número de operaciones elementales en lugar de segundos exactos

2. **Coste espacial:**

Se refiere a la cantidad de memoria (espacio de almacenamiento) que el algoritmo necesita durante su ejecución[cite: 13, 18].

### 1.4 Factores de tiempo de ejecución
El tiempo real que tarda un algoritmo depende de diversos factores:

**Factores propios:** Relacionados con el diseño del algoritmo y las estructuras de datos utilizadas

**Factores circunstanciales:** Dependen del entorno de ejecución, como el hardware, el compilador, el sistema operativo y la carga del sistema

**Análisis teórico:** Evaluación matemática "a priori" del algoritmo usando notación asintótica, independiente del hardware

**Análisis experimental:** Medición "a posteriori" del tiempo de ejecución real con diferentes entradas de datos

### 1.5 Notacion de complejidad

Se utiliza para describir el comportamiento del algoritmo cuando la entrada tiende a infinito:

**Notación Big O ($O$):** Representa la cota superior o el peor escenario de ejecución.
* **Mejor caso:** Escenario donde el algoritmo realiza el mínimo de pasos.
* **Peor caso:** Escenario donde el algoritmo realiza el máximo de pasos (el que representa Big O).
* **Caso promedio:** El comportamiento esperado con una entrada típica.
* **Big O ($O$), Omega ($\Omega$), Theta ($\Theta$):** Describen cotas superiores, inferiores y ajustadas respectivamente.


## **2. Ejemplos de Complejidad en Java**

En esta sección se presentan las clases creadas dentro del proyecto y el análisis correspondiente a cada una.

---

## **2.1 Complejidad O(1) – Constante**

### **Archivo:** `ComplejidadConstante.java`

### **Código del ejemplo**

![alt text](<assets/CConstante(java).png>)

### Salida del ejemplo

![alt text](assets/ComplejidadConstante.png)

### **Explicación resumida**

La complejidad es $O(1)$ (Constante) porque el número de operaciones es fijo y no depende del tamaño de ninguna entrada. El código siempre ejecuta las mismas líneas sin importar factores externos.

## **2.2 Complejidad O(n) – Lineal**

### **Archivo:** `ComplejidadLineal.java`

### **Código del ejemplo**

![alt text](<assets/ComplejidadLineal(java).png>)

### Salida del ejemplo

![alt text](assets/ComplejidadLineal.png)

### **Explicación resumida**

La complejidad es $O(n)$ (Lineal) porque existe un bucle que itera exactamente $n$ veces. El tiempo de ejecución crece proporcionalmente al tamaño de $n$; si $n$ se duplica, el tiempo también2.

## **2.3 Complejidad O(n^2) – Cuadrática**

### **Archivo:** `ComplejidadCuadratica.java`

### **Código del ejemplo**

![alt text](<assets/ComplejidadCuadratica(java).png>)

### Salida del ejemplo

![alt text](assets/ComplejidadCuadratica.png)

### **Explicación resumida**

La complejidad es $O(n^2)$ (Cuadrática) debido a la presencia de dos bucles anidados. Por cada iteración del bucle externo, el interno se ejecuta completamente, resultando en $n \times n$ operaciones totales

## **2.4 Complejidad O(log n) – Logaritmica**

### **Archivo:** `ComplejidadLogaritmica.java`

### **Código del ejemplo**

![alt text](<assets/ComplejidadLogaritmica(java).png>)

### Salida del ejemplo

![alt text](assets/ComplejidadLogaritmica.png)

### **Explicación resumida**

La complejidad es $O(\log n)$ (Logarítmica). En lugar de recorrer todos los elementos, el algoritmo salta pasos multiplicando el iterador (o dividiendo el problema), lo que reduce drásticamente el número de operaciones necesarias.

## **2.5 Complejidad O(n log n) – Logaritmica**

### **Archivo:** `ComplejidadNLogN.java`

### **Código del ejemplo**

![alt text](<assets/ComplejidadNLogN(java).png>)

### Salida del ejemplo

![alt text](assets/ComplejidadNLogN.png)

### **Explicación resumida**

La complejidad es $O(n \log n)$. Se produce al combinar un bucle logarítmico (externo) con un bucle lineal (interno). Es común en algoritmos de ordenamiento eficientes como Merge Sort o Quick Sort.

# **Conclusiones**


**Martin Amaya**:
Y como conclusion, adicional a lo qie se investigo y averiguo sobre este tema, nos hizo destacar fue al implementar las clases fue visaulizar la potencia de la complejidad
Logaritmica  ($O(\log n)$)5. Resulta sorprendente ver como una pequena modificacion en la estructura del bucle. Esto permite al algoritmo evitar pasos y procesar datos masivos en una
cantidad de tiempo mmucho mas inferior a la de un enfoque lineal.
Por otra parte, se aprendio de la parte teorica que la programacion eficiente va mas alla de que un simple codigo compile sin errores. Se comprendio la importancia de realizar un analisis
utilizando la notacion Big O.Se permite predecir si el software sera escalable y soportara una carga real de usuarios antes de invertir tiempo en su desarrllo final.
Por ultimo, se avisto que la complejidad cuadratica ($O(n^2)$), se podria decir que es la menos eficiente de las anteriormente revisadas. Esto se debe a que tiene un ciclo dentro de otro.
Esto provoca que el trabajo se multiplique drasticamente. Si se duplica la cantidad de datos, el tiempo de espera incrementa exponencialmente. Esto da a entender que no es una solucion viable
para el manejo de grandes volumenes de informacion.