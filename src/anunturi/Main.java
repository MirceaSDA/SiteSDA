package anunturi;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Site site = new Site();
        List<Announcements> announcements = site.getAnnouncements();
        System.out.println("Enter site name: ");
        String siteName = scanner.nextLine();
        site.setName(siteName);

        int option = -1;

        while(option != 0) {
            System.out.println("Site management");
            System.out.println("1. Add announcement");
            System.out.println("2. View announcements");
            System.out.println("0. Exit");

            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.println("Select announcement type");
                System.out.println("1. Real estate announcement");
                System.out.println("2. Product sales announcement");

                int announcementOption = scanner.nextInt();
                scanner.nextLine();

                if (announcementOption == 1) {
                    System.out.println("Enter announcement name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter announcement description: ");
                    String description = scanner.nextLine();
                    System.out.println("Enter announcement price: ");
                    int price = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter announcement location: ");
                    String location = scanner.nextLine();
                    System.out.println("Enter announcement area: ");
                    double area = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Choose real estate type: INTRAVILAN / EXTRAVILAN");
//                    String realEstateType = scanner.nextLine().toUpperCase();
                    RealEstateAnnouncement.RealEstateType realEstateType = RealEstateAnnouncement.RealEstateType.valueOf(scanner.nextLine().toUpperCase());
                    RealEstateAnnouncement realEstateAnnouncement = new RealEstateAnnouncement(name, description, price, realEstateType, location, area);
                    announcements.add(realEstateAnnouncement);
                } else if (announcementOption == 2) {
                    System.out.println("Enter announcement name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter announcement description: ");
                    String description = scanner.nextLine();
                    System.out.println("Enter announcement price: ");
                    int price = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter product details: ");
                    String productDetails = scanner.nextLine();
                    System.out.println("Product condition: BUN / DETERIORAT / EXCELENT ");
                    ProductSalesAnnouncements.ProductState productState = ProductSalesAnnouncements.ProductState.valueOf(scanner.nextLine().toUpperCase());
                    ProductSalesAnnouncements productSalesAnnouncements = new ProductSalesAnnouncements(name, description, price, productState, productDetails);
                    announcements.add(productSalesAnnouncements);
                }
            }
            else if (option == 2) {
                for (Announcements announcement : announcements) {
                    System.out.println(announcement.getDetails());
                }
            }
        }
    }

}
