package com.sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountAtoZ0To9AndOther {

    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/Dell/Downloads/words.txt");
        try {
            String content = new String(Files.readAllBytes(path));
            int alphaCount = 0;
            int numericCount = 0;
            int otherCount = 0;
            int vowelsCount=0;
            int i = 0;
            while (i < content.length()) {
                if (content.charAt(i) >= '0' && content.charAt(i) <= '9') {
                    numericCount++;
                } else if ((content.charAt(i) >= 'A' && content.charAt(i) <= 'Z') || (content.charAt(i) >= 'a' && content.charAt(i) <= 'z')) {
                    if ("aeiou".indexOf(Character.toLowerCase(content.charAt(i))) != -1) {
                        vowelsCount++;
                    }
                    alphaCount++;
                } else {
                    otherCount++;
                }
                i++;
            }
            System.out.println("vowels " + vowelsCount + " Alpha " + alphaCount + " Numeric " + numericCount + " Other " + otherCount);
        } catch (IOException e) {
            e.printStackTrace();  // Handle file not found or other I/O errors
        }
    }
}
