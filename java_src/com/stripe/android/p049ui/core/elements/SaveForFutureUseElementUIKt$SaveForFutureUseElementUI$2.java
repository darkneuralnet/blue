package com.stripe.android.p049ui.core.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$2 */
/* loaded from: classes7.dex */
public final class SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$2 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ InterfaceC48627sP5<Boolean> $checked$delegate;
    final /* synthetic */ SaveForFutureUseController $controller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$2(SaveForFutureUseController saveForFutureUseController, InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        super(1);
        this.$controller = saveForFutureUseController;
        this.$checked$delegate = interfaceC48627sP5;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        boolean SaveForFutureUseElementUI$lambda$0;
        SaveForFutureUseController saveForFutureUseController = this.$controller;
        SaveForFutureUseElementUI$lambda$0 = SaveForFutureUseElementUIKt.SaveForFutureUseElementUI$lambda$0(this.$checked$delegate);
        saveForFutureUseController.onValueChange(!SaveForFutureUseElementUI$lambda$0);
    }
}
