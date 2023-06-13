package com.stripe.android.link.p042ui.cardedit;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.cardedit.CardEditScreenKt$DefaultPaymentMethodCheckbox$2 */
/* loaded from: classes7.dex */
public final class CardEditScreenKt$DefaultPaymentMethodCheckbox$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $isDefault;
    final /* synthetic */ boolean $isProcessing;
    final /* synthetic */ Function1<Boolean, Unit> $onSetAsDefaultClick;
    final /* synthetic */ boolean $setAsDefaultChecked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardEditScreenKt$DefaultPaymentMethodCheckbox$2(boolean z, boolean z2, boolean z3, Function1<? super Boolean, Unit> function1, int i) {
        super(2);
        this.$setAsDefaultChecked = z;
        this.$isDefault = z2;
        this.$isProcessing = z3;
        this.$onSetAsDefaultClick = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        CardEditScreenKt.DefaultPaymentMethodCheckbox(this.$setAsDefaultChecked, this.$isDefault, this.$isProcessing, this.$onSetAsDefaultClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
