package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldUIKt$TextField$7 extends Lambda implements Function1<InterfaceC36951Wv1, Unit> {
    final /* synthetic */ InterfaceC31588zu $autofill;
    final /* synthetic */ C6560Pu $autofillNode;
    final /* synthetic */ EX2<Boolean> $hasFocus$delegate;
    final /* synthetic */ TextFieldController $textFieldController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$TextField$7(TextFieldController textFieldController, InterfaceC31588zu interfaceC31588zu, C6560Pu c6560Pu, EX2<Boolean> ex2) {
        super(1);
        this.$textFieldController = textFieldController;
        this.$autofill = interfaceC31588zu;
        this.$autofillNode = c6560Pu;
        this.$hasFocus$delegate = ex2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC36951Wv1 interfaceC36951Wv1) {
        invoke2(interfaceC36951Wv1);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC36951Wv1 it) {
        boolean TextField_ndPIYpw$lambda$9;
        Intrinsics.checkNotNullParameter(it, "it");
        TextField_ndPIYpw$lambda$9 = TextFieldUIKt.TextField_ndPIYpw$lambda$9(this.$hasFocus$delegate);
        if (TextField_ndPIYpw$lambda$9 != it.mo76101a()) {
            this.$textFieldController.onFocusChange(it.mo76101a());
        }
        TextFieldUIKt.TextField_ndPIYpw$lambda$10(this.$hasFocus$delegate, it.mo76101a());
        if (this.$autofill == null || this.$autofillNode.m89456d() == null) {
            return;
        }
        if (it.mo76101a()) {
            this.$autofill.mo149b(this.$autofillNode);
        } else {
            this.$autofill.mo150a(this.$autofillNode);
        }
    }
}
