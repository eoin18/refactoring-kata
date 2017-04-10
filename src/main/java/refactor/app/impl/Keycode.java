package refactor.app.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Keycode {

    public String findCode(String instructions) {
        StringBuilder builder = new StringBuilder();
        String currentPosition = "5";


        List<String> lines = new ArrayList<>();
        StringBuffer stringBuffer = new StringBuffer();
        for(char instruction : instructions.toCharArray()) {
            if(instruction == '\n') {
                lines.add(new String(stringBuffer.toString()));
                stringBuffer.setLength(0);
            } else if (instruction == '\r') {
                //Ignore
            } else {
                stringBuffer.append(instruction);
            }
        }
        lines.add(new String(stringBuffer.toString()));

        for(String line : lines) {
            for(int i = 0 ; i < line.length() ; i++) {
                if(line.charAt(i) == 'U') {
                    if(Objects.equals(currentPosition, "1")) {
                        currentPosition = "Unknown";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "2")) {
                        currentPosition = "Unknown";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "3")) {
                        currentPosition = "Unknown";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "4")) {
                        currentPosition = "1";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "5")) {
                        currentPosition = "2";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "6")) {
                        currentPosition = "3";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "7")) {
                        currentPosition = "4";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "8")) {
                        currentPosition = "5";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "9")) {
                        currentPosition = "6";
                        continue;
                    }
                }
                if(line.charAt(i) == 'D') {
                    if(Objects.equals(currentPosition, "1")) {
                        currentPosition = "4";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "2")) {
                        currentPosition = "5";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "3")) {
                        currentPosition = "6";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "4")) {
                        currentPosition = "7";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "5")) {
                        currentPosition = "8";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "6")) {
                        currentPosition = "9";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "7")) {
                        currentPosition = "Unknown";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "8")) {
                        currentPosition = "Unknown";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "9")) {
                        currentPosition = "Unknown";
                        continue;
                    }
                }
                if(line.charAt(i) == 'L') {
                    if(Objects.equals(currentPosition, "1")) {
                        currentPosition = "Unknown";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "2")) {
                        currentPosition = "1";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "3")) {
                        currentPosition = "2";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "4")) {
                        currentPosition = "Unknown";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "5")) {
                        currentPosition = "4";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "6")) {
                        currentPosition = "5";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "7")) {
                        currentPosition = "Unknown";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "8")) {
                        currentPosition = "7";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "9")) {
                        currentPosition = "8";
                        continue;
                    }
                }
                if(line.charAt(i) == 'R') {
                    if(Objects.equals(currentPosition, "1")) {
                        currentPosition = "2";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "2")) {
                        currentPosition = "3";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "3")) {
                        currentPosition = "Unknown";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "4")) {
                        currentPosition = "5";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "5")) {
                        currentPosition = "6";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "6")) {
                        currentPosition = "Unknown";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "7")) {
                        currentPosition = "8";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "8")) {
                        currentPosition = "9";
                        continue;
                    }
                    if(Objects.equals(currentPosition, "9")) {
                        currentPosition = "Unknown";
                        continue;
                    }
                }
            }
            builder.append(currentPosition);
        }

        return builder.toString();
    }

}
