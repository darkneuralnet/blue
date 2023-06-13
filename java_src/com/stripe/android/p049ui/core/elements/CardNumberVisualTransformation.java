package com.stripe.android.p049ui.core.elements;

import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation;", "LEu6;", "LDf;", Entry.TYPE_TEXT, "LA96;", "space4and11", "space4and9and14", "space4and9and14and19", "filter", "", "separator", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "", "binBasedMaxPan", "Ljava/lang/Integer;", "getBinBasedMaxPan$payments_ui_core_release", "()Ljava/lang/Integer;", "setBinBasedMaxPan$payments_ui_core_release", "(Ljava/lang/Integer;)V", "<init>", "(C)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.CardNumberVisualTransformation */
/* loaded from: classes7.dex */
public final class CardNumberVisualTransformation implements InterfaceC32735Eu6 {
    private Integer binBasedMaxPan;
    private final char separator;

    public CardNumberVisualTransformation(char c) {
        this.separator = c;
    }

    private final A96 space4and11(C1577Df c1577Df) {
        int length = c1577Df.length();
        String str = "";
        for (int i = 0; i < length; i++) {
            String str2 = str + c1577Df.charAt(i);
            if (i == 3 || i == 9) {
                str2 = str2 + this.separator;
            }
            str = str2;
        }
        return new A96(new C1577Df(str, null, null, 6, null), new InterfaceC33290He3() { // from class: com.stripe.android.ui.core.elements.CardNumberVisualTransformation$space4and11$creditCardOffsetTranslator$1
            @Override // p000.InterfaceC33290He3
            public int originalToTransformed(int i2) {
                return i2 <= 3 ? i2 : i2 <= 9 ? i2 + 1 : i2 + 2;
            }

            @Override // p000.InterfaceC33290He3
            public int transformedToOriginal(int i2) {
                return i2 <= 4 ? i2 : i2 <= 11 ? i2 - 1 : i2 - 2;
            }
        });
    }

    private final A96 space4and9and14(C1577Df c1577Df) {
        int length = c1577Df.length();
        String str = "";
        for (int i = 0; i < length; i++) {
            String str2 = str + c1577Df.charAt(i);
            if (i % 4 == 3 && i < 15) {
                str2 = str2 + this.separator;
            }
            str = str2;
        }
        return new A96(new C1577Df(str, null, null, 6, null), new InterfaceC33290He3() { // from class: com.stripe.android.ui.core.elements.CardNumberVisualTransformation$space4and9and14$creditCardOffsetTranslator$1
            @Override // p000.InterfaceC33290He3
            public int originalToTransformed(int i2) {
                return i2 <= 3 ? i2 : i2 <= 7 ? i2 + 1 : i2 <= 11 ? i2 + 2 : i2 + 3;
            }

            @Override // p000.InterfaceC33290He3
            public int transformedToOriginal(int i2) {
                return i2 <= 4 ? i2 : i2 <= 9 ? i2 - 1 : i2 <= 14 ? i2 - 2 : i2 - 3;
            }
        });
    }

    private final A96 space4and9and14and19(C1577Df c1577Df) {
        int length = c1577Df.length();
        String str = "";
        for (int i = 0; i < length; i++) {
            String str2 = str + c1577Df.charAt(i);
            if (i % 4 == 3 && i < 19) {
                str2 = str2 + this.separator;
            }
            str = str2;
        }
        return new A96(new C1577Df(str, null, null, 6, null), new InterfaceC33290He3() { // from class: com.stripe.android.ui.core.elements.CardNumberVisualTransformation$space4and9and14and19$creditCardOffsetTranslator$1
            @Override // p000.InterfaceC33290He3
            public int originalToTransformed(int i2) {
                return i2 <= 3 ? i2 : i2 <= 7 ? i2 + 1 : i2 <= 11 ? i2 + 2 : i2 <= 15 ? i2 + 3 : i2 + 4;
            }

            @Override // p000.InterfaceC33290He3
            public int transformedToOriginal(int i2) {
                return i2 <= 4 ? i2 : i2 <= 9 ? i2 - 1 : i2 <= 14 ? i2 - 2 : i2 <= 19 ? i2 - 3 : i2 - 4;
            }
        });
    }

    @Override // p000.InterfaceC32735Eu6
    public A96 filter(C1577Df text) {
        int maxLengthForCardNumber;
        Intrinsics.checkNotNullParameter(text, "text");
        CardBrand fromCardNumber = CardBrand.Companion.fromCardNumber(text.m110052j());
        Integer num = this.binBasedMaxPan;
        if (num != null) {
            maxLengthForCardNumber = num.intValue();
        } else {
            maxLengthForCardNumber = fromCardNumber.getMaxLengthForCardNumber(text.m110052j());
        }
        if (maxLengthForCardNumber != 19) {
            switch (maxLengthForCardNumber) {
                case 14:
                case 15:
                    return space4and11(text);
                case 16:
                    return space4and9and14(text);
                default:
                    return space4and9and14(text);
            }
        }
        return space4and9and14and19(text);
    }

    public final Integer getBinBasedMaxPan$payments_ui_core_release() {
        return this.binBasedMaxPan;
    }

    public final void setBinBasedMaxPan$payments_ui_core_release(Integer num) {
        this.binBasedMaxPan = num;
    }
}
