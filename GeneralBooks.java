package LibraryLab;

public class GeneralBooks extends Books {
    private String ageRange;
    private String fiction;
    private String nonFiction;

    public GeneralBooks(String title, String genre, int pubYear, int price, int checkOutLimit, int stock, String ageRange, String fiction, String nonFiction){
        super(title, genre, pubYear, price, checkOutLimit, stock);
        this.ageRange = ageRange;
        this.fiction = fiction;
        this.nonFiction = nonFiction;
    }
    //Getters
    public String getAgeRange(){
        return ageRange;
    }
    public String getFiction(){
        return fiction;
    }
    public String getNonFiction(){
        return nonFiction;
    }

    //Setters
 public void setAgeRange (String ageRange){
    this.ageRange = ageRange;
    }
    public void setFiction (String fiction){
        this.fiction = fiction;
    }
    public void setNonFiction (String nonFiction){
        this.nonFiction = nonFiction;
    }
}