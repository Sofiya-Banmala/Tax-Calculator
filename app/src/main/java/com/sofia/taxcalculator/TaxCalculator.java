package com.sofia.taxcalculator;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TaxCalculator {
    private EditText txt;
    private Button btn;
    private TextView output;
    private float sal,tax,year;

    public TaxCalculator(EditText txt, Button btn, TextView output, float sal, float tax, float year) {
        this.txt = txt;
        this.btn = btn;
        this.output = output;
        this.sal = sal;
        this.tax = tax;
        this.year = year;
    }

    public EditText getTxt() {
        return txt;
    }

    public void setTxt(EditText txt) {
        this.txt = txt;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    public TextView getOutput() {
        return output;
    }

    public void setOutput(TextView output) {
        this.output = output;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getYear() {
        return year;
    }

    public void setYear(float year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "TaxCalculator{" +
                "txt=" + txt +
                ", btn=" + btn +
                ", output=" + output +
                ", sal=" + sal +
                ", tax=" + tax +
                ", year=" + year +
                '}';
    }
}
