package com.stripe.android.p049ui.core.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$4 */
/* loaded from: classes7.dex */
public final class SimpleDialogElementUIKt$SimpleDialogElementUI$4 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $confirmText;
    final /* synthetic */ String $dismissText;
    final /* synthetic */ String $messageText;
    final /* synthetic */ Function0<Unit> $onConfirmListener;
    final /* synthetic */ Function0<Unit> $onDismissListener;
    final /* synthetic */ EX2<Boolean> $openDialog;
    final /* synthetic */ String $titleText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleDialogElementUIKt$SimpleDialogElementUI$4(EX2<Boolean> ex2, String str, String str2, String str3, String str4, Function0<Unit> function0, Function0<Unit> function02, int i, int i2) {
        super(2);
        this.$openDialog = ex2;
        this.$titleText = str;
        this.$messageText = str2;
        this.$confirmText = str3;
        this.$dismissText = str4;
        this.$onConfirmListener = function0;
        this.$onDismissListener = function02;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        SimpleDialogElementUIKt.SimpleDialogElementUI(this.$openDialog, this.$titleText, this.$messageText, this.$confirmText, this.$dismissText, this.$onConfirmListener, this.$onDismissListener, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
