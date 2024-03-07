import model.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductServiceImp implements ProductService{
    public static void creatingProducts(){
        try {
            File file = new File("resources/inventory.csv");
            Scanner fileScanner = new Scanner(file);
            //Saltar el encabezado del CSV
            fileScanner.nextLine();
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] productInfo = line.split(",");
                //System.out.println(productInfo[0]);
                //System.out.println(line);
                //TODO implement the logic to transform this code so it can convert the information in each line into a Product objet

                Product product = new Product();
                int i = 0;
                while(i<line.length()){
                    product.setName(productInfo[0]);
                    product.setDescription(productInfo[1]);
                    product.setCategory(productInfo[2]);
                    product.setTags(productInfo[3]);
                    product.setPrice(Float.parseFloat(productInfo[4]));
                    product.setImageUrl(productInfo[5]);
                    System.out.println(product);
                    i++;

                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
