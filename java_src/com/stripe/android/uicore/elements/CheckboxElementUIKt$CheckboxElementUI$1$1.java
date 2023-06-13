package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class CheckboxElementUIKt$CheckboxElementUI$1$1 extends Lambda implements Function1<InterfaceC48906ss5, Unit> {
    final /* synthetic */ String $accessibilityDescription;
    final /* synthetic */ String $automationTestTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxElementUIKt$CheckboxElementUI$1$1(String str, String str2) {
        super(1);
        this.$automationTestTag = str;
        this.$accessibilityDescription = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
        invoke2(interfaceC48906ss5);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC48906ss5 semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        C47128ps5.m18605U(semantics, this.$automationTestTag);
        C47128ps5.m18606T(semantics, this.$accessibilityDescription);
    }
}
