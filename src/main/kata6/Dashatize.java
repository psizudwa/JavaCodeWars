package main.kata6;

public class Dashatize {
    public static String dashatize(int num) {
        StringBuilder inputString = new StringBuilder(""+num);
        if(inputString.indexOf("-")==0){
            inputString.delete(0,1);
        }
        if(inputString.length()==1){
            return inputString.toString();
        }
        StringBuilder outputString = new StringBuilder("");
        for(char ch : inputString.toString().toCharArray()){
            if(Character.digit(ch,10)%2!=0){
                outputString.append("-").append(ch).append("-");
            }else{
                outputString.append(ch);
            }
        }
        if (outputString.indexOf("-")==0){
            outputString.delete(0,1);
        }
        if (outputString.lastIndexOf("-")==outputString.length()-1){
            outputString.delete(outputString.length()-1,outputString.length());
        }
    return outputString.toString().replaceAll("--", "-");
    }

    public static void main(String[] args) {
        int number = 1111;
        System.out.println(Dashatize.dashatize(number));
    }
}
