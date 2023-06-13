package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.model.PartnerAccount;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccountPickerViewModel$onAccountClicked$1$1$1 extends Lambda implements Function1<AccountPickerState, AccountPickerState> {
    final /* synthetic */ PartnerAccount $account;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPickerViewModel$onAccountClicked$1$1$1(PartnerAccount partnerAccount) {
        super(1);
        this.$account = partnerAccount;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AccountPickerState invoke(AccountPickerState setState) {
        Set of;
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        of = SetsKt__SetsJVMKt.setOf(this.$account.getId());
        return AccountPickerState.copy$default(setState, null, false, null, of, 7, null);
    }
}
