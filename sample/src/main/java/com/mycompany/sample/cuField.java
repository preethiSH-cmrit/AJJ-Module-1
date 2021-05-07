package com.mycompany.sample;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface myAnno{
    String str();
    int val();
}
@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String desc();
}
public class cuField {
    @What(desc="holds instance variable x")
    @myAnno(str="private field", val=5)
    public int x;
    
    public cuField() {
        try{
            Class c = this.getClass();
            Field f = c.getField("x");
            Annotation[] ans = f.getAnnotations();
            for (Annotation a : ans)
                System.out.println(a);       
        }catch(NoSuchFieldException fe){
            System.out.println(fe);
        }
    }  
}
