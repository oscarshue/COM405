package week7;

public class Employees 
{
    private String name;
    private int payRate;
    private int hoursPerWeek;
    private int holidayEntitlement;
    
    public Employees(String nameIn, int payRateIn, int hoursPerWeekIn, int holidayEntitlementIn)
    {
        name = nameIn;
        payRate = payRateIn;
        hoursPerWeek = hoursPerWeekIn;
        holidayEntitlement = holidayEntitlementIn;
    }
    
    public int SetPayRate(int payRateIn)
    {
        payRate = payRateIn;
        return payRate;
    }
    
    public int SetHoursPerWeek(int hoursPerWeekIn)
    {
        if(hoursPerWeekIn <= 40){
            hoursPerWeek = hoursPerWeekIn;
            return hoursPerWeek;
        } else {
            System.out.println("Can't set weekly hours over 40.");
            return hoursPerWeek;
        }
    }
    
    public int GetPayRate(){
        return payRate;
    }
    
    public int BookHoliday(int holidayRequest)
    {
        if(holidayEntitlement >= holidayRequest){
            holidayEntitlement = holidayEntitlement - holidayRequest;
            return holidayEntitlement;
        } else {
            System.out.println("Not enough holiday allowance for this request.");
            return holidayEntitlement;
        }
    }
    
    public void ViewEmployeeDetails(){
        System.out.println("Yearly salary: " + GetPayRate());
    }
}