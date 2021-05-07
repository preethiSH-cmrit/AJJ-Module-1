package com.mycompany.sample;

public class Enumerations {
    enum Subjects {
            SSC, CGV, WTA, AJJ, MAD   
        }
    enum Elective {
        AJJ,CCA
    }
    public Enumerations(){
        Subjects sub;
        sub = Subjects.AJJ;
       /* Operations On Enumeratios */
        if (sub == Subjects.AJJ)
            System.out.println(Subjects.AJJ);        
       /* Switch case */
        switch(sub){
            case AJJ:
                System.out.println("Advanced Java");
                break;
            case SSC:
                System.out.println("System Software and Compilers");
                break;
        }     
        /* values() and valueOf() */
        Subjects[] subArr = Subjects.values();
        for (Subjects s: subArr)
            System.out.println(s);
        
        Subjects cgv = Subjects.valueOf("CGV");
        System.out.println(cgv);
        
        /* Ordinal Values */
       
       System.out.println("Ordinal Values");
       for (Subjects s: Subjects.values()){
           System.out.println(s+":"+s.ordinal());
       }

       /* Compare To */
       Subjects sj, sj2, sj3;
        sj = Subjects.SSC;
        sj2 = Subjects.AJJ;
        sj3 = Subjects.MAD;
        System.out.println("comparing SSC with AJJ: "+sj.compareTo(sj2));
        if (sj.compareTo(sj2)<0)
            System.out.println(sj+" comes before "+sj2);
        else if (sj.compareTo(sj2)>0)
            System.out.println(sj+" comes after "+sj2);
        else
            System.out.println(sj+ "equals" + sj2); 

        //equals
        Subjects sj4 = Subjects.SSC;
        if (sj==sj4){
            System.out.println("sj and sj2 are the same");
        }
        Elective e = Elective.AJJ;
        boolean b = e.equals(sj2);
        System.out.println("Is Elective.AJJ and Subjects.AJJ same?"+b);
        
        boolean sjEsj4 = sj.equals(sj4);
        System.out.println("Is sj and sj4 same(using equals)?"+sjEsj4);
        

    }
}
