//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

abstract class animal {
    public void sound ( ){} ;
};
public class Main extends animal {
    public void sound (String name){
        System.out.println(STR."Hell i'm \{name}");
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      Main obj1=new Main();

      obj1.sound("sameer");
    };


    /* here are the all the opp concepts in one line eact:(note these are exact analogies my mind used to grasp these concepts when i was in 3rd semester)
       First:Class is a blueprint (in simple word what thing our bag has means that );
       Object : Buying that shit bag actually and puts like bottle(can be variables or properties)(latop:mehtods);
       Inheritence:What thing we'd already have when purchasing the new bag eg new bag can be made with same fibar as old so it has now the old charactertics
       but now we can also modify based on our conditions like add one more zip (method);
       Abstraction:Hding the complex things means how the zip was made ?? you're just using the zip to open and close (method)
       Encapsulation:hiding the important data from the user like how the car engine made showing the carwheel only
       polymorphism:a Man can husband , father, employee as well so one man acts different according to different people in the nutshell this is what is
       a thing can have many shapes or(in the programming means that somethinng can act different when  data types are different even thougbh that shit is smae)
       two types:--
                  |-----> method overloading(also know as the static plymorphism but not always)
                         -->  a method or block of code can have same name but with different parameter  length, data type
                  |-----> method overrding(dynamic at run time)
                        --> basically overide (in analogy let's say your mother said please bring me yougart or dahi from shop and you said okay )'
                            but your  father came a  said bring only cheese from the shop;
                            what he done he override your mother order (mean the shop is same but now you're bringing different thing);
     Abstract Class:This is the class as we've already mentioned just defines the name or knows signature of something not the actual code(might define or declare properties with value)
                            An abstract class is a basis for different subclasses that share behaviour which does
                            not need to be repeatedly created. Subclasses must complete the behaviour and have
                            the option to override predefined behaviour (as long as it is not defined as final or private).
                            -->concrete method:these are the method which have the implementation but might get overriden in sub class
                            --> if the method is define with final then they cannot be overitten;
       ---
         |
          Interface:This shit says that A class is an Inteface is it's clrealy not define the actual implementation but rather define
                    Interface is an promise we must implement what we mentioned in the interface
                    An interface is a description of the behaviour an implementing class will have. The implementing class ensures, that it will have these methods that can be used on it.
                    It is basically a contract or a promise the class has to make.
      ---> Adcvance Shit:
                        --->Coupling:oupling refers to the degree of direct knowledge one class has of another. This concept is crucial in understanding how classes interact within a system

                        --->Cohesion:Cohesion refers to how closely related and focused the responsibilities of a class or module are. High cohesion is generally preferable as it indicates that a class is designed to do a specific job

     */
}