using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FontSelector
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string selectedFont = fontBox.SelectedItem.ToString();
            float selectedSize = Convert.ToSingle(sizeBox.SelectedItem);
            System.Drawing.Font selection = new System.Drawing.Font(selectedFont, selectedSize);
            label1.Text = "Hello";
            label1.Font = selection;
            
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
