package com.stripe.android;

import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.networking.FraudDetectionData;
import com.stripe.android.networking.FraudDetectionDataRequest;
import com.stripe.android.networking.FraudDetectionDataRequestFactory;
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
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/stripe/android/networking/FraudDetectionData;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.DefaultFraudDetectionDataRepository$getLatest$2", m28418f = "FraudDetectionDataRepository.kt", m28417i = {0}, m28416l = {70, 76}, m28415m = "invokeSuspend", m28414n = {"$this$withContext"}, m28413s = {"L$0"})
@SourceDebugExtension({"SMAP\nFraudDetectionDataRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FraudDetectionDataRepository.kt\ncom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
/* loaded from: classes6.dex */
public final class DefaultFraudDetectionDataRepository$getLatest$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super FraudDetectionData>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultFraudDetectionDataRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataRepository$getLatest$2(DefaultFraudDetectionDataRepository defaultFraudDetectionDataRepository, Continuation<? super DefaultFraudDetectionDataRepository$getLatest$2> continuation) {
        super(2, continuation);
        this.this$0 = defaultFraudDetectionDataRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultFraudDetectionDataRepository$getLatest$2 defaultFraudDetectionDataRepository$getLatest$2 = new DefaultFraudDetectionDataRepository$getLatest$2(this.this$0, continuation);
        defaultFraudDetectionDataRepository$getLatest$2.L$0 = obj;
        return defaultFraudDetectionDataRepository$getLatest$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super FraudDetectionData> continuation) {
        return ((DefaultFraudDetectionDataRepository$getLatest$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        if (r7.isExpired(((java.lang.Number) r4.invoke()).longValue()) != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m116783constructorimpl;
        FraudDetectionData fraudDetectionData;
        FraudDetectionData fraudDetectionData2;
        FraudDetectionDataStore fraudDetectionDataStore;
        StripeNetworkClient stripeNetworkClient;
        FraudDetectionDataRequestFactory fraudDetectionDataRequestFactory;
        Function0 function0;
        FraudDetectionData fraudDetectionData3;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        FraudDetectionData fraudDetectionData4 = null;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    fraudDetectionData3 = FraudDetectionDataRepositoryKt.fraudDetectionData((StripeResponse) obj);
                    m116783constructorimpl = Result.m116783constructorimpl(fraudDetectionData3);
                    if (!Result.m116789isFailureimpl(m116783constructorimpl)) {
                        fraudDetectionData4 = m116783constructorimpl;
                    }
                    fraudDetectionData = fraudDetectionData4;
                    fraudDetectionData2 = this.this$0.cachedFraudDetectionData;
                    if (!Intrinsics.areEqual(fraudDetectionData2, fraudDetectionData) && fraudDetectionData != null) {
                        this.this$0.save(fraudDetectionData);
                    }
                    return fraudDetectionData;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ZC0 zc0 = (ZC0) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            fraudDetectionDataStore = this.this$0.localStore;
            this.L$0 = (ZC0) this.L$0;
            this.label = 1;
            obj = fraudDetectionDataStore.get(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        DefaultFraudDetectionDataRepository defaultFraudDetectionDataRepository = this.this$0;
        fraudDetectionData = (FraudDetectionData) obj;
        if (fraudDetectionData != null) {
            function0 = FraudDetectionDataRepositoryKt.timestampSupplier;
        }
        Result.Companion companion2 = Result.Companion;
        stripeNetworkClient = defaultFraudDetectionDataRepository.stripeNetworkClient;
        fraudDetectionDataRequestFactory = defaultFraudDetectionDataRepository.fraudDetectionDataRequestFactory;
        FraudDetectionDataRequest create = fraudDetectionDataRequestFactory.create(fraudDetectionData);
        this.L$0 = null;
        this.label = 2;
        obj = stripeNetworkClient.executeRequest(create, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        fraudDetectionData3 = FraudDetectionDataRepositoryKt.fraudDetectionData((StripeResponse) obj);
        m116783constructorimpl = Result.m116783constructorimpl(fraudDetectionData3);
        if (!Result.m116789isFailureimpl(m116783constructorimpl)) {
        }
        fraudDetectionData = fraudDetectionData4;
        fraudDetectionData2 = this.this$0.cachedFraudDetectionData;
        if (!Intrinsics.areEqual(fraudDetectionData2, fraudDetectionData)) {
            this.this$0.save(fraudDetectionData);
        }
        return fraudDetectionData;
    }
}
