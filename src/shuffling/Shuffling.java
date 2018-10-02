
package shuffling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Shuffling {
   
  static String[][] newBEproff =new String[5][7];
  static String[][] newSEproff =new String[5][7];
static String[][] SEfinal =new String[5][7];
static String[][] BEfinal =new String[5][7];
static String[][] TEfinal =new String[5][7];
   
    public static void main(String[] args) {
      
      
       methods.assignTE();
      methods.shift(methods.assign);
     
     methods.assignBE();
      methods.shift(methods.assignBE);
        methods.assignSE();
      methods.shift(methods.assignSE);
     
     collision.proff_TE(methods.assign);
    collision.proff_SE(methods.assignSE);
    collision.proff_BE(methods.assignBE);
     newBEproff=collisionRemoval.colli(collision.proffTE,collision.proffBE);
   newSEproff=collisionRemoval.colli2(newBEproff,collision.proffSE);
  
    SEfinal=collisionRemoval.proff_SE_sub(newSEproff);
   // collisionRemoval.practical(SEfinal);
    methods.print(SEfinal,"TIMETABLE OF SE");
    TEfinal=collisionRemoval.proff_TE_sub(collision.proffTE);
   BEfinal= collisionRemoval.proff_BE_sub(newBEproff);
   methods.print(TEfinal,"TIMETABLE OF TE");
   methods.print(BEfinal,"TIMETABLE OF BE");
     //methods.print(collisionRemoval.finalTE, "heading");
    // methods.print(collisionRemoval.finalSE, "heading");
    // methods.print(collisionRemoval.newproffSE, "heading");
     
   // methods.print(methods.assignSE,"TIMETABLE OF SE");
     //  methods.print(methods.assign,"TIMETABLE OF TE");
       //methods.print(methods.assignBE,"TIMETABLE OF BE");
      
      
       //methods.print(collision.proffTE, "PROFESSOR of TE");
        //methods.print(collision.proffSE, "PROFESSOR of SSSSSSSSSSe");
       //methods.print(collision.proffBE, "PROFESSOR of  BE");
      
    }
   
}

    

