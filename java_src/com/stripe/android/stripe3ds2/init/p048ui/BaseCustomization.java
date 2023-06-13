package com.stripe.android.stripe3ds2.init.p048ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
/* renamed from: com.stripe.android.stripe3ds2.init.ui.BaseCustomization */
/* loaded from: classes7.dex */
public abstract class BaseCustomization implements Customization, Parcelable {
    private String mTextColor;
    private String mTextFontName;
    private int mTextFontSize;

    public BaseCustomization() {
    }

    @Override // com.stripe.android.stripe3ds2.init.p048ui.Customization
    public String getTextColor() {
        return this.mTextColor;
    }

    @Override // com.stripe.android.stripe3ds2.init.p048ui.Customization
    public String getTextFontName() {
        return this.mTextFontName;
    }

    @Override // com.stripe.android.stripe3ds2.init.p048ui.Customization
    public int getTextFontSize() {
        return this.mTextFontSize;
    }

    @Override // com.stripe.android.stripe3ds2.init.p048ui.Customization
    public void setTextColor(String str) throws InvalidInputException {
        this.mTextColor = CustomizeUtils.requireValidColor(str);
    }

    @Override // com.stripe.android.stripe3ds2.init.p048ui.Customization
    public void setTextFontName(String str) throws InvalidInputException {
        this.mTextFontName = CustomizeUtils.requireValidString(str);
    }

    @Override // com.stripe.android.stripe3ds2.init.p048ui.Customization
    public void setTextFontSize(int i) throws InvalidInputException {
        this.mTextFontSize = CustomizeUtils.requireValidFontSize(i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTextFontName);
        parcel.writeString(this.mTextColor);
        parcel.writeInt(this.mTextFontSize);
    }

    public BaseCustomization(Parcel parcel) {
        this.mTextFontName = parcel.readString();
        this.mTextColor = parcel.readString();
        this.mTextFontSize = parcel.readInt();
    }
}
