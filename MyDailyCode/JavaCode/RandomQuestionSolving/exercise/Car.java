package RandomQuestionSolving.exercise;

public class Car{
    // instance variable
    private String Brand;
    private String Model;
    private int Year;

    // constructor
public Car(String Brand, String Model, int Year){
    this.Brand = Brand;
    this.Model = Model;
    this.Year  = Year;
    }
//    instance method
    public void  startEngine(){
        System.out.println("This " + Brand + " " + Model + "is starting...");
    }
    // Getter and Setter
    public String getBrand(){
    return Brand;
    }
    public void setBrand(String Brand){
    this.Brand = Brand;
    }
    public String getModel(){
    return Model;
    }
    public void setModel(String Model){
    this.Model = Model;
    }
    public int getYear(){
    return Year;
    }
    public void setYear(int Year){
    this.Year = Year;
    }
}