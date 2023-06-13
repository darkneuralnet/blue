package com.stripe.android.link.p042ui;

import com.stripe.android.link.p042ui.LinkLogoutMenuItem;
import com.stripe.android.link.p042ui.menus.LinkMenuKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a+\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"Lkotlin/Function0;", "", "onLogoutClick", "onCancelClick", "LinkLogoutSheet", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLinkLogoutSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkLogoutSheet.kt\ncom/stripe/android/link/ui/LinkLogoutSheetKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,36:1\n50#2:37\n49#2:38\n1057#3,6:39\n*S KotlinDebug\n*F\n+ 1 LinkLogoutSheet.kt\ncom/stripe/android/link/ui/LinkLogoutSheetKt\n*L\n28#1:37\n28#1:38\n28#1:39,6\n*E\n"})
/* renamed from: com.stripe.android.link.ui.LinkLogoutSheetKt */
/* loaded from: classes7.dex */
public final class LinkLogoutSheetKt {
    public static final void LinkLogoutSheet(Function0<Unit> onLogoutClick, Function0<Unit> onCancelClick, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        List listOf;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(onLogoutClick, "onLogoutClick");
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1242658561);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(onLogoutClick)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(onCancelClick)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1242658561, i2, -1, "com.stripe.android.link.ui.LinkLogoutSheet (LinkLogoutSheet.kt:16)");
            }
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new LinkLogoutMenuItem[]{LinkLogoutMenuItem.Logout.INSTANCE, LinkLogoutMenuItem.Cancel.INSTANCE});
            mo89518u.mo89638F(511388516);
            boolean mo89539n = mo89518u.mo89539n(onLogoutClick) | mo89518u.mo89539n(onCancelClick);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new LinkLogoutSheetKt$LinkLogoutSheet$1$1(onLogoutClick, onCancelClick);
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            LinkMenuKt.LinkMenu(listOf, (Function1) mo89635G, mo89518u, 6);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new LinkLogoutSheetKt$LinkLogoutSheet$2(onLogoutClick, onCancelClick, i));
        }
    }
}
