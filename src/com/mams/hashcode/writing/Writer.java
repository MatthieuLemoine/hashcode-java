package com.mams.hashcode.writing;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Set;

public class Writer {

    public static void write(int integer) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("data.out", "UTF-8");
        writer.println(integer);
        writer.close();
    }

    public static void write(String line) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("data.out", "UTF-8");
        writer.println(line);
        writer.close();
    }

    public static void write(String[] lines) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("data.out", "UTF-8");
        for (String line : lines) {
            writer.println(line);
        }
        writer.close();
    }

    public static void write(List<String> lines) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("data.out", "UTF-8");
        lines.forEach(writer::println);
        writer.close();
    }

    public static void write(Set<String> lines) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("data.out", "UTF-8");
        lines.forEach(writer::println);
        writer.close();
    }


}
