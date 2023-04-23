import java.util.List;

public class Colour{

    public static void main(String[] args) {
        List<String> names = List.of("red", "blue", "yellow", "purple", "black");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}