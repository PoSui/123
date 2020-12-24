package List;

public interface MyList {
    //在指定位置添加对象
    public void add(int index,Object obj);
    //在数据结构最后位置添加对象
    public void add(Object obj);
    //删除指定位置上的对象
    public Object remove(int index);
    //修改指定位置上的数据
    public void set(int index,Object obj);
    //获取指定位置上的数据
    public Object get(int index);
    //获取当前数据结构当前的长度
    public int size();
    //清空所有的数据
    public void clear();
}