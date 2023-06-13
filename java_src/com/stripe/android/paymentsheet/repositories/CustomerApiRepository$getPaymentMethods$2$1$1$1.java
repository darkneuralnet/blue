package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ListPaymentMethodsParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "Lcom/stripe/android/model/PaymentMethod;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository$getPaymentMethods$2$1$1$1", m28418f = "CustomerApiRepository.kt", m28417i = {}, m28416l = {55}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class CustomerApiRepository$getPaymentMethods$2$1$1$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super List<? extends PaymentMethod>>, Object> {
    final /* synthetic */ PaymentSheet.CustomerConfiguration $customerConfig;
    final /* synthetic */ PaymentMethod.Type $paymentMethodType;
    int label;
    final /* synthetic */ CustomerApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerApiRepository$getPaymentMethods$2$1$1$1(CustomerApiRepository customerApiRepository, PaymentSheet.CustomerConfiguration customerConfiguration, PaymentMethod.Type type, Continuation<? super CustomerApiRepository$getPaymentMethods$2$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = customerApiRepository;
        this.$customerConfig = customerConfiguration;
        this.$paymentMethodType = type;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CustomerApiRepository$getPaymentMethods$2$1$1$1(this.this$0, this.$customerConfig, this.$paymentMethodType, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(ZC0 zc0, Continuation<? super List<PaymentMethod>> continuation) {
        return ((CustomerApiRepository$getPaymentMethods$2$1$1$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        StripeRepository stripeRepository;
        Y94 y94;
        Set<String> set;
        Y94 y942;
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
            stripeRepository = this.this$0.stripeRepository;
            ListPaymentMethodsParams listPaymentMethodsParams = new ListPaymentMethodsParams(this.$customerConfig.getId(), this.$paymentMethodType, null, null, null, 28, null);
            y94 = this.this$0.lazyPaymentConfig;
            String publishableKey = ((PaymentConfiguration) y94.get()).getPublishableKey();
            set = this.this$0.productUsageTokens;
            String ephemeralKeySecret = this.$customerConfig.getEphemeralKeySecret();
            y942 = this.this$0.lazyPaymentConfig;
            ApiRequest.Options options = new ApiRequest.Options(ephemeralKeySecret, ((PaymentConfiguration) y942.get()).getStripeAccountId(), null, 4, null);
            this.label = 1;
            obj = stripeRepository.getPaymentMethods(listPaymentMethodsParams, publishableKey, set, options, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super List<? extends PaymentMethod>> continuation) {
        return invoke2(zc0, (Continuation<? super List<PaymentMethod>>) continuation);
    }
}
