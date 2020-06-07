package main.kata4;

import java.util.HashMap;
import java.util.Map;

public class Parser {
    public static int parseInt(String numStr) {
        Map<String, Integer> dictFirstDecade = new HashMap<String, Integer>();
        Map<String, Integer> dictSecondDecade = new HashMap<String, Integer>();
        Map<String, Integer> dictOtherDecades = new HashMap<String, Integer>();
        Map<String, Integer> dictDigits = new HashMap<String, Integer>();
        String[] strFirstDecade = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] strSecondDecade = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] strOtherDecades = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] strDigits = {"hundred", "thousand", "million"};

        for(int i=0; i<20; i++){
            if(i<=9){
                dictFirstDecade.put(strFirstDecade[i],i);
            }else {
                dictSecondDecade.put(strSecondDecade[i-10],i);
            }
        }

        for(int i=20; i<100; i+=10){
            dictOtherDecades.put(strOtherDecades[i/10-2],i);
        }

        dictDigits.put(strDigits[0], 100);
        dictDigits.put(strDigits[1], 1000);
        dictDigits.put(strDigits[2], 1000000);

        if(dictFirstDecade.containsKey(numStr)){
            return dictFirstDecade.get(numStr);
        }else if(dictSecondDecade.containsKey(numStr)){
            return dictSecondDecade.get(numStr);
        }else if(dictOtherDecades.containsKey(numStr)){
            return dictOtherDecades.get(numStr);
        }else {
            int result = 0;
            String[] inputStrArray = numStr.replaceAll(" and", "").split("\\W");

            for (int i = 0; i < inputStrArray.length; i++) {
                if (dictFirstDecade.containsKey(inputStrArray[i])) {
                    if(i == inputStrArray.length-1){
                        result += dictFirstDecade.get(inputStrArray[i]);
                    } else {
                        if (result<dictDigits.get(inputStrArray[i + 1])){
                            result = (result+dictFirstDecade.get(inputStrArray[i])) * dictDigits.get(inputStrArray[i + 1]);
                        }else{
                            result += dictFirstDecade.get(inputStrArray[i]) * dictDigits.get(inputStrArray[i + 1]);
                        }
                    }
                    i++;
                } else if (dictOtherDecades.containsKey(inputStrArray[i])) {
                    if(i == inputStrArray.length-1) {
                        result += dictOtherDecades.get(inputStrArray[i]);
                    }else {
                        result += dictOtherDecades.get(inputStrArray[i]) + dictFirstDecade.get(inputStrArray[i + 1]);
                    }
                    i++;
                } else if (dictDigits.containsKey(inputStrArray[i])){
                    result = result*dictDigits.get(inputStrArray[i]);
                } else if (dictSecondDecade.containsKey(inputStrArray[i])) {
                    result += dictSecondDecade.get(inputStrArray[i]);
                }
            }
            for(String str : inputStrArray){
                System.out.println(str);
            }
            System.out.println(inputStrArray.length);
            return result;
        }
    }

    public static void main(String[] args) {
        String s = "seven hundred three thousand nine hundred and nineteen";
        System.out.println(parseInt(s));
    }
}
