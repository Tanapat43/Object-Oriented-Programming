public class YukiCard extends MemberCard {
    public YukiCard(String name, double purchaseAmount) {
        super(name, purchaseAmount);
    }

    @Override
    public double calculatedDiscount() {
        return getPurchaseAmount() * .31f;
    }
    
}