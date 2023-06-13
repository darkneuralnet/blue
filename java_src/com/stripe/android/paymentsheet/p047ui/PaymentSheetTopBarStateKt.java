package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "screen", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethods", "", "isLiveMode", "isProcessing", "isEditing", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "rememberPaymentSheetTopBarState", "(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;Ljava/util/List;ZZZLEt0;I)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentSheetTopBarState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetTopBarState.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,59:1\n1057#2,6:60\n*S KotlinDebug\n*F\n+ 1 PaymentSheetTopBarState.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateKt\n*L\n28#1:60,6\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarStateKt */
/* loaded from: classes7.dex */
public final class PaymentSheetTopBarStateKt {
    public static final PaymentSheetTopBarState rememberPaymentSheetTopBarState(PaymentSheetScreen screen, List<PaymentMethod> list, boolean z, boolean z2, boolean z3, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        int i4;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(screen, "screen");
        interfaceC32720Et0.mo89638F(-921132092);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-921132092, i, -1, "com.stripe.android.paymentsheet.ui.rememberPaymentSheetTopBarState (PaymentSheetTopBarState.kt:20)");
        }
        boolean mo89539n = interfaceC32720Et0.mo89539n(screen) | interfaceC32720Et0.mo89539n(list) | interfaceC32720Et0.mo89536o(z) | interfaceC32720Et0.mo89536o(z2) | interfaceC32720Et0.mo89536o(z3);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            PaymentSheetScreen.AddAnotherPaymentMethod addAnotherPaymentMethod = PaymentSheetScreen.AddAnotherPaymentMethod.INSTANCE;
            if (Intrinsics.areEqual(screen, addAnotherPaymentMethod)) {
                i2 = C19159R.C19160drawable.stripe_ic_paymentsheet_back;
            } else {
                i2 = C19159R.C19160drawable.stripe_ic_paymentsheet_close;
            }
            int i5 = i2;
            if (Intrinsics.areEqual(screen, addAnotherPaymentMethod)) {
                i3 = C19159R.string.back;
            } else {
                i3 = C19159R.string.stripe_paymentsheet_close;
            }
            int i6 = i3;
            boolean z6 = screen instanceof PaymentSheetScreen.SelectSavedPaymentMethods;
            if (z3) {
                i4 = C19159R.string.done;
            } else {
                i4 = C19159R.string.edit;
            }
            int i7 = i4;
            boolean z7 = !z;
            if (z6) {
                List<PaymentMethod> list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (!z5) {
                    z4 = true;
                    mo89635G = new PaymentSheetTopBarState(i5, i6, z7, z4, i7, !z2);
                    interfaceC32720Et0.mo89503z(mo89635G);
                }
            }
            z4 = false;
            mo89635G = new PaymentSheetTopBarState(i5, i6, z7, z4, i7, !z2);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        PaymentSheetTopBarState paymentSheetTopBarState = (PaymentSheetTopBarState) mo89635G;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return paymentSheetTopBarState;
    }
}
