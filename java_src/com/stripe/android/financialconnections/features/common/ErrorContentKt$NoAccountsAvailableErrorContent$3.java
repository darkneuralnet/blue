package com.stripe.android.financialconnections.features.common;

import com.stripe.android.financialconnections.exception.AccountLoadError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ErrorContentKt$NoAccountsAvailableErrorContent$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AccountLoadError $exception;
    final /* synthetic */ Function0<Unit> $onEnterDetailsManually;
    final /* synthetic */ Function0<Unit> $onSelectAnotherBank;
    final /* synthetic */ Function0<Unit> $onTryAgain;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorContentKt$NoAccountsAvailableErrorContent$3(AccountLoadError accountLoadError, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
        super(2);
        this.$exception = accountLoadError;
        this.$onSelectAnotherBank = function0;
        this.$onEnterDetailsManually = function02;
        this.$onTryAgain = function03;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ErrorContentKt.NoAccountsAvailableErrorContent(this.$exception, this.$onSelectAnotherBank, this.$onEnterDetailsManually, this.$onTryAgain, interfaceC32720Et0, this.$$changed | 1);
    }
}
