
package com.mycompany.sample;

public class typeWrapperDemo {
    
    public typeWrapperDemo(){
        
        Integer iob = new Integer(4);
        //since jdk9
        Integer iob2 = Integer.valueOf(4);
        System.out.println("using constructor iob:"+iob);
        System.out.println("using valueOf iob:"+iob2);
        
        int i = iob.intValue(); //  to objtain the primitive data type value
        byte b = iob.byteValue();
        long l  = iob.longValue();
        
        
        Integer ig = 10; // autoboxing
        int it = ig; //auto unboxing
        
        
       
    }
          
}
