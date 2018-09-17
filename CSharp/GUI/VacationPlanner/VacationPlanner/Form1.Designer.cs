namespace VacationPlanner
{
    partial class VacationPlanner
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.title = new System.Windows.Forms.Label();
            this.destinationLbl = new System.Windows.Forms.Label();
            this.cityBox = new System.Windows.Forms.ListBox();
            this.roomLabel = new System.Windows.Forms.Label();
            this.roomBox = new System.Windows.Forms.ListBox();
            this.mealLabel = new System.Windows.Forms.Label();
            this.mealBox = new System.Windows.Forms.ListBox();
            this.submit = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // title
            // 
            this.title.AutoSize = true;
            this.title.Font = new System.Drawing.Font("Harlow Solid Italic", 72F, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.title.Location = new System.Drawing.Point(241, 9);
            this.title.Name = "title";
            this.title.Size = new System.Drawing.Size(748, 121);
            this.title.TabIndex = 0;
            this.title.Text = "Paradise Planner";
            // 
            // destinationLbl
            // 
            this.destinationLbl.AutoSize = true;
            this.destinationLbl.Font = new System.Drawing.Font("Harlow Solid Italic", 15.75F, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.destinationLbl.Location = new System.Drawing.Point(97, 130);
            this.destinationLbl.Name = "destinationLbl";
            this.destinationLbl.Size = new System.Drawing.Size(138, 26);
            this.destinationLbl.TabIndex = 1;
            this.destinationLbl.Text = "Depart From: ";
            // 
            // cityBox
            // 
            this.cityBox.Font = new System.Drawing.Font("Microsoft Sans Serif", 16F);
            this.cityBox.FormattingEnabled = true;
            this.cityBox.ItemHeight = 25;
            this.cityBox.Items.AddRange(new object[] {
            "Vienna, Austria : $500",
            "Venice, Italy : $550",
            "Paris, France : $600"});
            this.cityBox.Location = new System.Drawing.Point(12, 171);
            this.cityBox.Name = "cityBox";
            this.cityBox.Size = new System.Drawing.Size(300, 104);
            this.cityBox.TabIndex = 2;
            // 
            // roomLabel
            // 
            this.roomLabel.AutoSize = true;
            this.roomLabel.Font = new System.Drawing.Font("Harlow Solid Italic", 15.75F, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.roomLabel.Location = new System.Drawing.Point(554, 130);
            this.roomLabel.Name = "roomLabel";
            this.roomLabel.Size = new System.Drawing.Size(121, 26);
            this.roomLabel.TabIndex = 3;
            this.roomLabel.Text = "Room Type: ";
            // 
            // roomBox
            // 
            this.roomBox.Font = new System.Drawing.Font("Microsoft Sans Serif", 16F);
            this.roomBox.FormattingEnabled = true;
            this.roomBox.ItemHeight = 25;
            this.roomBox.Items.AddRange(new object[] {
            "Single : $150",
            "Suite : $250",
            "Heaven : $500"});
            this.roomBox.Location = new System.Drawing.Point(474, 171);
            this.roomBox.Name = "roomBox";
            this.roomBox.Size = new System.Drawing.Size(300, 104);
            this.roomBox.TabIndex = 4;
            // 
            // mealLabel
            // 
            this.mealLabel.AutoSize = true;
            this.mealLabel.Font = new System.Drawing.Font("Harlow Solid Italic", 15.75F, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.mealLabel.Location = new System.Drawing.Point(983, 130);
            this.mealLabel.Name = "mealLabel";
            this.mealLabel.Size = new System.Drawing.Size(117, 26);
            this.mealLabel.TabIndex = 6;
            this.mealLabel.Text = "Meal Plan: ";
            // 
            // mealBox
            // 
            this.mealBox.Font = new System.Drawing.Font("Microsoft Sans Serif", 16F);
            this.mealBox.FormattingEnabled = true;
            this.mealBox.ItemHeight = 25;
            this.mealBox.Items.AddRange(new object[] {
            "Standard : $100",
            "Deluxe : $200",
            "Feast of the Gods : $400"});
            this.mealBox.Location = new System.Drawing.Point(910, 171);
            this.mealBox.Name = "mealBox";
            this.mealBox.Size = new System.Drawing.Size(300, 104);
            this.mealBox.TabIndex = 7;
            // 
            // submit
            // 
            this.submit.Font = new System.Drawing.Font("Harlow Solid Italic", 15.75F, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.submit.Location = new System.Drawing.Point(559, 338);
            this.submit.Name = "submit";
            this.submit.Size = new System.Drawing.Size(117, 43);
            this.submit.TabIndex = 8;
            this.submit.Text = "Submit";
            this.submit.UseVisualStyleBackColor = true;
            this.submit.Click += new System.EventHandler(this.submit_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Harlow Solid Italic", 20.25F, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(468, 413);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(95, 34);
            this.label2.TabIndex = 9;
            this.label2.Text = "Total:  ";
            // 
            // VacationPlanner
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1229, 746);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.submit);
            this.Controls.Add(this.mealBox);
            this.Controls.Add(this.mealLabel);
            this.Controls.Add(this.roomBox);
            this.Controls.Add(this.roomLabel);
            this.Controls.Add(this.cityBox);
            this.Controls.Add(this.destinationLbl);
            this.Controls.Add(this.title);
            this.Name = "VacationPlanner";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label title;
        private System.Windows.Forms.Label destinationLbl;
        private System.Windows.Forms.ListBox cityBox;
        private System.Windows.Forms.Label roomLabel;
        private System.Windows.Forms.ListBox roomBox;
        private System.Windows.Forms.Label mealLabel;
        private System.Windows.Forms.ListBox mealBox;
        private System.Windows.Forms.Button submit;
        private System.Windows.Forms.Label label2;
    }
}

