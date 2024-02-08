package edu.sullivb.exercises08;

public class Statistics {
    private double [] data;

    public Statistics(double [] numbers) {
        data = new double[numbers.length];
        for(int i = 0; i < data.length; i ++) {
            data[i] = numbers[i];
        }
    }
    public double getMean() {
        double sum = 0;
        //for(int i =0 ; i < data.length; i++) {
        //    sum += data[i];
        // }
        for(double d: data) {
            sum += d;
        }
        double average = sum / data.length;
        return average;
    }

    public double getStandardDev() {
        double average = getMean();
        double sum = 0;
        for(double d: data) {
            d = (d - average);
            d *= d; //d^2
            sum += d;
        }
        sum /= data.length;
        return Math.sqrt(sum);
    }
    public String toString() {
        double mean = getMean();
        double stddev = getStandardDev();
        String s = "ARRAY CONTENTS: \n[";
        for(double d: data) {
            s += d;
            if(d != data[data.length-1]) { s+= ", "; }
        }
        s += "]\nMEAN = " + mean + "\n";
        s += "STANDARD DEV. = " + stddev + "\n";
        return s;
    }
}
