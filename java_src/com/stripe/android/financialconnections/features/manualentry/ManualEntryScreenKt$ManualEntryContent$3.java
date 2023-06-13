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
public final class ManualEntryScreenKt$ManualEntryContent$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ Pair<String, Integer> $account;
    final /* synthetic */ Pair<String, Integer> $accountConfirm;
    final /* synthetic */ boolean $isValidForm;
    final /* synthetic */ AbstractC19862dp<LinkAccountSessionPaymentAccount> $linkPaymentAccountStatus;
    final /* synthetic */ Function1<String, Unit> $onAccountConfirmEntered;
    final /* synthetic */ Function1<String, Unit> $onAccountEntered;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function1<String, Unit> $onRoutingEntered;
    final /* synthetic */ Function0<Unit> $onSubmit;
    final /* synthetic */ AbstractC19862dp<ManualEntryState.Payload> $payload;
    final /* synthetic */ Pair<String, Integer> $routing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ManualEntryScreenKt$ManualEntryContent$3(Pair<String, Integer> pair, Pair<String, Integer> pair2, Pair<String, Integer> pair3, boolean z, AbstractC19862dp<ManualEntryState.Payload> abstractC19862dp, AbstractC19862dp<LinkAccountSessionPaymentAccount> abstractC19862dp2, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function1<? super String, Unit> function13, Function0<Unit> function0, Function0<Unit> function02, int i, int i2) {
        super(2);
        this.$routing = pair;
        this.$account = pair2;
        this.$accountConfirm = pair3;
        this.$isValidForm = z;
        this.$payload = abstractC19862dp;
        this.$linkPaymentAccountStatus = abstractC19862dp2;
        this.$onRoutingEntered = function1;
        this.$onAccountEntered = function12;
        this.$onAccountConfirmEntered = function13;
        this.$onSubmit = function0;
        this.$onCloseClick = function02;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ManualEntryScreenKt.ManualEntryContent(this.$routing, this.$account, this.$accountConfirm, this.$isValidForm, this.$payload, this.$linkPaymentAccountStatus, this.$onRoutingEntered, this.$onAccountEntered, this.$onAccountConfirmEntered, this.$onSubmit, this.$onCloseClick, interfaceC32720Et0, this.$$changed | 1, this.$$changed1);
    }
}
