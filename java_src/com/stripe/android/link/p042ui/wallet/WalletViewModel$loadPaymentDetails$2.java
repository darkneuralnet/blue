package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.ui.wallet.WalletViewModel$loadPaymentDetails$2", m28418f = "WalletViewModel.kt", m28417i = {}, m28416l = {344}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nWalletViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletViewModel.kt\ncom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,418:1\n230#2,5:419\n*S KotlinDebug\n*F\n+ 1 WalletViewModel.kt\ncom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2\n*L\n346#1:419,5\n*E\n"})
/* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$loadPaymentDetails$2 */
/* loaded from: classes7.dex */
public final class WalletViewModel$loadPaymentDetails$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $initialSetup;
    final /* synthetic */ String $selectedItem;
    int label;
    final /* synthetic */ WalletViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletViewModel$loadPaymentDetails$2(WalletViewModel walletViewModel, boolean z, String str, Continuation<? super WalletViewModel$loadPaymentDetails$2> continuation) {
        super(2, continuation);
        this.this$0 = walletViewModel;
        this.$initialSetup = z;
        this.$selectedItem = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletViewModel$loadPaymentDetails$2(this.this$0, this.$initialSetup, this.$selectedItem, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((WalletViewModel$loadPaymentDetails$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        LinkAccountManager linkAccountManager;
        Object m116494listPaymentDetailsIoAF18A;
        Object value;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                m116494listPaymentDetailsIoAF18A = ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            linkAccountManager = this.this$0.linkAccountManager;
            this.label = 1;
            m116494listPaymentDetailsIoAF18A = linkAccountManager.m116494listPaymentDetailsIoAF18A(this);
            if (m116494listPaymentDetailsIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        WalletViewModel walletViewModel = this.this$0;
        boolean z = this.$initialSetup;
        String str = this.$selectedItem;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116494listPaymentDetailsIoAF18A);
        if (m116786exceptionOrNullimpl == null) {
            ConsumerPaymentDetails consumerPaymentDetails = (ConsumerPaymentDetails) m116494listPaymentDetailsIoAF18A;
            GX2 gx2 = walletViewModel._uiState;
            do {
                value = gx2.getValue();
            } while (!gx2.compareAndSet(value, ((WalletUiState) value).updateWithResponse(consumerPaymentDetails, str)));
            if (z && walletViewModel.getArgs().getPrefilledCardParams$link_release() != null) {
                walletViewModel.navigator.navigateTo(new LinkScreen.PaymentMethod(true), consumerPaymentDetails.getPaymentDetails().isEmpty());
            } else if (consumerPaymentDetails.getPaymentDetails().isEmpty()) {
                walletViewModel.addNewPaymentMethod(true);
            }
        } else {
            walletViewModel.onFatal(m116786exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
