

package lyyracard;

/**
 *
 * @author User
 */
public class LyyraCard {
    private double balance; 
    
    public LyyraCard(double balanceAtStar){
        balance= balanceAtStar;
            
}
    
    public String toString(){
        return  "su tarjeta tiene "  + String.valueOf(balance)+ " euros";
        
    }
    
    public void payEconomical(){
            if(balance>2.50){
              balance = balance-2.50;
              }
    }
    
    public void payGourmet(){
            if(balance>2.50){
              balance = balance-4.00;
              }
    }
    public void loadMoney(double amount){
            if(amount>0){
              balance = balance+ amount;
               }
            
            if(balance>= 150){
              balance= 150;
                     
                      }
         } 

   
}

 

    
     

 




    
