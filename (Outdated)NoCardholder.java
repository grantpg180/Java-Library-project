package LibraryLab;

public class NoCardholder extends Cardholder{
       //private classes
       private boolean pcAccess;
       private String cardApply;
       //constructors
       public NoCardholder (boolean cardHolderStatus, boolean pcAccess, String cardApply){
           super(cardHolderStatus);
               this.pcAccess = pcAccess;
               this.cardApply = cardApply;
              
           }
   
       //Getters
       public boolean getPcAccess(){
           return pcAccess;
       }
       public String getCardApply(){
           return cardApply;
       }
       
       //Setters
       public void setPcAccess(boolean pcAccess){
           this.pcAccess=pcAccess;
       }
       public void setCardApply(String cardApply){
           this.cardApply=cardApply;
       }
       
}
