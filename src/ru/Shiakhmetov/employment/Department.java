package ru.Shiakhmetov.employment;

import java.util.ArrayList;

public class Department {
    private Worker boss;
    private String nameDepartment;
    private ArrayList<Worker> workers;

    public Department(){
        workers = new ArrayList<Worker>();
    }

    public Department(String nameDepartment){
        this();
        setNameDepartment(nameDepartment);
    }

    public void appointAsHead(Worker boss){
        if (boss == null){
            return;
        }
        boss.setDepartment(this);
        this.boss = boss;
    }

    public void setNameDepartment(String nameDepartment){
        this.nameDepartment = nameDepartment;
    }

    public String getNameDepartment(){
        return nameDepartment;
    }

    public Worker getBoss(){
        return boss;
    }

    public String getNameBoss(){
        if (boss == null){
            return "не назначен";
        }
        return boss.getNameWorker();
    }

    void addWorker(Worker worker){
        if (!workers.contains(worker)){
            workers.add(worker);
        }
    }

    void removeWorker(Worker worker){
        workers.remove(worker);
        if (boss == worker){
            boss = null;
        }
    }

    public ArrayList<Worker> getWorkers(){
        return new ArrayList<Worker>(workers);
    }

    @Override
    public String toString(){
        return getNameDepartment();
    }
}