/**
 * Clase Libro
 *
 * @property titulo String Nos india el título del libro.
 * @property autor String Indica el autor de dicho libro.
 * @property paginas Int Indica el número total del libro.
 * @property calificacion Int La calificación que le daremos al libro.
 */
class Libro(titulo: String, autor: String, paginas: Int, calificacion: Int) {

    var titulo = titulo
        set(value) {
            require(titulo.isNotBlank()) { "Éste campo debe estar relleno." }
            field = value
        }
    var autor = autor
        set(value) {
            require(autor.isNotBlank()) { "Éste campo debe estar relleno." }
            field = value
        }

    // Nos aseguramos que el número de páginas sea mayor a 0.
    var paginas: Int = paginas
        set(value) {
            require(paginas > 0) { "Cualquier libro debe contener un número de páginas mayor de 0." }
            field = value
        }

    // Nos aseguramos que el valor que demos a la calificación esté en el rango de 0 a 10.
    var calificacion: Int = calificacion
        set(value) {
            require(value in 0..10) { "La calificación del libro debe estar entre 0 y 10." }
            field = value
        }
}