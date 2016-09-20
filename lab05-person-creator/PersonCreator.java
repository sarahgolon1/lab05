
/**
 * This code was made to record personal information and print it on a ticket
 * 
 * Sarah Golon 
 * Version 1
 */
public class PersonCreator
{

    private String name;
    private int age;
    private String sex;
    private int height;
    private int weight;
    private String ssn;
    private String address;
    private String phoneNumber;
    private String birthdate;
    
  /**
   * CREATE A CONSTRUCTOR TO INITIALIZE AN OBJECT
   */
  public PersonCreator(String firstName, String lastName)
  {
      name = firstName + lastName;
      age = 0;
      sex = " ";
      height = 0;
      weight = 0;
      ssn = " ";
      address = " ";
      phoneNumber = " ";
      birthdate = " ";
    }
    /**
     * Description: Assign Name
     * Input: String
     * Purpose: to allow person to input name into system
     * Example: "Sarah Golon"
     * 
     */
    public void getName(String name)
    {
        name = name;
    }
    /**
     * Description: Assign Age
     * Input: Int (1<int<100)
     * Purpose: to allow person to input age into system
     * Example: 20
     */
    public void getAge(int years)
    {
        if (years < 1 || years > 100)
        {System.err.println("please use a valid number");
        }
        else
        {
        age = age + years;
    }
    }
    /**
     * Description: Assign sex
     * Input: String
     * Purpose: to allow person to input sex into system
     * Example: "female"
     */
   public void getSex(String userSex)
   {
       sex = userSex;
    }
    /**
     * Description: Assign height
     * Input: Int
     * Purpose: to allow person to input height (in inches) into system
     * Example: 63
     */
    public void getHeight(int inches)
    {
        height = height + inches;
    }
    /**
     * Description: Assign social security number
     * Input: String (three different int that compile into a string)
     * Purpose: to allow person to input SSN into system
     * Example: 111-11-1111
     */
    public void changeSsn(int numBegin, int numMiddle,int numEnd)
    {
        if (numBegin < 100 || numBegin > 999)
        {
            System.err.println("please use a valid number");
        }
        else
        {
            ssn = numBegin + "-" + numMiddle + "-" + numEnd;
        }
        if (numMiddle < 10 || numMiddle > 99)
        
        {
            System.err.println("please use a valid number");
        }
         else
        {
            ssn = numBegin + "-" + numMiddle + "-" + numEnd;
        }
        if (numEnd < 1000 || numEnd > 9999)
        {
            System.err.println("please use a valid number");
        }
         else
        {
            ssn = numBegin + "-" + numMiddle + "-" + numEnd;
        }
    }
    /**
     * Description: Assign Address
     * Input: String
     * Purpose: to allow person to input address into system
     * Example: 1 Spooner Street floral park ny 11001
     */
    public void changeAddress(int number, String streetAddress, String town, String state, int zipCode)
    {
       if (zipCode < 10000 || zipCode > 99999)
       {
           System.err.println("please use a valid number");
        }
        else
        {
            address = number + " " + streetAddress + " " + town + " " + state + " " + zipCode;
    }
    }
    /** 
     * Description: Assign phone number
     * Input: String (three int that complie to a string)
     * Purpose: to allow person to input phone number into system
     * Example: 111-111-1111
     */
    public void changePhoneNumber(int areaCode, int threeNumbers, int fourNumbers)
    {if (areaCode < 100 || areaCode > 999)
        {
            System.err.println("please use a valid number");
        }
        else
        {
            phoneNumber = areaCode + "-" + threeNumbers + "-" + fourNumbers;
        }
        if (threeNumbers < 100 || threeNumbers > 999)
        
        {
            System.err.println("please use a valid number");
        }
         else
        {
            phoneNumber = areaCode + "-" + threeNumbers + "-" + fourNumbers;
        }
        if (fourNumbers < 1000 || fourNumbers > 9999)
        {
            System.err.println("please use a valid number");
        }
         else
        {
            phoneNumber = areaCode + "-" + threeNumbers + "-" + fourNumbers;
        }
    }
    /**
     * Description: Assign birthdate
     * Input: three int that compile to a string
     * Purpose: to allow person to input birthdate into system
     * Example: 9/26/1995
     */
    public void changeBirthdate(int month, int day, int year)
    {if (month < 1 || month > 12)
        {
            System.err.println("please use a valid number");
        }
        else
        {
            birthdate = month + "/" + day + "/" + year;
        }
        if (day < 1 || day > 31)
        
        {
            System.err.println("please use a valid number");
        }
         else
        {
             birthdate = month + "/" + day + "/" + year;
        }
        if (year < 1900 || year > 2016)
        {
            System.err.println("please use a valid number");
        }
         else
        {
             birthdate = month + "/" + day + "/" + year;
        }
    }
    /**
     *Description: print information
     * Purpose: to print all information together
     */
    public void printinfo()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(ssn);
        System.out.println(address);
        System.out.println(phoneNumber);
        System.out.println(birthdate);
    }
}
