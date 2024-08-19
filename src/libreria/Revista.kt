package libreria

class Revista(
    titulo: String,
    autor: String,
    anoPublicacion: Int,
    val numero: Int,
    val frecuencia: String
) : Publicacion(titulo, autor, anoPublicacion) {

    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Número: $numero")
        println("Frecuencia: $frecuencia")
    }
}
