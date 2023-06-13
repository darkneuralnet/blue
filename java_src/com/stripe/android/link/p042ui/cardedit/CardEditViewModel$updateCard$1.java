package com.stripe.android.link.p042ui.cardedit;

import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.p042ui.wallet.PaymentDetailsResult;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsUpdateParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.ui.cardedit.CardEditViewModel$updateCard$1", m28418f = "CardEditViewModel.kt", m28417i = {}, m28416l = {116}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nCardEditViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardEditViewModel.kt\ncom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"})
/* renamed from: com.stripe.android.link.ui.cardedit.CardEditViewModel$updateCard$1 */
/* loaded from: classes7.dex */
public final class CardEditViewModel$updateCard$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentMethodCreateParams $paymentMethodCreateParams;
    int label;
    final /* synthetic */ CardEditViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardEditViewModel$updateCard$1(CardEditViewModel cardEditViewModel, PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super CardEditViewModel$updateCard$1> continuation) {
        super(2, continuation);
        this.this$0 = cardEditViewModel;
        this.$paymentMethodCreateParams = paymentMethodCreateParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardEditViewModel$updateCard$1(this.this$0, this.$paymentMethodCreateParams, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((CardEditViewModel$updateCard$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        boolean z;
        LinkAccountManager linkAccountManager;
        Object m116499updatePaymentDetailsgIAlus;
        GX2 gx2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                m116499updatePaymentDetailsgIAlus = ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            String id = this.this$0.getPaymentDetails().getId();
            Boolean value = this.this$0.getSetAsDefault().getValue();
            CardEditViewModel cardEditViewModel = this.this$0;
            boolean booleanValue = value.booleanValue();
            if (!cardEditViewModel.isDefault() && booleanValue != cardEditViewModel.isDefault()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                value = null;
            }
            ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams = new ConsumerPaymentDetailsUpdateParams(id, value, this.$paymentMethodCreateParams);
            linkAccountManager = this.this$0.linkAccountManager;
            this.label = 1;
            m116499updatePaymentDetailsgIAlus = linkAccountManager.m116499updatePaymentDetailsgIAlus(consumerPaymentDetailsUpdateParams, this);
            if (m116499updatePaymentDetailsgIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        CardEditViewModel cardEditViewModel2 = this.this$0;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116499updatePaymentDetailsgIAlus);
        if (m116786exceptionOrNullimpl == null) {
            ConsumerPaymentDetails consumerPaymentDetails = (ConsumerPaymentDetails) m116499updatePaymentDetailsgIAlus;
            gx2 = cardEditViewModel2._isProcessing;
            gx2.setValue(Boxing.boxBoolean(false));
            cardEditViewModel2.dismiss(new PaymentDetailsResult.Success(cardEditViewModel2.getPaymentDetails().getId()), false);
        } else {
            cardEditViewModel2.onError(m116786exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
