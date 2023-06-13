package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.StripeThemeKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"", "enabled", "Lcom/stripe/android/uicore/elements/AddressController;", "controller", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIdentifiers", "lastTextFieldIdentifier", "", "AddressElementUI", "(ZLcom/stripe/android/uicore/elements/AddressController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddressElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElementUI.kt\ncom/stripe/android/uicore/elements/AddressElementUIKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,50:1\n819#2:51\n847#2,2:52\n1864#2,2:88\n1866#2:92\n73#3,7:54\n80#3:87\n84#3:97\n75#4:61\n76#4,11:63\n89#4:96\n76#5:62\n460#6,13:74\n473#6,3:93\n174#7:90\n174#7:91\n76#8:98\n*S KotlinDebug\n*F\n+ 1 AddressElementUI.kt\ncom/stripe/android/uicore/elements/AddressElementUIKt\n*L\n28#1:51\n28#1:52,2\n30#1:88,2\n30#1:92\n29#1:54,7\n29#1:87\n29#1:97\n29#1:61\n29#1:63,11\n29#1:96\n29#1:62\n29#1:74,13\n29#1:93,3\n40#1:90\n42#1:91\n24#1:98\n*E\n"})
/* loaded from: classes7.dex */
public final class AddressElementUIKt {
    public static final void AddressElementUI(boolean z, AddressController controller, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ArrayList arrayList;
        int lastIndex;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1383545451);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1383545451, i, -1, "com.stripe.android.uicore.elements.AddressElementUI (AddressElementUI.kt:17)");
        }
        List<SectionFieldElement> AddressElementUI$lambda$0 = AddressElementUI$lambda$0(GM5.m105206a(controller.getFieldsFlowable(), null, null, mo89518u, 56, 2));
        if (AddressElementUI$lambda$0 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : AddressElementUI$lambda$0) {
                if (!hiddenIdentifiers.contains(((SectionFieldElement) obj).getIdentifier())) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            mo89518u.mo89638F(-483455358);
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, 0);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(c20912a);
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
            mo89518u.mo89638F(-1494142734);
            int i2 = 0;
            for (Object obj2 : arrayList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                int i4 = i2;
                SectionFieldElementUIKt.m116747SectionFieldElementUI0uKR9Ig(z, (SectionFieldElement) obj2, null, hiddenIdentifiers, identifierSpec, 0, 0, mo89518u, (i & 14) | 4096 | ((i << 3) & 57344), 100);
                lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                if (i4 != lastIndex) {
                    TM2 tm2 = TM2.f35372a;
                    int i5 = TM2.f35373b;
                    L51.m97795a(ND3.m94182k(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(StripeThemeKt.getStripeShapes(tm2, mo89518u, i5).getBorderStrokeWidth()), 0.0f, 2, null), StripeThemeKt.getStripeColors(tm2, mo89518u, i5).m116697getComponentDivider0d7_KjU(), C43705k61.m29303g(StripeThemeKt.getStripeShapes(tm2, mo89518u, i5).getBorderStrokeWidth()), 0.0f, mo89518u, 0, 8);
                }
                i2 = i3;
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
            mo89512w.mo20405a(new AddressElementUIKt$AddressElementUI$3(z, controller, hiddenIdentifiers, identifierSpec, i));
        }
    }

    private static final List<SectionFieldElement> AddressElementUI$lambda$0(InterfaceC48627sP5<? extends List<? extends SectionFieldElement>> interfaceC48627sP5) {
        return (List) interfaceC48627sP5.getValue();
    }
}
