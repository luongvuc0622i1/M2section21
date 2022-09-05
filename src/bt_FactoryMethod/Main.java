package bt_FactoryMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 ký tự C/S/R: ");
        String cha = scanner.next();
        Shape s1 = shapeFactory.getShape(cha);
        s1.draw();
    }
}
