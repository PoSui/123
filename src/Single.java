public class Single {
    private static Single instance = new Single();

    //让构造函数为 private，这样该类就不会被实例化
    private Single(){}

    //获取唯一可用的对象
    public static Single getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
