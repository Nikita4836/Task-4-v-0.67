package com.company;

public class Main {

    public static void main(String[] args) {
        double[] points = lib.ArrayUtils.readDoubleArrayFromFile("in.txt");
        assert points != null;
        if (CheckRead.checkCoordintesToCorrect(points) == null) {
            System.out.println("Вы ввели неверные координаты, повторите ввод");
        } else {
            if (points.length > 4) {
                System.out.println("Вы ввели " + points.length / 2 + " точек");
            } else {
                System.out.println("Вы ввели " + points.length / 2 + " точки");
            }
            System.out.println("Введите количество точек, которые хотели бы отсортировать");
            int n = CheckInputType.checInt();
            while (n > points.length / 2) {
                System.out.println("Вы ввели слишком большое количество точек, повторите ввод");
                n = CheckInputType.checInt();
            }
            int k = 0;
            System.out.println("Выберите тип сортировки стандартная/пирамидальная");
            String sortType = CheckInputType.checkStr("стандартная", "пирамидальная");
            if (sortType.equalsIgnoreCase("стандартная")) {
                while (k < n) {
                    System.out.println(ArrayElements.findPoints(k, ArrayElements.standartSort(Read.coordinates(points))));
                    k++;
                }
            }
            if (sortType.equalsIgnoreCase("пирамидальная")) {
                while (k < n) {
                    System.out.println(ArrayElements.findPoints(k, ArrayElements.heapSort(Read.coordinates(points))));
                    k++;
                }
            }
        }
    }
}
