package com.stripe.android.financialconnections.features.reset;

import com.stripe.android.financialconnections.features.common.ErrorContentKt;
import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ResetScreenKt$ResetContent$2 extends Lambda implements Function3<PD3, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function1<Throwable, Unit> $onCloseFromErrorClick;
    final /* synthetic */ AbstractC19862dp<Unit> $payload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ResetScreenKt$ResetContent$2(AbstractC19862dp<Unit> abstractC19862dp, Function1<? super Throwable, Unit> function1, int i) {
        super(3);
        this.$payload = abstractC19862dp;
        this.$onCloseFromErrorClick = function1;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PD3 pd3, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(pd3, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PD3 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-173929120, i, -1, "com.stripe.android.financialconnections.features.reset.ResetContent.<anonymous> (ResetScreen.kt:45)");
        }
        AbstractC19862dp<Unit> abstractC19862dp = this.$payload;
        if (Intrinsics.areEqual(abstractC19862dp, C34454Md6.f23316e) ? true : abstractC19862dp instanceof C31786At2) {
            interfaceC32720Et0.mo89638F(856289681);
            LoadingContentKt.LoadingContent(null, null, null, interfaceC32720Et0, 0, 7);
            interfaceC32720Et0.mo89605Q();
        } else if (abstractC19862dp instanceof C51034wT5) {
            interfaceC32720Et0.mo89638F(856289724);
            LoadingContentKt.LoadingContent(null, null, null, interfaceC32720Et0, 0, 7);
            interfaceC32720Et0.mo89605Q();
        } else if (abstractC19862dp instanceof C32163Cj1) {
            interfaceC32720Et0.mo89638F(856289764);
            ErrorContentKt.UnclassifiedErrorContent(((C32163Cj1) this.$payload).m111793b(), this.$onCloseFromErrorClick, interfaceC32720Et0, ((this.$$dirty >> 3) & 112) | 8);
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(856289914);
            interfaceC32720Et0.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
