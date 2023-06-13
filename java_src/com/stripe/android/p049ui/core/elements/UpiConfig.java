package com.stripe.android.p049ui.core.elements;

import com.stripe.android.p049ui.core.C19369R;
import com.stripe.android.uicore.elements.TextFieldConfig;
import com.stripe.android.uicore.elements.TextFieldIcon;
import com.stripe.android.uicore.elements.TextFieldState;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u001aR\u001c\u0010#\u001a\u0004\u0018\u00010\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010.\u001a\b\u0012\u0004\u0012\u00020-0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/UpiConfig;", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "", "input", "Lcom/stripe/android/uicore/elements/TextFieldState;", "determineState", "userTyped", "filter", "displayName", "convertToRaw", "rawValue", "convertFromRaw", "Lkotlin/text/Regex;", "upiPattern$delegate", "Lkotlin/Lazy;", "getUpiPattern", "()Lkotlin/text/Regex;", "upiPattern", "", "label", "I", "getLabel", "()Ljava/lang/Integer;", "Lal2;", "capitalization", "getCapitalization-IUNYP9k", "()I", "debugLabel", "Ljava/lang/String;", "getDebugLabel", "()Ljava/lang/String;", "Lcl2;", "keyboard", "getKeyboard-PjHm6EE", "LEu6;", "visualTransformation", "LEu6;", "getVisualTransformation", "()LEu6;", "LtP5;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "trailingIcon", "LtP5;", "getTrailingIcon", "()LtP5;", "", "loading", "getLoading", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.UpiConfig */
/* loaded from: classes7.dex */
public final class UpiConfig implements TextFieldConfig {
    public static final int $stable = 8;
    private final int capitalization;
    private final String debugLabel;
    private final int keyboard;
    private final int label;
    private final InterfaceC49220tP5<Boolean> loading;
    private final InterfaceC49220tP5<TextFieldIcon> trailingIcon;
    private final Lazy upiPattern$delegate;
    private final InterfaceC32735Eu6 visualTransformation;

    public UpiConfig() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(UpiConfig$upiPattern$2.INSTANCE);
        this.upiPattern$delegate = lazy;
        this.label = C19369R.string.upi_id_label;
        this.capitalization = C38143al2.f51187a.m70783b();
        this.debugLabel = "upi_id";
        this.keyboard = C39329cl2.f61189b.m60913c();
        this.trailingIcon = C50405vP5.m8742a(null);
        this.loading = C50405vP5.m8742a(Boolean.FALSE);
    }

    private final Regex getUpiPattern() {
        return (Regex) this.upiPattern$delegate.getValue();
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String convertFromRaw(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        return rawValue;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String convertToRaw(String displayName) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return displayName;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public TextFieldState determineState(String input) {
        boolean z;
        Intrinsics.checkNotNullParameter(input, "input");
        boolean z2 = true;
        if (getUpiPattern().matches(input) && input.length() <= 30) {
            z = true;
        } else {
            z = false;
        }
        if (input.length() != 0) {
            z2 = false;
        }
        if (z2) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        if (z) {
            return TextFieldStateConstants.Valid.Limitless.INSTANCE;
        }
        return new TextFieldStateConstants.Error.Incomplete(C19369R.string.invalid_upi_id);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String filter(String userTyped) {
        CharSequence trim;
        Intrinsics.checkNotNullParameter(userTyped, "userTyped");
        trim = StringsKt__StringsKt.trim((CharSequence) userTyped);
        return trim.toString();
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    /* renamed from: getCapitalization-IUNYP9k */
    public int mo116656getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    /* renamed from: getKeyboard-PjHm6EE */
    public int mo116657getKeyboardPjHm6EE() {
        return this.keyboard;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public Integer getLabel() {
        return Integer.valueOf(this.label);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public InterfaceC49220tP5<Boolean> getLoading() {
        return this.loading;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String getPlaceHolder() {
        return TextFieldConfig.DefaultImpls.getPlaceHolder(this);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public InterfaceC49220tP5<TextFieldIcon> getTrailingIcon() {
        return this.trailingIcon;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public InterfaceC32735Eu6 getVisualTransformation() {
        return this.visualTransformation;
    }
}
