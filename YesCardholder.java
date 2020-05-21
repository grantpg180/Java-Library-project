package LibraryLab;

public class YesCardholder extends Cardholder {
    //private classes
    private boolean pcAccess, checkoutBookAccess, checkoutMediaAccess, reservationAccess;
    private double balanceOwed;
    //constructors
    public YesCardholder (boolean cardHolderStatus, boolean pcAccess, boolean checkoutBookAccess, boolean checkoutMediaAccess, boolean reservationAccess, double balancedOwed){
        super(cardHolderStatus);
            this.pcAccess = pcAccess;
            this.checkoutBookAccess = checkoutBookAccess;
            this.checkoutMediaAccess = checkoutMediaAccess;
            this.reservationAccess = reservationAccess;
            this.balancedOwed = balancedOwed;
        }
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
    public double getBalancedOwed(){
        return balancedOwed;
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
    public void setBalancedOwed(double balancedOwed){
        this.balancedOwed=balancedOwed;
    }
}