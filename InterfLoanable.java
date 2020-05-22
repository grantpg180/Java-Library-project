package LibraryLab;

interface InterfLoanable {
    boolean isLoanable();

    int loanTimeLimit();

    double lateCharge();

    boolean isRenewable();
    
    
}