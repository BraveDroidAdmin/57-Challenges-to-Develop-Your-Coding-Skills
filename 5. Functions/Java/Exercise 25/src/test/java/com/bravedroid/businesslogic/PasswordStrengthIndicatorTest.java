package com.bravedroid.businesslogic;

import com.bravedroid.businesslogic.utils.CharTypeSumStruct;
import com.bravedroid.businesslogic.utils.PasswordComplexity;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PasswordStrengthIndicatorTest {
  private PasswordStrengthIndicator SUT;

  @Before
  public void setUp() {
    SUT = new PasswordStrengthIndicator();
  }

  @Test
  public void getPasswordComplexity_ObjectInput_ReturnEnum() {
    SUT.setPassword("1234557");
    CharTypeSumStruct vm = new CharTypeSumStruct(7, 0, 0, 0);
    PasswordComplexity result = SUT.getPasswordComplexity(vm);
    PasswordComplexity expected = PasswordComplexity.VERY_WEAK_PASSWORD;
    assertEquals(expected, result);
  }
}
