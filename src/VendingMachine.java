public interface VendingMachine {
    Product getProduct(int name, int volume);
    Product getProduct(int name,int volume,int temperature);
}
