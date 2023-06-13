package com.stripe.android.financialconnections.features.reset;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.GoNext;
import com.stripe.android.financialconnections.domain.LinkMoreAccounts;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.Result;
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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B9\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;", "LRN2;", "Lcom/stripe/android/financialconnections/features/reset/ResetState;", "", "logErrors", "Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;", "linkMoreAccounts", "Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "Lcom/stripe/android/financialconnections/domain/GoNext;", "goNext", "Lcom/stripe/android/financialconnections/domain/GoNext;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "initialState", "<init>", "(Lcom/stripe/android/financialconnections/features/reset/ResetState;Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/core/Logger;)V", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ResetViewModel extends RN2<ResetState> {
    public static final Companion Companion = new Companion(null);
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final GoNext goNext;
    private final LinkMoreAccounts linkMoreAccounts;
    private final Logger logger;
    private final NativeAuthFlowCoordinator nativeAuthFlowCoordinator;

    @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.reset.ResetViewModel$1", m28418f = "ResetViewModel.kt", m28417i = {1, 2}, m28416l = {33, 34, 35}, m28415m = "invokeSuspend", m28414n = {"updatedManifest", "updatedManifest"}, m28413s = {"L$0", "L$0"})
    /* renamed from: com.stripe.android.financialconnections.features.reset.ResetViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C188671 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C188671(Continuation<? super C188671> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C188671(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker;
            FinancialConnectionsEvent.PaneLoaded paneLoaded;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest2;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            ((Result) obj).m116792unboximpl();
                            GoNext.invoke$default(ResetViewModel.this.goNext, financialConnectionsSessionManifest2.getNextPane(), null, 2, null);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.L$0;
                    financialConnectionsAnalyticsTracker = ResetViewModel.this.eventTracker;
                    paneLoaded = new FinancialConnectionsEvent.PaneLoaded(FinancialConnectionsSessionManifest.Pane.RESET);
                    this.L$0 = financialConnectionsSessionManifest;
                    this.label = 3;
                    if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(paneLoaded, this) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    financialConnectionsSessionManifest2 = financialConnectionsSessionManifest;
                    GoNext.invoke$default(ResetViewModel.this.goNext, financialConnectionsSessionManifest2.getNextPane(), null, 2, null);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                LinkMoreAccounts linkMoreAccounts = ResetViewModel.this.linkMoreAccounts;
                this.label = 1;
                obj = linkMoreAccounts.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) obj;
            BX2<NativeAuthFlowCoordinator.Message> invoke = ResetViewModel.this.nativeAuthFlowCoordinator.invoke();
            NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth clearPartnerWebAuth = NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth.INSTANCE;
            this.L$0 = financialConnectionsSessionManifest;
            this.label = 2;
            if (invoke.emit(clearPartnerWebAuth, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsAnalyticsTracker = ResetViewModel.this.eventTracker;
            paneLoaded = new FinancialConnectionsEvent.PaneLoaded(FinancialConnectionsSessionManifest.Pane.RESET);
            this.L$0 = financialConnectionsSessionManifest;
            this.label = 3;
            if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(paneLoaded, this) != coroutine_suspended) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C188671) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/reset/ResetState;", "Ldp;", "", "it", "invoke", "(Lcom/stripe/android/financialconnections/features/reset/ResetState;Ldp;)Lcom/stripe/android/financialconnections/features/reset/ResetState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.financialconnections.features.reset.ResetViewModel$2 */
    /* loaded from: classes7.dex */
    public static final class C188682 extends Lambda implements Function2<ResetState, AbstractC19862dp<? extends Unit>, ResetState> {
        public static final C188682 INSTANCE = new C188682();

        public C188682() {
            super(2);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final ResetState invoke2(ResetState execute, AbstractC19862dp<Unit> it) {
            Intrinsics.checkNotNullParameter(execute, "$this$execute");
            Intrinsics.checkNotNullParameter(it, "it");
            return execute.copy(it);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ ResetState invoke(ResetState resetState, AbstractC19862dp<? extends Unit> abstractC19862dp) {
            return invoke2(resetState, (AbstractC19862dp<Unit>) abstractC19862dp);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$Companion;", "LWN2;", "Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;", "Lcom/stripe/android/financialconnections/features/reset/ResetState;", "LPr6;", "viewModelContext", TransferTable.COLUMN_STATE, "create", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion implements WN2<ResetViewModel, ResetState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public ResetViewModel create(AbstractC35282Pr6 viewModelContext, ResetState state) {
            Intrinsics.checkNotNullParameter(viewModelContext, "viewModelContext");
            Intrinsics.checkNotNullParameter(state, "state");
            return ((FinancialConnectionsSheetNativeActivity) viewModelContext.m89681a()).getViewModel().getActivityRetainedComponent().getResetSubcomponent().initialState(state).build().getViewModel();
        }

        public ResetState initialState(AbstractC35282Pr6 abstractC35282Pr6) {
            return (ResetState) WN2.C9011a.m78516a(this, abstractC35282Pr6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetViewModel(ResetState initialState, LinkMoreAccounts linkMoreAccounts, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsAnalyticsTracker eventTracker, GoNext goNext, Logger logger) {
        super(initialState, null, 2, null);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(linkMoreAccounts, "linkMoreAccounts");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(goNext, "goNext");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.linkMoreAccounts = linkMoreAccounts;
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        this.eventTracker = eventTracker;
        this.goNext = goNext;
        this.logger = logger;
        logErrors();
        RN2.execute$default(this, new C188671(null), (SC0) null, (KProperty1) null, C188682.INSTANCE, 3, (Object) null);
    }

    private final void logErrors() {
        RN2.onAsync$default(this, ResetViewModel$logErrors$1.INSTANCE, new ResetViewModel$logErrors$2(this, null), null, 4, null);
    }
}
