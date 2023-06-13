package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$1$1 extends Lambda implements Function1<InterfaceC36951Wv1, Unit> {
    final /* synthetic */ EX2<Integer> $focusedElementIndex$delegate;
    final /* synthetic */ int $index;
    final /* synthetic */ boolean $isSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$1$1(int i, boolean z, EX2<Integer> ex2) {
        super(1);
        this.$index = i;
        this.$isSelected = z;
        this.$focusedElementIndex$delegate = ex2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC36951Wv1 interfaceC36951Wv1) {
        invoke2(interfaceC36951Wv1);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC36951Wv1 focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        if (focusState.mo76101a()) {
            OTPElementUIKt.OTPElementUI$lambda$5$lambda$3(this.$focusedElementIndex$delegate, this.$index);
        } else if (focusState.mo76101a() || !this.$isSelected) {
        } else {
            OTPElementUIKt.OTPElementUI$lambda$5$lambda$3(this.$focusedElementIndex$delegate, -1);
        }
    }
}
