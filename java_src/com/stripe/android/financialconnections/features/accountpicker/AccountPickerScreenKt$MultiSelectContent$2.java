package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.model.PartnerAccount;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccountPickerScreenKt$MultiSelectContent$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ List<AccountPickerState.PartnerAccountUI> $accounts;
    final /* synthetic */ boolean $allAccountsSelected;
    final /* synthetic */ Function1<PartnerAccount, Unit> $onAccountClicked;
    final /* synthetic */ Function0<Unit> $onSelectAllAccountsClicked;
    final /* synthetic */ Set<String> $selectedIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountPickerScreenKt$MultiSelectContent$2(List<AccountPickerState.PartnerAccountUI> list, Set<String> set, Function1<? super PartnerAccount, Unit> function1, Function0<Unit> function0, boolean z, int i) {
        super(2);
        this.$accounts = list;
        this.$selectedIds = set;
        this.$onAccountClicked = function1;
        this.$onSelectAllAccountsClicked = function0;
        this.$allAccountsSelected = z;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        AccountPickerScreenKt.MultiSelectContent(this.$accounts, this.$selectedIds, this.$onAccountClicked, this.$onSelectAllAccountsClicked, this.$allAccountsSelected, interfaceC32720Et0, this.$$changed | 1);
    }
}
