package com.stripe.android.link.p042ui;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.link.C18975R;
import com.stripe.android.link.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a`\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022+\u0010\n\u001a'\u0012\u001d\u0012\u001b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006j\u0004\u0018\u0001`\b¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u000f\u0010\u0010\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u000f\u0010\u0011\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/link/ui/LinkAppBarState;", TransferTable.COLUMN_STATE, "Lkotlin/Function0;", "", "onBackPressed", "onLogout", "Lkotlin/Function1;", "LPm0;", "Lcom/stripe/android/link/ui/BottomSheetContent;", "Lkotlin/ExtensionFunctionType;", "showBottomSheetContent", "LinkAppBar", "(Lcom/stripe/android/link/ui/LinkAppBarState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V", "LinkAppBarPreview", "(LEt0;I)V", "LinkAppBar_NoEmail", "LinkAppBar_ChildScreen", "LinkAppBar_ChildScreen_NoEmail", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLinkAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkAppBar.kt\ncom/stripe/android/link/ui/LinkAppBarKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,208:1\n79#2,2:209\n81#2:237\n85#2:291\n75#3:211\n76#3,11:213\n75#3:246\n76#3,11:248\n89#3:276\n89#3:290\n76#4:212\n76#4:247\n460#5,13:224\n460#5,13:259\n473#5,3:273\n50#5:279\n49#5:280\n473#5,3:287\n154#6:238\n154#6:239\n154#6:278\n74#7,6:240\n80#7:272\n84#7:277\n1057#8,6:281\n76#9:292\n76#9:293\n*S KotlinDebug\n*F\n+ 1 LinkAppBar.kt\ncom/stripe/android/link/ui/LinkAppBarKt\n*L\n42#1:209,2\n42#1:237\n42#1:291\n42#1:211\n42#1:213,11\n62#1:246\n62#1:248,11\n62#1:276\n42#1:290\n42#1:212\n62#1:247\n42#1:224,13\n62#1:259,13\n62#1:273,3\n98#1:279\n98#1:280\n42#1:287,3\n51#1:238\n66#1:239\n114#1:278\n62#1:240,6\n62#1:272\n62#1:277\n98#1:281,6\n60#1:292\n93#1:293\n*E\n"})
/* renamed from: com.stripe.android.link.ui.LinkAppBarKt */
/* loaded from: classes7.dex */
public final class LinkAppBarKt {
    public static final void LinkAppBar(LinkAppBarState state, Function0<Unit> onBackPressed, Function0<Unit> onLogout, Function1<? super Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> showBottomSheetContent, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(onLogout, "onLogout");
        Intrinsics.checkNotNullParameter(showBottomSheetContent, "showBottomSheetContent");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-767092427);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(state)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(onBackPressed)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(onLogout)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (mo89518u.mo89539n(showBottomSheetContent)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i7 = i2;
        if ((i7 & 5851) == 1170 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-767092427, i7, -1, "com.stripe.android.link.ui.LinkAppBar (LinkAppBar.kt:35)");
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m114261h = BB5.m114261h(BB5.m114255n(c20912a, 0.0f, 1, null), 0.0f, ThemeKt.getAppBarHeight(), 1, null);
            C25777lo c25777lo = C25777lo.f96729a;
            C25777lo.InterfaceC25782e m26807b = c25777lo.m26807b();
            InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
            InterfaceC4360K9.InterfaceC4363c m99135k = c4361a.m99135k();
            mo89518u.mo89638F(693286680);
            InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(m26807b, m99135k, mo89518u, 54);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114261h);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
                mo89518u.mo89617M(m113415a);
            } else {
                mo89518u.mo89566e();
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a, m74813a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-678309503);
            C38066ad5 c38066ad5 = C38066ad5.f50835a;
            mo89518u.mo89638F(1632742553);
            float f3 = 4;
            C47438qP1.m17541a(onBackPressed, ND3.m94184i(c20912a, C43705k61.m29303g(f3)), false, null, C43575jt0.m29791b(mo89518u, 1483428661, true, new LinkAppBarKt$LinkAppBar$1$1(state)), mo89518u, ((i7 >> 3) & 14) | 24624, 12);
            if (state.getShowHeader()) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            InterfaceC41563gV2 m94180m = ND3.m94180m(C8203U9.m81909a(InterfaceC37486Zc5.m72851b(c38066ad5, c20912a, 1.0f, false, 2, null), LinkAppBar$lambda$4$lambda$0(C4171Je.m100063f(f, null, 0.0f, null, mo89518u, 0, 14))), 0.0f, C43705k61.m29303g(18), 0.0f, 0.0f, 13, null);
            InterfaceC4360K9.InterfaceC4362b m99139g = c4361a.m99139g();
            mo89518u.mo89638F(-483455358);
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(c25777lo.m26802g(), m99139g, mo89518u, 48);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m94180m);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
                mo89518u.mo89617M(m113415a2);
            } else {
                mo89518u.mo89566e();
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a2, m91546a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
            C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-1163856341);
            C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
            mo89518u.mo89638F(-1587892209);
            boolean z = false;
            DP1.m110533b(C46748pE3.m19793d(C18975R.C18976drawable.ic_link_logo, mo89518u, 0), C40946fS5.m41310c(C18975R.string.link, mo89518u, 0), null, ThemeKt.getLinkColors(TM2.f35372a, mo89518u, TM2.f35373b).m116539getLinkLogo0d7_KjU(), mo89518u, 8, 4);
            if (state.getEmail() != null) {
                z = true;
            }
            C7489Se.m85173b(c35465Qm0, z, null, null, null, null, C43575jt0.m29791b(mo89518u, 1413101799, true, new LinkAppBarKt$LinkAppBar$1$2$1(state)), mo89518u, 1572870, 30);
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            if (state.getShowOverflowMenu()) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            mo89518u = mo89518u;
            InterfaceC48627sP5 m100063f = C4171Je.m100063f(f2, null, 0.0f, null, mo89518u, 0, 14);
            boolean showOverflowMenu = state.getShowOverflowMenu();
            InterfaceC41563gV2 m94184i = ND3.m94184i(C8203U9.m81909a(c20912a, LinkAppBar$lambda$4$lambda$2(m100063f)), C43705k61.m29303g(f3));
            mo89518u.mo89638F(511388516);
            boolean mo89539n = mo89518u.mo89539n(showBottomSheetContent) | mo89518u.mo89539n(onLogout);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new LinkAppBarKt$LinkAppBar$1$3$1(showBottomSheetContent, onLogout, i7);
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            C47438qP1.m17541a((Function0) mo89635G, m94184i, showOverflowMenu, null, ComposableSingletons$LinkAppBarKt.INSTANCE.m116543getLambda1$link_release(), mo89518u, 24576, 8);
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new LinkAppBarKt$LinkAppBar$2(state, onBackPressed, onLogout, showBottomSheetContent, i));
        }
    }

    private static final float LinkAppBar$lambda$4$lambda$0(InterfaceC48627sP5<Float> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().floatValue();
    }

    private static final float LinkAppBar$lambda$4$lambda$2(InterfaceC48627sP5<Float> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinkAppBarPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(2076788279);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(2076788279, i, -1, "com.stripe.android.link.ui.LinkAppBarPreview (LinkAppBar.kt:126)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$LinkAppBarKt.INSTANCE.m116545getLambda3$link_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new LinkAppBarKt$LinkAppBarPreview$1(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinkAppBar_ChildScreen(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(113991820);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(113991820, i, -1, "com.stripe.android.link.ui.LinkAppBar_ChildScreen (LinkAppBar.kt:168)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$LinkAppBarKt.INSTANCE.m116549getLambda7$link_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new LinkAppBarKt$LinkAppBar_ChildScreen$1(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinkAppBar_ChildScreen_NoEmail(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-159267192);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-159267192, i, -1, "com.stripe.android.link.ui.LinkAppBar_ChildScreen_NoEmail (LinkAppBar.kt:189)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$LinkAppBarKt.INSTANCE.m116551getLambda9$link_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new LinkAppBarKt$LinkAppBar_ChildScreen_NoEmail$1(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinkAppBar_NoEmail(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(992694975);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(992694975, i, -1, "com.stripe.android.link.ui.LinkAppBar_NoEmail (LinkAppBar.kt:147)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$LinkAppBarKt.INSTANCE.m116547getLambda5$link_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new LinkAppBarKt$LinkAppBar_NoEmail$1(i));
        }
    }
}
