import org.junit.Assert;
import org.junit.Test;

public class SolverControlFlowTest {
    public Solver solver;
    private final double delta;

    public SolverControlFlowTest() throws OutOfBoundException {
        this.solver = new Solver();
        this.delta = 0.001;
    }

    @Test
    public void test2() throws OutOfBoundException {
        Assert.assertArrayEquals(
                this.solver.solve(1, -49, -50),
                new double[]{50, -1},
                this.delta
        );
    }

    @Test
    public void test3() throws OutOfBoundException {
        Assert.assertArrayEquals(
                this.solver.solve(1, -4, 4),
                new double[]{2},
                this.delta
        );
    }

    @Test
    public void test4() throws OutOfBoundException {
        Assert.assertArrayEquals(
                this.solver.solve(3, 2, 5),
                new double[]{},
                this.delta
        );
    }

    @Test(expected = OutOfBoundException.class)
    public void test5() throws OutOfBoundException {
        this.solver.solve(1, -49, -1000.01);
    }

    @Test(expected = OutOfBoundException.class)
    public void test6() throws OutOfBoundException {
        this.solver.solve(1, -49, 1000.01);
    }

    @Test(expected = OutOfBoundException.class)
    public void test7() throws OutOfBoundException {
        this.solver.solve(1, -1000.01, -1);
    }

    @Test(expected = OutOfBoundException.class)
    public void test8() throws OutOfBoundException {
        this.solver.solve(1, 1000.01, -1000.01);
    }

    @Test(expected = OutOfBoundException.class)
    public void test9() throws OutOfBoundException {
        this.solver.solve(1000.01, 49, 1);
    }

    @Test(expected = OutOfBoundException.class)
    public void test10() throws OutOfBoundException {
        this.solver.solve(-1000.01, -49, -1000.01);
    }
}
