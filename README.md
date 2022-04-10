# TALLER 2 - ABSTRACCIONES, INTERFACES Y POLIMORFISMO

## INTRODUCCION

Este proyecto tiene como finalidad cumplir con los requisitos mínimos exigidos para la entrega del segundo taller (Manejo de Abstracciones, interfaces y polimorfismo), en el cual se llevó a cabo la interpretación de un tema principal dato por la documentación (Naves espaciales), con la finalidad de extraer información relevante que permitiera el cumplimiento de los siguientes requisitos:

1.  Realizar una extracción de atributos genéricos abstractos e interfaces, que puedas identificar en el artículo. Crear las interfaces y clases abstractas que creas convenientes según la lectura.

2. Crear al menos dos comportamientos abstractos de una nave.

3. Crear al menos cuatro tipos de naves diferentes con diferentes comportamientos, si es posible hacer una sobrecarga y una sobre escritura de métodos.

4. Crear una clase principal que permita crear las naves de forma tal este bajo una condición booleana o por medio de una regla estipulada dentro de un switch-case o if-else.

5. El programa debe tener una ejecución infinita, hasta que el usuario no diga que quiere terminar el programa, este no deberá culminar.

## DESCRIPCION

A partir de la interpretación del texto, se decidió implementar un sistema que simule las funciones de una fábrica de naves espaciales, la cual brinda al usuario una interfaz por medio de la que se le solicita información relacionada con detalles de relevancia para el proceso de fabricación de la nave.

La fábrica cuenta en su catálogo con una variedad de 4 tipos de naves, que son:

- Shuttleship (lanzadera)
- UnmannedSpacecraft (no tripulada)
- MannedSpacecraft (tripulada)
- MixedSpacecraft (lanzadera tripulada)

Cabe resaltar que, al finalizar el proceso, se le muestra al usuario la información relacionada a las especificaciones que tendrá su nave según lo datos que suministro.

## TEMAS

En el presente proyecto se elaboraron 5 clases de la cuales 1 es abstracta y 3 interfaces. En estas se abordan algunos temas de la programación orientada a objetos, tales como:

- Clases
- Objetos
- Atributos
- Métodos
- Modificadores de acceso
- Método constructor
- Abstracciones
- interfaces
- polimorfismo, etc.

### Clases Implementadas
- Main (Clase Main)
- Spaceship (Clase Abstracta)
- Shuttleship
- UnmannedSpacecraft
- MannedSpacecraft
- MixedSpacecraft

### Interfaces Implementadas
- IShuttleShip
- IUnmannedSpacecraft
- IMannedSpacecraft

Finalmente, la totalidad de las clases se encuentran en el package ***edu.rusbellruiz.quarrylevel2workshop2*** .
