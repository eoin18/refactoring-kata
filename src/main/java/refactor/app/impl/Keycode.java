package refactor.app.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Keycode {

    public String findCode(String instructions) {
        StringBuilder builder = new StringBuilder();
        Key currentPosition = Key.Five;

        String[] lines = parseInput(instructions);

        for(String line : lines) {
            currentPosition = processLine(currentPosition, line);
            builder.append(currentPosition);
        }

        return builder.toString();
    }

    private Key processLine(Key currentPosition, String line) {
        for(int i = 0 ; i < line.length() ; i++) {
            char c = line.charAt(i);
            switch (c){
                case 'U':
                    currentPosition = currentPosition.moveUp();
                    break;
                case 'D':
                    currentPosition = currentPosition.moveDown();
                    break;
                case 'L':
                    currentPosition = currentPosition.moveLeft();
                    break;
                case 'R':
                    currentPosition = currentPosition.moveRight();
                    break;
            }
        }
        return currentPosition;
    }

    private String[] parseInput(String instructions) {
        String[] lineArray = instructions.split("\r\n");
        return lineArray;
    }

}
