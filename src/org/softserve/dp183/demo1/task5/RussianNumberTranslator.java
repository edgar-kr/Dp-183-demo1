package org.softserve.dp183.demo1.task5;

import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by User on 13.02.2020.
 */
public class RussianNumberTranslator {
    static final List<String> hundreds = Stream.of("", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот",
            "семьсот", "восемьсот", "девятьсот").collect(Collectors.toList());
    static final List<String> tens = Stream.of("", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят",
            "семьдесят", "восемьдесят", "девяносто").collect(Collectors.toList());
    static final List<String> digits = Stream.of("", "один", "два", "три", "четыре", "пять", "шесть", "семь",
            "восемь", "девять").collect(Collectors.toList());
    static final List<String> elevens = Stream.of("десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
            "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать").collect(Collectors.toList());

    static final List<String> millions = Stream.of("", "тысяч", "миллион", "миллиард", "триллион", "квадриллион",
            "квинтиллион", "секстиллион", "сеплиллион", "октиллион", "нониллион", "дециллион").collect(Collectors.toList());

    private List<Integer> numClass;
    private StringBuilder number;

    public RussianNumberTranslator(String number) {
        this.number = new StringBuilder(number);
        numClass = new LinkedList<>();
    }

    public List<Integer> getResult() {
        for (; ; ) {
            if (number.length() <= 3) {
                numClass.add(Integer.valueOf(number.toString()));
                break;
            }

            String temp = number.substring(number.length() - 3);
            numClass.add(Integer.valueOf(temp));
            number.setLength(number.length() - 3);
        }

        return numClass;
    }

    public void printNumber() {
        getResult();
        StringJoiner result = new StringJoiner(" ");

        for (int i = numClass.size() - 1; i >= 0; i--) {
            String temp = getStr(numClass.get(i));

            if (!temp.isEmpty()) {
                result.add(getStr(numClass.get(i))).add(millions.get(i) + endWith(numClass.get(i)));
            }
        }
        System.out.println(result);
    }

    public String endWith(int threeDigitNumber) {
        String res = "";
        int digit = threeDigitNumber % 10;
        int ten = threeDigitNumber / 10 % 10;

        if (ten == 1 || digit == 0 || (digit >= 5 && digit <= 9)) {
            res = "ов";
        } else if (digit == 1) {
            res = "";
        } else if (digit >= 2 && digit <= 4) {
            res = "а";
        }

        return res;
    }

    public String endWithThousand(int threeDigitNumber) {
        String res = "";
        int digit = threeDigitNumber % 10;
        int ten = threeDigitNumber / 10 % 10;

        if (ten == 1 || digit == 0 || (digit >= 5 && digit <= 9)) {
            res = "";
        } else if (digit == 1) {
            res = "а";
        } else if (digit >= 2 && digit <= 4) {
            res = "и";
        }

        return res;
    }

    public String getStr(int threeDigitNumber) {
        StringJoiner result = new StringJoiner(" ");

        int digit = threeDigitNumber % 10;
        int ten = threeDigitNumber / 10 % 10;
        int hundred = threeDigitNumber / 100;

        result.add(hundreds.get(hundred));

        if (ten == 1) {
            result.add(elevens.get(digit));
        } else {
            result.add(tens.get(ten));
            result.add(digits.get(digit));
        }

        return result.toString().trim();
    }

}
