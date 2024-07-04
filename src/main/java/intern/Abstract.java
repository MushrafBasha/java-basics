package intern;

 abstract class Abst {
    public void day6(){
        System.out.println("the internship session very useful");
    }
            abstract void newbustand();
            abstract void oldbustand();
}

 class time  extends Abst{

     @Override
     void newbustand() {

     }

     @Override
     void oldbustand() {

     }

//       public void day6(){
//          System.out.println("Today session My SQL");
//     }
 }

 public class Abstract{
     public static void main(String[]args){
         time obj =new time();
         obj.day6();
     }

        }
