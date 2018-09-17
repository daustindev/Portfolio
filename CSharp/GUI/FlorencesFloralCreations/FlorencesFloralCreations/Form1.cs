using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FlorencesFloralCreations
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void occasionBox_SelectedIndexChanged(object sender, EventArgs e)
        {
            congratsLabel.Visible = false;
            flowerChoices.Visible = true;
            flowerChoices.Items.Clear();
            if (occasionBox.SelectedIndex == 0)
            {
               
                flowerChoices.Items.Add("Roses");
                flowerChoices.Items.Add("Daisies");
            }
            if (occasionBox.SelectedIndex == 1)
            {                
                flowerChoices.Items.Add("Tulips");
                flowerChoices.Items.Add("Roses");
            }
            if (occasionBox.SelectedIndex == 2)
            {               
                flowerChoices.Items.Clear();
                flowerChoices.Items.Add("Deadly Nightshade");
                flowerChoices.Items.Add("Rotting Corpse Flower");
            }
        }

        private void flowerChoices_SelectedIndexChanged(object sender, EventArgs e)
        {
            congratsLabel.Visible = true;
            flowerChoices.Visible = false;
        }
    }
}
