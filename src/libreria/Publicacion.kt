package libreria

open class Publicacion(
    val titulo: String,
    val autor: String,
    val anoPublicacion: Int
) {
    open fun mostrarDetalles() {
        println("Título: $titulo")
        println("Autor: $autor")
        println("Año de Publicación: $anoPublicacion")
    }
}
