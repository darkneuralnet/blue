package com.stripe.android.link.p042ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.PrimaryButtonKt$SecondaryButton$2 */
/* loaded from: classes7.dex */
public final class PrimaryButtonKt$SecondaryButton$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ String $label;
    final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonKt$SecondaryButton$2(boolean z, String str, Function0<Unit> function0, int i) {
        super(2);
        this.$enabled = z;
        this.$label = str;
        this.$onClick = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PrimaryButtonKt.SecondaryButton(this.$enabled, this.$label, this.$onClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
