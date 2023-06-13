package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lrn2;", "", "it", "", "invoke", "(Lrn2;ILEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5\n+ 2 InstitutionPickerScreen.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,493:1\n430#2,4:494\n434#2,2:499\n437#2:502\n438#2,2:504\n436#2,7:507\n444#2:521\n443#2:522\n441#2,6:523\n448#2,4:569\n452#2,2:574\n454#2:577\n476#2:578\n467#2,12:579\n479#2:596\n154#3:498\n154#3:501\n154#3:503\n154#3:506\n154#3:573\n25#4:514\n50#4:529\n49#4:530\n460#4,13:555\n473#4,3:591\n1057#5,6:515\n1057#5,6:531\n68#6,5:537\n73#6:568\n77#6:595\n75#7:542\n76#7,11:544\n89#7:594\n76#8:543\n76#8:576\n*S KotlinDebug\n*F\n+ 1 InstitutionPickerScreen.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1\n*L\n433#1:498\n435#1:501\n437#1:503\n439#1:506\n451#1:573\n442#1:514\n446#1:529\n446#1:530\n430#1:555,13\n430#1:591,3\n442#1:515,6\n446#1:531,6\n430#1:537,5\n430#1:568\n430#1:595\n430#1:542\n430#1:544,11\n430#1:594\n430#1:543\n453#1:576\n*E\n"})
/* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$invoke$$inlined$items$default$5 */
/* loaded from: classes7.dex */
public final class C18757xca5b181e extends Lambda implements Function4<InterfaceC48261rn2, Integer, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ Function2 $onInstitutionSelected$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18757xca5b181e(List list, Function2 function2, int i) {
        super(4);
        this.$items = list;
        this.$onInstitutionSelected$inlined = function2;
        this.$$dirty$inlined = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48261rn2 interfaceC48261rn2, Integer num, InterfaceC32720Et0 interfaceC32720Et0, Integer num2) {
        invoke(interfaceC48261rn2, num.intValue(), interfaceC32720Et0, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC48261rn2 items, int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i2 & 14) == 0) {
            i3 = i2 | (interfaceC32720Et0.mo89539n(items) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= interfaceC32720Et0.mo89527r(i) ? 32 : 16;
        }
        if ((i3 & 731) == 146 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(699646206, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:390)");
        }
        int i4 = i3 & 14;
        FinancialConnectionsInstitution financialConnectionsInstitution = (FinancialConnectionsInstitution) this.$items.get(i);
        interfaceC32720Et0.mo89638F(1094528064);
        if ((i4 & 112) == 0) {
            i4 |= interfaceC32720Et0.mo89539n(financialConnectionsInstitution) ? 32 : 16;
        }
        if ((i4 & 721) == 144 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
        } else {
            InterfaceC4360K9 m99141e = InterfaceC4360K9.f19170a.m99141e();
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            float f = 6;
            InterfaceC41563gV2 m88106a = C35447Qk0.m88106a(BB5.m114255n(BB5.m114254o(c20912a, C43705k61.m29303g(80)), 0.0f, 1, null), C39242cc5.m61172d(C43705k61.m29303g(f)));
            float m29303g = C43705k61.m29303g(1);
            FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
            InterfaceC41563gV2 m44155g = C19783dZ.m44155g(m88106a, m29303g, financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116462getBorderDefault0d7_KjU(), C39242cc5.m61172d(C43705k61.m29303g(f)));
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
                mo89635G = C40741f62.m42091a();
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC48104rX2 interfaceC48104rX2 = (InterfaceC48104rX2) mo89635G;
            InterfaceC51956y12 m6605e = C51107wb5.m6605e(false, 0.0f, financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116474getTextSecondary0d7_KjU(), interfaceC32720Et0, 0, 3);
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n = interfaceC32720Et0.mo89539n(this.$onInstitutionSelected$inlined) | interfaceC32720Et0.mo89539n(financialConnectionsInstitution);
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G2 == c2012a.m108267a()) {
                mo89635G2 = new InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$2$2$1(this.$onInstitutionSelected$inlined, financialConnectionsInstitution);
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 m70816c = C38131ak0.m70816c(m44155g, interfaceC48104rX2, m6605e, false, null, null, (Function0) mo89635G2, 28, null);
            interfaceC32720Et0.mo89638F(733328855);
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(m99141e, false, interfaceC32720Et0, 6);
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m70816c);
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
            C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            interfaceC32720Et0.mo89530q();
            m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(2058660585);
            interfaceC32720Et0.mo89638F(-2137368960);
            C40689f10 c40689f10 = C40689f10.f79291a;
            interfaceC32720Et0.mo89638F(-845136186);
            InterfaceC41563gV2 m94184i = ND3.m94184i(BB5.m114257l(c20912a, 0.0f, 1, null), C43705k61.m29303g(8));
            Image logo = financialConnectionsInstitution.getLogo();
            StripeImageKt.StripeImage((logo == null || (r1 = logo.getDefault()) == null) ? "" : "", (StripeImageLoader) interfaceC32720Et0.mo89572c(FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader()), "Institution logo", m94184i, BA0.f1929a.m114316b(), null, null, C43575jt0.m29791b(interfaceC32720Et0, -388858015, true, new InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$2$3$1(financialConnectionsInstitution)), ComposableSingletons$InstitutionPickerScreenKt.INSTANCE.m116387getLambda5$financial_connections_release(), interfaceC32720Et0, 113274240 | (StripeImageLoader.$stable << 3), 96);
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89563f();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
        }
        interfaceC32720Et0.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
