package com.mycompany.sample;

import java.lang.annotation.*;
import java.lang.reflect.*;

class annotationsDemo{
    
    // declaring an annotation
    @Retention(RetentionPolicy.RUNTIME) // the default is RetentionPolicy.CLASS
    //RUNTIME - allows for Reflection - obtain the values during runtime.
    @interface myAnno{
        String str();
        int val();
    }
    @Retention(RetentionPolicy.RUNTIME)
    @interface purposeAnno{
        String str();  
    }
    @purposeAnno(str="to test out reflection of multiple annotations")
    @myAnno(str="Testing", val=100) // annotating the method foo()
    // myAnno gets linked to the method foo
    public void foo(){}
    public annotationsDemo(){
        try{
             Annotation[] ans= this.getClass().getMethod("foo").getAnnotations();
             for (Annotation a : ans)
                 System.out.println(a);
        }catch(NoSuchMethodException e){e.printStackTrace();}
        /*
        //Class c = this.getClass(); 
         // obtains a reference to the class from "this" object
         
          // obtaining annotation during run time
          /*
         Method m = c.getMethod("foo");
         myAnno ma = m.getAnnotation(myAnno.class);
         System.out.println(ma.str()+" "+ma.val());
         // obtaining a reference to the method "foo" in class c(annotationsDemo)
         
         
         
         }catch(NoSuchMethodException e){
             e.printStackTrace();
         }
*/
    
    }   
}       

   
