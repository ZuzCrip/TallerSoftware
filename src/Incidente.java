import java.util.List;
import java.time.LocalDateTime;

public class Incidente {
    protected int id;
    protected LocalDateTime fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List<String> log_actualizaciones;
    protected LocalDateTime fecha_cerrado;
    protected String tipo;

    protected Usuario responsable;

    protected PersonalAcademico beneficiario;
}