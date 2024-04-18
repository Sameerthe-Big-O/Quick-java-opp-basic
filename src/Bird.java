public class Bird {
    public void sound ( ) {
        System.out.println( "birds sounds");
    };
};
class pigeon extends Bird {
        public void sound ( ) {
            System.out.println( "cooing" ) ;
        }
    };

class sparrow extends Bird  {
        public void sound(){
            System.out.println( "chip") ;
        };
    };