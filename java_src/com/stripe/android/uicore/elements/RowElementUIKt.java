package com.stripe.android.uicore.elements;

import androidx.compose.p003ui.focus.C11299c;
import com.stripe.android.uicore.StripeThemeKt;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"", "enabled", "Lcom/stripe/android/uicore/elements/RowController;", "controller", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIdentifiers", "lastTextFieldIdentifier", "", "RowElementUI", "(ZLcom/stripe/android/uicore/elements/RowController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRowElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowElementUI.kt\ncom/stripe/android/uicore/elements/RowElementUIKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,75:1\n766#2:76\n857#2,2:77\n1864#2,2:119\n1866#2:129\n1057#3,3:79\n1060#3,3:83\n1057#3,6:122\n154#4:82\n174#4:128\n75#5,6:86\n81#5:118\n85#5:134\n75#6:92\n76#6,11:94\n89#6:133\n76#7:93\n460#8,13:105\n36#8:121\n473#8,3:130\n*S KotlinDebug\n*F\n+ 1 RowElementUI.kt\ncom/stripe/android/uicore/elements/RowElementUIKt\n*L\n29#1:76\n29#1:77,2\n35#1:119,2\n35#1:129\n30#1:79,3\n30#1:83,3\n55#1:122,6\n30#1:82\n67#1:128\n34#1:86,6\n34#1:118\n34#1:134\n34#1:92\n34#1:94,11\n34#1:133\n34#1:93\n34#1:105,13\n55#1:121\n34#1:130,3\n*E\n"})
/* loaded from: classes7.dex */
public final class RowElementUIKt {
    public static final void RowElementUI(boolean z, RowController controller, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int lastIndex;
        int m68801g;
        int m68804d;
        int lastIndex2;
        int i2 = i;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(652994833);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(652994833, i2, -1, "com.stripe.android.uicore.elements.RowElementUI (RowElementUI.kt:22)");
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : controller.getFields()) {
            if (true ^ hiddenIdentifiers.contains(((SectionSingleFieldElement) obj).getIdentifier())) {
                arrayList.add(obj);
            }
        }
        Object mo89635G = mo89518u.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = LM5.m97025e(C43705k61.m29306d(C43705k61.m29303g(0)), null, 2, null);
            mo89518u.mo89503z(mo89635G);
        }
        EX2 ex2 = (EX2) mo89635G;
        if (!arrayList.isEmpty()) {
            InterfaceC41563gV2 m114255n = BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null);
            mo89518u.mo89638F(693286680);
            InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), InterfaceC4360K9.f19170a.m99135k(), mo89518u, 0);
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
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-678309503);
            C38066ad5 c38066ad5 = C38066ad5.f50835a;
            mo89518u.mo89638F(1613130418);
            int i3 = 0;
            for (Object obj2 : arrayList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                SectionSingleFieldElement sectionSingleFieldElement = (SectionSingleFieldElement) obj2;
                lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                if (i3 == lastIndex) {
                    m68801g = C11299c.f52961b.m68807a();
                } else {
                    m68801g = C11299c.f52961b.m68801g();
                }
                int i5 = m68801g;
                if (i3 == 0) {
                    m68804d = C11299c.f52961b.m68800h();
                } else {
                    m68804d = C11299c.f52961b.m68804d();
                }
                int i6 = m68804d;
                InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                InterfaceC41563gV2 m72851b = InterfaceC37486Zc5.m72851b(c38066ad5, c20912a, 1.0f / arrayList.size(), false, 2, null);
                mo89518u.mo89638F(1157296644);
                boolean mo89539n = mo89518u.mo89539n(ex2);
                Object mo89635G2 = mo89518u.mo89635G();
                if (mo89539n || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G2 = new RowElementUIKt$RowElementUI$1$1$1$1(ex2);
                    mo89518u.mo89503z(mo89635G2);
                }
                mo89518u.mo89605Q();
                int i7 = i3;
                SectionFieldElementUIKt.m116747SectionFieldElementUI0uKR9Ig(z, sectionSingleFieldElement, C42272hh3.m36095a(m72851b, (Function1) mo89635G2), hiddenIdentifiers, identifierSpec, i5, i6, mo89518u, (i2 & 14) | 4096 | ((i2 << 3) & 57344), 0);
                lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                if (i7 != lastIndex2) {
                    InterfaceC41563gV2 m114254o = BB5.m114254o(c20912a, ((C43705k61) ex2.getValue()).m29298l());
                    TM2 tm2 = TM2.f35372a;
                    int i8 = TM2.f35373b;
                    L51.m97795a(BB5.m114273A(m114254o, C43705k61.m29303g(StripeThemeKt.getStripeShapes(tm2, mo89518u, i8).getBorderStrokeWidth())), StripeThemeKt.getStripeColors(tm2, mo89518u, i8).m116697getComponentDivider0d7_KjU(), 0.0f, 0.0f, mo89518u, 0, 12);
                }
                i2 = i;
                i3 = i4;
            }
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new RowElementUIKt$RowElementUI$2(z, controller, hiddenIdentifiers, identifierSpec, i));
        }
    }
}
