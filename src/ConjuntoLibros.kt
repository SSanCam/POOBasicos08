/**
 * Clase Conjunto libros
 *
 */
open class ConjuntoLibros() {
    //Creamos nuestra biblioteca vacía
    private val libros: MutableMap<String, Libro> = mutableMapOf()

    init {
        require(libros.size <= CAPACIDAD_MAXIMA) { "El número de libros excede la capacidad máxima." }
    }

    //Indicamos la capacidad máxima de nuestra biblioteca.
    companion object {
        const val CAPACIDAD_MAXIMA = 10 // Le damos al Array una capacidad máxima de libros que puede contener.
    }

    /**
     * Agregar libro
     * @param libro Libro Recibimos una instancia de libro y, si hay espacio en el Array, lo agregamos a la lista.
     */
    fun agregarLibro(libro: Libro) {
        if (libros.size < CAPACIDAD_MAXIMA) {
            libros[libro.titulo] = libro
            println("El libro \'${libro.titulo}\' se ha agregado correctamente.")
        } else {
            println("No hay espacio disponible para otro libro.")
        }

    }

    /**
     * Eliminar libro
     * Podemos eliminar un libro por su Título o su Autor.
     *
     */
    fun eliminarLibro() {
        println("Quieres eliminar un libro por [T]ítulo o [A]utor? ")
        val opcion = readln().lowercase()
        when (opcion) {
            "t" -> {
                println("Introduce el título del libro: ")
                val titulo = readln()
                if (libros.containsKey(titulo)) {
                    libros.remove(titulo)
                    println("Libro: \'$titulo\' eliminado correctamente.")
                }
            }

            "a" -> {
                println("Introduce el nombre del autor: ")
                val autor = readln()
                if (libros.containsKey(autor)) {
                    libros.remove(autor)
                    println("Libro del autor: \'$autor\' eliminado correctamente.")
                }
            }

            else -> {
                println("No se ha encontrado el libro.")
            }
        }
    }

    /**
     * Mostrar libros
     * Devuelve la información de los libros, ordenados < según calificación.
     */
    fun mostrarLibros() {
        if (libros.isNotEmpty()) {
            println("Libros en la biblioteca:")
            libros.forEach { (titulo, libro) ->
                println("Titulo: $titulo - Autor: ${libro.autor} - Páginas: ${libro.paginas} - Calificación: ${libro.calificacion}.")
            }
        } else {
            println("No hay libros en la lista.")
        }
    }

    /**
     * Mostrar libreria
     * Muestra los libros que se encuentran guardados.
     */
    fun mostrarLibreria() {
        libros.forEach { (titulo, libro) ->
            val autor = libro.autor
            val paginas = libro.paginas
            val calificacion = libro.calificacion

            println("En la libreria se encuentra:\n \'$titulo\' , escrito por: \'$autor\'. Tiene $paginas páginas. Ha sido valorado con una calificación de: $calificacion")
            println()
        }
    }
}