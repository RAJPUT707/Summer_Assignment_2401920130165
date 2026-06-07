interface LibraryUser
{
    void registerAccount();  //java treat them as public
    void requestBook();
}
class KidUser implements LibraryUser
{
    int age;  //alag alag kid(object) ke liye new new store ho  
    String BookType;
    public void registerAccount()  //since java treat the as public so make them public
    {
        if(age<12)
        {
            System.out.println("You have successfully registered under a Kids Account");
        }
        else
        {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }
    public void requestBook()
    {
        if(BookType.equals("Kids"))
        {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        }
        else
        {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}
class AdultUser implements LibraryUser
{
    int age;    
    String BookType;
    public void registerAccount()  //since java treat the as public so make them public
    {
        if(age>12)
        {
            System.out.println("You have successfully registered under an Adult Account");
        }
        else
        {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult ");
        }
    }
    public void requestBook()
    {
        if(BookType.equals("Fiction"))
        {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }
        else
        {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}
public class Library
{
    public static void main()
    {
            KidUser kid = new KidUser();
            kid.age = 10;
            kid.BookType = "Kids";
            kid.registerAccount();
            kid.requestBook();

            kid.age = 18;
            kid.BookType = "Fiction";
            kid.registerAccount();
            kid.requestBook();


            AdultUser adult = new AdultUser();
            adult.age = 5;
            adult.registerAccount();

            adult.age = 23;
            adult.registerAccount();

            adult.BookType = "Kids";
            adult.requestBook();

            adult.BookType = "Fiction";
            adult.requestBook();
    }
}