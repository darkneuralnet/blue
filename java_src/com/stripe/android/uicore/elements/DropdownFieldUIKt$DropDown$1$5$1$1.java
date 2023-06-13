package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DropdownFieldUIKt$DropDown$1$5$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ DropdownFieldController $controller;
    final /* synthetic */ EX2<Boolean> $expanded$delegate;
    final /* synthetic */ int $index;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropdownFieldUIKt$DropDown$1$5$1$1(DropdownFieldController dropdownFieldController, int i, EX2<Boolean> ex2) {
        super(0);
        this.$controller = dropdownFieldController;
        this.$index = i;
        this.$expanded$delegate = ex2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        DropdownFieldUIKt.DropDown$lambda$4(this.$expanded$delegate, false);
        this.$controller.onValueChange(this.$index);
    }
}
