package utils;

import java.util.Arrays;

/**
 * Класс с утилитарными методами
 */
public class Utils {
    /**
     * Метод для получения значения аргумента по ключу
     */
    public static String getArgByKey(String[] args, String key) {
        final var in = Arrays.asList(args).indexOf(key);
        return in > -1 ? args[in + 1] : null;
    }
}
