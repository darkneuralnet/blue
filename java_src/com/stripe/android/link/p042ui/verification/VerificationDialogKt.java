package com.stripe.android.link.p042ui.verification;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.LinkScreen;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007*\\\b\u0007\u0010\u0011\"\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00040\u00022\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00040\u0002B\u0018\b\u000b\u0012\n\b\f\u0012\u0006\b\n0\r8\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/link/LinkPaymentLauncher;", "linkLauncher", "Lkotlin/Function1;", "", "", "onResult", "LinkVerificationDialog", "(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function1;LEt0;I)V", "Lkotlin/ParameterName;", "name", "success", "Lkotlin/Deprecated;", "level", "Lkotlin/DeprecationLevel;", "WARNING", "message", "This interface isn't meant for public consumption.", "LinkVerificationCallback", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.link.ui.verification.VerificationDialogKt */
/* loaded from: classes7.dex */
public final class VerificationDialogKt {
    @Deprecated(level = DeprecationLevel.WARNING, message = "This interface isn't meant for public consumption.")
    public static /* synthetic */ void LinkVerificationCallback$annotations() {
    }

    public static final void LinkVerificationDialog(LinkPaymentLauncher linkLauncher, Function1<? super Boolean, Unit> onResult, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(linkLauncher, "linkLauncher");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-62633763);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-62633763, i, -1, "com.stripe.android.link.ui.verification.LinkVerificationDialog (VerificationDialog.kt:44)");
        }
        OY2 m90122e = PY2.m90122e(new AbstractC39507d13[0], mo89518u, 8);
        RY2.m86626b(m90122e, LinkScreen.VerificationDialog.INSTANCE.getRoute(), null, null, new VerificationDialogKt$LinkVerificationDialog$1(linkLauncher, m90122e, onResult, i), mo89518u, 8, 12);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new VerificationDialogKt$LinkVerificationDialog$2(linkLauncher, onResult, i));
        }
    }
}
