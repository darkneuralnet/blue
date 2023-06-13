package com.stripe.android.link.p042ui.paymentmethod;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p003ui.platform.C11411h;
import com.stripe.android.link.C18975R;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.ErrorTextKt;
import com.stripe.android.link.p042ui.PrimaryButtonKt;
import com.stripe.android.link.p042ui.PrimaryButtonState;
import com.stripe.android.link.theme.ColorKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodBody.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,288:1\n154#2:289\n154#2:290\n154#2:291\n154#2:339\n154#2:340\n76#3,5:292\n81#3:323\n85#3:338\n75#4:297\n76#4,11:299\n89#4:337\n76#5:298\n460#6,13:310\n50#6:325\n49#6:326\n473#6,3:334\n1855#7:324\n1856#7:333\n1057#8,6:327\n*S KotlinDebug\n*F\n+ 1 PaymentMethodBody.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5\n*L\n170#1:289\n179#1:290\n180#1:291\n195#1:339\n199#1:340\n176#1:292,5\n176#1:323\n176#1:338\n176#1:297\n176#1:299,11\n176#1:337\n176#1:298\n176#1:310,13\n187#1:325\n187#1:326\n176#1:334,3\n182#1:324\n182#1:333\n187#1:327,6\n*E\n"})
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodBodyKt$PaymentMethodBody$5 */
/* loaded from: classes7.dex */
public final class PaymentMethodBodyKt$PaymentMethodBody$5 extends Lambda implements Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> $formContent;
    final /* synthetic */ Function1<SupportedPaymentMethod, Unit> $onPaymentMethodSelected;
    final /* synthetic */ Function0<Unit> $onPrimaryButtonClick;
    final /* synthetic */ Function0<Unit> $onSecondaryButtonClick;
    final /* synthetic */ String $primaryButtonLabel;
    final /* synthetic */ PrimaryButtonState $primaryButtonState;
    final /* synthetic */ String $secondaryButtonLabel;
    final /* synthetic */ SupportedPaymentMethod $selectedPaymentMethod;
    final /* synthetic */ List<SupportedPaymentMethod> $supportedPaymentMethods;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodBodyKt$PaymentMethodBody$5$2 */
    /* loaded from: classes7.dex */
    public static final class C190312 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty$1;
        final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> $formContent;
        final /* synthetic */ InterfaceC35231Pm0 $this_ScrollableTopLevelColumn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C190312(Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, InterfaceC35231Pm0 interfaceC35231Pm0, int i, int i2) {
            super(2);
            this.$formContent = function3;
            this.$this_ScrollableTopLevelColumn = interfaceC35231Pm0;
            this.$$dirty = i;
            this.$$dirty$1 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-798901258, i, -1, "com.stripe.android.link.ui.paymentmethod.PaymentMethodBody.<anonymous>.<anonymous> (PaymentMethodBody.kt:195)");
            }
            this.$formContent.invoke(this.$this_ScrollableTopLevelColumn, interfaceC32720Et0, Integer.valueOf((this.$$dirty & 14) | ((this.$$dirty$1 >> 24) & 112)));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPaymentMethodBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodBody.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,288:1\n76#2:289\n*S KotlinDebug\n*F\n+ 1 PaymentMethodBody.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodBody$5$3\n*L\n203#1:289\n*E\n"})
    /* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodBodyKt$PaymentMethodBody$5$3 */
    /* loaded from: classes7.dex */
    public static final class C190323 extends Lambda implements Function3<InterfaceC7907Te, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ ErrorMessage $errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190323(ErrorMessage errorMessage) {
            super(3);
            this.$errorMessage = errorMessage;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7907Te interfaceC7907Te, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC7907Te, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC7907Te AnimatedVisibility, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            String str;
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(453863208, i, -1, "com.stripe.android.link.ui.paymentmethod.PaymentMethodBody.<anonymous>.<anonymous> (PaymentMethodBody.kt:200)");
            }
            ErrorMessage errorMessage = this.$errorMessage;
            if (errorMessage != null) {
                Resources resources = ((Context) interfaceC32720Et0.mo89572c(C11411h.m68324g())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "LocalContext.current.resources");
                str = errorMessage.getMessage(resources);
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            ErrorTextKt.ErrorText(str, BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), null, interfaceC32720Et0, 48, 4);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodBodyKt$PaymentMethodBody$5(List<? extends SupportedPaymentMethod> list, SupportedPaymentMethod supportedPaymentMethod, ErrorMessage errorMessage, String str, PrimaryButtonState primaryButtonState, Function0<Unit> function0, int i, String str2, Function0<Unit> function02, Function1<? super SupportedPaymentMethod, Unit> function1, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3) {
        super(3);
        this.$supportedPaymentMethods = list;
        this.$selectedPaymentMethod = supportedPaymentMethod;
        this.$errorMessage = errorMessage;
        this.$primaryButtonLabel = str;
        this.$primaryButtonState = primaryButtonState;
        this.$onPrimaryButtonClick = function0;
        this.$$dirty = i;
        this.$secondaryButtonLabel = str2;
        this.$onSecondaryButtonClick = function02;
        this.$onPaymentMethodSelected = function1;
        this.$formContent = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC35231Pm0 interfaceC35231Pm0, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC35231Pm0, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC35231Pm0 ScrollableTopLevelColumn, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(ScrollableTopLevelColumn, "$this$ScrollableTopLevelColumn");
        int i3 = (i & 14) == 0 ? i | (interfaceC32720Et0.mo89539n(ScrollableTopLevelColumn) ? 4 : 2) : i;
        if ((i3 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1990249040, i3, -1, "com.stripe.android.link.ui.paymentmethod.PaymentMethodBody.<anonymous> (PaymentMethodBody.kt:165)");
        }
        String m41310c = C40946fS5.m41310c(C18975R.string.add_payment_method, interfaceC32720Et0, 0);
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        float f = 4;
        InterfaceC41563gV2 m94180m = ND3.m94180m(c20912a, 0.0f, C43705k61.m29303g(f), 0.0f, C43705k61.m29303g(32), 5, null);
        int m16678a = C47801r06.f106195b.m16678a();
        TM2 tm2 = TM2.f35372a;
        int i4 = TM2.f35373b;
        int i5 = i3;
        C38909c26.m62000e(m41310c, m94180m, tm2.m83731a(interfaceC32720Et0, i4).m94903g(), 0L, null, null, null, 0L, null, C47801r06.m16685g(m16678a), 0L, 0, false, 0, null, tm2.m83729c(interfaceC32720Et0, i4).m104961g(), interfaceC32720Et0, 48, 0, 32248);
        interfaceC32720Et0.mo89638F(-774875837);
        if (this.$supportedPaymentMethods.size() > 1) {
            InterfaceC41563gV2 m94180m2 = ND3.m94180m(BB5.m114255n(c20912a, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C43705k61.m29303g(16), 7, null);
            C25777lo.InterfaceC25782e m26795n = C25777lo.f96729a.m26795n(C43705k61.m29303g(20));
            List<SupportedPaymentMethod> list = this.$supportedPaymentMethods;
            SupportedPaymentMethod supportedPaymentMethod = this.$selectedPaymentMethod;
            PrimaryButtonState primaryButtonState = this.$primaryButtonState;
            Function1<SupportedPaymentMethod, Unit> function1 = this.$onPaymentMethodSelected;
            interfaceC32720Et0.mo89638F(693286680);
            InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(m26795n, InterfaceC4360K9.f19170a.m99135k(), interfaceC32720Et0, 6);
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94180m2);
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
            interfaceC32720Et0.mo89638F(-1240767345);
            for (SupportedPaymentMethod supportedPaymentMethod2 : list) {
                boolean z = supportedPaymentMethod2 == supportedPaymentMethod;
                boolean z2 = !primaryButtonState.isBlocking();
                interfaceC32720Et0.mo89638F(511388516);
                boolean mo89539n = interfaceC32720Et0.mo89539n(function1) | interfaceC32720Et0.mo89539n(supportedPaymentMethod2);
                Object mo89635G = interfaceC32720Et0.mo89635G();
                if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G = new PaymentMethodBodyKt$PaymentMethodBody$5$1$1$1$1(function1, supportedPaymentMethod2);
                    interfaceC32720Et0.mo89503z(mo89635G);
                }
                interfaceC32720Et0.mo89605Q();
                PaymentMethodBodyKt.PaymentMethodTypeCell(c38066ad5, supportedPaymentMethod2, z, z2, (Function0) mo89635G, null, interfaceC32720Et0, 6, 16);
                function1 = function1;
            }
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89563f();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
        }
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89638F(-774875068);
        if (this.$selectedPaymentMethod.getShowsForm()) {
            InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
            DN5.m110552a(BB5.m114254o(c20912a2, C43705k61.m29303g(f)), interfaceC32720Et0, 6);
            i2 = i5;
            ColorKt.StripeThemeForLink(C43575jt0.m29791b(interfaceC32720Et0, -798901258, true, new C190312(this.$formContent, ScrollableTopLevelColumn, i2, this.$$dirty)), interfaceC32720Et0, 6);
            DN5.m110552a(BB5.m114254o(c20912a2, C43705k61.m29303g(8)), interfaceC32720Et0, 6);
        } else {
            i2 = i5;
        }
        interfaceC32720Et0.mo89605Q();
        ErrorMessage errorMessage = this.$errorMessage;
        C7489Se.m85173b(ScrollableTopLevelColumn, errorMessage != null, null, null, null, null, C43575jt0.m29791b(interfaceC32720Et0, 453863208, true, new C190323(errorMessage)), interfaceC32720Et0, (i2 & 14) | 1572864, 30);
        String str = this.$primaryButtonLabel;
        PrimaryButtonState primaryButtonState2 = this.$primaryButtonState;
        Function0<Unit> function0 = this.$onPrimaryButtonClick;
        Integer primaryButtonStartIconResourceId = this.$selectedPaymentMethod.getPrimaryButtonStartIconResourceId();
        Integer primaryButtonEndIconResourceId = this.$selectedPaymentMethod.getPrimaryButtonEndIconResourceId();
        int i6 = this.$$dirty;
        PrimaryButtonKt.PrimaryButton(str, primaryButtonState2, function0, primaryButtonStartIconResourceId, primaryButtonEndIconResourceId, interfaceC32720Et0, ((i6 >> 6) & 14) | ((i6 >> 6) & 112) | ((i6 >> 15) & 896), 0);
        String str2 = this.$secondaryButtonLabel;
        Function0<Unit> function02 = this.$onSecondaryButtonClick;
        int i7 = this.$$dirty;
        PrimaryButtonKt.SecondaryButton(!this.$primaryButtonState.isBlocking(), str2, function02, interfaceC32720Et0, ((i7 >> 18) & 896) | ((i7 >> 9) & 112));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
