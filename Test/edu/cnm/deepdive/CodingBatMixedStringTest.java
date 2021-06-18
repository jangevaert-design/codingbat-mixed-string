package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatMixedStringTest {

  private String[][] mixedParams = {
      {"abc", "xyz"},
      {"Hi", "There"},
      {"xxxx", "There"},
      {"xxx", "X"},
      {"2/", "27 around"},
      {"", "Hello"},
      {"Abc", ""},
      {"", ""},
      {"a", "b"},
      {"ax", "b"},
      {"a", "bx"},
      {"So", "Long"},
      {"Long", "So"}
  };


  private String[] mixedExpected = {
      "axbycz",
      "HTihere",
      "xTxhxexre",
      "xXxx",
      "22/7 around",
      "Hello",
      "Abc",
      "",
      "ab",
      "abx",
      "abx",
      "SLoong",
      "LSoong"

  };

  @Test
  void mixedTest() {
    for (int i = 0; i < mixedParams.length; i++) {
      String actual = CodingBatMixedString.mixString(mixedParams[i][0], mixedParams[i][1]);
      Assertions.assertEquals(actual, mixedExpected[i]);
    }

  }
}