class Solution {
    public String capitalizeTitle(String title) {

        String[] words = title.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            if (word.length() >= 3) {
                word = Character.toUpperCase(word.charAt(0))
                       + word.substring(1);
            }

            sb.append(word);

            if (i < words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}