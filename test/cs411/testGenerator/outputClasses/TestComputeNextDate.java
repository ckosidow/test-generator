package cs411.testGenerator.outputClasses;

import cs411.testGenerator.inputClasses.ComputeNextDate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestComputeNextDate
{
    @InjectMocks
    private ComputeNextDate mockComputeNextDate;

    @Test
    public void test0()
    {
        mockComputeNextDate.findNextDate(1, 1, 1801);
    }

    @Test
    public void test1()
    {
        mockComputeNextDate.findNextDate(1, 1, 1802);
    }

    @Test
    public void test2()
    {
        mockComputeNextDate.findNextDate(1, 1, 1911);
    }

    @Test
    public void test3()
    {
        mockComputeNextDate.findNextDate(1, 1, 2020);
    }

    @Test
    public void test4()
    {
        mockComputeNextDate.findNextDate(1, 1, 2021);
    }

    @Test
    public void test5()
    {
        mockComputeNextDate.findNextDate(1, 2, 1801);
    }

    @Test
    public void test6()
    {
        mockComputeNextDate.findNextDate(1, 2, 1802);
    }

    @Test
    public void test7()
    {
        mockComputeNextDate.findNextDate(1, 2, 1911);
    }

    @Test
    public void test8()
    {
        mockComputeNextDate.findNextDate(1, 2, 2020);
    }

    @Test
    public void test9()
    {
        mockComputeNextDate.findNextDate(1, 2, 2021);
    }

    @Test
    public void test10()
    {
        mockComputeNextDate.findNextDate(1, 16, 1801);
    }

    @Test
    public void test11()
    {
        mockComputeNextDate.findNextDate(1, 16, 1802);
    }

    @Test
    public void test12()
    {
        mockComputeNextDate.findNextDate(1, 16, 1911);
    }

    @Test
    public void test13()
    {
        mockComputeNextDate.findNextDate(1, 16, 2020);
    }

    @Test
    public void test14()
    {
        mockComputeNextDate.findNextDate(1, 16, 2021);
    }

    @Test
    public void test15()
    {
        mockComputeNextDate.findNextDate(1, 30, 1801);
    }

    @Test
    public void test16()
    {
        mockComputeNextDate.findNextDate(1, 30, 1802);
    }

    @Test
    public void test17()
    {
        mockComputeNextDate.findNextDate(1, 30, 1911);
    }

    @Test
    public void test18()
    {
        mockComputeNextDate.findNextDate(1, 30, 2020);
    }

    @Test
    public void test19()
    {
        mockComputeNextDate.findNextDate(1, 30, 2021);
    }

    @Test
    public void test20()
    {
        mockComputeNextDate.findNextDate(1, 31, 1801);
    }

    @Test
    public void test21()
    {
        mockComputeNextDate.findNextDate(1, 31, 1802);
    }

    @Test
    public void test22()
    {
        mockComputeNextDate.findNextDate(1, 31, 1911);
    }

    @Test
    public void test23()
    {
        mockComputeNextDate.findNextDate(1, 31, 2020);
    }

    @Test
    public void test24()
    {
        mockComputeNextDate.findNextDate(1, 31, 2021);
    }

    @Test
    public void test25()
    {
        mockComputeNextDate.findNextDate(2, 1, 1801);
    }

    @Test
    public void test26()
    {
        mockComputeNextDate.findNextDate(2, 1, 1802);
    }

    @Test
    public void test27()
    {
        mockComputeNextDate.findNextDate(2, 1, 1911);
    }

    @Test
    public void test28()
    {
        mockComputeNextDate.findNextDate(2, 1, 2020);
    }

    @Test
    public void test29()
    {
        mockComputeNextDate.findNextDate(2, 1, 2021);
    }

    @Test
    public void test30()
    {
        mockComputeNextDate.findNextDate(2, 2, 1801);
    }

    @Test
    public void test31()
    {
        mockComputeNextDate.findNextDate(2, 2, 1802);
    }

    @Test
    public void test32()
    {
        mockComputeNextDate.findNextDate(2, 2, 1911);
    }

    @Test
    public void test33()
    {
        mockComputeNextDate.findNextDate(2, 2, 2020);
    }

    @Test
    public void test34()
    {
        mockComputeNextDate.findNextDate(2, 2, 2021);
    }

    @Test
    public void test35()
    {
        mockComputeNextDate.findNextDate(2, 16, 1801);
    }

    @Test
    public void test36()
    {
        mockComputeNextDate.findNextDate(2, 16, 1802);
    }

    @Test
    public void test37()
    {
        mockComputeNextDate.findNextDate(2, 16, 1911);
    }

    @Test
    public void test38()
    {
        mockComputeNextDate.findNextDate(2, 16, 2020);
    }

    @Test
    public void test39()
    {
        mockComputeNextDate.findNextDate(2, 16, 2021);
    }

    @Test
    public void test40()
    {
        mockComputeNextDate.findNextDate(2, 30, 1801);
    }

    @Test
    public void test41()
    {
        mockComputeNextDate.findNextDate(2, 30, 1802);
    }

    @Test
    public void test42()
    {
        mockComputeNextDate.findNextDate(2, 30, 1911);
    }

    @Test
    public void test43()
    {
        mockComputeNextDate.findNextDate(2, 30, 2020);
    }

    @Test
    public void test44()
    {
        mockComputeNextDate.findNextDate(2, 30, 2021);
    }

    @Test
    public void test45()
    {
        mockComputeNextDate.findNextDate(2, 31, 1801);
    }

    @Test
    public void test46()
    {
        mockComputeNextDate.findNextDate(2, 31, 1802);
    }

    @Test
    public void test47()
    {
        mockComputeNextDate.findNextDate(2, 31, 1911);
    }

    @Test
    public void test48()
    {
        mockComputeNextDate.findNextDate(2, 31, 2020);
    }

    @Test
    public void test49()
    {
        mockComputeNextDate.findNextDate(2, 31, 2021);
    }

    @Test
    public void test50()
    {
        mockComputeNextDate.findNextDate(6, 1, 1801);
    }

    @Test
    public void test51()
    {
        mockComputeNextDate.findNextDate(6, 1, 1802);
    }

    @Test
    public void test52()
    {
        mockComputeNextDate.findNextDate(6, 1, 1911);
    }

    @Test
    public void test53()
    {
        mockComputeNextDate.findNextDate(6, 1, 2020);
    }

    @Test
    public void test54()
    {
        mockComputeNextDate.findNextDate(6, 1, 2021);
    }

    @Test
    public void test55()
    {
        mockComputeNextDate.findNextDate(6, 2, 1801);
    }

    @Test
    public void test56()
    {
        mockComputeNextDate.findNextDate(6, 2, 1802);
    }

    @Test
    public void test57()
    {
        mockComputeNextDate.findNextDate(6, 2, 1911);
    }

    @Test
    public void test58()
    {
        mockComputeNextDate.findNextDate(6, 2, 2020);
    }

    @Test
    public void test59()
    {
        mockComputeNextDate.findNextDate(6, 2, 2021);
    }

    @Test
    public void test60()
    {
        mockComputeNextDate.findNextDate(6, 16, 1801);
    }

    @Test
    public void test61()
    {
        mockComputeNextDate.findNextDate(6, 16, 1802);
    }

    @Test
    public void test62()
    {
        mockComputeNextDate.findNextDate(6, 16, 1911);
    }

    @Test
    public void test63()
    {
        mockComputeNextDate.findNextDate(6, 16, 2020);
    }

    @Test
    public void test64()
    {
        mockComputeNextDate.findNextDate(6, 16, 2021);
    }

    @Test
    public void test65()
    {
        mockComputeNextDate.findNextDate(6, 30, 1801);
    }

    @Test
    public void test66()
    {
        mockComputeNextDate.findNextDate(6, 30, 1802);
    }

    @Test
    public void test67()
    {
        mockComputeNextDate.findNextDate(6, 30, 1911);
    }

    @Test
    public void test68()
    {
        mockComputeNextDate.findNextDate(6, 30, 2020);
    }

    @Test
    public void test69()
    {
        mockComputeNextDate.findNextDate(6, 30, 2021);
    }

    @Test
    public void test70()
    {
        mockComputeNextDate.findNextDate(6, 31, 1801);
    }

    @Test
    public void test71()
    {
        mockComputeNextDate.findNextDate(6, 31, 1802);
    }

    @Test
    public void test72()
    {
        mockComputeNextDate.findNextDate(6, 31, 1911);
    }

    @Test
    public void test73()
    {
        mockComputeNextDate.findNextDate(6, 31, 2020);
    }

    @Test
    public void test74()
    {
        mockComputeNextDate.findNextDate(6, 31, 2021);
    }

    @Test
    public void test75()
    {
        mockComputeNextDate.findNextDate(11, 1, 1801);
    }

    @Test
    public void test76()
    {
        mockComputeNextDate.findNextDate(11, 1, 1802);
    }

    @Test
    public void test77()
    {
        mockComputeNextDate.findNextDate(11, 1, 1911);
    }

    @Test
    public void test78()
    {
        mockComputeNextDate.findNextDate(11, 1, 2020);
    }

    @Test
    public void test79()
    {
        mockComputeNextDate.findNextDate(11, 1, 2021);
    }

    @Test
    public void test80()
    {
        mockComputeNextDate.findNextDate(11, 2, 1801);
    }

    @Test
    public void test81()
    {
        mockComputeNextDate.findNextDate(11, 2, 1802);
    }

    @Test
    public void test82()
    {
        mockComputeNextDate.findNextDate(11, 2, 1911);
    }

    @Test
    public void test83()
    {
        mockComputeNextDate.findNextDate(11, 2, 2020);
    }

    @Test
    public void test84()
    {
        mockComputeNextDate.findNextDate(11, 2, 2021);
    }

    @Test
    public void test85()
    {
        mockComputeNextDate.findNextDate(11, 16, 1801);
    }

    @Test
    public void test86()
    {
        mockComputeNextDate.findNextDate(11, 16, 1802);
    }

    @Test
    public void test87()
    {
        mockComputeNextDate.findNextDate(11, 16, 1911);
    }

    @Test
    public void test88()
    {
        mockComputeNextDate.findNextDate(11, 16, 2020);
    }

    @Test
    public void test89()
    {
        mockComputeNextDate.findNextDate(11, 16, 2021);
    }

    @Test
    public void test90()
    {
        mockComputeNextDate.findNextDate(11, 30, 1801);
    }

    @Test
    public void test91()
    {
        mockComputeNextDate.findNextDate(11, 30, 1802);
    }

    @Test
    public void test92()
    {
        mockComputeNextDate.findNextDate(11, 30, 1911);
    }

    @Test
    public void test93()
    {
        mockComputeNextDate.findNextDate(11, 30, 2020);
    }

    @Test
    public void test94()
    {
        mockComputeNextDate.findNextDate(11, 30, 2021);
    }

    @Test
    public void test95()
    {
        mockComputeNextDate.findNextDate(11, 31, 1801);
    }

    @Test
    public void test96()
    {
        mockComputeNextDate.findNextDate(11, 31, 1802);
    }

    @Test
    public void test97()
    {
        mockComputeNextDate.findNextDate(11, 31, 1911);
    }

    @Test
    public void test98()
    {
        mockComputeNextDate.findNextDate(11, 31, 2020);
    }

    @Test
    public void test99()
    {
        mockComputeNextDate.findNextDate(11, 31, 2021);
    }

    @Test
    public void test100()
    {
        mockComputeNextDate.findNextDate(12, 1, 1801);
    }

    @Test
    public void test101()
    {
        mockComputeNextDate.findNextDate(12, 1, 1802);
    }

    @Test
    public void test102()
    {
        mockComputeNextDate.findNextDate(12, 1, 1911);
    }

    @Test
    public void test103()
    {
        mockComputeNextDate.findNextDate(12, 1, 2020);
    }

    @Test
    public void test104()
    {
        mockComputeNextDate.findNextDate(12, 1, 2021);
    }

    @Test
    public void test105()
    {
        mockComputeNextDate.findNextDate(12, 2, 1801);
    }

    @Test
    public void test106()
    {
        mockComputeNextDate.findNextDate(12, 2, 1802);
    }

    @Test
    public void test107()
    {
        mockComputeNextDate.findNextDate(12, 2, 1911);
    }

    @Test
    public void test108()
    {
        mockComputeNextDate.findNextDate(12, 2, 2020);
    }

    @Test
    public void test109()
    {
        mockComputeNextDate.findNextDate(12, 2, 2021);
    }

    @Test
    public void test110()
    {
        mockComputeNextDate.findNextDate(12, 16, 1801);
    }

    @Test
    public void test111()
    {
        mockComputeNextDate.findNextDate(12, 16, 1802);
    }

    @Test
    public void test112()
    {
        mockComputeNextDate.findNextDate(12, 16, 1911);
    }

    @Test
    public void test113()
    {
        mockComputeNextDate.findNextDate(12, 16, 2020);
    }

    @Test
    public void test114()
    {
        mockComputeNextDate.findNextDate(12, 16, 2021);
    }

    @Test
    public void test115()
    {
        mockComputeNextDate.findNextDate(12, 30, 1801);
    }

    @Test
    public void test116()
    {
        mockComputeNextDate.findNextDate(12, 30, 1802);
    }

    @Test
    public void test117()
    {
        mockComputeNextDate.findNextDate(12, 30, 1911);
    }

    @Test
    public void test118()
    {
        mockComputeNextDate.findNextDate(12, 30, 2020);
    }

    @Test
    public void test119()
    {
        mockComputeNextDate.findNextDate(12, 30, 2021);
    }

    @Test
    public void test120()
    {
        mockComputeNextDate.findNextDate(12, 31, 1801);
    }

    @Test
    public void test121()
    {
        mockComputeNextDate.findNextDate(12, 31, 1802);
    }

    @Test
    public void test122()
    {
        mockComputeNextDate.findNextDate(12, 31, 1911);
    }

    @Test
    public void test123()
    {
        mockComputeNextDate.findNextDate(12, 31, 2020);
    }

    @Test
    public void test124()
    {
        mockComputeNextDate.findNextDate(12, 31, 2021);
    }

}