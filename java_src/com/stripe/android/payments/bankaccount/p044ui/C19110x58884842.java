package com.stripe.android.payments.bankaccount.p044ui;

import ch.qos.logback.core.net.SyslogConstants;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResponse;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@DebugMetadata(m28419c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1", m28418f = "CollectBankAccountViewModel.kt", m28417i = {}, m28416l = {137, 143, SyslogConstants.LOG_LOCAL4, 162}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nCollectBankAccountViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectBankAccountViewModel.kt\ncom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1#2:194\n*E\n"})
/* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1 */
/* loaded from: classes7.dex */
public final class C19110x58884842 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FinancialConnectionsSession $financialConnectionsSession;
    Object L$0;
    int label;
    final /* synthetic */ CollectBankAccountViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19110x58884842(CollectBankAccountViewModel collectBankAccountViewModel, FinancialConnectionsSession financialConnectionsSession, Continuation<? super C19110x58884842> continuation) {
        super(2, continuation);
        this.this$0 = collectBankAccountViewModel;
        this.$financialConnectionsSession = financialConnectionsSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C19110x58884842(this.this$0, this.$financialConnectionsSession, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((C19110x58884842) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        CollectBankAccountContract.Args args;
        AttachFinancialConnectionsSession attachFinancialConnectionsSession;
        CollectBankAccountContract.Args args2;
        CollectBankAccountContract.Args args3;
        CollectBankAccountContract.Args args4;
        Object m116581forSetupIntentyxL6bBk;
        AttachFinancialConnectionsSession attachFinancialConnectionsSession2;
        CollectBankAccountContract.Args args5;
        CollectBankAccountContract.Args args6;
        CollectBankAccountContract.Args args7;
        Object m116783constructorimpl;
        Object obj2;
        Logger logger;
        Object finishWithResult;
        Throwable m116786exceptionOrNullimpl;
        Object finishWithError;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                CollectBankAccountViewModel collectBankAccountViewModel = this.this$0;
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj2);
                if (m116786exceptionOrNullimpl != null) {
                    this.L$0 = obj2;
                    this.label = 4;
                    finishWithError = collectBankAccountViewModel.finishWithError(m116786exceptionOrNullimpl, this);
                    if (finishWithError == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            m116581forSetupIntentyxL6bBk = ((Result) obj).m116792unboximpl();
        } else {
            ResultKt.throwOnFailure(obj);
            args = this.this$0.args;
            if (args instanceof CollectBankAccountContract.Args.ForPaymentIntent) {
                attachFinancialConnectionsSession2 = this.this$0.attachFinancialConnectionsSession;
                args5 = this.this$0.args;
                String publishableKey = args5.getPublishableKey();
                args6 = this.this$0.args;
                String stripeAccountId = args6.getStripeAccountId();
                args7 = this.this$0.args;
                String clientSecret = args7.getClientSecret();
                String id = this.$financialConnectionsSession.getId();
                this.label = 1;
                m116581forSetupIntentyxL6bBk = attachFinancialConnectionsSession2.m116580forPaymentIntentyxL6bBk(publishableKey, id, clientSecret, stripeAccountId, this);
                if (m116581forSetupIntentyxL6bBk == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (args instanceof CollectBankAccountContract.Args.ForSetupIntent) {
                attachFinancialConnectionsSession = this.this$0.attachFinancialConnectionsSession;
                args2 = this.this$0.args;
                String publishableKey2 = args2.getPublishableKey();
                args3 = this.this$0.args;
                String stripeAccountId2 = args3.getStripeAccountId();
                args4 = this.this$0.args;
                String clientSecret2 = args4.getClientSecret();
                String id2 = this.$financialConnectionsSession.getId();
                this.label = 2;
                m116581forSetupIntentyxL6bBk = attachFinancialConnectionsSession.m116581forSetupIntentyxL6bBk(publishableKey2, id2, clientSecret2, stripeAccountId2, this);
                if (m116581forSetupIntentyxL6bBk == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        FinancialConnectionsSession financialConnectionsSession = this.$financialConnectionsSession;
        if (Result.m116790isSuccessimpl(m116581forSetupIntentyxL6bBk)) {
            try {
                m116783constructorimpl = Result.m116783constructorimpl(new CollectBankAccountResult.Completed(new CollectBankAccountResponse((StripeIntent) m116581forSetupIntentyxL6bBk, financialConnectionsSession)));
            } catch (Throwable th) {
                Result.Companion companion = Result.Companion;
                m116581forSetupIntentyxL6bBk = ResultKt.createFailure(th);
            }
            obj2 = m116783constructorimpl;
            CollectBankAccountViewModel collectBankAccountViewModel2 = this.this$0;
            if (Result.m116790isSuccessimpl(obj2)) {
                logger = collectBankAccountViewModel2.logger;
                logger.debug("Bank account session attached to  intent!!");
                this.L$0 = obj2;
                this.label = 3;
                finishWithResult = collectBankAccountViewModel2.finishWithResult((CollectBankAccountResult.Completed) obj2, this);
                if (finishWithResult == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            CollectBankAccountViewModel collectBankAccountViewModel3 = this.this$0;
            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj2);
            if (m116786exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
        m116783constructorimpl = Result.m116783constructorimpl(m116581forSetupIntentyxL6bBk);
        obj2 = m116783constructorimpl;
        CollectBankAccountViewModel collectBankAccountViewModel22 = this.this$0;
        if (Result.m116790isSuccessimpl(obj2)) {
        }
        CollectBankAccountViewModel collectBankAccountViewModel32 = this.this$0;
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj2);
        if (m116786exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
