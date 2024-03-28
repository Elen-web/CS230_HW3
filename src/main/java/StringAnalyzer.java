public class StringAnalyzer {

    public boolean isPalindrome(String str) {

        if (str == null) {
            return true;
        }

        int left = 0;
        int right = str.length() - 1;


        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    public int countVowels(String str) {
        int count = 0;
        if (str != null) {
            String vowels = "aeiouAEIOU";
            for (char ch : str.toCharArray()) {
                if (vowels.indexOf(ch) != -1) {
                    count++;
                }
            }
        }
        return count;
    }
    public int countConsonants(String str) {
        int count = 0;
        if (str != null) {
            String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
            for (char ch : str.toCharArray()) {
                if (consonants.indexOf(ch) != -1) {
                    count++;
                }
            }
        }
        return count;
    }

    public String reverseString(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }
}
