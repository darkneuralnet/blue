package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.stripe3ds2.transaction.AuthenticationRequestParameters;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$2", m28418f = "Stripe3ds2TransactionViewModel.kt", m28417i = {}, m28416l = {149, 166}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$2 */
/* loaded from: classes7.dex */
public final class C19118xd40f3935 extends SuspendLambda implements Function2<ZC0, Continuation<? super Stripe3ds2AuthResult>, Object> {
    final /* synthetic */ ApiRequest.Options $requestOptions;
    final /* synthetic */ Stripe3ds2Fingerprint $stripe3ds2Fingerprint;
    final /* synthetic */ int $timeout;
    final /* synthetic */ Transaction $transaction;
    int label;
    final /* synthetic */ Stripe3ds2TransactionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19118xd40f3935(Transaction transaction, Stripe3ds2Fingerprint stripe3ds2Fingerprint, int i, Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel, ApiRequest.Options options, Continuation<? super C19118xd40f3935> continuation) {
        super(2, continuation);
        this.$transaction = transaction;
        this.$stripe3ds2Fingerprint = stripe3ds2Fingerprint;
        this.$timeout = i;
        this.this$0 = stripe3ds2TransactionViewModel;
        this.$requestOptions = options;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C19118xd40f3935(this.$transaction, this.$stripe3ds2Fingerprint, this.$timeout, this.this$0, this.$requestOptions, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Stripe3ds2AuthResult> continuation) {
        return ((C19118xd40f3935) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        StripeRepository stripeRepository;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    if (obj == null) {
                        return obj;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            Transaction transaction = this.$transaction;
            this.label = 1;
            obj = transaction.createAuthenticationRequestParameters(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) obj;
        Stripe3ds2AuthParams stripe3ds2AuthParams = new Stripe3ds2AuthParams(this.$stripe3ds2Fingerprint.getSource(), authenticationRequestParameters.getSdkAppId(), authenticationRequestParameters.getSdkReferenceNumber(), authenticationRequestParameters.getSdkTransactionId().getValue(), authenticationRequestParameters.getDeviceData(), authenticationRequestParameters.getSdkEphemeralPublicKey(), authenticationRequestParameters.getMessageVersion(), this.$timeout, null);
        stripeRepository = this.this$0.stripeRepository;
        ApiRequest.Options options = this.$requestOptions;
        this.label = 2;
        obj = stripeRepository.start3ds2Auth$payments_core_release(stripe3ds2AuthParams, options, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (obj == null) {
        }
    }
}
