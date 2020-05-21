package LibraryLab;

public class LibraryItem {
    //private classes
    private String  title, genre;
    private int pubYear, price, checkOutLimit, stock;

    //constructor(general)
    public LibraryItem(String title, String genre, int pubYear, int price, int checkOutLimit, int stock){
        this.title = title;
        this.genre = genre;
        this.pubYear = pubYear;
        this.price = price;
        this.checkOutLimit = checkOutLimit;
        this.stock = stock;
    }

    //Getters
    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return genre;
    }
    public int getPubYear(){
        return pubYear;
    }
    public int getPrice(){
        return price;
    }
    public int getCheckOutLimit(){
        return checkOutLimit;
    }
    public int getStock(){
        return stock;
    }

    //Setters
    public void setTitle(String title){
        this.title=title;
    }
    public void setGenre(String genre){
        this.genre=genre;
    }
    public void setPubYear(int pubYear){
        this.pubYear = pubYear;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setCheckOutLimit(int checkOutLimit){
        this.checkOutLimit=checkOutLimit;
    }
    public void setStock (int stock){
        this.stock = stock;
    }



}