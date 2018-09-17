using System;
using static System.Console;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TaxPayerDemo2
{
    class Taxpayer : IComparable             
    {
        private string socialSecNum;
        public string SocialSecNum
        {
            get
            {
                return socialSecNum;
            }
            set
            {
                socialSecNum = value;
            }
        }
        private double income;
        public double Income
        {
            get
            {
                return income;
            }
            set
            {
                income = value;
            }
        }
        private double taxOwed;
        public double TaxOwed
        {
            get
            {
                return taxOwed;
            }
        }
        public void CalcTax()
        {
            if (Income < 30000)
            {
                taxOwed = income * .15;
            }
            else
            {
                taxOwed = income * .28;
            }
        }
        int IComparable.CompareTo(object obj)
        {
            int returnVal;
            Taxpayer temp = (Taxpayer)obj;
            if (this.taxOwed > temp.taxOwed)
                returnVal = 1;
            else if (this.taxOwed < temp.taxOwed)
                returnVal = -1;
            else
                returnVal = 0;
            return returnVal;
        }
        public void DisplayDetails(int index)//preps and displays properties
        {
            string position = "";
            switch (index)//assign positional names (first, second, etc.) to each object
            {
                case 0:
                    position = "First Taxpayer";
                    break;
                case 1:
                    position = "Second Taxpayer";
                    break;
                case 2:
                    position = "Third Taxpayer";
                    break;
                case 3:
                    position = "Fourth Taxpayer";
                    break;
                case 4:
                    position = "Fifth Taxpayer";
                    break;
                case 5:
                    position = "Sixth Taxpayer";
                    break;
                case 6:
                    position = "Seventh Taxpayer";
                    break;
                case 7:
                    position = "Eighth Taxpayer";
                    break;
                case 8:
                    position = "Ninth Taxpayer";
                    break;
                case 9:
                    position = "Tenth Taxpayer";
                    break;
            }//end switch                
            if (position == "First Taxpayer")
            {
                WriteLine("{0, 21}", position);
                WriteLine("-------------------------------------");
                Write("Social Security Number: {0}\nGross Income:{1}\nTaxes Owed: {2}\n", SocialSecNum, Income.ToString("C"), TaxOwed.ToString("C"));
            }
            else
            {
                WriteLine("_____________________________________________________");
                WriteLine();
                WriteLine("{0, 21}", position);
                WriteLine("-------------------------------------");
                Write("Social Security Number: {0}\nGross Income: {1}\nTaxes Owed: {2}\n", SocialSecNum, Income.ToString("C"), TaxOwed.ToString("C"));
            }
        }//end DisplayDetails
    }//end taxpayer
}//end namespace
