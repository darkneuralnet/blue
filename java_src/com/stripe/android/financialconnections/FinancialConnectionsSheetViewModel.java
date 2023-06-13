package com.stripe.android.financialconnections;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken;
import com.stripe.android.financialconnections.domain.NativeAuthFlowRouter;
import com.stripe.android.financialconnections.domain.SynchronizeFinancialConnectionsSession;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.p040di.DaggerFinancialConnectionsSheetComponent;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.WN2;
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001EBK\b\u0007\u0012\b\b\u0001\u0010-\u001a\u00020\f\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010\t\u001a\u000202\u0012\u0006\u0010\n\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010B\u001a\u00020\u0002¢\u0006\u0004\bC\u0010DJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001a\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000fH\u0002J\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u000f*\u00020\fH\u0002J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u000f\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010 \u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$J\u0019\u0010*\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010,\u001a\u00020\u0003H\u0000¢\u0006\u0004\b+\u0010\u001bR\u0014\u0010-\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\t\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0014\u0010\n\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006F"}, m28432d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;", "LRN2;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;", "", "fetchManifest", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "sync", "openAuthFlow", TransferTable.COLUMN_STATE, "fetchFinancialConnectionsSession", "fetchFinancialConnectionsSessionForToken", "onUserCancel", "", "unwrappedUriString", "onStartApp2App", "Landroid/net/Uri;", "receivedUrl", "onFinishApp2App", "onFlowSuccess", "onFlowCancelled", "url", "onSuccessFromLinkFlow", "toUriOrNull", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "finishWithResult", "onActivityRecreated$financial_connections_release", "()V", "onActivityRecreated", "onResume$financial_connections_release", "onResume", "onBrowserActivityResult$financial_connections_release", "onBrowserActivityResult", "Landroidx/activity/result/ActivityResult;", "activityResult", "onNativeAuthFlowResult$financial_connections_release", "(Landroidx/activity/result/ActivityResult;)V", "onNativeAuthFlowResult", "Landroid/content/Intent;", "intent", "handleOnNewIntent$financial_connections_release", "(Landroid/content/Intent;)V", "handleOnNewIntent", "onViewEffectLaunched$financial_connections_release", "onViewEffectLaunched", NamedConstantsKt.APPLICATION_ID, "Ljava/lang/String;", "Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;", "synchronizeFinancialConnectionsSession", "Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;", "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;", "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;", "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;", "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;", "eventReporter", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;", "nativeRouter", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;", "LSX2;", "mutex", "LSX2;", "initialState", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFinancialConnectionsSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetViewModel.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel\n+ 2 Intent.kt\ncom/stripe/android/financialconnections/utils/IntentKt\n*L\n1#1,448:1\n8#2,7:449\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsSheetViewModel.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel\n*L\n216#1:449,7\n*E\n"})
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetViewModel extends RN2<FinancialConnectionsSheetState> {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_ACCOUNTS = 100;
    public static final String QUERY_PARAM_LINKED_ACCOUNT = "linked_account";
    private final String applicationId;
    private final FinancialConnectionsEventReporter eventReporter;
    private final FetchFinancialConnectionsSession fetchFinancialConnectionsSession;
    private final FetchFinancialConnectionsSessionForToken fetchFinancialConnectionsSessionForToken;
    private final Logger logger;
    private final SX2 mutex;
    private final NativeAuthFlowRouter nativeRouter;
    private final SynchronizeFinancialConnectionsSession synchronizeFinancialConnectionsSession;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C186281 extends Lambda implements Function1<FinancialConnectionsSheetState, FinancialConnectionsSheetState> {
        final /* synthetic */ FinancialConnectionsSheetActivityResult.Failed $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C186281(FinancialConnectionsSheetActivityResult.Failed failed) {
            super(1);
            this.$result = failed;
        }

        @Override // kotlin.jvm.functions.Function1
        public final FinancialConnectionsSheetState invoke(FinancialConnectionsSheetState setState) {
            Intrinsics.checkNotNullParameter(setState, "$this$setState");
            return FinancialConnectionsSheetState.copy$default(setState, null, false, null, null, new FinancialConnectionsSheetViewEffect.FinishWithResult(this.$result), 15, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$Companion;", "LWN2;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;", "LPr6;", "viewModelContext", TransferTable.COLUMN_STATE, "create", "", "MAX_ACCOUNTS", "I", "", "QUERY_PARAM_LINKED_ACCOUNT", "Ljava/lang/String;", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion implements WN2<FinancialConnectionsSheetViewModel, FinancialConnectionsSheetState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public FinancialConnectionsSheetViewModel create(AbstractC35282Pr6 viewModelContext, FinancialConnectionsSheetState state) {
            Intrinsics.checkNotNullParameter(viewModelContext, "viewModelContext");
            Intrinsics.checkNotNullParameter(state, "state");
            return DaggerFinancialConnectionsSheetComponent.builder().application(viewModelContext.m89680b()).initialState(state).configuration(state.getInitialArgs().getConfiguration()).build().getViewModel();
        }

        public FinancialConnectionsSheetState initialState(AbstractC35282Pr6 abstractC35282Pr6) {
            return (FinancialConnectionsSheetState) WN2.C9011a.m78516a(this, abstractC35282Pr6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetViewModel(String applicationId, SynchronizeFinancialConnectionsSession synchronizeFinancialConnectionsSession, FetchFinancialConnectionsSession fetchFinancialConnectionsSession, FetchFinancialConnectionsSessionForToken fetchFinancialConnectionsSessionForToken, Logger logger, FinancialConnectionsEventReporter eventReporter, NativeAuthFlowRouter nativeRouter, FinancialConnectionsSheetState initialState) {
        super(initialState, null, 2, null);
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(synchronizeFinancialConnectionsSession, "synchronizeFinancialConnectionsSession");
        Intrinsics.checkNotNullParameter(fetchFinancialConnectionsSession, "fetchFinancialConnectionsSession");
        Intrinsics.checkNotNullParameter(fetchFinancialConnectionsSessionForToken, "fetchFinancialConnectionsSessionForToken");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(nativeRouter, "nativeRouter");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.applicationId = applicationId;
        this.synchronizeFinancialConnectionsSession = synchronizeFinancialConnectionsSession;
        this.fetchFinancialConnectionsSession = fetchFinancialConnectionsSession;
        this.fetchFinancialConnectionsSessionForToken = fetchFinancialConnectionsSessionForToken;
        this.logger = logger;
        this.eventReporter = eventReporter;
        this.nativeRouter = nativeRouter;
        this.mutex = UX2.m81380b(false, 1, null);
        if (initialState.getInitialArgs().isValid$financial_connections_release()) {
            eventReporter.onPresented(initialState.getInitialArgs().getConfiguration());
            if (initialState.getManifest() == null) {
                fetchManifest();
                return;
            }
            return;
        }
        setState(new C186281(new FinancialConnectionsSheetActivityResult.Failed(new IllegalStateException("Invalid configuration provided when instantiating activity"))));
    }

    private final void fetchFinancialConnectionsSession(FinancialConnectionsSheetState financialConnectionsSheetState) {
        Z30.m73800d(getViewModelScope(), null, null, new C18629x4e14e1b0(this, financialConnectionsSheetState, null), 3, null);
    }

    private final void fetchFinancialConnectionsSessionForToken(FinancialConnectionsSheetState financialConnectionsSheetState) {
        Z30.m73800d(getViewModelScope(), null, null, new C18631xca52d180(this, financialConnectionsSheetState, null), 3, null);
    }

    private final void fetchManifest() {
        withState(new FinancialConnectionsSheetViewModel$fetchManifest$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(FinancialConnectionsSheetState financialConnectionsSheetState, FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult) {
        this.eventReporter.onResult(financialConnectionsSheetState.getInitialArgs().getConfiguration(), financialConnectionsSheetActivityResult);
        setState(new FinancialConnectionsSheetViewModel$finishWithResult$1(financialConnectionsSheetActivityResult));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFinishApp2App(Uri uri) {
        setState(new FinancialConnectionsSheetViewModel$onFinishApp2App$1(uri));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFlowCancelled(FinancialConnectionsSheetState financialConnectionsSheetState) {
        setState(FinancialConnectionsSheetViewModel$onFlowCancelled$1.INSTANCE);
        onUserCancel(financialConnectionsSheetState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFlowSuccess(FinancialConnectionsSheetState financialConnectionsSheetState, Uri uri) {
        if (uri == null) {
            finishWithResult(financialConnectionsSheetState, new FinancialConnectionsSheetActivityResult.Failed(new Exception("Intent url received from web flow is null")));
            return;
        }
        setState(FinancialConnectionsSheetViewModel$onFlowSuccess$1.INSTANCE);
        FinancialConnectionsSheetActivityArgs initialArgs = financialConnectionsSheetState.getInitialArgs();
        if (initialArgs instanceof FinancialConnectionsSheetActivityArgs.ForData) {
            fetchFinancialConnectionsSession(financialConnectionsSheetState);
        } else if (initialArgs instanceof FinancialConnectionsSheetActivityArgs.ForToken) {
            fetchFinancialConnectionsSessionForToken(financialConnectionsSheetState);
        } else if (initialArgs instanceof FinancialConnectionsSheetActivityArgs.ForLink) {
            onSuccessFromLinkFlow(uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStartApp2App(String str) {
        setState(new FinancialConnectionsSheetViewModel$onStartApp2App$1(str));
    }

    private final void onSuccessFromLinkFlow(Uri uri) {
        Object m116783constructorimpl;
        String queryParameter;
        try {
            Result.Companion companion = Result.Companion;
            queryParameter = uri.getQueryParameter("linked_account");
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (queryParameter != null) {
            m116783constructorimpl = Result.m116783constructorimpl(queryParameter);
            if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
                withState(new FinancialConnectionsSheetViewModel$onSuccessFromLinkFlow$2$1(this, (String) m116783constructorimpl));
            }
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl != null) {
                this.logger.error("Could not retrieve linked account from success url", m116786exceptionOrNullimpl);
                withState(new FinancialConnectionsSheetViewModel$onSuccessFromLinkFlow$3$1(this, m116786exceptionOrNullimpl));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void onUserCancel(FinancialConnectionsSheetState financialConnectionsSheetState) {
        Z30.m73800d(getViewModelScope(), null, null, new FinancialConnectionsSheetViewModel$onUserCancel$1(this, financialConnectionsSheetState, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openAuthFlow(SynchronizeSessionResponse synchronizeSessionResponse) {
        FinancialConnectionsSheetState.AuthFlowStatus authFlowStatus;
        FinancialConnectionsSessionManifest manifest = synchronizeSessionResponse.getManifest();
        boolean nativeAuthFlowEnabled = this.nativeRouter.nativeAuthFlowEnabled(synchronizeSessionResponse.getManifest());
        Z30.m73800d(getViewModelScope(), null, null, new FinancialConnectionsSheetViewModel$openAuthFlow$1(this, synchronizeSessionResponse, null), 3, null);
        if (manifest.getHostedAuthUrl() == null) {
            withState(new FinancialConnectionsSheetViewModel$openAuthFlow$2(this));
            return;
        }
        if (nativeAuthFlowEnabled) {
            authFlowStatus = FinancialConnectionsSheetState.AuthFlowStatus.NONE;
        } else {
            authFlowStatus = FinancialConnectionsSheetState.AuthFlowStatus.ON_EXTERNAL_ACTIVITY;
        }
        setState(new FinancialConnectionsSheetViewModel$openAuthFlow$3(manifest, authFlowStatus, nativeAuthFlowEnabled, synchronizeSessionResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Uri toUriOrNull(String str) {
        Uri.parse(str).buildUpon().clearQuery();
        try {
            Result.Companion companion = Result.Companion;
            return Uri.parse(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl != null) {
                this.logger.error("Could not parse web flow url", m116786exceptionOrNullimpl);
            }
            if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                m116783constructorimpl = null;
            }
            return (Uri) m116783constructorimpl;
        }
    }

    public final void handleOnNewIntent$financial_connections_release(Intent intent) {
        Z30.m73800d(getViewModelScope(), null, null, new FinancialConnectionsSheetViewModel$handleOnNewIntent$1(this, intent, null), 3, null);
    }

    public final void onActivityRecreated$financial_connections_release() {
        setState(FinancialConnectionsSheetViewModel$onActivityRecreated$1.INSTANCE);
    }

    public final void onBrowserActivityResult$financial_connections_release() {
        Z30.m73800d(getViewModelScope(), null, null, new FinancialConnectionsSheetViewModel$onBrowserActivityResult$1(this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Parcelable] */
    public final void onNativeAuthFlowResult$financial_connections_release(ActivityResult activityResult) {
        Object obj;
        Object parcelableExtra;
        Intrinsics.checkNotNullParameter(activityResult, "activityResult");
        Intent m70486a = activityResult.m70486a();
        FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult = null;
        if (m70486a != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = m70486a.getParcelableExtra(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, FinancialConnectionsSheetActivityResult.class);
                obj = (Parcelable) parcelableExtra;
            } else {
                ?? parcelableExtra2 = m70486a.getParcelableExtra(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT);
                if (parcelableExtra2 instanceof FinancialConnectionsSheetActivityResult) {
                    financialConnectionsSheetActivityResult = parcelableExtra2;
                }
                obj = financialConnectionsSheetActivityResult;
            }
            financialConnectionsSheetActivityResult = (FinancialConnectionsSheetActivityResult) obj;
        }
        if (activityResult.m70485b() == -1 && financialConnectionsSheetActivityResult != null) {
            withState(new FinancialConnectionsSheetViewModel$onNativeAuthFlowResult$1(this, financialConnectionsSheetActivityResult));
        } else {
            withState(new FinancialConnectionsSheetViewModel$onNativeAuthFlowResult$2(this));
        }
    }

    public final void onResume$financial_connections_release() {
        Z30.m73800d(getViewModelScope(), null, null, new FinancialConnectionsSheetViewModel$onResume$1(this, null), 3, null);
    }

    public final void onViewEffectLaunched$financial_connections_release() {
        setState(FinancialConnectionsSheetViewModel$onViewEffectLaunched$1.INSTANCE);
    }
}
