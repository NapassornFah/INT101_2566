/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work04;

/**
 *
 * @author User
 */
public class BankAccount {
    
    private int number;
    private Person owner;
    private double balance;
    
    /*4.2.3 a public constructor that receives a "number" parameter and
                an "owner" parameter to set the "number" and "owner" fields.
     */

    public BankAccount(int number, Person owner){
        this.number = number;
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
    
    public double deposit(double amount){
        this.balance += amount;
        return amount;
    }
    
    public double withdraw(double amount){
        this.balance -= amount;
        return amount;
    }
    
    public void transfer(double amount, BankAccount account){
        if (this.balance < amount) {
            System.out.println("Unable to withdraw money");
        }else{
            withdraw(amount);
            account.deposit(amount);
        }
    }
    
    @Override 
    public String toString(){
        return "BankAccount "+ this.owner.getId();
    }
    
    
    
}
