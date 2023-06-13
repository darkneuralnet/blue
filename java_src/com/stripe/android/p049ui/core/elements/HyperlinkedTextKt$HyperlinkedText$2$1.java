package com.stripe.android.p049ui.core.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.HyperlinkedTextKt$HyperlinkedText$2$1 */
/* loaded from: classes7.dex */
public final class HyperlinkedTextKt$HyperlinkedText$2$1 extends Lambda implements Function1<C42484i26, Unit> {
    final /* synthetic */ EX2<C42484i26> $layoutResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HyperlinkedTextKt$HyperlinkedText$2$1(EX2<C42484i26> ex2) {
        super(1);
        this.$layoutResult = ex2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C42484i26 c42484i26) {
        invoke2(c42484i26);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(C42484i26 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$layoutResult.setValue(it);
    }
}
