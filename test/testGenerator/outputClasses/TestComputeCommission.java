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
        mockComputeCommission.findTotalCommission(1, 1, 1);
    }

    @Test
    public void test1()
    {
        mockComputeCommission.findTotalCommission(1, 1, 2);
    }

    @Test
    public void test2()
    {
        mockComputeCommission.findTotalCommission(1, 1, 45);
    }

    @Test
    public void test3()
    {
        mockComputeCommission.findTotalCommission(1, 1, 89);
    }

    @Test
    public void test4()
    {
        mockComputeCommission.findTotalCommission(1, 1, 90);
    }

    @Test
    public void test5()
    {
        mockComputeCommission.findTotalCommission(1, 2, 1);
    }

    @Test
    public void test6()
    {
        mockComputeCommission.findTotalCommission(1, 2, 2);
    }

    @Test
    public void test7()
    {
        mockComputeCommission.findTotalCommission(1, 2, 45);
    }

    @Test
    public void test8()
    {
        mockComputeCommission.findTotalCommission(1, 2, 89);
    }

    @Test
    public void test9()
    {
        mockComputeCommission.findTotalCommission(1, 2, 90);
    }

    @Test
    public void test10()
    {
        mockComputeCommission.findTotalCommission(1, 40, 1);
    }

    @Test
    public void test11()
    {
        mockComputeCommission.findTotalCommission(1, 40, 2);
    }

    @Test
    public void test12()
    {
        mockComputeCommission.findTotalCommission(1, 40, 45);
    }

    @Test
    public void test13()
    {
        mockComputeCommission.findTotalCommission(1, 40, 89);
    }

    @Test
    public void test14()
    {
        mockComputeCommission.findTotalCommission(1, 40, 90);
    }

    @Test
    public void test15()
    {
        mockComputeCommission.findTotalCommission(1, 79, 1);
    }

    @Test
    public void test16()
    {
        mockComputeCommission.findTotalCommission(1, 79, 2);
    }

    @Test
    public void test17()
    {
        mockComputeCommission.findTotalCommission(1, 79, 45);
    }

    @Test
    public void test18()
    {
        mockComputeCommission.findTotalCommission(1, 79, 89);
    }

    @Test
    public void test19()
    {
        mockComputeCommission.findTotalCommission(1, 79, 90);
    }

    @Test
    public void test20()
    {
        mockComputeCommission.findTotalCommission(1, 80, 1);
    }

    @Test
    public void test21()
    {
        mockComputeCommission.findTotalCommission(1, 80, 2);
    }

    @Test
    public void test22()
    {
        mockComputeCommission.findTotalCommission(1, 80, 45);
    }

    @Test
    public void test23()
    {
        mockComputeCommission.findTotalCommission(1, 80, 89);
    }

    @Test
    public void test24()
    {
        mockComputeCommission.findTotalCommission(1, 80, 90);
    }

    @Test
    public void test25()
    {
        mockComputeCommission.findTotalCommission(2, 1, 1);
    }

    @Test
    public void test26()
    {
        mockComputeCommission.findTotalCommission(2, 1, 2);
    }

    @Test
    public void test27()
    {
        mockComputeCommission.findTotalCommission(2, 1, 45);
    }

    @Test
    public void test28()
    {
        mockComputeCommission.findTotalCommission(2, 1, 89);
    }

    @Test
    public void test29()
    {
        mockComputeCommission.findTotalCommission(2, 1, 90);
    }

    @Test
    public void test30()
    {
        mockComputeCommission.findTotalCommission(2, 2, 1);
    }

    @Test
    public void test31()
    {
        mockComputeCommission.findTotalCommission(2, 2, 2);
    }

    @Test
    public void test32()
    {
        mockComputeCommission.findTotalCommission(2, 2, 45);
    }

    @Test
    public void test33()
    {
        mockComputeCommission.findTotalCommission(2, 2, 89);
    }

    @Test
    public void test34()
    {
        mockComputeCommission.findTotalCommission(2, 2, 90);
    }

    @Test
    public void test35()
    {
        mockComputeCommission.findTotalCommission(2, 40, 1);
    }

    @Test
    public void test36()
    {
        mockComputeCommission.findTotalCommission(2, 40, 2);
    }

    @Test
    public void test37()
    {
        mockComputeCommission.findTotalCommission(2, 40, 45);
    }

    @Test
    public void test38()
    {
        mockComputeCommission.findTotalCommission(2, 40, 89);
    }

    @Test
    public void test39()
    {
        mockComputeCommission.findTotalCommission(2, 40, 90);
    }

    @Test
    public void test40()
    {
        mockComputeCommission.findTotalCommission(2, 79, 1);
    }

    @Test
    public void test41()
    {
        mockComputeCommission.findTotalCommission(2, 79, 2);
    }

    @Test
    public void test42()
    {
        mockComputeCommission.findTotalCommission(2, 79, 45);
    }

    @Test
    public void test43()
    {
        mockComputeCommission.findTotalCommission(2, 79, 89);
    }

    @Test
    public void test44()
    {
        mockComputeCommission.findTotalCommission(2, 79, 90);
    }

    @Test
    public void test45()
    {
        mockComputeCommission.findTotalCommission(2, 80, 1);
    }

    @Test
    public void test46()
    {
        mockComputeCommission.findTotalCommission(2, 80, 2);
    }

    @Test
    public void test47()
    {
        mockComputeCommission.findTotalCommission(2, 80, 45);
    }

    @Test
    public void test48()
    {
        mockComputeCommission.findTotalCommission(2, 80, 89);
    }

    @Test
    public void test49()
    {
        mockComputeCommission.findTotalCommission(2, 80, 90);
    }

    @Test
    public void test50()
    {
        mockComputeCommission.findTotalCommission(35, 1, 1);
    }

    @Test
    public void test51()
    {
        mockComputeCommission.findTotalCommission(35, 1, 2);
    }

    @Test
    public void test52()
    {
        mockComputeCommission.findTotalCommission(35, 1, 45);
    }

    @Test
    public void test53()
    {
        mockComputeCommission.findTotalCommission(35, 1, 89);
    }

    @Test
    public void test54()
    {
        mockComputeCommission.findTotalCommission(35, 1, 90);
    }

    @Test
    public void test55()
    {
        mockComputeCommission.findTotalCommission(35, 2, 1);
    }

    @Test
    public void test56()
    {
        mockComputeCommission.findTotalCommission(35, 2, 2);
    }

    @Test
    public void test57()
    {
        mockComputeCommission.findTotalCommission(35, 2, 45);
    }

    @Test
    public void test58()
    {
        mockComputeCommission.findTotalCommission(35, 2, 89);
    }

    @Test
    public void test59()
    {
        mockComputeCommission.findTotalCommission(35, 2, 90);
    }

    @Test
    public void test60()
    {
        mockComputeCommission.findTotalCommission(35, 40, 1);
    }

    @Test
    public void test61()
    {
        mockComputeCommission.findTotalCommission(35, 40, 2);
    }

    @Test
    public void test62()
    {
        mockComputeCommission.findTotalCommission(35, 40, 45);
    }

    @Test
    public void test63()
    {
        mockComputeCommission.findTotalCommission(35, 40, 89);
    }

    @Test
    public void test64()
    {
        mockComputeCommission.findTotalCommission(35, 40, 90);
    }

    @Test
    public void test65()
    {
        mockComputeCommission.findTotalCommission(35, 79, 1);
    }

    @Test
    public void test66()
    {
        mockComputeCommission.findTotalCommission(35, 79, 2);
    }

    @Test
    public void test67()
    {
        mockComputeCommission.findTotalCommission(35, 79, 45);
    }

    @Test
    public void test68()
    {
        mockComputeCommission.findTotalCommission(35, 79, 89);
    }

    @Test
    public void test69()
    {
        mockComputeCommission.findTotalCommission(35, 79, 90);
    }

    @Test
    public void test70()
    {
        mockComputeCommission.findTotalCommission(35, 80, 1);
    }

    @Test
    public void test71()
    {
        mockComputeCommission.findTotalCommission(35, 80, 2);
    }

    @Test
    public void test72()
    {
        mockComputeCommission.findTotalCommission(35, 80, 45);
    }

    @Test
    public void test73()
    {
        mockComputeCommission.findTotalCommission(35, 80, 89);
    }

    @Test
    public void test74()
    {
        mockComputeCommission.findTotalCommission(35, 80, 90);
    }

    @Test
    public void test75()
    {
        mockComputeCommission.findTotalCommission(69, 1, 1);
    }

    @Test
    public void test76()
    {
        mockComputeCommission.findTotalCommission(69, 1, 2);
    }

    @Test
    public void test77()
    {
        mockComputeCommission.findTotalCommission(69, 1, 45);
    }

    @Test
    public void test78()
    {
        mockComputeCommission.findTotalCommission(69, 1, 89);
    }

    @Test
    public void test79()
    {
        mockComputeCommission.findTotalCommission(69, 1, 90);
    }

    @Test
    public void test80()
    {
        mockComputeCommission.findTotalCommission(69, 2, 1);
    }

    @Test
    public void test81()
    {
        mockComputeCommission.findTotalCommission(69, 2, 2);
    }

    @Test
    public void test82()
    {
        mockComputeCommission.findTotalCommission(69, 2, 45);
    }

    @Test
    public void test83()
    {
        mockComputeCommission.findTotalCommission(69, 2, 89);
    }

    @Test
    public void test84()
    {
        mockComputeCommission.findTotalCommission(69, 2, 90);
    }

    @Test
    public void test85()
    {
        mockComputeCommission.findTotalCommission(69, 40, 1);
    }

    @Test
    public void test86()
    {
        mockComputeCommission.findTotalCommission(69, 40, 2);
    }

    @Test
    public void test87()
    {
        mockComputeCommission.findTotalCommission(69, 40, 45);
    }

    @Test
    public void test88()
    {
        mockComputeCommission.findTotalCommission(69, 40, 89);
    }

    @Test
    public void test89()
    {
        mockComputeCommission.findTotalCommission(69, 40, 90);
    }

    @Test
    public void test90()
    {
        mockComputeCommission.findTotalCommission(69, 79, 1);
    }

    @Test
    public void test91()
    {
        mockComputeCommission.findTotalCommission(69, 79, 2);
    }

    @Test
    public void test92()
    {
        mockComputeCommission.findTotalCommission(69, 79, 45);
    }

    @Test
    public void test93()
    {
        mockComputeCommission.findTotalCommission(69, 79, 89);
    }

    @Test
    public void test94()
    {
        mockComputeCommission.findTotalCommission(69, 79, 90);
    }

    @Test
    public void test95()
    {
        mockComputeCommission.findTotalCommission(69, 80, 1);
    }

    @Test
    public void test96()
    {
        mockComputeCommission.findTotalCommission(69, 80, 2);
    }

    @Test
    public void test97()
    {
        mockComputeCommission.findTotalCommission(69, 80, 45);
    }

    @Test
    public void test98()
    {
        mockComputeCommission.findTotalCommission(69, 80, 89);
    }

    @Test
    public void test99()
    {
        mockComputeCommission.findTotalCommission(69, 80, 90);
    }

    @Test
    public void test100()
    {
        mockComputeCommission.findTotalCommission(70, 1, 1);
    }

    @Test
    public void test101()
    {
        mockComputeCommission.findTotalCommission(70, 1, 2);
    }

    @Test
    public void test102()
    {
        mockComputeCommission.findTotalCommission(70, 1, 45);
    }

    @Test
    public void test103()
    {
        mockComputeCommission.findTotalCommission(70, 1, 89);
    }

    @Test
    public void test104()
    {
        mockComputeCommission.findTotalCommission(70, 1, 90);
    }

    @Test
    public void test105()
    {
        mockComputeCommission.findTotalCommission(70, 2, 1);
    }

    @Test
    public void test106()
    {
        mockComputeCommission.findTotalCommission(70, 2, 2);
    }

    @Test
    public void test107()
    {
        mockComputeCommission.findTotalCommission(70, 2, 45);
    }

    @Test
    public void test108()
    {
        mockComputeCommission.findTotalCommission(70, 2, 89);
    }

    @Test
    public void test109()
    {
        mockComputeCommission.findTotalCommission(70, 2, 90);
    }

    @Test
    public void test110()
    {
        mockComputeCommission.findTotalCommission(70, 40, 1);
    }

    @Test
    public void test111()
    {
        mockComputeCommission.findTotalCommission(70, 40, 2);
    }

    @Test
    public void test112()
    {
        mockComputeCommission.findTotalCommission(70, 40, 45);
    }

    @Test
    public void test113()
    {
        mockComputeCommission.findTotalCommission(70, 40, 89);
    }

    @Test
    public void test114()
    {
        mockComputeCommission.findTotalCommission(70, 40, 90);
    }

    @Test
    public void test115()
    {
        mockComputeCommission.findTotalCommission(70, 79, 1);
    }

    @Test
    public void test116()
    {
        mockComputeCommission.findTotalCommission(70, 79, 2);
    }

    @Test
    public void test117()
    {
        mockComputeCommission.findTotalCommission(70, 79, 45);
    }

    @Test
    public void test118()
    {
        mockComputeCommission.findTotalCommission(70, 79, 89);
    }

    @Test
    public void test119()
    {
        mockComputeCommission.findTotalCommission(70, 79, 90);
    }

    @Test
    public void test120()
    {
        mockComputeCommission.findTotalCommission(70, 80, 1);
    }

    @Test
    public void test121()
    {
        mockComputeCommission.findTotalCommission(70, 80, 2);
    }

    @Test
    public void test122()
    {
        mockComputeCommission.findTotalCommission(70, 80, 45);
    }

    @Test
    public void test123()
    {
        mockComputeCommission.findTotalCommission(70, 80, 89);
    }

    @Test
    public void test124()
    {
        mockComputeCommission.findTotalCommission(70, 80, 90);
    }

}