package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.C19423R;
import com.stripe.android.uicore.elements.TextFieldConfig;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u0014R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/NameConfig;", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "", "input", "Lcom/stripe/android/uicore/elements/TextFieldState;", "determineState", "userTyped", "filter", "displayName", "convertToRaw", "rawValue", "convertFromRaw", "", "label", "I", "getLabel", "()Ljava/lang/Integer;", "Lal2;", "capitalization", "getCapitalization-IUNYP9k", "()I", "debugLabel", "Ljava/lang/String;", "getDebugLabel", "()Ljava/lang/String;", "Lcl2;", "keyboard", "getKeyboard-PjHm6EE", "LEu6;", "visualTransformation", "LEu6;", "getVisualTransformation", "()LEu6;", "LGX2;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "trailingIcon", "LGX2;", "getTrailingIcon", "()LGX2;", "LtP5;", "", "loading", "LtP5;", "getLoading", "()LtP5;", "<init>", "()V", "Companion", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNameConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NameConfig.kt\ncom/stripe/android/uicore/elements/NameConfig\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,45:1\n429#2:46\n502#2,5:47\n*S KotlinDebug\n*F\n+ 1 NameConfig.kt\ncom/stripe/android/uicore/elements/NameConfig\n*L\n32#1:46\n32#1:47,5\n*E\n"})
/* loaded from: classes7.dex */
public final class NameConfig implements TextFieldConfig {
    private final InterfaceC32735Eu6 visualTransformation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final int label = C19423R.string.address_label_full_name;
    private final int capitalization = C38143al2.f51187a.m70781d();
    private final String debugLabel = "name";
    private final int keyboard = C39329cl2.f61189b.m60908h();
    private final GX2<TextFieldIcon> trailingIcon = C50405vP5.m8742a(null);
    private final InterfaceC49220tP5<Boolean> loading = C50405vP5.m8742a(Boolean.FALSE);

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/NameConfig$Companion;", "", "()V", "createController", "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "initialValue", "", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SimpleTextFieldController createController(String str) {
            return new SimpleTextFieldController(new NameConfig(), false, str, 2, null);
        }

        private Companion() {
        }
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
        boolean isBlank;
        Intrinsics.checkNotNullParameter(input, "input");
        isBlank = StringsKt__StringsJVMKt.isBlank(input);
        if (isBlank) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        return TextFieldStateConstants.Valid.Limitless.INSTANCE;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String filter(String userTyped) {
        boolean z;
        Intrinsics.checkNotNullParameter(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i = 0; i < length; i++) {
            char charAt = userTyped.charAt(i);
            if (!Character.isLetter(charAt) && charAt != ' ') {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
        return sb2;
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
    public InterfaceC32735Eu6 getVisualTransformation() {
        return this.visualTransformation;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public GX2<TextFieldIcon> getTrailingIcon() {
        return this.trailingIcon;
    }
}
