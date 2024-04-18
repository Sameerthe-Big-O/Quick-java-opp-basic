abstract class animal {
    public void sound ( ){} ;
};

public  class lion extends Abstract {
    public void sound ( ) {
        System.out.println ("roar" );
    }
    public static void main ( String args[] ) {
        animal obj = new lion ( );
        obj. sound ();
    }
}
