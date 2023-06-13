package com.stripe.android.financialconnections.features.reset;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ResetScreenKt$ResetContent$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function1<Throwable, Unit> $onCloseFromErrorClick;
    final /* synthetic */ AbstractC19862dp<Unit> $payload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ResetScreenKt$ResetContent$3(AbstractC19862dp<Unit> abstractC19862dp, Function0<Unit> function0, Function1<? super Throwable, Unit> function1, int i) {
        super(2);
        this.$payload = abstractC19862dp;
        this.$onCloseClick = function0;
        this.$onCloseFromErrorClick = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ResetScreenKt.ResetContent(this.$payload, this.$onCloseClick, this.$onCloseFromErrorClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
