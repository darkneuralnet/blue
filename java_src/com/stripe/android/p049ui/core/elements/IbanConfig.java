package com.stripe.android.p049ui.core.elements;

import com.stripe.android.p049ui.core.C19369R;
import com.stripe.android.uicore.elements.TextFieldConfig;
import com.stripe.android.uicore.elements.TextFieldIcon;
import com.stripe.android.uicore.elements.TextFieldState;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.CharRange;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b/\u00100J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016R#\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\"\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/IbanConfig;", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "", "iban", "", "isIbanValid", "userTyped", "filter", "displayName", "convertToRaw", "rawValue", "convertFromRaw", "input", "Lcom/stripe/android/uicore/elements/TextFieldState;", "determineState", "Lal2;", "capitalization", "I", "getCapitalization-IUNYP9k", "()I", "debugLabel", "Ljava/lang/String;", "getDebugLabel", "()Ljava/lang/String;", "", "label", "getLabel", "()Ljava/lang/Integer;", "Lcl2;", "keyboard", "getKeyboard-PjHm6EE", "LGX2;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "trailingIcon", "LGX2;", "getTrailingIcon", "()LGX2;", "LtP5;", "loading", "LtP5;", "getLoading", "()LtP5;", "LEu6;", "visualTransformation", "LEu6;", "getVisualTransformation", "()LEu6;", "<init>", "()V", "Companion", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIbanConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IbanConfig.kt\ncom/stripe/android/ui/core/elements/IbanConfig\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,135:1\n429#2:136\n502#2,5:137\n1083#2,2:142\n*S KotlinDebug\n*F\n+ 1 IbanConfig.kt\ncom/stripe/android/ui/core/elements/IbanConfig\n*L\n61#1:136\n61#1:137,5\n74#1:142,2\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.IbanConfig */
/* loaded from: classes7.dex */
public final class IbanConfig implements TextFieldConfig {
    @Deprecated
    public static final int MAX_LENGTH = 34;
    @Deprecated
    public static final int MIN_LENGTH = 8;
    @Deprecated
    private static final List<Character> VALID_INPUT_RANGES;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final int capitalization = C38143al2.f51187a.m70784a();
    private final String debugLabel = "iban";
    private final int label = C19369R.string.iban;
    private final int keyboard = C39329cl2.f61189b.m60915a();
    private final GX2<TextFieldIcon> trailingIcon = C50405vP5.m8742a(new TextFieldIcon.Trailing(C19369R.C19370drawable.stripe_ic_bank_generic, null, true, null, 10, null));
    private final InterfaceC49220tP5<Boolean> loading = C50405vP5.m8742a(Boolean.FALSE);
    private final InterfaceC32735Eu6 visualTransformation = IbanConfig$visualTransformation$1.INSTANCE;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\f\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/IbanConfig$Companion;", "", "()V", "MAX_LENGTH", "", "MIN_LENGTH", "VALID_INPUT_RANGES", "", "", "getVALID_INPUT_RANGES", "()Ljava/util/List;", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.ui.core.elements.IbanConfig$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Character> getVALID_INPUT_RANGES() {
            return IbanConfig.VALID_INPUT_RANGES;
        }

        private Companion() {
        }
    }

    static {
        List plus;
        List<Character> plus2;
        plus = CollectionsKt___CollectionsKt.plus((Iterable) new CharRange('0', '9'), (Iterable) new CharRange('a', 'z'));
        plus2 = CollectionsKt___CollectionsKt.plus((Collection) plus, (Iterable) new CharRange('A', 'Z'));
        VALID_INPUT_RANGES = plus2;
    }

    private final boolean isIbanValid(String str) {
        String takeLast;
        String take;
        takeLast = StringsKt___StringsKt.takeLast(str, str.length() - 4);
        take = StringsKt___StringsKt.take(str, 4);
        String upperCase = (takeLast + take).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return new BigInteger(new Regex("[A-Z]").replace(upperCase, IbanConfig$isIbanValid$1.INSTANCE)).mod(new BigInteger("97")).equals(BigInteger.ONE);
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
        boolean z;
        boolean contains;
        Intrinsics.checkNotNullParameter(input, "input");
        isBlank = StringsKt__StringsJVMKt.isBlank(input);
        if (isBlank) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        take = StringsKt___StringsKt.take(input, 2);
        String upperCase = take.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        int i = 0;
        while (true) {
            if (i < upperCase.length()) {
                if (Character.isDigit(upperCase.charAt(i))) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return new TextFieldStateConstants.Error.Invalid(C19369R.string.iban_invalid_start, null, 2, null);
        }
        if (upperCase.length() < 2) {
            return new TextFieldStateConstants.Error.Incomplete(C19369R.string.iban_incomplete);
        }
        String[] iSOCountries = Locale.getISOCountries();
        Intrinsics.checkNotNullExpressionValue(iSOCountries, "getISOCountries()");
        contains = ArraysKt___ArraysKt.contains(iSOCountries, upperCase);
        if (!contains) {
            return new TextFieldStateConstants.Error.Invalid(C19369R.string.iban_invalid_country, new String[]{upperCase});
        }
        if (input.length() < 8) {
            return new TextFieldStateConstants.Error.Incomplete(C19369R.string.iban_incomplete);
        }
        if (isIbanValid(input)) {
            if (input.length() == 34) {
                return TextFieldStateConstants.Valid.Full.INSTANCE;
            }
            return TextFieldStateConstants.Valid.Limitless.INSTANCE;
        }
        return new TextFieldStateConstants.Error.Incomplete(C19369R.string.invalid_bank_account_iban);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String filter(String userTyped) {
        String take;
        Intrinsics.checkNotNullParameter(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i = 0; i < length; i++) {
            char charAt = userTyped.charAt(i);
            if (VALID_INPUT_RANGES.contains(Character.valueOf(charAt))) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
        take = StringsKt___StringsKt.take(sb2, 34);
        String upperCase = take.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
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
