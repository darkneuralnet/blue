package com.stripe.android.stripe3ds2.init.p048ui;

import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
/* renamed from: com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization */
/* loaded from: classes7.dex */
public interface ToolbarCustomization extends Customization {
    String getBackgroundColor();

    String getButtonText();

    String getHeaderText();

    String getStatusBarColor();

    void setBackgroundColor(String str) throws InvalidInputException;

    void setButtonText(String str) throws InvalidInputException;

    void setHeaderText(String str) throws InvalidInputException;

    void setStatusBarColor(String str) throws InvalidInputException;
}
