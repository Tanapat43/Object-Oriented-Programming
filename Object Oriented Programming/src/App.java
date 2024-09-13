public class App {
    public static void main(String[] args) {
        MemberCard platinumCard = new PlatinumCard("Son Goku", 2000);
        System.out.println("Platinum info");
        platinumCard.display();
        System.out.println("****************");
        MemberCard silverCard = new SilverCard("Vegeta", 1500);
        System.out.println("Silver info");
        silverCard.display();
        System.out.println("****************");
        MemberCard goldCard = new GoldCard("Whis", 2222);
        System.out.println("Gold info");
        goldCard.display();
        System.out.println("****************");
        MemberCard yukiCard = new YukiCard("Lord Biu", 3000);
        System.out.println("Yuki info");
        yukiCard.display();
    }
}