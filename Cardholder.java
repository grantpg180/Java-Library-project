package LibraryLab;

public class Cardholder {
   //private classes
     private boolean cardholderStatus;

   //constructor(general)
   public Cardholder(boolean cardholderStatus){
       this.cardholderStatus = cardholderStatus;
     
   }

   //Getters
   public boolean getCardholderStatus(){
       return cardholderStatus;
   }
   
   //Setters
   public void setCardholderStatus(boolean cardholderStatus){
       this.cardholderStatus=cardholderStatus;
   }



} 
