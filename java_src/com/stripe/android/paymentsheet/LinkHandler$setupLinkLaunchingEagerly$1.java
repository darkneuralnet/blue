package com.stripe.android.paymentsheet;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.paymentsheet.state.LinkState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.LinkHandler$setupLinkLaunchingEagerly$1", m28418f = "LinkHandler.kt", m28417i = {}, m28416l = {99}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class LinkHandler$setupLinkLaunchingEagerly$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ LinkState $state;
    int label;
    final /* synthetic */ LinkHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkHandler$setupLinkLaunchingEagerly$1(LinkHandler linkHandler, LinkState linkState, Continuation<? super LinkHandler$setupLinkLaunchingEagerly$1> continuation) {
        super(2, continuation);
        this.this$0 = linkHandler;
        this.$state = linkState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LinkHandler$setupLinkLaunchingEagerly$1(this.this$0, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((LinkHandler$setupLinkLaunchingEagerly$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object obj2;
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
            LinkHandler linkHandler = this.this$0;
            LinkPaymentLauncher.Configuration configuration = this.$state.getConfiguration();
            this.label = 1;
            obj2 = linkHandler.setupLinkWithVerification(configuration, this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
