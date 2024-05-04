package co.com.reto_siigo_automation.certificacion.utils.web.enums;

import co.com.reto_siigo_automation.certificacion.utils.web.RandomString;

import java.util.Random;

public class NumeroRandom {

  public static final int DEFAULT_LENGTH = 8;
  private static final char[] SYMBOL;
  private static final int KEY_BITS;
  private final Random random;
  private final int length;

  public NumeroRandom() {
    this(8);
  }

  public NumeroRandom(int length) {
    if (length <= 0) {
      throw new IllegalArgumentException("A random string's length cannot be zero or negative");
    } else {
      this.length = length;
      this.random = new Random();
    }
  }

  public static String make() {
    return make(8);
  }

  public static String make(int length) {
    return (new RandomString(length)).nextString();
  }

  public static int deTresDigitos() {
    double threeDigits = 1000 + Math.random() * 900;
    return (int) threeDigits;
  }

  public static int deCuatroDigitos() {
    double fourDigits = 1000 + Math.random() * 9000;
    return (int) fourDigits;
  }

  public static int deCincoDigitos() {
    double fiveDigits = 10000 + Math.random() * 90000;
    return (int) fiveDigits;
  }

  public static int deOchoDigitos() {
    double eigthDigits = 10000 + Math.random() * 99999999;
    return (int) eigthDigits;
  }

  public static String hashOf(int value) {
    char[] buffer = new char[32 / KEY_BITS + (32 % KEY_BITS == 0 ? 0 : 1)];

    for (int index = 0; index < buffer.length; ++index) {
      buffer[index] = SYMBOL[value >>> index * KEY_BITS & -1 >>> 32 - KEY_BITS];
    }

    return new String(buffer);
  }

  public String nextString() {
    char[] buffer = new char[this.length];

    for (int index = 0; index < this.length; ++index) {
      buffer[index] = SYMBOL[this.random.nextInt(SYMBOL.length)];
    }

    return new String(buffer);
  }

  static {
    StringBuilder symbol = new StringBuilder();

    char character;
    for (character = '0'; character <= '9'; ++character) {
      symbol.append(character);
    }

    for (character = 'a'; character <= 'z'; ++character) {
      symbol.append(character);
    }

    for (character = 'A'; character <= 'Z'; ++character) {
      symbol.append(character);
    }

    SYMBOL = symbol.toString().toCharArray();
    int bits = 32 - Integer.numberOfLeadingZeros(SYMBOL.length);
    KEY_BITS = bits - (Integer.bitCount(SYMBOL.length) == bits ? 0 : 1);
  }
}
