package com.stripe.android.p049ui.core.elements;

import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.BsbElementUIKt$BsbElementUI$1$2 */
/* loaded from: classes7.dex */
public final class BsbElementUIKt$BsbElementUI$1$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ BsbElement $element;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ IdentifierSpec $lastTextFieldIdentifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BsbElementUIKt$BsbElementUI$1$2(BsbElement bsbElement, boolean z, IdentifierSpec identifierSpec, int i) {
        super(2);
        this.$element = bsbElement;
        this.$enabled = z;
        this.$lastTextFieldIdentifier = identifierSpec;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int m107000d;
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-986021645, i, -1, "com.stripe.android.ui.core.elements.BsbElementUI.<anonymous>.<anonymous> (BsbElementUI.kt:37)");
        }
        TextFieldController controller = this.$element.getTextElement$payments_ui_core_release().getController();
        boolean z = this.$enabled;
        if (Intrinsics.areEqual(this.$lastTextFieldIdentifier, this.$element.getIdentifier())) {
            m107000d = FY1.f9619b.m107002b();
        } else {
            m107000d = FY1.f9619b.m107000d();
        }
        TextFieldUIKt.m116750TextFieldndPIYpw(controller, z, m107000d, null, null, 0, 0, interfaceC32720Et0, ((this.$$dirty << 3) & 112) | 8, 120);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
