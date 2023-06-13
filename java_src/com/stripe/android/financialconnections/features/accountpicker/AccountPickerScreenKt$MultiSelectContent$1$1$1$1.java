package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.model.PartnerAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AccountPickerScreenKt$MultiSelectContent$1$1$1$1 extends Lambda implements Function1<PartnerAccount, Unit> {
    final /* synthetic */ Function0<Unit> $onSelectAllAccountsClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPickerScreenKt$MultiSelectContent$1$1$1$1(Function0<Unit> function0) {
        super(1);
        this.$onSelectAllAccountsClicked = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PartnerAccount partnerAccount) {
        invoke2(partnerAccount);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PartnerAccount it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$onSelectAllAccountsClicked.invoke();
    }
}
