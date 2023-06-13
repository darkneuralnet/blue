package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.model.PartnerAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccountPickerScreenKt$AccountItem$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AccountPickerState.PartnerAccountUI $accountUI;
    final /* synthetic */ Function1<PartnerAccount, Unit> $onAccountClicked;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> $selectorContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountPickerScreenKt$AccountItem$3(boolean z, Function1<? super PartnerAccount, Unit> function1, AccountPickerState.PartnerAccountUI partnerAccountUI, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i) {
        super(2);
        this.$selected = z;
        this.$onAccountClicked = function1;
        this.$accountUI = partnerAccountUI;
        this.$selectorContent = function3;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        AccountPickerScreenKt.AccountItem(this.$selected, this.$onAccountClicked, this.$accountUI, this.$selectorContent, interfaceC32720Et0, this.$$changed | 1);
    }
}
