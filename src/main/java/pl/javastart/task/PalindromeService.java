package pl.javastart.task;

import java.util.Objects;

public class PalindromeService {
    public boolean isPalindrome(int[] array) {
        if (Objects.isNull(array) || array.length == 0) {
            return false;
        }
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            if (array[i] != array[j]) {
                return false;
            }
        }
        return true;
    }
}
