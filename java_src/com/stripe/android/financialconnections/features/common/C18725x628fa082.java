package com.stripe.android.financialconnections.features.common;

import com.stripe.android.financialconnections.exception.AccountNoneEligibleForPaymentMethodError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.features.common.ErrorContentKt$NoSupportedPaymentMethodTypeAccountsErrorContent$1 */
/* loaded from: classes7.dex */
public final class C18725x628fa082 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AccountNoneEligibleForPaymentMethodError $exception;
    final /* synthetic */ Function0<Unit> $onEnterDetailsManually;
    final /* synthetic */ Function0<Unit> $onSelectAnotherBank;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18725x628fa082(AccountNoneEligibleForPaymentMethodError accountNoneEligibleForPaymentMethodError, Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$exception = accountNoneEligibleForPaymentMethodError;
        this.$onSelectAnotherBank = function0;
        this.$onEnterDetailsManually = function02;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ErrorContentKt.NoSupportedPaymentMethodTypeAccountsErrorContent(this.$exception, this.$onSelectAnotherBank, this.$onEnterDetailsManually, interfaceC32720Et0, this.$$changed | 1);
    }
}
