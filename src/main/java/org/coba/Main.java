package org.coba;

import org.coba.logic.JavaSort;
import org.coba.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>(); //변수선언부를 바꾸지않고, 구현체만 바꾸는게 가능해짐

        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}