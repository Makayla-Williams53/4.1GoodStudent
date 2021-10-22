public class goodStudentDriver
{
    public static void main(String[] args)
    {
        //Instantiate
        goodStudent alan = new goodStudent("Alan", "Turning", 191254, 3.56, true);
        goodStudent florence = new goodStudent("Florence", "Nightingale", 182010, 3.89, false);
        goodStudent grace = new goodStudent("Grace", "Hopper", 190692, 3.89, true);

        //call to string for alan
        System.out.println(alan.toString());

        //print florence, do getters and setters for the ID and GPA, then reprint florence
        System.out.println("\n" + florence.toString());
        florence.setId(95366);
        florence.setGpa(3.92);
        System.out.println("\nFlorence id: " + florence.getId());
        System.out.println("Florence Gpa: " + florence.getGpa());

        //getters for grace's first name and cs status
        System.out.println("\n" + "Student first name: " + grace.getFirstName() + "\nStudent CS status: " + grace.getCsStudent());

        //create ID for all three students
        System.out.println("\nAlan's Id: " + alan.CreateID());
        System.out.println("Florence Id: " + florence.CreateID());
        System.out.println("Grace Id: " + grace.CreateID());

        //Cs gpa for all three students
        System.out.println("\n" + "Alan's GPA: " + alan.CsGpa());
        System.out.println("Florence's GPA: " + florence.CsGpa());
        System.out.println("Grace's GPA: " + grace.CsGpa());
    }//end main method
}//end driver class