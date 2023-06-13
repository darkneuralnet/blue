package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PhoneNumberElementUIKt$PhoneNumberElementUI$2 extends Lambda implements Function1<InterfaceC36951Wv1, Unit> {
    final /* synthetic */ PhoneNumberController $controller;
    final /* synthetic */ EX2<Boolean> $hasFocus$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberElementUIKt$PhoneNumberElementUI$2(PhoneNumberController phoneNumberController, EX2<Boolean> ex2) {
        super(1);
        this.$controller = phoneNumberController;
        this.$hasFocus$delegate = ex2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC36951Wv1 interfaceC36951Wv1) {
        invoke2(interfaceC36951Wv1);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC36951Wv1 it) {
        boolean PhoneNumberElementUI_rvJmuoc$lambda$10;
        Intrinsics.checkNotNullParameter(it, "it");
        PhoneNumberElementUI_rvJmuoc$lambda$10 = PhoneNumberElementUIKt.PhoneNumberElementUI_rvJmuoc$lambda$10(this.$hasFocus$delegate);
        if (PhoneNumberElementUI_rvJmuoc$lambda$10 != it.mo76101a()) {
            this.$controller.onFocusChange(it.mo76101a());
        }
        PhoneNumberElementUIKt.PhoneNumberElementUI_rvJmuoc$lambda$11(this.$hasFocus$delegate, it.mo76101a());
    }
}
