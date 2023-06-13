package com.stripe.android.link.account;

import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.repositories.LinkRepository;
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
@DebugMetadata(m28419c = "com.stripe.android.link.account.LinkAccountManager$logout$1$1", m28418f = "LinkAccountManager.kt", m28417i = {}, m28416l = {345}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class LinkAccountManager$logout$1$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ LinkAccount $account;
    final /* synthetic */ String $cookie;
    final /* synthetic */ String $publishableKey;
    int label;
    final /* synthetic */ LinkAccountManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountManager$logout$1$1(LinkAccountManager linkAccountManager, LinkAccount linkAccount, String str, String str2, Continuation<? super LinkAccountManager$logout$1$1> continuation) {
        super(2, continuation);
        this.this$0 = linkAccountManager;
        this.$account = linkAccount;
        this.$publishableKey = str;
        this.$cookie = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LinkAccountManager$logout$1$1(this.this$0, this.$account, this.$publishableKey, this.$cookie, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((LinkAccountManager$logout$1$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        LinkRepository linkRepository;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            linkRepository = this.this$0.linkRepository;
            String clientSecret = this.$account.getClientSecret();
            String str = this.$publishableKey;
            String str2 = this.$cookie;
            this.label = 1;
            if (linkRepository.mo116507logoutBWLJW6A(clientSecret, str, str2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
