/*
 * @ (#) Rectangle.java       1.0     8/27/2024
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
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    // PT Tính diện tích
    public double getArea() {
        return this.length * this.width;
    }

    // PT Tính chu vi
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    // PT Biểu diễn hình chữ nhật dạng chuỗi
    @Override
    public String toString() {
        return String.format("Rectangle[length=%.2f, width=%.2f, area=%.2f, perimeter=%.2f]",
                this.length, this.width, getArea(), getPerimeter());
    }
}

