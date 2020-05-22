package LibraryLab;

public class Publisher {
    private String publishCompany;
    public Publisher (String publishCompany){
        this.publishCompany = publishCompany;
    }

    //Getter
    public String getPublishCompany(){
        return publishCompany;
    }
    //Setter
    public void setPublishCompany(String publishCompany){
        this.publishCompany = publishCompany;
    }
    
}