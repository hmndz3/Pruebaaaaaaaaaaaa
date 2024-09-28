class Vino
{ 
    private String nombre;  
    private String cosecha; 
    private String tipo; 
    private int disponibilidadMin; 
    private int disponibilidadMax; 
    private int disponibilidadReal; 
    private int ventas; 
    private String suministrador; 
    //----------------------------------------------------------------------------------
    public Vino(String nombre, String cosecha, String tipo, int disponibilidadMin, int disponibilidadMax, int disponibilidadReal, int ventas, String suministrador) 
    {
        this.nombre = nombre;
        this.cosecha = cosecha;
        this.tipo = tipo;
        this.disponibilidadMin = disponibilidadMin;
        this.disponibilidadMax = disponibilidadMax;
        this.disponibilidadReal = disponibilidadReal;
        this.ventas = ventas;
        this.suministrador = suministrador;
    }
    //----------------------------------------------------------------------------------
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    //----------------------------------------------------------------------------------
    public void setCosecha(String cosecha)
    {
        this.cosecha = cosecha;
    }
    public String getCosecha()
    {
        return cosecha;
    }
    //----------------------------------------------------------------------------------
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    public String getTipo()
    {
        return tipo;
    }
    //----------------------------------------------------------------------------------
    public void setDisponibilidadMin(int disponibilidadMin)
    {
        this.disponibilidadMin = disponibilidadMin;
    }
    public int getDisponibilidadMin()
    {
        return disponibilidadMin;
    }
    //----------------------------------------------------------------------------------
    public void setDisponibilidadMax(int disponibilidadMax)
    {
        this.disponibilidadMax = disponibilidadMax;
    }
    public int getDisponibilidadMax()
    {
        return disponibilidadMax;
    }
    //----------------------------------------------------------------------------------
    public void setDisponibilidadReal(int disponibilidadReal)
    {
        this.disponibilidadReal = disponibilidadReal;
    }
    public int getDisponibilidaReal()
    {
        return disponibilidadReal;
    }
    //----------------------------------------------------------------------------------
    public void setVentas(int ventas)
    {
        this.ventas = ventas;
    }
    public int getVentas()
    {
        return ventas;
    }
    //----------------------------------------------------------------------------------
    public void setSuministrador(String suministrador)
    {
        this.suministrador = suministrador;
    }
    public String getSuministrador()
    {
        return suministrador;
    }
    //----------------------------------------------------------------------------------
    public String toString ()
    {
        return "Nombre:" + this.nombre + "\n"
        + "Cosecha: " + this.cosecha + "\n"
        + "Tipo: " + this.tipo + "\n"
        + "Disponibilidad Min: " + this.disponibilidadMin + "\n"
        + "Disponibilidad Max: " + this.disponibilidadMax + "\n"
        + "Disponibilidad Real: " + this.disponibilidadReal + "\n"
        + "Ventas: " + this.ventas + "\n"
        + "Suministrador: " + this.suministrador + "\n";
    }
} 