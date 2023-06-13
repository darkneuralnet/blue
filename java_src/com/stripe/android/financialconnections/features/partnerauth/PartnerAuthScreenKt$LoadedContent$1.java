package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PartnerAuthScreenKt$LoadedContent$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AbstractC19862dp<String> $authenticationStatus;
    final /* synthetic */ Function1<String, Unit> $onClickableTextClick;
    final /* synthetic */ Function0<Unit> $onContinueClick;
    final /* synthetic */ Function0<Unit> $onSelectAnotherBank;
    final /* synthetic */ PartnerAuthState.Payload $payload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PartnerAuthScreenKt$LoadedContent$1(AbstractC19862dp<String> abstractC19862dp, PartnerAuthState.Payload payload, Function0<Unit> function0, Function0<Unit> function02, Function1<? super String, Unit> function1, int i) {
        super(2);
        this.$authenticationStatus = abstractC19862dp;
        this.$payload = payload;
        this.$onContinueClick = function0;
        this.$onSelectAnotherBank = function02;
        this.$onClickableTextClick = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PartnerAuthScreenKt.LoadedContent(this.$authenticationStatus, this.$payload, this.$onContinueClick, this.$onSelectAnotherBank, this.$onClickableTextClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
