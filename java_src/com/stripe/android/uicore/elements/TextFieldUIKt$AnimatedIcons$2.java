package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.elements.TextFieldIcon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldUIKt$AnimatedIcons$2 extends Lambda implements Function3<TextFieldIcon.Trailing, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $loading;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$AnimatedIcons$2(boolean z, int i) {
        super(3);
        this.$loading = z;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(TextFieldIcon.Trailing trailing, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(trailing, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(TextFieldIcon.Trailing it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 14) == 0) {
            i |= interfaceC32720Et0.mo89539n(it) ? 4 : 2;
        }
        if ((i & 91) == 18 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1381873623, i, -1, "com.stripe.android.uicore.elements.AnimatedIcons.<anonymous> (TextFieldUI.kt:291)");
        }
        TextFieldUIKt.TrailingIcon(it, this.$loading, interfaceC32720Et0, (i & 14) | (this.$$dirty & 112));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
