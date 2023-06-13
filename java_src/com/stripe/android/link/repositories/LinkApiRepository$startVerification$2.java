package com.stripe.android.link.repositories;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.repository.ConsumersApiService;
import java.util.Locale;
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
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lkotlin/Result;", "Lcom/stripe/android/model/ConsumerSession;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.repositories.LinkApiRepository$startVerification$2", m28418f = "LinkApiRepository.kt", m28417i = {}, m28416l = {93}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class LinkApiRepository$startVerification$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Result<? extends ConsumerSession>>, Object> {
    final /* synthetic */ String $authSessionCookie;
    final /* synthetic */ String $consumerPublishableKey;
    final /* synthetic */ String $consumerSessionClientSecret;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LinkApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkApiRepository$startVerification$2(LinkApiRepository linkApiRepository, String str, String str2, String str3, Continuation<? super LinkApiRepository$startVerification$2> continuation) {
        super(2, continuation);
        this.this$0 = linkApiRepository;
        this.$consumerSessionClientSecret = str;
        this.$authSessionCookie = str2;
        this.$consumerPublishableKey = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LinkApiRepository$startVerification$2 linkApiRepository$startVerification$2 = new LinkApiRepository$startVerification$2(this.this$0, this.$consumerSessionClientSecret, this.$authSessionCookie, this.$consumerPublishableKey, continuation);
        linkApiRepository$startVerification$2.L$0 = obj;
        return linkApiRepository$startVerification$2;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(ZC0 zc0, Continuation<? super Result<ConsumerSession>> continuation) {
        return ((LinkApiRepository$startVerification$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        ConsumersApiService consumersApiService;
        Locale locale;
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
                String str2 = this.$authSessionCookie;
                String str3 = this.$consumerPublishableKey;
                Result.Companion companion = Result.Companion;
                consumersApiService = linkApiRepository.consumersApiService;
                locale = linkApiRepository.locale;
                if (locale == null) {
                    locale = Locale.US;
                }
                Locale locale2 = locale;
                Intrinsics.checkNotNullExpressionValue(locale2, "locale ?: Locale.US");
                if (str3 != null) {
                    options = new ApiRequest.Options(str3, null, null, 6, null);
                } else {
                    function0 = linkApiRepository.publishableKeyProvider;
                    function02 = linkApiRepository.stripeAccountIdProvider;
                    options = new ApiRequest.Options((String) function0.invoke(), (String) function02.invoke(), null, 4, null);
                }
                this.label = 1;
                obj = consumersApiService.startConsumerVerification(str, locale2, str2, LinkApiRepository.REQUEST_SURFACE, options, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (obj != null) {
            m116783constructorimpl = Result.m116783constructorimpl((ConsumerSession) obj);
            return Result.m116782boximpl(m116783constructorimpl);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Result<? extends ConsumerSession>> continuation) {
        return invoke2(zc0, (Continuation<? super Result<ConsumerSession>>) continuation);
    }
}
