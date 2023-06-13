package com.stripe.android.financialconnections.presentation;

import android.content.Intent;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetNativeActivityArgs;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.p040di.DaggerFinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import com.stripe.android.financialconnections.utils.UriUtils;
import kotlin.KotlinNothingValueException;
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
import kotlin.jvm.internal.SourceDebugExtension;
import p000.WN2;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00015BK\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010.\u001a\u00020-\u0012\b\b\u0001\u00100\u001a\u00020\r\u0012\u0006\u00102\u001a\u00020\u0002¢\u0006\u0004\b3\u00104J \u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0005J\u0006\u0010\u0018\u001a\u00020\u0007J\u0006\u0010\u0019\u001a\u00020\u0007J\u0006\u0010\u001a\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00066"}, m28432d2 = {"Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;", "LRN2;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;", "earlyTerminationCause", "", "closeAuthFlowError", "", "closeAuthFlow", "Landroid/content/Intent;", "intent", "handleOnNewIntent", "onResume", "", "url", "openPartnerAuthFlowInBrowser", "onViewEffectLaunched", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "onCloseWithConfirmationClick", "onBackClick", "onCloseNoConfirmationClick", "error", "onCloseFromErrorClick", "onCloseConfirm", "onCloseDismiss", "onBackPressed", "onPaneLaunched", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "activityRetainedComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "getActivityRetainedComponent", "()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "Lcom/stripe/android/financialconnections/utils/UriUtils;", "uriUtils", "Lcom/stripe/android/financialconnections/utils/UriUtils;", "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;", "completeFinancialConnectionsSession", "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", NamedConstantsKt.APPLICATION_ID, "Ljava/lang/String;", "initialState", "<init>", "(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)V", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeViewModel extends RN2<FinancialConnectionsSheetNativeState> {
    public static final Companion Companion = new Companion(null);
    private static final String PARAM_ERROR_REASON = "error_reason";
    private static final String PARAM_STATUS = "status";
    private static final String STATUS_CANCEL = "cancel";
    private static final String STATUS_FAILURE = "failure";
    private static final String STATUS_SUCCESS = "success";
    private final FinancialConnectionsSheetNativeComponent activityRetainedComponent;
    private final String applicationId;
    private final CompleteFinancialConnectionsSession completeFinancialConnectionsSession;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final Logger logger;
    private final NativeAuthFlowCoordinator nativeAuthFlowCoordinator;
    private final UriUtils uriUtils;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C188901 extends Lambda implements Function1<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {
        public static final C188901 INSTANCE = new C188901();

        public C188901() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
            Intrinsics.checkNotNullParameter(setState, "$this$setState");
            return FinancialConnectionsSheetNativeState.copy$default(setState, null, false, null, false, false, null, null, 125, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$2", m28418f = "FinancialConnectionsSheetNativeViewModel.kt", m28417i = {}, m28416l = {67}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$2 */
    /* loaded from: classes7.dex */
    public static final class C188912 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;

        public C188912(Continuation<? super C188912> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C188912(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C188912) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                BX2<NativeAuthFlowCoordinator.Message> invoke = FinancialConnectionsSheetNativeViewModel.this.nativeAuthFlowCoordinator.invoke();
                final FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel = FinancialConnectionsSheetNativeViewModel.this;
                InterfaceC33198Gu1<NativeAuthFlowCoordinator.Message> interfaceC33198Gu1 = new InterfaceC33198Gu1<NativeAuthFlowCoordinator.Message>() { // from class: com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel.2.1
                    @Override // p000.InterfaceC33198Gu1
                    public /* bridge */ /* synthetic */ Object emit(NativeAuthFlowCoordinator.Message message, Continuation continuation) {
                        return emit2(message, (Continuation<? super Unit>) continuation);
                    }

                    /* renamed from: emit  reason: avoid collision after fix types in other method */
                    public final Object emit2(NativeAuthFlowCoordinator.Message message, Continuation<? super Unit> continuation) {
                        if (message instanceof NativeAuthFlowCoordinator.Message.Finish) {
                            FinancialConnectionsSheetNativeViewModel.this.setState(new FinancialConnectionsSheetNativeViewModel$2$1$emit$2(message));
                        } else if (Intrinsics.areEqual(message, NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth.INSTANCE)) {
                            FinancialConnectionsSheetNativeViewModel.this.setState(FinancialConnectionsSheetNativeViewModel$2$1$emit$3.INSTANCE);
                        } else if (message instanceof NativeAuthFlowCoordinator.Message.Terminate) {
                            FinancialConnectionsSheetNativeViewModel.closeAuthFlow$default(FinancialConnectionsSheetNativeViewModel.this, ((NativeAuthFlowCoordinator.Message.Terminate) message).getCause(), null, 2, null);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (invoke.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;", "LWN2;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "", NamedConstantsKt.APPLICATION_ID, "baseUrl", "LPr6;", "viewModelContext", TransferTable.COLUMN_STATE, "create", "PARAM_ERROR_REASON", "Ljava/lang/String;", "PARAM_STATUS", "STATUS_CANCEL", "STATUS_FAILURE", "STATUS_SUCCESS", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFinancialConnectionsSheetNativeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetNativeViewModel.kt\ncom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1#2:376\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion implements WN2<FinancialConnectionsSheetNativeViewModel, FinancialConnectionsSheetNativeState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String baseUrl(String str) {
            return "stripe://auth-redirect/" + str;
        }

        private Companion() {
        }

        public FinancialConnectionsSheetNativeViewModel create(AbstractC35282Pr6 viewModelContext, FinancialConnectionsSheetNativeState state) {
            Intrinsics.checkNotNullParameter(viewModelContext, "viewModelContext");
            Intrinsics.checkNotNullParameter(state, "state");
            FinancialConnectionsSheetNativeComponent.Builder builder = DaggerFinancialConnectionsSheetNativeComponent.builder();
            SynchronizeSessionResponse initialSyncResponse = ((FinancialConnectionsSheetNativeActivityArgs) viewModelContext.m89679c()).getInitialSyncResponse();
            if (!state.getFirstInit()) {
                initialSyncResponse = null;
            }
            return builder.initialSyncResponse(initialSyncResponse).application(viewModelContext.m89680b()).configuration(state.getConfiguration()).initialState(state).build().getViewModel();
        }

        public FinancialConnectionsSheetNativeState initialState(AbstractC35282Pr6 abstractC35282Pr6) {
            return (FinancialConnectionsSheetNativeState) WN2.C9011a.m78516a(this, abstractC35282Pr6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetNativeViewModel(FinancialConnectionsSheetNativeComponent activityRetainedComponent, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, UriUtils uriUtils, CompleteFinancialConnectionsSession completeFinancialConnectionsSession, FinancialConnectionsAnalyticsTracker eventTracker, Logger logger, String applicationId, FinancialConnectionsSheetNativeState initialState) {
        super(initialState, null, 2, null);
        Intrinsics.checkNotNullParameter(activityRetainedComponent, "activityRetainedComponent");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(uriUtils, "uriUtils");
        Intrinsics.checkNotNullParameter(completeFinancialConnectionsSession, "completeFinancialConnectionsSession");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.activityRetainedComponent = activityRetainedComponent;
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        this.uriUtils = uriUtils;
        this.completeFinancialConnectionsSession = completeFinancialConnectionsSession;
        this.eventTracker = eventTracker;
        this.logger = logger;
        this.applicationId = applicationId;
        setState(C188901.INSTANCE);
        Z30.m73800d(getViewModelScope(), null, null, new C188912(null), 3, null);
    }

    private final void closeAuthFlow(NativeAuthFlowCoordinator.Message.Terminate.EarlyTerminationCause earlyTerminationCause, Throwable th) {
        Z30.m73800d(getViewModelScope(), null, null, new FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1(this, earlyTerminationCause, th, null), 3, null);
    }

    public static /* synthetic */ void closeAuthFlow$default(FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel, NativeAuthFlowCoordinator.Message.Terminate.EarlyTerminationCause earlyTerminationCause, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            earlyTerminationCause = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        financialConnectionsSheetNativeViewModel.closeAuthFlow(earlyTerminationCause, th);
    }

    public final FinancialConnectionsSheetNativeComponent getActivityRetainedComponent() {
        return this.activityRetainedComponent;
    }

    public final void handleOnNewIntent(Intent intent) {
        Z30.m73800d(getViewModelScope(), null, null, new FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1(intent, this, null), 3, null);
    }

    public final void onBackClick(FinancialConnectionsSessionManifest.Pane pane) {
        Intrinsics.checkNotNullParameter(pane, "pane");
        Z30.m73800d(getViewModelScope(), null, null, new FinancialConnectionsSheetNativeViewModel$onBackClick$1(this, pane, null), 3, null);
    }

    public final void onBackPressed() {
        closeAuthFlow$default(this, null, null, 1, null);
    }

    public final void onCloseConfirm() {
        closeAuthFlow$default(this, null, null, 1, null);
    }

    public final void onCloseDismiss() {
        setState(FinancialConnectionsSheetNativeViewModel$onCloseDismiss$1.INSTANCE);
    }

    public final void onCloseFromErrorClick(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        closeAuthFlow$default(this, null, error, 1, null);
    }

    public final void onCloseNoConfirmationClick(FinancialConnectionsSessionManifest.Pane pane) {
        Intrinsics.checkNotNullParameter(pane, "pane");
        Z30.m73800d(getViewModelScope(), null, null, new C18899x81d7a810(this, pane, null), 3, null);
        closeAuthFlow$default(this, null, null, 1, null);
    }

    public final void onCloseWithConfirmationClick(FinancialConnectionsSessionManifest.Pane pane) {
        Intrinsics.checkNotNullParameter(pane, "pane");
        Z30.m73800d(getViewModelScope(), null, null, new C18900xc9e9bcab(this, pane, null), 3, null);
    }

    public final void onPaneLaunched(FinancialConnectionsSessionManifest.Pane pane) {
        Intrinsics.checkNotNullParameter(pane, "pane");
        Z30.m73800d(getViewModelScope(), null, null, new FinancialConnectionsSheetNativeViewModel$onPaneLaunched$1(this, pane, null), 3, null);
    }

    public final void onResume() {
        setState(FinancialConnectionsSheetNativeViewModel$onResume$1.INSTANCE);
    }

    public final void onViewEffectLaunched() {
        setState(FinancialConnectionsSheetNativeViewModel$onViewEffectLaunched$1.INSTANCE);
    }

    public final void openPartnerAuthFlowInBrowser(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        setState(new C18902x4098ae06(url));
    }
}
