package logicalbuilding;

public class RectangularStarPattern {
    public void pattern(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        RectangularStarPattern obj = new RectangularStarPattern();
        obj.pattern(7);   
    }
}
