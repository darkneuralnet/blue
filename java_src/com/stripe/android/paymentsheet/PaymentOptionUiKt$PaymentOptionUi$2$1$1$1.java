package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentOptionUiKt$PaymentOptionUi$2$1$1$1 extends Lambda implements Function1<InterfaceC48906ss5, Unit> {
    final /* synthetic */ String $description;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionUiKt$PaymentOptionUi$2$1$1$1(String str) {
        super(1);
        this.$description = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
        invoke2(interfaceC48906ss5);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC48906ss5 semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        C47128ps5.m18618H(semantics, new Regex("\\d").replace(this.$description, "$0 "));
    }
}
