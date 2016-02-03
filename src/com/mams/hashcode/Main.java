package com.mams.hashcode;

import com.mams.hashcode.model.Parameters;
import com.mams.hashcode.parsing.Parser;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Parser.parse("data.in");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
