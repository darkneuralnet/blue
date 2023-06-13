package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.C19423R;
import com.stripe.android.uicore.elements.PostalCodeConfig;
import com.stripe.android.uicore.elements.TextFieldConfig;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import p000.C39329cl2;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u00010BB\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0014R\"\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/PostalCodeConfig;", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "", "input", "Lcom/stripe/android/uicore/elements/TextFieldState;", "determineState", "userTyped", "filter", "displayName", "convertToRaw", "rawValue", "convertFromRaw", "", "label", "I", "getLabel", "()Ljava/lang/Integer;", "Lal2;", "capitalization", "getCapitalization-IUNYP9k", "()I", "Lcl2;", "keyboard", "getKeyboard-PjHm6EE", "LGX2;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "trailingIcon", "LGX2;", "getTrailingIcon", "()LGX2;", "country", "Ljava/lang/String;", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", "format", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", "debugLabel", "getDebugLabel", "()Ljava/lang/String;", "LEu6;", "visualTransformation", "LEu6;", "getVisualTransformation", "()LEu6;", "", "loading", "getLoading", "<init>", "(IIILGX2;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "CountryPostalFormat", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPostalCodeConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostalCodeConfig.kt\ncom/stripe/android/uicore/elements/PostalCodeConfig\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,110:1\n429#2:111\n502#2,5:112\n*S KotlinDebug\n*F\n+ 1 PostalCodeConfig.kt\ncom/stripe/android/uicore/elements/PostalCodeConfig\n*L\n61#1:111\n61#1:112,5\n*E\n"})
/* loaded from: classes7.dex */
public final class PostalCodeConfig implements TextFieldConfig {
    public static final int $stable = 8;
    private final int capitalization;
    private final String country;
    private final String debugLabel;
    private final CountryPostalFormat format;
    private final int keyboard;
    private final int label;
    private final GX2<Boolean> loading;
    private final GX2<TextFieldIcon> trailingIcon;
    private final InterfaceC32735Eu6 visualTransformation;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0004\r\u000e\u000f\u0010B\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", "", "minimumLength", "", "maximumLength", "regexPattern", "Lkotlin/text/Regex;", "(IILkotlin/text/Regex;)V", "getMaximumLength", "()I", "getMinimumLength", "getRegexPattern", "()Lkotlin/text/Regex;", "CA", "Companion", "Other", "US", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Other;", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class CountryPostalFormat {
        private final int maximumLength;
        private final int minimumLength;
        private final Regex regexPattern;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", "()V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.uicore.elements.PostalCodeConfig$CountryPostalFormat$CA */
        /* loaded from: classes7.dex */
        public static final class C19467CA extends CountryPostalFormat {
            public static final int $stable = 0;
            public static final C19467CA INSTANCE = new C19467CA();

            private C19467CA() {
                super(6, 6, new Regex("[a-zA-Z]\\d[a-zA-Z][\\s-]?\\d[a-zA-Z]\\d"), null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Companion;", "", "()V", "forCountry", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", "country", "", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CountryPostalFormat forCountry(String country) {
                Intrinsics.checkNotNullParameter(country, "country");
                if (Intrinsics.areEqual(country, "US")) {
                    return C19468US.INSTANCE;
                }
                if (Intrinsics.areEqual(country, "CA")) {
                    return C19467CA.INSTANCE;
                }
                return Other.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Other;", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", "()V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Other extends CountryPostalFormat {
            public static final int $stable = 0;
            public static final Other INSTANCE = new Other();

            private Other() {
                super(1, Integer.MAX_VALUE, new Regex(".*"), null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", "()V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.uicore.elements.PostalCodeConfig$CountryPostalFormat$US */
        /* loaded from: classes7.dex */
        public static final class C19468US extends CountryPostalFormat {
            public static final int $stable = 0;
            public static final C19468US INSTANCE = new C19468US();

            private C19468US() {
                super(5, 5, new Regex("\\d+"), null);
            }
        }

        public /* synthetic */ CountryPostalFormat(int i, int i2, Regex regex, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, regex);
        }

        public final int getMaximumLength() {
            return this.maximumLength;
        }

        public final int getMinimumLength() {
            return this.minimumLength;
        }

        public final Regex getRegexPattern() {
            return this.regexPattern;
        }

        private CountryPostalFormat(int i, int i2, Regex regex) {
            this.minimumLength = i;
            this.maximumLength = i2;
            this.regexPattern = regex;
        }
    }

    public /* synthetic */ PostalCodeConfig(int i, int i2, int i3, GX2 gx2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, gx2, str);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String convertFromRaw(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        return new Regex("\\s+").replace(rawValue, "");
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String convertToRaw(String displayName) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return displayName;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public TextFieldState determineState(final String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new TextFieldState() { // from class: com.stripe.android.uicore.elements.PostalCodeConfig$determineState$1
            @Override // com.stripe.android.uicore.elements.TextFieldState
            public FieldError getError() {
                boolean isBlank;
                boolean isBlank2;
                FieldError fieldError;
                String str;
                isBlank = StringsKt__StringsJVMKt.isBlank(input);
                if ((!isBlank) && !isValid()) {
                    str = PostalCodeConfig.this.country;
                    if (Intrinsics.areEqual(str, "US")) {
                        fieldError = new FieldError(C19423R.string.address_zip_invalid, null, 2, null);
                        return fieldError;
                    }
                }
                isBlank2 = StringsKt__StringsJVMKt.isBlank(input);
                if (!(!isBlank2) || isValid()) {
                    return null;
                }
                fieldError = new FieldError(C19423R.string.address_zip_postal_invalid, null, 2, null);
                return fieldError;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean isBlank() {
                boolean isBlank;
                isBlank = StringsKt__StringsJVMKt.isBlank(input);
                return isBlank;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean isFull() {
                PostalCodeConfig.CountryPostalFormat countryPostalFormat;
                int length = input.length();
                countryPostalFormat = PostalCodeConfig.this.format;
                return length >= countryPostalFormat.getMaximumLength();
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean isValid() {
                PostalCodeConfig.CountryPostalFormat countryPostalFormat;
                PostalCodeConfig.CountryPostalFormat countryPostalFormat2;
                PostalCodeConfig.CountryPostalFormat countryPostalFormat3;
                boolean z;
                PostalCodeConfig.CountryPostalFormat countryPostalFormat4;
                boolean isBlank;
                countryPostalFormat = PostalCodeConfig.this.format;
                if (countryPostalFormat instanceof PostalCodeConfig.CountryPostalFormat.Other) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(input);
                    if (!isBlank) {
                        return true;
                    }
                } else {
                    countryPostalFormat2 = PostalCodeConfig.this.format;
                    int minimumLength = countryPostalFormat2.getMinimumLength();
                    countryPostalFormat3 = PostalCodeConfig.this.format;
                    int maximumLength = countryPostalFormat3.getMaximumLength();
                    int length = input.length();
                    if (minimumLength <= length && length <= maximumLength) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        String str = input;
                        countryPostalFormat4 = PostalCodeConfig.this.format;
                        if (countryPostalFormat4.getRegexPattern().matches(str)) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean shouldShowError(boolean z) {
                return (getError() == null || z) ? false : true;
            }
        };
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String filter(String userTyped) {
        Set of;
        String str;
        String dropLast;
        Intrinsics.checkNotNullParameter(userTyped, "userTyped");
        C39329cl2.C13662a c13662a = C39329cl2.f61189b;
        of = SetsKt__SetsKt.setOf((Object[]) new C39329cl2[]{C39329cl2.m60922j(c13662a.m60912d()), C39329cl2.m60922j(c13662a.m60911e())});
        if (of.contains(C39329cl2.m60922j(mo116657getKeyboardPjHm6EE()))) {
            StringBuilder sb = new StringBuilder();
            int length = userTyped.length();
            for (int i = 0; i < length; i++) {
                char charAt = userTyped.charAt(i);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            str = sb.toString();
            Intrinsics.checkNotNullExpressionValue(str, "filterTo(StringBuilder(), predicate).toString()");
        } else {
            str = userTyped;
        }
        dropLast = StringsKt___StringsKt.dropLast(str, Math.max(0, userTyped.length() - this.format.getMaximumLength()));
        return dropLast;
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
    public String getPlaceHolder() {
        return TextFieldConfig.DefaultImpls.getPlaceHolder(this);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public InterfaceC32735Eu6 getVisualTransformation() {
        return this.visualTransformation;
    }

    private PostalCodeConfig(int i, int i2, int i3, GX2<TextFieldIcon> gx2, String str) {
        this.label = i;
        this.capitalization = i2;
        this.keyboard = i3;
        this.trailingIcon = gx2;
        this.country = str;
        CountryPostalFormat forCountry = CountryPostalFormat.Companion.forCountry(str);
        this.format = forCountry;
        this.debugLabel = "postal_code_text";
        this.visualTransformation = new PostalCodeVisualTransformation(forCountry);
        this.loading = C50405vP5.m8742a(Boolean.FALSE);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public GX2<Boolean> getLoading() {
        return this.loading;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public GX2<TextFieldIcon> getTrailingIcon() {
        return this.trailingIcon;
    }

    public /* synthetic */ PostalCodeConfig(int i, int i2, int i3, GX2 gx2, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? C38143al2.f51187a.m70781d() : i2, (i4 & 4) != 0 ? C39329cl2.f61189b.m60908h() : i3, (i4 & 8) != 0 ? C50405vP5.m8742a(null) : gx2, str, null);
    }
}
