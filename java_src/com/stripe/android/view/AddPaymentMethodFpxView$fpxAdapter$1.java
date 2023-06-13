package com.stripe.android.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AddPaymentMethodFpxView$fpxAdapter$1 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ AddPaymentMethodFpxView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodFpxView$fpxAdapter$1(AddPaymentMethodFpxView addPaymentMethodFpxView) {
        super(1);
        this.this$0 = addPaymentMethodFpxView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        FpxViewModel viewModel;
        viewModel = this.this$0.getViewModel();
        viewModel.setSelectedPosition$payments_core_release(Integer.valueOf(i));
    }
}
