// Esta clase define el "molde" para crear los objetos de tipo estudiante
public class Estudiante {

        // 1. Declaración de atributos (características del estudiante)
        private final String nombre;
        private final String matricula;
        private double promedio;

        // 2. Constructor: Se ejecuta al instanciar el objeto para inicializar sus datos
        public Estudiante(String nombre, String matricula, double promedio) {
            this.nombre = nombre;
            this.matricula = matricula;
            this.promedio = promedio;
        }

        // 3. Metodos: Acciones que puede realizar el objeto
        // Metodo para imprimir los datos del estudiante en consola
        public void mostrarDetalles() {
            System.out.println("Nombre: " + nombre + " | Matrícula: " + matricula + " | Promedio: " + promedio);
        }

        // Método para modificar un atributo específico
        public void actualizarPromedio(double nuevoPromedio) {
            this.promedio = nuevoPromedio;
            System.out.println("El promedio de " + this.nombre + " ha sido actualizado a: " + this.promedio);
        }
    }
