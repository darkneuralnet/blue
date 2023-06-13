package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.financialconnections.domain.OauthPrepane;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPartnerAuthScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartnerAuthScreen.kt\ncom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$InstitutionalPrePaneContent$1$4\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,538:1\n74#2,7:539\n81#2:572\n85#2:580\n75#3:546\n76#3,11:548\n89#3:579\n76#4:547\n76#4:574\n460#5,13:559\n473#5,3:576\n154#6:573\n154#6:575\n*S KotlinDebug\n*F\n+ 1 PartnerAuthScreen.kt\ncom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$InstitutionalPrePaneContent$1$4\n*L\n406#1:539,7\n406#1:572\n406#1:580\n406#1:546\n406#1:548,11\n406#1:579\n406#1:547\n418#1:574\n406#1:559,13\n406#1:576,3\n414#1:573\n420#1:575\n*E\n"})
/* loaded from: classes7.dex */
public final class PartnerAuthScreenKt$InstitutionalPrePaneContent$1$4 extends Lambda implements Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ OauthPrepane $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerAuthScreenKt$InstitutionalPrePaneContent$1$4(OauthPrepane oauthPrepane) {
        super(3);
        this.$content = oauthPrepane;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC37486Zc5, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC37486Zc5 FinancialConnectionsButton, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-225021607, i, -1, "com.stripe.android.financialconnections.features.partnerauth.InstitutionalPrePaneContent.<anonymous>.<anonymous> (PartnerAuthScreen.kt:404)");
        }
        InterfaceC4360K9.InterfaceC4363c m99138h = InterfaceC4360K9.f19170a.m99138h();
        OauthPrepane oauthPrepane = this.$content;
        interfaceC32720Et0.mo89638F(693286680);
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h, interfaceC32720Et0, 48);
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
        C38680bf6.m64191b(m64192a, m74813a, c0757a.m113412d());
        C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
        C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
        C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
        interfaceC32720Et0.mo89530q();
        m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(2058660585);
        interfaceC32720Et0.mo89638F(-678309503);
        C38066ad5 c38066ad5 = C38066ad5.f50835a;
        interfaceC32720Et0.mo89638F(-1131341379);
        C38909c26.m62000e(oauthPrepane.getCta().getText(), null, 0L, 0L, null, null, null, 0L, null, C47801r06.m16685g(C47801r06.f106195b.m16678a()), 0L, 0, false, 0, null, null, interfaceC32720Et0, 0, 0, 65022);
        Image icon = oauthPrepane.getCta().getIcon();
        String str = icon != null ? icon.getDefault() : null;
        if (str != null) {
            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(12)), interfaceC32720Et0, 6);
            StripeImageKt.StripeImage(str, (StripeImageLoader) interfaceC32720Et0.mo89572c(FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader()), null, BB5.m114246w(c20912a, C43705k61.m29303g(16)), null, null, null, ComposableSingletons$PartnerAuthScreenKt.INSTANCE.m116407getLambda1$financial_connections_release(), null, interfaceC32720Et0, 12586368 | (StripeImageLoader.$stable << 3), 368);
        }
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
