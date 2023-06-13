package com.stripe.android.link.p042ui.forms;

import com.stripe.android.p049ui.core.FormController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.forms.FormKt$Form$1 */
/* loaded from: classes7.dex */
public final class FormKt$Form$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC32730Eu1<Boolean> $enabledFlow;
    final /* synthetic */ FormController $formController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormKt$Form$1(FormController formController, InterfaceC32730Eu1<Boolean> interfaceC32730Eu1, int i) {
        super(2);
        this.$formController = formController;
        this.$enabledFlow = interfaceC32730Eu1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        FormKt.Form(this.$formController, this.$enabledFlow, interfaceC32720Et0, this.$$changed | 1);
    }
}
