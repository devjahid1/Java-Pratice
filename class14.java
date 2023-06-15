public class class14 {
    public static void main(String[] args) {

        // Problem Set-1
        String name = "JAHID";
        name = name.toLowerCase();
        System.out.println(name);
        
        // Problem set-2
        String space = "Hello     Jahid";
        space = space.replace(" ", "_");
        System.out.println(space);

        // Problem set-3
        String name2 = "Hello I am <|name|> . And I am a Progeammer";
        System.out.println(name2.replace("<|name|>", "Jahid")); 

        // Problem set-4
        String doubleSpace = "Here is  double space and here is truple spaces";
        System.out.println(doubleSpace.indexOf("  "));
        System.out.println(doubleSpace.indexOf("   "));

        // Problem set-5
        String letter = "Hello, \n I am jahid";
        System.out.println(letter);
    }
}
