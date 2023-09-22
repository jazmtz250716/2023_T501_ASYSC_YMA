/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 *
 * @author DELL
 */
public class Coordinate {
    
    
    public static final float XMIN = -20.0f;
    public static final float XMAX = 20.0f;
    
     
    public static final float YMIN = -20.0f;
    public static final float YMAX = 20.0f;
    
    public static final float XSCREEN = 300;
    public static final float YSCREEN = 300;
    
    //public static final float XSCR = 300;
    //public static final float YSCR = 300;
    
    public static int toScreenX(float x){
        //return (int) (x * XSCR / XMAX);
        return (int) ( (x  - XMIN) * XSCREEN / (XMAX -XMIN));
    }
    
    public static int toScreenY(float y){
       // return (int) ((YMAX  - y) * YSCR / YMAX);
       return (int) ( (y  - XMAX) * YSCREEN / (YMIN - YMAX));
    }
    
    
}
