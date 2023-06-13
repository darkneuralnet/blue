package com.stripe.android.paymentsheet;

import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentMethodsUIKt$PaymentMethodsUI$2$1$1$1 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ Function1<LpmRepository.SupportedPaymentMethod, Unit> $onItemSelectedListener;
    final /* synthetic */ List<LpmRepository.SupportedPaymentMethod> $paymentMethods;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodsUIKt$PaymentMethodsUI$2$1$1$1(Function1<? super LpmRepository.SupportedPaymentMethod, Unit> function1, List<LpmRepository.SupportedPaymentMethod> list) {
        super(1);
        this.$onItemSelectedListener = function1;
        this.$paymentMethods = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        this.$onItemSelectedListener.invoke(this.$paymentMethods.get(i));
    }
}
