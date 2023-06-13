package com.stripe.android.paymentsheet.repositories;

import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/stripe/android/model/PaymentMethod;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository$detachPaymentMethod$2", m28418f = "CustomerApiRepository.kt", m28417i = {}, m28416l = {84}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class CustomerApiRepository$detachPaymentMethod$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super PaymentMethod>, Object> {
    final /* synthetic */ PaymentSheet.CustomerConfiguration $customerConfig;
    final /* synthetic */ String $paymentMethodId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CustomerApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerApiRepository$detachPaymentMethod$2(CustomerApiRepository customerApiRepository, String str, PaymentSheet.CustomerConfiguration customerConfiguration, Continuation<? super CustomerApiRepository$detachPaymentMethod$2> continuation) {
        super(2, continuation);
        this.this$0 = customerApiRepository;
        this.$paymentMethodId = str;
        this.$customerConfig = customerConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CustomerApiRepository$detachPaymentMethod$2 customerApiRepository$detachPaymentMethod$2 = new CustomerApiRepository$detachPaymentMethod$2(this.this$0, this.$paymentMethodId, this.$customerConfig, continuation);
        customerApiRepository$detachPaymentMethod$2.L$0 = obj;
        return customerApiRepository$detachPaymentMethod$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super PaymentMethod> continuation) {
        return ((CustomerApiRepository$detachPaymentMethod$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        Logger logger;
        StripeRepository stripeRepository;
        Y94 y94;
        Set<String> set;
        Y94 y942;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ZC0 zc0 = (ZC0) this.L$0;
                CustomerApiRepository customerApiRepository = this.this$0;
                String str = this.$paymentMethodId;
                PaymentSheet.CustomerConfiguration customerConfiguration = this.$customerConfig;
                Result.Companion companion = Result.Companion;
                stripeRepository = customerApiRepository.stripeRepository;
                y94 = customerApiRepository.lazyPaymentConfig;
                String publishableKey = ((PaymentConfiguration) y94.get()).getPublishableKey();
                set = customerApiRepository.productUsageTokens;
                String ephemeralKeySecret = customerConfiguration.getEphemeralKeySecret();
                y942 = customerApiRepository.lazyPaymentConfig;
                ApiRequest.Options options = new ApiRequest.Options(ephemeralKeySecret, ((PaymentConfiguration) y942.get()).getStripeAccountId(), null, 4, null);
                this.label = 1;
                obj = stripeRepository.detachPaymentMethod(publishableKey, set, str, options, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            m116783constructorimpl = Result.m116783constructorimpl((PaymentMethod) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        CustomerApiRepository customerApiRepository2 = this.this$0;
        String str2 = this.$paymentMethodId;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
            logger = customerApiRepository2.logger;
            logger.error("Failed to detach payment method " + str2 + InstructionFileId.DOT, m116786exceptionOrNullimpl);
        }
        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
            return null;
        }
        return m116783constructorimpl;
    }
}
