public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A","jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C","Airplane");

       // comedy.watchMovie();  the compiler won't use the method return type, to figure out what comedy really is, after you make this assignment. IT JUST ASSUMES IT's an object, and this variable only has access to object's functionality.

        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C","Airplane");
        airplane.watchMovie();
        /* var is a special contextual keyword in java, that lets our code take advantage of local variable Type Inference
        By using var as the type, we're telling java to figure out the compile-time type for us
         */
        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unKnownObject = Movie.getMovie("s","funny movie");
        if(unKnownObject.getClass().getSimpleName().equals("Comedy")) {
            Comedy c = (Comedy) unKnownObject;
            c.watchComedy();
        } else if (unKnownObject instanceof Adventure) {
            ((Adventure) unKnownObject).watchAdventure();
        } else if (unKnownObject instanceof ScienceFiction sci) {
            sci.WatchScienceFiction();
        }
        /*
        (LVTI) Local Variable Type Inference was introduced in java 10
        one of the benefit is to help with the readability of the code, and to reduce boilerplate code
        it called that because : it can be used in field declarations on a class
        it can be used in method signatures, either as a parameter type or a return type
        it cant be used without an assignment, because the type cant be inferred in that case
        it cant be a assigned a null literal,  ,, ,, ,, ...



        Compile time Typing : this type is declared either as a variable reference, or a method return type, ori
         */


    }
}
