package com.stripe.android.link.p042ui.wallet;

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
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.ui.wallet.WalletViewModel$deletePaymentMethod$2", m28418f = "WalletViewModel.kt", m28417i = {}, m28416l = {305}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$deletePaymentMethod$2 */
/* loaded from: classes7.dex */
public final class WalletViewModel$deletePaymentMethod$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $paymentDetails;
    int label;
    final /* synthetic */ WalletViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletViewModel$deletePaymentMethod$2(WalletViewModel walletViewModel, ConsumerPaymentDetails.PaymentDetails paymentDetails, Continuation<? super WalletViewModel$deletePaymentMethod$2> continuation) {
        super(2, continuation);
        this.this$0 = walletViewModel;
        this.$paymentDetails = paymentDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletViewModel$deletePaymentMethod$2(this.this$0, this.$paymentDetails, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((WalletViewModel$deletePaymentMethod$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        LinkAccountManager linkAccountManager;
        Object m116493deletePaymentDetailsgIAlus;
        String str;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                m116493deletePaymentDetailsgIAlus = ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            linkAccountManager = this.this$0.linkAccountManager;
            String id = this.$paymentDetails.getId();
            this.label = 1;
            m116493deletePaymentDetailsgIAlus = linkAccountManager.m116493deletePaymentDetailsgIAlus(id, this);
            if (m116493deletePaymentDetailsgIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        WalletViewModel walletViewModel = this.this$0;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116493deletePaymentDetailsgIAlus);
        if (m116786exceptionOrNullimpl != null) {
            walletViewModel.onError(m116786exceptionOrNullimpl);
        } else {
            Unit unit = (Unit) m116493deletePaymentDetailsgIAlus;
            ConsumerPaymentDetails.PaymentDetails selectedItem = walletViewModel.getUiState().getValue().getSelectedItem();
            if (selectedItem != null) {
                str = selectedItem.getId();
            } else {
                str = null;
            }
            WalletViewModel.loadPaymentDetails$default(walletViewModel, false, str, 1, null);
        }
        return Unit.INSTANCE;
    }
}
