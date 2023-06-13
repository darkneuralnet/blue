package com.stripe.android.p049ui.core.elements;

import com.stripe.android.model.CardBrand;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.p049ui.core.C19369R;
import com.stripe.android.uicore.elements.TextFieldState;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016R#\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R#\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/CvcConfig;", "Lcom/stripe/android/ui/core/elements/CardDetailsTextFieldConfig;", "Lcom/stripe/android/model/CardBrand;", AccountRangeJsonParser.FIELD_BRAND, "", "number", "", "numberAllowedDigits", "Lcom/stripe/android/uicore/elements/TextFieldState;", "determineState", "userTyped", "filter", "displayName", "convertToRaw", "rawValue", "convertFromRaw", "Lal2;", "capitalization", "I", "getCapitalization-IUNYP9k", "()I", "debugLabel", "Ljava/lang/String;", "getDebugLabel", "()Ljava/lang/String;", "label", "getLabel", "Lcl2;", "keyboard", "getKeyboard-PjHm6EE", "LEu6;", "visualTransformation", "LEu6;", "getVisualTransformation", "()LEu6;", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCvcConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CvcConfig.kt\ncom/stripe/android/ui/core/elements/CvcConfig\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,50:1\n429#2:51\n502#2,5:52\n*S KotlinDebug\n*F\n+ 1 CvcConfig.kt\ncom/stripe/android/ui/core/elements/CvcConfig\n*L\n44#1:51\n44#1:52,5\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.CvcConfig */
/* loaded from: classes7.dex */
public final class CvcConfig implements CardDetailsTextFieldConfig {
    public static final int $stable = 0;
    private final int capitalization = C38143al2.f51187a.m70783b();
    private final String debugLabel = "cvc";
    private final int label = C19369R.string.cvc_number_hint;
    private final int keyboard = C39329cl2.f61189b.m60911e();
    private final InterfaceC32735Eu6 visualTransformation = InterfaceC32735Eu6.f8291a.m108216a();

    @Override // com.stripe.android.p049ui.core.elements.CardDetailsTextFieldConfig
    public String convertFromRaw(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        return rawValue;
    }

    @Override // com.stripe.android.p049ui.core.elements.CardDetailsTextFieldConfig
    public String convertToRaw(String displayName) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return displayName;
    }

    @Override // com.stripe.android.p049ui.core.elements.CardDetailsTextFieldConfig
    public TextFieldState determineState(CardBrand brand, String number, int i) {
        boolean z;
        TextFieldStateConstants.Error.Invalid invalid;
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(number, "number");
        boolean z2 = true;
        if (brand.getMaxCvcLength() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (number.length() != 0) {
            z2 = false;
        }
        if (z2) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        if (brand == CardBrand.Unknown) {
            if (number.length() == i) {
                return TextFieldStateConstants.Valid.Full.INSTANCE;
            }
            return TextFieldStateConstants.Valid.Limitless.INSTANCE;
        } else if (z && number.length() < i) {
            return new TextFieldStateConstants.Error.Incomplete(C19369R.string.invalid_cvc);
        } else {
            if (z && number.length() > i) {
                invalid = new TextFieldStateConstants.Error.Invalid(C19369R.string.invalid_cvc, null, 2, null);
            } else if (z && number.length() == i) {
                return TextFieldStateConstants.Valid.Full.INSTANCE;
            } else {
                invalid = new TextFieldStateConstants.Error.Invalid(C19369R.string.invalid_cvc, null, 2, null);
            }
            return invalid;
        }
    }

    @Override // com.stripe.android.p049ui.core.elements.CardDetailsTextFieldConfig
    public String filter(String userTyped) {
        Intrinsics.checkNotNullParameter(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i = 0; i < length; i++) {
            char charAt = userTyped.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
        return sb2;
    }

    @Override // com.stripe.android.p049ui.core.elements.CardDetailsTextFieldConfig
    /* renamed from: getCapitalization-IUNYP9k */
    public int mo116659getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    @Override // com.stripe.android.p049ui.core.elements.CardDetailsTextFieldConfig
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.p049ui.core.elements.CardDetailsTextFieldConfig
    /* renamed from: getKeyboard-PjHm6EE */
    public int mo116660getKeyboardPjHm6EE() {
        return this.keyboard;
    }

    @Override // com.stripe.android.p049ui.core.elements.CardDetailsTextFieldConfig
    public int getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.p049ui.core.elements.CardDetailsTextFieldConfig
    public InterfaceC32735Eu6 getVisualTransformation() {
        return this.visualTransformation;
    }
}
