public class StaticTest extends Base{
    static{
        System.out.println("StaticTest static");
    }
    {
        System.out.println("StaticTest  匿名代码块");
    }

    public  StaticTest(){
        System.out.println("StaticTest  constructor");
    }



    public  static  void  main(String[]  args)  {
        new  StaticTest();
        new  StaticTest();
    }
}

class Base{
    static{
        System.out.println("base  static");
    }
    {

        System.out.println("Base 匿名代码块");
    }
    public  Base(){
        System.out.println("base  constructor");
    }
}


