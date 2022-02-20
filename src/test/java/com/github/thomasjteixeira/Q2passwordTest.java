package com.github.thomasjteixeira;

import org.junit.Assert;
import org.junit.Test;

public class Q2passwordTest {

    @Test
    public void minimumCharForPasswordToBeStrongTest1(){
        int passwordStrong = Q2Password.minimumCharForPasswordToBeStrong("Ya3");
        Assert.assertEquals(3,passwordStrong);

    }

    @Test
    public void minimumCharForPasswordToBeStrongTest2(){
        int passwordStrong = Q2Password.minimumCharForPasswordToBeStrong("Ya3&ab");
        Assert.assertEquals(0,passwordStrong);

    }

    @Test
    public void minimumCharForPasswordToBeStrongTest3(){
        int passwordStrong = Q2Password.minimumCharForPasswordToBeStrong("a");
        Assert.assertEquals(5,passwordStrong);

    }
    @Test
    public void minimumCharForPasswordToBeStrongTest4(){
        int passwordStrong = Q2Password.minimumCharForPasswordToBeStrong("ab");
        Assert.assertEquals(4,passwordStrong);

    }

    @Test
    public void minimumCharForPasswordToBeStrongTest5(){
        int passwordStrong = Q2Password.minimumCharForPasswordToBeStrong("Ya3&abYa3&ab");
        Assert.assertEquals(0,passwordStrong);

    }

}
