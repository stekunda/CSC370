public class RunLengthEncode {
    public static String encode(String givenString) {
        String newString = "";
        for (int i = 0; i < givenString.length(); i++) {
            int counter = 1;
            while (i < givenString.length() - 1 &&
                    givenString.charAt(i) == givenString.charAt(i + 1)) {
                counter++;
                i++;
            }

            if (counter > 4) {
                if (counter / 10 < 1) {
                    newString = newString + "/" + "0" + counter + givenString.charAt(i);
                } else {
                    newString = newString + "/" + counter + givenString.charAt(i);
                }
            } else {
                for (int j = 0; j < counter; j++) {
                    newString = newString + givenString.charAt(i);
                }
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        RunLengthEncode myString = new RunLengthEncode();
        System.out.println(myString.encode("aaaaahurrre))))))))78"));
    }
}