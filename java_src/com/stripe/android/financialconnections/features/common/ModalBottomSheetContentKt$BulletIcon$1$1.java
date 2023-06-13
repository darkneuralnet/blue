package com.stripe.android.financialconnections.features.common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ModalBottomSheetContentKt$BulletIcon$1$1 extends Lambda implements Function1<I61, Unit> {
    final /* synthetic */ long $color;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetContentKt$BulletIcon$1$1(long j) {
        super(1);
        this.$color = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(I61 i61) {
        invoke2(i61);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(I61 Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        I61.m102955J(Canvas, this.$color, 0.0f, 0L, 0.0f, null, null, 0, 126, null);
    }
}
