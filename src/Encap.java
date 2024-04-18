public class Encap {
    private int age;
//getter method
    public int getage ( ) {
        return age;
    }
    //setter method
    public void setAge ( int age ) {
        this.age = age;
    }
};

public class Main {
    public static void main (String args []){
    //create an object of person
    Animal a1= new Animal ();
     //change age using setter
     a1.setAge (12);
     // access age using getter
    System.out.println("animal age is"+ a1.getage ( ) );
}
}
