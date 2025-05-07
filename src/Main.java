//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String sentence = "Welcome back to the metrix kingdom magnificent";
         System.out.println("Original sentence: " + sentence);
         System.out.println("Spun sentence: " + spinWords(sentence));

    }





        public static String spinWords(String sentence) {

            StringBuilder words = new StringBuilder();

            String[] array = sentence.split("\\s+");

            for (int i = 0; i < array.length; i++) {

                if (array[i].length() >= 5) {
                    StringBuilder sb = new StringBuilder(array[i]);
                    words.append(sb.reverse());
                    words.append(" ");
                } else {
                    words.append(array[i]);
                    words.append(" ");
                }
               if(i == array.length - 1) {
                    words.deleteCharAt(words.length() - 1);
                }
            }

            return words.toString();

        }

}