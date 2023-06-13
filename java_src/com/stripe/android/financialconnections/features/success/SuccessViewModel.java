package com.stripe.android.financialconnections.features.success;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.GetAuthorizationSessionAccounts;
import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.features.common.AccessibleDataCalloutModel;
import com.stripe.android.financialconnections.features.consent.FinancialConnectionsUrlResolver;
import com.stripe.android.financialconnections.features.success.SuccessState;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.navigation.NavigationDirections;
import com.stripe.android.financialconnections.navigation.NavigationManager;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty1;
import p000.WN2;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BI\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0006\u0010\u0006\u001a\u00020\u0003J\u0006\u0010\u0007\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0003R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;", "LRN2;", "Lcom/stripe/android/financialconnections/features/success/SuccessState;", "", "observeAsyncs", "completeSession", "onDoneClick", "onLinkAnotherAccountClick", "onLearnMoreAboutDataAccessClick", "onDisconnectLinkClick", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "Lcom/stripe/android/financialconnections/navigation/NavigationManager;", "navigationManager", "Lcom/stripe/android/financialconnections/navigation/NavigationManager;", "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;", "completeFinancialConnectionsSession", "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "initialState", "Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;", "getAuthorizationSessionAccounts", "Lcom/stripe/android/financialconnections/domain/GetManifest;", "getManifest", "<init>", "(Lcom/stripe/android/financialconnections/features/success/SuccessState;Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class SuccessViewModel extends RN2<SuccessState> {
    public static final Companion Companion = new Companion(null);
    private final CompleteFinancialConnectionsSession completeFinancialConnectionsSession;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final Logger logger;
    private final NativeAuthFlowCoordinator nativeAuthFlowCoordinator;
    private final NavigationManager navigationManager;

    @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.success.SuccessViewModel$1", m28418f = "SuccessViewModel.kt", m28417i = {1}, m28416l = {51, 55}, m28415m = "invokeSuspend", m28414n = {"manifest"}, m28413s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.features.success.SuccessViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C188741 extends SuspendLambda implements Function1<Continuation<? super SuccessState.Payload>, Object> {
        final /* synthetic */ GetAuthorizationSessionAccounts $getAuthorizationSessionAccounts;
        final /* synthetic */ GetManifest $getManifest;
        int I$0;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188741(GetManifest getManifest, GetAuthorizationSessionAccounts getAuthorizationSessionAccounts, Continuation<? super C188741> continuation) {
            super(1, continuation);
            this.$getManifest = getManifest;
            this.$getAuthorizationSessionAccounts = getAuthorizationSessionAccounts;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C188741(this.$getManifest, this.$getAuthorizationSessionAccounts, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            int i;
            int i2;
            AccessibleDataCalloutModel accessibleDataCalloutModel;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            boolean z;
            boolean z2;
            Boolean isNetworkingUserFlow;
            boolean z3;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        i2 = this.I$0;
                        financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        accessibleDataCalloutModel = (AccessibleDataCalloutModel) this.L$1;
                        PartnerAccountsList partnerAccountsList = (PartnerAccountsList) obj;
                        FinancialConnectionsInstitution activeInstitution = financialConnectionsSessionManifest.getActiveInstitution();
                        Intrinsics.checkNotNull(activeInstitution);
                        String businessName = financialConnectionsSessionManifest.getBusinessName();
                        String disconnectUrl = FinancialConnectionsUrlResolver.INSTANCE.getDisconnectUrl(financialConnectionsSessionManifest);
                        if (!financialConnectionsSessionManifest.getSingleAccount() && !financialConnectionsSessionManifest.getDisableLinkMoreAccounts()) {
                            if (financialConnectionsSessionManifest.isNetworkingUserFlow() == null && (!isNetworkingUserFlow.booleanValue())) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                z = true;
                                if (i2 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                return new SuccessState.Payload(accessibleDataCalloutModel, z, activeInstitution, partnerAccountsList, disconnectUrl, businessName, z2);
                            }
                        }
                        z = false;
                        if (i2 != 0) {
                        }
                        return new SuccessState.Payload(accessibleDataCalloutModel, z, activeInstitution, partnerAccountsList, disconnectUrl, businessName, z2);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                GetManifest getManifest = this.$getManifest;
                this.label = 1;
                obj = getManifest.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) obj;
            Boolean skipSuccessPane = financialConnectionsSessionManifest2.getSkipSuccessPane();
            if (skipSuccessPane != null) {
                i = skipSuccessPane.booleanValue();
            } else {
                i = 0;
            }
            AccessibleDataCalloutModel fromManifest = AccessibleDataCalloutModel.Companion.fromManifest(financialConnectionsSessionManifest2);
            GetAuthorizationSessionAccounts getAuthorizationSessionAccounts = this.$getAuthorizationSessionAccounts;
            FinancialConnectionsAuthorizationSession activeAuthSession = financialConnectionsSessionManifest2.getActiveAuthSession();
            Intrinsics.checkNotNull(activeAuthSession);
            String id = activeAuthSession.getId();
            this.L$0 = financialConnectionsSessionManifest2;
            this.L$1 = fromManifest;
            this.I$0 = i;
            this.label = 2;
            Object invoke = getAuthorizationSessionAccounts.invoke(id, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            i2 = i;
            accessibleDataCalloutModel = fromManifest;
            financialConnectionsSessionManifest = financialConnectionsSessionManifest2;
            obj = invoke;
            PartnerAccountsList partnerAccountsList2 = (PartnerAccountsList) obj;
            FinancialConnectionsInstitution activeInstitution2 = financialConnectionsSessionManifest.getActiveInstitution();
            Intrinsics.checkNotNull(activeInstitution2);
            String businessName2 = financialConnectionsSessionManifest.getBusinessName();
            String disconnectUrl2 = FinancialConnectionsUrlResolver.INSTANCE.getDisconnectUrl(financialConnectionsSessionManifest);
            if (!financialConnectionsSessionManifest.getSingleAccount()) {
                if (financialConnectionsSessionManifest.isNetworkingUserFlow() == null) {
                }
                z3 = false;
                if (z3) {
                }
            }
            z = false;
            if (i2 != 0) {
            }
            return new SuccessState.Payload(accessibleDataCalloutModel, z, activeInstitution2, partnerAccountsList2, disconnectUrl2, businessName2, z2);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super SuccessState.Payload> continuation) {
            return ((C188741) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/success/SuccessState;", "Ldp;", "Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;", "it", "invoke", "(Lcom/stripe/android/financialconnections/features/success/SuccessState;Ldp;)Lcom/stripe/android/financialconnections/features/success/SuccessState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.financialconnections.features.success.SuccessViewModel$2 */
    /* loaded from: classes7.dex */
    public static final class C188752 extends Lambda implements Function2<SuccessState, AbstractC19862dp<? extends SuccessState.Payload>, SuccessState> {
        public static final C188752 INSTANCE = new C188752();

        public C188752() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ SuccessState invoke(SuccessState successState, AbstractC19862dp<? extends SuccessState.Payload> abstractC19862dp) {
            return invoke2(successState, (AbstractC19862dp<SuccessState.Payload>) abstractC19862dp);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final SuccessState invoke2(SuccessState execute, AbstractC19862dp<SuccessState.Payload> it) {
            Intrinsics.checkNotNullParameter(execute, "$this$execute");
            Intrinsics.checkNotNullParameter(it, "it");
            return SuccessState.copy$default(execute, it, null, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$Companion;", "LWN2;", "Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;", "Lcom/stripe/android/financialconnections/features/success/SuccessState;", "LPr6;", "viewModelContext", TransferTable.COLUMN_STATE, "create", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion implements WN2<SuccessViewModel, SuccessState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public SuccessViewModel create(AbstractC35282Pr6 viewModelContext, SuccessState state) {
            Intrinsics.checkNotNullParameter(viewModelContext, "viewModelContext");
            Intrinsics.checkNotNullParameter(state, "state");
            return ((FinancialConnectionsSheetNativeActivity) viewModelContext.m89681a()).getViewModel().getActivityRetainedComponent().getSuccessSubcomponent().initialState(state).build().getViewModel();
        }

        public SuccessState initialState(AbstractC35282Pr6 abstractC35282Pr6) {
            return (SuccessState) WN2.C9011a.m78516a(this, abstractC35282Pr6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessViewModel(SuccessState initialState, GetAuthorizationSessionAccounts getAuthorizationSessionAccounts, GetManifest getManifest, FinancialConnectionsAnalyticsTracker eventTracker, Logger logger, NavigationManager navigationManager, CompleteFinancialConnectionsSession completeFinancialConnectionsSession, NativeAuthFlowCoordinator nativeAuthFlowCoordinator) {
        super(initialState, null, 2, null);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(getAuthorizationSessionAccounts, "getAuthorizationSessionAccounts");
        Intrinsics.checkNotNullParameter(getManifest, "getManifest");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(completeFinancialConnectionsSession, "completeFinancialConnectionsSession");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        this.eventTracker = eventTracker;
        this.logger = logger;
        this.navigationManager = navigationManager;
        this.completeFinancialConnectionsSession = completeFinancialConnectionsSession;
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        observeAsyncs();
        RN2.execute$default(this, new C188741(getManifest, getAuthorizationSessionAccounts, null), (SC0) null, (KProperty1) null, C188752.INSTANCE, 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void completeSession() {
        RN2.execute$default(this, new SuccessViewModel$completeSession$1(this, null), (SC0) null, (KProperty1) null, SuccessViewModel$completeSession$2.INSTANCE, 3, (Object) null);
    }

    private final void observeAsyncs() {
        onAsync(SuccessViewModel$observeAsyncs$1.INSTANCE, new SuccessViewModel$observeAsyncs$2(this, null), new SuccessViewModel$observeAsyncs$3(this, null));
        onAsync(SuccessViewModel$observeAsyncs$4.INSTANCE, new SuccessViewModel$observeAsyncs$5(this, null), new SuccessViewModel$observeAsyncs$6(this, null));
    }

    public final void onDisconnectLinkClick() {
        Z30.m73800d(getViewModelScope(), null, null, new SuccessViewModel$onDisconnectLinkClick$1(this, null), 3, null);
    }

    public final void onDoneClick() {
        Z30.m73800d(getViewModelScope(), null, null, new SuccessViewModel$onDoneClick$1(this, null), 3, null);
        completeSession();
    }

    public final void onLearnMoreAboutDataAccessClick() {
        Z30.m73800d(getViewModelScope(), null, null, new SuccessViewModel$onLearnMoreAboutDataAccessClick$1(this, null), 3, null);
    }

    public final void onLinkAnotherAccountClick() {
        Z30.m73800d(getViewModelScope(), null, null, new SuccessViewModel$onLinkAnotherAccountClick$1(this, null), 3, null);
        this.navigationManager.navigate(NavigationDirections.INSTANCE.getReset());
    }
}
