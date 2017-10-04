package cs411.testGenerator.inputClasses;

public class ComputeCommission
{
    private static final double LOCK_PRICE = 45.0d;
    private static final double STOCK_PRICE = 30.0d;
    private static final double BARREL_PRICE = 25.0d;
    private static final int MAX_LOCKS = 77;
    private static final int MAX_STOCKS = 88;
    private static final int MAX_BARRELS = 99;
    private static final int MIN_LOCKS = 1;
    private static final int MIN_STOCKS = 1;
    private static final int MIN_BARRELS = 1;
    private static final double FIRST_COMMISSION_BOUNDARY = 1000.0d;
    private static final double FIRST_COMMISSION_PERCENT = 0.10d;
    private static final double SECOND_COMMISSION_BOUNDARY = 1800.0d;
    private static final double SECOND_COMMISSION_PERCENT = 0.15d;
    private static final double HIGHEST_COMMISSION_PERCENT = 0.20d;

    public void findTotalCommission(
            final int locks,
            final int stocks,
            final int barrels)
    {
        final boolean validLocks = locks >= MIN_LOCKS && locks <= MAX_LOCKS;
        final boolean validStocks = stocks >= MIN_STOCKS && stocks <= MAX_STOCKS;
        final boolean validBarrels = barrels >= MIN_BARRELS && barrels <= MAX_BARRELS;

        System.out.print("Locks: " + locks + '\t');
        System.out.print("Stocks: " + stocks + '\t');
        System.out.print("Barrels: " + barrels + "\t\t");

        if (validLocks && validStocks && validBarrels) {
            final double sales = LOCK_PRICE * locks
                    + STOCK_PRICE * stocks
                    + BARREL_PRICE * barrels;

            System.out.print("Total sales: " + sales + "\t\t");
            System.out.println("Commission: " + findCommission(sales));
        } else {
            System.out.println("Invalid input");
        }
    }

    private static double findCommission(final double sales)
    {
        final double commission;

        if (sales > SECOND_COMMISSION_BOUNDARY) {
            commission = (FIRST_COMMISSION_PERCENT * FIRST_COMMISSION_BOUNDARY)
                    + (SECOND_COMMISSION_PERCENT * (SECOND_COMMISSION_BOUNDARY - FIRST_COMMISSION_BOUNDARY))
                    + (HIGHEST_COMMISSION_PERCENT * (sales - SECOND_COMMISSION_BOUNDARY));
        } else if (sales > FIRST_COMMISSION_BOUNDARY) {
            commission = (FIRST_COMMISSION_PERCENT * FIRST_COMMISSION_BOUNDARY)
                    + (SECOND_COMMISSION_PERCENT * (sales - FIRST_COMMISSION_BOUNDARY));
        } else {
            commission = FIRST_COMMISSION_PERCENT * sales;
        }

        return commission;
    }
}