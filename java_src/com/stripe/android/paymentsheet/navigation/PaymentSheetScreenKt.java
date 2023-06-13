package com.stripe.android.paymentsheet.navigation;

import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "viewModel", "", "Content", "(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LEt0;I)V", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PaymentSheetScreenKt {
    public static final void Content(PaymentSheetScreen paymentSheetScreen, BaseSheetViewModel viewModel, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(paymentSheetScreen, "<this>");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1436699017);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1436699017, i, -1, "com.stripe.android.paymentsheet.navigation.Content (PaymentSheetScreen.kt:63)");
        }
        paymentSheetScreen.Content(viewModel, InterfaceC41563gV2.f82354b0, mo89518u, ((i << 6) & 896) | 56);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentSheetScreenKt$Content$1(paymentSheetScreen, viewModel, i));
        }
    }
}
