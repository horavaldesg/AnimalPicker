import java.util.Scanner;

public class AnimalPicker{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("What animal would you like to see? Dog, Cat");
        String animal = kb.next().toLowerCase();
       switch(animal){
           case "dog":
           System.out.println(animal +" art goes here");
           break;
           case "cat":
           System.out.println(animal +" art goes here");
           break;
           default: 
           System.out.println(animal +" is not an available Animal");
           break;
       }
    }

   
}