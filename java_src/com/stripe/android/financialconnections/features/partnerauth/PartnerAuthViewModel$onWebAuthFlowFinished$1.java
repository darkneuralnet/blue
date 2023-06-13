package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.financialconnections.exception.WebAuthFlowCancelledException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onWebAuthFlowFinished$1", m28418f = "PartnerAuthViewModel.kt", m28417i = {}, m28416l = {142, 145, 146}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PartnerAuthViewModel$onWebAuthFlowFinished$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC19862dp<String> $webStatus;
    int label;
    final /* synthetic */ PartnerAuthViewModel this$0;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onWebAuthFlowFinished$1$1 */
    /* loaded from: classes7.dex */
    public static final class C188641 extends Lambda implements Function1<PartnerAuthState, PartnerAuthState> {
        public static final C188641 INSTANCE = new C188641();

        public C188641() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PartnerAuthState invoke(PartnerAuthState setState) {
            Intrinsics.checkNotNullParameter(setState, "$this$setState");
            return PartnerAuthState.copy$default(setState, null, null, new C31786At2(null, 1, null), 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerAuthViewModel$onWebAuthFlowFinished$1(AbstractC19862dp<String> abstractC19862dp, PartnerAuthViewModel partnerAuthViewModel, Continuation<? super PartnerAuthViewModel$onWebAuthFlowFinished$1> continuation) {
        super(2, continuation);
        this.$webStatus = abstractC19862dp;
        this.this$0 = partnerAuthViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PartnerAuthViewModel$onWebAuthFlowFinished$1(this.$webStatus, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((PartnerAuthViewModel$onWebAuthFlowFinished$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object onAuthFailed;
        Object onAuthCancelled;
        Object completeAuthorizationSession;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            AbstractC19862dp<String> abstractC19862dp = this.$webStatus;
            if (!(abstractC19862dp instanceof C34454Md6)) {
                if (abstractC19862dp instanceof C31786At2) {
                    this.this$0.setState(C188641.INSTANCE);
                } else if (abstractC19862dp instanceof C51034wT5) {
                    PartnerAuthViewModel partnerAuthViewModel = this.this$0;
                    this.label = 1;
                    completeAuthorizationSession = partnerAuthViewModel.completeAuthorizationSession(this);
                    if (completeAuthorizationSession == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (abstractC19862dp instanceof C32163Cj1) {
                    Throwable m111793b = ((C32163Cj1) abstractC19862dp).m111793b();
                    if (m111793b instanceof WebAuthFlowCancelledException) {
                        PartnerAuthViewModel partnerAuthViewModel2 = this.this$0;
                        this.label = 2;
                        onAuthCancelled = partnerAuthViewModel2.onAuthCancelled(this);
                        if (onAuthCancelled == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        PartnerAuthViewModel partnerAuthViewModel3 = this.this$0;
                        this.label = 3;
                        onAuthFailed = partnerAuthViewModel3.onAuthFailed(m111793b, this);
                        if (onAuthFailed == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
