public class ReverseWords {
    static final String[] lines = {
            "Kiedy byłem, kiedy byłem małym chłopcem, hej",
            "Bardzo chciałem, bardzo chciałem",
            "wziæł mnie ojciec, wział mnie ojciec",
            "i tak do mnie rzekł"
    };

    public static void main(String[] args) {
        for (String line : lines) {
            String[] words = line.split("\\s");
            for (int i = words.length - 1; i >= 0; i--)
                System.out.printf("%s ", words[i]);
            System.out.println();
        }
    }
}
