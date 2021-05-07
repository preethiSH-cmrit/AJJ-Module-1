
package com.mycompany.sample;
enum Compass {
    EAST,WEST,NORTH,SOUTH;
}
public class enumerations_compass {
    public enumerations_compass() { 
       Compass cs = Compass.NORTH;
       System.out.println(cs);
       cs = Compass.SOUTH;
       switch(cs){
           case EAST:
               System.out.println("Eastward bound");
               break;
           case WEST:
               System.out.println("Westward bound");
               break;
           case NORTH:
               System.out.println("Heading North");
               break;
           case SOUTH:
               System.out.println("Going South");
       }
       System.out.println("All Directions");
       Compass[] directions = Compass.values();
       for (Compass c: directions){
           System.out.println(c);
       }

    }
}