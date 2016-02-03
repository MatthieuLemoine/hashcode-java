package com.mams.hashcode.parsing;

import com.mams.hashcode.model.Air;
import com.mams.hashcode.model.Parameters;
import com.mams.hashcode.model.Wind;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    static int altitude = 0;
    static int numLigne = 0;

    static Pattern p = Pattern.compile("-?\\d+\\s-?\\d+");
    public static void parse(String inputFile) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(inputFile);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                if(Parameters.R == 0){
                    String[] fields = line.split(" ");
                    Parameters.R = Integer.parseInt(fields[0]);
                    Parameters.C = Integer.parseInt(fields[1]);
                    Parameters.A = Integer.parseInt(fields[2]);
                    Air.winds = new Wind[Parameters.A][Parameters.R][Parameters.C];
                }
                else if(Parameters.L == 0){
                    String[] fields = line.split(" ");
                    Parameters.L = Integer.parseInt(fields[0]);
                    Parameters.V = Integer.parseInt(fields[1]);
                    Parameters.B = Integer.parseInt(fields[2]);
                    Parameters.T = Integer.parseInt(fields[3]);
                    Parameters.extendedV = 2*Parameters.V;
                }
                else if(Parameters.Rs == -1){
                    String[] fields = line.split(" ");
                    Parameters.Rs = Integer.parseInt(fields[0]);
                    Parameters.Cs = Integer.parseInt(fields[1]);
                }
                else if(Parameters.targetCells.size() < Parameters.L){
                    String[] fields = line.split(" ");
                    // r/c
                    Parameters.targetCells.add(fields[0] + '/' + fields[1]);
                }
                else{
                    if(numLigne >= Parameters.R){
                        numLigne = 0;
                        altitude++;
                    }
                    int numColumn = 0;
                    Matcher m = p.matcher(line);
                    while (m.find()) {
                        String[] fields = m.group().split(" ");
                        Air.winds[altitude][numLigne][numColumn] = new Wind(Integer.parseInt(fields[0]),Integer.parseInt(fields[1]));
                        numColumn++;
                    }
                    numLigne++;
                }
            }
        }
    }
}
