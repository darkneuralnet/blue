package com.stripe.android.link.p042ui.menus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX WARN: Incorrect field signature: TT; */
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.menus.LinkMenuKt$LinkMenu$1$1 */
/* loaded from: classes7.dex */
public final class LinkMenuKt$LinkMenu$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ LinkMenuItem $item;
    final /* synthetic */ Function1<T, Unit> $onItemPress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function1<-TT;Lkotlin/Unit;>;TT;)V */
    public LinkMenuKt$LinkMenu$1$1(Function1 function1, LinkMenuItem linkMenuItem) {
        super(0);
        this.$onItemPress = function1;
        this.$item = linkMenuItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onItemPress.invoke(this.$item);
    }
}
