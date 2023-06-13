package com.stripe.android.financialconnections.features.manualentry;

import com.stripe.android.financialconnections.features.manualentry.ManualEntryState;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ManualEntryScreenKt$ManualEntryLoaded$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ Pair<String, Integer> $account;
    final /* synthetic */ Pair<String, Integer> $accountConfirm;
    final /* synthetic */ boolean $isValidForm;
    final /* synthetic */ AbstractC19862dp<LinkAccountSessionPaymentAccount> $linkPaymentAccountStatus;
    final /* synthetic */ Function1<String, Unit> $onAccountConfirmEntered;
    final /* synthetic */ Function1<String, Unit> $onAccountEntered;
    final /* synthetic */ Function1<String, Unit> $onRoutingEntered;
    final /* synthetic */ Function0<Unit> $onSubmit;
    final /* synthetic */ ManualEntryState.Payload $payload;
    final /* synthetic */ Pair<String, Integer> $routing;
    final /* synthetic */ C37135Xp5 $scrollState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ManualEntryScreenKt$ManualEntryLoaded$2(C37135Xp5 c37135Xp5, ManualEntryState.Payload payload, AbstractC19862dp<LinkAccountSessionPaymentAccount> abstractC19862dp, Pair<String, Integer> pair, Function1<? super String, Unit> function1, Pair<String, Integer> pair2, Function1<? super String, Unit> function12, Pair<String, Integer> pair3, Function1<? super String, Unit> function13, boolean z, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.$scrollState = c37135Xp5;
        this.$payload = payload;
        this.$linkPaymentAccountStatus = abstractC19862dp;
        this.$routing = pair;
        this.$onRoutingEntered = function1;
        this.$account = pair2;
        this.$onAccountEntered = function12;
        this.$accountConfirm = pair3;
        this.$onAccountConfirmEntered = function13;
        this.$isValidForm = z;
        this.$onSubmit = function0;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ManualEntryScreenKt.ManualEntryLoaded(this.$scrollState, this.$payload, this.$linkPaymentAccountStatus, this.$routing, this.$onRoutingEntered, this.$account, this.$onAccountEntered, this.$accountConfirm, this.$onAccountConfirmEntered, this.$isValidForm, this.$onSubmit, interfaceC32720Et0, this.$$changed | 1, this.$$changed1);
    }
}
