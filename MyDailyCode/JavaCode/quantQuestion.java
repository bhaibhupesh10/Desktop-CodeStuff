public class quantQuestion {
    public static void main(String []args){
        int numBoys = 19;
        int avgAgeBoys = 31;
        int avgAgeClass = 22;

        int totalAgeBoys = numBoys * avgAgeBoys;
        int totalAgeClass = (numBoys+1) * avgAgeClass;
        int teacherAge = totalAgeClass - totalAgeBoys;

        System.out.println("The Teacher's age is : " + teacherAge);
    }
}
