import java.text.DecimalFormat;

public class goodStudent
{
    //1) Instance Variables
    String firstName;
    String lastName;
    int id;
    double gpa;
    boolean csStudent;

    //2) Constructors
    public goodStudent(String newFirstName, String newLastName, int newId, double newGPA, boolean newCsStudent)
    {
        firstName = newFirstName;
        lastName = newLastName;
        id = newId;
        gpa = newGPA;
        csStudent = newCsStudent;
    }// end full constructor

    public goodStudent()
    {
        firstName = "";
        lastName = "";
        id = 0;
        gpa = 0.0;
        csStudent = false;
    }//end default constructor

    public goodStudent(String newFirstName, String newLastName, boolean newCsStudent)
    {
        firstName = newFirstName;
        lastName = newLastName;
        id = 0;
        gpa = 0.0;
        csStudent = newCsStudent;
    }//end constructor

    //4) Getters
    public String getFirstName()
    {
        return firstName;
    }//end first name getter
    public String getLastName()
    {
        return lastName;
    }//end last name getter
    public int getId()
    {
        return id;
    }//end id getter
    public double getGpa()
    {
        return gpa;
    }//end gpa getter
    public boolean getCsStudent()
    {
        return csStudent;
    }//end cs student getter

    //5) Setters
    public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }//end first name setter
    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }//end last name setter
    public void setId(int newId)
    {
        id = newId;
    }//end id setter
    public void setGpa(double newGPA)
    {
        gpa = newGPA;
    }//end gpa setter
    public void setCsStudent(boolean newCsStudent)
    {
        csStudent = newCsStudent;
    }//end cs student setter

    //6) Brain Methods
    public String CreateID()
    {
        String strID = id + "";
        String id = firstName.charAt(0) + "";
        id += lastName;
        id += strID.substring(strID.length() - 3);
        return id;
    }//end create id method

    public String CsGpa()
    {
        if(csStudent)
        {
            gpa = gpa * 1.15;
        }//end if
        DecimalFormat fmt = new DecimalFormat("0.##");
        return fmt.format(gpa);
    }//end cs gpa method

    //3) to String
    public String toString()
    {
        String output = "First Name: " + firstName;
        output += "\nLast Name: " + lastName;
        output += "\nStudent ID: " + id;
        output += "\nStudent GPA: " + gpa;
        output += "\nIs the Student a CS student: " + csStudent;
        return output;
    }//end to string
}//end good student class
