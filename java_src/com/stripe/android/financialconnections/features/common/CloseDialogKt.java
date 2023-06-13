package com.stripe.android.financialconnections.features.common;

import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.p041ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a+\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lkotlin/Function0;", "", "onConfirmClick", "onDismissClick", "CloseDialog", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V", "CloseDialogPreview", "(LEt0;I)V", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCloseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloseDialog.kt\ncom/stripe/android/financialconnections/features/common/CloseDialogKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,67:1\n154#2:68\n*S KotlinDebug\n*F\n+ 1 CloseDialog.kt\ncom/stripe/android/financialconnections/features/common/CloseDialogKt\n*L\n21#1:68\n*E\n"})
/* loaded from: classes7.dex */
public final class CloseDialogKt {
    public static final void CloseDialog(Function0<Unit> onConfirmClick, Function0<Unit> onDismissClick, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
        Intrinsics.checkNotNullParameter(onDismissClick, "onDismissClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1015135317);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(onConfirmClick)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(onDismissClick)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1015135317, i2, -1, "com.stripe.android.financialconnections.features.common.CloseDialog (CloseDialog.kt:15)");
            }
            C38649bc5 m61172d = C39242cc5.m61172d(C43705k61.m29303g(8));
            long m116460getBackgroundContainer0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(mo89518u, 6).m116460getBackgroundContainer0d7_KjU();
            InterfaceC42389ht0 m29791b = C43575jt0.m29791b(mo89518u, -1926025059, true, new CloseDialogKt$CloseDialog$1(onConfirmClick, i2));
            InterfaceC42389ht0 m29791b2 = C43575jt0.m29791b(mo89518u, 581072415, true, new CloseDialogKt$CloseDialog$2(onDismissClick, i2));
            ComposableSingletons$CloseDialogKt composableSingletons$CloseDialogKt = ComposableSingletons$CloseDialogKt.INSTANCE;
            interfaceC32720Et02 = mo89518u;
            C25725lb.m27121a(onDismissClick, m29791b, null, m29791b2, composableSingletons$CloseDialogKt.m116366getLambda3$financial_connections_release(), composableSingletons$CloseDialogKt.m116367getLambda4$financial_connections_release(), m61172d, m116460getBackgroundContainer0d7_KjU, 0L, null, mo89518u, ((i2 >> 3) & 14) | 224304, 772);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new CloseDialogKt$CloseDialog$3(onConfirmClick, onDismissClick, i));
        }
    }

    public static final void CloseDialogPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(412563185);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(412563185, i, -1, "com.stripe.android.financialconnections.features.common.CloseDialogPreview (CloseDialog.kt:58)");
            }
            ThemeKt.FinancialConnectionsTheme(ComposableSingletons$CloseDialogKt.INSTANCE.m116368getLambda5$financial_connections_release(), mo89518u, 6);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new CloseDialogKt$CloseDialogPreview$1(i));
        }
    }
}
