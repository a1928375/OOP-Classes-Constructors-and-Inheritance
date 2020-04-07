package com.company;

public class Wall {

    private double width;
    private double height;

    public Wall (double width, double height) {

        System.out.println("Constructor with parameters called");
        if (width < 0) {

            this.width = 0;
        } else {

            this.width = width;
        }

        if (height < 0) {

            this.height = 0;
        } else {

            this.height = height;
        }
    }

    public Wall () {

        this (0,0);
        System.out.println("Empty constructor called");
    }

    public void setWidth(double width) {

        if (width < 0) {

            this.width = 0;
        } else {

            this.width = width;
        }
    }

    public void setHeight(double height) {

        if (height < 0) {

            this.height = 0;
        } else {

            this.height = height;
        }
    }

    public double getWidth () {

        return this.width;
    }

    public double getHeight () {

        return this.height;
    }

    public double getArea() {

        if (this.height <= 0 || this.width <= 0) {

            return 0;
        } else {

            return this.height * this.width;
        }
    }
}
