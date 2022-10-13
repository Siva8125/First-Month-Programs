package Java8Features;


interface Sayable{  
    public String say();  
}  
public class lambda2{  
public static void main(String[] args) {  
    Sayable s=()->{  //no parameter
        return "I have nothing to say.";  
    };  
    System.out.println(s.say());  
}  
}  