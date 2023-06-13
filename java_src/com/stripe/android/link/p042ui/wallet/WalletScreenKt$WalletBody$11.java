package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.link.model.LinkAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$11 */
/* loaded from: classes7.dex */
public final class WalletScreenKt$WalletBody$11 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ NonFallbackInjector $injector;
    final /* synthetic */ LinkAccount $linkAccount;
    final /* synthetic */ Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> $showBottomSheetContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletScreenKt$WalletBody$11(LinkAccount linkAccount, NonFallbackInjector nonFallbackInjector, Function1<? super Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> function1, int i) {
        super(2);
        this.$linkAccount = linkAccount;
        this.$injector = nonFallbackInjector;
        this.$showBottomSheetContent = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        WalletScreenKt.WalletBody(this.$linkAccount, this.$injector, this.$showBottomSheetContent, interfaceC32720Et0, this.$$changed | 1);
    }
}
