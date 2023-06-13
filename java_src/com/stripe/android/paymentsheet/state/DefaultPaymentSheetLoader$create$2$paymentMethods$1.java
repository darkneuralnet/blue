package com.stripe.android.paymentsheet.state;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheet;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "Lcom/stripe/android/model/PaymentMethod;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader$create$2$paymentMethods$1", m28418f = "PaymentSheetLoader.kt", m28417i = {}, m28416l = {123}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class DefaultPaymentSheetLoader$create$2$paymentMethods$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super List<? extends PaymentMethod>>, Object> {
    final /* synthetic */ PaymentSheet.Configuration $config;
    final /* synthetic */ PaymentSheet.CustomerConfiguration $customerConfig;
    final /* synthetic */ StripeIntent $stripeIntent;
    int label;
    final /* synthetic */ DefaultPaymentSheetLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaymentSheetLoader$create$2$paymentMethods$1(PaymentSheet.CustomerConfiguration customerConfiguration, DefaultPaymentSheetLoader defaultPaymentSheetLoader, StripeIntent stripeIntent, PaymentSheet.Configuration configuration, Continuation<? super DefaultPaymentSheetLoader$create$2$paymentMethods$1> continuation) {
        super(2, continuation);
        this.$customerConfig = customerConfiguration;
        this.this$0 = defaultPaymentSheetLoader;
        this.$stripeIntent = stripeIntent;
        this.$config = configuration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultPaymentSheetLoader$create$2$paymentMethods$1(this.$customerConfig, this.this$0, this.$stripeIntent, this.$config, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(ZC0 zc0, Continuation<? super List<PaymentMethod>> continuation) {
        return ((DefaultPaymentSheetLoader$create$2$paymentMethods$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        List emptyList;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            PaymentSheet.CustomerConfiguration customerConfiguration = this.$customerConfig;
            if (customerConfiguration != null) {
                DefaultPaymentSheetLoader defaultPaymentSheetLoader = this.this$0;
                StripeIntent stripeIntent = this.$stripeIntent;
                PaymentSheet.Configuration configuration = this.$config;
                this.label = 1;
                obj = defaultPaymentSheetLoader.retrieveCustomerPaymentMethods(stripeIntent, configuration, customerConfiguration, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return emptyList;
            }
        }
        return (List) obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super List<? extends PaymentMethod>> continuation) {
        return invoke2(zc0, (Continuation<? super List<PaymentMethod>>) continuation);
    }
}
