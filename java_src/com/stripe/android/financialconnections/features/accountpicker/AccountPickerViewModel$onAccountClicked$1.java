package com.stripe.android.financialconnections.features.accountpicker;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.model.PartnerAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", TransferTable.COLUMN_STATE, "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccountPickerViewModel$onAccountClicked$1 extends Lambda implements Function1<AccountPickerState, Unit> {
    final /* synthetic */ PartnerAccount $account;
    final /* synthetic */ AccountPickerViewModel this$0;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountPickerState.SelectionMode.values().length];
            try {
                iArr[AccountPickerState.SelectionMode.RADIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountPickerState.SelectionMode.CHECKBOXES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPickerViewModel$onAccountClicked$1(AccountPickerViewModel accountPickerViewModel, PartnerAccount partnerAccount) {
        super(1);
        this.this$0 = accountPickerViewModel;
        this.$account = partnerAccount;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AccountPickerState accountPickerState) {
        invoke2(accountPickerState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AccountPickerState state) {
        Unit unit;
        Logger logger;
        Intrinsics.checkNotNullParameter(state, "state");
        AccountPickerState.Payload mo6788a = state.getPayload().mo6788a();
        if (mo6788a != null) {
            AccountPickerViewModel accountPickerViewModel = this.this$0;
            PartnerAccount partnerAccount = this.$account;
            int i = WhenMappings.$EnumSwitchMapping$0[mo6788a.getSelectionMode().ordinal()];
            if (i == 1) {
                accountPickerViewModel.setState(new AccountPickerViewModel$onAccountClicked$1$1$1(partnerAccount));
            } else if (i == 2) {
                if (state.getSelectedIds().contains(partnerAccount.getId())) {
                    accountPickerViewModel.setState(new AccountPickerViewModel$onAccountClicked$1$1$2(partnerAccount));
                } else {
                    accountPickerViewModel.setState(new AccountPickerViewModel$onAccountClicked$1$1$3(partnerAccount));
                }
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            logger = this.this$0.logger;
            Logger.DefaultImpls.error$default(logger, "account clicked without available payload.", null, 2, null);
        }
    }
}
