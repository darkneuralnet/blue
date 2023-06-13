package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.model.PartnerAccountsList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", "Ldp;", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "it", "invoke", "(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Ldp;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class AccountPickerViewModel$submitAccounts$2 extends Lambda implements Function2<AccountPickerState, AbstractC19862dp<? extends PartnerAccountsList>, AccountPickerState> {
    public static final AccountPickerViewModel$submitAccounts$2 INSTANCE = new AccountPickerViewModel$submitAccounts$2();

    public AccountPickerViewModel$submitAccounts$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ AccountPickerState invoke(AccountPickerState accountPickerState, AbstractC19862dp<? extends PartnerAccountsList> abstractC19862dp) {
        return invoke2(accountPickerState, (AbstractC19862dp<PartnerAccountsList>) abstractC19862dp);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final AccountPickerState invoke2(AccountPickerState execute, AbstractC19862dp<PartnerAccountsList> it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return AccountPickerState.copy$default(execute, null, false, it, null, 11, null);
    }
}
