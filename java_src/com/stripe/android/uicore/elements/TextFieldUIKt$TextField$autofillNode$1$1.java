package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldUIKt$TextField$autofillNode$1$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ Function1<String, Unit> $autofillReporter;
    final /* synthetic */ TextFieldController $textFieldController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldUIKt$TextField$autofillNode$1$1(TextFieldController textFieldController, Function1<? super String, Unit> function1) {
        super(1);
        this.$textFieldController = textFieldController;
        this.$autofillReporter = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EnumC7283Ru autofillType = this.$textFieldController.getAutofillType();
        if (autofillType != null) {
            this.$autofillReporter.invoke(autofillType.name());
        }
        this.$textFieldController.onValueChange(it);
    }
}
