using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HOT5
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Doug's Dubious Loans");
            bool enteredPositive = false;
            BankLoan loan1 = new BankLoan();
            while(enteredPositive == false)
            {
                Console.WriteLine("Please enter a loan amount?");
                string entry = Console.ReadLine();
                double enteredVal;
                double.TryParse(entry, out enteredVal);            
                if(enteredVal > 0)
                {
                    loan1.LoanAmount = enteredVal;
                    enteredPositive = true;
                }
                else
                {
                    Console.WriteLine("Please enter a positive number");
                }
            }
            Console.WriteLine("The original bank loan was {0}.", loan1.LoanAmount.ToString("C"));
            loan1.MakePayment();
            Console.WriteLine("After the first payment of $200, the loan is down to {0}.", loan1.LoanAmount.ToString("C"));
            loan1.AddInterest();
            Console.WriteLine("After the first round of interest at 5%, the loan amount is {0}.", loan1.LoanAmount.ToString("C"));
            Console.WriteLine();
            CarLoan loan2 = new CarLoan();
            enteredPositive = false;
            Console.WriteLine("What was the name of the car dealer?");
            loan2.DealerName = Console.ReadLine();
            while (enteredPositive == false)
            {
                Console.WriteLine("Please enter a loan amount?");              
                string entry = Console.ReadLine();
                double enteredVal;
                double.TryParse(entry, out enteredVal);            
                if(enteredVal > 0)
                {
                    loan2.LoanAmount = enteredVal;
                    enteredPositive = true;
                }
                else
                {
                    Console.WriteLine("Please enter a positive number");
                }
            }
            Console.WriteLine("The auto dealer was {0}", loan2.DealerName);
            Console.WriteLine("The original bank loan was {0}.", loan2.LoanAmount.ToString("C"));
            loan2.MakePayment();
            Console.WriteLine("After the first payment of $450, the loan is down to {0}.", loan2.LoanAmount.ToString("C"));
            loan2.AddInterest();
            Console.WriteLine("After the first round of interest at 5%, the loan amount is {0}.", loan2.LoanAmount.ToString("C"));
            Console.ReadLine();
        }
    }
}
