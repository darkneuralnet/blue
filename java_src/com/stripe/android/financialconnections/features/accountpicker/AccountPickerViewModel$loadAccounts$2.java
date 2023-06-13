package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", "Ldp;", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;", "it", "invoke", "(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Ldp;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class AccountPickerViewModel$loadAccounts$2 extends Lambda implements Function2<AccountPickerState, AbstractC19862dp<? extends AccountPickerState.Payload>, AccountPickerState> {
    public static final AccountPickerViewModel$loadAccounts$2 INSTANCE = new AccountPickerViewModel$loadAccounts$2();

    public AccountPickerViewModel$loadAccounts$2() {
        super(2);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final AccountPickerState invoke2(AccountPickerState execute, AbstractC19862dp<AccountPickerState.Payload> it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return AccountPickerState.copy$default(execute, it, false, null, null, 14, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ AccountPickerState invoke(AccountPickerState accountPickerState, AbstractC19862dp<? extends AccountPickerState.Payload> abstractC19862dp) {
        return invoke2(accountPickerState, (AbstractC19862dp<AccountPickerState.Payload>) abstractC19862dp);
    }
}
