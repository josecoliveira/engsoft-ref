
public abstract class Price {
	abstract public int getPriceCode();

	abstract double getCharge(int daysRented);

	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}
