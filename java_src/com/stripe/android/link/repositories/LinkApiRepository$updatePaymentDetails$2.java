package com.stripe.android.link.repositories;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsUpdateParams;
import com.stripe.android.networking.StripeRepository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lkotlin/Result;", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.repositories.LinkApiRepository$updatePaymentDetails$2", m28418f = "LinkApiRepository.kt", m28417i = {}, m28416l = {264}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class LinkApiRepository$updatePaymentDetails$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Result<? extends ConsumerPaymentDetails>>, Object> {
    final /* synthetic */ String $consumerPublishableKey;
    final /* synthetic */ String $consumerSessionClientSecret;
    final /* synthetic */ ConsumerPaymentDetailsUpdateParams $updateParams;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LinkApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkApiRepository$updatePaymentDetails$2(LinkApiRepository linkApiRepository, String str, ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams, String str2, Continuation<? super LinkApiRepository$updatePaymentDetails$2> continuation) {
        super(2, continuation);
        this.this$0 = linkApiRepository;
        this.$consumerSessionClientSecret = str;
        this.$updateParams = consumerPaymentDetailsUpdateParams;
        this.$consumerPublishableKey = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LinkApiRepository$updatePaymentDetails$2 linkApiRepository$updatePaymentDetails$2 = new LinkApiRepository$updatePaymentDetails$2(this.this$0, this.$consumerSessionClientSecret, this.$updateParams, this.$consumerPublishableKey, continuation);
        linkApiRepository$updatePaymentDetails$2.L$0 = obj;
        return linkApiRepository$updatePaymentDetails$2;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(ZC0 zc0, Continuation<? super Result<ConsumerPaymentDetails>> continuation) {
        return ((LinkApiRepository$updatePaymentDetails$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        StripeRepository stripeRepository;
        Function0 function0;
        Function0 function02;
        ApiRequest.Options options;
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
                LinkApiRepository linkApiRepository = this.this$0;
                String str = this.$consumerSessionClientSecret;
                ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams = this.$updateParams;
                String str2 = this.$consumerPublishableKey;
                Result.Companion companion = Result.Companion;
                stripeRepository = linkApiRepository.stripeRepository;
                if (str2 != null) {
                    options = new ApiRequest.Options(str2, null, null, 6, null);
                } else {
                    function0 = linkApiRepository.publishableKeyProvider;
                    function02 = linkApiRepository.stripeAccountIdProvider;
                    options = new ApiRequest.Options((String) function0.invoke(), (String) function02.invoke(), null, 4, null);
                }
                this.label = 1;
                obj = stripeRepository.updatePaymentDetails(str, consumerPaymentDetailsUpdateParams, options, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (obj != null) {
            m116783constructorimpl = Result.m116783constructorimpl((ConsumerPaymentDetails) obj);
            return Result.m116782boximpl(m116783constructorimpl);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Result<? extends ConsumerPaymentDetails>> continuation) {
        return invoke2(zc0, (Continuation<? super Result<ConsumerPaymentDetails>>) continuation);
    }
}
