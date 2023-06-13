package com.stripe.android.p049ui.core.elements.menu;

import androidx.compose.p003ui.graphics.C11333f;
import androidx.compose.p003ui.graphics.InterfaceC11328c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.menu.MenuKt$DropdownMenuContent$1$1 */
/* loaded from: classes7.dex */
public final class MenuKt$DropdownMenuContent$1$1 extends Lambda implements Function1<InterfaceC11328c, Unit> {
    final /* synthetic */ InterfaceC48627sP5<Float> $alpha$delegate;
    final /* synthetic */ InterfaceC48627sP5<Float> $scale$delegate;
    final /* synthetic */ EX2<C11333f> $transformOriginState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuContent$1$1(EX2<C11333f> ex2, InterfaceC48627sP5<Float> interfaceC48627sP5, InterfaceC48627sP5<Float> interfaceC48627sP52) {
        super(1);
        this.$transformOriginState = ex2;
        this.$scale$delegate = interfaceC48627sP5;
        this.$alpha$delegate = interfaceC48627sP52;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC11328c interfaceC11328c) {
        invoke2(interfaceC11328c);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC11328c graphicsLayer) {
        float DropdownMenuContent$lambda$1;
        float DropdownMenuContent$lambda$12;
        float DropdownMenuContent$lambda$3;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        DropdownMenuContent$lambda$1 = MenuKt.DropdownMenuContent$lambda$1(this.$scale$delegate);
        graphicsLayer.mo68708D(DropdownMenuContent$lambda$1);
        DropdownMenuContent$lambda$12 = MenuKt.DropdownMenuContent$lambda$1(this.$scale$delegate);
        graphicsLayer.mo68706E(DropdownMenuContent$lambda$12);
        DropdownMenuContent$lambda$3 = MenuKt.DropdownMenuContent$lambda$3(this.$alpha$delegate);
        graphicsLayer.mo68690g(DropdownMenuContent$lambda$3);
        graphicsLayer.mo68700P(this.$transformOriginState.getValue().m68627j());
    }
}
