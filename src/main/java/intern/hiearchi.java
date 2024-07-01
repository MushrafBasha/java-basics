package intern;
class lib1{
    public void bharathi()
    {
        String name= "bharathi";
        int rollno = 22057;
        System.out.println("name:"+name+"\n rollno:"+rollno);
    }
}
class lib2 extends lib1{
    public void mushraf()
    {
        String name = "mushraf";
        int rollno = 22114;
        System.out.println("name:"+name+"\n rollno:"+rollno);
    }
}
class lib3 extends lib1{
    public void gokul(){
        String name = "gokul";
        int rollno = 22076;
        System.out.println("name:"+name+"\n rollno:"+rollno);
    }
}

public class hiearchi {
    public static void main(String[] args){
        lib2 obj=new lib2();
        obj.bharathi();
        obj.mushraf();
    }
}
