package com.stripe.android.financialconnections.features.common;

import androidx.compose.p003ui.graphics.InterfaceC11328c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class LoadingContentKt$LoadingSpinner$1$1 extends Lambda implements Function1<InterfaceC11328c, Unit> {
    final /* synthetic */ InterfaceC48627sP5<Float> $angle$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingContentKt$LoadingSpinner$1$1(InterfaceC48627sP5<Float> interfaceC48627sP5) {
        super(1);
        this.$angle$delegate = interfaceC48627sP5;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC11328c interfaceC11328c) {
        invoke2(interfaceC11328c);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC11328c graphicsLayer) {
        float LoadingSpinner$lambda$1;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        LoadingSpinner$lambda$1 = LoadingContentKt.LoadingSpinner$lambda$1(this.$angle$delegate);
        graphicsLayer.mo68678u(LoadingSpinner$lambda$1);
    }
}
