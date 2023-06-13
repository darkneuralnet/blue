package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldUIKt$TextField$6 extends Lambda implements Function1<InterfaceC45879nm2, Unit> {
    final /* synthetic */ C6560Pu $autofillNode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$TextField$6(C6560Pu c6560Pu) {
        super(1);
        this.$autofillNode = c6560Pu;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC45879nm2 interfaceC45879nm2) {
        invoke2(interfaceC45879nm2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC45879nm2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$autofillNode.m89453g(C46472om2.m20518c(it));
    }
}
