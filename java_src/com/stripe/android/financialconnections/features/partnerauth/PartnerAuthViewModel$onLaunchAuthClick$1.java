package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.financialconnections.analytics.AuthSessionEvent;
import com.stripe.android.financialconnections.domain.PostAuthSessionEvent;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthState;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onLaunchAuthClick$1", m28418f = "PartnerAuthViewModel.kt", m28417i = {}, m28416l = {109, 110, 112}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PartnerAuthViewModel$onLaunchAuthClick$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PartnerAuthViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerAuthViewModel$onLaunchAuthClick$1(PartnerAuthViewModel partnerAuthViewModel, Continuation<? super PartnerAuthViewModel$onLaunchAuthClick$1> continuation) {
        super(2, continuation);
        this.this$0 = partnerAuthViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PartnerAuthViewModel$onLaunchAuthClick$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((PartnerAuthViewModel$onLaunchAuthClick$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        FinancialConnectionsAuthorizationSession authSession;
        Object m116348invoke0E7RQCE;
        Object launchAuthInBrowser;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                m116348invoke0E7RQCE = ((Result) obj).m116792unboximpl();
                Result.m116782boximpl(m116348invoke0E7RQCE);
                PartnerAuthViewModel partnerAuthViewModel = this.this$0;
                this.label = 3;
                launchAuthInBrowser = partnerAuthViewModel.launchAuthInBrowser(this);
                if (launchAuthInBrowser == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            PartnerAuthViewModel partnerAuthViewModel2 = this.this$0;
            this.label = 1;
            obj = partnerAuthViewModel2.awaitState(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        PartnerAuthState.Payload mo6788a = ((PartnerAuthState) obj).getPayload().mo6788a();
        if (mo6788a != null && (authSession = mo6788a.getAuthSession()) != null) {
            PostAuthSessionEvent postAuthSessionEvent = this.this$0.postAuthSessionEvent;
            String id = authSession.getId();
            AuthSessionEvent.OAuthLaunched oAuthLaunched = new AuthSessionEvent.OAuthLaunched(new Date());
            this.label = 2;
            m116348invoke0E7RQCE = postAuthSessionEvent.m116348invoke0E7RQCE(id, oAuthLaunched, this);
            if (m116348invoke0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
            Result.m116782boximpl(m116348invoke0E7RQCE);
        }
        PartnerAuthViewModel partnerAuthViewModel3 = this.this$0;
        this.label = 3;
        launchAuthInBrowser = partnerAuthViewModel3.launchAuthInBrowser(this);
        if (launchAuthInBrowser == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
