package com.stripe.android.stripe3ds2.init.p048ui;

import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
/* renamed from: com.stripe.android.stripe3ds2.init.ui.Customization */
/* loaded from: classes7.dex */
public interface Customization {
    String getTextColor();

    String getTextFontName();

    int getTextFontSize();

    void setTextColor(String str) throws InvalidInputException;

    void setTextFontName(String str) throws InvalidInputException;

    void setTextFontSize(int i) throws InvalidInputException;
}
