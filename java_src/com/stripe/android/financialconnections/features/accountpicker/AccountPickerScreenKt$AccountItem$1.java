package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.model.PartnerAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccountPickerScreenKt$AccountItem$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ PartnerAccount $account;
    final /* synthetic */ Function1<PartnerAccount, Unit> $onAccountClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountPickerScreenKt$AccountItem$1(Function1<? super PartnerAccount, Unit> function1, PartnerAccount partnerAccount) {
        super(0);
        this.$onAccountClicked = function1;
        this.$account = partnerAccount;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onAccountClicked.invoke(this.$account);
    }
}
