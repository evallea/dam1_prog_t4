package paquete1;

class Profesor {

    private String nombreProfesor;
    protected int edadProfesor;
    Alumno hijo;

    public void visNombreProfesor() {
        // Podemos usar "edadAlumno" porque es protected, pero no "nombreAlumno", porque es private.
        int edadAlumno = hijo.edadAlumno;
    }

    void visEdadProfesor() {
        // Dar contenido.
    }
}
