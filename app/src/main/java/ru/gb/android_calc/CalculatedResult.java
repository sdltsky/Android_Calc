package ru.gb.android_calc;

import android.os.Parcel;
import android.os.Parcelable;

public class CalculatedResult implements Parcelable {

    private double calculatedResult;

    public CalculatedResult() {
        calculatedResult = 0.0;
    }

    private CalculatedResult(Parcel in) {
        calculatedResult = in.readDouble();
    }

    public double getCalculatedResult() {
        return calculatedResult;
    }

    public void setCalculatedResult(double calculatedResult) {
        this.calculatedResult = calculatedResult;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(calculatedResult);
    }

    public static final Parcelable.Creator<CalculatedResult> CREATOR = new Parcelable.Creator<CalculatedResult>() {

        @Override
        public CalculatedResult createFromParcel(Parcel source) {
            return new CalculatedResult(source);
        }

        @Override
        public CalculatedResult[] newArray(int size) {
            return new CalculatedResult[size];
        }
    };

}
