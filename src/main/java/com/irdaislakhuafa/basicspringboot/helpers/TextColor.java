package com.irdaislakhuafa.basicspringboot.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class TextColor {
    private static Map<String, String> FG_COLORS = Map.ofEntries(
            Map.entry("red", "[31m"),
            Map.entry("green", "[32m"),
            Map.entry("yellow", "[33m"),
            Map.entry("blue", "[34m"),
            Map.entry("white", "[37m"));

    private static final Random random = Beans.getRandom();

    private static List<String> tempColors;

    private static int indexLoops = -1;

    public static String fgRED(Object text) {
        return FG_COLORS.get("red") + text + FG_COLORS.get("white");
    }

    public static String fgGREEN(Object text) {
        return FG_COLORS.get("green") + text + FG_COLORS.get("white");
    }

    public static String fgBLUE(Object text) {
        return FG_COLORS.get("blue") + text + FG_COLORS.get("white");
    }

    public static String fgYELLOW(Object text) {
        return FG_COLORS.get("yellow") + text + FG_COLORS.get("white");
    }

    public static String fgWHITE(Object text) {
        return FG_COLORS.get("white") + text;
    }

    public static String fgRandom(Object text) {
        return TextColor.getFgColorsArray()[random.nextInt(TextColor.getFgColorsArray().length)]
                + text
                + FG_COLORS.get("white");
    }

    public static Map<String, String> getFgColors() {
        return FG_COLORS;
    }

    public static String[] getFgColorsArray() {
        return FG_COLORS.values().toArray(new String[FG_COLORS.size()]);
    }

    public static String fgColorLoops(Object text, String... ignores) {
        tempColors = new ArrayList<>(Arrays.asList(TextColor.getFgColorsArray()));
        tempColors.removeAll(Arrays.asList(ignores));
        indexLoops++;
        if (indexLoops >= tempColors.size()) {
            indexLoops = 0;
        }
        return tempColors.get(indexLoops) + text + FG_COLORS.get("white");
    }
}
