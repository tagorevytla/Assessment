package com.Teksystems.Assessment.service;

import org.junit.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class PhoneNumberPermutationsTest {

    private PhoneNumberPermutations phoneNumberPermutations =  new PhoneNumberPermutations();

    @Test
    public void testCreateAllPermutationsFor10DigitPhoneNumberWith0(){

        List<String> allCombinations = phoneNumberPermutations.createAllPermutations("3132651380");

        Assert.assertEquals("Total combinations of phone number did not match",21,allCombinations.size());
        Assert.assertEquals("Did not match","31326513t0",allCombinations.get(0));
        Assert.assertTrue("31326513t0 is not Present",allCombinations.contains("31326513t0"));
        Assert.assertTrue("31326513u0 is not Present",allCombinations.contains("31326513u0"));
        Assert.assertTrue("31326513v0 is not Present",allCombinations.contains("31326513v0"));
        Assert.assertTrue("3132651d80 is not Present",allCombinations.contains("3132651d80"));
        Assert.assertTrue("3132651e80 is not Present",allCombinations.contains("3132651e80"));
        Assert.assertTrue("3132651f80 is not Present",allCombinations.contains("3132651f80"));
        Assert.assertTrue("31326j1380 is not Present",allCombinations.contains("31326j1380"));
        Assert.assertTrue("31326k1380 is not Present",allCombinations.contains("31326k1380"));
        Assert.assertTrue("31326l1380 is not Present",allCombinations.contains("31326l1380"));
        Assert.assertTrue("3132m51380 is not Present",allCombinations.contains("3132m51380"));
        Assert.assertTrue("3132n51380 is not Present",allCombinations.contains("3132n51380"));
        Assert.assertTrue("3132o51380 is not Present",allCombinations.contains("3132o51380"));
        Assert.assertTrue("313a651380 is not Present",allCombinations.contains("313a651380"));
        Assert.assertTrue("313b651380 is not Present",allCombinations.contains("313b651380"));
        Assert.assertTrue("313c651380 is not Present",allCombinations.contains("313c651380"));
        Assert.assertTrue("31d2651380 is not Present",allCombinations.contains("31d2651380"));
        Assert.assertTrue("31e2651380 is not Present",allCombinations.contains("31e2651380"));
        Assert.assertTrue("31f2651380 is not Present",allCombinations.contains("31f2651380"));
        Assert.assertTrue("d132651380 is not Present",allCombinations.contains("d132651380"));
        Assert.assertTrue("e132651380 is not Present",allCombinations.contains("e132651380"));
        Assert.assertTrue("f132651380 is not Present",allCombinations.contains("f132651380"));

    }

    @Test
    public void testCreateAllPermutationsFor10DigitPhoneNumberWithout0(){

        List<String> allCombinations = phoneNumberPermutations.createAllPermutations("3333333333");

        Assert.assertEquals("Total combinations of phone number did not match",30,allCombinations.size());
        Assert.assertEquals("Did not match","333333333d",allCombinations.get(0));
        Assert.assertTrue("333333333d is not Present",allCombinations.contains("333333333d"));
        Assert.assertTrue("333333333e is not Present",allCombinations.contains("333333333e"));
        Assert.assertTrue("333333333f is not Present",allCombinations.contains("333333333f"));
        Assert.assertTrue("33333333d3 is not Present",allCombinations.contains("33333333d3"));
        Assert.assertTrue("33333333e3 is not Present",allCombinations.contains("33333333e3"));
        Assert.assertTrue("33333333f3 is not Present",allCombinations.contains("33333333f3"));
        Assert.assertTrue("3333333d33 is not Present",allCombinations.contains("3333333d33"));
        Assert.assertTrue("3333333e33 is not Present",allCombinations.contains("3333333e33"));
        Assert.assertTrue("3333333f33 is not Present",allCombinations.contains("3333333f33"));
        Assert.assertTrue("333333d333 is not Present",allCombinations.contains("333333d333"));
        Assert.assertTrue("333333e333 is not Present",allCombinations.contains("333333e333"));
        Assert.assertTrue("333333f333 is not Present",allCombinations.contains("333333f333"));
        Assert.assertTrue("33333d3333 is not Present",allCombinations.contains("33333d3333"));
        Assert.assertTrue("33333e3333 is not Present",allCombinations.contains("33333e3333"));
        Assert.assertTrue("33333f3333 is not Present",allCombinations.contains("33333f3333"));
        Assert.assertTrue("3333d33333 is not Present",allCombinations.contains("3333d33333"));
        Assert.assertTrue("3333e33333 is not Present",allCombinations.contains("3333e33333"));
        Assert.assertTrue("3333f33333 is not Present",allCombinations.contains("3333f33333"));
        Assert.assertTrue("333d333333 is not Present",allCombinations.contains("333d333333"));
        Assert.assertTrue("333e333333 is not Present",allCombinations.contains("333e333333"));
        Assert.assertTrue("333f333333 is not Present",allCombinations.contains("333f333333"));
        Assert.assertTrue("33d3333333 is not Present",allCombinations.contains("33d3333333"));
        Assert.assertTrue("33e3333333 is not Present",allCombinations.contains("33e3333333"));
        Assert.assertTrue("33f3333333 is not Present",allCombinations.contains("33f3333333"));
        Assert.assertTrue("3d33333333 is not Present",allCombinations.contains("3d33333333"));
        Assert.assertTrue("3e33333333 is not Present",allCombinations.contains("3e33333333"));
        Assert.assertTrue("3f33333333 is not Present",allCombinations.contains("3f33333333"));
        Assert.assertTrue("d333333333 is not Present",allCombinations.contains("d333333333"));
        Assert.assertTrue("e333333333 is not Present",allCombinations.contains("e333333333"));
        Assert.assertTrue("f333333333 is not Present",allCombinations.contains("f333333333"));

    }

    @Test
    public void testCreateAllPermutationsFor7DigitPhoneNumberWithout0(){

        List<String> allCombinations = phoneNumberPermutations.createAllPermutations("1234567");

        Assert.assertEquals("Total combinations of phone number did not match",19,allCombinations.size());
        Assert.assertEquals("Did not match","123456p",allCombinations.get(0));
        Assert.assertTrue("123456p is not Present",allCombinations.contains("123456p"));
        Assert.assertTrue("123456q is not Present",allCombinations.contains("123456q"));
        Assert.assertTrue("123456r is not Present",allCombinations.contains("123456r"));
        Assert.assertTrue("123456s is not Present",allCombinations.contains("123456s"));
        Assert.assertTrue("12345m7 is not Present",allCombinations.contains("12345m7"));
        Assert.assertTrue("12345n7 is not Present",allCombinations.contains("12345n7"));
        Assert.assertTrue("12345o7 is not Present",allCombinations.contains("12345o7"));
        Assert.assertTrue("1234j67 is not Present",allCombinations.contains("1234j67"));
        Assert.assertTrue("1234k67 is not Present",allCombinations.contains("1234k67"));
        Assert.assertTrue("1234l67 is not Present",allCombinations.contains("1234l67"));
        Assert.assertTrue("123g567 is not Present",allCombinations.contains("123g567"));
        Assert.assertTrue("123h567 is not Present",allCombinations.contains("123h567"));
        Assert.assertTrue("123i567 is not Present",allCombinations.contains("123i567"));
        Assert.assertTrue("12d4567 is not Present",allCombinations.contains("12d4567"));
        Assert.assertTrue("12e4567 is not Present",allCombinations.contains("12e4567"));
        Assert.assertTrue("12f4567 is not Present",allCombinations.contains("12f4567"));
        Assert.assertTrue("1a34567 is not Present",allCombinations.contains("1a34567"));
        Assert.assertTrue("1b34567 is not Present",allCombinations.contains("1b34567"));
        Assert.assertTrue("1c34567 is not Present",allCombinations.contains("1c34567"));

    }

    @Test
    public void testCreateAllPermutationsFor7DigitPhoneNumberWith0(){

        List<String> allCombinations = phoneNumberPermutations.createAllPermutations("1234560");

        Assert.assertEquals("Total combinations of phone number did not match",15,allCombinations.size());
        Assert.assertEquals("Did not match","12345m0",allCombinations.get(0));
        Assert.assertTrue("12345m0 is not Present",allCombinations.contains("12345m0"));
        Assert.assertTrue("12345n0 is not Present",allCombinations.contains("12345n0"));
        Assert.assertTrue("12345o0 is not Present",allCombinations.contains("12345o0"));
        Assert.assertTrue("1234j60 is not Present",allCombinations.contains("1234j60"));
        Assert.assertTrue("1234k60 is not Present",allCombinations.contains("1234k60"));
        Assert.assertTrue("1234l60 is not Present",allCombinations.contains("1234l60"));
        Assert.assertTrue("123g560 is not Present",allCombinations.contains("123g560"));
        Assert.assertTrue("123h560 is not Present",allCombinations.contains("123h560"));
        Assert.assertTrue("123i560 is not Present",allCombinations.contains("123i560"));
        Assert.assertTrue("12d4560 is not Present",allCombinations.contains("12d4560"));
        Assert.assertTrue("12e4560 is not Present",allCombinations.contains("12e4560"));
        Assert.assertTrue("12f4560 is not Present",allCombinations.contains("12f4560"));
        Assert.assertTrue("1a34560 is not Present",allCombinations.contains("1a34560"));
        Assert.assertTrue("1b34560 is not Present",allCombinations.contains("1b34560"));
        Assert.assertTrue("1c34560 is not Present",allCombinations.contains("1c34560"));

    }
}
