package LibraryLab;

public class OverdueList<E extends CardholderYES> {
    private E books;
    private E perodicals;
//constructor
    public OverdueList (E books, E perodicals){
        this.books = books;
        this.perodicals = perodicals;
    }
//Getter
    public E getBooks(){
        return this.books;
    }
    public E getPerodicals(){
        return this.perodicals;
    }
//Setter
    public void setBooks(){
        //------fill in add & subtract items
    }
    public void setPerodicals(){
        //------fill in add & subtract items (magazines only)
    }

    }
