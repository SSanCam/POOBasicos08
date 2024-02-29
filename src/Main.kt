/**
 * Programa principal donde realizaremos las siguientes operaciones:
 *     Crear dos libros,
 *     Añadirlos al conjunto,
 *     Eliminarlos por los dos criterios (título y autor) hasta que el conjunto esté vacío,
 *     Volver a añadir un libro y mostrar el contenido final.
 */
fun main() {
    /*
    Creamos instancias de libros:
    val libro1 = Libro("El principito", "Antoine de Saint-Exupéry", 100, 9)
    val libro2 = Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 500, 8)
    val libro3 = Libro("Cien años de soledad", "Gabriel García Márquez", 400, 10)
    val libro4 = Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 300, 9)
    val libro5 = Libro("1984", "George Orwell", 250, 7)
    */

    //Creamos nuestra biblioteca:
    val conjuntolibros = ConjuntoLibros()

    //Introducimos dos libros para que no este el conjunto vacío:
    val libro4 = Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 300, 9)
    val libro5 = Libro("1984", "George Orwell", 250, 7)
    conjuntolibros.agregarLibro(libro4)
    conjuntolibros.agregarLibro(libro5)

    //Creamos dos libros:
    val libro1 = Libro("El principito", "Antoine de Saint-Exupéry", 100, 9)
    val libro2 = Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 500, 8)

    conjuntolibros.agregarLibro(libro1)
    conjuntolibros.agregarLibro((libro2))

    conjuntolibros.mostrarLibros()

    conjuntolibros.eliminarLibro()
    conjuntolibros.eliminarLibro()

    val libro3 = Libro("Cien años de soledad", "Gabriel García Márquez", 400, 10)
    conjuntolibros.agregarLibro(libro3)

    conjuntolibros.mostrarLibreria()
}