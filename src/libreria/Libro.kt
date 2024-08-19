package libreria

class Libro(
    titulo: String,
    autor: String,
    anoPublicacion: Int,
    val isbn: String,
    val numPaginas: Int
) : Publicacion(titulo, autor, anoPublicacion) {

    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("ISBN: $isbn")
        println("Número de Páginas: $numPaginas")
    }
}
