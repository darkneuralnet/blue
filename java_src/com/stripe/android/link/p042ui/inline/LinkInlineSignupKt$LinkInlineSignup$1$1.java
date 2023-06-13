package com.stripe.android.link.p042ui.inline;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.injection.LinkPaymentLauncherComponent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkInlineSignup$1$1", m28418f = "LinkInlineSignup.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkInlineSignup$1$1 */
/* loaded from: classes7.dex */
public final class LinkInlineSignupKt$LinkInlineSignup$1$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ LinkPaymentLauncherComponent $component;
    final /* synthetic */ Function2<LinkPaymentLauncher.Configuration, InlineSignupViewState, Unit> $onStateChanged;
    final /* synthetic */ InterfaceC48627sP5<InlineSignupViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkInlineSignupKt$LinkInlineSignup$1$1(Function2<? super LinkPaymentLauncher.Configuration, ? super InlineSignupViewState, Unit> function2, LinkPaymentLauncherComponent linkPaymentLauncherComponent, InterfaceC48627sP5<InlineSignupViewState> interfaceC48627sP5, Continuation<? super LinkInlineSignupKt$LinkInlineSignup$1$1> continuation) {
        super(2, continuation);
        this.$onStateChanged = function2;
        this.$component = linkPaymentLauncherComponent;
        this.$viewState$delegate = interfaceC48627sP5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LinkInlineSignupKt$LinkInlineSignup$1$1(this.$onStateChanged, this.$component, this.$viewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((LinkInlineSignupKt$LinkInlineSignup$1$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InlineSignupViewState LinkInlineSignup$lambda$2$lambda$0;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Function2<LinkPaymentLauncher.Configuration, InlineSignupViewState, Unit> function2 = this.$onStateChanged;
            LinkPaymentLauncher.Configuration configuration = this.$component.getConfiguration();
            LinkInlineSignup$lambda$2$lambda$0 = LinkInlineSignupKt.LinkInlineSignup$lambda$2$lambda$0(this.$viewState$delegate);
            function2.invoke(configuration, LinkInlineSignup$lambda$2$lambda$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
