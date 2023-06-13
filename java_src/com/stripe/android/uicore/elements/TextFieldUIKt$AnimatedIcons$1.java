package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.elements.TextFieldIcon;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldUIKt$AnimatedIcons$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ List<TextFieldIcon.Trailing> $icons;
    final /* synthetic */ boolean $loading;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$AnimatedIcons$1(List<TextFieldIcon.Trailing> list, boolean z, int i) {
        super(2);
        this.$icons = list;
        this.$loading = z;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        TextFieldUIKt.AnimatedIcons(this.$icons, this.$loading, interfaceC32720Et0, this.$$changed | 1);
    }
}
