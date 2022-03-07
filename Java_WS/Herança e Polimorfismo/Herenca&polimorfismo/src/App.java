import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;//defult scanner is pie
import entities.product;
import entities.imported_product;
import entities.used_product;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner pie =  new Scanner(System.in);

       List<product> list = new ArrayList<>();

       System.out.println("INSERTER NUMBER OF PRODUCTS:");
       int n = pie.nextInt();

       for(int i=1; i <= n; i++){
           //FAZ TODA A LEITURA DE DADOS NECESSÁRIOS
            System.out.println("PRODUCT#"+i);
            //FAZ A PERGUNTA DE QUAL O TIPO DE PROTUDO
            System.out.println("Common, used or imported (c/u/i)? ");
            char type = pie.next().charAt(0);
            //DADOS BASE
            System.out.println("Name: ");
            pie.nextLine();
            String name = pie.nextLine();
            System.out.println("Price");
            Double price = pie.nextDouble();
            //-----INFORMCAO ADICIONAIS POR PRODUTO------
            //adiciona um novo produto comum
            if(type == 'c'){
                list.add(new product(name,price));
            }
            //adicona um procduto usado
            else if(type == 'u'){
                System.err.print("manufacture date(dd/mm/yyyy): ");
                String manufacture = pie.next();
                list.add(new used_product(name, price, manufacture)); 
            }
            //adicona um produtoi importado
            else{
                System.out.println("custom fee: ");
                Double custom_fee = pie.nextDouble();
                list.add(new imported_product(name, price, custom_fee));
            }


       }

       pie.close();

        System.err.println("");
        System.out.println("PRODUCT TAGS");
        for (product prod : list){
            System.out.println(prod.price_tag());
        }


    }
}
