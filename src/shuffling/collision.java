/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shuffling;

/**
 *
 * @author laraib
 */
public class collision {
    static String[][] proffTE=new String[5][7];
     static String[][] proffSE=new String[5][7];
     static String[][] proffBE=new String[5][7];
     
     
     
    static String[][] proff_TE(String[][] love){
        
        for(int i=0;i<5;i++){
            for(int j=0;j<7;j++){
            //System.out.println("in the prof TE\t"+love[i][j]);
                if(love[i][j]=="DBMS"){
                
                    proffTE[i][j]="Snehal";
                   // System.out.println(" snehal\t"+profTE[i][j]);
                
                }else if (love[i][j]=="TOC"||love[i][j]=="SDl tut(2)"){
                
                    proffTE[i][j]="Pareara";
                
                }else if (love[i][j]=="ISEE"){
                
                    proffTE[i][j]="DESHMUKH";
                
                }else if (love[i][j]=="SEPM"){
                
                    proffTE[i][j]="GHUMRAI";
                
                }else if (love[i][j]=="CN"){
                
                    proffTE[i][j]="legend";
                
                }else if (love[i][j]=="Practical1"){
                
                    proffTE[i][j]="Prac_TE";
                
                }else if (love[i][j]=="SDl tut(1)"){
                
                    proffTE[i][j]="TANNU";
                
                }else if (love[i][j]=="Free"){
                
                    proffTE[i][j]="ENJOY";
                
                }
                
            
            
            }
        
        
        }
        
        return proffTE;
    }
    
    
    static String[][] proff_SE(String[][] love1){
        
        for(int i=0;i<5;i++){
            for(int j=0;j<7;j++){
            //System.out.println("in the prof E\t"+love1[i][j]);
                if(love1[i][j]=="DM"){
                
                    proffSE[i][j]="SURBHI";
                  //  System.out.println(" snehal\t"+profTE[i][j]);
                
                }else if (love1[i][j]=="DELD"){
                
                    proffSE[i][j]="DELD-p";
                
                }else if (love1[i][j]=="COA"){
                
                    proffSE[i][j]="COA-p";
                
                }else if (love1[i][j]=="DSA"){
                
                    proffSE[i][j]="DESHMUKH-M";
                
                }else if (love1[i][j]=="OOP"){
                
                    proffSE[i][j]="KANCHAN";
                
                }else if (love1[i][j]=="Practical"){
                
                    proffSE[i][j]="Prac_SE";
                
                }else if (love1[i][j]=="FREE"){
                
                    proffSE[i][j]="ENJOY-S";
                
                }
                
            
            
            }
        
        
        }
        
        return proffSE;
    }
    
    
    
    
    
     static String[][] proff_BE(String[][] love1){
        
        for(int i=0;i<5;i++){
            for(int j=0;j<7;j++){
           // System.out.println("in the prof TE\t"+love1[i][j]);
                if(love1[i][j]=="AIR"){
                
                    proffBE[i][j]="AIR-p";
                  //  System.out.println(" snehal\t"+profTE[i][j]);
                
                }else if (love1[i][j]=="DA"){
                
                    proffBE[i][j]="DESHMUKH-M";
                
                }else if (love1[i][j]=="EL-1"){
                
                    proffBE[i][j]="DESHMUKH";
                
                }else if (love1[i][j]=="EL-2"){
                
                    proffBE[i][j]="El-2-p";
                
                }else if (love1[i][j]=="HPC"){
                
                    proffBE[i][j]="Pareara";
                
                }else if (love1[i][j]=="Practical1"){
                
                    proffBE[i][j]="Prac_BE";
                
                }else if (love1[i][j]=="Project"){
                
                    proffBE[i][j]="Prac_BE";
                
                }else if (love1[i][j]=="FREE"){
                
                    proffBE[i][j]="ENJOY-BE";
                
                }
                
            
            
            }
        
        
        }
        
        return proffBE;
    }
    
    
    
    
    
    
    }
    
    
    

