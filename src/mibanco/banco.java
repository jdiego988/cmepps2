/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibanco;

/**
 *
 * @author usuario
 */
public class banco {
    private int fund;
    //boolean transaction1,transaction2; //if transaction==true-->deposit
                         //if transaction==false-->withdraw
    
  
    
    
    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        /*
        public int transaction(int acc_n, int balance, boolean t) throws Exception{
            int fund11=50;
            int fund21=0;
            if(t==false){
                if(acc_n==12345 && getfund1()-balance>=-500){
                    //fund11=fund1-balance;
                    return(getfund1()-balance);
                }
                else if(acc_n==12345 && getfund1()-balance<-500)
                    throw new Exception("Insufficient fund");
                else if(acc_n==67890 && getfund2()-balance>=-500){
                    return(getfund2()-balance);
                }
                else if(acc_n==67890 && getfund2()-balance>-500)
                    throw new Exception("Insufficient fund");
                else{
                    throw new Exception("Error");
                }
            }else{
                if(acc_n==12345)
                    return(getfund1()+balance);
                else if(acc_n==67890)
                    return(getfund2()+balance);
                else{
                    throw new Exception("Error");
                }
            }
        
        }*/
        public banco(int f){
            this.fund=f;
        }
        
        public boolean withdraw(int balance){
            if(fund-balance<-500)
                return false;
            else{
                fund-=balance;
                return true;
            }
        }
        
        public boolean deposit(int balance){
            fund+=balance;
            return true;
        }
        
        public int getfund(){
            return fund;
        }
}

