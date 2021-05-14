package com.mycompany.sample;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class annotationsDemo{
    
    // declaring an annotation
    
    @Retention(RetentionPolicy.RUNTIME) // the default is RetentionPolicy.CLASS
    //RUNTIME - allows for Reflection - obtain the values during runtime.
   
    @interface myAnno{ // Marker Annotation
        String str()default "Testing";
        int val() default 0;
    }  
    //@myAnno()  // no values are set, but with paranthesis
    //@myAnno(str="foo") //with only str() field set
    //@myAnno(val=10) // with only val() field set.
    // myAnno gets linked to the method foo
    //@myAnno(str="foo", val=100) // annotating the method foo()
    
    @myAnno(str = "hello")
    //@myAnno()
  // can only be applied on static or final methods
    private static void m(List... stringLists) {
      for (List st : stringLists) {  
            System.out.println(st);  
        }  
 }
 
    public static void foo(){}
    
    public annotationsDemo(){
        List myList = new ArrayList();
        myList.add(4);
        System.out.println(myList);
        ArrayList list = new ArrayList();  
        list.add("Laptop");  
        list.add("Tablet");  
        this.m(list, list);  
        try{
             Class c = this.getClass();
             Method m = c.getMethod("foo");
             myAnno an = m.getAnnotation(myAnno.class);
//            System.out.println(an.str()+ " "+an.val());
            boolean b= m.isAnnotationPresent(myAnno.class);
            if(b)
             System.out.println("my Anno is present");
            else
                System.out.println("myAnno not present");
             //System.out.println(a.s+" "+a.val());
                
        }catch(NoSuchMethodException e){e.printStackTrace();} 
    }   
}       

   
