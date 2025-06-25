import java.util.Arrays;
import java.util.Comparator;
import java.util.*;
public class ECommerceSearch {
      public static void main(String[] args) {
            Product[] products = {
                        new Product(101, "Laptop", "Electronics"),
                        new Product(102, "Shoes", "Footwear"),
                        new Product(103, "Watch", "Accessories"),
                        new Product(104, "Phone", "Electronics"),
                        new Product(105, "Bag", "Fashion")
            };
            System.out.println("Linear Search Result:");
            Product result1 = linearSearch(products, "Phone");
            System.out.println(result1);
            Arrays.sort(products, Comparator.comparing(p -> p.productName));

            System.out.println("\nBinary Search Result:");
            Product result2 = binarySearch(products, "Phone");
            System.out.println(result2);
      }

      public static Product linearSearch(Product[] products, String targetName) {
            for (Product product : products) {
                  if (product.productName.equals(targetName)) {
                        return product;
                  }
            }
            return null;
      }

      public static Product binarySearch(Product[] products, String targetName) {
            int left = 0;
            int right = products.length - 1;

            while (left <= right) {
                  int mid = (left + right) / 2;
                  String midName = products[mid].productName;

                  int comparison = midName.compareTo(targetName);
                  if (comparison == 0) {
                        return products[mid];
                  } else if (comparison < 0) {
                        left = mid + 1;
                  } else {
                        right = mid - 1;
                  }
            }

            return null;
      }

}
