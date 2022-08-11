package day1;

public class Application {


    public static void main(String[] args) {

                Books book1 = new Books();

                book1.author = "Robin Sharma";
                book1.size= 279;
                book1.color= "red";
                book1.coverPage="www.images.com";
                book1.isbn="9780062515674";
                book1.price=19.99f;
                book1.type="self-help";

                Course course1 = new Course();

                course1.author="Taman Neupane";
                course1.duration="40:00:00";
                course1.price=49.00f;
                course1.caption="Core Java and Git concepts";
                course1.date="07/15/22";
                course1.noOfStudents=10;
                course1.skillLevel= "Intermediate";
                course1.title="Core Java Learning";




    }
}
