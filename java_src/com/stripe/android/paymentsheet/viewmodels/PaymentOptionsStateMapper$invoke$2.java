package com.stripe.android.paymentsheet.viewmodels;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class PaymentOptionsStateMapper$invoke$2 extends AdaptedFunctionReference implements Function4<List<? extends PaymentMethod>, PaymentSelection, SavedSelection, Continuation<? super Triple<? extends List<? extends PaymentMethod>, ? extends PaymentSelection, ? extends SavedSelection>>, Object>, SuspendFunction {
    public static final PaymentOptionsStateMapper$invoke$2 INSTANCE = new PaymentOptionsStateMapper$invoke$2();

    public PaymentOptionsStateMapper$invoke$2() {
        super(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(List<? extends PaymentMethod> list, PaymentSelection paymentSelection, SavedSelection savedSelection, Continuation<? super Triple<? extends List<? extends PaymentMethod>, ? extends PaymentSelection, ? extends SavedSelection>> continuation) {
        return invoke2((List<PaymentMethod>) list, paymentSelection, savedSelection, (Continuation<? super Triple<? extends List<PaymentMethod>, ? extends PaymentSelection, ? extends SavedSelection>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(List<PaymentMethod> list, PaymentSelection paymentSelection, SavedSelection savedSelection, Continuation<? super Triple<? extends List<PaymentMethod>, ? extends PaymentSelection, ? extends SavedSelection>> continuation) {
        Object invoke$lambda$0;
        invoke$lambda$0 = PaymentOptionsStateMapper.invoke$lambda$0(list, paymentSelection, savedSelection, continuation);
        return invoke$lambda$0;
    }
}
