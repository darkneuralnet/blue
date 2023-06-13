package com.stripe.android.paymentsheet;

import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "LLn2;", "", "it", "", "invoke", "(LLn2;ILEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4\n+ 2 PaymentMethodsUI.kt\ncom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodsUI$2$1\n*L\n1#1,423:1\n91#2,23:424\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.PaymentMethodsUIKt$PaymentMethodsUI$2$1$invoke$$inlined$itemsIndexed$default$3 */
/* loaded from: classes7.dex */
public final class C19140xb6b21a1c extends Lambda implements Function4<InterfaceC34306Ln2, Integer, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ StripeImageLoader $imageLoader$inlined;
    final /* synthetic */ boolean $isEnabled$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ Function1 $onItemSelectedListener$inlined;
    final /* synthetic */ List $paymentMethods$inlined;
    final /* synthetic */ int $selectedIndex$inlined;
    final /* synthetic */ float $viewWidth$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19140xb6b21a1c(List list, int i, float f, StripeImageLoader stripeImageLoader, boolean z, int i2, Function1 function1, List list2) {
        super(4);
        this.$items = list;
        this.$selectedIndex$inlined = i;
        this.$viewWidth$inlined = f;
        this.$imageLoader$inlined = stripeImageLoader;
        this.$isEnabled$inlined = z;
        this.$$dirty$inlined = i2;
        this.$onItemSelectedListener$inlined = function1;
        this.$paymentMethods$inlined = list2;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC34306Ln2 interfaceC34306Ln2, Integer num, InterfaceC32720Et0 interfaceC32720Et0, Integer num2) {
        invoke(interfaceC34306Ln2, num.intValue(), interfaceC32720Et0, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC34306Ln2 items, int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        int i3;
        int i4;
        String lightThemeIconUrl;
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
            C35528Qt0.m87816Z(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
        }
        int i5 = (i3 & 112) | (i3 & 14);
        LpmRepository.SupportedPaymentMethod supportedPaymentMethod = (LpmRepository.SupportedPaymentMethod) this.$items.get(i);
        interfaceC32720Et0.mo89638F(958117022);
        if ((i5 & 112) == 0) {
            i4 = (interfaceC32720Et0.mo89527r(i) ? 32 : 16) | i5;
        } else {
            i4 = i5;
        }
        if ((i5 & 896) == 0) {
            i4 |= interfaceC32720Et0.mo89539n(supportedPaymentMethod) ? 256 : 128;
        }
        if ((i4 & 5841) == 1168 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
        } else {
            if (C51020wS0.m6823a(interfaceC32720Et0, 0) && supportedPaymentMethod.getDarkThemeIconUrl() != null) {
                lightThemeIconUrl = supportedPaymentMethod.getDarkThemeIconUrl();
            } else {
                lightThemeIconUrl = supportedPaymentMethod.getLightThemeIconUrl();
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            String m41310c = C40946fS5.m41310c(supportedPaymentMethod.getDisplayNameResource(), interfaceC32720Et0, 0);
            InterfaceC41563gV2 m22000a = C46022o06.m22000a(c20912a, PaymentMethodsUIKt.TEST_TAG_LIST + m41310c);
            int iconResource = supportedPaymentMethod.getIconResource();
            String m41310c2 = C40946fS5.m41310c(supportedPaymentMethod.getDisplayNameResource(), interfaceC32720Et0, 0);
            boolean z = i == this.$selectedIndex$inlined;
            boolean tintIconOnSelection = supportedPaymentMethod.getTintIconOnSelection();
            float f = this.$viewWidth$inlined;
            StripeImageLoader stripeImageLoader = this.$imageLoader$inlined;
            boolean z2 = this.$isEnabled$inlined;
            PaymentMethodsUIKt$PaymentMethodsUI$2$1$1$1 paymentMethodsUIKt$PaymentMethodsUI$2$1$1$1 = new PaymentMethodsUIKt$PaymentMethodsUI$2$1$1$1(this.$onItemSelectedListener$inlined, this.$paymentMethods$inlined);
            int i6 = this.$$dirty$inlined;
            PaymentMethodsUIKt.m116592PaymentMethodUIjFuDa88(f, iconResource, lightThemeIconUrl, stripeImageLoader, m41310c2, z, z2, tintIconOnSelection, i, m22000a, paymentMethodsUIKt$PaymentMethodsUI$2$1$1$1, interfaceC32720Et0, ((i6 >> 3) & 7168) | (StripeImageLoader.$stable << 9) | ((i6 << 12) & 3670016) | ((i4 << 21) & 234881024), 0, 0);
        }
        interfaceC32720Et0.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
