package com.stripe.android.p049ui.core.elements;

import com.stripe.android.model.CardBrand;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.uicore.elements.TextFieldState;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H&R\u001d\u0010\u0013\u001a\u00020\u00108&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u001d\u0010\u001b\u001a\u00020\u00198&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/CardDetailsTextFieldConfig;", "", "Lcom/stripe/android/model/CardBrand;", AccountRangeJsonParser.FIELD_BRAND, "", "number", "", "numberAllowedDigits", "Lcom/stripe/android/uicore/elements/TextFieldState;", "determineState", "userTyped", "filter", "displayName", "convertToRaw", "rawValue", "convertFromRaw", "Lal2;", "getCapitalization-IUNYP9k", "()I", "capitalization", "getDebugLabel", "()Ljava/lang/String;", "debugLabel", "getLabel", "label", "Lcl2;", "getKeyboard-PjHm6EE", "keyboard", "LEu6;", "getVisualTransformation", "()LEu6;", "visualTransformation", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig */
/* loaded from: classes7.dex */
public interface CardDetailsTextFieldConfig {
    String convertFromRaw(String str);

    String convertToRaw(String str);

    TextFieldState determineState(CardBrand cardBrand, String str, int i);

    String filter(String str);

    /* renamed from: getCapitalization-IUNYP9k  reason: not valid java name */
    int mo116659getCapitalizationIUNYP9k();

    String getDebugLabel();

    /* renamed from: getKeyboard-PjHm6EE  reason: not valid java name */
    int mo116660getKeyboardPjHm6EE();

    int getLabel();

    InterfaceC32735Eu6 getVisualTransformation();
}
