package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldUIKt$TextField$4 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ InterfaceC48627sP5<TextFieldState> $fieldState$delegate;
    final /* synthetic */ Function1<TextFieldState, Unit> $onTextStateChanged;
    final /* synthetic */ TextFieldController $textFieldController;
    final /* synthetic */ InterfaceC48627sP5<String> $value$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldUIKt$TextField$4(TextFieldController textFieldController, Function1<? super TextFieldState, Unit> function1, InterfaceC48627sP5<? extends TextFieldState> interfaceC48627sP5, InterfaceC48627sP5<String> interfaceC48627sP52) {
        super(1);
        this.$textFieldController = textFieldController;
        this.$onTextStateChanged = function1;
        this.$fieldState$delegate = interfaceC48627sP5;
        this.$value$delegate = interfaceC48627sP52;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String newValue) {
        TextFieldState TextField_ndPIYpw$lambda$11;
        String TextField_ndPIYpw$lambda$3;
        TextFieldState onValueChange;
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        TextField_ndPIYpw$lambda$11 = TextFieldUIKt.TextField_ndPIYpw$lambda$11(this.$fieldState$delegate);
        TextField_ndPIYpw$lambda$3 = TextFieldUIKt.TextField_ndPIYpw$lambda$3(this.$value$delegate);
        if (!TextFieldStateKt.canAcceptInput(TextField_ndPIYpw$lambda$11, TextField_ndPIYpw$lambda$3, newValue) || (onValueChange = this.$textFieldController.onValueChange(newValue)) == null) {
            return;
        }
        this.$onTextStateChanged.invoke(onValueChange);
    }
}
