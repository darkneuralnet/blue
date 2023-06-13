package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.model.PartnerAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class AccountPickerScreenKt$AccountPickerScreen$2 extends FunctionReferenceImpl implements Function1<PartnerAccount, Unit> {
    public AccountPickerScreenKt$AccountPickerScreen$2(Object obj) {
        super(1, obj, AccountPickerViewModel.class, "onAccountClicked", "onAccountClicked(Lcom/stripe/android/financialconnections/model/PartnerAccount;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PartnerAccount partnerAccount) {
        invoke2(partnerAccount);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PartnerAccount p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AccountPickerViewModel) this.receiver).onAccountClicked(p0);
    }
}
