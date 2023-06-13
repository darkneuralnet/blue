package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.link.p042ui.ErrorTextKt;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.RowElement;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.elements.SectionElementUIKt;
import com.stripe.android.uicore.elements.SectionSingleFieldElement;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nWalletScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$CardDetailsRecollectionForm$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,545:1\n74#2,6:546\n80#2:578\n84#2:584\n75#3:552\n76#3,11:554\n89#3:583\n76#4:553\n460#5,13:565\n473#5,3:580\n154#6:579\n*S KotlinDebug\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$CardDetailsRecollectionForm$1\n*L\n383#1:546,6\n383#1:578\n383#1:584\n383#1:552\n383#1:554,11\n383#1:583\n383#1:553\n383#1:565,13\n383#1:580,3\n389#1:579\n*E\n"})
/* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$CardDetailsRecollectionForm$1 */
/* loaded from: classes7.dex */
public final class WalletScreenKt$CardDetailsRecollectionForm$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $errorTextResId;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ RowElement $rowElement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletScreenKt$CardDetailsRecollectionForm$1(InterfaceC41563gV2 interfaceC41563gV2, int i, int i2, RowElement rowElement) {
        super(2);
        this.$modifier = interfaceC41563gV2;
        this.$$dirty = i;
        this.$errorTextResId = i2;
        this.$rowElement = rowElement;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Set emptySet;
        Object last;
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-66632326, i, -1, "com.stripe.android.link.ui.wallet.CardDetailsRecollectionForm.<anonymous> (WalletScreen.kt:381)");
        }
        InterfaceC41563gV2 interfaceC41563gV2 = this.$modifier;
        int i2 = this.$errorTextResId;
        RowElement rowElement = this.$rowElement;
        int i3 = (this.$$dirty >> 9) & 14;
        interfaceC32720Et0.mo89638F(-483455358);
        int i4 = i3 >> 3;
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), interfaceC32720Et0, (i4 & 112) | (i4 & 14));
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(interfaceC41563gV2);
        int i5 = ((((i3 << 3) & 112) << 9) & 7168) | 6;
        if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
            C52468yt0.m2335c();
        }
        interfaceC32720Et0.mo89557h();
        if (interfaceC32720Et0.mo89521t()) {
            interfaceC32720Et0.mo89617M(m113415a);
        } else {
            interfaceC32720Et0.mo89566e();
        }
        interfaceC32720Et0.mo89620L();
        InterfaceC32720Et0 m64192a = C38680bf6.m64192a(interfaceC32720Et0);
        C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
        C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
        C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
        C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
        interfaceC32720Et0.mo89530q();
        m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, Integer.valueOf((i5 >> 3) & 112));
        interfaceC32720Et0.mo89638F(2058660585);
        interfaceC32720Et0.mo89638F(-1163856341);
        if (((i5 >> 9) & 14 & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
        } else {
            C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
            interfaceC32720Et0.mo89638F(294147012);
            if (((((i3 >> 6) & 112) | 6) & 81) == 16 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
            } else {
                String m41310c = C40946fS5.m41310c(i2, interfaceC32720Et0, 0);
                InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                ErrorTextKt.ErrorText(m41310c, BB5.m114255n(c20912a, 0.0f, 1, null), null, interfaceC32720Et0, 48, 4);
                DN5.m110552a(BB5.m114254o(c20912a, C43705k61.m29303g(16)), interfaceC32720Et0, 6);
                SectionElement wrap$default = SectionElement.Companion.wrap$default(SectionElement.Companion, rowElement, (Integer) null, 2, (Object) null);
                emptySet = SetsKt__SetsKt.emptySet();
                last = CollectionsKt___CollectionsKt.last((List<? extends Object>) rowElement.getFields());
                SectionElementUIKt.m116746SectionElementUIrgidl0k(true, wrap$default, emptySet, ((SectionSingleFieldElement) last).getIdentifier(), 0, 0, interfaceC32720Et0, (IdentifierSpec.$stable << 9) | (SectionElement.$stable << 3) | 390, 48);
            }
            interfaceC32720Et0.mo89605Q();
        }
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89563f();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
