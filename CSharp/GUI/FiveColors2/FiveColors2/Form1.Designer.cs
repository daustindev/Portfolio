namespace FiveColors2
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
            this.redBtn = new System.Windows.Forms.RadioButton();
            this.blueBtn = new System.Windows.Forms.RadioButton();
            this.yellowBtn = new System.Windows.Forms.RadioButton();
            this.greenBtn = new System.Windows.Forms.RadioButton();
            this.purpleBtn = new System.Windows.Forms.RadioButton();
            this.SuspendLayout();
            // 
            // redBtn
            // 
            this.redBtn.AutoSize = true;
            this.redBtn.Location = new System.Drawing.Point(13, 31);
            this.redBtn.Name = "redBtn";
            this.redBtn.Size = new System.Drawing.Size(45, 17);
            this.redBtn.TabIndex = 0;
            this.redBtn.TabStop = true;
            this.redBtn.Text = "Red";
            this.redBtn.UseVisualStyleBackColor = true;
            this.redBtn.CheckedChanged += new System.EventHandler(this.redBtn_CheckedChanged);
            // 
            // blueBtn
            // 
            this.blueBtn.AutoSize = true;
            this.blueBtn.Location = new System.Drawing.Point(13, 66);
            this.blueBtn.Name = "blueBtn";
            this.blueBtn.Size = new System.Drawing.Size(46, 17);
            this.blueBtn.TabIndex = 1;
            this.blueBtn.TabStop = true;
            this.blueBtn.Text = "Blue";
            this.blueBtn.UseVisualStyleBackColor = true;
            this.blueBtn.CheckedChanged += new System.EventHandler(this.blueBtn_CheckedChanged);
            // 
            // yellowBtn
            // 
            this.yellowBtn.AutoSize = true;
            this.yellowBtn.Location = new System.Drawing.Point(13, 102);
            this.yellowBtn.Name = "yellowBtn";
            this.yellowBtn.Size = new System.Drawing.Size(56, 17);
            this.yellowBtn.TabIndex = 2;
            this.yellowBtn.TabStop = true;
            this.yellowBtn.Text = "Yellow";
            this.yellowBtn.UseVisualStyleBackColor = true;
            this.yellowBtn.CheckedChanged += new System.EventHandler(this.yellowBtn_CheckedChanged);
            // 
            // greenBtn
            // 
            this.greenBtn.AutoSize = true;
            this.greenBtn.Location = new System.Drawing.Point(13, 139);
            this.greenBtn.Name = "greenBtn";
            this.greenBtn.Size = new System.Drawing.Size(54, 17);
            this.greenBtn.TabIndex = 3;
            this.greenBtn.TabStop = true;
            this.greenBtn.Text = "Green";
            this.greenBtn.UseVisualStyleBackColor = true;
            this.greenBtn.CheckedChanged += new System.EventHandler(this.greenBtn_CheckedChanged);
            // 
            // purpleBtn
            // 
            this.purpleBtn.AutoSize = true;
            this.purpleBtn.Location = new System.Drawing.Point(13, 175);
            this.purpleBtn.Name = "purpleBtn";
            this.purpleBtn.Size = new System.Drawing.Size(55, 17);
            this.purpleBtn.TabIndex = 4;
            this.purpleBtn.TabStop = true;
            this.purpleBtn.Text = "Purple";
            this.purpleBtn.UseVisualStyleBackColor = true;
            this.purpleBtn.CheckedChanged += new System.EventHandler(this.purpleBtn_CheckedChanged);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(284, 261);
            this.Controls.Add(this.purpleBtn);
            this.Controls.Add(this.greenBtn);
            this.Controls.Add(this.yellowBtn);
            this.Controls.Add(this.blueBtn);
            this.Controls.Add(this.redBtn);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.RadioButton redBtn;
        private System.Windows.Forms.RadioButton blueBtn;
        private System.Windows.Forms.RadioButton yellowBtn;
        private System.Windows.Forms.RadioButton greenBtn;
        private System.Windows.Forms.RadioButton purpleBtn;
    }
}

