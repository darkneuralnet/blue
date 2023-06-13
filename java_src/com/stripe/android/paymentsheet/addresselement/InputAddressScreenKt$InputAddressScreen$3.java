package com.stripe.android.paymentsheet.addresselement;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InputAddressScreenKt$InputAddressScreen$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> $checkboxContent;
    final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> $formContent;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function0<Unit> $onPrimaryButtonClick;
    final /* synthetic */ boolean $primaryButtonEnabled;
    final /* synthetic */ String $primaryButtonText;
    final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputAddressScreenKt$InputAddressScreen$3(boolean z, String str, String str2, Function0<Unit> function0, Function0<Unit> function02, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function32, int i) {
        super(2);
        this.$primaryButtonEnabled = z;
        this.$primaryButtonText = str;
        this.$title = str2;
        this.$onPrimaryButtonClick = function0;
        this.$onCloseClick = function02;
        this.$formContent = function3;
        this.$checkboxContent = function32;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InputAddressScreenKt.InputAddressScreen(this.$primaryButtonEnabled, this.$primaryButtonText, this.$title, this.$onPrimaryButtonClick, this.$onCloseClick, this.$formContent, this.$checkboxContent, interfaceC32720Et0, this.$$changed | 1);
    }
}
