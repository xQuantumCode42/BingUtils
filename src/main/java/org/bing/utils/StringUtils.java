package org.bing.utils;

public class StringUtils {
    /**
     * Reverses a given String.
     *
     * @param s the String to reverse
     * @return reversed String, or null if input is null
     */
    public static String reverse(String s) {
        if (s == null) return null;
        return new StringBuilder(s).reverse().toString();
    }
}
