package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.elements.TextFieldIcon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldUIKt$TrailingIcon$5 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $loading;
    final /* synthetic */ TextFieldIcon.Trailing $trailingIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$TrailingIcon$5(TextFieldIcon.Trailing trailing, boolean z, int i) {
        super(2);
        this.$trailingIcon = trailing;
        this.$loading = z;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        TextFieldUIKt.TrailingIcon(this.$trailingIcon, this.$loading, interfaceC32720Et0, this.$$changed | 1);
    }
}
