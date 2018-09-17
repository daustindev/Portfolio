namespace FlorencesFloralCreations
{
    partial class Form1
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
            this.occasionBox = new System.Windows.Forms.ListBox();
            this.flowerChoices = new System.Windows.Forms.ListBox();
            this.occasionLabel = new System.Windows.Forms.Label();
            this.flowerLabel = new System.Windows.Forms.Label();
            this.congratsLabel = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // occasionBox
            // 
            this.occasionBox.FormattingEnabled = true;
            this.occasionBox.Items.AddRange(new object[] {
            "Get Well",
            "I\'m sorry",
            "I do not like you"});
            this.occasionBox.Location = new System.Drawing.Point(18, 66);
            this.occasionBox.Name = "occasionBox";
            this.occasionBox.Size = new System.Drawing.Size(259, 186);
            this.occasionBox.TabIndex = 0;
            this.occasionBox.SelectedIndexChanged += new System.EventHandler(this.occasionBox_SelectedIndexChanged);
            // 
            // flowerChoices
            // 
            this.flowerChoices.FormattingEnabled = true;
            this.flowerChoices.Location = new System.Drawing.Point(426, 66);
            this.flowerChoices.Name = "flowerChoices";
            this.flowerChoices.Size = new System.Drawing.Size(259, 186);
            this.flowerChoices.TabIndex = 1;
            this.flowerChoices.Visible = false;
            this.flowerChoices.SelectedIndexChanged += new System.EventHandler(this.flowerChoices_SelectedIndexChanged);
            // 
            // occasionLabel
            // 
            this.occasionLabel.AutoSize = true;
            this.occasionLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.occasionLabel.Location = new System.Drawing.Point(13, 13);
            this.occasionLabel.Name = "occasionLabel";
            this.occasionLabel.Size = new System.Drawing.Size(102, 25);
            this.occasionLabel.TabIndex = 2;
            this.occasionLabel.Text = "Occasion";
            // 
            // flowerLabel
            // 
            this.flowerLabel.AutoSize = true;
            this.flowerLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.flowerLabel.Location = new System.Drawing.Point(583, 13);
            this.flowerLabel.Name = "flowerLabel";
            this.flowerLabel.Size = new System.Drawing.Size(76, 25);
            this.flowerLabel.TabIndex = 3;
            this.flowerLabel.Text = "Flower";
            // 
            // congratsLabel
            // 
            this.congratsLabel.AutoSize = true;
            this.congratsLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.congratsLabel.Location = new System.Drawing.Point(287, 299);
            this.congratsLabel.Name = "congratsLabel";
            this.congratsLabel.Size = new System.Drawing.Size(143, 25);
            this.congratsLabel.TabIndex = 4;
            this.congratsLabel.Text = "Good Choice!";
            this.congratsLabel.Visible = false;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(687, 511);
            this.Controls.Add(this.congratsLabel);
            this.Controls.Add(this.flowerLabel);
            this.Controls.Add(this.occasionLabel);
            this.Controls.Add(this.flowerChoices);
            this.Controls.Add(this.occasionBox);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListBox occasionBox;
        private System.Windows.Forms.ListBox flowerChoices;
        private System.Windows.Forms.Label occasionLabel;
        private System.Windows.Forms.Label flowerLabel;
        private System.Windows.Forms.Label congratsLabel;
    }
}

