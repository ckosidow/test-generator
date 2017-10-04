package cs411.testGenerator.outputClasses;

import cs411.testGenerator.inputClasses.ComputeTriangle;
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
        mockComputeTriangle.findTriangle(5, 5, 5);
    }

    @Test
    public void test1()
    {
        mockComputeTriangle.findTriangle(5, 5, 6);
    }

    @Test
    public void test2()
    {
        mockComputeTriangle.findTriangle(5, 5, 105);
    }

    @Test
    public void test3()
    {
        mockComputeTriangle.findTriangle(5, 5, 204);
    }

    @Test
    public void test4()
    {
        mockComputeTriangle.findTriangle(5, 5, 205);
    }

    @Test
    public void test5()
    {
        mockComputeTriangle.findTriangle(5, 5, 4);
    }

    @Test
    public void test6()
    {
        mockComputeTriangle.findTriangle(5, 5, 206);
    }

    @Test
    public void test7()
    {
        mockComputeTriangle.findTriangle(5, 6, 5);
    }

    @Test
    public void test8()
    {
        mockComputeTriangle.findTriangle(5, 6, 6);
    }

    @Test
    public void test9()
    {
        mockComputeTriangle.findTriangle(5, 6, 105);
    }

    @Test
    public void test10()
    {
        mockComputeTriangle.findTriangle(5, 6, 204);
    }

    @Test
    public void test11()
    {
        mockComputeTriangle.findTriangle(5, 6, 205);
    }

    @Test
    public void test12()
    {
        mockComputeTriangle.findTriangle(5, 6, 4);
    }

    @Test
    public void test13()
    {
        mockComputeTriangle.findTriangle(5, 6, 206);
    }

    @Test
    public void test14()
    {
        mockComputeTriangle.findTriangle(5, 105, 5);
    }

    @Test
    public void test15()
    {
        mockComputeTriangle.findTriangle(5, 105, 6);
    }

    @Test
    public void test16()
    {
        mockComputeTriangle.findTriangle(5, 105, 105);
    }

    @Test
    public void test17()
    {
        mockComputeTriangle.findTriangle(5, 105, 204);
    }

    @Test
    public void test18()
    {
        mockComputeTriangle.findTriangle(5, 105, 205);
    }

    @Test
    public void test19()
    {
        mockComputeTriangle.findTriangle(5, 105, 4);
    }

    @Test
    public void test20()
    {
        mockComputeTriangle.findTriangle(5, 105, 206);
    }

    @Test
    public void test21()
    {
        mockComputeTriangle.findTriangle(5, 204, 5);
    }

    @Test
    public void test22()
    {
        mockComputeTriangle.findTriangle(5, 204, 6);
    }

    @Test
    public void test23()
    {
        mockComputeTriangle.findTriangle(5, 204, 105);
    }

    @Test
    public void test24()
    {
        mockComputeTriangle.findTriangle(5, 204, 204);
    }

    @Test
    public void test25()
    {
        mockComputeTriangle.findTriangle(5, 204, 205);
    }

    @Test
    public void test26()
    {
        mockComputeTriangle.findTriangle(5, 204, 4);
    }

    @Test
    public void test27()
    {
        mockComputeTriangle.findTriangle(5, 204, 206);
    }

    @Test
    public void test28()
    {
        mockComputeTriangle.findTriangle(5, 205, 5);
    }

    @Test
    public void test29()
    {
        mockComputeTriangle.findTriangle(5, 205, 6);
    }

    @Test
    public void test30()
    {
        mockComputeTriangle.findTriangle(5, 205, 105);
    }

    @Test
    public void test31()
    {
        mockComputeTriangle.findTriangle(5, 205, 204);
    }

    @Test
    public void test32()
    {
        mockComputeTriangle.findTriangle(5, 205, 205);
    }

    @Test
    public void test33()
    {
        mockComputeTriangle.findTriangle(5, 205, 4);
    }

    @Test
    public void test34()
    {
        mockComputeTriangle.findTriangle(5, 205, 206);
    }

    @Test
    public void test35()
    {
        mockComputeTriangle.findTriangle(5, 4, 5);
    }

    @Test
    public void test36()
    {
        mockComputeTriangle.findTriangle(5, 4, 6);
    }

    @Test
    public void test37()
    {
        mockComputeTriangle.findTriangle(5, 4, 105);
    }

    @Test
    public void test38()
    {
        mockComputeTriangle.findTriangle(5, 4, 204);
    }

    @Test
    public void test39()
    {
        mockComputeTriangle.findTriangle(5, 4, 205);
    }

    @Test
    public void test40()
    {
        mockComputeTriangle.findTriangle(5, 4, 4);
    }

    @Test
    public void test41()
    {
        mockComputeTriangle.findTriangle(5, 4, 206);
    }

    @Test
    public void test42()
    {
        mockComputeTriangle.findTriangle(5, 206, 5);
    }

    @Test
    public void test43()
    {
        mockComputeTriangle.findTriangle(5, 206, 6);
    }

    @Test
    public void test44()
    {
        mockComputeTriangle.findTriangle(5, 206, 105);
    }

    @Test
    public void test45()
    {
        mockComputeTriangle.findTriangle(5, 206, 204);
    }

    @Test
    public void test46()
    {
        mockComputeTriangle.findTriangle(5, 206, 205);
    }

    @Test
    public void test47()
    {
        mockComputeTriangle.findTriangle(5, 206, 4);
    }

    @Test
    public void test48()
    {
        mockComputeTriangle.findTriangle(5, 206, 206);
    }

    @Test
    public void test49()
    {
        mockComputeTriangle.findTriangle(6, 5, 5);
    }

    @Test
    public void test50()
    {
        mockComputeTriangle.findTriangle(6, 5, 6);
    }

    @Test
    public void test51()
    {
        mockComputeTriangle.findTriangle(6, 5, 105);
    }

    @Test
    public void test52()
    {
        mockComputeTriangle.findTriangle(6, 5, 204);
    }

    @Test
    public void test53()
    {
        mockComputeTriangle.findTriangle(6, 5, 205);
    }

    @Test
    public void test54()
    {
        mockComputeTriangle.findTriangle(6, 5, 4);
    }

    @Test
    public void test55()
    {
        mockComputeTriangle.findTriangle(6, 5, 206);
    }

    @Test
    public void test56()
    {
        mockComputeTriangle.findTriangle(6, 6, 5);
    }

    @Test
    public void test57()
    {
        mockComputeTriangle.findTriangle(6, 6, 6);
    }

    @Test
    public void test58()
    {
        mockComputeTriangle.findTriangle(6, 6, 105);
    }

    @Test
    public void test59()
    {
        mockComputeTriangle.findTriangle(6, 6, 204);
    }

    @Test
    public void test60()
    {
        mockComputeTriangle.findTriangle(6, 6, 205);
    }

    @Test
    public void test61()
    {
        mockComputeTriangle.findTriangle(6, 6, 4);
    }

    @Test
    public void test62()
    {
        mockComputeTriangle.findTriangle(6, 6, 206);
    }

    @Test
    public void test63()
    {
        mockComputeTriangle.findTriangle(6, 105, 5);
    }

    @Test
    public void test64()
    {
        mockComputeTriangle.findTriangle(6, 105, 6);
    }

    @Test
    public void test65()
    {
        mockComputeTriangle.findTriangle(6, 105, 105);
    }

    @Test
    public void test66()
    {
        mockComputeTriangle.findTriangle(6, 105, 204);
    }

    @Test
    public void test67()
    {
        mockComputeTriangle.findTriangle(6, 105, 205);
    }

    @Test
    public void test68()
    {
        mockComputeTriangle.findTriangle(6, 105, 4);
    }

    @Test
    public void test69()
    {
        mockComputeTriangle.findTriangle(6, 105, 206);
    }

    @Test
    public void test70()
    {
        mockComputeTriangle.findTriangle(6, 204, 5);
    }

    @Test
    public void test71()
    {
        mockComputeTriangle.findTriangle(6, 204, 6);
    }

    @Test
    public void test72()
    {
        mockComputeTriangle.findTriangle(6, 204, 105);
    }

    @Test
    public void test73()
    {
        mockComputeTriangle.findTriangle(6, 204, 204);
    }

    @Test
    public void test74()
    {
        mockComputeTriangle.findTriangle(6, 204, 205);
    }

    @Test
    public void test75()
    {
        mockComputeTriangle.findTriangle(6, 204, 4);
    }

    @Test
    public void test76()
    {
        mockComputeTriangle.findTriangle(6, 204, 206);
    }

    @Test
    public void test77()
    {
        mockComputeTriangle.findTriangle(6, 205, 5);
    }

    @Test
    public void test78()
    {
        mockComputeTriangle.findTriangle(6, 205, 6);
    }

    @Test
    public void test79()
    {
        mockComputeTriangle.findTriangle(6, 205, 105);
    }

    @Test
    public void test80()
    {
        mockComputeTriangle.findTriangle(6, 205, 204);
    }

    @Test
    public void test81()
    {
        mockComputeTriangle.findTriangle(6, 205, 205);
    }

    @Test
    public void test82()
    {
        mockComputeTriangle.findTriangle(6, 205, 4);
    }

    @Test
    public void test83()
    {
        mockComputeTriangle.findTriangle(6, 205, 206);
    }

    @Test
    public void test84()
    {
        mockComputeTriangle.findTriangle(6, 4, 5);
    }

    @Test
    public void test85()
    {
        mockComputeTriangle.findTriangle(6, 4, 6);
    }

    @Test
    public void test86()
    {
        mockComputeTriangle.findTriangle(6, 4, 105);
    }

    @Test
    public void test87()
    {
        mockComputeTriangle.findTriangle(6, 4, 204);
    }

    @Test
    public void test88()
    {
        mockComputeTriangle.findTriangle(6, 4, 205);
    }

    @Test
    public void test89()
    {
        mockComputeTriangle.findTriangle(6, 4, 4);
    }

    @Test
    public void test90()
    {
        mockComputeTriangle.findTriangle(6, 4, 206);
    }

    @Test
    public void test91()
    {
        mockComputeTriangle.findTriangle(6, 206, 5);
    }

    @Test
    public void test92()
    {
        mockComputeTriangle.findTriangle(6, 206, 6);
    }

    @Test
    public void test93()
    {
        mockComputeTriangle.findTriangle(6, 206, 105);
    }

    @Test
    public void test94()
    {
        mockComputeTriangle.findTriangle(6, 206, 204);
    }

    @Test
    public void test95()
    {
        mockComputeTriangle.findTriangle(6, 206, 205);
    }

    @Test
    public void test96()
    {
        mockComputeTriangle.findTriangle(6, 206, 4);
    }

    @Test
    public void test97()
    {
        mockComputeTriangle.findTriangle(6, 206, 206);
    }

    @Test
    public void test98()
    {
        mockComputeTriangle.findTriangle(105, 5, 5);
    }

    @Test
    public void test99()
    {
        mockComputeTriangle.findTriangle(105, 5, 6);
    }

    @Test
    public void test100()
    {
        mockComputeTriangle.findTriangle(105, 5, 105);
    }

    @Test
    public void test101()
    {
        mockComputeTriangle.findTriangle(105, 5, 204);
    }

    @Test
    public void test102()
    {
        mockComputeTriangle.findTriangle(105, 5, 205);
    }

    @Test
    public void test103()
    {
        mockComputeTriangle.findTriangle(105, 5, 4);
    }

    @Test
    public void test104()
    {
        mockComputeTriangle.findTriangle(105, 5, 206);
    }

    @Test
    public void test105()
    {
        mockComputeTriangle.findTriangle(105, 6, 5);
    }

    @Test
    public void test106()
    {
        mockComputeTriangle.findTriangle(105, 6, 6);
    }

    @Test
    public void test107()
    {
        mockComputeTriangle.findTriangle(105, 6, 105);
    }

    @Test
    public void test108()
    {
        mockComputeTriangle.findTriangle(105, 6, 204);
    }

    @Test
    public void test109()
    {
        mockComputeTriangle.findTriangle(105, 6, 205);
    }

    @Test
    public void test110()
    {
        mockComputeTriangle.findTriangle(105, 6, 4);
    }

    @Test
    public void test111()
    {
        mockComputeTriangle.findTriangle(105, 6, 206);
    }

    @Test
    public void test112()
    {
        mockComputeTriangle.findTriangle(105, 105, 5);
    }

    @Test
    public void test113()
    {
        mockComputeTriangle.findTriangle(105, 105, 6);
    }

    @Test
    public void test114()
    {
        mockComputeTriangle.findTriangle(105, 105, 105);
    }

    @Test
    public void test115()
    {
        mockComputeTriangle.findTriangle(105, 105, 204);
    }

    @Test
    public void test116()
    {
        mockComputeTriangle.findTriangle(105, 105, 205);
    }

    @Test
    public void test117()
    {
        mockComputeTriangle.findTriangle(105, 105, 4);
    }

    @Test
    public void test118()
    {
        mockComputeTriangle.findTriangle(105, 105, 206);
    }

    @Test
    public void test119()
    {
        mockComputeTriangle.findTriangle(105, 204, 5);
    }

    @Test
    public void test120()
    {
        mockComputeTriangle.findTriangle(105, 204, 6);
    }

    @Test
    public void test121()
    {
        mockComputeTriangle.findTriangle(105, 204, 105);
    }

    @Test
    public void test122()
    {
        mockComputeTriangle.findTriangle(105, 204, 204);
    }

    @Test
    public void test123()
    {
        mockComputeTriangle.findTriangle(105, 204, 205);
    }

    @Test
    public void test124()
    {
        mockComputeTriangle.findTriangle(105, 204, 4);
    }

    @Test
    public void test125()
    {
        mockComputeTriangle.findTriangle(105, 204, 206);
    }

    @Test
    public void test126()
    {
        mockComputeTriangle.findTriangle(105, 205, 5);
    }

    @Test
    public void test127()
    {
        mockComputeTriangle.findTriangle(105, 205, 6);
    }

    @Test
    public void test128()
    {
        mockComputeTriangle.findTriangle(105, 205, 105);
    }

    @Test
    public void test129()
    {
        mockComputeTriangle.findTriangle(105, 205, 204);
    }

    @Test
    public void test130()
    {
        mockComputeTriangle.findTriangle(105, 205, 205);
    }

    @Test
    public void test131()
    {
        mockComputeTriangle.findTriangle(105, 205, 4);
    }

    @Test
    public void test132()
    {
        mockComputeTriangle.findTriangle(105, 205, 206);
    }

    @Test
    public void test133()
    {
        mockComputeTriangle.findTriangle(105, 4, 5);
    }

    @Test
    public void test134()
    {
        mockComputeTriangle.findTriangle(105, 4, 6);
    }

    @Test
    public void test135()
    {
        mockComputeTriangle.findTriangle(105, 4, 105);
    }

    @Test
    public void test136()
    {
        mockComputeTriangle.findTriangle(105, 4, 204);
    }

    @Test
    public void test137()
    {
        mockComputeTriangle.findTriangle(105, 4, 205);
    }

    @Test
    public void test138()
    {
        mockComputeTriangle.findTriangle(105, 4, 4);
    }

    @Test
    public void test139()
    {
        mockComputeTriangle.findTriangle(105, 4, 206);
    }

    @Test
    public void test140()
    {
        mockComputeTriangle.findTriangle(105, 206, 5);
    }

    @Test
    public void test141()
    {
        mockComputeTriangle.findTriangle(105, 206, 6);
    }

    @Test
    public void test142()
    {
        mockComputeTriangle.findTriangle(105, 206, 105);
    }

    @Test
    public void test143()
    {
        mockComputeTriangle.findTriangle(105, 206, 204);
    }

    @Test
    public void test144()
    {
        mockComputeTriangle.findTriangle(105, 206, 205);
    }

    @Test
    public void test145()
    {
        mockComputeTriangle.findTriangle(105, 206, 4);
    }

    @Test
    public void test146()
    {
        mockComputeTriangle.findTriangle(105, 206, 206);
    }

    @Test
    public void test147()
    {
        mockComputeTriangle.findTriangle(204, 5, 5);
    }

    @Test
    public void test148()
    {
        mockComputeTriangle.findTriangle(204, 5, 6);
    }

    @Test
    public void test149()
    {
        mockComputeTriangle.findTriangle(204, 5, 105);
    }

    @Test
    public void test150()
    {
        mockComputeTriangle.findTriangle(204, 5, 204);
    }

    @Test
    public void test151()
    {
        mockComputeTriangle.findTriangle(204, 5, 205);
    }

    @Test
    public void test152()
    {
        mockComputeTriangle.findTriangle(204, 5, 4);
    }

    @Test
    public void test153()
    {
        mockComputeTriangle.findTriangle(204, 5, 206);
    }

    @Test
    public void test154()
    {
        mockComputeTriangle.findTriangle(204, 6, 5);
    }

    @Test
    public void test155()
    {
        mockComputeTriangle.findTriangle(204, 6, 6);
    }

    @Test
    public void test156()
    {
        mockComputeTriangle.findTriangle(204, 6, 105);
    }

    @Test
    public void test157()
    {
        mockComputeTriangle.findTriangle(204, 6, 204);
    }

    @Test
    public void test158()
    {
        mockComputeTriangle.findTriangle(204, 6, 205);
    }

    @Test
    public void test159()
    {
        mockComputeTriangle.findTriangle(204, 6, 4);
    }

    @Test
    public void test160()
    {
        mockComputeTriangle.findTriangle(204, 6, 206);
    }

    @Test
    public void test161()
    {
        mockComputeTriangle.findTriangle(204, 105, 5);
    }

    @Test
    public void test162()
    {
        mockComputeTriangle.findTriangle(204, 105, 6);
    }

    @Test
    public void test163()
    {
        mockComputeTriangle.findTriangle(204, 105, 105);
    }

    @Test
    public void test164()
    {
        mockComputeTriangle.findTriangle(204, 105, 204);
    }

    @Test
    public void test165()
    {
        mockComputeTriangle.findTriangle(204, 105, 205);
    }

    @Test
    public void test166()
    {
        mockComputeTriangle.findTriangle(204, 105, 4);
    }

    @Test
    public void test167()
    {
        mockComputeTriangle.findTriangle(204, 105, 206);
    }

    @Test
    public void test168()
    {
        mockComputeTriangle.findTriangle(204, 204, 5);
    }

    @Test
    public void test169()
    {
        mockComputeTriangle.findTriangle(204, 204, 6);
    }

    @Test
    public void test170()
    {
        mockComputeTriangle.findTriangle(204, 204, 105);
    }

    @Test
    public void test171()
    {
        mockComputeTriangle.findTriangle(204, 204, 204);
    }

    @Test
    public void test172()
    {
        mockComputeTriangle.findTriangle(204, 204, 205);
    }

    @Test
    public void test173()
    {
        mockComputeTriangle.findTriangle(204, 204, 4);
    }

    @Test
    public void test174()
    {
        mockComputeTriangle.findTriangle(204, 204, 206);
    }

    @Test
    public void test175()
    {
        mockComputeTriangle.findTriangle(204, 205, 5);
    }

    @Test
    public void test176()
    {
        mockComputeTriangle.findTriangle(204, 205, 6);
    }

    @Test
    public void test177()
    {
        mockComputeTriangle.findTriangle(204, 205, 105);
    }

    @Test
    public void test178()
    {
        mockComputeTriangle.findTriangle(204, 205, 204);
    }

    @Test
    public void test179()
    {
        mockComputeTriangle.findTriangle(204, 205, 205);
    }

    @Test
    public void test180()
    {
        mockComputeTriangle.findTriangle(204, 205, 4);
    }

    @Test
    public void test181()
    {
        mockComputeTriangle.findTriangle(204, 205, 206);
    }

    @Test
    public void test182()
    {
        mockComputeTriangle.findTriangle(204, 4, 5);
    }

    @Test
    public void test183()
    {
        mockComputeTriangle.findTriangle(204, 4, 6);
    }

    @Test
    public void test184()
    {
        mockComputeTriangle.findTriangle(204, 4, 105);
    }

    @Test
    public void test185()
    {
        mockComputeTriangle.findTriangle(204, 4, 204);
    }

    @Test
    public void test186()
    {
        mockComputeTriangle.findTriangle(204, 4, 205);
    }

    @Test
    public void test187()
    {
        mockComputeTriangle.findTriangle(204, 4, 4);
    }

    @Test
    public void test188()
    {
        mockComputeTriangle.findTriangle(204, 4, 206);
    }

    @Test
    public void test189()
    {
        mockComputeTriangle.findTriangle(204, 206, 5);
    }

    @Test
    public void test190()
    {
        mockComputeTriangle.findTriangle(204, 206, 6);
    }

    @Test
    public void test191()
    {
        mockComputeTriangle.findTriangle(204, 206, 105);
    }

    @Test
    public void test192()
    {
        mockComputeTriangle.findTriangle(204, 206, 204);
    }

    @Test
    public void test193()
    {
        mockComputeTriangle.findTriangle(204, 206, 205);
    }

    @Test
    public void test194()
    {
        mockComputeTriangle.findTriangle(204, 206, 4);
    }

    @Test
    public void test195()
    {
        mockComputeTriangle.findTriangle(204, 206, 206);
    }

    @Test
    public void test196()
    {
        mockComputeTriangle.findTriangle(205, 5, 5);
    }

    @Test
    public void test197()
    {
        mockComputeTriangle.findTriangle(205, 5, 6);
    }

    @Test
    public void test198()
    {
        mockComputeTriangle.findTriangle(205, 5, 105);
    }

    @Test
    public void test199()
    {
        mockComputeTriangle.findTriangle(205, 5, 204);
    }

    @Test
    public void test200()
    {
        mockComputeTriangle.findTriangle(205, 5, 205);
    }

    @Test
    public void test201()
    {
        mockComputeTriangle.findTriangle(205, 5, 4);
    }

    @Test
    public void test202()
    {
        mockComputeTriangle.findTriangle(205, 5, 206);
    }

    @Test
    public void test203()
    {
        mockComputeTriangle.findTriangle(205, 6, 5);
    }

    @Test
    public void test204()
    {
        mockComputeTriangle.findTriangle(205, 6, 6);
    }

    @Test
    public void test205()
    {
        mockComputeTriangle.findTriangle(205, 6, 105);
    }

    @Test
    public void test206()
    {
        mockComputeTriangle.findTriangle(205, 6, 204);
    }

    @Test
    public void test207()
    {
        mockComputeTriangle.findTriangle(205, 6, 205);
    }

    @Test
    public void test208()
    {
        mockComputeTriangle.findTriangle(205, 6, 4);
    }

    @Test
    public void test209()
    {
        mockComputeTriangle.findTriangle(205, 6, 206);
    }

    @Test
    public void test210()
    {
        mockComputeTriangle.findTriangle(205, 105, 5);
    }

    @Test
    public void test211()
    {
        mockComputeTriangle.findTriangle(205, 105, 6);
    }

    @Test
    public void test212()
    {
        mockComputeTriangle.findTriangle(205, 105, 105);
    }

    @Test
    public void test213()
    {
        mockComputeTriangle.findTriangle(205, 105, 204);
    }

    @Test
    public void test214()
    {
        mockComputeTriangle.findTriangle(205, 105, 205);
    }

    @Test
    public void test215()
    {
        mockComputeTriangle.findTriangle(205, 105, 4);
    }

    @Test
    public void test216()
    {
        mockComputeTriangle.findTriangle(205, 105, 206);
    }

    @Test
    public void test217()
    {
        mockComputeTriangle.findTriangle(205, 204, 5);
    }

    @Test
    public void test218()
    {
        mockComputeTriangle.findTriangle(205, 204, 6);
    }

    @Test
    public void test219()
    {
        mockComputeTriangle.findTriangle(205, 204, 105);
    }

    @Test
    public void test220()
    {
        mockComputeTriangle.findTriangle(205, 204, 204);
    }

    @Test
    public void test221()
    {
        mockComputeTriangle.findTriangle(205, 204, 205);
    }

    @Test
    public void test222()
    {
        mockComputeTriangle.findTriangle(205, 204, 4);
    }

    @Test
    public void test223()
    {
        mockComputeTriangle.findTriangle(205, 204, 206);
    }

    @Test
    public void test224()
    {
        mockComputeTriangle.findTriangle(205, 205, 5);
    }

    @Test
    public void test225()
    {
        mockComputeTriangle.findTriangle(205, 205, 6);
    }

    @Test
    public void test226()
    {
        mockComputeTriangle.findTriangle(205, 205, 105);
    }

    @Test
    public void test227()
    {
        mockComputeTriangle.findTriangle(205, 205, 204);
    }

    @Test
    public void test228()
    {
        mockComputeTriangle.findTriangle(205, 205, 205);
    }

    @Test
    public void test229()
    {
        mockComputeTriangle.findTriangle(205, 205, 4);
    }

    @Test
    public void test230()
    {
        mockComputeTriangle.findTriangle(205, 205, 206);
    }

    @Test
    public void test231()
    {
        mockComputeTriangle.findTriangle(205, 4, 5);
    }

    @Test
    public void test232()
    {
        mockComputeTriangle.findTriangle(205, 4, 6);
    }

    @Test
    public void test233()
    {
        mockComputeTriangle.findTriangle(205, 4, 105);
    }

    @Test
    public void test234()
    {
        mockComputeTriangle.findTriangle(205, 4, 204);
    }

    @Test
    public void test235()
    {
        mockComputeTriangle.findTriangle(205, 4, 205);
    }

    @Test
    public void test236()
    {
        mockComputeTriangle.findTriangle(205, 4, 4);
    }

    @Test
    public void test237()
    {
        mockComputeTriangle.findTriangle(205, 4, 206);
    }

    @Test
    public void test238()
    {
        mockComputeTriangle.findTriangle(205, 206, 5);
    }

    @Test
    public void test239()
    {
        mockComputeTriangle.findTriangle(205, 206, 6);
    }

    @Test
    public void test240()
    {
        mockComputeTriangle.findTriangle(205, 206, 105);
    }

    @Test
    public void test241()
    {
        mockComputeTriangle.findTriangle(205, 206, 204);
    }

    @Test
    public void test242()
    {
        mockComputeTriangle.findTriangle(205, 206, 205);
    }

    @Test
    public void test243()
    {
        mockComputeTriangle.findTriangle(205, 206, 4);
    }

    @Test
    public void test244()
    {
        mockComputeTriangle.findTriangle(205, 206, 206);
    }

    @Test
    public void test245()
    {
        mockComputeTriangle.findTriangle(4, 5, 5);
    }

    @Test
    public void test246()
    {
        mockComputeTriangle.findTriangle(4, 5, 6);
    }

    @Test
    public void test247()
    {
        mockComputeTriangle.findTriangle(4, 5, 105);
    }

    @Test
    public void test248()
    {
        mockComputeTriangle.findTriangle(4, 5, 204);
    }

    @Test
    public void test249()
    {
        mockComputeTriangle.findTriangle(4, 5, 205);
    }

    @Test
    public void test250()
    {
        mockComputeTriangle.findTriangle(4, 5, 4);
    }

    @Test
    public void test251()
    {
        mockComputeTriangle.findTriangle(4, 5, 206);
    }

    @Test
    public void test252()
    {
        mockComputeTriangle.findTriangle(4, 6, 5);
    }

    @Test
    public void test253()
    {
        mockComputeTriangle.findTriangle(4, 6, 6);
    }

    @Test
    public void test254()
    {
        mockComputeTriangle.findTriangle(4, 6, 105);
    }

    @Test
    public void test255()
    {
        mockComputeTriangle.findTriangle(4, 6, 204);
    }

    @Test
    public void test256()
    {
        mockComputeTriangle.findTriangle(4, 6, 205);
    }

    @Test
    public void test257()
    {
        mockComputeTriangle.findTriangle(4, 6, 4);
    }

    @Test
    public void test258()
    {
        mockComputeTriangle.findTriangle(4, 6, 206);
    }

    @Test
    public void test259()
    {
        mockComputeTriangle.findTriangle(4, 105, 5);
    }

    @Test
    public void test260()
    {
        mockComputeTriangle.findTriangle(4, 105, 6);
    }

    @Test
    public void test261()
    {
        mockComputeTriangle.findTriangle(4, 105, 105);
    }

    @Test
    public void test262()
    {
        mockComputeTriangle.findTriangle(4, 105, 204);
    }

    @Test
    public void test263()
    {
        mockComputeTriangle.findTriangle(4, 105, 205);
    }

    @Test
    public void test264()
    {
        mockComputeTriangle.findTriangle(4, 105, 4);
    }

    @Test
    public void test265()
    {
        mockComputeTriangle.findTriangle(4, 105, 206);
    }

    @Test
    public void test266()
    {
        mockComputeTriangle.findTriangle(4, 204, 5);
    }

    @Test
    public void test267()
    {
        mockComputeTriangle.findTriangle(4, 204, 6);
    }

    @Test
    public void test268()
    {
        mockComputeTriangle.findTriangle(4, 204, 105);
    }

    @Test
    public void test269()
    {
        mockComputeTriangle.findTriangle(4, 204, 204);
    }

    @Test
    public void test270()
    {
        mockComputeTriangle.findTriangle(4, 204, 205);
    }

    @Test
    public void test271()
    {
        mockComputeTriangle.findTriangle(4, 204, 4);
    }

    @Test
    public void test272()
    {
        mockComputeTriangle.findTriangle(4, 204, 206);
    }

    @Test
    public void test273()
    {
        mockComputeTriangle.findTriangle(4, 205, 5);
    }

    @Test
    public void test274()
    {
        mockComputeTriangle.findTriangle(4, 205, 6);
    }

    @Test
    public void test275()
    {
        mockComputeTriangle.findTriangle(4, 205, 105);
    }

    @Test
    public void test276()
    {
        mockComputeTriangle.findTriangle(4, 205, 204);
    }

    @Test
    public void test277()
    {
        mockComputeTriangle.findTriangle(4, 205, 205);
    }

    @Test
    public void test278()
    {
        mockComputeTriangle.findTriangle(4, 205, 4);
    }

    @Test
    public void test279()
    {
        mockComputeTriangle.findTriangle(4, 205, 206);
    }

    @Test
    public void test280()
    {
        mockComputeTriangle.findTriangle(4, 4, 5);
    }

    @Test
    public void test281()
    {
        mockComputeTriangle.findTriangle(4, 4, 6);
    }

    @Test
    public void test282()
    {
        mockComputeTriangle.findTriangle(4, 4, 105);
    }

    @Test
    public void test283()
    {
        mockComputeTriangle.findTriangle(4, 4, 204);
    }

    @Test
    public void test284()
    {
        mockComputeTriangle.findTriangle(4, 4, 205);
    }

    @Test
    public void test285()
    {
        mockComputeTriangle.findTriangle(4, 4, 4);
    }

    @Test
    public void test286()
    {
        mockComputeTriangle.findTriangle(4, 4, 206);
    }

    @Test
    public void test287()
    {
        mockComputeTriangle.findTriangle(4, 206, 5);
    }

    @Test
    public void test288()
    {
        mockComputeTriangle.findTriangle(4, 206, 6);
    }

    @Test
    public void test289()
    {
        mockComputeTriangle.findTriangle(4, 206, 105);
    }

    @Test
    public void test290()
    {
        mockComputeTriangle.findTriangle(4, 206, 204);
    }

    @Test
    public void test291()
    {
        mockComputeTriangle.findTriangle(4, 206, 205);
    }

    @Test
    public void test292()
    {
        mockComputeTriangle.findTriangle(4, 206, 4);
    }

    @Test
    public void test293()
    {
        mockComputeTriangle.findTriangle(4, 206, 206);
    }

    @Test
    public void test294()
    {
        mockComputeTriangle.findTriangle(206, 5, 5);
    }

    @Test
    public void test295()
    {
        mockComputeTriangle.findTriangle(206, 5, 6);
    }

    @Test
    public void test296()
    {
        mockComputeTriangle.findTriangle(206, 5, 105);
    }

    @Test
    public void test297()
    {
        mockComputeTriangle.findTriangle(206, 5, 204);
    }

    @Test
    public void test298()
    {
        mockComputeTriangle.findTriangle(206, 5, 205);
    }

    @Test
    public void test299()
    {
        mockComputeTriangle.findTriangle(206, 5, 4);
    }

    @Test
    public void test300()
    {
        mockComputeTriangle.findTriangle(206, 5, 206);
    }

    @Test
    public void test301()
    {
        mockComputeTriangle.findTriangle(206, 6, 5);
    }

    @Test
    public void test302()
    {
        mockComputeTriangle.findTriangle(206, 6, 6);
    }

    @Test
    public void test303()
    {
        mockComputeTriangle.findTriangle(206, 6, 105);
    }

    @Test
    public void test304()
    {
        mockComputeTriangle.findTriangle(206, 6, 204);
    }

    @Test
    public void test305()
    {
        mockComputeTriangle.findTriangle(206, 6, 205);
    }

    @Test
    public void test306()
    {
        mockComputeTriangle.findTriangle(206, 6, 4);
    }

    @Test
    public void test307()
    {
        mockComputeTriangle.findTriangle(206, 6, 206);
    }

    @Test
    public void test308()
    {
        mockComputeTriangle.findTriangle(206, 105, 5);
    }

    @Test
    public void test309()
    {
        mockComputeTriangle.findTriangle(206, 105, 6);
    }

    @Test
    public void test310()
    {
        mockComputeTriangle.findTriangle(206, 105, 105);
    }

    @Test
    public void test311()
    {
        mockComputeTriangle.findTriangle(206, 105, 204);
    }

    @Test
    public void test312()
    {
        mockComputeTriangle.findTriangle(206, 105, 205);
    }

    @Test
    public void test313()
    {
        mockComputeTriangle.findTriangle(206, 105, 4);
    }

    @Test
    public void test314()
    {
        mockComputeTriangle.findTriangle(206, 105, 206);
    }

    @Test
    public void test315()
    {
        mockComputeTriangle.findTriangle(206, 204, 5);
    }

    @Test
    public void test316()
    {
        mockComputeTriangle.findTriangle(206, 204, 6);
    }

    @Test
    public void test317()
    {
        mockComputeTriangle.findTriangle(206, 204, 105);
    }

    @Test
    public void test318()
    {
        mockComputeTriangle.findTriangle(206, 204, 204);
    }

    @Test
    public void test319()
    {
        mockComputeTriangle.findTriangle(206, 204, 205);
    }

    @Test
    public void test320()
    {
        mockComputeTriangle.findTriangle(206, 204, 4);
    }

    @Test
    public void test321()
    {
        mockComputeTriangle.findTriangle(206, 204, 206);
    }

    @Test
    public void test322()
    {
        mockComputeTriangle.findTriangle(206, 205, 5);
    }

    @Test
    public void test323()
    {
        mockComputeTriangle.findTriangle(206, 205, 6);
    }

    @Test
    public void test324()
    {
        mockComputeTriangle.findTriangle(206, 205, 105);
    }

    @Test
    public void test325()
    {
        mockComputeTriangle.findTriangle(206, 205, 204);
    }

    @Test
    public void test326()
    {
        mockComputeTriangle.findTriangle(206, 205, 205);
    }

    @Test
    public void test327()
    {
        mockComputeTriangle.findTriangle(206, 205, 4);
    }

    @Test
    public void test328()
    {
        mockComputeTriangle.findTriangle(206, 205, 206);
    }

    @Test
    public void test329()
    {
        mockComputeTriangle.findTriangle(206, 4, 5);
    }

    @Test
    public void test330()
    {
        mockComputeTriangle.findTriangle(206, 4, 6);
    }

    @Test
    public void test331()
    {
        mockComputeTriangle.findTriangle(206, 4, 105);
    }

    @Test
    public void test332()
    {
        mockComputeTriangle.findTriangle(206, 4, 204);
    }

    @Test
    public void test333()
    {
        mockComputeTriangle.findTriangle(206, 4, 205);
    }

    @Test
    public void test334()
    {
        mockComputeTriangle.findTriangle(206, 4, 4);
    }

    @Test
    public void test335()
    {
        mockComputeTriangle.findTriangle(206, 4, 206);
    }

    @Test
    public void test336()
    {
        mockComputeTriangle.findTriangle(206, 206, 5);
    }

    @Test
    public void test337()
    {
        mockComputeTriangle.findTriangle(206, 206, 6);
    }

    @Test
    public void test338()
    {
        mockComputeTriangle.findTriangle(206, 206, 105);
    }

    @Test
    public void test339()
    {
        mockComputeTriangle.findTriangle(206, 206, 204);
    }

    @Test
    public void test340()
    {
        mockComputeTriangle.findTriangle(206, 206, 205);
    }

    @Test
    public void test341()
    {
        mockComputeTriangle.findTriangle(206, 206, 4);
    }

    @Test
    public void test342()
    {
        mockComputeTriangle.findTriangle(206, 206, 206);
    }
}