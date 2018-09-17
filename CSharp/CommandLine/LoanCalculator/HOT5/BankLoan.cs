using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HOT5
{
    class BankLoan
    {
        private double loanAmount;
        protected const double INTEREST_RATE = .05;
        public double LoanAmount
        {
            get
            {
                return loanAmount;
            }
            set
            {
                loanAmount = value;
            }
        }
        public void MakePayment()
        {
            if (LoanAmount >= 200)
            {
                LoanAmount -= 200;
            }
            else
            {
                LoanAmount = 0;
            }
        }
        public void AddInterest()
        {
            LoanAmount = LoanAmount + (LoanAmount * INTEREST_RATE);
        }
    }
}
