package com.stripe.android.link.p042ui.menus;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.menus.LinkMenuKt$LinkMenu$2 */
/* loaded from: classes7.dex */
public final class LinkMenuKt$LinkMenu$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ List<T> $items;
    final /* synthetic */ Function1<T, Unit> $onItemPress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkMenuKt$LinkMenu$2(List<? extends T> list, Function1<? super T, Unit> function1, int i) {
        super(2);
        this.$items = list;
        this.$onItemPress = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        LinkMenuKt.LinkMenu(this.$items, this.$onItemPress, interfaceC32720Et0, this.$$changed | 1);
    }
}
