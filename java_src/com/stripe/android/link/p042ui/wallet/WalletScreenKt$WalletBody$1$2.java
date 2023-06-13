package com.stripe.android.link.p042ui.wallet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$1$2 */
/* loaded from: classes7.dex */
public final class WalletScreenKt$WalletBody$1$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ WalletViewModel $viewModel;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$1$2$1 */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C190651 extends FunctionReferenceImpl implements Function0<Unit> {
        public C190651(Object obj) {
            super(0, obj, WalletViewModel.class, "onAlertDismissed", "onAlertDismissed()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((WalletViewModel) this.receiver).onAlertDismissed();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletScreenKt$WalletBody$1$2(WalletViewModel walletViewModel) {
        super(2);
        this.$viewModel = walletViewModel;
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
            C35528Qt0.m87816Z(-1544125823, i, -1, "com.stripe.android.link.ui.wallet.WalletBody.<anonymous>.<anonymous> (WalletScreen.kt:156)");
        }
        C43714k70.m29276c(new C190651(this.$viewModel), null, false, null, null, null, null, null, null, ComposableSingletons$WalletScreenKt.INSTANCE.m116571getLambda1$link_release(), interfaceC32720Et0, 805306368, 510);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
