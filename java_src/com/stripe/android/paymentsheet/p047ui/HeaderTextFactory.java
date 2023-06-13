package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J7\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u00060\rj\u0002`\u000e0\f¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;", "", "isCompleteFlow", "", "(Z)V", "create", "", "screen", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "isWalletEnabled", NamedConstantsKt.IS_PAYMENT_INTENT, "types", "", "", "Lcom/stripe/android/model/PaymentMethodCode;", "(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZZLjava/util/List;)Ljava/lang/Integer;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.HeaderTextFactory */
/* loaded from: classes7.dex */
public final class HeaderTextFactory {
    private final boolean isCompleteFlow;

    public HeaderTextFactory(boolean z) {
        this.isCompleteFlow = z;
    }

    public final Integer create(PaymentSheetScreen screen, boolean z, boolean z2, List<String> types) {
        Object singleOrNull;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(types, "types");
        boolean z3 = true;
        if (this.isCompleteFlow) {
            if (Intrinsics.areEqual(screen, PaymentSheetScreen.SelectSavedPaymentMethods.INSTANCE)) {
                if (z && z2) {
                    i2 = C19159R.string.stripe_paymentsheet_pay_using;
                } else {
                    i2 = C19159R.string.stripe_paymentsheet_select_payment_method;
                }
                return Integer.valueOf(i2);
            } else if (Intrinsics.areEqual(screen, PaymentSheetScreen.AddFirstPaymentMethod.INSTANCE)) {
                Integer valueOf = Integer.valueOf(C19159R.string.stripe_paymentsheet_add_payment_method_title);
                valueOf.intValue();
                if (z) {
                    return null;
                }
                return valueOf;
            } else {
                if (!Intrinsics.areEqual(screen, PaymentSheetScreen.Loading.INSTANCE)) {
                    z3 = Intrinsics.areEqual(screen, PaymentSheetScreen.AddAnotherPaymentMethod.INSTANCE);
                }
                if (z3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else if (Intrinsics.areEqual(screen, PaymentSheetScreen.Loading.INSTANCE)) {
            return null;
        } else {
            if (Intrinsics.areEqual(screen, PaymentSheetScreen.SelectSavedPaymentMethods.INSTANCE)) {
                return Integer.valueOf(C19159R.string.stripe_paymentsheet_select_payment_method);
            }
            if (!Intrinsics.areEqual(screen, PaymentSheetScreen.AddFirstPaymentMethod.INSTANCE)) {
                z3 = Intrinsics.areEqual(screen, PaymentSheetScreen.AddAnotherPaymentMethod.INSTANCE);
            }
            if (z3) {
                singleOrNull = CollectionsKt___CollectionsKt.singleOrNull((List<? extends Object>) types);
                if (Intrinsics.areEqual(singleOrNull, PaymentMethod.Type.Card.code)) {
                    i = C19159R.string.title_add_a_card;
                } else {
                    i = C19159R.string.stripe_paymentsheet_choose_payment_method;
                }
                return Integer.valueOf(i);
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
