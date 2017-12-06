package testGenerator.outputClasses;

import testGenerator.inputClasses.ComputeCommission;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestComputeCommission
{
    @InjectMocks
    private ComputeCommission mockComputeCommission;

    @Test
    public void test0()
    {
        mockComputeCommission.findTotalCommission(39, 44, 50);
    }

    @Test
    public void test1()
    {
        mockComputeCommission.findTotalCommission(1, 44, 50);
    }

    @Test
    public void test2()
    {
        mockComputeCommission.findTotalCommission(2, 44, 50);
    }

    @Test
    public void test3()
    {
        mockComputeCommission.findTotalCommission(76, 44, 50);
    }

    @Test
    public void test4()
    {
        mockComputeCommission.findTotalCommission(77, 44, 50);
    }

    @Test
    public void test5()
    {
        mockComputeCommission.findTotalCommission(39, 1, 50);
    }

    @Test
    public void test6()
    {
        mockComputeCommission.findTotalCommission(39, 2, 50);
    }

    @Test
    public void test7()
    {
        mockComputeCommission.findTotalCommission(39, 87, 50);
    }

    @Test
    public void test8()
    {
        mockComputeCommission.findTotalCommission(39, 88, 50);
    }

    @Test
    public void test9()
    {
        mockComputeCommission.findTotalCommission(39, 44, 1);
    }

    @Test
    public void test10()
    {
        mockComputeCommission.findTotalCommission(39, 44, 2);
    }

    @Test
    public void test11()
    {
        mockComputeCommission.findTotalCommission(39, 44, 98);
    }

    @Test
    public void test12()
    {
        mockComputeCommission.findTotalCommission(39, 44, 99);
    }
}