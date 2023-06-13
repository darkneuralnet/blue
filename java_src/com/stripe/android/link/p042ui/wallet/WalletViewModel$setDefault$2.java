package com.stripe.android.link.p042ui.wallet;

import com.google.android.gms.location.places.Place;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsUpdateParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.ui.wallet.WalletViewModel$setDefault$2", m28418f = "WalletViewModel.kt", m28417i = {}, m28416l = {282}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nWalletViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletViewModel.kt\ncom/stripe/android/link/ui/wallet/WalletViewModel$setDefault$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,418:1\n1#2:419\n230#3,5:420\n230#3,5:425\n*S KotlinDebug\n*F\n+ 1 WalletViewModel.kt\ncom/stripe/android/link/ui/wallet/WalletViewModel$setDefault$2\n*L\n286#1:420,5\n291#1:425,5\n*E\n"})
/* renamed from: com.stripe.android.link.ui.wallet.WalletViewModel$setDefault$2 */
/* loaded from: classes7.dex */
public final class WalletViewModel$setDefault$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $paymentDetails;
    int label;
    final /* synthetic */ WalletViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletViewModel$setDefault$2(ConsumerPaymentDetails.PaymentDetails paymentDetails, WalletViewModel walletViewModel, Continuation<? super WalletViewModel$setDefault$2> continuation) {
        super(2, continuation);
        this.$paymentDetails = paymentDetails;
        this.this$0 = walletViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletViewModel$setDefault$2(this.$paymentDetails, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((WalletViewModel$setDefault$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        LinkAccountManager linkAccountManager;
        Object obj2;
        Object single;
        Object m116783constructorimpl;
        Object value;
        Object value2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams = new ConsumerPaymentDetailsUpdateParams(this.$paymentDetails.getId(), Boxing.boxBoolean(true), null);
            linkAccountManager = this.this$0.linkAccountManager;
            this.label = 1;
            Object m116499updatePaymentDetailsgIAlus = linkAccountManager.m116499updatePaymentDetailsgIAlus(consumerPaymentDetailsUpdateParams, this);
            if (m116499updatePaymentDetailsgIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj2 = m116499updatePaymentDetailsgIAlus;
        }
        if (Result.m116790isSuccessimpl(obj2)) {
            try {
                single = CollectionsKt___CollectionsKt.single((List<? extends Object>) ((ConsumerPaymentDetails) obj2).getPaymentDetails());
                m116783constructorimpl = Result.m116783constructorimpl((ConsumerPaymentDetails.PaymentDetails) single);
            } catch (Throwable th) {
                Result.Companion companion = Result.Companion;
                obj2 = ResultKt.createFailure(th);
            }
            WalletViewModel walletViewModel = this.this$0;
            if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) != null) {
                ConsumerPaymentDetails.PaymentDetails paymentDetails = (ConsumerPaymentDetails.PaymentDetails) m116783constructorimpl;
                GX2 gx2 = walletViewModel._uiState;
                do {
                    value2 = gx2.getValue();
                } while (!gx2.compareAndSet(value2, ((WalletUiState) value2).updateWithSetDefaultResult(paymentDetails)));
            } else {
                GX2 gx22 = walletViewModel._uiState;
                do {
                    value = gx22.getValue();
                } while (!gx22.compareAndSet(value, WalletUiState.copy$default((WalletUiState) value, null, null, null, false, false, false, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null)));
            }
            return Unit.INSTANCE;
        }
        m116783constructorimpl = Result.m116783constructorimpl(obj2);
        WalletViewModel walletViewModel2 = this.this$0;
        if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) != null) {
        }
        return Unit.INSTANCE;
    }
}
