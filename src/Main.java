public class Main {
    // public static void main(String[] args) {


    //}
//}
    public static void main(String[] args) {
        Employee[] empl = new Employee[3];
        empl[0] = new Employee("Fam1 Name1 SName1", 1, 25500f);
        empl[1] = new Employee("Fam2 Name2 SName2", 2, 31450f);
        empl[2] = new Employee("Fam3 Name3 SName3", 3, 40200f);

        for (Employee e : empl) {
            System.out.println(e);
        }
    }
}
