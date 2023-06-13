package com.stripe.android.uicore.elements;

import androidx.compose.p003ui.focus.C11309h;
import com.stripe.android.uicore.StripeThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0002\u001a=\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aO\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m28432d2 = {"", "OTPElementUIPreview", "(LEt0;I)V", "OTPElementUIDisabledPreview", "", "enabled", "Lcom/stripe/android/uicore/elements/OTPElement;", "element", "LgV2;", "modifier", "Lcom/stripe/android/uicore/elements/OTPElementColors;", "colors", "Landroidx/compose/ui/focus/h;", "focusRequester", "OTPElementUI", "(ZLcom/stripe/android/uicore/elements/OTPElement;LgV2;Lcom/stripe/android/uicore/elements/OTPElementColors;Landroidx/compose/ui/focus/h;LEt0;II)V", "", "value", "isSelected", "", "index", "LBv1;", "focusManager", "OTPInputBox", "(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/OTPElement;ILBv1;LgV2;ZLcom/stripe/android/uicore/elements/OTPElementColors;LEt0;I)V", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOTPElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,257:1\n25#2:258\n460#2,13:284\n25#2:298\n473#2,3:311\n1057#3,6:259\n1057#3,6:299\n76#4:265\n76#4:272\n76#5,5:266\n81#5:297\n85#5:315\n75#6:271\n76#6,11:273\n89#6:314\n1549#7:305\n1620#7,2:306\n1622#7:310\n154#8:308\n154#8:309\n76#9:316\n102#9,2:317\n*S KotlinDebug\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt\n*L\n97#1:258\n101#1:284,13\n105#1:298\n101#1:311,3\n97#1:259,6\n105#1:299,6\n99#1:265\n101#1:272\n101#1:266,5\n101#1:297\n101#1:315\n101#1:271\n101#1:273,11\n101#1:314\n107#1:305\n107#1:306,2\n107#1:310\n112#1:308\n118#1:309\n105#1:316\n105#1:317,2\n*E\n"})
/* loaded from: classes7.dex */
public final class OTPElementUIKt {
    public static final void OTPElementUI(boolean z, OTPElement element, InterfaceC41563gV2 interfaceC41563gV2, OTPElementColors oTPElementColors, C11309h c11309h, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        InterfaceC41563gV2.C20912a c20912a;
        OTPElementColors oTPElementColors2;
        int i3;
        C11309h c11309h2;
        IntRange until;
        int collectionSizeOrDefault;
        boolean z2;
        char c;
        long m18743m;
        long m116696getComponentBorder0d7_KjU;
        Intrinsics.checkNotNullParameter(element, "element");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-217372974);
        if ((i2 & 4) != 0) {
            c20912a = InterfaceC41563gV2.f82354b0;
        } else {
            c20912a = interfaceC41563gV2;
        }
        if ((i2 & 8) != 0) {
            TM2 tm2 = TM2.f35372a;
            int i4 = TM2.f35373b;
            i3 = i & (-7169);
            oTPElementColors2 = new OTPElementColors(tm2.m83731a(mo89518u, i4).m94900j(), StripeThemeKt.getStripeColors(tm2, mo89518u, i4).m116699getPlaceholderText0d7_KjU(), null);
        } else {
            oTPElementColors2 = oTPElementColors;
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            mo89518u.mo89638F(-492369756);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C11309h();
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            i3 &= -57345;
            c11309h2 = (C11309h) mo89635G;
        } else {
            c11309h2 = c11309h;
        }
        int i5 = i3;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-217372974, i5, -1, "com.stripe.android.uicore.elements.OTPElementUI (OTPElementUI.kt:88)");
        }
        InterfaceC32037Bv1 interfaceC32037Bv1 = (InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h());
        InterfaceC41563gV2 m114255n = BB5.m114255n(c20912a, 0.0f, 1, null);
        C25777lo.InterfaceC25782e m26804e = C25777lo.f96729a.m26804e();
        mo89518u.mo89638F(693286680);
        InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(m26804e, InterfaceC4360K9.f19170a.m99135k(), mo89518u, 6);
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
        boolean z3 = false;
        m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-678309503);
        C38066ad5 c38066ad5 = C38066ad5.f50835a;
        mo89518u.mo89638F(1507755318);
        mo89518u.mo89638F(-492369756);
        Object mo89635G2 = mo89518u.mo89635G();
        int i6 = 2;
        if (mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = LM5.m97025e(-1, null, 2, null);
            mo89518u.mo89503z(mo89635G2);
        }
        mo89518u.mo89605Q();
        EX2 ex2 = (EX2) mo89635G2;
        until = RangesKt___RangesKt.until(0, element.getController().getOtpLength());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            if (OTPElementUI$lambda$5$lambda$2(ex2) == nextInt) {
                z2 = true;
            } else {
                z2 = z3;
            }
            mo89518u.mo89638F(-155933783);
            if (nextInt == element.getController().getOtpLength() / i6) {
                c = 6;
                DN5.m110552a(BB5.m114273A(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(12)), mo89518u, 6);
            } else {
                c = 6;
            }
            mo89518u.mo89605Q();
            InterfaceC41563gV2 m94182k = ND3.m94182k(InterfaceC37486Zc5.m72851b(c38066ad5, InterfaceC41563gV2.f82354b0, 1.0f, false, 2, null), C43705k61.m29303g(4), 0.0f, i6, null);
            if (z) {
                m18743m = StripeThemeKt.getStripeColors(TM2.f35372a, mo89518u, TM2.f35373b).m116695getComponent0d7_KjU();
            } else {
                m18743m = C47063pm0.m18743m(StripeThemeKt.getStripeColors(TM2.f35372a, mo89518u, TM2.f35373b).m116699getPlaceholderText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            long j = m18743m;
            TM2 tm22 = TM2.f35372a;
            int i7 = TM2.f35373b;
            float borderStrokeWidth = StripeThemeKt.getBorderStrokeWidth(tm22, z2, mo89518u, i7);
            if (z2) {
                m116696getComponentBorder0d7_KjU = oTPElementColors2.m116741getSelectedBorder0d7_KjU();
            } else {
                m116696getComponentBorder0d7_KjU = StripeThemeKt.getStripeColors(tm22, mo89518u, i7).m116696getComponentBorder0d7_KjU();
            }
            ArrayList arrayList2 = arrayList;
            SectionUIKt.m116748SectionCardT042LqI(m94182k, false, j, C20466fZ.m41178a(borderStrokeWidth, m116696getComponentBorder0d7_KjU), C43575jt0.m29791b(mo89518u, -25718618, true, new OTPElementUIKt$OTPElementUI$2$1$1(element, nextInt, ex2, z2, c11309h2, interfaceC32037Bv1, z, oTPElementColors2, i5)), mo89518u, 24576, 2);
            arrayList2.add(Unit.INSTANCE);
            interfaceC32037Bv1 = interfaceC32037Bv1;
            arrayList = arrayList2;
            i6 = i6;
            z3 = false;
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
            mo89512w.mo20405a(new OTPElementUIKt$OTPElementUI$3(z, element, c20912a, oTPElementColors2, c11309h2, i, i2));
        }
    }

    private static final int OTPElementUI$lambda$5$lambda$2(EX2<Integer> ex2) {
        return ex2.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OTPElementUI$lambda$5$lambda$3(EX2<Integer> ex2, int i) {
        ex2.setValue(Integer.valueOf(i));
    }

    public static final void OTPElementUIDisabledPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(22458207);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(22458207, i, -1, "com.stripe.android.uicore.elements.OTPElementUIDisabledPreview (OTPElementUI.kt:73)");
            }
            StripeThemeKt.StripeTheme(null, null, null, ComposableSingletons$OTPElementUIKt.INSTANCE.m116732getLambda2$stripe_ui_core_release(), mo89518u, 3072, 7);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new OTPElementUIKt$OTPElementUIDisabledPreview$1(i));
        }
    }

    public static final void OTPElementUIPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(2099780475);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(2099780475, i, -1, "com.stripe.android.uicore.elements.OTPElementUIPreview (OTPElementUI.kt:59)");
            }
            StripeThemeKt.StripeTheme(null, null, null, ComposableSingletons$OTPElementUIKt.INSTANCE.m116731getLambda1$stripe_ui_core_release(), mo89518u, 3072, 7);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new OTPElementUIKt$OTPElementUIPreview$1(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OTPInputBox(String str, boolean z, OTPElement oTPElement, int i, InterfaceC32037Bv1 interfaceC32037Bv1, InterfaceC41563gV2 interfaceC41563gV2, boolean z2, OTPElementColors oTPElementColors, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        long m14827a;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1937256232);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1937256232, i2, -1, "com.stripe.android.uicore.elements.OTPInputBox (OTPElementUI.kt:180)");
        }
        if (z) {
            m14827a = C49006t26.m13201a(str.length());
        } else {
            m14827a = C48413s26.f108170b.m14827a();
        }
        F16 f16 = new F16(str, m14827a, (C48413s26) null, 4, (DefaultConstructorMarker) null);
        UX5 m28152a = AbstractC44199kw1.f95230c.m28152a();
        C33918Jw1 m99539e = C33918Jw1.f18784c.m99539e();
        long m94414f = N26.m94414f(24);
        TM2 tm2 = TM2.f35372a;
        int i3 = TM2.f35373b;
        G26 g26 = new G26(StripeThemeKt.getStripeColors(tm2, mo89518u, i3).m116698getOnComponent0d7_KjU(), m94414f, m99539e, null, null, m28152a, null, 0L, null, null, null, 0L, null, null, C47801r06.m16685g(C47801r06.f106195b.m16678a()), null, 0L, null, 245720, null);
        C46831pN5 c46831pN5 = new C46831pN5(StripeThemeKt.getStripeColors(tm2, mo89518u, i3).m116701getTextCursor0d7_KjU(), null);
        C38736bl2 c38736bl2 = new C38736bl2(0, false, oTPElement.getController().m116735getKeyboardTypePjHm6EE$stripe_ui_core_release(), 0, 11, null);
        C37555Zk2 c37555Zk2 = new C37555Zk2(new OTPElementUIKt$OTPInputBox$1(interfaceC32037Bv1), null, new OTPElementUIKt$OTPInputBox$2(interfaceC32037Bv1), null, null, null, 58, null);
        int i4 = i2 >> 9;
        C7683TE.m84176b(f16, new OTPElementUIKt$OTPInputBox$3(oTPElement, i, interfaceC32037Bv1), interfaceC41563gV2, z2, false, g26, c38736bl2, c37555Zk2, true, 0, null, null, null, c46831pN5, C43575jt0.m29791b(mo89518u, -1385086863, true, new OTPElementUIKt$OTPInputBox$4(oTPElementColors, str, z2, i2, z)), mo89518u, (i4 & 7168) | (i4 & 896) | 100663296 | (C37555Zk2.f49151h << 21), 24576, 7696);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new OTPElementUIKt$OTPInputBox$5(str, z, oTPElement, i, interfaceC32037Bv1, interfaceC41563gV2, z2, oTPElementColors, i2));
        }
    }
}
