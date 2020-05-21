package LibraryLab;

public class Perodicals extends LibraryItem{
    //private classes
    private String  issueMonth;

    //constructors
    public Perodicals(String title, String genre, int pubYear, int price, int checkOutLimit, int stock, String issueMonth){
        super(title, genre, pubYear, price, checkOutLimit, stock);
        this.issueMonth = issueMonth;
    }

    //Getters
    public String getIssueMonth(){
        return issueMonth;
    }
    
    //Setters
    public void setIssueMonth(String issueMonth){
        this.issueMonth=issueMonth;
    }
}