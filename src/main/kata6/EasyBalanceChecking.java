package main.kata6;

import java.util.ArrayList;
import java.util.List;

public class EasyBalanceChecking {
    public static String balance(String book) {
        class Line {
            public int ID;
            public String name;
            public double expense;
            public double balance;
            public Line (int ID, String name, double price, double balance){
                this.ID = ID;
                this.name = name;
                this.expense = price;
                this.balance = balance;
            }
        }

        List<String> listStr = new ArrayList<String>();
        for (String str : book.split("\n")){
            if(!str.replaceAll("[^\\da-zA-Z \\.]", "").replaceAll(" ", "").isEmpty()){
                listStr.add(str);
            }
        }

        String[] inputStringArray = (String[]) listStr.toArray(new String[0]);
        StringBuilder[] stringBuilderArray = new StringBuilder[inputStringArray.length];
        StringBuilder outputString = new StringBuilder("");
        List<Line> listLines= new ArrayList<Line>();

        for(int i=0; i<stringBuilderArray.length;i++){
            stringBuilderArray[i] = new StringBuilder("");
            stringBuilderArray[i].append(inputStringArray[i].replaceAll("[^\\da-zA-Z \\.]", ""));
            for(int j = 1; j<stringBuilderArray[i].length(); j++){
                if((stringBuilderArray[i].toString().toCharArray()[j] == ' ') && (stringBuilderArray[i].toString().toCharArray()[j-1] == ' ')){
                    stringBuilderArray[i].replace(j,j+1, "@");
                }
            }
            String string = stringBuilderArray[i].toString().replaceAll("@", "");
            stringBuilderArray[i].setLength(0);
            stringBuilderArray[i].append(string);
            String[] substring = stringBuilderArray[i].toString().split(" ");
            if (i == 0) {
                listLines.add((new Line( 0,"Original Balance",0, Double.parseDouble(substring[0]))));
            } else {
                listLines.add((new Line(
                        Integer.parseInt(substring[0]),
                        substring[1],
                        Double.parseDouble(substring[2]),
                        listLines.get(i-1).balance - Double.parseDouble(substring[2]))));
            }
        }

        listLines.add(new Line (
                0,
                "Total expense",
                listLines.stream().filter(a -> !a.name.equals("")).mapToDouble(a -> a.expense).sum(),
                0));
        ;
        listLines.add(new Line (
                0,
                "Average expense",
                listLines.get(listLines.size()-1).expense/(stringBuilderArray.length-1),
                0));
        ;
        int i=0;
        for(Line line : listLines){
            if(line.name.equals("Average expense") | line.name.equals("Total expense")){
                outputString
                        .append(line.name).append("  ")
                        .append(String.format("%.2f", line.expense)).append("\\r\\n");
            }else if(line.name.equals("Original Balance")){
                outputString
                        .append(line.name).append(": ")
                        .append(String.format("%.2f", line.balance)).append("\\r\\n");
            } else {
                if (line.ID < 10){
                    outputString.append("00").append(line.ID).append(" ");
                } else if (line.ID < 100) {
                    outputString.append("0").append(line.ID).append(" ");
                } else {
                    outputString
                            .append(line.ID).append(" ");
                }
                outputString
                        .append(line.name).append(" ")
                        .append(String.format("%.2f", line.expense)).append(" Balance ")
                        .append(String.format("%.2f", line.balance)).append("\\r\\n");
            }
        }
        return  outputString.delete(outputString.length()-4,outputString.length()).toString();
    }



    public static void main(String[] args) {
        String s =
            "1739.00\n"+
            "001 Tyres  13.65\n"+
            "002 Vegetables ;! 120.90 ?;\n"+
            "003 Hardware ;! 13.10 ?;\n"+
            "004 Books ;! 11.00 ?;\n"+
            "005 Meat ;! 13.65 ?;\n"+
            "006 Picture ;! 12.00 ?;\n"+
            "007 Fruits ;! 12.00 ?;\n"+
            "008 Books ;! 13.65 ?;\n"+
            "009 Flowers ;! 17.50 ?;";
        System.out.println(EasyBalanceChecking.balance(s));
    }
}
