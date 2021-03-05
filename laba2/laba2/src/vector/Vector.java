package vector;

import java.util.*;
import java.io.*;
import java.util.function.Predicate;
import java.lang.*;


public class Vector {
    //    todo: сделай его private и почитай про модификаторы доступа
    private double[] vector;


    //todo: прикол в том что я думал что ты додумаешься или догуглишься до использования this() в конструкторе
    //todo: почитай про this() и заодно расскажешь
    public Vector(double[] source_vector, int length) {
        this(length);
        System.arraycopy(source_vector, 0, this.vector, 0, length);
        System.out.println("Array in constr" + Arrays.toString(vector));
    }

    public Vector(int length) {
        vector = new double[length];
    }

    public double getPoint(int index) {

        //todo: нужно возвращать просто элемент по индексу
//        + не сокращай названия переменных
        return this.vector[index - 1];
    }

    //todo: сказал же не сокращай названия, посмотри как внутри Java библиотеки называются подобные методы
    // ну спойлер в том, что они называются set, add, remove и так далее
    public double setElement(float el, int ind) {
        System.out.println("Изменение элемента ");
        return vector[ind - 1] = el;


    }

    //todo: и почему void?
//  метод в одну строчку же return vector.lentgh;
    public int getLength() {
        return vector.length;
    }

    public double searchMinimum() {
        System.out.println("Поиск наименьшего значения ");
        double min = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (min > vector[i]) {
                min = vector[i];
                //todo: ненужный стейтмент

            }

        }
        return min;
    }

    public double searchMaximum() {
        System.out.println("Поиск наибольшего значения");
        double max = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (max < vector[i]) {
                max = vector[i];
//                todo: удали

            }


        }
        return max;
    }

    //todo: Сделай сортировку с возможностью передачи в метод компаратора
    // погугли про компараторы, если не знаешь что это (если будет совсем тяжко, то приходи и спрашивай)
    public double[] sort() {
        System.out.println("Сортировка вектора по возрастанию");
        double[] new_vector = new double[vector.length];
        double a = 0;
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] > vector[j]) {
                    a = vector[i];
                    vector[i] = vector[j];
                    vector[j] = a;
                }
            }
        }
        System.arraycopy(vector, 0, new_vector, 0, new_vector.length);
        return new_vector;
    }

    //todo: Возвращай новый вектор который будет как раз произведением
    // изменять состояние вектора с которого был вызван этот метод при этом не надо
    public double[] multitply(double a) {
        System.out.println("Умножение вектора на число");
        double[] array1 = new double[this.vector.length];
        for (int i = 0; i < vector.length; i++) {
            array1[i] = a * vector[i];
        }

        return array1;

    }

    //todo: возвращай новый Vector и переименую переменную с vector2 на что нибудь человеческое
    public double[] add(double[] vector_new) {
        System.out.println("Сложение векторов");
        double final_vector[] = new double[vector_new.length];
        for (int i = 0; i < vector_new.length; i++) {
            final_vector[i] = vector_new[i] + this.vector[i];
        }
        return final_vector;

    }

    //todo: возвращай новый объект Vector при умножении и переименуй
    public double scalarMultitply(double[] vector_new) {
        double b = 0;
        double c = 0;
        for (int i = 0; i < vector.length; i++) {
            b = vector[i] * vector_new[i];
            c += b;
        }
        return c;

    }

    //todo: не печатай а возвращай значения
    public double evklid() {
        System.out.println("Евклидова норма");
        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 0) {
                vector[i] *= -1;
                sum += vector[i] * vector[i];
            } else {
                sum += vector[i] * vector[i];
            }
        }
        return sum;
    }

}
