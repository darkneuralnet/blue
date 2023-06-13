package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldUIKt$TextField$13 extends Lambda implements Function1<InterfaceC37321Yk2, Unit> {
    final /* synthetic */ InterfaceC32037Bv1 $focusManager;
    final /* synthetic */ int $nextFocusDirection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$TextField$13(InterfaceC32037Bv1 interfaceC32037Bv1, int i) {
        super(1);
        this.$focusManager = interfaceC32037Bv1;
        this.$nextFocusDirection = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37321Yk2 interfaceC37321Yk2) {
        invoke2(interfaceC37321Yk2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC37321Yk2 $receiver) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        this.$focusManager.mo68851i(this.$nextFocusDirection);
    }
}
