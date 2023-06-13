package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$observePayload$2", m28418f = "PartnerAuthViewModel.kt", m28417i = {}, m28416l = {91}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PartnerAuthViewModel$observePayload$2 extends SuspendLambda implements Function2<PartnerAuthState.Payload, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PartnerAuthViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerAuthViewModel$observePayload$2(PartnerAuthViewModel partnerAuthViewModel, Continuation<? super PartnerAuthViewModel$observePayload$2> continuation) {
        super(2, continuation);
        this.this$0 = partnerAuthViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PartnerAuthViewModel$observePayload$2 partnerAuthViewModel$observePayload$2 = new PartnerAuthViewModel$observePayload$2(this.this$0, continuation);
        partnerAuthViewModel$observePayload$2.L$0 = obj;
        return partnerAuthViewModel$observePayload$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PartnerAuthState.Payload payload, Continuation<? super Unit> continuation) {
        return ((PartnerAuthViewModel$observePayload$2) create(payload, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object launchAuthInBrowser;
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
            if (!((PartnerAuthState.Payload) this.L$0).getAuthSession().isOAuth()) {
                PartnerAuthViewModel partnerAuthViewModel = this.this$0;
                this.label = 1;
                launchAuthInBrowser = partnerAuthViewModel.launchAuthInBrowser(this);
                if (launchAuthInBrowser == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
