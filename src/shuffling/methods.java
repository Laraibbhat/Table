
package shuffling;

import java.util.Random;

public class methods {
      static String[][] assignSE =new String[5][7];
      public static String[][] assign =new String[5][7];
   static String[][] assignBE =new String[5][7];
    
     public static String[][] assignTE(){
        
        int k=3;int q=3;
        int l=0;int w=3;
        int t=3;int r=3;
        int qw=3;int y=3;
    
    for(int i=0;i<5;i++){
        
            for(int j=0;j<7;j++){
            
                while(k>0){
                    
                    assign[i][j]=source.subject[l];
                    k--;
                    break; 
                }
                if(k==0 ){
                                if(source.subject[l+1]=="CN"&& y!=0){
                                k=4;
                                l++;
                                 y=0;
                                continue;                
                            }
                                if(source.subject[l+1]=="Practical1"&& t!=0){
                                k=10;
                                l++;
                                 t=0;
                                continue;
                            }
                                if(source.subject[l+1]=="SDl tut(1)"&& r!=0){
                                k=1;
                                l++;
                                 r=0;
                                continue;
                            }
                                if(source.subject[l+1]=="SDl tut(2)"&& w!=0){
                                k=1;
                                l++;
                                 w=0;
                                continue;
                            }
                                if(source.subject[l+1]=="Free"&& q!=0){
                                k=8;
                                l++;
                                 q=0;
                                continue;

                            }
                    k=3;
                l++;
                }
            }
      
         }
    
    return assign;
    
    }
    
    static String[][] assignBE(){
        int k=3;int q=3;
        int l=0;int w=3;
        int t=3;int r=3;
        int qw=3;int y=3;
        int m=3;
    
    for(int i=0;i<5;i++){
        
            for(int j=0;j<7;j++){
               // System.out.println("i\t"+i+j+"\t" +source.subjectBE[l]);
            
                while(k>0){
                assignBE[i][j]=source.subjectBE[l];
                k--;
                break;
                
                }
                if(k==0 ){
                    if(source.subjectBE[l+1]=="HPC"&& y!=0){
                    k=4;
                    l++;
                     y=0;
                    continue;
                    
                    }
                    if(source.subject[l+1]=="Practical1"&& t!=0){
                    k=8;
                    l++;
                     t=0;
                    continue;
                    
                    }
                    if(source.subjectBE[l+1]=="Project"&& m!=0){
                        //System.out.println("IN THE ---------------- menu\tk="+k);
                    k=2;
                    l++;
                     m=0;
                    continue;
                    
                    }
                  
                   
                    if(source.subjectBE[l+1]=="FREE"&& q!=0){
                       // System.out.println("IN THE ---------ly------- menu\tk=15");
                    k=10;
                    l++;
                     q=0;
                    continue;
                    
                    }
                    k=3;
                l++;
                }
            }
              
            }
       return assignBE;
   
    }
    
    
    
     static String[][] assignSE(){
        int k=4;int q=3;
        int l=0;int w=3;
        int t=3;int r=3;
        int qw=3;int y=3;
        int m=3;
    
    for(int i=0;i<5;i++){
        
            for(int j=0;j<7;j++){
            
                while(k>0){
                   // System.out.println(j+i+"\t" +source.subjectSE[l]);
                assignSE[i][j]=source.subjectSE[l];
                k--;
                break;
                }
                if(k==0){
                    if(source.subjectSE[l+1]=="Practical"&& t!=0){
                    k=10;
                    l++;
                     t=0;
                    continue;
                    
                    }
                    if(source.subjectSE[l+1]=="FREE"&& q!=0){
                    k=6;
                    l++;
                     q=0;
                    continue;
                    }
                    k=4;
                l++;
                }
            }
        }
       return assignSE;
   
    }
    
    
    
    
    
  static  void print(String[][] love,String heading){
      
  int l=0;
    //System.out.println("\n-----------------------------------------------------------------------------------------------------------------");
     //System.out.println("------------------------------------------------------------------------------------------------------------------");
    System.out.println("\n\t\t\t\t"+heading+"\n\n");
     System.out.println("------------------------------------------------------------------------------------------------------------------");
      System.out.println("-----------------------------------------------------------------------------------------------------------------");
    for(int i=0;i<5;i++){
            System.out.println("\n");
             System.out.print(source.Days[i]+"\t\t");
            for(int j=0;j<7;j++){
                 if(i==l &&j==3){
                    
                            System.out.print("BREAK\t");
                            l++;
                 }
            
            System.out.print(love[i][j]+"      ");
            }
        
        }
    
    }
  
  
   static  String[][] shift(String[][] love){
      int l=0;
       System.out.println("CheckPoint shift");
         Random random = new Random();
        // System.out.println(love.length+"\t"+love[0].length);
int numberOfValues = love.length * love[0].length;
for (int i = numberOfValues - 1; i > 0; i--) {
    int index = random.nextInt(i);
    int row = i / love[0].length;
    int column = i - row * love[0].length;
    int randomRow = index / love[0].length;
    int randomColumn = index - randomRow * assign[0].length;
    String temp = love[row][column];
    love[row][column] = love[randomRow][randomColumn];
    love[randomRow][randomColumn] = temp;
}
        for(int i=0;i<5;i++){
            for(int j=0;j<7;j++){
                   // System.out.println(love[i][j]+"\t"+i+j);
                if(love[i][1]=="TOC"||love[i][1]=="ISEE"||love[i][2]=="TOC"
                   ||love[i][2]=="ISEE"||love[i][1]=="SDl tut(2)"||love[i][2]=="SDl tut(2)"){
                    l++;
                    System.out.println("CheckPoint ******");
                    shift(love);
                
                
                }
                
                if(love[i][1]=="DSA"||love[i][2]=="DSA"){
                
                shift(love);
                
                }
            
            
            }
   
   
   }


   return love;
    }
   
   
   
    static String[][] profTE=new String[5][7];
    
    
    static String[][] proff_TE(String[][] love){
        
        for(int i=0;i<5;i++){
            for(int j=0;j<7;j++){
            
                if(love[i][j]=="DBMS"){
                
                    profTE[i][j]="Snehal";
                
                }else if (love[i][j]=="TOC"||love[i][j]=="SDl tut(2)"){
                
                    profTE[i][j]="Pareara";
                
                }else if (love[i][j]=="ISEE"){
                
                    profTE[i][j]="DESHMUKH";
                
                }else if (love[i][j]=="SEPM"){
                
                    profTE[i][j]="GHUMRAI";
                
                }else if (love[i][j]=="CN"){
                
                    profTE[i][j]="legend";
                
                }else if (love[i][j]=="Practical1"){
                
                    profTE[i][j]="Prac_SE";
                
                }else if (love[i][j]=="SDl tut(1)"){
                
                    profTE[i][j]="TANNU";
                
                }else if (love[i][j]=="Free"){
                
                    profTE[i][j]="ENJOY";
                
                }
                
            
            
            }
        
        
        }
        
        return profTE;
    }
   
}
