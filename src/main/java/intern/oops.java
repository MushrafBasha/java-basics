package intern;
class internship{
    public void bharathi()
    {
        String name= "bharathi";
        int rollno = 22057;
        System.out.println("name:"+name+"\n rollno:"+rollno);
    }
}class internship2 extends internship {
    public void mushraf(){
        String name = "mushraf";
        int rollno = 22114;
        System.out.println( name + rollno);
    }
}
public class oops {
    public static void main(String[] args){
        //System.out.println("name: mushraf, rollno: 22CS114");
        internship2 obj= new internship2();
        obj.mushraf();
        obj.bharathi();
    }
}
