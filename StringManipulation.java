package com.company;

/*
Part I: Split the text with the delimeter: "ee"
Part II: Find out which segment has the most "th" */

public class StringManipulation {
    public static int maxTHcount(String str){
        int count = 0, index = 0;
        while((index = str.indexOf("th", index)) != -1){
            ++count; index += 2;
        }
        return count;
    }

    public static void problem(String text){
        text = text.toLowerCase();
        String[] arr = text.split("ee");
        int length = 0, maxTHcount = 0;
        for(int i = 0; i < arr.length; ++i){
            System.out.println(arr[i] + " | Length: " + arr[i].length() + " | Substring: " + maxTHcount(arr[i]));
            int count = maxTHcount(arr[i]);
            if(count > maxTHcount){
                maxTHcount = count;
            }
            if(arr[i].length() > length){
                length = arr[i].length();
            }
        }
        System.out.println("The length of the longest segment is " + length);
        System.out.println("The maximum number of times the substring 'th' appears is " + maxTHcount);
    }

    public static void main(String[] args) {
        String text = "The orange is the fruit of the citrus species Citrus x sinensis in the family Rutaceae. It is also called sweet orange, to distinguish it from the related Citrus x aurantium, referred to as bitter orange. The sweet orange reproduces asexually (apomixis through nucellar embryony); varieties of sweet orange arise through mutations. The orange is a hybrid between pomelo (Citrus maxima) and mandarin (Citrus reticulata). It has genes that are ~25% pomelo and ~75% mandarin; however, it is not a simple backcrossed BC1 hybrid, but hybridized over multiple generations. The chloroplast genes, and therefore the maternal line, seem to be pomelo. The sweet orange has had its full genome sequenced. Earlier estimates of the percentage of pomelo genes varying from ~50% to 6% have been reported. Sweet oranges were mentioned in Chinese literature in 314 BC. As of 1987, orange trees were found to be the most cultivated fruit tree in the world. Orange trees are widely grown in tropical and subtropical climates for their sweet fruit. The fruit of the orange tree can be eaten fresh, or processed for its juice or fragrant rind. As of 2012, oranges accounted for approximately 70% of citrus production. In 2014, 70.9 million tonnes of oranges were grown worldwide, with Brazil producing 24% of the world total followed by China and India.";
        problem(text);
    }
}
