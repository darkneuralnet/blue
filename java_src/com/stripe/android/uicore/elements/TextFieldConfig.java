package com.stripe.android.uicore.elements;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&R\u001d\u0010\u000f\u001a\u00020\f8&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0019\u001a\u00020\u00178&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010!R\u0016\u0010'\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, m28432d2 = {"Lcom/stripe/android/uicore/elements/TextFieldConfig;", "", "", "input", "Lcom/stripe/android/uicore/elements/TextFieldState;", "determineState", "userTyped", "filter", "displayName", "convertToRaw", "rawValue", "convertFromRaw", "Lal2;", "getCapitalization-IUNYP9k", "()I", "capitalization", "getDebugLabel", "()Ljava/lang/String;", "debugLabel", "", "getLabel", "()Ljava/lang/Integer;", "label", "Lcl2;", "getKeyboard-PjHm6EE", "keyboard", "LEu6;", "getVisualTransformation", "()LEu6;", "visualTransformation", "LtP5;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "getTrailingIcon", "()LtP5;", "trailingIcon", "", "getLoading", "loading", "getPlaceHolder", "placeHolder", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public interface TextFieldConfig {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static String getPlaceHolder(TextFieldConfig textFieldConfig) {
            return null;
        }
    }

    String convertFromRaw(String str);

    String convertToRaw(String str);

    TextFieldState determineState(String str);

    String filter(String str);

    /* renamed from: getCapitalization-IUNYP9k */
    int mo116656getCapitalizationIUNYP9k();

    String getDebugLabel();

    /* renamed from: getKeyboard-PjHm6EE */
    int mo116657getKeyboardPjHm6EE();

    Integer getLabel();

    InterfaceC49220tP5<Boolean> getLoading();

    String getPlaceHolder();

    InterfaceC49220tP5<TextFieldIcon> getTrailingIcon();

    InterfaceC32735Eu6 getVisualTransformation();
}
