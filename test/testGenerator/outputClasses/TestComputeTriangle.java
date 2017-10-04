package testGenerator.outputClasses;

import testGenerator.inputClasses.ComputeTriangle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestComputeTriangle
{
    @InjectMocks
    private ComputeTriangle mockComputeTriangle;

    @Test
    public void test0()
    {
        mockComputeTriangle.findTriangle(10, 10, 10);
    }

    @Test
    public void test1()
    {
        mockComputeTriangle.findTriangle(10, 10, 10);
    }

    @Test
    public void test2()
    {
        mockComputeTriangle.findTriangle(11, 10, 10);
    }

    @Test
    public void test3()
    {
        mockComputeTriangle.findTriangle(9, 10, 10);
    }

    @Test
    public void test4()
    {
        mockComputeTriangle.findTriangle(10, 10, 10);
    }

    @Test
    public void test5()
    {
        mockComputeTriangle.findTriangle(9, 10, 10);
    }

    @Test
    public void test6()
    {
        mockComputeTriangle.findTriangle(11, 10, 10);
    }

    @Test
    public void test7()
    {
        mockComputeTriangle.findTriangle(10, 10, 10);
    }

    @Test
    public void test8()
    {
        mockComputeTriangle.findTriangle(10, 11, 10);
    }

    @Test
    public void test9()
    {
        mockComputeTriangle.findTriangle(10, 9, 10);
    }

    @Test
    public void test10()
    {
        mockComputeTriangle.findTriangle(10, 10, 10);
    }

    @Test
    public void test11()
    {
        mockComputeTriangle.findTriangle(10, 9, 10);
    }

    @Test
    public void test12()
    {
        mockComputeTriangle.findTriangle(10, 11, 10);
    }

    @Test
    public void test13()
    {
        mockComputeTriangle.findTriangle(10, 10, 10);
    }

    @Test
    public void test14()
    {
        mockComputeTriangle.findTriangle(10, 10, 11);
    }

    @Test
    public void test15()
    {
        mockComputeTriangle.findTriangle(10, 10, 9);
    }

    @Test
    public void test16()
    {
        mockComputeTriangle.findTriangle(10, 10, 10);
    }

    @Test
    public void test17()
    {
        mockComputeTriangle.findTriangle(10, 10, 9);
    }

    @Test
    public void test18()
    {
        mockComputeTriangle.findTriangle(10, 10, 11);
    }
}