package com.stripe.android.stripe3ds2.init.p048ui;

import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
/* renamed from: com.stripe.android.stripe3ds2.init.ui.UiCustomization */
/* loaded from: classes7.dex */
public interface UiCustomization {

    /* renamed from: com.stripe.android.stripe3ds2.init.ui.UiCustomization$ButtonType */
    /* loaded from: classes7.dex */
    public enum ButtonType {
        SUBMIT,
        CONTINUE,
        NEXT,
        CANCEL,
        RESEND,
        SELECT
    }

    String getAccentColor();

    ButtonCustomization getButtonCustomization(ButtonType buttonType) throws InvalidInputException;

    ButtonCustomization getButtonCustomization(String str) throws InvalidInputException;

    LabelCustomization getLabelCustomization();

    TextBoxCustomization getTextBoxCustomization();

    ToolbarCustomization getToolbarCustomization();

    void setAccentColor(String str) throws InvalidInputException;

    void setButtonCustomization(ButtonCustomization buttonCustomization, ButtonType buttonType) throws InvalidInputException;

    void setButtonCustomization(ButtonCustomization buttonCustomization, String str) throws InvalidInputException;

    void setLabelCustomization(LabelCustomization labelCustomization) throws InvalidInputException;

    void setTextBoxCustomization(TextBoxCustomization textBoxCustomization) throws InvalidInputException;

    void setToolbarCustomization(ToolbarCustomization toolbarCustomization) throws InvalidInputException;
}
