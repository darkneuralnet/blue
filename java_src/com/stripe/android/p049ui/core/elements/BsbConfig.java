package com.stripe.android.p049ui.core.elements;

import com.stripe.android.p049ui.core.C19369R;
import com.stripe.android.uicore.elements.TextFieldConfig;
import com.stripe.android.uicore.elements.TextFieldIcon;
import com.stripe.android.uicore.elements.TextFieldState;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import com.stripe.android.view.BecsDebitBanks;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.CharRange;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR#\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001a\u0010#\u001a\u00020\"8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010%R#\u0010'\u001a\u00020&8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010\u0012\u001a\u0004\b(\u0010\u0014R\u001a\u0010*\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/BsbConfig;", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "", "userTyped", "filter", "displayName", "convertToRaw", "rawValue", "convertFromRaw", "input", "Lcom/stripe/android/uicore/elements/TextFieldState;", "determineState", "", "Lcom/stripe/android/view/BecsDebitBanks$Bank;", "banks", "Ljava/util/List;", "Lal2;", "capitalization", "I", "getCapitalization-IUNYP9k", "()I", "debugLabel", "Ljava/lang/String;", "getDebugLabel", "()Ljava/lang/String;", "LtP5;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "trailingIcon", "LtP5;", "getTrailingIcon", "()LtP5;", "", "loading", "getLoading", "", "label", "getLabel", "()Ljava/lang/Integer;", "Lcl2;", "keyboard", "getKeyboard-PjHm6EE", "LEu6;", "visualTransformation", "LEu6;", "getVisualTransformation", "()LEu6;", "<init>", "(Ljava/util/List;)V", "Companion", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBsbConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BsbConfig.kt\ncom/stripe/android/ui/core/elements/BsbConfig\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n429#2:103\n502#2,5:104\n288#3,2:109\n*S KotlinDebug\n*F\n+ 1 BsbConfig.kt\ncom/stripe/android/ui/core/elements/BsbConfig\n*L\n67#1:103\n67#1:104,5\n84#1:109,2\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.BsbConfig */
/* loaded from: classes7.dex */
public final class BsbConfig implements TextFieldConfig {
    @Deprecated
    public static final int LENGTH = 6;
    private final List<BecsDebitBanks.Bank> banks;
    private final int capitalization;
    private final String debugLabel;
    private final int keyboard;
    private final int label;
    private final InterfaceC49220tP5<Boolean> loading;
    private final InterfaceC49220tP5<TextFieldIcon> trailingIcon;
    private final InterfaceC32735Eu6 visualTransformation;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @Deprecated
    private static final CharRange VALID_INPUT_RANGES = new CharRange('0', '9');

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/BsbConfig$Companion;", "", "()V", "LENGTH", "", "VALID_INPUT_RANGES", "Lkotlin/ranges/CharRange;", "getVALID_INPUT_RANGES", "()Lkotlin/ranges/CharRange;", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.ui.core.elements.BsbConfig$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CharRange getVALID_INPUT_RANGES() {
            return BsbConfig.VALID_INPUT_RANGES;
        }

        private Companion() {
        }
    }

    public BsbConfig(List<BecsDebitBanks.Bank> banks) {
        Intrinsics.checkNotNullParameter(banks, "banks");
        this.banks = banks;
        this.capitalization = C38143al2.f51187a.m70783b();
        this.debugLabel = "bsb";
        this.trailingIcon = C50405vP5.m8742a(null);
        this.loading = C50405vP5.m8742a(Boolean.FALSE);
        this.label = C19369R.string.becs_widget_bsb;
        this.keyboard = C39329cl2.f61189b.m60912d();
        this.visualTransformation = BsbConfig$visualTransformation$1.INSTANCE;
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
        Object obj;
        boolean startsWith$default;
        Intrinsics.checkNotNullParameter(input, "input");
        isBlank = StringsKt__StringsJVMKt.isBlank(input);
        if (isBlank) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        if (input.length() < 6) {
            return new TextFieldStateConstants.Error.Incomplete(C19369R.string.becs_widget_bsb_incomplete);
        }
        Iterator<T> it = this.banks.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(input, ((BecsDebitBanks.Bank) obj).getPrefix(), false, 2, null);
                if (startsWith$default) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (((BecsDebitBanks.Bank) obj) != null && input.length() <= 6) {
            return TextFieldStateConstants.Valid.Full.INSTANCE;
        }
        return new TextFieldStateConstants.Error.Invalid(C19369R.string.becs_widget_bsb_invalid, null, 2, null);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String filter(String userTyped) {
        String take;
        Intrinsics.checkNotNullParameter(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i = 0; i < length; i++) {
            char charAt = userTyped.charAt(i);
            if (VALID_INPUT_RANGES.contains(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
        take = StringsKt___StringsKt.take(sb2, 6);
        return take;
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
