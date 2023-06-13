package com.stripe.android.googlepaylauncher;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.networking.StripeRepository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"LVs2;", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.googlepaylauncher.StripeGooglePayViewModel$createPaymentMethod$1", m28418f = "StripeGooglePayViewModel.kt", m28417i = {}, m28416l = {74}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class StripeGooglePayViewModel$createPaymentMethod$1 extends SuspendLambda implements Function2<InterfaceC36691Vs2<Result<? extends PaymentMethod>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentMethodCreateParams $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StripeGooglePayViewModel this$0;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.googlepaylauncher.StripeGooglePayViewModel$createPaymentMethod$1$1", m28418f = "StripeGooglePayViewModel.kt", m28417i = {}, m28416l = {78, 75}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.googlepaylauncher.StripeGooglePayViewModel$createPaymentMethod$1$1 */
    /* loaded from: classes7.dex */
    public static final class C189541 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC36691Vs2<Result<PaymentMethod>> $$this$liveData;
        final /* synthetic */ PaymentMethodCreateParams $params;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ StripeGooglePayViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189541(InterfaceC36691Vs2<Result<PaymentMethod>> interfaceC36691Vs2, StripeGooglePayViewModel stripeGooglePayViewModel, PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super C189541> continuation) {
            super(2, continuation);
            this.$$this$liveData = interfaceC36691Vs2;
            this.this$0 = stripeGooglePayViewModel;
            this.$params = paymentMethodCreateParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C189541 c189541 = new C189541(this.$$this$liveData, this.this$0, this.$params, continuation);
            c189541.L$0 = obj;
            return c189541;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C189541) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [Vs2] */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            Object m116783constructorimpl;
            InterfaceC36691Vs2<Result<PaymentMethod>> interfaceC36691Vs2;
            StripeRepository stripeRepository;
            String str;
            String str2;
            InterfaceC36691Vs2<Result<PaymentMethod>> interfaceC36691Vs22;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                interfaceC36691Vs2 = i;
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC36691Vs2<Result<PaymentMethod>> interfaceC36691Vs23 = (InterfaceC36691Vs2) this.L$0;
                ResultKt.throwOnFailure(obj);
                interfaceC36691Vs22 = interfaceC36691Vs23;
            } else {
                ResultKt.throwOnFailure(obj);
                ZC0 zc0 = (ZC0) this.L$0;
                InterfaceC36691Vs2<Result<PaymentMethod>> interfaceC36691Vs24 = this.$$this$liveData;
                StripeGooglePayViewModel stripeGooglePayViewModel = this.this$0;
                PaymentMethodCreateParams paymentMethodCreateParams = this.$params;
                Result.Companion companion2 = Result.Companion;
                stripeRepository = stripeGooglePayViewModel.stripeRepository;
                str = stripeGooglePayViewModel.publishableKey;
                str2 = stripeGooglePayViewModel.stripeAccountId;
                ApiRequest.Options options = new ApiRequest.Options(str, str2, null, 4, null);
                this.L$0 = interfaceC36691Vs24;
                this.label = 1;
                obj = stripeRepository.createPaymentMethod(paymentMethodCreateParams, options, this);
                interfaceC36691Vs22 = interfaceC36691Vs24;
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (obj != null) {
                m116783constructorimpl = Result.m116783constructorimpl((PaymentMethod) obj);
                interfaceC36691Vs2 = interfaceC36691Vs22;
                Result m116782boximpl = Result.m116782boximpl(m116783constructorimpl);
                this.L$0 = null;
                this.label = 2;
                if (interfaceC36691Vs2.emit(m116782boximpl, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeGooglePayViewModel$createPaymentMethod$1(StripeGooglePayViewModel stripeGooglePayViewModel, PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super StripeGooglePayViewModel$createPaymentMethod$1> continuation) {
        super(2, continuation);
        this.this$0 = stripeGooglePayViewModel;
        this.$params = paymentMethodCreateParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StripeGooglePayViewModel$createPaymentMethod$1 stripeGooglePayViewModel$createPaymentMethod$1 = new StripeGooglePayViewModel$createPaymentMethod$1(this.this$0, this.$params, continuation);
        stripeGooglePayViewModel$createPaymentMethod$1.L$0 = obj;
        return stripeGooglePayViewModel$createPaymentMethod$1;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC36691Vs2<Result<PaymentMethod>> interfaceC36691Vs2, Continuation<? super Unit> continuation) {
        return ((StripeGooglePayViewModel$createPaymentMethod$1) create(interfaceC36691Vs2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        CoroutineContext coroutineContext;
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
            coroutineContext = this.this$0.workContext;
            C189541 c189541 = new C189541((InterfaceC36691Vs2) this.L$0, this.this$0, this.$params, null);
            this.label = 1;
            if (X30.m77504g(coroutineContext, c189541, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC36691Vs2<Result<? extends PaymentMethod>> interfaceC36691Vs2, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC36691Vs2<Result<PaymentMethod>>) interfaceC36691Vs2, continuation);
    }
}
