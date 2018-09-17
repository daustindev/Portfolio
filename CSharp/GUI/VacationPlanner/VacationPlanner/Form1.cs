using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace VacationPlanner
{
    public partial class VacationPlanner : Form
    {
        public VacationPlanner()
        {
            InitializeComponent();
        }

        private void submit_Click(object sender, EventArgs e)
        {
            label2.Text = "Total: ";
            double tripPrice = 0;
            double roomPrice = 0;
            double mealPrice = 0;
            if(cityBox.SelectedIndex == 0)
            {
                tripPrice = 500;
 
            }
            else if(cityBox.SelectedIndex == 1)
            {
                tripPrice = 550;
 
            }
            else if (cityBox.SelectedIndex == 2)
            {
                tripPrice = 600;
 
            }
            if (roomBox.SelectedIndex == 0)
            {
                roomPrice = 150;

            }
            else if (roomBox.SelectedIndex == 1)
            {

            }
            else if (roomBox.SelectedIndex == 2)
            {
                roomPrice = 500;

            }
            if (mealBox.SelectedIndex == 0)
            {
                mealPrice = 100;

            }
            else if (mealBox.SelectedIndex == 1)
            {
                mealPrice = 200;
 
            }
            else if (mealBox.SelectedIndex == 2)
            {
                mealPrice = 400;

            }
            double total = tripPrice + roomPrice + mealPrice;
            label2.Text += total.ToString("c");
        }
    }
}
