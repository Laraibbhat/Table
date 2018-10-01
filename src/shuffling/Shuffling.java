/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shuffling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author laraib
 */
public class Shuffling {
   
  //static String[][] assignSE =new String[6][7];

   
    public static void main(String[] args) {
      
      
       methods.assignTE();
     // methods.shift(methods.assign);
      methods.assignBE();
     // methods.shift(methods.assignBE);
        methods.assignSE();
     // methods.shift(methods.assignSE);
     
     collision.proff_TE(methods.assign);
     collision.proff_SE(methods.assignSE);
     collision.proff_BE(methods.assignBE);
     
     
    //methods.print(methods.assignSE,"TIMETABLE OF SE");
     //  methods.print(methods.assign,"TIMETABLE OF TE");
      // methods.print(methods.assignBE,"TIMETABLE OF BE");
      
      
       methods.print(collision.proffTE, "PROFESSOR of TE");
        methods.print(collision.proffSE, "PROFESSOR of SSSSSSSSSSe");
        methods.print(collision.proffBE, "PROFESSOR of  BE");
       
    
  
    }
  
    
}

    

