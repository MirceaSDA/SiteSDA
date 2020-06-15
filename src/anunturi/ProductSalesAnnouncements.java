package anunturi;

public class ProductSalesAnnouncements extends Announcements {
    private String productDetails;
    private ProductState productState;

    public ProductSalesAnnouncements(String name, String description, int price, ProductState productState, String productDetails) {
        super(name, description, price);
        this.productDetails = productDetails;
        this.productState = productState;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " " + productDetails + " " + productState;
    }

    public enum ProductState {
        BUN,
        DETERIORAT,
        EXCELENT
    }
}
