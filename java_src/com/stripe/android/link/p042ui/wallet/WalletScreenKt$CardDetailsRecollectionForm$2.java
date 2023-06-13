package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.p049ui.core.elements.CvcController;
import com.stripe.android.uicore.elements.TextFieldController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$CardDetailsRecollectionForm$2 */
/* loaded from: classes7.dex */
public final class WalletScreenKt$CardDetailsRecollectionForm$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ CvcController $cvcController;
    final /* synthetic */ TextFieldController $expiryDateController;
    final /* synthetic */ boolean $isCardExpired;
    final /* synthetic */ InterfaceC41563gV2 $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletScreenKt$CardDetailsRecollectionForm$2(TextFieldController textFieldController, CvcController cvcController, boolean z, InterfaceC41563gV2 interfaceC41563gV2, int i, int i2) {
        super(2);
        this.$expiryDateController = textFieldController;
        this.$cvcController = cvcController;
        this.$isCardExpired = z;
        this.$modifier = interfaceC41563gV2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        WalletScreenKt.CardDetailsRecollectionForm(this.$expiryDateController, this.$cvcController, this.$isCardExpired, this.$modifier, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
