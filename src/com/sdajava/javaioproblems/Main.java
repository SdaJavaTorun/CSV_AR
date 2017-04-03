package com.sdajava.javaioproblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile(";");

        String filename = "Salaries.csv";

        try(BufferedReader in = new BufferedReader(new FileReader(filename))){

            List<Player> players = in
                    .lines()
                    .skip(1)
                    .map(line -> {
                       String[] field = pattern.split(line);
                       return new Player(Integer.parseInt(field[0]),
                               field[1],
                               field[2],
                               field[3],
                               Integer.parseInt(field[4]));
                    })
                    .collect(Collectors.toList());

            //players.stream().forEach(System.out::println);

            for (Player p: players) System.out.println(p.yearID);

        } catch (IOException err) {

        }

    }
}
