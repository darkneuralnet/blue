package com.stripe.android.financialconnections.features.accountpicker;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.common.AccessibleDataCalloutModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$loadAccounts$1", m28418f = "AccountPickerViewModel.kt", m28417i = {1, 2, 2, 2, 2, 3, 3, 3, 3}, m28416l = {59, 60, 64, 70, 100}, m28415m = "invokeSuspend", m28414n = {TransferTable.COLUMN_STATE, "manifest", "activeInstitution", "activeAuthSession", "startTime$iv", "manifest", "activeInstitution", "activeAuthSession", "partnerAccountList"}, m28413s = {"L$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$3"})
@SourceDebugExtension({"SMAP\nAccountPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1\n+ 2 Time.kt\ncom/stripe/android/financialconnections/utils/TimeKt\n*L\n1#1,323:1\n6#2,4:324\n*S KotlinDebug\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1\n*L\n63#1:324,4\n*E\n"})
/* loaded from: classes7.dex */
public final class AccountPickerViewModel$loadAccounts$1 extends SuspendLambda implements Function1<Continuation<? super AccountPickerState.Payload>, Object> {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AccountPickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPickerViewModel$loadAccounts$1(AccountPickerViewModel accountPickerViewModel, Continuation<? super AccountPickerViewModel$loadAccounts$1> continuation) {
        super(1, continuation);
        this.this$0 = accountPickerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AccountPickerViewModel$loadAccounts$1(this.this$0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ca  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object awaitState;
        AccountPickerState accountPickerState;
        GetManifest getManifest;
        Object invoke;
        FinancialConnectionsInstitution activeInstitution;
        FinancialConnectionsAuthorizationSession activeAuthSession;
        PollAuthorizationSessionAccounts pollAuthorizationSessionAccounts;
        Object invoke2;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
        long j;
        PartnerAccountsList partnerAccountsList;
        FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker;
        PartnerAccountsList partnerAccountsList2;
        FinancialConnectionsInstitution financialConnectionsInstitution;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest2;
        List buildAccountList;
        boolean z;
        AccountPickerState.SelectionMode selectionMode;
        boolean z2;
        boolean z3;
        Boolean isStripeDirect;
        boolean z4;
        FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker2;
        FinancialConnectionsEvent.PaneLoaded paneLoaded;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                AccountPickerState.Payload payload = (AccountPickerState.Payload) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                ((Result) obj).m116792unboximpl();
                                return payload;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        partnerAccountsList2 = (PartnerAccountsList) this.L$3;
                        financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) this.L$2;
                        financialConnectionsInstitution = (FinancialConnectionsInstitution) this.L$1;
                        financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        ((Result) obj).m116792unboximpl();
                        activeAuthSession = financialConnectionsAuthorizationSession;
                        activeInstitution = financialConnectionsInstitution;
                        financialConnectionsSessionManifest = financialConnectionsSessionManifest2;
                        partnerAccountsList = partnerAccountsList2;
                        buildAccountList = this.this$0.buildAccountList(partnerAccountsList, activeInstitution);
                        if (Intrinsics.areEqual(partnerAccountsList.getSkipAccountSelection(), Boxing.boxBoolean(true)) && !Intrinsics.areEqual(activeAuthSession.getSkipAccountSelection(), Boxing.boxBoolean(true))) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (financialConnectionsSessionManifest.getSingleAccount()) {
                            selectionMode = AccountPickerState.SelectionMode.RADIO;
                        } else {
                            selectionMode = AccountPickerState.SelectionMode.CHECKBOXES;
                        }
                        AccountPickerState.SelectionMode selectionMode2 = selectionMode;
                        AccessibleDataCalloutModel fromManifest = AccessibleDataCalloutModel.Companion.fromManifest(financialConnectionsSessionManifest);
                        if (!Intrinsics.areEqual(activeAuthSession.getInstitutionSkipAccountSelection(), Boxing.boxBoolean(true)) && financialConnectionsSessionManifest.getSingleAccount() && activeAuthSession.isOAuth()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        boolean singleAccount = financialConnectionsSessionManifest.getSingleAccount();
                        if (!financialConnectionsSessionManifest.getSingleAccount() && Intrinsics.areEqual(activeAuthSession.getInstitutionSkipAccountSelection(), Boxing.boxBoolean(true)) && buildAccountList.size() == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        String businessName = financialConnectionsSessionManifest.getBusinessName();
                        isStripeDirect = financialConnectionsSessionManifest.isStripeDirect();
                        if (isStripeDirect != null) {
                            z4 = isStripeDirect.booleanValue();
                        } else {
                            z4 = false;
                        }
                        AccountPickerState.Payload payload2 = new AccountPickerState.Payload(z, buildAccountList, selectionMode2, fromManifest, singleAccount, z4, businessName, z3, z2);
                        financialConnectionsAnalyticsTracker2 = this.this$0.eventTracker;
                        paneLoaded = new FinancialConnectionsEvent.PaneLoaded(FinancialConnectionsSessionManifest.Pane.ACCOUNT_PICKER);
                        this.L$0 = payload2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 5;
                        if (financialConnectionsAnalyticsTracker2.mo116345trackgIAlus(paneLoaded, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return payload2;
                    }
                    j = this.J$0;
                    activeInstitution = (FinancialConnectionsInstitution) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.L$0;
                    activeAuthSession = (FinancialConnectionsAuthorizationSession) this.L$2;
                    invoke2 = obj;
                    Pair m28425to = TuplesKt.m28425to((PartnerAccountsList) invoke2, Boxing.boxLong(System.currentTimeMillis() - j));
                    partnerAccountsList = (PartnerAccountsList) m28425to.component1();
                    long longValue = ((Number) m28425to.component2()).longValue();
                    if (!partnerAccountsList.getData().isEmpty()) {
                        financialConnectionsAnalyticsTracker = this.this$0.eventTracker;
                        FinancialConnectionsEvent.PollAccountsSucceeded pollAccountsSucceeded = new FinancialConnectionsEvent.PollAccountsSucceeded(activeAuthSession.getId(), longValue);
                        this.L$0 = financialConnectionsSessionManifest;
                        this.L$1 = activeInstitution;
                        this.L$2 = activeAuthSession;
                        this.L$3 = partnerAccountsList;
                        this.label = 4;
                        if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(pollAccountsSucceeded, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        partnerAccountsList2 = partnerAccountsList;
                        financialConnectionsInstitution = activeInstitution;
                        financialConnectionsAuthorizationSession = activeAuthSession;
                        financialConnectionsSessionManifest2 = financialConnectionsSessionManifest;
                        activeAuthSession = financialConnectionsAuthorizationSession;
                        activeInstitution = financialConnectionsInstitution;
                        financialConnectionsSessionManifest = financialConnectionsSessionManifest2;
                        partnerAccountsList = partnerAccountsList2;
                    }
                    buildAccountList = this.this$0.buildAccountList(partnerAccountsList, activeInstitution);
                    if (Intrinsics.areEqual(partnerAccountsList.getSkipAccountSelection(), Boxing.boxBoolean(true))) {
                    }
                    z = true;
                    if (financialConnectionsSessionManifest.getSingleAccount()) {
                    }
                    AccountPickerState.SelectionMode selectionMode22 = selectionMode;
                    AccessibleDataCalloutModel fromManifest2 = AccessibleDataCalloutModel.Companion.fromManifest(financialConnectionsSessionManifest);
                    if (!Intrinsics.areEqual(activeAuthSession.getInstitutionSkipAccountSelection(), Boxing.boxBoolean(true))) {
                    }
                    z2 = false;
                    boolean singleAccount2 = financialConnectionsSessionManifest.getSingleAccount();
                    if (!financialConnectionsSessionManifest.getSingleAccount()) {
                    }
                    z3 = false;
                    String businessName2 = financialConnectionsSessionManifest.getBusinessName();
                    isStripeDirect = financialConnectionsSessionManifest.isStripeDirect();
                    if (isStripeDirect != null) {
                    }
                    AccountPickerState.Payload payload22 = new AccountPickerState.Payload(z, buildAccountList, selectionMode22, fromManifest2, singleAccount2, z4, businessName2, z3, z2);
                    financialConnectionsAnalyticsTracker2 = this.this$0.eventTracker;
                    paneLoaded = new FinancialConnectionsEvent.PaneLoaded(FinancialConnectionsSessionManifest.Pane.ACCOUNT_PICKER);
                    this.L$0 = payload22;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 5;
                    if (financialConnectionsAnalyticsTracker2.mo116345trackgIAlus(paneLoaded, this) == coroutine_suspended) {
                    }
                } else {
                    accountPickerState = (AccountPickerState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    invoke = obj;
                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest3 = (FinancialConnectionsSessionManifest) invoke;
                    activeInstitution = financialConnectionsSessionManifest3.getActiveInstitution();
                    activeAuthSession = financialConnectionsSessionManifest3.getActiveAuthSession();
                    if (activeAuthSession == null) {
                        AccountPickerViewModel accountPickerViewModel = this.this$0;
                        long currentTimeMillis = System.currentTimeMillis();
                        pollAuthorizationSessionAccounts = accountPickerViewModel.pollAuthorizationSessionAccounts;
                        boolean canRetry = accountPickerState.getCanRetry();
                        this.L$0 = financialConnectionsSessionManifest3;
                        this.L$1 = activeInstitution;
                        this.L$2 = activeAuthSession;
                        this.J$0 = currentTimeMillis;
                        this.label = 3;
                        invoke2 = pollAuthorizationSessionAccounts.invoke(canRetry, financialConnectionsSessionManifest3, this);
                        if (invoke2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        financialConnectionsSessionManifest = financialConnectionsSessionManifest3;
                        j = currentTimeMillis;
                        Pair m28425to2 = TuplesKt.m28425to((PartnerAccountsList) invoke2, Boxing.boxLong(System.currentTimeMillis() - j));
                        partnerAccountsList = (PartnerAccountsList) m28425to2.component1();
                        long longValue2 = ((Number) m28425to2.component2()).longValue();
                        if (!partnerAccountsList.getData().isEmpty()) {
                        }
                        buildAccountList = this.this$0.buildAccountList(partnerAccountsList, activeInstitution);
                        if (Intrinsics.areEqual(partnerAccountsList.getSkipAccountSelection(), Boxing.boxBoolean(true))) {
                        }
                        z = true;
                        if (financialConnectionsSessionManifest.getSingleAccount()) {
                        }
                        AccountPickerState.SelectionMode selectionMode222 = selectionMode;
                        AccessibleDataCalloutModel fromManifest22 = AccessibleDataCalloutModel.Companion.fromManifest(financialConnectionsSessionManifest);
                        if (!Intrinsics.areEqual(activeAuthSession.getInstitutionSkipAccountSelection(), Boxing.boxBoolean(true))) {
                        }
                        z2 = false;
                        boolean singleAccount22 = financialConnectionsSessionManifest.getSingleAccount();
                        if (!financialConnectionsSessionManifest.getSingleAccount()) {
                        }
                        z3 = false;
                        String businessName22 = financialConnectionsSessionManifest.getBusinessName();
                        isStripeDirect = financialConnectionsSessionManifest.isStripeDirect();
                        if (isStripeDirect != null) {
                        }
                        AccountPickerState.Payload payload222 = new AccountPickerState.Payload(z, buildAccountList, selectionMode222, fromManifest22, singleAccount22, z4, businessName22, z3, z2);
                        financialConnectionsAnalyticsTracker2 = this.this$0.eventTracker;
                        paneLoaded = new FinancialConnectionsEvent.PaneLoaded(FinancialConnectionsSessionManifest.Pane.ACCOUNT_PICKER);
                        this.L$0 = payload222;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 5;
                        if (financialConnectionsAnalyticsTracker2.mo116345trackgIAlus(paneLoaded, this) == coroutine_suspended) {
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
            } else {
                ResultKt.throwOnFailure(obj);
                awaitState = obj;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AccountPickerViewModel accountPickerViewModel2 = this.this$0;
            this.label = 1;
            awaitState = accountPickerViewModel2.awaitState(this);
            if (awaitState == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        accountPickerState = (AccountPickerState) awaitState;
        getManifest = this.this$0.getManifest;
        this.L$0 = accountPickerState;
        this.label = 2;
        invoke = getManifest.invoke(this);
        if (invoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest32 = (FinancialConnectionsSessionManifest) invoke;
        activeInstitution = financialConnectionsSessionManifest32.getActiveInstitution();
        activeAuthSession = financialConnectionsSessionManifest32.getActiveAuthSession();
        if (activeAuthSession == null) {
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super AccountPickerState.Payload> continuation) {
        return ((AccountPickerViewModel$loadAccounts$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
