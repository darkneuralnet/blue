package com.stripe.android.financialconnections.p041ui.components;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LZc5;", "", "invoke", "(LZc5;LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.ui.components.ComposableSingletons$ButtonKt$lambda-3$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$ButtonKt$lambda3$1 extends Lambda implements Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$ButtonKt$lambda3$1 INSTANCE = new ComposableSingletons$ButtonKt$lambda3$1();

    public ComposableSingletons$ButtonKt$lambda3$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC37486Zc5, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC37486Zc5 FinancialConnectionsButton, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(2063991880, i, -1, "com.stripe.android.financialconnections.ui.components.ComposableSingletons$ButtonKt.lambda-3.<anonymous> (Button.kt:217)");
        }
        C38909c26.m62000e("Primary - disabled", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et0, 6, 0, 65534);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}