package com.stripe.android.paymentsheet;

import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C25777lo;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentMethodsUIKt$PaymentMethodsUI$2 extends Lambda implements Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ StripeImageLoader $imageLoader;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ Function1<LpmRepository.SupportedPaymentMethod, Unit> $onItemSelectedListener;
    final /* synthetic */ List<LpmRepository.SupportedPaymentMethod> $paymentMethods;
    final /* synthetic */ int $selectedIndex;
    final /* synthetic */ C32209Co2 $state;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPaymentMethodsUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsUI.kt\ncom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,274:1\n171#2,12:275\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsUI.kt\ncom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1\n*L\n90#1:275,12\n*E\n"})
    /* renamed from: com.stripe.android.paymentsheet.PaymentMethodsUIKt$PaymentMethodsUI$2$1 */
    /* loaded from: classes7.dex */
    public static final class C191411 extends Lambda implements Function1<InterfaceC52420yo2, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ StripeImageLoader $imageLoader;
        final /* synthetic */ boolean $isEnabled;
        final /* synthetic */ Function1<LpmRepository.SupportedPaymentMethod, Unit> $onItemSelectedListener;
        final /* synthetic */ List<LpmRepository.SupportedPaymentMethod> $paymentMethods;
        final /* synthetic */ int $selectedIndex;
        final /* synthetic */ float $viewWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C191411(List<LpmRepository.SupportedPaymentMethod> list, int i, float f, StripeImageLoader stripeImageLoader, boolean z, int i2, Function1<? super LpmRepository.SupportedPaymentMethod, Unit> function1) {
            super(1);
            this.$paymentMethods = list;
            this.$selectedIndex = i;
            this.$viewWidth = f;
            this.$imageLoader = stripeImageLoader;
            this.$isEnabled = z;
            this.$$dirty = i2;
            this.$onItemSelectedListener = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC52420yo2 interfaceC52420yo2) {
            invoke2(interfaceC52420yo2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC52420yo2 LazyRow) {
            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
            List<LpmRepository.SupportedPaymentMethod> list = this.$paymentMethods;
            LazyRow.mo409c(list.size(), null, new C19139xb6b21a1b(list), C43575jt0.m29790c(-1091073711, true, new C19140xb6b21a1c(list, this.$selectedIndex, this.$viewWidth, this.$imageLoader, this.$isEnabled, this.$$dirty, this.$onItemSelectedListener, list)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodsUIKt$PaymentMethodsUI$2(List<LpmRepository.SupportedPaymentMethod> list, C32209Co2 c32209Co2, boolean z, int i, int i2, StripeImageLoader stripeImageLoader, Function1<? super LpmRepository.SupportedPaymentMethod, Unit> function1) {
        super(3);
        this.$paymentMethods = list;
        this.$state = c32209Co2;
        this.$isEnabled = z;
        this.$$dirty = i;
        this.$selectedIndex = i2;
        this.$imageLoader = stripeImageLoader;
        this.$onItemSelectedListener = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC41875h10 interfaceC41875h10, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC41875h10, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC41875h10 BoxWithConstraints, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        float m116597rememberViewWidthkHDZbjc;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 14) == 0) {
            i2 = (interfaceC32720Et0.mo89539n(BoxWithConstraints) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(657223763, i, -1, "com.stripe.android.paymentsheet.PaymentMethodsUI.<anonymous> (PaymentMethodsUI.kt:76)");
        }
        m116597rememberViewWidthkHDZbjc = PaymentMethodsUIKt.m116597rememberViewWidthkHDZbjc(BoxWithConstraints.mo35390a(), this.$paymentMethods.size(), interfaceC32720Et0, 0);
        Spacing spacing = Spacing.INSTANCE;
        PD3 m94190c = ND3.m94190c(spacing.m116604getCarouselOuterPaddingD9Ej5fM(), 0.0f, 2, null);
        C25777lo.InterfaceC25782e m26795n = C25777lo.f96729a.m26795n(spacing.m116603getCarouselInnerPaddingD9Ej5fM());
        InterfaceC41563gV2 m22000a = C46022o06.m22000a(InterfaceC41563gV2.f82354b0, PaymentMethodsUIKt.TEST_TAG_LIST);
        C32209Co2 c32209Co2 = this.$state;
        boolean z = this.$isEnabled;
        C191411 c191411 = new C191411(this.$paymentMethods, this.$selectedIndex, m116597rememberViewWidthkHDZbjc, this.$imageLoader, z, this.$$dirty, this.$onItemSelectedListener);
        int i3 = this.$$dirty;
        C41738gn2.m37480b(m22000a, c32209Co2, m94190c, false, m26795n, null, null, z, c191411, interfaceC32720Et0, ((i3 >> 15) & 112) | 24966 | ((i3 << 15) & 29360128), 104);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
