package ru.Shiakhmetov.main;

import Input.Reader;
import ru.Shiakhmetov.birds.Bird;
import ru.Shiakhmetov.birds.Cuckoo;
import ru.Shiakhmetov.birds.Parrot;
import ru.Shiakhmetov.birds.Sparrow;
import ru.Shiakhmetov.main.BirdMarket;
import ru.Shiakhmetov.employment.Department;
import ru.Shiakhmetov.employment.Worker;
import ru.Shiakhmetov.geometry.Point;
import ru.Shiakhmetov.geometry.Point3D;
import ru.Shiakhmetov.time.Time;
import ru.Shiakhmetov.tree.BinaryTree;

public class Tests {
    private Reader reader;

    public Tests(){
        reader = new Reader();
    }
    public void testTime(){
        int value = reader.readInt("Сколько секунд прошло? ");
        try{
            Time time = new Time(value);
            System.out.println("Время: " + time);
            System.out.println("Хранится секунд: " + time.getSecondTime());
        }
        catch(IllegalArgumentException e){
            System.out.println("Время не может быть отрицательным!");
        }
    }

    public void testDepartment(){
        System.out.print("Название отдела: ");
        String title = reader.readLine();
        System.out.print("Имя первого сотрудника: ");
        String first = reader.readLine();
        System.out.print("Имя второго сотрудника: ");
        String second = reader.readLine();
        
        try{
            Department department = new Department();
            Worker worker1 = new Worker(first, department);
            Worker worker2 = new Worker(second, department);
            
            department.appointAsHead(worker2);

            System.out.println(worker1);
            System.out.println(worker2);
            System.out.println("Работники отдела: " + department.getWorkers());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void testTree(){
        BinaryTree tree = new BinaryTree();

        System.out.print("Введите числа: ");
        String nums = reader.readLine().trim();

        if (nums.isEmpty()){
            nums = "3 5 4 7 1 2";
        }

        try{
            for (String part: nums.split("\\s+")){
                tree.addNode(Integer.parseInt(part));
            }
        }
        catch (NumberFormatException e){
            System.out.println("Нужно вводить числа через пробел!");
            return;
        }

        System.out.println("Дерево: " + tree);
        int value = reader.readInt("Введите значение, которое необходимо найти: ");
        System.out.println("Значение найдено - " + tree.isContains(value));

        value = reader.readInt("Введите значение, которое необходимо удалить: ");
        tree.removeValue(value);
        System.out.println("Дерево после удаления значения: " + tree);
    }

    public void testPoint3D(){
        int x = reader.readInt("X: ");
        int y = reader.readInt("Y: ");
        int z = reader.readInt("Z: ");

        Point3D point = new Point3D(x, y, z);

        System.out.println("Трёхмерная точка: " + point);
    }

    public void testPointEquals(){
        int x = reader.readInt("X: " );
        int y = reader.readInt("Y: ");

        Point point1 = new Point(x, y);
        Point point2 = new Point(x, y);
        Point point3 = new Point(x*3, y*2);

        System.out.println("Первая точка: " + point1);
        System.out.println("Вторая точка: " + point2);
        System.out.println("Третья точка: " + point3);

        System.out.println("Результат сравнения 1 и 2 точки: " + point1.equals(point2));
        System.out.println("Результат сравнения 1 и 3 точки: " + point1.equals(point3));
    }

    public void testBirds(){
        System.out.print("Текст, который будет говорить попугай: ");
        String phrase = reader.readLine();

        try{
            Bird sparrow = new Sparrow();
            Bird cuckoo = new Cuckoo();
            Bird parrot = new Parrot(phrase);

            System.out.println("Голоса птиц:");
            sparrow.sing();
            cuckoo.sing();
            parrot.sing();
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void testBirdMarket(){
        System.out.print("Текст, который говорит попугай: ");
        String phrase = reader.readLine();

        try{
            BirdMarket.birdMarket(
                new Sparrow(),
                new Cuckoo(),
                new Parrot(phrase)
            );
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage()); 
        }
    }

    public void testPower(String[] args){
        try{
            PowerCalculator calculator = new PowerCalculator(args);
            System.out.println("Степень: " + calculator.calculate());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void testDepartmentEncapsulation(){
        System.out.print("");
        String title = reader.readLine();

        System.out.print("Имя начальника: ");
        String name = reader.readLine();

        try{
            Department department = new Department(title);
            Worker boss = new Worker(name, department);

            department.appointAsHead(boss);

            System.out.println("" + department.getNameBoss());

            Department x = new Department("X отдел");
            boss.setDepartment(x); 

            System.out.println("Начальник старого отдела: " + department.getNameBoss());
            System.out.println("Новый отдел сотрудника: " + boss.getDepartment());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
