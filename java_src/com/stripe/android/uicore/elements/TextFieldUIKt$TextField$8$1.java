package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldUIKt$TextField$8$1 extends Lambda implements Function1<InterfaceC48906ss5, Unit> {
    final /* synthetic */ InterfaceC48627sP5<String> $contentDescription$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$TextField$8$1(InterfaceC48627sP5<String> interfaceC48627sP5) {
        super(1);
        this.$contentDescription$delegate = interfaceC48627sP5;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
        invoke2(interfaceC48906ss5);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC48906ss5 semantics) {
        String TextField_ndPIYpw$lambda$7;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        TextField_ndPIYpw$lambda$7 = TextFieldUIKt.TextField_ndPIYpw$lambda$7(this.$contentDescription$delegate);
        C47128ps5.m18618H(semantics, TextField_ndPIYpw$lambda$7);
        C47128ps5.m18617I(semantics, new C1577Df("", null, null, 6, null));
    }
}
