package LibraryLab;

public class Authors {
    protected String firstName;
    protected String lastName;
    protected Publisher publish;

    public Authors(String firstName, String lastName, Publisher publish){
         this.firstName = firstName;
         this.lastName = lastName;
         this.publish = publish;
    }

    //Getter
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Publisher getPublish(){
        return publish;
    }
    //Setter
     public void setFirstName(){
        this.firstName=firstName;
    }
    public void setLastName(){
        this.lastName=lastName;
    }
    public void getPublish(Publisher publish){
        this.publish=publish;
    }
    
}