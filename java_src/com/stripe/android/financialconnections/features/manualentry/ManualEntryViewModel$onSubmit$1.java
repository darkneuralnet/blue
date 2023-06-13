package com.stripe.android.financialconnections.features.manualentry;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.domain.GoNext;
import com.stripe.android.financialconnections.domain.PollAttachPaymentAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.navigation.NavigationDirections;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$onSubmit$1", m28418f = "ManualEntryViewModel.kt", m28417i = {1, 2}, m28416l = {125, 126, 127}, m28415m = "invokeSuspend", m28414n = {TransferTable.COLUMN_STATE, TransferTable.COLUMN_STATE}, m28413s = {"L$0", "L$0"})
/* loaded from: classes7.dex */
public final class ManualEntryViewModel$onSubmit$1 extends SuspendLambda implements Function1<Continuation<? super LinkAccountSessionPaymentAccount>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ManualEntryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualEntryViewModel$onSubmit$1(ManualEntryViewModel manualEntryViewModel, Continuation<? super ManualEntryViewModel$onSubmit$1> continuation) {
        super(1, continuation);
        this.this$0 = manualEntryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ManualEntryViewModel$onSubmit$1(this.this$0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        ManualEntryState manualEntryState;
        PollAttachPaymentAccount pollAttachPaymentAccount;
        String routing;
        ManualEntryState manualEntryState2;
        GoNext goNext;
        FinancialConnectionsSessionManifest.Pane nextPane;
        String takeLast;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        manualEntryState2 = (ManualEntryState) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount = (LinkAccountSessionPaymentAccount) obj;
                        goNext = this.this$0.goNext;
                        nextPane = linkAccountSessionPaymentAccount.getNextPane();
                        if (nextPane == null) {
                            nextPane = FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS;
                        }
                        NavigationDirections.ManualEntrySuccess manualEntrySuccess = NavigationDirections.ManualEntrySuccess.INSTANCE;
                        LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod microdepositVerificationMethod = linkAccountSessionPaymentAccount.getMicrodepositVerificationMethod();
                        takeLast = StringsKt___StringsKt.takeLast(manualEntryState2.getAccount(), 4);
                        goNext.invoke(nextPane, manualEntrySuccess.argMap(microdepositVerificationMethod, takeLast));
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                manualEntryState = (ManualEntryState) this.L$0;
                ResultKt.throwOnFailure(obj);
                pollAttachPaymentAccount = this.this$0.pollAttachPaymentAccount;
                boolean allowManualEntry = ((FinancialConnectionsSessionManifest) obj).getAllowManualEntry();
                routing = manualEntryState.getRouting();
                if (routing == null) {
                    String account = manualEntryState.getAccount();
                    if (account != null) {
                        PaymentAccountParams.BankAccount bankAccount = new PaymentAccountParams.BankAccount(routing, account);
                        this.L$0 = manualEntryState;
                        this.label = 3;
                        obj = pollAttachPaymentAccount.invoke(allowManualEntry, null, bankAccount, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        manualEntryState2 = manualEntryState;
                        LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount2 = (LinkAccountSessionPaymentAccount) obj;
                        goNext = this.this$0.goNext;
                        nextPane = linkAccountSessionPaymentAccount2.getNextPane();
                        if (nextPane == null) {
                        }
                        NavigationDirections.ManualEntrySuccess manualEntrySuccess2 = NavigationDirections.ManualEntrySuccess.INSTANCE;
                        LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod microdepositVerificationMethod2 = linkAccountSessionPaymentAccount2.getMicrodepositVerificationMethod();
                        takeLast = StringsKt___StringsKt.takeLast(manualEntryState2.getAccount(), 4);
                        goNext.invoke(nextPane, manualEntrySuccess2.argMap(microdepositVerificationMethod2, takeLast));
                        return obj;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            ManualEntryViewModel manualEntryViewModel = this.this$0;
            this.label = 1;
            obj = manualEntryViewModel.awaitState(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ManualEntryState manualEntryState3 = (ManualEntryState) obj;
        GetManifest getManifest = this.this$0.getManifest;
        this.L$0 = manualEntryState3;
        this.label = 2;
        Object invoke = getManifest.invoke(this);
        if (invoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        manualEntryState = manualEntryState3;
        obj = invoke;
        pollAttachPaymentAccount = this.this$0.pollAttachPaymentAccount;
        boolean allowManualEntry2 = ((FinancialConnectionsSessionManifest) obj).getAllowManualEntry();
        routing = manualEntryState.getRouting();
        if (routing == null) {
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super LinkAccountSessionPaymentAccount> continuation) {
        return ((ManualEntryViewModel$onSubmit$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
