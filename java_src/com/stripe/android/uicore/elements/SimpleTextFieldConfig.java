package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.elements.TextFieldConfig;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C39329cl2;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B<\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\"\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "", "input", "Lcom/stripe/android/uicore/elements/TextFieldState;", "determineState", "userTyped", "filter", "displayName", "convertToRaw", "rawValue", "convertFromRaw", "", "label", "Ljava/lang/Integer;", "getLabel", "()Ljava/lang/Integer;", "Lal2;", "capitalization", "I", "getCapitalization-IUNYP9k", "()I", "Lcl2;", "keyboard", "getKeyboard-PjHm6EE", "LGX2;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "trailingIcon", "LGX2;", "getTrailingIcon", "()LGX2;", "debugLabel", "Ljava/lang/String;", "getDebugLabel", "()Ljava/lang/String;", "LEu6;", "visualTransformation", "LEu6;", "getVisualTransformation", "()LEu6;", "", "loading", "getLoading", "<init>", "(Ljava/lang/Integer;IILGX2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSimpleTextFieldConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleTextFieldConfig.kt\ncom/stripe/android/uicore/elements/SimpleTextFieldConfig\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,46:1\n429#2:47\n502#2,5:48\n*S KotlinDebug\n*F\n+ 1 SimpleTextFieldConfig.kt\ncom/stripe/android/uicore/elements/SimpleTextFieldConfig\n*L\n37#1:47\n37#1:48,5\n*E\n"})
/* loaded from: classes7.dex */
public class SimpleTextFieldConfig implements TextFieldConfig {
    public static final int $stable = 8;
    private final int capitalization;
    private final String debugLabel;
    private final int keyboard;
    private final Integer label;
    private final GX2<Boolean> loading;
    private final GX2<TextFieldIcon> trailingIcon;
    private final InterfaceC32735Eu6 visualTransformation;

    public /* synthetic */ SimpleTextFieldConfig(Integer num, int i, int i2, GX2 gx2, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, i, i2, gx2);
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
    public TextFieldState determineState(final String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new TextFieldState() { // from class: com.stripe.android.uicore.elements.SimpleTextFieldConfig$determineState$1
            @Override // com.stripe.android.uicore.elements.TextFieldState
            public FieldError getError() {
                return null;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean isBlank() {
                boolean isBlank;
                isBlank = StringsKt__StringsJVMKt.isBlank(input);
                return isBlank;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean isFull() {
                return false;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean isValid() {
                boolean isBlank;
                isBlank = StringsKt__StringsJVMKt.isBlank(input);
                return !isBlank;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean shouldShowError(boolean z) {
                return false;
            }
        };
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String filter(String userTyped) {
        Set of;
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
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
            return sb2;
        }
        return userTyped;
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
        return this.label;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String getPlaceHolder() {
        return TextFieldConfig.DefaultImpls.getPlaceHolder(this);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public InterfaceC32735Eu6 getVisualTransformation() {
        return this.visualTransformation;
    }

    private SimpleTextFieldConfig(Integer num, int i, int i2, GX2<TextFieldIcon> gx2) {
        this.label = num;
        this.capitalization = i;
        this.keyboard = i2;
        this.trailingIcon = gx2;
        this.debugLabel = "generic_text";
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

    public /* synthetic */ SimpleTextFieldConfig(Integer num, int i, int i2, GX2 gx2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : num, (i3 & 2) != 0 ? C38143al2.f51187a.m70781d() : i, (i3 & 4) != 0 ? C39329cl2.f61189b.m60908h() : i2, (i3 & 8) != 0 ? C50405vP5.m8742a(null) : gx2, null);
    }
}
