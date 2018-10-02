
package shuffling;

//import static shuffling.collision.colu;

import static shuffling.collision.proffBE;
import static shuffling.collision.proffSE;
import static shuffling.collision.proffTE;

public class collisionRemoval {
    static String[][] colu=new String[5][8];
    static String[][] colu1=new String[5][7];
    static String[][] newproffBE=new String[5][7];
    static String[][] newproffSE=new String[5][7];
    static String[][] finalSE=new String[5][7];
    static String[][] finalTE=new String[5][7];
    static String[][] finalBE=new String[5][7];
   static int flag=0;
   
   
   
      public static String[][] colli(String[][] proffTE,String[][] newproffBE){
          //System.out.println("CHECKPOINT 1");
         
            
         for(int i=0;i<5;i++){
            // System.out.println("CHECKPOINT 2");
             for(int j=0;j<7;j++){
                 //System.out.println("CHECKPOINT 3");
             
                 if(proffTE[i][j]==proffBE[i][j]){
                 
                 
                    // colu[i][j]="ColliSion";
                     flag=1;
                     System.out.println("CHECKPOINT 4");
               
                 }
             
                 //else
                 //    colu[i][j]=proffBE[i][j];
                 //System.out.println("CHECKPOINT 5");
          
             }
       
         }
         
         if(flag==1){
           //  System.out.println("CHECKPOINT 6");
            newproffBE =methods.shift(proffBE);
            flag=0;
            colli(collision.proffTE,newproffBE);
         
         }
               
    return newproffBE;
    }
      
      
      
      
       public static String[][] colli2(String[][] proffBE,String[][] newproffSE){
        int flag=0; 
            
         for(int i=0;i<5;i++){
             for(int j=0;j<7;j++){
             
                 if(proffBE[i][j]==proffSE[i][j]){
                 
                 
                    // colu1[i][j]="ColliSion";
                     flag=1;
                     System.out.println("CHECKPOINT colli2           5");
                 }
             
               //  else
                    // colu1[i][j]=proffBE[i][j];
          
             }
       
         }
         
         if(flag==1){
            newproffSE =methods.shift(newproffSE);
            flag=0;
            colli2(collision.proffBE,newproffSE);
         
         }
           
    return proffSE;
    }
       
       
        static String[][] proff_TE_sub(String[][] love){
        
        for(int i=0;i<5;i++){
            for(int j=0;j<7;j++){
            //System.out.println("in the prof TE\t"+love[i][j]);
                if(love[i][j]=="Snehal"){
                
                    finalTE[i][j]="DBMS";
                   // System.out.println(" snehal\t"+profTE[i][j]);
                
                }else if (love[i][j]=="Pareara"){
                
                    finalTE[i][j]="TOC";
                
                }else if (love[i][j]=="DESHMUKH"){
                
                    finalTE[i][j]="ISEE";
                
                }else if (love[i][j]=="GHUMRAI"){
                
                    finalTE[i][j]="SEPM";
                
                }else if (love[i][j]=="legend"){
                
                    finalTE[i][j]="CN";
                
                }else if (love[i][j]=="Prac_TE"){
                
                    finalTE[i][j]="Practical1";
                
                }else if (love[i][j]=="TANNU"){
                
                    finalTE[i][j]="SDl tut(1)";
                
                }else if (love[i][j]=="ENJOY"){
                
                    finalTE[i][j]="Free";
                
                }
              
            }
        
        
        }
        
        return finalTE;
    }
       
        
        
        
         static String[][] proff_SE_sub(String[][] love1){
        
        for(int i=0;i<5;i++){
            for(int j=0;j<7;j++){
            //System.out.println("in the prof E\t"+love1[i][j]);
                if(love1[i][j]=="SURBHI"){
                
                    finalSE[i][j]="DM";
                  //  System.out.println(" snehal\t"+profTE[i][j]);
                
                }else if (love1[i][j]=="DELD-p"){
                
                    finalSE[i][j]="DELD";
                
                }else if (love1[i][j]=="COA-p"){
                
                    finalSE[i][j]="COA";
                
                }else if (love1[i][j]=="DESHMUKH-M"){
                
                    finalSE[i][j]="DSA";
                
                }else if (love1[i][j]=="KANCHAN"){
                
                    finalSE[i][j]="OOP";
                
                }else if (love1[i][j]=="Prac_SE"){
                
                    finalSE[i][j]="Practical";
                
                }else if (love1[i][j]=="ENJOY-S"){
                
                    finalSE[i][j]="FREE";
                
                }
             
            }
        
        
        }
        
        return finalSE;
    }
    
         
         
         static String[][] proff_BE_sub(String[][] love1){
        
        for(int i=0;i<5;i++){
            for(int j=0;j<7;j++){
           // System.out.println("in the prof TE\t"+love1[i][j]);
                if(love1[i][j]=="AIR-p"){
                
                    finalBE[i][j]="AIR";
                  //  System.out.println(" snehal\t"+profTE[i][j]);
                
                }else if (love1[i][j]=="DESHMUKH-M"){
                
                    finalBE[i][j]="DA";
                
                }else if (love1[i][j]=="DESHMUKH"){
                
                    finalBE[i][j]="EL-1";
                
                }else if (love1[i][j]=="El-2-p"){
                
                    finalBE[i][j]="El-2";
                
                }else if (love1[i][j]=="Pareara"){
                
                    finalBE[i][j]="HPC";
                
                }else if (love1[i][j]=="Prac_BE"){
                
                    finalBE[i][j]="Practical1";
                
                }else if (love1[i][j]=="Prac_BE"){
                
                    finalBE[i][j]="Project";
                
                }else if (love1[i][j]=="ENJOY-BE"){
                
                    finalBE[i][j]="FREE";
                
                }
            
            }
        
        
        }
        
        return finalBE;
    }
         
         
         
         
         
         
         
         
         }
         
    

