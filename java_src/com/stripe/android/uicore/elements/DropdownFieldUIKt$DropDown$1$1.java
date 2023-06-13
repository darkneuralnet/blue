package com.stripe.android.uicore.elements;

import androidx.compose.p003ui.focus.InterfaceC11302e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DropdownFieldUIKt$DropDown$1$1 extends Lambda implements Function1<InterfaceC11302e, Unit> {
    final /* synthetic */ InterfaceC44862m32 $inputModeManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropdownFieldUIKt$DropDown$1$1(InterfaceC44862m32 interfaceC44862m32) {
        super(1);
        this.$inputModeManager = interfaceC44862m32;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC11302e interfaceC11302e) {
        invoke2(interfaceC11302e);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC11302e focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "$this$focusProperties");
        focusProperties.mo68792e(!C44269l32.m27987f(this.$inputModeManager.mo24518a(), C44269l32.f95397b.m27982b()));
    }
}
