package com.stripe.android.link.p042ui;

import com.stripe.android.link.C18975R;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.model.AccountStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m28432d2 = {"", "isRootScreen", "", "currentRoute", "email", "Lcom/stripe/android/link/model/AccountStatus;", "accountStatus", "Lcom/stripe/android/link/ui/LinkAppBarState;", "rememberLinkAppBarState", "(ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/model/AccountStatus;LEt0;I)Lcom/stripe/android/link/ui/LinkAppBarState;", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLinkAppBarState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkAppBarState.kt\ncom/stripe/android/link/ui/LinkAppBarStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1057#2,3:58\n1060#2,3:62\n1#3:61\n*S KotlinDebug\n*F\n+ 1 LinkAppBarState.kt\ncom/stripe/android/link/ui/LinkAppBarStateKt\n*L\n25#1:58,3\n25#1:62,3\n*E\n"})
/* renamed from: com.stripe.android.link.ui.LinkAppBarStateKt */
/* loaded from: classes7.dex */
public final class LinkAppBarStateKt {
    public static final LinkAppBarState rememberLinkAppBarState(boolean z, String str, String str2, AccountStatus accountStatus, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        boolean z2;
        boolean areEqual;
        boolean areEqual2;
        boolean z3;
        boolean z4;
        int i2;
        String str3;
        boolean isBlank;
        interfaceC32720Et0.mo89638F(-1318425600);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1318425600, i, -1, "com.stripe.android.link.ui.rememberLinkAppBarState (LinkAppBarState.kt:18)");
        }
        boolean mo89539n = interfaceC32720Et0.mo89539n(str) | interfaceC32720Et0.mo89539n(str2);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            boolean z5 = false;
            if (Intrinsics.areEqual(str, LinkScreen.CardEdit.route)) {
                z2 = false;
            } else if (Intrinsics.areEqual(str, LinkScreen.PaymentMethod.route)) {
                z2 = z;
            } else {
                z2 = true;
            }
            if (Intrinsics.areEqual(str, LinkScreen.CardEdit.route)) {
                areEqual = true;
            } else {
                areEqual = Intrinsics.areEqual(str, LinkScreen.Verification.INSTANCE.getRoute());
            }
            if (areEqual) {
                areEqual2 = true;
            } else {
                areEqual2 = Intrinsics.areEqual(str, LinkScreen.SignUp.INSTANCE.getRoute());
            }
            if (areEqual2 || (Intrinsics.areEqual(str, LinkScreen.PaymentMethod.route) && !z)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z && str2 != null && accountStatus == AccountStatus.Verified) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z) {
                i2 = C18975R.C18976drawable.ic_link_close;
            } else {
                i2 = C18975R.C18976drawable.ic_link_back;
            }
            int i3 = i2;
            if (str2 != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(str2);
                if (isBlank || z3) {
                    z5 = true;
                }
                if (!z5) {
                    str3 = str2;
                    mo89635G = new LinkAppBarState(i3, z2, z4, str3, accountStatus);
                    interfaceC32720Et0.mo89503z(mo89635G);
                }
            }
            str3 = null;
            mo89635G = new LinkAppBarState(i3, z2, z4, str3, accountStatus);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        LinkAppBarState linkAppBarState = (LinkAppBarState) mo89635G;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return linkAppBarState;
    }
}
