public class Main {
    public static void main(String[] args) {
        Hotdrinksvendingmachine Machine = new Hotdrinksvendingmachine();
        HotDrinks coffee = Machine.getProduct(1,250, 90);
        HotDrinks tea = Machine.getProduct(2,300);

        if(coffee != null) {
            System.out.println("Получен кофе: объем " + coffee.volume + "мл, температура "+ coffee.temperature + " градусов");
        }
        if(tea != null) {
            System.out.println("Получен кофе: объем " + tea.volume + "мл, ткмпература " + tea.temperature + " градусов");
        }
    }

}