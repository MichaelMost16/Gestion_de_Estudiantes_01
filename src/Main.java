// Clase principal donde se ejecuta la aplicación //
void main() {

    IO.println("--- SISTEMA DE GESTIÓN DE ESTUDIANTES ---");

    // 4. Instanciación de objetos usando el constructor
    Estudiante estudiante1 = new Estudiante("Ana López", "A100123", 9.5);
    Estudiante estudiante2 = new Estudiante("Carlos Rivera", "A100124", 8.2);
    Estudiante estudiante3 = new Estudiante("Brandon Mata", "A107653", 9.5);

    // 5. Uso de los métodos de cada objeto
    IO.println("\nRegistros iniciales:");
    estudiante1.mostrarDetalles();
    estudiante2.mostrarDetalles();
    estudiante3.mostrarDetalles();

    IO.println("\nActualizando datos...");
    estudiante2.actualizarPromedio(8.9);

    IO.println("\nRegistros finales:");
    estudiante1.mostrarDetalles();
    estudiante2.mostrarDetalles();
    estudiante3.mostrarDetalles();
}