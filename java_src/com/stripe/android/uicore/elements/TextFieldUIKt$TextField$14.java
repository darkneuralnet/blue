package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldUIKt$TextField$14 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ int $imeAction;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ int $nextFocusDirection;
    final /* synthetic */ Function1<TextFieldState, Unit> $onTextStateChanged;
    final /* synthetic */ int $previousFocusDirection;
    final /* synthetic */ TextFieldController $textFieldController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldUIKt$TextField$14(TextFieldController textFieldController, boolean z, int i, InterfaceC41563gV2 interfaceC41563gV2, Function1<? super TextFieldState, Unit> function1, int i2, int i3, int i4, int i5) {
        super(2);
        this.$textFieldController = textFieldController;
        this.$enabled = z;
        this.$imeAction = i;
        this.$modifier = interfaceC41563gV2;
        this.$onTextStateChanged = function1;
        this.$nextFocusDirection = i2;
        this.$previousFocusDirection = i3;
        this.$$changed = i4;
        this.$$default = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        TextFieldUIKt.m116750TextFieldndPIYpw(this.$textFieldController, this.$enabled, this.$imeAction, this.$modifier, this.$onTextStateChanged, this.$nextFocusDirection, this.$previousFocusDirection, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
