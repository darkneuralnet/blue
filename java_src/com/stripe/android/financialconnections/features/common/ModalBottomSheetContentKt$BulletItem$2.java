package com.stripe.android.financialconnections.features.common;

import com.stripe.android.financialconnections.p041ui.sdui.BulletUI;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ModalBottomSheetContentKt$BulletItem$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ BulletUI $bullet;
    final /* synthetic */ Function1<String, Unit> $onClickableTextClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheetContentKt$BulletItem$2(BulletUI bulletUI, Function1<? super String, Unit> function1, int i) {
        super(2);
        this.$bullet = bulletUI;
        this.$onClickableTextClick = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ModalBottomSheetContentKt.BulletItem(this.$bullet, this.$onClickableTextClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
