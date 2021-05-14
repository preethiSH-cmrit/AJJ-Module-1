
package com.mycompany.sample;

import java.util.ArrayList;
import java.util.List;

public class safeVarargs_demo {
   
    @SafeVarargs
    static void foo(List<String>...strLists ){ 
           Object[] arr = strLists;
           ArrayList<Integer> li=new ArrayList<Integer>();
           li.add(100);
           arr[0] = li;
           String s =strLists[0].get(0);
    }

    public safeVarargs_demo() {
       List<String> a = new ArrayList<String>();
       List<String> b = new ArrayList<String>();
       foo(a,b);  
           }
}
 
