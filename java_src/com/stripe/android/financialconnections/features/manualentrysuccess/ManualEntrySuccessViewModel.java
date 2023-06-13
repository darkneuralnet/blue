package com.stripe.android.financialconnections.features.manualentrysuccess;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;
import p000.WN2;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010\u0005\u001a\u00020\u0003R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;", "LRN2;", "Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;", "", "logErrors", "onSubmit", "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;", "completeFinancialConnectionsSession", "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "initialState", "<init>", "(Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/core/Logger;)V", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ManualEntrySuccessViewModel extends RN2<ManualEntrySuccessState> {
    public static final Companion Companion = new Companion(null);
    private final CompleteFinancialConnectionsSession completeFinancialConnectionsSession;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final Logger logger;
    private final NativeAuthFlowCoordinator nativeAuthFlowCoordinator;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessViewModel$1", m28418f = "ManualEntrySuccessViewModel.kt", m28417i = {}, m28416l = {36}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C188531 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;

        public C188531(Continuation<? super C188531> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C188531(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C188531) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    ((Result) obj).m116792unboximpl();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker = ManualEntrySuccessViewModel.this.eventTracker;
                FinancialConnectionsEvent.PaneLoaded paneLoaded = new FinancialConnectionsEvent.PaneLoaded(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS);
                this.label = 1;
                if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(paneLoaded, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$Companion;", "LWN2;", "Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;", "Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;", "LPr6;", "viewModelContext", TransferTable.COLUMN_STATE, "create", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion implements WN2<ManualEntrySuccessViewModel, ManualEntrySuccessState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public ManualEntrySuccessViewModel create(AbstractC35282Pr6 viewModelContext, ManualEntrySuccessState state) {
            Intrinsics.checkNotNullParameter(viewModelContext, "viewModelContext");
            Intrinsics.checkNotNullParameter(state, "state");
            return ((FinancialConnectionsSheetNativeActivity) viewModelContext.m89681a()).getViewModel().getActivityRetainedComponent().getManualEntrySuccessBuilder().initialState(state).build().getViewModel();
        }

        public ManualEntrySuccessState initialState(AbstractC35282Pr6 abstractC35282Pr6) {
            return (ManualEntrySuccessState) WN2.C9011a.m78516a(this, abstractC35282Pr6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualEntrySuccessViewModel(ManualEntrySuccessState initialState, CompleteFinancialConnectionsSession completeFinancialConnectionsSession, FinancialConnectionsAnalyticsTracker eventTracker, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, Logger logger) {
        super(initialState, null, 2, null);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(completeFinancialConnectionsSession, "completeFinancialConnectionsSession");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.completeFinancialConnectionsSession = completeFinancialConnectionsSession;
        this.eventTracker = eventTracker;
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        this.logger = logger;
        logErrors();
        Z30.m73800d(getViewModelScope(), null, null, new C188531(null), 3, null);
    }

    private final void logErrors() {
        onAsync(ManualEntrySuccessViewModel$logErrors$1.INSTANCE, new ManualEntrySuccessViewModel$logErrors$2(this, null), new ManualEntrySuccessViewModel$logErrors$3(this, null));
    }

    public final void onSubmit() {
        Z30.m73800d(getViewModelScope(), null, null, new ManualEntrySuccessViewModel$onSubmit$1(this, null), 3, null);
        RN2.execute$default(this, new ManualEntrySuccessViewModel$onSubmit$2(this, null), (SC0) null, (KProperty1) null, ManualEntrySuccessViewModel$onSubmit$3.INSTANCE, 3, (Object) null);
    }
}
