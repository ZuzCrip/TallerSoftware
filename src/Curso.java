public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;

    private java.util.Collection estudiantesEnEesperaDeInscripcion = new java.util.ArrayList<>();

    private Profesor responsable;

    private java.util.Collection foros = new java.util.ArrayList<>();

    private java.util.Collection estudianteEscritos = new java.util.ArrayList<>();

    private java.util.Collection actividadesSumativas = new java.util.ArrayList<>();
}   
