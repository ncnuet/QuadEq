import org.junit.Assert;
import org.junit.Test;

public class SolverBounaryTest {
    public Solver solver;

    public SolverBounaryTest() throws OutOfBoundException{
        this.solver = new Solver();
    }


    @Test
    public void test1() throws OutOfBoundException {
        Assert.assertArrayEquals(
                this.solver.solve(1, -49, -50),
                new double[]{50, -1},
                0.001
        );
    }

    @Test(expected = OutOfBoundException.class)
    public void test2() throws OutOfBoundException {
        this.solver.solve(1, -49, -1000.01);
    }

    @Test
    public void test3() throws OutOfBoundException {
        Assert.assertArrayEquals(
                this.solver.solve(1, -49, -1000),
                new double[]{64.503, -15.503},
                0.001
        );
    }

    @Test
    public void test4() throws OutOfBoundException {
        Assert.assertArrayEquals(
                this.solver.solve(1, -49, -999.99),
                new double[]{64.502, -15.502},
                0.001
        );
    }

    @Test
    public void test5() throws OutOfBoundException {
        Assert.assertArrayEquals(
                this.solver.solve(1, -49, 999.99),
                new double[]{},
                0.001
        );
    }

    @Test
    public void test6() throws OutOfBoundException {
        Assert.assertArrayEquals(
                this.solver.solve(1, -49, 1000),
                new double[]{},
                0.001
        );
    }

    @Test(expected = OutOfBoundException.class)
    public void test7() throws OutOfBoundException {
        this.solver.solve(1, -49, 1000.01);
    }

    @Test(expected = OutOfBoundException.class)
    public void test8() throws OutOfBoundException {
        this.solver.solve(1, -1000.01, -50);
    }

    @Test
    public void test9() throws OutOfBoundException {
        Assert.assertArrayEquals(
                this.solver.solve(1, -1000, -50),
                new double[]{1000.049, -0.049},
                0.001
        );
    }

    @Test
    public void test10() throws OutOfBoundException {
        Assert.assertArrayEquals(
                this.solver.solve(1, -999.99, -50),
                new double[]{1000.039, -0.049},
                0.001
        );
    }

    @Test
    public void test11() throws OutOfBoundException {
        Assert.assertArrayEquals(
                this.solver.solve(1, 999.99, -50),
                new double[]{0.049, -1000.039},
                0.001
        );
    }

    @Test
    public void test12() throws OutOfBoundException {
        Assert.assertArrayEquals(
                this.solver.solve(1, 1000, -50),
                new double[]{0.049, -1000.049},
                0.001
        );
    }

    @Test(expected = OutOfBoundException.class)
    public void test13() throws OutOfBoundException {
        this.solver.solve(1, 1000.01, -50);
    }

    @Test(expected = OutOfBoundException.class)
    public void test14() throws OutOfBoundException {
        this.solver.solve(-1000.01, -49, -50);
    }

    @Test
    public void test15() throws OutOfBoundException {
        Assert.assertArrayEquals(
                this.solver.solve(-1000, -49, -50),
                new double[]{},
                0.001
        );
    }

    @Test
    public void test16() throws OutOfBoundException {
        Assert.assertArrayEquals(
                this.solver.solve(-999.99, -49, -50),
                new double[]{},
                0.001
        );
    }

    @Test
    public void test17() throws OutOfBoundException {
        Assert.assertArrayEquals(
                this.solver.solve(999.99, -49, -50),
                new double[]{0.249, -0.200},
                0.001
        );
    }

    @Test
    public void test18() throws OutOfBoundException {
        Assert.assertArrayEquals(
                this.solver.solve(1000, -49, -50),
                new double[]{0.249, -0.200},
                0.001
        );
    }

    @Test(expected = OutOfBoundException.class)
    public void test19() throws OutOfBoundException {
        this.solver.solve(1000.01, -49, -50);
    }
}