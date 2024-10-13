import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter A for Adventure, C for comedy, and S for Science Fiction, or Q to quit");
            String type = sc.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter movie title");
            String title = sc.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();

        }
//        Movie movie = Movie.getMovie("Adventure", "Star wars");
//        movie.watchMovie();
//


//        Printer printer = new Printer(50, true);
//        System.out.println(printer.addToner(50));
//        System.out.println("initial page count = " +printer.getPagesPrinted());
//        int pagesPrinted = printer.printPages(4);
//        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
//        pagesPrinted = printer.printPages(2);
//        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());

//
//        Player player = new Player();
//        player.name = "Habeeb";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.looseHealth(damage);
//        System.out.println("Health remaining = "+player.healthRemaining());
    }
}
