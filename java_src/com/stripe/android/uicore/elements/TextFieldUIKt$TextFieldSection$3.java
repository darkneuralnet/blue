package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldUIKt$TextFieldSection$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ int $imeAction;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function1<TextFieldState, Unit> $onTextStateChanged;
    final /* synthetic */ Integer $sectionTitle;
    final /* synthetic */ TextFieldController $textFieldController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldUIKt$TextFieldSection$3(TextFieldController textFieldController, int i, boolean z, InterfaceC41563gV2 interfaceC41563gV2, Integer num, Function1<? super TextFieldState, Unit> function1, int i2, int i3) {
        super(2);
        this.$textFieldController = textFieldController;
        this.$imeAction = i;
        this.$enabled = z;
        this.$modifier = interfaceC41563gV2;
        this.$sectionTitle = num;
        this.$onTextStateChanged = function1;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        TextFieldUIKt.m116751TextFieldSectionuGujYS0(this.$textFieldController, this.$imeAction, this.$enabled, this.$modifier, this.$sectionTitle, this.$onTextStateChanged, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
