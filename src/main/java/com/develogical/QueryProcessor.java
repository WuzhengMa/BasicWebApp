package com.develogical;

import java.util.Arrays;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("steve jobs")){
            return "Steven Paul Jobs was an American entrepreneur and business magnate. He was the chairman, chief executive officer (CEO), and a co-founder of Apple Inc";
        }

        if (query.toLowerCase().contains("what is")){
            String[] splited = query.split(" ");
            if (query.toLowerCase().contains("plus")){
                int i = Arrays.asList(splited).indexOf("plus");
                return Integer.toString(Integer.parseInt(splited[i-1]) + Integer.parseInt(splited[i+1]));
            }else if(query.toLowerCase().contains("multiplied by")){
                int i = Arrays.asList(splited).indexOf("multiplied");
                return Integer.toString(Integer.parseInt(splited[i-1]) * Integer.parseInt(splited[i+2]));
            }
        }

        if (query.toLowerCase().contains("which")){
            if (query.toLowerCase().contains("largest:")){
                String[] splited = query.split("largest:");
                String[] splitedNumber = splited[1].split(",");
                Arrays.sort(splitedNumber);
                return splitedNumber[splitedNumber.length-1].trim();
            }

        }
        return "solution to everything";
    }
}
