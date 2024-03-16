public class Solver {
    private final double a;
    private final double b;
    private final double c;

    public Solver(double a, double b, double c) throws OutOfBoundException {
        this.checkOutOfBound(a, b, c);

        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void checkOutOfBound(double a, double b, double c) throws OutOfBoundException {
        if (a > 1000 || a < -1000 || b > 1000 || b < -1000 || c > 1000 || c < -1000) {
            throw new OutOfBoundException();
        }
    }

    public Solver() throws OutOfBoundException{
        this(0, 0, 0);
    }

    public double[] solve(double a, double b, double c) throws OutOfBoundException{
        checkOutOfBound(a, b, c);

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            return new double[]{x1, x2};
        } else if (delta == 0) {
            double x = -b / (2 * a);

            return new double[]{x};
        } else {
            return new double[]{};
        }
    }

    public double[] solve() throws OutOfBoundException{
        return this.solve(this.a, this.b, this.c);
    }
}
