
public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    public Grupo(int totalEstudiantes,String nomMateria)
{
    estudiantes = new Estudiante[totalEstudiantes];
    this.nomMateria = nomMateria;
}
public void inscribir(Estudiante unEstudiante)
    {
        int i;
        for(i=0;i<estudiantes.length; i++){
            if(estudiantes[i] == null){
            estudiantes[i] = unEstudiante;
        }
    }
        
    }
public void darDeBaja(int claveEstudiante)
{
    
}
}