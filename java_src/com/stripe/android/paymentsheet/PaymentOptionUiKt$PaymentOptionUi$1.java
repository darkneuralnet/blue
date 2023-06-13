package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentOptionUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionUi.kt\ncom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,258:1\n36#2:259\n1057#3,6:260\n154#4:266\n154#4:267\n*S KotlinDebug\n*F\n+ 1 PaymentOptionUi.kt\ncom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$1\n*L\n76#1:259\n76#1:260,6\n77#1:266\n83#1:267\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentOptionUiKt$PaymentOptionUi$1 extends Lambda implements Function3<InterfaceC40096e10, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ boolean $isEditing;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ String $onRemoveAccessibilityDescription;
    final /* synthetic */ EX2<Boolean> $openRemoveDialog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionUiKt$PaymentOptionUi$1(boolean z, String str, EX2<Boolean> ex2, int i, boolean z2) {
        super(3);
        this.$isEditing = z;
        this.$onRemoveAccessibilityDescription = str;
        this.$openRemoveDialog = ex2;
        this.$$dirty1 = i;
        this.$isSelected = z2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC40096e10 interfaceC40096e10, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC40096e10, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r8v0, types: [Et0] */
    public final void invoke(InterfaceC40096e10 BadgedBox, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-408712072, i, -1, "com.stripe.android.paymentsheet.PaymentOptionUi.<anonymous> (PaymentOptionUi.kt:71)");
        }
        interfaceC32720Et0.mo89638F(1719976533);
        if (this.$isEditing) {
            String str = this.$onRemoveAccessibilityDescription;
            EX2<Boolean> ex2 = this.$openRemoveDialog;
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n = interfaceC32720Et0.mo89539n(ex2);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new PaymentOptionUiKt$PaymentOptionUi$1$1$1(ex2);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            PaymentOptionUiKt.RemoveBadge(str, mo89635G, C32822Fe3.m106816b(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(-14), C43705k61.m29303g(1)), interfaceC32720Et0, ((this.$$dirty1 >> 6) & 14) | 384, 0);
        }
        interfaceC32720Et0.mo89605Q();
        if (this.$isSelected) {
            PaymentOptionUiKt.SelectedBadge(C32822Fe3.m106816b(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(-18), C43705k61.m29303g(58)), interfaceC32720Et0, 6, 0);
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
