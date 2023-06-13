package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.C19423R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldUIKt$TextField$9$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $it;
    final /* synthetic */ TextFieldController $textFieldController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$TextField$9$1(TextFieldController textFieldController, int i) {
        super(2);
        this.$textFieldController = textFieldController;
        this.$it = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        String m41310c;
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(411029665, i, -1, "com.stripe.android.uicore.elements.TextField.<anonymous>.<anonymous> (TextFieldUI.kt:216)");
        }
        if (this.$textFieldController.getShowOptionalLabel()) {
            m41310c = C40946fS5.m41309d(C19423R.string.form_label_optional, new Object[]{C40946fS5.m41310c(this.$it, interfaceC32720Et0, 0)}, interfaceC32720Et0, 64);
        } else {
            m41310c = C40946fS5.m41310c(this.$it, interfaceC32720Et0, 0);
        }
        FormLabelKt.FormLabel(m41310c, null, false, interfaceC32720Et0, 0, 6);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
