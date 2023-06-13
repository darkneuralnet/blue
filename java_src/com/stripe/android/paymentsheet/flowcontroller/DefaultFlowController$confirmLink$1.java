package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.PaymentSheetState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$confirmLink$1", m28418f = "DefaultFlowController.kt", m28417i = {}, m28416l = {468}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class DefaultFlowController$confirmLink$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ LinkPaymentLauncher.Configuration $linkConfig;
    final /* synthetic */ PaymentSelection $paymentSelection;
    final /* synthetic */ PaymentSheetState.Full $state;
    int label;
    final /* synthetic */ DefaultFlowController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlowController$confirmLink$1(DefaultFlowController defaultFlowController, LinkPaymentLauncher.Configuration configuration, PaymentSelection paymentSelection, PaymentSheetState.Full full, Continuation<? super DefaultFlowController$confirmLink$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultFlowController;
        this.$linkConfig = configuration;
        this.$paymentSelection = paymentSelection;
        this.$state = full;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultFlowController$confirmLink$1(this.this$0, this.$linkConfig, this.$paymentSelection, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((DefaultFlowController$confirmLink$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r2 != false) goto L13;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        PaymentSelection.New.LinkInline linkInline;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC32730Eu1<AccountStatus> accountStatusFlow = this.this$0.linkLauncher.getAccountStatusFlow(this.$linkConfig);
            this.label = 1;
            obj = C36708Vu1.m79248w(accountStatusFlow, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AccountStatus accountStatus = (AccountStatus) obj;
        PaymentSelection paymentSelection = this.$paymentSelection;
        if (paymentSelection instanceof PaymentSelection.New.LinkInline) {
            linkInline = (PaymentSelection.New.LinkInline) paymentSelection;
        } else {
            linkInline = null;
        }
        if (linkInline != null) {
            if (accountStatus != AccountStatus.Verified) {
                z = false;
            }
        }
        linkInline = null;
        if (linkInline != null) {
            this.this$0.linkLauncher.present(this.$linkConfig, linkInline.getLinkPaymentDetails().getOriginalParams());
        } else if (paymentSelection instanceof PaymentSelection.Link) {
            LinkPaymentLauncher.present$default(this.this$0.linkLauncher, this.$linkConfig, null, 2, null);
        } else {
            this.this$0.confirmPaymentSelection(paymentSelection, this.$state);
        }
        return Unit.INSTANCE;
    }
}
