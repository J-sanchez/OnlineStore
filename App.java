public class App {
    public static void main(String[] args) {
        OnlineAccount troyJohnson = new OnlineAccount.Builder(1L)
        .withName("Troy Johnson")
        .withAddress("511 McCurdy Rd")
        .withBudget(1000L)
        .withDiscount(2L)
                .build();


        OnlineAccount danRomero = new OnlineAccount.Builder(1L)
        .withName("Dan Romero")
        .withAddress("323 Calle del Sol")
        .withBudget(1500L)
        .withDiscount(4L)
                .build();

        System.out.println(troyJohnson.getName() + ": " + troyJohnson.getAddress());


        System.out.println(danRomero.getName() +  ": " + danRomero.getAddress());
                
    }
}