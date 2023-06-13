package com.stripe.android.financialconnections.features.consent;

import com.stripe.android.financialconnections.features.consent.ConsentState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ConsentScreenKt$ConsentMainContent$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AbstractC19862dp<Unit> $acceptConsent;
    final /* synthetic */ Function1<String, Unit> $onClickableTextClick;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function0<Unit> $onContinueClick;
    final /* synthetic */ ConsentState.Payload $payload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConsentScreenKt$ConsentMainContent$3(ConsentState.Payload payload, AbstractC19862dp<Unit> abstractC19862dp, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$payload = payload;
        this.$acceptConsent = abstractC19862dp;
        this.$onClickableTextClick = function1;
        this.$onContinueClick = function0;
        this.$onCloseClick = function02;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ConsentScreenKt.ConsentMainContent(this.$payload, this.$acceptConsent, this.$onClickableTextClick, this.$onContinueClick, this.$onCloseClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
