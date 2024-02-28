import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {
        
        // =====================================================================================================================================
        // Задание №0.
        // Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества
        // Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества
        // Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.

        // Set<Integer> hashSet = new HashSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));
        // Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));
        // Set<Integer> treeSet = new TreeSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));

        // System.out.println(hashSet);
        // System.out.println(linkedHashSet);
        // System.out.println(treeSet);

        // =====================================================================================================================================
        // Задание №1.
        // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24

        // Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и
        // верните его в виде числа с плавающей запятой

        // Для вычисления процента используйте формулу: процент уникальных чисел = количество уникальных чисел * 100 / общее
        // количество чисел в массиве

        //System.out.println(getUniqueElementPercent(createArrayWithRandomNumber(1000, 24)));

        // =====================================================================================================================================
        // Задание №2. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
        // а) информационной системой ветеринарной клиники
        // б) архивом выставки котов
        // в) информационной системой Театра кошек Ю. Д. Куклачёва
        // Можно записать в текстовом виде, не обязательно реализовывать в java

        // =====================================================================================================================================
        // Задание №3
        // 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы. Создайте несколько
        // экземпляров этого класса, выведите их в консоль.
        // 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

        // Cat cat1 = new Cat("Барсик", "Черный", "1");
        // Cat cat2 = new Cat("Барсик", "Черный", "1");
        // Cat cat3 = new Cat("Барсик", "Черный", "1");

        // =====================================================================================================================================
        // Задание №4
        // 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
        // Поместите в него некоторое количество объектов.
        // 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
        // Убедитесь, что все они сохранились во множество.
        // 3. Создайте метод public boolean equals(Object o)
        // Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
        // должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
        // 4. Создайте метод public int hashCode()
        // который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
        // Objects.hash(...))
        // 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

        Cat cat1 = new Cat("Barsik", "Black", 2);
        Cat cat2 = new Cat("Barsik", "Black", 2);
        Cat cat3 = new Cat("Tomas", "White", 1);
        Cat cat4 = new Cat("Murka", "Grey", 3);
        Cat cat5 = new Cat("Murka", "Grey", 3);
        Set<Cat> catSet = new HashSet<>();
        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);
        catSet.add(cat5);
        for (Cat c: catSet) {
            System.out.println(c);
        }
    }

    // =====================================================================================================================================
    // Задание №1.
    // public static Integer[] createArrayWithRandomNumber(int size, int maxValue) {
    //     Integer[] array = new Integer[size];
    //     Random rnd = new Random();
    //     for (int i = 0; i < size; i++) {
    //         array[i] = rnd.nextInt(maxValue);
    //     }
    //     return array;
    // }

    // public static double getUniqueElementPercent(Integer[] array){
    //     Set<Integer> hashSet = new HashSet<>();
    //     for (Integer item : array) {
    //         hashSet.add(item);
    //     }
    //     return hashSet.size() * 100 / (double)array.length;
    // }

    // =====================================================================================================================================
    // Задание №2.
    // 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
    // приложения, которое является
    // а) информационной системой ветеринарной клиники
    // б) архивом выставки котов
    // в) информационной системой Театра кошек Ю. Д. Куклачёва
    // Можно записать в текстовом виде, не обязательно реализовывать в java.

    // Ветеринарная клиника:
    // Поля: 
    // - Пол
    // - Возраст
    // - Порода
    // - Кличка
    // - Владелец
    // - Прививки
    // - История болезней
    // - Окрас
    // - Вес
    // - Номер паспорта

    // Методы:
    // - Получить (Породу, кличку, возраст, окрас..)
    // - Установить значение (Породы, клички, возраст, окрас...)
    // - Добавить прививку
    // - Добавить запись в историю болезни

    // Архив выставки котов:
    // Поля:
    // - Пол
    // - Возраст
    // - Порода
    // - Кличка
    // - Владелец
    // - Прививки
    // - Окрас
    // - Номер паспорта
    // - Награды
    // - История выставок
    // Методы:
    // - Получить (Породу, кличку, возраст, окрас..)
    // - Установить значение (Породы, клички, возраст, окрас...)
    // - Добавить награду
    // - Добавить участие в выставке

    // Информационная система Театра кошек Ю. Д. Куклачёва
    // Поля:
    // - Пол
    // - Возраст
    // - Порода
    // - Кличка
    // - Прививки
    // - Окрас
    // - Дрессировщик
    // - Навыки
    // - Питание

    // Методы:
    // - Получить (Породу, кличку, возраст, окрас..)
    // - Установить значение (Породы, клички, возраст, окрас...)
    // - Добавить питание/диету
    // - Добавить навыки
    
   


}

 // =====================================================================================================================================
// Задание №3, 4
class Cat {
    private String name;
    private String color;
    private int age;


    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "имя='" + name + '\'' +
                ", цвет='" + color + '\'' +
                ", возраст=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cat cat = (Cat) obj;
        return cat.name.equals(name) &&
                cat.age == age &&
                cat.color.equals(color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }
}