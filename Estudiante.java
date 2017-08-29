public class Estudiante
{
    private String nombre;
    private int clave;
    
 public Estudiante(int claveIni, String nombreIni)
 {
        nombre = nombreIni;
        clave = claveIni;
  }
 /**
 * muestra los detalles clave y nombre de un alumno
 
 */
    public String dimeDetalles()
    {
        return "Clave:" + clave + "Nombre:" + nombre;
    }
 /**
 * retorna la clave la cual puede usarse en otras clases
 
 */
 public int dimeClave()
 {
        return clave;
  }
    
}
