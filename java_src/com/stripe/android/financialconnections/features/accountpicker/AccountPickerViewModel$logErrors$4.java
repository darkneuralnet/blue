package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$logErrors$4", m28418f = "AccountPickerViewModel.kt", m28417i = {0}, m28416l = {156}, m28415m = "invokeSuspend", m28414n = {"it"}, m28413s = {"L$0"})
/* loaded from: classes7.dex */
public final class AccountPickerViewModel$logErrors$4 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AccountPickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPickerViewModel$logErrors$4(AccountPickerViewModel accountPickerViewModel, Continuation<? super AccountPickerViewModel$logErrors$4> continuation) {
        super(2, continuation);
        this.this$0 = accountPickerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountPickerViewModel$logErrors$4 accountPickerViewModel$logErrors$4 = new AccountPickerViewModel$logErrors$4(this.this$0, continuation);
        accountPickerViewModel$logErrors$4.L$0 = obj;
        return accountPickerViewModel$logErrors$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker;
        Throwable th;
        Logger logger;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                th = (Throwable) this.L$0;
                ResultKt.throwOnFailure(obj);
                ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Throwable th2 = (Throwable) this.L$0;
            financialConnectionsAnalyticsTracker = this.this$0.eventTracker;
            FinancialConnectionsEvent.Error error = new FinancialConnectionsEvent.Error(FinancialConnectionsSessionManifest.Pane.ACCOUNT_PICKER, th2);
            this.L$0 = th2;
            this.label = 1;
            if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(error, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            th = th2;
        }
        logger = this.this$0.logger;
        logger.error("Error selecting accounts", th);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return ((AccountPickerViewModel$logErrors$4) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
