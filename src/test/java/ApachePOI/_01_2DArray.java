package ApachePOI.resource;

public class _01_2DArray {
    public static void main(String[] args) {
        String[][] cars = {
                {"Ferrari", "Number1"},
                {"BMW", "Number2"},
                {"Audi", "Number3", "100"},
                {"Fiat", "Numberless"}
        };

        System.out.println("----------------------");
        System.out.println(cars[2][1]);
        System.out.println("----------------------");
/*
        |0,0||0,1||0,2|
        |1,0||1,1||1,2|
        ...
 */

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
