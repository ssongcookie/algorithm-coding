class Solution {
    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - 1 - i; j++) {
                boolean swap;
                if (strings[j].charAt(n) == strings[j + 1].charAt(n)) {
                    swap = strings[j].compareTo(strings[j + 1]) > 0;
                } else {
                    swap = strings[j].charAt(n) > strings[j + 1].charAt(n);
                }
                if (swap) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
        return strings;
    }
}