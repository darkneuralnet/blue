package com.stripe.android.link.p042ui.menus;

import com.stripe.android.link.theme.ThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0007\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\f\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/link/ui/menus/LinkMenuItem;", "T", "", "items", "Lkotlin/Function1;", "", "onItemPress", "LinkMenu", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;LEt0;I)V", "item", "LgV2;", "modifier", "LinkBottomSheetRow", "(Lcom/stripe/android/link/ui/menus/LinkMenuItem;LgV2;LEt0;II)V", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLinkMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkMenu.kt\ncom/stripe/android/link/ui/menus/LinkMenuKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,81:1\n154#2:82\n74#3,6:83\n80#3:115\n84#3:120\n75#4:89\n76#4,11:91\n89#4:119\n75#4:127\n76#4,11:129\n89#4:157\n76#5:90\n76#5:128\n460#6,13:102\n473#6,3:116\n460#6,13:140\n473#6,3:154\n75#7,6:121\n81#7:153\n85#7:158\n*S KotlinDebug\n*F\n+ 1 LinkMenu.kt\ncom/stripe/android/link/ui/menus/LinkMenuKt\n*L\n46#1:82\n43#1:83,6\n43#1:115\n43#1:120\n43#1:89\n43#1:91,11\n43#1:119\n64#1:127\n64#1:129,11\n64#1:157\n43#1:90\n64#1:128\n43#1:102,13\n43#1:116,3\n64#1:140,13\n64#1:154,3\n64#1:121,6\n64#1:153\n64#1:158\n*E\n"})
/* renamed from: com.stripe.android.link.ui.menus.LinkMenuKt */
/* loaded from: classes7.dex */
public final class LinkMenuKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends LinkMenuItem> void LinkBottomSheetRow(T t, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        InterfaceC41563gV2.C20912a c20912a;
        long m18726g;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC36874Wm5 mo89512w;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1735851115);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(t)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            if ((i3 & 91) != 18 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                interfaceC32720Et02 = mo89518u;
            } else {
                if (i6 == 0) {
                    c20912a = InterfaceC41563gV2.f82354b0;
                } else {
                    c20912a = obj;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1735851115, i, -1, "com.stripe.android.link.ui.menus.LinkBottomSheetRow (LinkMenu.kt:59)");
                }
                InterfaceC4360K9.InterfaceC4363c m99138h = InterfaceC4360K9.f19170a.m99138h();
                InterfaceC41563gV2 m114255n = BB5.m114255n(BB5.m114254o(c20912a, ThemeKt.getMinimumTouchTargetSize()), 0.0f, 1, null);
                mo89518u.mo89638F(693286680);
                InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h, mo89518u, 48);
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114255n);
                if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                mo89518u.mo89557h();
                if (!mo89518u.mo89521t()) {
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
                mo89518u.mo89638F(-1497403215);
                String m41310c = C40946fS5.m41310c(t.getTextResId(), mo89518u, 0);
                mo89518u.mo89638F(-2041159087);
                if (!t.isDestructive()) {
                    m18726g = ThemeKt.getLinkColors(TM2.f35372a, mo89518u, TM2.f35373b).m116537getErrorText0d7_KjU();
                } else {
                    m18726g = C47063pm0.f104050b.m18726g();
                }
                mo89518u.mo89605Q();
                interfaceC32720Et02 = mo89518u;
                InterfaceC41563gV2 interfaceC41563gV22 = c20912a;
                C38909c26.m62000e(m41310c, ND3.m94182k(InterfaceC41563gV2.f82354b0, ThemeKt.getHorizontalPadding(), 0.0f, 2, null), m18726g, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et02, 48, 0, 65528);
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89563f();
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89605Q();
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                obj = interfaceC41563gV22;
            }
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new LinkMenuKt$LinkBottomSheetRow$2(t, obj, i, i2));
                return;
            }
            return;
        }
        obj = interfaceC41563gV2;
        if ((i3 & 91) != 18) {
        }
        if (i6 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        InterfaceC4360K9.InterfaceC4363c m99138h2 = InterfaceC4360K9.f19170a.m99138h();
        InterfaceC41563gV2 m114255n2 = BB5.m114255n(BB5.m114254o(c20912a, ThemeKt.getMinimumTouchTargetSize()), 0.0f, 1, null);
        mo89518u.mo89638F(693286680);
        InterfaceC51579xO2 m74813a2 = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h2, mo89518u, 48);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a2 = c0757a2.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m114255n2);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (!mo89518u.mo89521t()) {
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a2, m74813a2, c0757a2.m113412d());
        C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a2.m113414b());
        C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a2.m113413c());
        C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a2.m113410f());
        mo89518u.mo89530q();
        m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-678309503);
        C38066ad5 c38066ad52 = C38066ad5.f50835a;
        mo89518u.mo89638F(-1497403215);
        String m41310c2 = C40946fS5.m41310c(t.getTextResId(), mo89518u, 0);
        mo89518u.mo89638F(-2041159087);
        if (!t.isDestructive()) {
        }
        mo89518u.mo89605Q();
        interfaceC32720Et02 = mo89518u;
        InterfaceC41563gV2 interfaceC41563gV222 = c20912a;
        C38909c26.m62000e(m41310c2, ND3.m94182k(InterfaceC41563gV2.f82354b0, ThemeKt.getHorizontalPadding(), 0.0f, 2, null), m18726g, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et02, 48, 0, 65528);
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89563f();
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89605Q();
        if (C35528Qt0.m87827O()) {
        }
        obj = interfaceC41563gV222;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
        }
    }

    public static final <T extends LinkMenuItem> void LinkMenu(List<? extends T> items, Function1<? super T, Unit> onItemPress, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onItemPress, "onItemPress");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(2083821938);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(2083821938, i, -1, "com.stripe.android.link.ui.menus.LinkMenu (LinkMenu.kt:38)");
        }
        InterfaceC41563gV2 m94182k = ND3.m94182k(BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), 0.0f, C43705k61.m29303g(10), 1, null);
        mo89518u.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, 0);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94182k);
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
        C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
        C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
        C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
        C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
        mo89518u.mo89530q();
        m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-1163856341);
        C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
        mo89518u.mo89638F(1835168700);
        for (T t : items) {
            LinkBottomSheetRow(t, C38131ak0.m70814e(InterfaceC41563gV2.f82354b0, false, null, null, new LinkMenuKt$LinkMenu$1$1(onItemPress, t), 7, null), mo89518u, 0, 0);
        }
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new LinkMenuKt$LinkMenu$2(items, onItemPress, i));
        }
    }
}
