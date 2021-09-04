class Ola
{
  void ride()
  {
    System.out.println("cabs: mini,micro,sedan");
    }
    }

    class Ola_v1 extends Ola
    {
      void ride()
      {
        System.out.println("cabs: mini,micro,sedan,luxury and autos");
	}
	}

	class Belavanaki
	{
	  public static void main(String[] args)
	  {
	    Ola_v1 o1=new Ola_v1();
	    o1.ride();
	    }
	    }