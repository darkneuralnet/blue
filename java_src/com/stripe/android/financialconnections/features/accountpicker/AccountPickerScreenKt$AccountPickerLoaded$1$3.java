package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.C18634R;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccountPickerScreenKt$AccountPickerLoaded$1$3 extends Lambda implements Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ boolean $requiresSingleAccountConfirmation;
    final /* synthetic */ Set<String> $selectedIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPickerScreenKt$AccountPickerLoaded$1$3(boolean z, Set<String> set) {
        super(3);
        this.$requiresSingleAccountConfirmation = z;
        this.$selectedIds = set;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC37486Zc5, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC37486Zc5 FinancialConnectionsButton, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        String m41312a;
        Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1843467949, i, -1, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerLoaded.<anonymous>.<anonymous> (AccountPickerScreen.kt:247)");
        }
        boolean z = this.$requiresSingleAccountConfirmation;
        if (z) {
            m41312a = C40946fS5.m41310c(C18634R.string.stripe_account_picker_cta_confirm, interfaceC32720Et0, 0);
        } else if (!z) {
            m41312a = C40946fS5.m41312a(C18634R.plurals.stripe_account_picker_cta_link, this.$selectedIds.size(), interfaceC32720Et0, 0);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C38909c26.m62000e(m41312a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et0, 0, 0, 65534);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
