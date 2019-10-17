
package javabasics;

public class JavaBasics {

    public static void main(String[] args)
    {
        outer obj = new outer();
        obj.show();
        
        outer.inner obj1 = obj.new inner();
        obj1.display();
    }
    
}

class outer 
{
    int a;
    public void show()
    {
        System.out.println("in Show");
    }
    
    class inner                                 // static inner class{}  **** is also alowed 
    {                                           // for calling static method outer.inner.method is used 
         public void display()
         {
             System.out.println("in Display");
         }
    }
    
}
