package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentOptionsItem;
import com.stripe.android.paymentsheet.PaymentOptionsState;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentOptionsUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionsUI.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,269:1\n154#2:270\n*S KotlinDebug\n*F\n+ 1 PaymentOptionsUI.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5\n*L\n70#1:270\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentOptionsUIKt$PaymentOptions$5 */
/* loaded from: classes7.dex */
public final class PaymentOptionsUIKt$PaymentOptions$5 extends Lambda implements Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $isEditing;
    final /* synthetic */ boolean $isProcessing;
    final /* synthetic */ Function0<Unit> $onAddCardPressed;
    final /* synthetic */ Function1<PaymentMethod, Unit> $onItemRemoved;
    final /* synthetic */ Function1<PaymentSelection, Unit> $onItemSelected;
    final /* synthetic */ C32209Co2 $scrollState;
    final /* synthetic */ PaymentOptionsState $state;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPaymentOptionsUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionsUI.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,269:1\n136#2,12:270\n*S KotlinDebug\n*F\n+ 1 PaymentOptionsUI.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1\n*L\n72#1:270,12\n*E\n"})
    /* renamed from: com.stripe.android.paymentsheet.ui.PaymentOptionsUIKt$PaymentOptions$5$1 */
    /* loaded from: classes7.dex */
    public static final class C193141 extends Lambda implements Function1<InterfaceC52420yo2, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ boolean $isEditing;
        final /* synthetic */ boolean $isProcessing;
        final /* synthetic */ Function0<Unit> $onAddCardPressed;
        final /* synthetic */ Function1<PaymentMethod, Unit> $onItemRemoved;
        final /* synthetic */ Function1<PaymentSelection, Unit> $onItemSelected;
        final /* synthetic */ PaymentOptionsState $state;
        final /* synthetic */ float $width;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C193141(PaymentOptionsState paymentOptionsState, boolean z, boolean z2, float f, Function0<Unit> function0, Function1<? super PaymentSelection, Unit> function1, Function1<? super PaymentMethod, Unit> function12, int i) {
            super(1);
            this.$state = paymentOptionsState;
            this.$isProcessing = z;
            this.$isEditing = z2;
            this.$width = f;
            this.$onAddCardPressed = function0;
            this.$onItemSelected = function1;
            this.$onItemRemoved = function12;
            this.$$dirty = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC52420yo2 interfaceC52420yo2) {
            invoke2(interfaceC52420yo2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC52420yo2 LazyRow) {
            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
            List<PaymentOptionsItem> items = this.$state.getItems();
            boolean z = this.$isProcessing;
            boolean z2 = this.$isEditing;
            PaymentOptionsState paymentOptionsState = this.$state;
            float f = this.$width;
            Function0<Unit> function0 = this.$onAddCardPressed;
            Function1<PaymentSelection, Unit> function1 = this.$onItemSelected;
            Function1<PaymentMethod, Unit> function12 = this.$onItemRemoved;
            int i = this.$$dirty;
            LazyRow.mo409c(items.size(), null, new C19312x2966351c(C19310x2966351a.INSTANCE, items), C43575jt0.m29790c(-632812321, true, new C19313x2966351d(items, z, z2, paymentOptionsState, f, function0, function1, function12, i)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentOptionsUIKt$PaymentOptions$5(boolean z, C32209Co2 c32209Co2, int i, PaymentOptionsState paymentOptionsState, boolean z2, Function0<Unit> function0, Function1<? super PaymentSelection, Unit> function1, Function1<? super PaymentMethod, Unit> function12) {
        super(3);
        this.$isProcessing = z;
        this.$scrollState = c32209Co2;
        this.$$dirty = i;
        this.$state = paymentOptionsState;
        this.$isEditing = z2;
        this.$onAddCardPressed = function0;
        this.$onItemSelected = function1;
        this.$onItemRemoved = function12;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC41875h10 interfaceC41875h10, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC41875h10, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC41875h10 BoxWithConstraints, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
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
            C35528Qt0.m87816Z(576170585, i, -1, "com.stripe.android.paymentsheet.ui.PaymentOptions.<anonymous> (PaymentOptionsUI.kt:63)");
        }
        float m116650rememberItemWidth8Feqmps = PaymentOptionsUIKt.m116650rememberItemWidth8Feqmps(BoxWithConstraints.mo35390a(), interfaceC32720Et0, 0);
        C41738gn2.m37480b(null, this.$scrollState, ND3.m94190c(C43705k61.m29303g(17), 0.0f, 2, null), false, null, null, null, !this.$isProcessing, new C193141(this.$state, this.$isProcessing, this.$isEditing, m116650rememberItemWidth8Feqmps, this.$onAddCardPressed, this.$onItemSelected, this.$onItemRemoved, this.$$dirty), interfaceC32720Et0, ((this.$$dirty >> 18) & 112) | 384, 121);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
