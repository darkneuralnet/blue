package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "paymentDetails", "", "showDialog", "Lkotlin/Function1;", "", "onDialogDismissed", "ConfirmRemoveDialog", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLkotlin/jvm/functions/Function1;LEt0;I)V", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfirmRemoveDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmRemoveDialog.kt\ncom/stripe/android/link/ui/wallet/ConfirmRemoveDialogKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,55:1\n36#2:56\n1057#3,6:57\n*S KotlinDebug\n*F\n+ 1 ConfirmRemoveDialog.kt\ncom/stripe/android/link/ui/wallet/ConfirmRemoveDialogKt\n*L\n22#1:56\n22#1:57,6\n*E\n"})
/* renamed from: com.stripe.android.link.ui.wallet.ConfirmRemoveDialogKt */
/* loaded from: classes7.dex */
public final class ConfirmRemoveDialogKt {
    public static final void ConfirmRemoveDialog(ConsumerPaymentDetails.PaymentDetails paymentDetails, boolean z, Function1<? super Boolean, Unit> onDialogDismissed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        Intrinsics.checkNotNullParameter(onDialogDismissed, "onDialogDismissed");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1649503885);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(paymentDetails)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89536o(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(onDialogDismissed)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1649503885, i2, -1, "com.stripe.android.link.ui.wallet.ConfirmRemoveDialog (ConfirmRemoveDialog.kt:14)");
            }
            if (z) {
                mo89518u.mo89638F(1157296644);
                boolean mo89539n = mo89518u.mo89539n(onDialogDismissed);
                Object mo89635G = mo89518u.mo89635G();
                if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G = new ConfirmRemoveDialogKt$ConfirmRemoveDialog$1$1(onDialogDismissed);
                    mo89518u.mo89503z(mo89635G);
                }
                mo89518u.mo89605Q();
                interfaceC32720Et02 = mo89518u;
                C25725lb.m27121a((Function0) mo89635G, C43575jt0.m29791b(mo89518u, -1170326048, true, new ConfirmRemoveDialogKt$ConfirmRemoveDialog$2(onDialogDismissed, i2)), null, C43575jt0.m29791b(mo89518u, -189371234, true, new ConfirmRemoveDialogKt$ConfirmRemoveDialog$3(onDialogDismissed, i2)), null, C43575jt0.m29791b(mo89518u, 791583580, true, new ConfirmRemoveDialogKt$ConfirmRemoveDialog$4(paymentDetails)), null, 0L, 0L, null, interfaceC32720Et02, 199728, 980);
            } else {
                interfaceC32720Et02 = mo89518u;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ConfirmRemoveDialogKt$ConfirmRemoveDialog$5(paymentDetails, z, onDialogDismissed, i));
        }
    }
}
