package com.stripe.android.uicore.elements;

import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.uicore.elements.PostalCodeConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/PostalCodeVisualTransformation;", "LEu6;", "LDf;", Entry.TYPE_TEXT, "LA96;", "postalForCanada", "filter", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", "format", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", "getFormat", "()Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", "<init>", "(Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PostalCodeVisualTransformation implements InterfaceC32735Eu6 {
    public static final int $stable = 0;
    private final PostalCodeConfig.CountryPostalFormat format;

    public PostalCodeVisualTransformation(PostalCodeConfig.CountryPostalFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.format = format;
    }

    private final A96 postalForCanada(C1577Df c1577Df) {
        int length = c1577Df.m110052j().length();
        String str = "";
        for (int i = 0; i < length; i++) {
            String str2 = str + Character.toUpperCase(c1577Df.m110052j().charAt(i));
            if (i == 2) {
                str2 = str2 + " ";
            }
            str = str2;
        }
        return new A96(new C1577Df(str, null, null, 6, null), new InterfaceC33290He3() { // from class: com.stripe.android.uicore.elements.PostalCodeVisualTransformation$postalForCanada$postalCodeOffsetTranslator$1
            @Override // p000.InterfaceC33290He3
            public int originalToTransformed(int i2) {
                if (i2 <= 2) {
                    return i2;
                }
                if (i2 <= 5) {
                    return i2 + 1;
                }
                return 7;
            }

            @Override // p000.InterfaceC33290He3
            public int transformedToOriginal(int i2) {
                if (i2 <= 3) {
                    return i2;
                }
                if (i2 <= 6) {
                    return i2 - 1;
                }
                return 6;
            }
        });
    }

    @Override // p000.InterfaceC32735Eu6
    public A96 filter(C1577Df text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (this.format instanceof PostalCodeConfig.CountryPostalFormat.C19467CA) {
            return postalForCanada(text);
        }
        return new A96(text, InterfaceC33290He3.f13687a.m103617a());
    }

    public final PostalCodeConfig.CountryPostalFormat getFormat() {
        return this.format;
    }
}
