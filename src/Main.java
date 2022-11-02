public class Main {
    public static void main(String[] args) {
        long[] sales = {1, 44, 788, 90};
        SalesManager manager = new SalesManager(sales);
        System.out.println("Макс  " + manager.max());
        }

    }

