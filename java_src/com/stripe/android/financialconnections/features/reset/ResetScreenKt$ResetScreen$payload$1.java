package com.stripe.android.financialconnections.features.reset;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ResetScreenKt$ResetScreen$payload$1 extends Lambda implements Function1<ResetState, AbstractC19862dp<? extends Unit>> {
    public static final ResetScreenKt$ResetScreen$payload$1 INSTANCE = new ResetScreenKt$ResetScreen$payload$1();

    public ResetScreenKt$ResetScreen$payload$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AbstractC19862dp<Unit> invoke(ResetState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getPayload();
    }
}
