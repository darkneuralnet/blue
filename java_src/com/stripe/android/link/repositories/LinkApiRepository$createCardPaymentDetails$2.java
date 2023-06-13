package com.stripe.android.link.repositories;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsCreateParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.networking.StripeRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lkotlin/Result;", "Lcom/stripe/android/link/LinkPaymentDetails$New;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.repositories.LinkApiRepository$createCardPaymentDetails$2", m28418f = "LinkApiRepository.kt", m28417i = {}, m28416l = {225}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class LinkApiRepository$createCardPaymentDetails$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Result<? extends LinkPaymentDetails.New>>, Object> {
    final /* synthetic */ String $consumerPublishableKey;
    final /* synthetic */ String $consumerSessionClientSecret;
    final /* synthetic */ PaymentMethodCreateParams $paymentMethodCreateParams;
    final /* synthetic */ String $userEmail;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LinkApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkApiRepository$createCardPaymentDetails$2(LinkApiRepository linkApiRepository, String str, PaymentMethodCreateParams paymentMethodCreateParams, String str2, String str3, Continuation<? super LinkApiRepository$createCardPaymentDetails$2> continuation) {
        super(2, continuation);
        this.this$0 = linkApiRepository;
        this.$consumerSessionClientSecret = str;
        this.$paymentMethodCreateParams = paymentMethodCreateParams;
        this.$userEmail = str2;
        this.$consumerPublishableKey = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LinkApiRepository$createCardPaymentDetails$2 linkApiRepository$createCardPaymentDetails$2 = new LinkApiRepository$createCardPaymentDetails$2(this.this$0, this.$consumerSessionClientSecret, this.$paymentMethodCreateParams, this.$userEmail, this.$consumerPublishableKey, continuation);
        linkApiRepository$createCardPaymentDetails$2.L$0 = obj;
        return linkApiRepository$createCardPaymentDetails$2;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(ZC0 zc0, Continuation<? super Result<LinkPaymentDetails.New>> continuation) {
        return ((LinkApiRepository$createCardPaymentDetails$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:6:0x0013, B:19:0x007a, B:21:0x007e, B:23:0x0084, B:25:0x008c, B:28:0x00a5, B:29:0x00aa, B:30:0x00b5, B:11:0x0030, B:13:0x0041, B:15:0x006c, B:14:0x004c), top: B:35:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:6:0x0013, B:19:0x007a, B:21:0x007e, B:23:0x0084, B:25:0x008c, B:28:0x00a5, B:29:0x00aa, B:30:0x00b5, B:11:0x0030, B:13:0x0041, B:15:0x006c, B:14:0x004c), top: B:35:0x0007 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        String str;
        StripeRepository stripeRepository;
        Function0 function0;
        Function0 function02;
        ApiRequest.Options options;
        PaymentMethodCreateParams paymentMethodCreateParams;
        ConsumerPaymentDetails consumerPaymentDetails;
        LinkPaymentDetails.New r2;
        List<ConsumerPaymentDetails.PaymentDetails> paymentDetails;
        Object first;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    paymentMethodCreateParams = (PaymentMethodCreateParams) this.L$1;
                    str = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ZC0 zc0 = (ZC0) this.L$0;
                LinkApiRepository linkApiRepository = this.this$0;
                str = this.$consumerSessionClientSecret;
                PaymentMethodCreateParams paymentMethodCreateParams2 = this.$paymentMethodCreateParams;
                String str2 = this.$userEmail;
                String str3 = this.$consumerPublishableKey;
                Result.Companion companion = Result.Companion;
                stripeRepository = linkApiRepository.stripeRepository;
                ConsumerPaymentDetailsCreateParams.Card card = new ConsumerPaymentDetailsCreateParams.Card(paymentMethodCreateParams2.toParamMap(), str2);
                if (str3 != null) {
                    options = new ApiRequest.Options(str3, null, null, 6, null);
                } else {
                    function0 = linkApiRepository.publishableKeyProvider;
                    function02 = linkApiRepository.stripeAccountIdProvider;
                    options = new ApiRequest.Options((String) function0.invoke(), (String) function02.invoke(), null, 4, null);
                }
                this.L$0 = str;
                this.L$1 = paymentMethodCreateParams2;
                this.label = 1;
                obj = stripeRepository.createPaymentDetails(str, card, options, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                paymentMethodCreateParams = paymentMethodCreateParams2;
            }
            consumerPaymentDetails = (ConsumerPaymentDetails) obj;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (consumerPaymentDetails != null && (paymentDetails = consumerPaymentDetails.getPaymentDetails()) != null) {
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) paymentDetails);
            ConsumerPaymentDetails.PaymentDetails paymentDetails2 = (ConsumerPaymentDetails.PaymentDetails) first;
            if (paymentDetails2 != null) {
                r2 = new LinkPaymentDetails.New(paymentDetails2, PaymentMethodCreateParams.Companion.createLink(paymentDetails2.getId(), str, ConsumerPaymentDetailsCreateParams.Card.Companion.extraConfirmationParams(paymentMethodCreateParams)), paymentMethodCreateParams);
                if (r2 == null) {
                    m116783constructorimpl = Result.m116783constructorimpl(r2);
                    return Result.m116782boximpl(m116783constructorimpl);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        r2 = null;
        if (r2 == null) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Result<? extends LinkPaymentDetails.New>> continuation) {
        return invoke2(zc0, (Continuation<? super Result<LinkPaymentDetails.New>>) continuation);
    }
}
