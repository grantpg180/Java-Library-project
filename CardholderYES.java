package LibraryLab;
import java.util.ArrayList;

public class CardholderYES  extends Cardholder {
    
    //private classes
    private boolean pcAccess, checkoutBookAccess, checkoutMediaAccess, reservationAccess;
    private double lateCharge;
    //constructors
    public CardholderYES (boolean cardHolderStatus, boolean pcAccess, boolean checkoutBookAccess, boolean checkoutMediaAccess, boolean reservationAccess, double lateCharge){
        super(cardHolderStatus);
            this.pcAccess = pcAccess;
            this.checkoutBookAccess = checkoutBookAccess;
            this.checkoutMediaAccess = checkoutMediaAccess;
            this.reservationAccess = reservationAccess;
            this.lateCharge = lateCharge;
     
        }
    //Getters
    public boolean getPcAccess(){
        return pcAccess;
    }
    public boolean getCheckoutBookAccess(){
        return checkoutBookAccess;
    }
    public boolean getCheckoutMediaAccess(){
        return checkoutMediaAccess;
    }
    public boolean getReservationAccess(){
        return reservationAccess;
    }
    public double getLateCharge(){
        return lateCharge;
    }
    //Setters
    public void setPcAccess(boolean pcAccess){
        this.pcAccess=pcAccess;
    }
    public void setCheckoutBookAccess(boolean checkoutBookAccess){
        this.checkoutBookAccess=checkoutBookAccess;
    }
    public void setCheckoutMediaAccess(boolean checkoutMediaAccess){
        this.checkoutMediaAccess=checkoutMediaAccess;
    }
    public void setReservationAccess(boolean reservationAccess){
        this.reservationAccess=reservationAccess;
    }
    public void setLateCharge(double lateCharge){
        this.lateCharge=lateCharge;
    }
}