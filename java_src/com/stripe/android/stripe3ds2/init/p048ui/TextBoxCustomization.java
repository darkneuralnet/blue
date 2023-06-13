package com.stripe.android.stripe3ds2.init.p048ui;

import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
/* renamed from: com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization */
/* loaded from: classes7.dex */
public interface TextBoxCustomization extends Customization {
    String getBorderColor();

    int getBorderWidth();

    int getCornerRadius();

    String getHintTextColor();

    void setBorderColor(String str) throws InvalidInputException;

    void setBorderWidth(int i) throws InvalidInputException;

    void setCornerRadius(int i) throws InvalidInputException;

    void setHintTextColor(String str) throws InvalidInputException;
}
