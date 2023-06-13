package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.C19423R;
import com.stripe.android.uicore.elements.TextFieldConfig;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b0\u00101J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016R#\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014R\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/EmailConfig;", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "", "str", "", "containsNameAndDomain", "cannotBecomeValid", "userTyped", "filter", "displayName", "convertToRaw", "rawValue", "convertFromRaw", "input", "Lcom/stripe/android/uicore/elements/TextFieldState;", "determineState", "Lal2;", "capitalization", "I", "getCapitalization-IUNYP9k", "()I", "debugLabel", "Ljava/lang/String;", "getDebugLabel", "()Ljava/lang/String;", "", "label", "getLabel", "()Ljava/lang/Integer;", "Lcl2;", "keyboard", "getKeyboard-PjHm6EE", "LEu6;", "visualTransformation", "LEu6;", "getVisualTransformation", "()LEu6;", "LGX2;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "trailingIcon", "LGX2;", "getTrailingIcon", "()LGX2;", "LtP5;", "loading", "LtP5;", "getLoading", "()LtP5;", "<init>", "()V", "Companion", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEmailConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmailConfig.kt\ncom/stripe/android/uicore/elements/EmailConfig\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,73:1\n483#2,11:74\n1099#2,3:85\n*S KotlinDebug\n*F\n+ 1 EmailConfig.kt\ncom/stripe/android/uicore/elements/EmailConfig\n*L\n31#1:74,11\n51#1:85,3\n*E\n"})
/* loaded from: classes7.dex */
public final class EmailConfig implements TextFieldConfig {
    private static final Pattern PATTERN;
    private final InterfaceC32735Eu6 visualTransformation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final int capitalization = C38143al2.f51187a.m70783b();
    private final String debugLabel = "email";
    private final int label = C19423R.string.email;
    private final int keyboard = C39329cl2.f61189b.m60913c();
    private final GX2<TextFieldIcon> trailingIcon = C50405vP5.m8742a(null);
    private final InterfaceC49220tP5<Boolean> loading = C50405vP5.m8742a(Boolean.FALSE);

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/EmailConfig$Companion;", "", "()V", "PATTERN", "Ljava/util/regex/Pattern;", "getPATTERN", "()Ljava/util/regex/Pattern;", "createController", "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "initialValue", "", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SimpleTextFieldController createController(String str) {
            return new SimpleTextFieldController(new EmailConfig(), false, str, 2, null);
        }

        public final Pattern getPATTERN() {
            return EmailConfig.PATTERN;
        }

        private Companion() {
        }
    }

    static {
        Pattern compile = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
        Intrinsics.checkNotNullExpressionValue(compile, "compile(\n            \"[a…           \")+\"\n        )");
        PATTERN = compile;
    }

    private final boolean cannotBecomeValid(String str) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= str.length()) {
                break;
            }
            if (str.charAt(i) == '@') {
                i2++;
            }
            i++;
        }
        return i2 > 1;
    }

    private final boolean containsNameAndDomain(String str) {
        boolean contains$default;
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "@", false, 2, (Object) null);
        if (!contains$default || !new Regex(".*@.*\\..+").matches(str)) {
            return false;
        }
        return true;
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
        if (input.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        if (PATTERN.matcher(input).matches()) {
            return TextFieldStateConstants.Valid.Limitless.INSTANCE;
        }
        if (!containsNameAndDomain(input) && !cannotBecomeValid(input)) {
            return new TextFieldStateConstants.Error.Incomplete(C19423R.string.email_is_invalid);
        }
        return new TextFieldStateConstants.Error.Invalid(C19423R.string.email_is_invalid, null, 2, null);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String filter(String userTyped) {
        boolean z;
        Intrinsics.checkNotNullParameter(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < userTyped.length(); i++) {
            char charAt = userTyped.charAt(i);
            if (charAt == ' ') {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterNotTo(StringBuilder(), predicate).toString()");
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
