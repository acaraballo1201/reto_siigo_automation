package co.com.reto_siigo_automation.certificacion.utils.web;

import java.util.Random;

public class RandomClassExample1 {

  public static void main(String[] args) {

    // create random object
    Random randomNumbers = new Random();

    System.out.println("----------Random Boolean---------" );
    /*
     * Returns the next pseudo random boolean value which
     * may be used in a toss for a match
     */
    boolean value = randomNumbers.nextBoolean();
    System.out.println("The random boolean value is: " + value);

    /*
     * Returns the next pseudo random integer value between 0 and 5
     * because if we use '6' then, it will give random numbers from 0 to 6
     * hence incrementing it by 1 you can use it as a result of a dice roll
     */
    System.out.println("\n----------Random Integer---------" );
    System.out.println("Die Roll: " + (randomNumbers.nextInt(6)+1) );
    System.out.println("Die Roll: " + (randomNumbers.nextInt(6)+1) );
    System.out.println("Die Roll: " + (randomNumbers.nextInt(6)+1) );
    System.out.println("Die Roll: " + (randomNumbers.nextInt(6)+1) );
    System.out.println("Die Roll: " + (randomNumbers.nextInt(6)+1) );

    // return the next pseudo random long value
    Long val = randomNumbers.nextLong();
    System.out.println("\n----------Random Long---------" );
    System.out.println("Random Long value: " + val);

    /*
     * Generates random bytes and puts them in an array, which you can for some
     * desired unpredictable result that is summing all the values in the array
     */

    System.out.println("\n----------Random Bytes---------" );
    byte[] bytes = new byte[8];
    randomNumbers.nextBytes(bytes);

    System.out.print("These are the random bytes = [ ");
    for (int i = 0; i < bytes.length; i++) {
      System.out.printf("%d ", bytes[i]);
    }
    System.out.println("]");
  }

}