package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeRepository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J2\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "(Lcom/stripe/android/networking/StripeRepository;)V", "invoke", "Lkotlin/Result;", "Lcom/stripe/android/model/StripeIntent;", "publishableKey", "", "clientSecret", "invoke-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class RetrieveStripeIntent {
    private final StripeRepository stripeRepository;

    public RetrieveStripeIntent(StripeRepository stripeRepository) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* renamed from: invoke-0E7RQCE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116584invoke0E7RQCE(String str, String str2, Continuation<? super Result<? extends StripeIntent>> continuation) {
        RetrieveStripeIntent$invoke$1 retrieveStripeIntent$invoke$1;
        Object coroutine_suspended;
        int i;
        try {
            if (continuation instanceof RetrieveStripeIntent$invoke$1) {
                retrieveStripeIntent$invoke$1 = (RetrieveStripeIntent$invoke$1) continuation;
                int i2 = retrieveStripeIntent$invoke$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    retrieveStripeIntent$invoke$1.label = i2 - Integer.MIN_VALUE;
                    RetrieveStripeIntent$invoke$1 retrieveStripeIntent$invoke$12 = retrieveStripeIntent$invoke$1;
                    Object obj = retrieveStripeIntent$invoke$12.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = retrieveStripeIntent$invoke$12.label;
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
                        ApiRequest.Options options = new ApiRequest.Options(str, null, null, 6, null);
                        retrieveStripeIntent$invoke$12.label = 1;
                        obj = StripeRepository.retrieveStripeIntent$payments_core_release$default(stripeRepository, str2, options, null, retrieveStripeIntent$invoke$12, 4, null);
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
        retrieveStripeIntent$invoke$1 = new RetrieveStripeIntent$invoke$1(this, continuation);
        RetrieveStripeIntent$invoke$1 retrieveStripeIntent$invoke$122 = retrieveStripeIntent$invoke$1;
        Object obj2 = retrieveStripeIntent$invoke$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = retrieveStripeIntent$invoke$122.label;
    }
}
