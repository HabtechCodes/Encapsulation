public class Movie {
    private final String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a(n) " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}
class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "Pleasant Scene","Scary scene",
                "Something bad Happens");
    }

    public void watchAdventure() {
        System.out.println("Watching an Adventure");
    }
}
class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "Something funny","laughter ..",
                "Something funny Happens");
    }
    public void watchComedy() {
        System.out.println("Watching a Comedy");
    }
}
class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "bad Aliens flies","Space guy chase alien",
                "Alien got caught");
    }
    public void WatchScienceFiction() {
        System.out.println("Watching a science fiction movie");
    }
}
