package com.stripe.android.uicore.elements;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.CharsKt__CharKt;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;", "LEu6;", "LDf;", Entry.TYPE_TEXT, "LA96;", "filter", "", "separator", "Ljava/lang/String;", "<init>", "()V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ExpiryDateVisualTransformation implements InterfaceC32735Eu6 {
    public static final int $stable = 0;
    private final String separator = " / ";

    @Override // p000.InterfaceC32735Eu6
    public A96 filter(C1577Df text) {
        boolean isBlank;
        int digitToInt;
        Intrinsics.checkNotNullParameter(text, "text");
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 1;
        isBlank = StringsKt__StringsJVMKt.isBlank(text);
        if ((!isBlank) && text.charAt(0) != '0' && text.charAt(0) != '1') {
            intRef.element = 0;
        } else if (text.length() > 1 && text.charAt(0) == '1') {
            digitToInt = CharsKt__CharKt.digitToInt(text.charAt(1));
            if (digitToInt > 2) {
                intRef.element = 0;
            }
        }
        int length = text.length();
        String str = "";
        for (int i = 0; i < length; i++) {
            String str2 = str + text.charAt(i);
            if (i == intRef.element) {
                str2 = str2 + this.separator;
            }
            str = str2;
        }
        return new A96(new C1577Df(str, null, null, 6, null), new InterfaceC33290He3() { // from class: com.stripe.android.uicore.elements.ExpiryDateVisualTransformation$filter$offsetTranslator$1
            @Override // p000.InterfaceC33290He3
            public int originalToTransformed(int i2) {
                String str3;
                if (i2 > Ref.IntRef.this.element) {
                    str3 = this.separator;
                    return i2 + str3.length();
                }
                return i2;
            }

            @Override // p000.InterfaceC33290He3
            public int transformedToOriginal(int i2) {
                String str3;
                if (i2 > Ref.IntRef.this.element + 1) {
                    str3 = this.separator;
                    return i2 - str3.length();
                }
                return i2;
            }
        });
    }
}
