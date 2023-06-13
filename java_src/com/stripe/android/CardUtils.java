package com.stripe.android;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.CardBrand;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/CardUtils;", "", "()V", "getPossibleCardBrand", "Lcom/stripe/android/model/CardBrand;", "cardNumber", "", "isValidLuhnNumber", "", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class CardUtils {
    public static final CardUtils INSTANCE = new CardUtils();

    private CardUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    @Deprecated(message = "CardInputWidget and CardMultilineWidget handle card brand lookup. This method should not be relied on for determining CardBrand.")
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CardBrand getPossibleCardBrand(String str) {
        boolean z;
        boolean isBlank;
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                z = false;
                if (!z) {
                    return CardBrand.Unknown;
                }
                return CardBrand.Companion.fromCardNumber(new CardNumber.Unvalidated(str).getNormalized());
            }
        }
        z = true;
        if (!z) {
        }
    }

    public final boolean isValidLuhnNumber(String str) {
        if (str == null) {
            return false;
        }
        int i = 0;
        boolean z = true;
        for (int length = str.length() - 1; -1 < length; length--) {
            char charAt = str.charAt(length);
            if (!Character.isDigit(charAt)) {
                return false;
            }
            int numericValue = Character.getNumericValue(charAt);
            z = !z;
            if (z) {
                numericValue *= 2;
            }
            if (numericValue > 9) {
                numericValue -= 9;
            }
            i += numericValue;
        }
        if (i % 10 != 0) {
            return false;
        }
        return true;
    }
}
