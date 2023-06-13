package com.stripe.android.link.p042ui.wallet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$3 */
/* loaded from: classes7.dex */
public /* synthetic */ class WalletScreenKt$WalletBody$3 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    public WalletScreenKt$WalletBody$3(Object obj) {
        super(1, obj, WalletViewModel.class, "setExpanded", "setExpanded(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((WalletViewModel) this.receiver).setExpanded(z);
    }
}
