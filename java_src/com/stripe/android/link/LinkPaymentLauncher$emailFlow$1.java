package com.stripe.android.link;

import com.stripe.android.link.injection.LinkPaymentLauncherComponent;
import com.stripe.android.link.model.LinkAccount;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;", "it", "LEu1;", "Lcom/stripe/android/link/model/LinkAccount;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.LinkPaymentLauncher$emailFlow$1", m28418f = "LinkPaymentLauncher.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class LinkPaymentLauncher$emailFlow$1 extends SuspendLambda implements Function2<LinkPaymentLauncherComponent, Continuation<? super InterfaceC32730Eu1<? extends LinkAccount>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public LinkPaymentLauncher$emailFlow$1(Continuation<? super LinkPaymentLauncher$emailFlow$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LinkPaymentLauncher$emailFlow$1 linkPaymentLauncher$emailFlow$1 = new LinkPaymentLauncher$emailFlow$1(continuation);
        linkPaymentLauncher$emailFlow$1.L$0 = obj;
        return linkPaymentLauncher$emailFlow$1;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(LinkPaymentLauncherComponent linkPaymentLauncherComponent, Continuation<? super InterfaceC32730Eu1<LinkAccount>> continuation) {
        return ((LinkPaymentLauncher$emailFlow$1) create(linkPaymentLauncherComponent, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return ((LinkPaymentLauncherComponent) this.L$0).getLinkAccountManager().getLinkAccount();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(LinkPaymentLauncherComponent linkPaymentLauncherComponent, Continuation<? super InterfaceC32730Eu1<? extends LinkAccount>> continuation) {
        return invoke2(linkPaymentLauncherComponent, (Continuation<? super InterfaceC32730Eu1<LinkAccount>>) continuation);
    }
}
