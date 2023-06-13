package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccountPickerScreenKt$SingleSelectContent$1$2$1 extends Lambda implements Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ AccountPickerState.PartnerAccountUI $account;
    final /* synthetic */ Set<String> $selectedIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPickerScreenKt$SingleSelectContent$1$2$1(Set<String> set, AccountPickerState.PartnerAccountUI partnerAccountUI) {
        super(3);
        this.$selectedIds = set;
        this.$account = partnerAccountUI;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC37486Zc5, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC37486Zc5 AccountItem, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(AccountItem, "$this$AccountItem");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-488657573, i, -1, "com.stripe.android.financialconnections.features.accountpicker.SingleSelectContent.<anonymous>.<anonymous>.<anonymous> (AccountPickerScreen.kt:276)");
        }
        AccountPickerScreenKt.FinancialConnectionRadioButton(this.$selectedIds.contains(this.$account.getAccount().getId()), interfaceC32720Et0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
