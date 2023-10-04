package AlgorithmBased.SelectionSortingAlgorithm;
    class StudenApp{
        public static void main(String [] args){
            student s = new student();
            s.setData("Bhupesh choudhary", 22, "male", 23);
            System.out.println(s.getName());
            System.out.println(s.getAge());
            System.out.println(s.getGender());
            System.out.println(s.getUsn());
        }
}