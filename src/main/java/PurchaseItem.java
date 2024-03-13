public class PurchaseItem {
    private int id;
    private String productName;

    public PurchaseItem(int id,String productName){
        this.id=id;
        this.productName=productName;
    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(){
        this.productName=productName;
    }
}
