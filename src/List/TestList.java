package List;



import java.util.Arrays;


public class TestList implements MyList {
    private int length=0;
    private int size=10;

    Object[] objects= new Object[size];
    @Override
    public void add(int index, Object obj) {
        if(objects[index]!=null) {
            this.objects[index] = obj;
        }else {
            if(index>=size) {
                Arrays.copyOf(objects,size << (index/size));
            }   this.objects[index] = obj;
                length++;
        }
    }

    @Override
    public void add(Object obj) {
        if((length-1)>=size) {
            Arrays.copyOf(objects,size << 1);
        }    this.objects[length] = obj;
        length++;
    }


    @Override
    public Object remove(int index) {
        Object obj = new Object();
        if(index<length) {
            obj=objects[index];
            objects[index]=null;
        while(index<length-1) {
            objects[index] = objects[index+1];
            index++;
        }
        }else {
            System.out.println("数据不存在");
        }
        return obj;
    }

    @Override
    public void set(int index, Object obj) {
        Object obj1;
        if(index<size && objects[index]!=null) {
            obj1=objects[index];
            this.objects[index] = obj;
            System.out.println("旧元素为:"+obj1);
        }else if(index>=size) {
//               objects= Arrays.copyOf(objects,size << (index/size));
//                objects[index] = obj;
//                length++;
            System.out.println("数组太小，不能插入");
        }

    }

    @Override
    public Object get(int index) {
        if(index>=size) {
            System.out.println("空值");
        }
        return objects[index];
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public void clear() {
        length=0;
        for(int i=0;i<objects.length;i++){
            objects[i]=null;
        }
        }



    @Override
    public String toString() {
        for(int i=0;i<objects.length;i++){
            System.out.print(objects[i]+",");
        }
        System.out.println();
        return "1";
    }

    public static void main(String[] args) {
        TestList tl=new TestList();
        System.out.println(tl.size());
        tl.toString();
        tl.add(1);
        tl.add(10);
        tl.add(9,9);
        tl.add(10);
        tl.add(1);
        tl.add(1);
        tl.add(1);
        tl.set(14,13);
        System.out.println(tl.remove(2));
        System.out.println(tl.get(4));
        tl.toString();
        tl.clear();
        tl.toString();
    }


}
