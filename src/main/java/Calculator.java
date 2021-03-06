public class Calculator {
    private double number1;
    private double number2;

    public Calculator(double int1, double int2) {
        this.number1 = int1;
        this.number2 = int2;
    }

    public int addNumber() {
        return (int) (this.number1 += this.number2);
    }

    public int subtractNumber() {
        return (int) (this.number1 -= this.number2);
    }

    public int multiplyNumber() {
        return (int) (this.number1 *= this.number2);
    }

    public double divideNumber() {
        return this.number1 /= this.number2;
    }
}
