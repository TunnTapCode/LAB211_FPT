/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markstudent;


public class Student {
    private String name;
    private String ClassName;
    private double math;
    private double physical;
    private double chemistry;
    private double avg;
    private char type ;

    public Student() {
    }

    public Student(String name, String ClassName, double math, double physical, double chemistry, double avg, char type) {
        this.name = name;
        this.ClassName = ClassName;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
        this.avg = avg;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysical() {
        return physical;
    }

    public void setPhysical(double physical) {
        this.physical = physical;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
    
    

   
    
}
