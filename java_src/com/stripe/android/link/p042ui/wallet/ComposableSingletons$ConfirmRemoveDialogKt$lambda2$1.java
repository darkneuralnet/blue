package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.link.C18975R;
import com.stripe.android.link.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LZc5;", "", "invoke", "(LZc5;LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.link.ui.wallet.ComposableSingletons$ConfirmRemoveDialogKt$lambda-2$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$ConfirmRemoveDialogKt$lambda2$1 extends Lambda implements Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$ConfirmRemoveDialogKt$lambda2$1 INSTANCE = new ComposableSingletons$ConfirmRemoveDialogKt$lambda2$1();

    public ComposableSingletons$ConfirmRemoveDialogKt$lambda2$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC37486Zc5, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC37486Zc5 TextButton, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(13722369, i, -1, "com.stripe.android.link.ui.wallet.ComposableSingletons$ConfirmRemoveDialogKt.lambda-2.<anonymous> (ConfirmRemoveDialog.kt:41)");
        }
        C38909c26.m62000e(C40946fS5.m41310c(C18975R.string.cancel, interfaceC32720Et0, 0), null, ThemeKt.getLinkColors(TM2.f35372a, interfaceC32720Et0, TM2.f35373b).m116528getActionLabel0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et0, 0, 0, 65530);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
