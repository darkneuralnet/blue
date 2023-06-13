package com.stripe.android.link.p042ui;

import com.stripe.android.link.C18975R;
import com.stripe.android.link.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.link.ui.ComposableSingletons$LinkAppBarKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$LinkAppBarKt$lambda1$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$LinkAppBarKt$lambda1$1 INSTANCE = new ComposableSingletons$LinkAppBarKt$lambda1$1();

    public ComposableSingletons$LinkAppBarKt$lambda1$1() {
        super(2);
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
            C35528Qt0.m87816Z(-1173172756, i, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkAppBarKt.lambda-1.<anonymous> (LinkAppBar.kt:114)");
        }
        DP1.m110534a(LV2.m96791a(EP1.f7414a.m109046a()), C40946fS5.m41310c(C18975R.string.show_menu, interfaceC32720Et0, 0), null, ThemeKt.getLinkColors(TM2.f35372a, interfaceC32720Et0, TM2.f35373b).m116531getCloseButton0d7_KjU(), interfaceC32720Et0, 0, 4);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
