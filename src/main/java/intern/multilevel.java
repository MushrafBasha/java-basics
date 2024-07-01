package intern;
class intern{
    public void bharathi()
    {
        String name= "bharathi";
        int rollno = 22057;
        System.out.println("name:"+name+"\n rollno:"+rollno);
    }
}
class intern2 extends intern{
    public void mushraf(){
        String name = "mushraf";
        int rollno = 22114;
        System.out.println("name:"+name+"\n rollno:"+rollno);
    }
}
class intern3 extends intern2{
    public void gokul(){
        String name = "gokul";
        int rollno = 22076;
        System.out.println("name:"+name+"\n rollno:"+rollno);
    }
}
public class multilevel {
    public static void main(String[] args){
        intern3 obj=new intern3();
        obj.bharathi();
        obj.mushraf();
        obj.gokul();
    }
}
