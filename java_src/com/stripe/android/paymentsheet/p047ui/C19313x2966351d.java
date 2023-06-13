package com.stripe.android.paymentsheet.p047ui;

import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.paymentsheet.PaymentOptionsItem;
import com.stripe.android.paymentsheet.PaymentOptionsState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "LLn2;", "", "it", "", "invoke", "(LLn2;ILEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 PaymentOptionsUI.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1\n*L\n1#1,423:1\n73#2,2:424\n85#2:426\n77#2,8:427\n76#2,12:435\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4 */
/* loaded from: classes7.dex */
public final class C19313x2966351d extends Lambda implements Function4<InterfaceC34306Ln2, Integer, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ boolean $isEditing$inlined;
    final /* synthetic */ boolean $isProcessing$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ Function0 $onAddCardPressed$inlined;
    final /* synthetic */ Function1 $onItemRemoved$inlined;
    final /* synthetic */ Function1 $onItemSelected$inlined;
    final /* synthetic */ PaymentOptionsState $state$inlined;
    final /* synthetic */ float $width$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19313x2966351d(List list, boolean z, boolean z2, PaymentOptionsState paymentOptionsState, float f, Function0 function0, Function1 function1, Function1 function12, int i) {
        super(4);
        this.$items = list;
        this.$isProcessing$inlined = z;
        this.$isEditing$inlined = z2;
        this.$state$inlined = paymentOptionsState;
        this.$width$inlined = f;
        this.$onAddCardPressed$inlined = function0;
        this.$onItemSelected$inlined = function1;
        this.$onItemRemoved$inlined = function12;
        this.$$dirty$inlined = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC34306Ln2 interfaceC34306Ln2, Integer num, InterfaceC32720Et0 interfaceC32720Et0, Integer num2) {
        invoke(interfaceC34306Ln2, num.intValue(), interfaceC32720Et0, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC34306Ln2 items, int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
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
            C35528Qt0.m87816Z(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
        }
        int i4 = i3 & 14;
        PaymentOptionsItem paymentOptionsItem = (PaymentOptionsItem) this.$items.get(i);
        interfaceC32720Et0.mo89638F(-1137186248);
        if ((i4 & 112) == 0) {
            i4 |= interfaceC32720Et0.mo89539n(paymentOptionsItem) ? 32 : 16;
        }
        if ((i4 & 721) == 144 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
        } else {
            boolean z = false;
            boolean z2 = !this.$isProcessing$inlined && (!this.$isEditing$inlined || paymentOptionsItem.isEnabledDuringEditing());
            if (Intrinsics.areEqual(paymentOptionsItem, this.$state$inlined.getSelectedItem()) && !this.$isEditing$inlined) {
                z = true;
            }
            InterfaceC41563gV2 m22000a = C46022o06.m22000a(InterfaceC41563gV2.f82354b0, paymentOptionsItem.getViewType().name());
            float f = this.$width$inlined;
            boolean z3 = this.$isEditing$inlined;
            Function0 function0 = this.$onAddCardPressed$inlined;
            Function1 function1 = this.$onItemSelected$inlined;
            Function1 function12 = this.$onItemRemoved$inlined;
            int i5 = this.$$dirty$inlined;
            PaymentOptionsUIKt.m116643PaymentOptioniWtaglI(paymentOptionsItem, f, z2, z3, z, function0, function1, function12, m22000a, interfaceC32720Et0, ((i5 << 6) & 29360128) | ((i4 >> 3) & 14) | ((i5 << 6) & 7168) | ((i5 << 6) & ImageMetadata.JPEG_GPS_COORDINATES) | ((i5 << 6) & 3670016), 0);
        }
        interfaceC32720Et0.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
