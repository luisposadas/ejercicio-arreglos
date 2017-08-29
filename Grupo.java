
public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    public Grupo(int totalEstudiantes,String nomMateria)
{
    estudiantes = new Estudiante[totalEstudiantes];
    this.nomMateria = nomMateria;
}
/**
 * da de baja a un alumno
 * regresa verdadero o falso si se pudo o no dar de baja
 */
public boolean darDeBaja(int claveBaja)
{
    int i;
    for(i=0; i<estudiantes.length;i++)
    if(estudiantes[i].dimeClave() == claveBaja)
    {
        estudiantes[i]=null;
        return true;
    }
    return false;
    
}
/**
 * busca un espacio disp
 * regresa la poc nula en el arr en caso contrario regresa -1
 */
private int buscaEspacioDisponible()
{
    int i;
    for(i=0;i<estudiantes.length;i++){
        if (estudiantes[1] == null){
            return i;
        }
        
    }
    return -1;
    
}
/**
 * inscreibe un estudiante
 * regresa verdadero o falso si se pudo o no inscribir
 */
public boolean inscribir(Estudiante unEstudiante)
{
    int existe = this.buscarEstudiante(unEstudiante.dimeClave());
    if(existe != -1){
        return false;
    }
    int posDisponible = this.buscaEspacioDisponible();

   if(posDisponible == -1){
       return false;
    }
    estudiantes[posDisponible] = unEstudiante;
    return true;
    
    
     
    
}
/**
 * busca un estudiante por medio de su clave
 * y lo regresa el num. en el que se encuentra, si no lo encuentra regresa -1
 */
public int buscarEstudiante(int claveEstudiante)
{
    for(int i=0;i<estudiantes.length; i++)
    {
        if(estudiantes[i].dimeClave() == claveEstudiante){
            return i;
        }
    }
    return -1;
}
}