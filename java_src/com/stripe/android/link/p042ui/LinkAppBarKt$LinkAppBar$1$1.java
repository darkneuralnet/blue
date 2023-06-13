package com.stripe.android.link.p042ui;

import com.stripe.android.link.C18975R;
import com.stripe.android.link.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.LinkAppBarKt$LinkAppBar$1$1 */
/* loaded from: classes7.dex */
public final class LinkAppBarKt$LinkAppBar$1$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ LinkAppBarState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAppBarKt$LinkAppBar$1$1(LinkAppBarState linkAppBarState) {
        super(2);
        this.$state = linkAppBarState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1483428661, i, -1, "com.stripe.android.link.ui.LinkAppBar.<anonymous>.<anonymous> (LinkAppBar.kt:51)");
        }
        DP1.m110533b(C46748pE3.m19793d(this.$state.getNavigationIcon(), interfaceC32720Et0, 0), C40946fS5.m41310c(C18975R.string.back, interfaceC32720Et0, 0), null, ThemeKt.getLinkColors(TM2.f35372a, interfaceC32720Et0, TM2.f35373b).m116531getCloseButton0d7_KjU(), interfaceC32720Et0, 8, 4);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
