import java.util.Scanner;

public class AnimalPicker{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
       AskForAnimal(kb);
       
    }
    public static void AskForAnimal(Scanner kb){
        System.out.println("What animal would you like to see? Dog, Cat");
        String animal = kb.next().toLowerCase();
        switch (animal.toLowerCase()) {
            case "dog":
            // Art by Maija Haavisto
            System.out.println("  __      _\no\'\')}____//\n `_/      )\n (_(_/-(_/");
                break;
            case "cat":
            System.out.println(" /\\     /\\\n{  `---\'  }\n{  O   O  }\n~~>  V  <~~\n \\  \\|/  /\n  `-----\'____\n  /     \\    \\_\n {       }\\  )_\\_   _\n |  \\_/  |/ /  \\_\\_/ )\n  \\__/  /(_/     \\__/\n    (__/");
            break;
            default: System.out.println("Not an animal");
            AskForAnimal(kb);
                break;
        }

    }

   
}