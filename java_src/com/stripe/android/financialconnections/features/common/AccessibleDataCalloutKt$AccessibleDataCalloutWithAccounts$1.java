package com.stripe.android.financialconnections.features.common;

import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAccessibleDataCallout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibleDataCallout.kt\ncom/stripe/android/financialconnections/features/common/AccessibleDataCalloutKt$AccessibleDataCalloutWithAccounts$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,526:1\n154#2:527\n73#3,7:528\n80#3:561\n84#3:568\n75#4:535\n76#4,11:537\n89#4:567\n76#5:536\n460#6,13:548\n473#6,3:564\n1855#7,2:562\n*S KotlinDebug\n*F\n+ 1 AccessibleDataCallout.kt\ncom/stripe/android/financialconnections/features/common/AccessibleDataCalloutKt$AccessibleDataCalloutWithAccounts$1\n*L\n66#1:527\n66#1:528,7\n66#1:561\n66#1:568\n66#1:535\n66#1:537,11\n66#1:567\n66#1:536\n66#1:548,13\n66#1:564,3\n77#1:562,2\n*E\n"})
/* loaded from: classes7.dex */
public final class AccessibleDataCalloutKt$AccessibleDataCalloutWithAccounts$1 extends Lambda implements Function3<InterfaceC40096e10, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<PartnerAccount> $accounts;
    final /* synthetic */ FinancialConnectionsInstitution $institution;
    final /* synthetic */ AccessibleDataCalloutModel $model;
    final /* synthetic */ Function0<Unit> $onLearnMoreClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibleDataCalloutKt$AccessibleDataCalloutWithAccounts$1(List<PartnerAccount> list, FinancialConnectionsInstitution financialConnectionsInstitution, AccessibleDataCalloutModel accessibleDataCalloutModel, Function0<Unit> function0, int i) {
        super(3);
        this.$accounts = list;
        this.$institution = financialConnectionsInstitution;
        this.$model = accessibleDataCalloutModel;
        this.$onLearnMoreClick = function0;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC40096e10 interfaceC40096e10, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC40096e10, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC40096e10 AccessibleDataCalloutBox, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(AccessibleDataCalloutBox, "$this$AccessibleDataCalloutBox");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-469393647, i, -1, "com.stripe.android.financialconnections.features.common.AccessibleDataCalloutWithAccounts.<anonymous> (AccessibleDataCallout.kt:64)");
        }
        C25777lo.InterfaceC25782e m26795n = C25777lo.f96729a.m26795n(C43705k61.m29303g(12));
        List<PartnerAccount> list = this.$accounts;
        FinancialConnectionsInstitution financialConnectionsInstitution = this.$institution;
        AccessibleDataCalloutModel accessibleDataCalloutModel = this.$model;
        Function0<Unit> function0 = this.$onLearnMoreClick;
        int i2 = this.$$dirty;
        interfaceC32720Et0.mo89638F(-483455358);
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(m26795n, InterfaceC4360K9.f19170a.m99136j(), interfaceC32720Et0, 6);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(c20912a);
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
        m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(2058660585);
        interfaceC32720Et0.mo89638F(-1163856341);
        C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
        interfaceC32720Et0.mo89638F(-351080825);
        List<PartnerAccount> list2 = list;
        if (list2.size() >= 5) {
            interfaceC32720Et0.mo89638F(1860760092);
            Image icon = financialConnectionsInstitution.getIcon();
            AccessibleDataCalloutKt.AccountRow(financialConnectionsInstitution.getName(), C40946fS5.m41309d(C18634R.string.stripe_success_infobox_accounts, new Object[]{Integer.valueOf(list2.size())}, interfaceC32720Et0, 64), icon != null ? icon.getDefault() : null, interfaceC32720Et0, 0, 0);
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(1860760441);
            for (PartnerAccount partnerAccount : list) {
                Image icon2 = financialConnectionsInstitution.getIcon();
                AccessibleDataCalloutKt.AccountRow(partnerAccount.getFullName$financial_connections_release(), null, icon2 != null ? icon2.getDefault() : null, interfaceC32720Et0, 0, 2);
            }
            interfaceC32720Et0.mo89605Q();
        }
        L51.m97795a(null, FinancialConnectionsTheme.INSTANCE.getColors(interfaceC32720Et0, 6).m116459getBackgroundBackdrop0d7_KjU(), 0.0f, 0.0f, interfaceC32720Et0, 0, 13);
        AccessibleDataCalloutKt.AccessibleDataText(accessibleDataCalloutModel, function0, interfaceC32720Et0, ((i2 >> 6) & 112) | 8);
        interfaceC32720Et0.mo89605Q();
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
