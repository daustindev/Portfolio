using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HOT5
{
    class CarLoan : BankLoan
    {
        private string dealerName;
        public string DealerName
        {
            get
            {
                return dealerName;
            }
            set
            {
                dealerName = value;
            }
        }
        public new void MakePayment()
        {
            if (LoanAmount >= 450)
            {
                LoanAmount -= 450;
            }
            else
            {
                LoanAmount = 0;
            }
        }
    }
}
