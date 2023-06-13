package com.stripe.android.paymentsheet.addresselement;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AddressElementPrimaryButtonKt$AddressElementPrimaryButton$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ Function0<Unit> $onButtonClick;
    final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressElementPrimaryButtonKt$AddressElementPrimaryButton$2(boolean z, String str, Function0<Unit> function0, int i) {
        super(2);
        this.$isEnabled = z;
        this.$text = str;
        this.$onButtonClick = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        AddressElementPrimaryButtonKt.AddressElementPrimaryButton(this.$isEnabled, this.$text, this.$onButtonClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
