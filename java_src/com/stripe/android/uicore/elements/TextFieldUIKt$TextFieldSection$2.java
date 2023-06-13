package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldUIKt$TextFieldSection$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ int $imeAction;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function1<TextFieldState, Unit> $onTextStateChanged;
    final /* synthetic */ TextFieldController $textFieldController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldUIKt$TextFieldSection$2(TextFieldController textFieldController, boolean z, int i, InterfaceC41563gV2 interfaceC41563gV2, Function1<? super TextFieldState, Unit> function1, int i2) {
        super(2);
        this.$textFieldController = textFieldController;
        this.$enabled = z;
        this.$imeAction = i;
        this.$modifier = interfaceC41563gV2;
        this.$onTextStateChanged = function1;
        this.$$dirty = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1407454986, i, -1, "com.stripe.android.uicore.elements.TextFieldSection.<anonymous> (TextFieldUI.kt:94)");
        }
        TextFieldController textFieldController = this.$textFieldController;
        boolean z = this.$enabled;
        int i2 = this.$imeAction;
        InterfaceC41563gV2 interfaceC41563gV2 = this.$modifier;
        Function1<TextFieldState, Unit> function1 = this.$onTextStateChanged;
        int i3 = this.$$dirty;
        TextFieldUIKt.m116750TextFieldndPIYpw(textFieldController, z, i2, interfaceC41563gV2, function1, 0, 0, interfaceC32720Et0, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896) | (i3 & 7168) | ((i3 >> 3) & 57344), 96);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
