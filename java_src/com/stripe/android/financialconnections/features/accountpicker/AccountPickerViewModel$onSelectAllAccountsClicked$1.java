package com.stripe.android.financialconnections.features.accountpicker;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", TransferTable.COLUMN_STATE, "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccountPickerViewModel$onSelectAllAccountsClicked$1 extends Lambda implements Function1<AccountPickerState, Unit> {
    final /* synthetic */ AccountPickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPickerViewModel$onSelectAllAccountsClicked$1(AccountPickerViewModel accountPickerViewModel) {
        super(1);
        this.this$0 = accountPickerViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AccountPickerState accountPickerState) {
        invoke2(accountPickerState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AccountPickerState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        AccountPickerState.Payload mo6788a = state.getPayload().mo6788a();
        if (mo6788a != null) {
            AccountPickerViewModel accountPickerViewModel = this.this$0;
            if (state.getAllAccountsSelected()) {
                accountPickerViewModel.setState(AccountPickerViewModel$onSelectAllAccountsClicked$1$1$1.INSTANCE);
            } else {
                accountPickerViewModel.setState(new AccountPickerViewModel$onSelectAllAccountsClicked$1$1$2(mo6788a));
            }
        }
    }
}