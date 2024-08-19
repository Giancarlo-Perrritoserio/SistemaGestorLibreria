package libreria

fun main() {
    val libro1 = Libro(
        titulo = "1984",
        autor = "George Orwell",
        anoPublicacion = 1949,
        isbn = "978-0451524935",
        numPaginas = 328
    )

    val revista1 = Revista(
        titulo = "National Geographic",
        autor = "Varios",
        anoPublicacion = 2024,
        numero = 759,
        frecuencia = "Mensual"
    )

    println("Detalles del Libro:")
    libro1.mostrarDetalles()

    println("\nDetalles de la Revista:")
    revista1.mostrarDetalles()
}
