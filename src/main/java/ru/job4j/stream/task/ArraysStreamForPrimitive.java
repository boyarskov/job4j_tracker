package ru.job4j.stream.task;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysStreamForPrimitive {
    public static IntStream createStream(int[] data) {
        return Arrays.stream(data);
    }
}