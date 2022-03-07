import java.util.Scanner;
// default scanner is pie
import java.util.List;
import java.util.ArrayList;

import entities.company;
import entities.incividual;
import entities.persons;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner pie = new Scanner(System.in);

        List<persons> list = new ArrayList<>();

        System.out.println("Number of holders: ");
        int n_holders = pie.nextInt();

        for(int i =1; i<= n_holders; i++){
            System.out.println("Holder# "+i);
            
            System.out.println("Name: ");
            pie.next();
            String name = pie.nextLine();
            System.out.println("Anual income: ");
            Double anual = pie.nextDouble();

            System.out.println("What a type of holder(i/c):");
            char ch = pie.next().charAt(0);

            if(ch == 'i'){
                System.out.println("Health expenditures: ");
                Double helth = pie.nextDouble();
                list.add(new incividual(helth, name, anual));
            }
            else{
                System.out.println("Number of employees: ");
                int e_number = pie.nextInt();
                list.add(new company(e_number, name, anual));
            }
        }
        pie.close();

        System.out.println("");
        System.out.println("TAXES PAID");
        for(persons persons : list){
            System.out.println(String.format("%.2f", persons.txa()));
        }
    }
}
