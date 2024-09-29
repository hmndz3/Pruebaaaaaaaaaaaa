public class Suministrador 
{
    private String nombre;  
    private String pais;
    private int tiempodeentrega;
    // adadadadadadadadadad
//-------------------------------------------------------------------------------------------------------
    public Suministrador(String nombre, String pais, int tiempodeentrega)
    {
        //sdfsdfsdfsdfsdfsdfsdfsdf
        this.nombre = nombre;
        this.pais = pais;
        this.tiempodeentrega = tiempodeentrega;
    }
    //-------------------------------------------------------------------------------------------------------
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    //-------------------------------------------------------------------------------------------------------
    public void setPais(String pais)
    {
        this.pais = pais;
    }
    public String getPais()
    {
        return pais;
    }
    //-------------------------------------------------------------------------------------------------------
    public void setTiempodeentrega(int tiempodeentrega)
    {
        this.tiempodeentrega = tiempodeentrega;
    }
    public int getTiempodeentrega()
    {
        return tiempodeentrega;
    }
    //-------------------------------------------------------------------------------------------------------
    public String toString ()
    {
        return "Nombre:" + this.nombre + "\n"
        + "Pais: " + this.pais + "\n"
        + "Tiempo de Entrega (Dias): " + this.tiempodeentrega + "\n";
    }
}
