
public class SalesManager {
    protected long[] sales;

public class Main {
    public static void main(String[] args) {
        long[] sales = {1, 44, 788, 90};
        SalesManager manager = new SalesManager(sales);
        System.out.println("Макс  " + manager.max());
        }


    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long min() {
        long min = Integer.MAX_VALUE;
        for(long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public long average() {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return  (sum - min() - max()) / (sales.length - 2);
    }
}


