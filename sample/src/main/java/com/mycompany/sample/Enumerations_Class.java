package com.mycompany.sample;
enum Subjects{
            SSC(4), CGV(4), WTA(4), AJJ(), MAD(2);
            private int credits;
	
            Subjects(int c){
                credits = c;
            }
            //overloading constructors
            Subjects()  {credits=0;}
            int getCredits(){
                return credits;
            }
}

public class Enumerations_Class {
    
    public Enumerations_Class(){
             // calling a method
            System.out.println(Subjects.AJJ.getCredits());

       Subjects[] sjs = Subjects.values();
       int totalCredits=0;
       System.out.println("Subject: Credits");
       for (Subjects s: sjs){
           System.out.println(s+":"+s.getCredits());
           totalCredits+=s.getCredits();
       }
       System.out.println("Total credits: "+totalCredits);

    }
}

