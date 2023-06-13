package com.stripe.android.link.p042ui.verification;

import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.p042ui.ErrorMessageKt;
import kotlin.Metadata;
import kotlin.Result;
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
@DebugMetadata(m28419c = "com.stripe.android.link.ui.verification.VerificationViewModel$startVerification$2", m28418f = "VerificationViewModel.kt", m28417i = {}, m28416l = {119}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.link.ui.verification.VerificationViewModel$startVerification$2 */
/* loaded from: classes7.dex */
public final class VerificationViewModel$startVerification$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ VerificationViewModel this$0;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/link/ui/verification/VerificationViewState;", "it", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.verification.VerificationViewModel$startVerification$2$1 */
    /* loaded from: classes7.dex */
    public static final class C190641 extends Lambda implements Function1<VerificationViewState, VerificationViewState> {
        final /* synthetic */ Throwable $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190641(Throwable th) {
            super(1);
            this.$error = th;
        }

        @Override // kotlin.jvm.functions.Function1
        public final VerificationViewState invoke(VerificationViewState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Throwable th = this.$error;
            return VerificationViewState.copy$default(it, false, false, th != null ? ErrorMessageKt.getErrorMessage(th) : null, false, th == null, 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationViewModel$startVerification$2(VerificationViewModel verificationViewModel, Continuation<? super VerificationViewModel$startVerification$2> continuation) {
        super(2, continuation);
        this.this$0 = verificationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerificationViewModel$startVerification$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((VerificationViewModel$startVerification$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        LinkAccountManager linkAccountManager;
        Object m116498startVerificationIoAF18A;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                m116498startVerificationIoAF18A = ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            linkAccountManager = this.this$0.linkAccountManager;
            this.label = 1;
            m116498startVerificationIoAF18A = linkAccountManager.m116498startVerificationIoAF18A(this);
            if (m116498startVerificationIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.this$0.updateViewState(new C190641(Result.m116786exceptionOrNullimpl(m116498startVerificationIoAF18A)));
        return Unit.INSTANCE;
    }
}
