package task2;

public class Main {

    public static void main(String[] args) {

        MovablePoint mp1 = new MovablePoint(2,4,1,1);
        System.out.println("Положение до: " + mp1);
        mp1.moveUp();
        System.out.println("Положение после: " + mp1);

        System.out.println("\n");

        MovableCircle mc1 = new MovableCircle(1, 2, 5, 1, 1);
        System.out.println("Положение до: " + mc1);
        mc1.moveUp();
        System.out.println("Положение после: " + mc1);

        System.out.println("\n");

        MovableRectangle rec1 = new MovableRectangle(2, 3, 3, 1, 6, 3);
        System.out.println("Положение до: " + rec1);
        rec1.moveLeft();
        System.out.println("Положение после: " + rec1);

        System.out.println("\n");

    }


}
