package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WuBuzzTest {
    @Test
    public void wuTangClanTestOne(){
        WuBuzz wuTangForeverBuzz = new WuBuzz();

        String expected = "1\n2\nWu\n4\nTang\nWu\n7\n8\nWu\nTang\n11\nWu\n13\n14\nWuTang Forever\n";
        String actual = wuTangForeverBuzz.wuTangClan(15);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void wuTangClanTestTwo(){
        WuBuzz wuTangForeverBuzz = new WuBuzz();

        String expected = "1\n2\nWu\n4\nTang\nWu\n7\n8\nWu\nTang\n11\nWu\n13\n14\nWuTang Forever\n16\n17\nWu\n19\nTang\nWu\n22\n23\nWu\nTang\n26\nWu\n28\n29\nWuTang Forever\n31\n32\nWu\n34\nTang\nWu\n37\n38\nWu\nTang\n";
        String actual = wuTangForeverBuzz.wuTangClan(40);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("multiple of 3 test true")
    public void multipleOfThreeTest01() {
        WuBuzz wu = new WuBuzz();
        boolean actual = wu.multipleOfThree(9);
        Assertions.assertTrue(actual);
    }

    @Test
    @DisplayName("multiple of 3 test false")
    public void multipleOfThreeTest02() {
        WuBuzz wu = new WuBuzz();
        boolean actual = wu.multipleOfThree(8);
        Assertions.assertFalse(actual);
    }

    @Test
    @DisplayName("Multiple of 5 test true")
    public void multipleOfFiveTest01() {
        WuBuzz wu = new WuBuzz();
        boolean actual = wu.multipleOfFive(10);
        Assertions.assertTrue(actual);
    }

    @Test
    @DisplayName("Multiple of 5 test false")
    public void multipleOfFiveTest02() {
        WuBuzz wu = new WuBuzz();
        boolean actual = wu.multipleOfFive(9);
        Assertions.assertFalse(actual);
    }
}
