package com.stripe.android.link.p042ui.paymentmethod;

import ch.qos.logback.core.net.SyslogConstants;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.model.FinancialConnectionsSession;
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
@DebugMetadata(m28419c = "com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$startPayment$2", m28418f = "PaymentMethodViewModel.kt", m28417i = {}, m28416l = {SyslogConstants.LOG_LOCAL1}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nPaymentMethodViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodViewModel.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,312:1\n1#2:313\n*E\n"})
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$startPayment$2 */
/* loaded from: classes7.dex */
public final class PaymentMethodViewModel$startPayment$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PaymentMethodViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodViewModel$startPayment$2(PaymentMethodViewModel paymentMethodViewModel, Continuation<? super PaymentMethodViewModel$startPayment$2> continuation) {
        super(2, continuation);
        this.this$0 = paymentMethodViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentMethodViewModel$startPayment$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((PaymentMethodViewModel$startPayment$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        LinkAccountManager linkAccountManager;
        Object m116492createFinancialConnectionsSessionIoAF18A;
        String clientSecret;
        Object m116783constructorimpl;
        Throwable m116786exceptionOrNullimpl;
        GX2 gx2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                m116492createFinancialConnectionsSessionIoAF18A = ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            linkAccountManager = this.this$0.linkAccountManager;
            this.label = 1;
            m116492createFinancialConnectionsSessionIoAF18A = linkAccountManager.m116492createFinancialConnectionsSessionIoAF18A(this);
            if (m116492createFinancialConnectionsSessionIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (Result.m116790isSuccessimpl(m116492createFinancialConnectionsSessionIoAF18A)) {
            try {
                clientSecret = ((FinancialConnectionsSession) m116492createFinancialConnectionsSessionIoAF18A).getClientSecret();
            } catch (Throwable th) {
                Result.Companion companion = Result.Companion;
                m116492createFinancialConnectionsSessionIoAF18A = ResultKt.createFailure(th);
            }
            if (clientSecret != null) {
                m116783constructorimpl = Result.m116783constructorimpl(clientSecret);
                PaymentMethodViewModel paymentMethodViewModel = this.this$0;
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                    gx2 = paymentMethodViewModel._financialConnectionsSessionClientSecret;
                    gx2.setValue((String) m116783constructorimpl);
                } else {
                    paymentMethodViewModel.onError(m116786exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        m116783constructorimpl = Result.m116783constructorimpl(m116492createFinancialConnectionsSessionIoAF18A);
        PaymentMethodViewModel paymentMethodViewModel2 = this.this$0;
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
