public class Main {
    public static void main(String[] args) {
        Card card1 = new Card();
        card1.title = "Пылесос";
        card1.url = "https://www.website.com";

        Description description1 = new Description();
        description1.price = 500;
        description1.description = "Mоющий, мощный, huawei";

        card1.description = description1;

        Flat flat1 = new Flat();
        LivingRoom livingRoom1 = new LivingRoom();
        livingRoom1.beds = 2;
        livingRoom1.square = 25;

        flat1.livingRoom = livingRoom1;


    }
}
