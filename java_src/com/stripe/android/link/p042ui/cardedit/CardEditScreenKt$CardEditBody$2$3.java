package com.stripe.android.link.p042ui.cardedit;

import com.stripe.android.link.p042ui.wallet.PaymentDetailsResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.cardedit.CardEditScreenKt$CardEditBody$2$3 */
/* loaded from: classes7.dex */
public final class CardEditScreenKt$CardEditBody$2$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ CardEditViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardEditScreenKt$CardEditBody$2$3(CardEditViewModel cardEditViewModel) {
        super(0);
        this.$viewModel = cardEditViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.dismiss(PaymentDetailsResult.Cancelled.INSTANCE, true);
    }
}
