public class MultiArrayTest {
    public static void main(String[] args) {

        MultiArray mutli = new MultiArray(4,5);

        mutli.print();
        System.out.printf("%nLiczba najmniejsza to: %d",mutli.findMin());
        System.out.printf("%nLiczba największa to: %d",mutli.findMax());
        mutli.randomize();
        mutli.print();
        System.out.printf("%nLiczba najmniejsza to: %d",mutli.findMin());
        System.out.printf("%nLiczba największa to: %d",mutli.findMax());

    }

}
