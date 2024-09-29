class Main
{
      public static void main(String[] args)
      {
            Vino tinto = new Vino("Chimuelo", 
            "a.c 320", 
            "Tinto", 
            15, 
            50, 
            27, 
            150, 
            "Harry's Vinos");
            System.out.println(tinto);

            System.out.println("Clase de Suministrador- ");
            Suministrador Harry = new Suministrador("Harry's Vinos", 
            "Argentina", 
            18);
            System.out.println(Harry);
      }
// cambios realizados


}