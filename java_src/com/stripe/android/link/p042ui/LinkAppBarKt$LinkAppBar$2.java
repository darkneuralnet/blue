package com.stripe.android.link.p042ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.LinkAppBarKt$LinkAppBar$2 */
/* loaded from: classes7.dex */
public final class LinkAppBarKt$LinkAppBar$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $onBackPressed;
    final /* synthetic */ Function0<Unit> $onLogout;
    final /* synthetic */ Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> $showBottomSheetContent;
    final /* synthetic */ LinkAppBarState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkAppBarKt$LinkAppBar$2(LinkAppBarState linkAppBarState, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> function1, int i) {
        super(2);
        this.$state = linkAppBarState;
        this.$onBackPressed = function0;
        this.$onLogout = function02;
        this.$showBottomSheetContent = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        LinkAppBarKt.LinkAppBar(this.$state, this.$onBackPressed, this.$onLogout, this.$showBottomSheetContent, interfaceC32720Et0, this.$$changed | 1);
    }
}
