package co.edu.uniquindio.punto3;

import co.edu.uniquindio.punto1.GeneroPersona;
import co.edu.uniquindio.punto1.Persona;

public class Estudiante extends Persona
{
    private String matricula;

    public Estudiante(String nombre, int edad, GeneroPersona genero, String matricula)
    {
        super(nombre, edad, genero);
        this.matricula = matricula;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }
}