package com.stripe.android.link.p042ui.verification;

import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.model.LinkAccount;
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
@DebugMetadata(m28419c = "com.stripe.android.link.ui.verification.VerificationViewModel$onVerificationCodeEntered$2", m28418f = "VerificationViewModel.kt", m28417i = {}, m28416l = {93}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.link.ui.verification.VerificationViewModel$onVerificationCodeEntered$2 */
/* loaded from: classes7.dex */
public final class VerificationViewModel$onVerificationCodeEntered$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ VerificationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationViewModel$onVerificationCodeEntered$2(VerificationViewModel verificationViewModel, String str, Continuation<? super VerificationViewModel$onVerificationCodeEntered$2> continuation) {
        super(2, continuation);
        this.this$0 = verificationViewModel;
        this.$code = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerificationViewModel$onVerificationCodeEntered$2(this.this$0, this.$code, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((VerificationViewModel$onVerificationCodeEntered$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        LinkAccountManager linkAccountManager;
        Object m116488confirmVerificationgIAlus;
        LinkEventsReporter linkEventsReporter;
        LinkEventsReporter linkEventsReporter2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                m116488confirmVerificationgIAlus = ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            linkAccountManager = this.this$0.linkAccountManager;
            String str = this.$code;
            this.label = 1;
            m116488confirmVerificationgIAlus = linkAccountManager.m116488confirmVerificationgIAlus(str, this);
            if (m116488confirmVerificationgIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        VerificationViewModel verificationViewModel = this.this$0;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116488confirmVerificationgIAlus);
        if (m116786exceptionOrNullimpl == null) {
            LinkAccount linkAccount = (LinkAccount) m116488confirmVerificationgIAlus;
            verificationViewModel.updateViewState(VerificationViewModel$onVerificationCodeEntered$2$1$1.INSTANCE);
            linkEventsReporter2 = verificationViewModel.linkEventsReporter;
            linkEventsReporter2.on2FAComplete();
            verificationViewModel.getOnVerificationCompleted().invoke();
        } else {
            linkEventsReporter = verificationViewModel.linkEventsReporter;
            linkEventsReporter.on2FAFailure();
            int otpLength = verificationViewModel.getOtpElement().getController().getOtpLength();
            for (int i2 = 0; i2 < otpLength; i2++) {
                verificationViewModel.getOtpElement().getController().onValueChanged(i2, "");
            }
            verificationViewModel.onError(m116786exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
