package com.stripe.android;

import com.stripe.android.model.Customer;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", PaymentSheetEvent.FIELD_CUSTOMER, "Lcom/stripe/android/model/Customer;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class CustomerSession$operationExecutor$1 extends Lambda implements Function1<Customer, Unit> {
    final /* synthetic */ CustomerSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerSession$operationExecutor$1(CustomerSession customerSession) {
        super(1);
        this.this$0 = customerSession;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Customer customer) {
        invoke2(customer);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Customer customer) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(customer, "customer");
        this.this$0.setCustomer$payments_core_release(customer);
        CustomerSession customerSession = this.this$0;
        function0 = customerSession.timeSupplier;
        customerSession.setCustomerCacheTime$payments_core_release(((Number) function0.invoke()).longValue());
    }
}
