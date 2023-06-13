package com.stripe.android;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.CreateIntentCallback;
import com.stripe.android.IntentConfirmationInterceptor;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeRepository;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0002\u0010\nJ\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J,\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0082@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b \u0010!J+\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0082@ø\u0001\u0002¢\u0006\u0002\u0010&J3\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0082@ø\u0001\u0002¢\u0006\u0002\u0010+J7\u0010,\u001a\u00020#2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096@ø\u0001\u0002¢\u0006\u0002\u0010-J7\u0010,\u001a\u00020#2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096@ø\u0001\u0002¢\u0006\u0002\u0010.J*\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u001e2\u0006\u0010\u0014\u001a\u00020\bH\u0082@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b1\u00102R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00063"}, m28432d2 = {"Lcom/stripe/android/DefaultIntentConfirmationInterceptor;", "Lcom/stripe/android/IntentConfirmationInterceptor;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeAccountIdProvider", "(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "genericErrorMessage", "getGenericErrorMessage", "()Ljava/lang/String;", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "getRequestOptions", "()Lcom/stripe/android/core/networking/ApiRequest$Options;", "createConfirmStep", "Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;", "clientSecret", NamedConstantsKt.SHIPPING_VALUES, "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "setupForFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "createPaymentMethod", "Lkotlin/Result;", "params", "createPaymentMethod-gIAlu-s", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleClientSideConfirmation", "Lcom/stripe/android/IntentConfirmationInterceptor$NextStep;", "createIntentCallback", "Lcom/stripe/android/CreateIntentCallback;", "(Lcom/stripe/android/CreateIntentCallback;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleServerSideConfirmation", "Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;", "shouldSavePaymentMethod", "", "(Lcom/stripe/android/CreateIntentCallbackForServerSideConfirmation;Lcom/stripe/android/model/PaymentMethod;ZLcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercept", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveStripeIntent", "Lcom/stripe/android/model/StripeIntent;", "retrieveStripeIntent-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class DefaultIntentConfirmationInterceptor implements IntentConfirmationInterceptor {
    public static final int $stable = 8;
    private final Context context;
    private final Function0<String> publishableKeyProvider;
    private final Function0<String> stripeAccountIdProvider;
    private final StripeRepository stripeRepository;

    public DefaultIntentConfirmationInterceptor(Context context, StripeRepository stripeRepository, Function0<String> publishableKeyProvider, Function0<String> stripeAccountIdProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(stripeAccountIdProvider, "stripeAccountIdProvider");
        this.context = context;
        this.stripeRepository = stripeRepository;
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeAccountIdProvider = stripeAccountIdProvider;
    }

    private final IntentConfirmationInterceptor.NextStep.Confirm createConfirmStep(String str, ConfirmPaymentIntentParams.Shipping shipping, PaymentMethod paymentMethod) {
        return new IntentConfirmationInterceptor.NextStep.Confirm(ConfirmStripeIntentParamsFactory.Companion.createFactory(str, shipping).create(paymentMethod));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:11:0x0025, B:19:0x0045, B:21:0x0049, B:22:0x004e, B:23:0x005d, B:16:0x0034), top: B:27:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:11:0x0025, B:19:0x0045, B:21:0x0049, B:22:0x004e, B:23:0x005d, B:16:0x0034), top: B:27:0x0021 }] */
    /* renamed from: createPaymentMethod-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116339createPaymentMethodgIAlus(PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super Result<PaymentMethod>> continuation) {
        DefaultIntentConfirmationInterceptor$createPaymentMethod$1 defaultIntentConfirmationInterceptor$createPaymentMethod$1;
        Object coroutine_suspended;
        int i;
        PaymentMethod paymentMethod;
        try {
            if (continuation instanceof DefaultIntentConfirmationInterceptor$createPaymentMethod$1) {
                defaultIntentConfirmationInterceptor$createPaymentMethod$1 = (DefaultIntentConfirmationInterceptor$createPaymentMethod$1) continuation;
                int i2 = defaultIntentConfirmationInterceptor$createPaymentMethod$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    defaultIntentConfirmationInterceptor$createPaymentMethod$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = defaultIntentConfirmationInterceptor$createPaymentMethod$1.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = defaultIntentConfirmationInterceptor$createPaymentMethod$1.label;
                    if (i == 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.Companion;
                        StripeRepository stripeRepository = this.stripeRepository;
                        ApiRequest.Options requestOptions = getRequestOptions();
                        defaultIntentConfirmationInterceptor$createPaymentMethod$1.label = 1;
                        obj = stripeRepository.createPaymentMethod(paymentMethodCreateParams, requestOptions, defaultIntentConfirmationInterceptor$createPaymentMethod$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    paymentMethod = (PaymentMethod) obj;
                    if (paymentMethod == null) {
                        return Result.m116783constructorimpl(paymentMethod);
                    }
                    throw new APIException(null, null, 0, "Couldn't parse response when creating payment method", null, 23, null);
                }
            }
            if (i == 0) {
            }
            paymentMethod = (PaymentMethod) obj;
            if (paymentMethod == null) {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        defaultIntentConfirmationInterceptor$createPaymentMethod$1 = new DefaultIntentConfirmationInterceptor$createPaymentMethod$1(this, continuation);
        Object obj2 = defaultIntentConfirmationInterceptor$createPaymentMethod$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultIntentConfirmationInterceptor$createPaymentMethod$1.label;
    }

    private final String getGenericErrorMessage() {
        String string = this.context.getString(C18606R.string.unable_to_complete_operation);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…le_to_complete_operation)");
        return string;
    }

    private final ApiRequest.Options getRequestOptions() {
        return new ApiRequest.Options(this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleClientSideConfirmation(CreateIntentCallback createIntentCallback, PaymentMethod paymentMethod, ConfirmPaymentIntentParams.Shipping shipping, Continuation<? super IntentConfirmationInterceptor.NextStep> continuation) {
        C18600x23f0671d c18600x23f0671d;
        Object coroutine_suspended;
        int i;
        DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor;
        CreateIntentCallback.Result result;
        if (continuation instanceof C18600x23f0671d) {
            c18600x23f0671d = (C18600x23f0671d) continuation;
            int i2 = c18600x23f0671d.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c18600x23f0671d.label = i2 - Integer.MIN_VALUE;
                Object obj = c18600x23f0671d.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c18600x23f0671d.label;
                if (i == 0) {
                    if (i == 1) {
                        shipping = (ConfirmPaymentIntentParams.Shipping) c18600x23f0671d.L$2;
                        paymentMethod = (PaymentMethod) c18600x23f0671d.L$1;
                        defaultIntentConfirmationInterceptor = (DefaultIntentConfirmationInterceptor) c18600x23f0671d.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    String str = paymentMethod.f75358id;
                    Intrinsics.checkNotNull(str);
                    c18600x23f0671d.L$0 = this;
                    c18600x23f0671d.L$1 = paymentMethod;
                    c18600x23f0671d.L$2 = shipping;
                    c18600x23f0671d.label = 1;
                    obj = createIntentCallback.onCreateIntent(str, c18600x23f0671d);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    defaultIntentConfirmationInterceptor = this;
                }
                result = (CreateIntentCallback.Result) obj;
                if (!(result instanceof CreateIntentCallback.Result.Success)) {
                    return defaultIntentConfirmationInterceptor.createConfirmStep(((CreateIntentCallback.Result.Success) result).getClientSecret(), shipping, paymentMethod);
                }
                if (result instanceof CreateIntentCallback.Result.Failure) {
                    CreateIntentCallback.Result.Failure failure = (CreateIntentCallback.Result.Failure) result;
                    Exception cause$payments_core_release = failure.getCause$payments_core_release();
                    String displayMessage$payments_core_release = failure.getDisplayMessage$payments_core_release();
                    if (displayMessage$payments_core_release == null) {
                        displayMessage$payments_core_release = defaultIntentConfirmationInterceptor.getGenericErrorMessage();
                    }
                    return new IntentConfirmationInterceptor.NextStep.Fail(cause$payments_core_release, displayMessage$payments_core_release);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        c18600x23f0671d = new C18600x23f0671d(this, continuation);
        Object obj2 = c18600x23f0671d.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c18600x23f0671d.label;
        if (i == 0) {
        }
        result = (CreateIntentCallback.Result) obj2;
        if (!(result instanceof CreateIntentCallback.Result.Success)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleServerSideConfirmation(CreateIntentCallbackForServerSideConfirmation createIntentCallbackForServerSideConfirmation, PaymentMethod paymentMethod, boolean z, ConfirmPaymentIntentParams.Shipping shipping, Continuation<? super IntentConfirmationInterceptor.NextStep> continuation) {
        C18601xad84b495 c18601xad84b495;
        Object coroutine_suspended;
        int i;
        ConfirmPaymentIntentParams.Shipping shipping2;
        DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor;
        CreateIntentCallback.Result result;
        Object m116340retrieveStripeIntentgIAlus;
        ConfirmPaymentIntentParams.Shipping shipping3;
        CreateIntentCallback.Result result2;
        PaymentMethod paymentMethod2;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof C18601xad84b495) {
            c18601xad84b495 = (C18601xad84b495) continuation;
            int i2 = c18601xad84b495.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c18601xad84b495.label = i2 - Integer.MIN_VALUE;
                Object obj = c18601xad84b495.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c18601xad84b495.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            result2 = (CreateIntentCallback.Result) c18601xad84b495.L$3;
                            shipping3 = (ConfirmPaymentIntentParams.Shipping) c18601xad84b495.L$2;
                            paymentMethod2 = (PaymentMethod) c18601xad84b495.L$1;
                            defaultIntentConfirmationInterceptor = (DefaultIntentConfirmationInterceptor) c18601xad84b495.L$0;
                            ResultKt.throwOnFailure(obj);
                            m116340retrieveStripeIntentgIAlus = ((Result) obj).m116792unboximpl();
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116340retrieveStripeIntentgIAlus);
                            if (m116786exceptionOrNullimpl != null) {
                                StripeIntent stripeIntent = (StripeIntent) m116340retrieveStripeIntentgIAlus;
                                if (stripeIntent.isConfirmed()) {
                                    return new IntentConfirmationInterceptor.NextStep.Complete(stripeIntent);
                                }
                                if (stripeIntent.getStatus() == StripeIntent.Status.RequiresAction) {
                                    return new IntentConfirmationInterceptor.NextStep.HandleNextAction(((CreateIntentCallback.Result.Success) result2).getClientSecret());
                                }
                                return defaultIntentConfirmationInterceptor.createConfirmStep(((CreateIntentCallback.Result.Success) result2).getClientSecret(), shipping3, paymentMethod2);
                            }
                            return new IntentConfirmationInterceptor.NextStep.Fail(m116786exceptionOrNullimpl, defaultIntentConfirmationInterceptor.getGenericErrorMessage());
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ConfirmPaymentIntentParams.Shipping shipping4 = (ConfirmPaymentIntentParams.Shipping) c18601xad84b495.L$2;
                    paymentMethod = (PaymentMethod) c18601xad84b495.L$1;
                    ResultKt.throwOnFailure(obj);
                    defaultIntentConfirmationInterceptor = (DefaultIntentConfirmationInterceptor) c18601xad84b495.L$0;
                    shipping2 = shipping4;
                } else {
                    ResultKt.throwOnFailure(obj);
                    String str = paymentMethod.f75358id;
                    Intrinsics.checkNotNull(str);
                    c18601xad84b495.L$0 = this;
                    c18601xad84b495.L$1 = paymentMethod;
                    c18601xad84b495.L$2 = shipping;
                    c18601xad84b495.label = 1;
                    obj = createIntentCallbackForServerSideConfirmation.onCreateIntent(str, z, c18601xad84b495);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    shipping2 = shipping;
                    defaultIntentConfirmationInterceptor = this;
                }
                result = (CreateIntentCallback.Result) obj;
                if (!(result instanceof CreateIntentCallback.Result.Success)) {
                    String clientSecret = ((CreateIntentCallback.Result.Success) result).getClientSecret();
                    c18601xad84b495.L$0 = defaultIntentConfirmationInterceptor;
                    c18601xad84b495.L$1 = paymentMethod;
                    c18601xad84b495.L$2 = shipping2;
                    c18601xad84b495.L$3 = result;
                    c18601xad84b495.label = 2;
                    m116340retrieveStripeIntentgIAlus = defaultIntentConfirmationInterceptor.m116340retrieveStripeIntentgIAlus(clientSecret, c18601xad84b495);
                    if (m116340retrieveStripeIntentgIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    PaymentMethod paymentMethod3 = paymentMethod;
                    shipping3 = shipping2;
                    result2 = result;
                    paymentMethod2 = paymentMethod3;
                    m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116340retrieveStripeIntentgIAlus);
                    if (m116786exceptionOrNullimpl != null) {
                    }
                } else if (result instanceof CreateIntentCallback.Result.Failure) {
                    CreateIntentCallback.Result.Failure failure = (CreateIntentCallback.Result.Failure) result;
                    Exception cause$payments_core_release = failure.getCause$payments_core_release();
                    String displayMessage$payments_core_release = failure.getDisplayMessage$payments_core_release();
                    if (displayMessage$payments_core_release == null) {
                        displayMessage$payments_core_release = defaultIntentConfirmationInterceptor.getGenericErrorMessage();
                    }
                    return new IntentConfirmationInterceptor.NextStep.Fail(cause$payments_core_release, displayMessage$payments_core_release);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        c18601xad84b495 = new C18601xad84b495(this, continuation);
        Object obj2 = c18601xad84b495.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c18601xad84b495.label;
        if (i == 0) {
        }
        result = (CreateIntentCallback.Result) obj2;
        if (!(result instanceof CreateIntentCallback.Result.Success)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* renamed from: retrieveStripeIntent-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116340retrieveStripeIntentgIAlus(String str, Continuation<? super Result<? extends StripeIntent>> continuation) {
        DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1 defaultIntentConfirmationInterceptor$retrieveStripeIntent$1;
        Object coroutine_suspended;
        int i;
        try {
            if (continuation instanceof DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1) {
                defaultIntentConfirmationInterceptor$retrieveStripeIntent$1 = (DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1) continuation;
                int i2 = defaultIntentConfirmationInterceptor$retrieveStripeIntent$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    defaultIntentConfirmationInterceptor$retrieveStripeIntent$1.label = i2 - Integer.MIN_VALUE;
                    DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1 defaultIntentConfirmationInterceptor$retrieveStripeIntent$12 = defaultIntentConfirmationInterceptor$retrieveStripeIntent$1;
                    Object obj = defaultIntentConfirmationInterceptor$retrieveStripeIntent$12.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = defaultIntentConfirmationInterceptor$retrieveStripeIntent$12.label;
                    if (i == 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.Companion;
                        StripeRepository stripeRepository = this.stripeRepository;
                        ApiRequest.Options requestOptions = getRequestOptions();
                        defaultIntentConfirmationInterceptor$retrieveStripeIntent$12.label = 1;
                        obj = StripeRepository.retrieveStripeIntent$payments_core_release$default(stripeRepository, str, requestOptions, null, defaultIntentConfirmationInterceptor$retrieveStripeIntent$12, 4, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Result.m116783constructorimpl((StripeIntent) obj);
                }
            }
            if (i == 0) {
            }
            return Result.m116783constructorimpl((StripeIntent) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        defaultIntentConfirmationInterceptor$retrieveStripeIntent$1 = new DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1(this, continuation);
        DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1 defaultIntentConfirmationInterceptor$retrieveStripeIntent$122 = defaultIntentConfirmationInterceptor$retrieveStripeIntent$1;
        Object obj2 = defaultIntentConfirmationInterceptor$retrieveStripeIntent$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultIntentConfirmationInterceptor$retrieveStripeIntent$122.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    @Override // com.stripe.android.IntentConfirmationInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object intercept(String str, PaymentMethodCreateParams paymentMethodCreateParams, ConfirmPaymentIntentParams.Shipping shipping, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, Continuation<? super IntentConfirmationInterceptor.NextStep> continuation) {
        DefaultIntentConfirmationInterceptor$intercept$1 defaultIntentConfirmationInterceptor$intercept$1;
        Object coroutine_suspended;
        int i;
        Object m116339createPaymentMethodgIAlus;
        DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof DefaultIntentConfirmationInterceptor$intercept$1) {
            defaultIntentConfirmationInterceptor$intercept$1 = (DefaultIntentConfirmationInterceptor$intercept$1) continuation;
            int i2 = defaultIntentConfirmationInterceptor$intercept$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultIntentConfirmationInterceptor$intercept$1.label = i2 - Integer.MIN_VALUE;
                DefaultIntentConfirmationInterceptor$intercept$1 defaultIntentConfirmationInterceptor$intercept$12 = defaultIntentConfirmationInterceptor$intercept$1;
                Object obj = defaultIntentConfirmationInterceptor$intercept$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultIntentConfirmationInterceptor$intercept$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (str != null) {
                        return createConfirmStep(str, shipping, paymentMethodCreateParams, setupFutureUsage);
                    }
                    defaultIntentConfirmationInterceptor$intercept$12.L$0 = this;
                    defaultIntentConfirmationInterceptor$intercept$12.L$1 = shipping;
                    defaultIntentConfirmationInterceptor$intercept$12.L$2 = setupFutureUsage;
                    defaultIntentConfirmationInterceptor$intercept$12.label = 1;
                    m116339createPaymentMethodgIAlus = m116339createPaymentMethodgIAlus(paymentMethodCreateParams, defaultIntentConfirmationInterceptor$intercept$12);
                    if (m116339createPaymentMethodgIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    defaultIntentConfirmationInterceptor = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return (IntentConfirmationInterceptor.NextStep) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    setupFutureUsage = (ConfirmPaymentIntentParams.SetupFutureUsage) defaultIntentConfirmationInterceptor$intercept$12.L$2;
                    shipping = (ConfirmPaymentIntentParams.Shipping) defaultIntentConfirmationInterceptor$intercept$12.L$1;
                    ResultKt.throwOnFailure(obj);
                    m116339createPaymentMethodgIAlus = ((Result) obj).m116792unboximpl();
                    defaultIntentConfirmationInterceptor = (DefaultIntentConfirmationInterceptor) defaultIntentConfirmationInterceptor$intercept$12.L$0;
                }
                ConfirmPaymentIntentParams.Shipping shipping2 = shipping;
                ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage2 = setupFutureUsage;
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116339createPaymentMethodgIAlus);
                if (m116786exceptionOrNullimpl != null) {
                    defaultIntentConfirmationInterceptor$intercept$12.L$0 = null;
                    defaultIntentConfirmationInterceptor$intercept$12.L$1 = null;
                    defaultIntentConfirmationInterceptor$intercept$12.L$2 = null;
                    defaultIntentConfirmationInterceptor$intercept$12.label = 2;
                    obj = defaultIntentConfirmationInterceptor.intercept((String) null, (PaymentMethod) m116339createPaymentMethodgIAlus, shipping2, setupFutureUsage2, defaultIntentConfirmationInterceptor$intercept$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return (IntentConfirmationInterceptor.NextStep) obj;
                }
                return new IntentConfirmationInterceptor.NextStep.Fail(m116786exceptionOrNullimpl, defaultIntentConfirmationInterceptor.getGenericErrorMessage());
            }
        }
        defaultIntentConfirmationInterceptor$intercept$1 = new DefaultIntentConfirmationInterceptor$intercept$1(this, continuation);
        DefaultIntentConfirmationInterceptor$intercept$1 defaultIntentConfirmationInterceptor$intercept$122 = defaultIntentConfirmationInterceptor$intercept$1;
        Object obj2 = defaultIntentConfirmationInterceptor$intercept$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultIntentConfirmationInterceptor$intercept$122.label;
        if (i != 0) {
        }
        ConfirmPaymentIntentParams.Shipping shipping22 = shipping;
        ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage22 = setupFutureUsage;
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116339createPaymentMethodgIAlus);
        if (m116786exceptionOrNullimpl != null) {
        }
    }

    private final IntentConfirmationInterceptor.NextStep.Confirm createConfirmStep(String str, ConfirmPaymentIntentParams.Shipping shipping, PaymentMethodCreateParams paymentMethodCreateParams, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
        return new IntentConfirmationInterceptor.NextStep.Confirm(ConfirmStripeIntentParamsFactory.Companion.createFactory(str, shipping).create(paymentMethodCreateParams, setupFutureUsage));
    }

    @Override // com.stripe.android.IntentConfirmationInterceptor
    public Object intercept(String str, PaymentMethod paymentMethod, ConfirmPaymentIntentParams.Shipping shipping, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, Continuation<? super IntentConfirmationInterceptor.NextStep> continuation) {
        if (str != null) {
            return createConfirmStep(str, shipping, paymentMethod);
        }
        AbsCreateIntentCallback createIntentCallback = IntentConfirmationInterceptor.Companion.getCreateIntentCallback();
        if (createIntentCallback instanceof CreateIntentCallbackForServerSideConfirmation) {
            return handleServerSideConfirmation((CreateIntentCallbackForServerSideConfirmation) createIntentCallback, paymentMethod, setupFutureUsage == ConfirmPaymentIntentParams.SetupFutureUsage.OffSession, shipping, continuation);
        } else if (createIntentCallback instanceof CreateIntentCallback) {
            return handleClientSideConfirmation((CreateIntentCallback) createIntentCallback, paymentMethod, shipping, continuation);
        } else {
            String simpleName = CreateIntentCallback.class.getSimpleName();
            throw new IllegalStateException((simpleName + " must be implemented when using IntentConfiguration with PaymentSheet").toString());
        }
    }
}
