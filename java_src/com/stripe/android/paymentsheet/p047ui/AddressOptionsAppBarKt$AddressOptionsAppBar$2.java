package com.stripe.android.paymentsheet.p047ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.AddressOptionsAppBarKt$AddressOptionsAppBar$2 */
/* loaded from: classes7.dex */
public final class AddressOptionsAppBarKt$AddressOptionsAppBar$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $isRootScreen;
    final /* synthetic */ Function0<Unit> $onButtonClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressOptionsAppBarKt$AddressOptionsAppBar$2(boolean z, Function0<Unit> function0, int i) {
        super(2);
        this.$isRootScreen = z;
        this.$onButtonClick = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        AddressOptionsAppBarKt.AddressOptionsAppBar(this.$isRootScreen, this.$onButtonClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
