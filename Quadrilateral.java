package Assignement;

public class Quadrilateral {



    String  typeOfQuadrilateral;
  String user;

   public Quadrilateral( String type){
    typeOfQuadrilateral=type;
   }

   public Quadrilateral(){
       System.out.println("Hello Student");
   }

   public  Quadrilateral (String user , String type){
       this.user =  user;
       typeOfQuadrilateral = type;
       System.out.println("User is:  "+this.user+"   type of quadratic is:   "+this.typeOfQuadrilateral);
   }

//      overloading

    public  static int Area (int side){
        return side*side;
    }
    public int  Area (int width,int length){
        return width*length;
    }
    public int  Area (int a,int b,int h){
        return ((a+b)*h)/2;
    }
    public static void main(String[] args) {

       var q = new Quadrilateral("Square");
       var q1 = new Quadrilateral();
       var q2 = new Quadrilateral("Robert","Square");
       var q3 = new Quadrilateral("Niyitanga","Triangle");

        System.out.println("");

    }
}
