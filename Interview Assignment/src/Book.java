
public class Book {

	
	   public String title;
	   
	   public int id ;

	    public String author;

	     public String publisher;

	    public int price;

	    public Book(int id,String title,String author,String publisher,int price)

	    { 
	    	this.id=id;
           this.title=title;

	        this.author=author;

	       this.publisher=publisher;

	        this.price=price;

	    }
	    public void getid() {
	    	System.out.println("Book id:" +id);
	    }

	    public void getTitle()

	    {

	        System.out.println("Title of Book: "+title);

	    }

	    public void getAuthor()

	    {

	        System.out.println("Author of Book: "+author);

	    }

	    public void getPublisher()

	    {

	        System.out.println("Publisher of Book: "+publisher);

	    } 

	    public void getPrice()

	    {

	        System.out.println("Price of Book: "+price);

	    }

	    public void setTitle(String title)

	    {

	        this.title=title;

	    }

	    public void setAuthor(String author)

	    {

	       this.author=author;

	    }

	    public void setPublisher(String publisher)

	    {

	        this.publisher=publisher;

	    } 

	    public void setCost(int price)

	    {

	        this.price=price;

	    }    

	    public void show()

	    {
	    	getid();

	        getTitle();

	        getAuthor();

	        getPublisher();

	        getPrice();

	    }

}
