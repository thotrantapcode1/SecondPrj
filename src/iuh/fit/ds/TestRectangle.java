/*
 * @ (#) TestRectangle.java       1.0     8/27/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */
package iuh.fit.ds;


/*
 * @description:
 * @author: Tho, Tran Phu
 * @version:    1.0
 * @created:    8/27/2024 3:45 PM
 */
import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và rộng
        try {
            System.out.print("Enter length: ");
            double length = scanner.nextDouble();

            System.out.print("Enter width: ");
            double width = scanner.nextDouble();

            // Tạo đối tượng Rectangle
            Rectangle rectangle = new Rectangle(length, width);

            // In ra
            System.out.println(rectangle.toString());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

