package com.github.thomasjteixeira;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1ChristmasTreeTest {

    @Test
    public void christmasTreeTest(){
        String christmasTree = Q1ChristmasTree.printTree(6);
        assertEquals(   "     *\n" +
                                "    **\n" +
                                "   ***\n" +
                                "  ****\n" +
                                " *****\n" +
                                "******", christmasTree);
    }
    @Test
    public void christmasTreeTest2(){
        String christmasTree = Q1ChristmasTree.printTree(3);
        assertEquals(   "  *\n" +
                                " **\n" +
                                "***" , christmasTree);
    }

    @Test
    public void christmasTreeTest3(){
        String christmasTree = Q1ChristmasTree.printTree(1);
        assertEquals(   "*", christmasTree);
    }

    @Test
    public void christmasTreeTest4(){
        String christmasTree = Q1ChristmasTree.printTree(0);
        assertEquals(   "", christmasTree);
    }
}
