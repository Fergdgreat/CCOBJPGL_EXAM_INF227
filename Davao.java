public class Davao implements Locations {

    int airFare = 120;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}