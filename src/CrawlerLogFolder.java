public class CrawlerLogFolder {
    public static  void main(String[] args) {

        String[] logs = {"d1/", "d2/", "../", "d21/", "./"};
        System.out.println("Number of operations: " + minOperations(logs));

        String[] logs1 = {"d1/", "d2/", "./", "d3/", "../", "d31/"};
        System.out.println("Number of operations: " + minOperations(logs1));

        String[] logs2 = {"d1/", "../", "../", "../"};
        System.out.println("Number of operations: " + minOperations(logs2));
    }

    public static int minOperations(String[] logs) {
        int counter = 0;

        for (String log : logs) {
            if (log.equals("../") && counter > 0) {

                counter--;
            } else if (!log.contains("./")) {
                counter++;
            }


        }



        return counter;
    }
}
