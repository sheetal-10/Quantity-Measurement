package com.quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.Feet, 0.0);
        Length feet2 = new Length(Length.Unit.Feet, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNullFeet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.Feet, 0.0);
        Length feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.Feet, 0.0);
        Length feet2 = new Length(Length.Unit.Feet, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenType0Feetand1Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.Feet, 0.0);
        Length feet2 = new Length(Length.Unit.Feet, 1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }

    @Test
    public void givenFeetFromDifferentRefFeet_ShouldReturnFalse() {
        Length feet1 = new Length(Length.Unit.Feet, 0.0);
        Length feet2 = new Length(Length.Unit.Feet, 0.0);
        boolean result = feet2 == feet1;
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFeetFromSameRef_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.Feet, 0.0);
        boolean result = feet == feet;
        Assertions.assertTrue(result);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.Inch, 0.0);
        Length inch2 = new Length(Length.Unit.Inch, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNullInch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.Inch, 0.0);
        Length inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.Inch, 0.0);
        Length inch2 = new Length(Length.Unit.Inch, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenType0Inchand1Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.Inch, 0.0);
        Length inch2 = new Length(Length.Unit.Inch, 1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    public void givenInchFromSameRef_ShouldReturnTrue() {
        Length inch = new Length(Length.Unit.Inch, 1.0);
        boolean result = inch == inch;
        Assertions.assertTrue(result);
    }

    @Test
    public void givenInchFromDiffRef_ShouldReturnFalse() {
        Length inch1 = new Length(Length.Unit.Inch, 1.0);
        Length inch2 = new Length(Length.Unit.Inch, 1.0);
        boolean result = inch1 == inch2;
        Assertions.assertFalse(result);
    }

    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.Feet, 0.0);
        Length inch1 = new Length(Length.Unit.Inch, 0.0);
        Assertions.assertNotEquals(feet1, inch1);
    }

    @Test
    public void given1Feetand12Inch_WhenCompared_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.Feet,1.0);
        double actualResult = feet1.feetToInchConversion();
        double expectedResult = 12;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void given0Feetand0Inch_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.Feet,0.0);
        Length inch1 = new Length(Length.Unit.Inch,0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Inch_WhenCompared_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.Feet,1.0);
        Length inch1 = new Length(Length.Unit.Inch,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Feetand1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.Feet,1.0);
        Length feet2 = new Length(Length.Unit.Feet,1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assertions.assertTrue(compareCheck);
    }



}
