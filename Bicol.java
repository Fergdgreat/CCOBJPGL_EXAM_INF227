public class Bicol implements Locations {

    int airFare = 160;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}