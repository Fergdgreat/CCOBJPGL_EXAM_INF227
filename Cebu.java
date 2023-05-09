public class Cebu implements Locations {

    int airFare = 170;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}