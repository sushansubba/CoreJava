package day1;

public class Application {


    public static void main(String[] args) {

                Books book1 = new Books();

                book1.setAuthor("Robin Sharma");
                book1.setSize(279);
                book1.setColor("red");
                book1.setCoverPage("www.images.com");
                book1.setIsbn("9780062515674");
                book1.setPrice(19.99f);
                book1.setType("self-help");

                Course course1 = new Course();

                course1.author="Taman Neupane";
                course1.duration="40:00:00";
                course1.price=49.00f;
                course1.caption="Core Java and Git concepts";
                course1.date="07/15/22";
                course1.noOfStudents=10;
                course1.skillLevel= "Intermediate";
                course1.title="Core Java Learning";



                System.out.println(book1.getAuthor());
                System.out.println(book1.getSize());
                System.out.println(book1.getColor());
                System.out.println(book1.getCoverPage());
                System.out.println(book1.getIsbn());
                System.out.println(book1.getPrice());
                System.out.println(book1.getType());





    }
}
