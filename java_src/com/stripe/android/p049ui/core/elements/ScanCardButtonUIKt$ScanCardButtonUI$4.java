package com.stripe.android.p049ui.core.elements;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.ScanCardButtonUIKt$ScanCardButtonUI$4 */
/* loaded from: classes7.dex */
public final class ScanCardButtonUIKt$ScanCardButtonUI$4 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function1<Intent, Unit> $onResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScanCardButtonUIKt$ScanCardButtonUI$4(boolean z, Function1<? super Intent, Unit> function1, int i) {
        super(2);
        this.$enabled = z;
        this.$onResult = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ScanCardButtonUIKt.ScanCardButtonUI(this.$enabled, this.$onResult, interfaceC32720Et0, this.$$changed | 1);
    }
}
