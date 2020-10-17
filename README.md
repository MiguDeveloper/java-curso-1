# Curso de basico a avanzado JAVA

### Variables
- Son lo más importante de un lenguaje, son las entidades, contienen valores o datos.
- Una declaración de variable siempre contiene dos partes: el tipo de dato y su nombre por ejemplo: ``` TipoDeDato nombreVariable; ```
- El tipo de dato de la variable determina los valores que la variable puede contener y las operaciones aque se pueden realizar con ella.
- Desde la version 10 se pueden usar las variables de tipo dinámico con la palabra reservada ```var```

#### Categorias de tipo
Existen dos tipos de datos principales:  primitivos y referencia
- Primitivos: contienen un solo valor e incluyen los tipos como los enteros, flotante, los caracteres, booleanos, etc.

> los boolean es primitivo de un solo bit (true o false), 
> el char es un carácter de 16 bits y va con comilla simple char a = 'a'
> el entero son de 4 tipos y no tienen precisión: byte, shot, int y long
> byte entero muy pequeño, short: entero pequeño
> int y long: entero y entero grande son de 32 y 64 bits respectivamente
> los reales pueden ser: float o de doble precisión: double

- Referencia: tenemos los arreglos, las clases y las interfaces

#### Buenas practicas en nombres de variables
- Usar camelcase para nombrarlas.
- Juego de caracteres unicode.
- Ser descriptivo

### Modificadores de acceso

- public: indica que el método se puede acceder desde cualquier parte de la aplicación
- private: el método solo puede ser accedido desde la clase
- protected:
  