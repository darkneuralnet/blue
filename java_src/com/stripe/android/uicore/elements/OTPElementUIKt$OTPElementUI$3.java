package com.stripe.android.uicore.elements;

import androidx.compose.p003ui.focus.C11309h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class OTPElementUIKt$OTPElementUI$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ OTPElementColors $colors;
    final /* synthetic */ OTPElement $element;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C11309h $focusRequester;
    final /* synthetic */ InterfaceC41563gV2 $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPElementUIKt$OTPElementUI$3(boolean z, OTPElement oTPElement, InterfaceC41563gV2 interfaceC41563gV2, OTPElementColors oTPElementColors, C11309h c11309h, int i, int i2) {
        super(2);
        this.$enabled = z;
        this.$element = oTPElement;
        this.$modifier = interfaceC41563gV2;
        this.$colors = oTPElementColors;
        this.$focusRequester = c11309h;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        OTPElementUIKt.OTPElementUI(this.$enabled, this.$element, this.$modifier, this.$colors, this.$focusRequester, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
