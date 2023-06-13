package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.C19423R;
import com.stripe.android.uicore.elements.TextFieldConfig;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016R#\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010(\u001a\b\u0012\u0004\u0012\u00020'0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/DateConfig;", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "", "userTyped", "filter", "displayName", "convertToRaw", "rawValue", "convertFromRaw", "input", "Lcom/stripe/android/uicore/elements/TextFieldState;", "determineState", "Lal2;", "capitalization", "I", "getCapitalization-IUNYP9k", "()I", "debugLabel", "Ljava/lang/String;", "getDebugLabel", "()Ljava/lang/String;", "", "label", "getLabel", "()Ljava/lang/Integer;", "Lcl2;", "keyboard", "getKeyboard-PjHm6EE", "Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;", "visualTransformation", "Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;", "getVisualTransformation", "()Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;", "LtP5;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "trailingIcon", "LtP5;", "getTrailingIcon", "()LtP5;", "", "loading", "getLoading", "<init>", "()V", "Companion", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDateConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateConfig.kt\ncom/stripe/android/uicore/elements/DateConfig\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,84:1\n429#2:85\n502#2,5:86\n*S KotlinDebug\n*F\n+ 1 DateConfig.kt\ncom/stripe/android/uicore/elements/DateConfig\n*L\n27#1:85\n27#1:86,5\n*E\n"})
/* loaded from: classes7.dex */
public final class DateConfig implements TextFieldConfig {
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final int capitalization = C38143al2.f51187a.m70783b();
    private final String debugLabel = "date";
    private final int label = C19423R.string.expiration_date_hint;
    private final int keyboard = C39329cl2.f61189b.m60911e();
    private final ExpiryDateVisualTransformation visualTransformation = new ExpiryDateVisualTransformation();
    private final InterfaceC49220tP5<TextFieldIcon> trailingIcon = C50405vP5.m8742a(null);
    private final InterfaceC49220tP5<Boolean> loading = C50405vP5.m8742a(Boolean.FALSE);

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0007¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/DateConfig$Companion;", "", "()V", "determineTextFieldState", "Lcom/stripe/android/uicore/elements/TextFieldState;", "month1Based", "", "twoDigitYear", "current1BasedMonth", "currentYear", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextFieldState determineTextFieldState(int i, int i2, int i3, int i4) {
            int i5 = i2 - (i4 % 100);
            if (i5 < 0) {
                return new TextFieldStateConstants.Error.Invalid(C19423R.string.invalid_expiry_year, null, 2, null);
            }
            if (i5 > 50) {
                return new TextFieldStateConstants.Error.Invalid(C19423R.string.invalid_expiry_year, null, 2, null);
            }
            if (i5 == 0 && i3 > i) {
                return new TextFieldStateConstants.Error.Invalid(C19423R.string.invalid_expiry_month, null, 2, null);
            }
            boolean z = false;
            if (1 <= i && i < 13) {
                z = true;
            }
            if (!z) {
                return new TextFieldStateConstants.Error.Incomplete(C19423R.string.invalid_expiry_month);
            }
            return TextFieldStateConstants.Valid.Full.INSTANCE;
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
        String take;
        Integer intOrNull;
        String takeLast;
        Integer intOrNull2;
        Intrinsics.checkNotNullParameter(input, "input");
        isBlank = StringsKt__StringsJVMKt.isBlank(input);
        if (isBlank) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        String convertTo4DigitDate = ConvertTo4DigitDateKt.convertTo4DigitDate(input);
        if (convertTo4DigitDate.length() < 4) {
            return new TextFieldStateConstants.Error.Incomplete(C19423R.string.incomplete_expiry_date);
        }
        if (convertTo4DigitDate.length() > 4) {
            return new TextFieldStateConstants.Error.Invalid(C19423R.string.incomplete_expiry_date, null, 2, null);
        }
        Companion companion = Companion;
        take = StringsKt___StringsKt.take(convertTo4DigitDate, 2);
        intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(take);
        if (intOrNull != null) {
            int intValue = intOrNull.intValue();
            takeLast = StringsKt___StringsKt.takeLast(convertTo4DigitDate, 2);
            intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(takeLast);
            if (intOrNull2 != null) {
                return companion.determineTextFieldState(intValue, intOrNull2.intValue(), Calendar.getInstance().get(2) + 1, Calendar.getInstance().get(1));
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
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
    public ExpiryDateVisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }
}
