 class Hotdrinksvendingmachine implements VendingMachine {
    @Override
     public HotDrinks getProduct(int name,int volume) {
        return getProduct(name, volume, 100);
    }
    @Override
     public HotDrinks getProduct(int name, int volume, int temperature) {
        switch (name) {
            case 1:
                return new Coffe(volume, temperature);
            case 2:
                return new Tea(volume, temperature);
            default:
                return null;
        }
    }
}
