package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt$lambda-8$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$PollingScreenKt$lambda8$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$PollingScreenKt$lambda8$1 INSTANCE = new ComposableSingletons$PollingScreenKt$lambda8$1();

    public ComposableSingletons$PollingScreenKt$lambda8$1() {
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
            C35528Qt0.m87816Z(-1698805546, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-8.<anonymous> (PollingScreen.kt:248)");
        }
        NV5.m93838a(null, null, 0L, 0L, null, 0.0f, ComposableSingletons$PollingScreenKt.INSTANCE.m116614getLambda7$paymentsheet_release(), interfaceC32720Et0, 1572864, 63);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}