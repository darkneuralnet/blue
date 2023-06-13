package com.stripe.android.link.account;

import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.model.ConsumerSession;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"", "clientSecret", "Lkotlin/Result;", "Lcom/stripe/android/link/model/LinkAccount;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.account.LinkAccountManager$startVerification$2", m28418f = "LinkAccountManager.kt", m28417i = {}, m28416l = {190}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class LinkAccountManager$startVerification$2 extends SuspendLambda implements Function2<String, Continuation<? super Result<? extends LinkAccount>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LinkAccountManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountManager$startVerification$2(LinkAccountManager linkAccountManager, Continuation<? super LinkAccountManager$startVerification$2> continuation) {
        super(2, continuation);
        this.this$0 = linkAccountManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LinkAccountManager$startVerification$2 linkAccountManager$startVerification$2 = new LinkAccountManager$startVerification$2(this.this$0, continuation);
        linkAccountManager$startVerification$2.L$0 = obj;
        return linkAccountManager$startVerification$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(String str, Continuation<? super Result<? extends LinkAccount>> continuation) {
        return invoke2(str, (Continuation<? super Result<LinkAccount>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        LinkRepository linkRepository;
        String cookie;
        Object mo116509startVerificationBWLJW6A;
        LinkEventsReporter linkEventsReporter;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                mo116509startVerificationBWLJW6A = ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            linkRepository = this.this$0.linkRepository;
            String consumerPublishableKey = this.this$0.getConsumerPublishableKey();
            cookie = this.this$0.cookie();
            this.label = 1;
            mo116509startVerificationBWLJW6A = linkRepository.mo116509startVerificationBWLJW6A((String) this.L$0, consumerPublishableKey, cookie, this);
            if (mo116509startVerificationBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        LinkAccountManager linkAccountManager = this.this$0;
        if (Result.m116789isFailureimpl(mo116509startVerificationBWLJW6A)) {
            linkEventsReporter = linkAccountManager.linkEventsReporter;
            linkEventsReporter.on2FAStartFailure();
        }
        LinkAccountManager linkAccountManager2 = this.this$0;
        if (Result.m116790isSuccessimpl(mo116509startVerificationBWLJW6A)) {
            mo116509startVerificationBWLJW6A = linkAccountManager2.setAccount((ConsumerSession) mo116509startVerificationBWLJW6A);
        }
        return Result.m116782boximpl(Result.m116783constructorimpl(mo116509startVerificationBWLJW6A));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, Continuation<? super Result<LinkAccount>> continuation) {
        return ((LinkAccountManager$startVerification$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
