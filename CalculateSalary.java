package com.Ajmayen.EmployeeManagement;

import static com.Ajmayen.EmployeeManagement.Employee.payment_perhour;
import static com.Ajmayen.EmployeeManagement.Employee.working_hour;

public class CalculateSalary {
       private double totalSalary_monthly;
       private double totalSalary_yearly;
       private double HR_Bonus ;
       private double Honesty_Bonus ;


    public void Monthly_Salary() {

        totalSalary_monthly = (working_hour * payment_perhour) * 30;
        System.out.println("Monthly Salary: "+this.totalSalary_monthly);

    }
    public void Yearly_Salary(){

        totalSalary_yearly = totalSalary_monthly*12;
        System.out.println("Yearly Salary : "+this.totalSalary_yearly);

        //ID 1 to 100 for all officers
        if (Employee.id >= 1 && Employee.id <= 100){
            System.out.println("Yearly Salary : " + this.totalSalary_yearly);
        }
      //Id 101 to 120 for all HR
        else if (Employee.id >= 101 && Employee.id <= 120){
            totalSalary_yearly = totalSalary_yearly + this.HR_Bonus;

            //The bonus will be given onece in a year and it is two times of monthly salary
            HR_Bonus = (totalSalary_monthly*2 );
            System.out.println("HR Bonus : "+this.HR_Bonus);
            totalSalary_yearly = totalSalary_yearly + HR_Bonus;
            System.out.println("Yearly Salary with HR Bonus:  " + this.totalSalary_yearly);
        }

        //Id 121 to 150 for all Admins
        else if (Employee.id >= 121 && Employee.id <= 150){
            totalSalary_yearly = totalSalary_yearly + this.Honesty_Bonus;

            //The bonus will be given onece in a year and it is two times of monthly salary
            Honesty_Bonus = (totalSalary_monthly*2);
            System.out.println("Admin Honesty Bonus :"+this.Honesty_Bonus);
            totalSalary_yearly = totalSalary_yearly + Honesty_Bonus;
            System.out.println("Yearly Salary with Honesty Bonus: " + this.totalSalary_yearly);
        }
    }

}
