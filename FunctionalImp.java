@FunctionalInterface
  
interface Square { 

    int calculate(int z); 

    int calculate(int y); 

} 
  
class Test { 
    public static void main(String args[]) 
    { 
        int a = 5; 
  
        // lambda expression to define the calculate method 

        Square s = (int z) -> z * z; 

        Square s = (int y) -> y * y; 

  
        // parameter passed and return type must be 
        // same as defined in the prototype 
        int ans = s.calculate(a); 
        System.out.println(ans); 
    } 
}
