package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.link.p042ui.wallet.WalletPaymentMethodMenuItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.WalletPaymentMethodMenuKt$WalletPaymentMethodMenu$1$1 */
/* loaded from: classes7.dex */
public final class WalletPaymentMethodMenuKt$WalletPaymentMethodMenu$1$1 extends Lambda implements Function1<WalletPaymentMethodMenuItem, Unit> {
    final /* synthetic */ Function0<Unit> $onCancelClick;
    final /* synthetic */ Function0<Unit> $onEditClick;
    final /* synthetic */ Function0<Unit> $onRemoveClick;
    final /* synthetic */ Function0<Unit> $onSetDefaultClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletPaymentMethodMenuKt$WalletPaymentMethodMenu$1$1(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
        super(1);
        this.$onEditClick = function0;
        this.$onSetDefaultClick = function02;
        this.$onRemoveClick = function03;
        this.$onCancelClick = function04;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WalletPaymentMethodMenuItem walletPaymentMethodMenuItem) {
        invoke2(walletPaymentMethodMenuItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(WalletPaymentMethodMenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof WalletPaymentMethodMenuItem.EditCard) {
            this.$onEditClick.invoke();
        } else if (item instanceof WalletPaymentMethodMenuItem.SetAsDefault) {
            this.$onSetDefaultClick.invoke();
        } else if (item instanceof WalletPaymentMethodMenuItem.RemoveItem) {
            this.$onRemoveClick.invoke();
        } else if (item instanceof WalletPaymentMethodMenuItem.Cancel) {
            this.$onCancelClick.invoke();
        }
    }
}
