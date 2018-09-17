using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TaxPayerDemo2
{
    class Program
    {
        static void Main(string[] args)
        {
            Taxpayer[] txpayerArray = new Taxpayer[10];
            for (int i = 0; i < txpayerArray.Length; ++i)
                txpayerArray[i] = new Taxpayer();
            txpayerArray[0].SocialSecNum = "012345678";
            txpayerArray[0].Income = 30000;
            txpayerArray[1].SocialSecNum = "123456789";
            txpayerArray[1].Income = 50000;
            txpayerArray[2].SocialSecNum = "234567890";
            txpayerArray[2].Income = 35000;
            txpayerArray[3].SocialSecNum = "345678901";
            txpayerArray[3].Income = 40000;
            txpayerArray[4].SocialSecNum = "456789012";
            txpayerArray[4].Income = 45000;
            txpayerArray[5].SocialSecNum = "567890123";
            txpayerArray[5].Income = 5000;
            txpayerArray[6].SocialSecNum = "678901234";
            txpayerArray[6].Income = 15000;
            txpayerArray[7].SocialSecNum = "789012345";
            txpayerArray[7].Income = 20000;
            txpayerArray[8].SocialSecNum = "890123456";
            txpayerArray[8].Income = 25000;
            txpayerArray[9].SocialSecNum = "901234567";
            txpayerArray[9].Income = 10000;            
            Console.WriteLine("Before Sorting");
            Console.WriteLine("******************************");
            for (int i = 0; i < txpayerArray.Length; ++i)// for loop to calculate, prep and display information before sorting
            {
                txpayerArray[i].CalcTax();               
                txpayerArray[i].DisplayDetails(i);
                Console.ReadLine();
            }//end for
            Array.Sort(txpayerArray);
            Console.WriteLine();
            Console.WriteLine();
            Console.WriteLine();
            Console.WriteLine("After Sorting");
            Console.WriteLine("******************************");
            for (int i = 0; i < txpayerArray.Length; ++i)// for loop to calculate, prep and display information before sorting
            {
                txpayerArray[i].CalcTax();
                txpayerArray[i].DisplayDetails(i);
                Console.ReadLine();
            }//end for
        }//end main
    }//end program
}//end namespace

