package ru.Shiakhmetov.main;

import Input.Reader;
import ru.Shiakhmetov.time.Time;
import ru.Shiakhmetov.employment.Worker;
import ru.Shiakhmetov.employment.Department;
import ru.Shiakhmetov.tree.BinaryTree;
import ru.Shiakhmetov.geometry.Point;
import ru.Shiakhmetov.geometry.Point3D;
import ru.Shiakhmetov.birds.Sparrow;
import ru.Shiakhmetov.birds.Cuckoo;
import ru.Shiakhmetov.birds.Parrot;

public class Executor{
    private Reader reader;
    private String[] args;
    private Tests tester;

    public Executor(String[] args){
        reader = new Reader();
        this.args = args;
        tester = new Tests();
    }

    public void execute(){
        boolean flag = true;
        while (flag){
            System.out.println("Меню:");
            System.out.println("1. Задание 1.2 ");
            System.out.println("2. Задание 1.11");
            System.out.println("3. Задание 2.4");
            System.out.println("4. Задание 3.5");
            System.out.println("5. Задание 4.3");
            System.out.println("6. Задание 5.2");
            System.out.println("7. Задание 6.2");
            System.out.println("8. Задание 7.3");
            System.out.println("9. Задание 8.1");
            System.out.println("0. Выход");

            int choice = reader.readInt("Выбор: ");

            switch (choice){
                case 1:
                    tester.testTime();
                    break;
                case 2:
                    tester.testDepartment();
                    break;
                case 3:
                    tester.testTree();
                    break;
                case 4:
                    tester.testPoint3D();
                    break;
                case 5:
                    tester.testBirds();
                    break;
                case 6:
                    tester.testBirdMarket();
                    break;
                case 7: 
                    tester.testPointEquals();
                    break;
                case 8:
                    tester.testPower(args);
                    break;
                case 9:
                    tester.testDepartmentEncapsulation();
                    break;
                case 0:
                    flag = false;
                    System.out.println("Вы вышли из меню.");
                    break;
                default:
                    System.out.println("Такого пункта нет");
            }
        }
        return;
    }
}