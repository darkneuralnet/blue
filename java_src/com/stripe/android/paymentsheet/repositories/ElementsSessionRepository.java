package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.ElementsSessionParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0001\u0002\f\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;", "", "()V", "get", "Lcom/stripe/android/model/ElementsSession;", "initializationMode", "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Api", "Static", "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;", "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Static;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class ElementsSessionRepository {

    @Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;", "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;", "Lcom/stripe/android/model/ElementsSessionParams;", "params", "Lcom/stripe/android/model/ElementsSession;", "fallback", "(Lcom/stripe/android/model/ElementsSessionParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;", "initializationMode", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "configuration", "get", "(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "LY94;", "Lcom/stripe/android/PaymentConfiguration;", "lazyPaymentConfig", "LY94;", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "getRequestOptions", "()Lcom/stripe/android/core/networking/ApiRequest$Options;", "requestOptions", "<init>", "(Lcom/stripe/android/networking/StripeRepository;LY94;Lkotlin/coroutines/CoroutineContext;)V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Api extends ElementsSessionRepository {
        public static final int $stable = 8;
        private final Y94<PaymentConfiguration> lazyPaymentConfig;
        private final StripeRepository stripeRepository;
        private final CoroutineContext workContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Api(StripeRepository stripeRepository, Y94<PaymentConfiguration> lazyPaymentConfig, @IOContext CoroutineContext workContext) {
            super(null);
            Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
            Intrinsics.checkNotNullParameter(lazyPaymentConfig, "lazyPaymentConfig");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            this.stripeRepository = stripeRepository;
            this.lazyPaymentConfig = lazyPaymentConfig;
            this.workContext = workContext;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object fallback(ElementsSessionParams elementsSessionParams, Continuation<? super ElementsSession> continuation) {
            return X30.m77504g(this.workContext, new ElementsSessionRepository$Api$fallback$2(elementsSessionParams, this, null), continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ApiRequest.Options getRequestOptions() {
            return new ApiRequest.Options(this.lazyPaymentConfig.get().getPublishableKey(), this.lazyPaymentConfig.get().getStripeAccountId(), null, 4, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x009c A[ORIG_RETURN, RETURN] */
        @Override // com.stripe.android.paymentsheet.repositories.ElementsSessionRepository
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object get(PaymentSheet.InitializationMode initializationMode, PaymentSheet.Configuration configuration, Continuation<? super ElementsSession> continuation) {
            ElementsSessionRepository$Api$get$1 elementsSessionRepository$Api$get$1;
            Object coroutine_suspended;
            int i;
            ElementsSessionParams elementsSessionParams;
            Api api;
            Object m116783constructorimpl;
            ElementsSession elementsSession;
            if (continuation instanceof ElementsSessionRepository$Api$get$1) {
                elementsSessionRepository$Api$get$1 = (ElementsSessionRepository$Api$get$1) continuation;
                int i2 = elementsSessionRepository$Api$get$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    elementsSessionRepository$Api$get$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = elementsSessionRepository$Api$get$1.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = elementsSessionRepository$Api$get$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                ResultKt.throwOnFailure(obj);
                                if (obj == null) {
                                    return (ElementsSession) obj;
                                }
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        elementsSessionParams = (ElementsSessionParams) elementsSessionRepository$Api$get$1.L$1;
                        api = (Api) elementsSessionRepository$Api$get$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th) {
                            th = th;
                            Result.Companion companion = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                            }
                            elementsSession = (ElementsSession) m116783constructorimpl;
                            if (elementsSession != null) {
                            }
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        elementsSessionParams = ElementsSessionRepositoryKt.toElementsSessionParams(initializationMode, configuration);
                        try {
                            Result.Companion companion2 = Result.Companion;
                            StripeRepository stripeRepository = this.stripeRepository;
                            ApiRequest.Options requestOptions = getRequestOptions();
                            elementsSessionRepository$Api$get$1.L$0 = this;
                            elementsSessionRepository$Api$get$1.L$1 = elementsSessionParams;
                            elementsSessionRepository$Api$get$1.label = 1;
                            obj = stripeRepository.retrieveElementsSession(elementsSessionParams, requestOptions, elementsSessionRepository$Api$get$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            api = this;
                        } catch (Throwable th2) {
                            th = th2;
                            api = this;
                            Result.Companion companion3 = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                            }
                            elementsSession = (ElementsSession) m116783constructorimpl;
                            if (elementsSession != null) {
                            }
                        }
                    }
                    m116783constructorimpl = Result.m116783constructorimpl((ElementsSession) obj);
                    if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                        m116783constructorimpl = null;
                    }
                    elementsSession = (ElementsSession) m116783constructorimpl;
                    if (elementsSession != null) {
                        elementsSessionRepository$Api$get$1.L$0 = null;
                        elementsSessionRepository$Api$get$1.L$1 = null;
                        elementsSessionRepository$Api$get$1.label = 2;
                        obj = api.fallback(elementsSessionParams, elementsSessionRepository$Api$get$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (obj == null) {
                        }
                    } else {
                        return elementsSession;
                    }
                }
            }
            elementsSessionRepository$Api$get$1 = new ElementsSessionRepository$Api$get$1(this, continuation);
            Object obj2 = elementsSessionRepository$Api$get$1.result;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = elementsSessionRepository$Api$get$1.label;
            if (i == 0) {
            }
            m116783constructorimpl = Result.m116783constructorimpl((ElementsSession) obj2);
            if (Result.m116789isFailureimpl(m116783constructorimpl)) {
            }
            elementsSession = (ElementsSession) m116783constructorimpl;
            if (elementsSession != null) {
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Static;", "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "(Lcom/stripe/android/model/StripeIntent;)V", "get", "Lcom/stripe/android/model/ElementsSession;", "initializationMode", "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Static extends ElementsSessionRepository {
        public static final int $stable = 8;
        private final StripeIntent stripeIntent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Static(StripeIntent stripeIntent) {
            super(null);
            Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
            this.stripeIntent = stripeIntent;
        }

        @Override // com.stripe.android.paymentsheet.repositories.ElementsSessionRepository
        public Object get(PaymentSheet.InitializationMode initializationMode, PaymentSheet.Configuration configuration, Continuation<? super ElementsSession> continuation) {
            return new ElementsSession(null, null, this.stripeIntent);
        }
    }

    public /* synthetic */ ElementsSessionRepository(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object get(PaymentSheet.InitializationMode initializationMode, PaymentSheet.Configuration configuration, Continuation<? super ElementsSession> continuation);

    private ElementsSessionRepository() {
    }
}
