package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionsRegulars {

    public static void main(String[] args) throws FileNotFoundException {
        File santako = new File("src/santako.txt");
        Scanner file = new Scanner(santako);

        int papanoel = 0;
        int renos = 0;
        int elfos = 0;

        while (file.hasNext()){

            papanoel = 0;
            renos = 0;
            elfos = 0;

            String line = file.nextLine();

            Pattern PN = Pattern.compile("\\*<]:-DOo");
            Pattern R = Pattern.compile(">:o\\)");
            Pattern E = Pattern.compile("<]:-D");

            Matcher pn = PN.matcher(line);
            Matcher r = R.matcher(line);
            Matcher e = E.matcher(line);


            while (pn.find()) {
                papanoel++;
            }
            while (r.find()) {
                renos++;
            }
            while (e.find()) {
                elfos++;
            }

            elfos = elfos - papanoel;
            System.out.print("Pare Noel (" + papanoel + ") ");
            System.out.print("Pare Noel (" + renos + ") ");
            System.out.println("Pare Noel (" + elfos + ") ");
        }



        file.close();
    }
}
