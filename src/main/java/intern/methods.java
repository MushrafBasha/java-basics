package intern;

public class methods {

    public void intern()
    {
        System.out.println("without return type without arguments");
    }
    public void intern2(String name,int age ){
        System.out.println("name :"+name+"\nage:"+age);
    }
    public void intern3(){
        System.out.println("with return");

    }

    public static void main(String[]args){
        methods obj=new methods();
        obj.intern();
        obj.intern2("mushraf",20);

    }

}
