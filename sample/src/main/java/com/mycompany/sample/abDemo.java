
package com.mycompany.sample;

public class abDemo {
    
    //constructor
    public abDemo(){
         Integer ix = 4; // autoboxing
         Integer iy = foo(ix); // autoboxing
         System.out.println(ix+" "+iy);
         
         /* Autoboxing and autounboxing in Expressions */
         Integer a = 5;  // autoboxing of 5 into Integer.
         Double b =4.5; //autoboxing of 4.5 to Double
         Double c;
         c = a+(b/5);// a gets unboxed to int, b gets unboxed to double.
         // result will get autoboxed to Double
         System.out.println("using Type Wrappers"+c);
         System.out.println("Using primitives"+(5+(4.5/5)));
         
         //conditionals
         boolean flag = true; // primitive data type
         Boolean bflag = true; // type wrapper
         if (flag){
             System.out.println("flag is set to true");
         }
         if(bflag){ // auto unboxing
             System.out.println("Flag (type wrapper) is set to true");
         }
         while(bflag){ // auto unboxing
             //do something
             System.out.println("bflag is true");
             bflag=false;
             if(!bflag) break;
         }
         
         //Character
         Character ch = 'Z'; //autoboxing of literal character 'Z' 
         //to type wrapper Character
         char cr = ch.charValue(); // manual unboxing.
         cr = ch; // auto unboxing.
         
         
    }
    public int foo(int x){ // auto-unboxing
        x++;
        return x;
    }
}
