package hw4;

public class Main4 {

    public static void main(String[] args)
    {
        int orderNo=1;
        String product="smartphone";
        int numDays=5;
        float productPrice=12153.41f;
        int numProducts=1;
        float ts = totalSales(productPrice, numProducts);
        System.out.println("Product No "+orderNo+": "+product+",");
        System.out.println("total sales for "+numDays+" days is EUR "+ts+",");
        System.out.println("sales by day is EUR "+salesByDay(numDays, ts)+".");

        orderNo=2;
        product="laptop";
        numDays=7;
        productPrice=10486.85f;
        numProducts=1;
        ts = totalSales(productPrice, numProducts);
        System.out.println("Product No "+orderNo+": "+product+",");
        System.out.println("total sales for "+numDays+" days is EUR "+ts+",");
        System.out.println("sales by day is EUR "+salesByDay(numDays, ts)+".");

    }
    private static float totalSales(float price, int products) {
        return price * products;
    }

    private static float salesByDay(int day, float totalSales) {
        return (float) Math.round(totalSales / day * 100) /100;
    }
}
