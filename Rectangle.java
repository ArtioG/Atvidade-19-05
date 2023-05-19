package Area;
public class Rectangle {
    private double lenght;
    private double width;

    public Rectangle() {
        lenght = 1.0;
        width = 1.0;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        if (lenght > 0.0 && lenght < 20.0) {
            this.lenght = lenght;
        } else {
            System.out.println("Comrpimento Invalido, insira novamente um número entre 0 e 20.");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Largura Invalida, insira novamente um número entre 0 e 20.");
        }
    }

    public double calculatePerimeter() {
        return 2 * (lenght + width);
    }

    public double calculateArea() {
        return lenght * width;
    }
}
