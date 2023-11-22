package ru.penkin.java.basic.hw4;

public class Box {             // На гитхаб vetka1
    private final int width;
    private final int height;
    private final int depth;
    private String color;
    private boolean open;
    private String object;

    public Box(int width, int height, int depth, String color) {        // Создание коробки
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.open = false;
        this.object = null;
    }

    public void openBox() {              // Открытие коробки
        if (!open) {
            open = true;
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка уже открыта");
        }
    }

    public void closeBox() {             // Закрытие коробки

        if (open) {
            open = false;
            System.out.println("Коробка закрыта");
        } else {
            System.out.println("Коробка уже закрыта");
        }
    }

    public void repaint(String newColor) {      // Перекрашивание коробки
        color = newColor;
        System.out.println("Коробка перекрашена в цвет: " + color);
    }

    public void printInfo() {            // Вывод информации о коробке
        System.out.println("Размеры коробки: " + width + "x" + height + "x" + depth);
        System.out.println("Цвет коробки: " + color);
        System.out.println("Состояние коробки: " + (open ? "открыта" : "закрыта"));
        System.out.println("Предмет в коробке: " + (object != null ? object : "нет предмета"));
    }

    public void addAnObject(String newObject) {    // Добавление предмета в коробку
        if (open && object == null) {
            object = newObject;
            System.out.println("Предмет добавлен в коробку: " + object);
        } else if (!open) {
            System.out.println("Необходимо открыть коробку перед добавлением .");
        } else {
            System.out.println("В коробке уже есть предмет. Выкините его, чтобы добавить новый");
        }
    }

    public void layOutObject() {                // Выкладывание предмета из коробки
        if (open && object != null) {
            object = null;
            System.out.println("Предмет выложен из коробки");
        } else if (!open) {
            System.out.println("Необходимо открыть коробку перед выкладыванием предмета");
        } else {
            System.out.println("В коробке нет предмета для выкладывания");
        }
    }

    public static void main(String[] args) {

        Box Box = new Box(100, 60, 60, "желтый");
        Box.printInfo();
        Box.openBox();
        Box.addAnObject("Ноутбук");
        Box.printInfo();
        Box.closeBox();
        Box.repaint("Красный");
        Box.layOutObject();
        Box.printInfo();
    }
}