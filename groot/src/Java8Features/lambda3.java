package Java8Features;

interface Sayable{  
    public String say(String name);  
}  
  
public class lambda3{  
    public static void main(String[] args) {  
      
        // Lambda expression with single parameter.  
        Sayable s1=(name)->{  //with single parameter as name
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("Sonoo"));  
          
        // You can omit function parentheses    
        Sayable s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Sonoo"));  
    }  
}  
