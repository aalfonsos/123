/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyyracard;

/**
 *
 * @author User
 */
public class Main {
    
    public static void main(String[]args){
    
    LyyraCard pekka= new LyyraCard(20);
    LyyraCard brian = new LyyraCard(30);
    
    pekka.payEconomical();
    brian.payGourmet();
    
    System.out.println("pekka: " + pekka );
    System.out.println("brian: " + brian);
    
    pekka.loadMoney(20);
    brian.payGourmet();
    
    System.out.println("pekka: " + pekka );
    System.out.println("brian: " + brian);
    
    pekka.payEconomical();
    pekka.payEconomical();
    brian.loadMoney(50);
     
    System.out.println("pekka: " + pekka );
    System.out.println("brian: " + brian);
    
            }
}
