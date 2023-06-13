package com.stripe.android.financialconnections.features.manualentry;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.domain.GoNext;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PollAttachPaymentAccount;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.ManualEntryMode;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty1;
import p000.WN2;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BA\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0003R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;", "LRN2;", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "", "observeInputs", "observeAsyncs", "", "input", "onRoutingEntered", "onAccountEntered", "onAccountConfirmEntered", "onSubmit", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;", "pollAttachPaymentAccount", "Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "Lcom/stripe/android/financialconnections/domain/GetManifest;", "getManifest", "Lcom/stripe/android/financialconnections/domain/GetManifest;", "Lcom/stripe/android/financialconnections/domain/GoNext;", "goNext", "Lcom/stripe/android/financialconnections/domain/GoNext;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "initialState", "<init>", "(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/core/Logger;)V", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nManualEntryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManualEntryViewModel.kt\ncom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,189:1\n429#2:190\n502#2,5:191\n429#2:196\n502#2,5:197\n429#2:202\n502#2,5:203\n*S KotlinDebug\n*F\n+ 1 ManualEntryViewModel.kt\ncom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel\n*L\n106#1:190\n106#1:191,5\n111#1:196\n111#1:197,5\n116#1:202\n116#1:203,5\n*E\n"})
/* loaded from: classes7.dex */
public final class ManualEntryViewModel extends RN2<ManualEntryState> {
    public static final Companion Companion = new Companion(null);
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final GetManifest getManifest;
    private final GoNext goNext;
    private final Logger logger;
    private final NativeAuthFlowCoordinator nativeAuthFlowCoordinator;
    private final PollAttachPaymentAccount pollAttachPaymentAccount;

    @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$1", m28418f = "ManualEntryViewModel.kt", m28417i = {1}, m28416l = {42, 43}, m28415m = "invokeSuspend", m28414n = {"manifest"}, m28413s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C188341 extends SuspendLambda implements Function1<Continuation<? super ManualEntryState.Payload>, Object> {
        Object L$0;
        int label;

        public C188341(Continuation<? super C188341> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C188341(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        ((Result) obj).m116792unboximpl();
                        boolean manualEntryUsesMicrodeposits = financialConnectionsSessionManifest.getManualEntryUsesMicrodeposits();
                        if (financialConnectionsSessionManifest.getManualEntryMode() != ManualEntryMode.CUSTOM) {
                            z = false;
                        }
                        return new ManualEntryState.Payload(manualEntryUsesMicrodeposits, z);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                GetManifest getManifest = ManualEntryViewModel.this.getManifest;
                this.label = 1;
                obj = getManifest.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) obj;
            FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker = ManualEntryViewModel.this.eventTracker;
            FinancialConnectionsEvent.PaneLoaded paneLoaded = new FinancialConnectionsEvent.PaneLoaded(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY);
            this.L$0 = financialConnectionsSessionManifest2;
            this.label = 2;
            if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(paneLoaded, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsSessionManifest = financialConnectionsSessionManifest2;
            boolean manualEntryUsesMicrodeposits2 = financialConnectionsSessionManifest.getManualEntryUsesMicrodeposits();
            if (financialConnectionsSessionManifest.getManualEntryMode() != ManualEntryMode.CUSTOM) {
            }
            return new ManualEntryState.Payload(manualEntryUsesMicrodeposits2, z);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ManualEntryState.Payload> continuation) {
            return ((C188341) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "Ldp;", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;", "it", "invoke", "(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;Ldp;)Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$2 */
    /* loaded from: classes7.dex */
    public static final class C188352 extends Lambda implements Function2<ManualEntryState, AbstractC19862dp<? extends ManualEntryState.Payload>, ManualEntryState> {
        public static final C188352 INSTANCE = new C188352();

        public C188352() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ ManualEntryState invoke(ManualEntryState manualEntryState, AbstractC19862dp<? extends ManualEntryState.Payload> abstractC19862dp) {
            return invoke2(manualEntryState, (AbstractC19862dp<ManualEntryState.Payload>) abstractC19862dp);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final ManualEntryState invoke2(ManualEntryState execute, AbstractC19862dp<ManualEntryState.Payload> it) {
            ManualEntryState copy;
            Intrinsics.checkNotNullParameter(execute, "$this$execute");
            Intrinsics.checkNotNullParameter(it, "it");
            copy = execute.copy((r18 & 1) != 0 ? execute.payload : it, (r18 & 2) != 0 ? execute.routing : null, (r18 & 4) != 0 ? execute.account : null, (r18 & 8) != 0 ? execute.accountConfirm : null, (r18 & 16) != 0 ? execute.routingError : null, (r18 & 32) != 0 ? execute.accountError : null, (r18 & 64) != 0 ? execute.accountConfirmError : null, (r18 & 128) != 0 ? execute.linkPaymentAccount : null);
            return copy;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$Companion;", "LWN2;", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "LPr6;", "viewModelContext", TransferTable.COLUMN_STATE, "create", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion implements WN2<ManualEntryViewModel, ManualEntryState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public ManualEntryViewModel create(AbstractC35282Pr6 viewModelContext, ManualEntryState state) {
            Intrinsics.checkNotNullParameter(viewModelContext, "viewModelContext");
            Intrinsics.checkNotNullParameter(state, "state");
            return ((FinancialConnectionsSheetNativeActivity) viewModelContext.m89681a()).getViewModel().getActivityRetainedComponent().getManualEntryBuilder().initialState(state).build().getViewModel();
        }

        public ManualEntryState initialState(AbstractC35282Pr6 abstractC35282Pr6) {
            return (ManualEntryState) WN2.C9011a.m78516a(this, abstractC35282Pr6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualEntryViewModel(ManualEntryState initialState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, PollAttachPaymentAccount pollAttachPaymentAccount, FinancialConnectionsAnalyticsTracker eventTracker, GetManifest getManifest, GoNext goNext, Logger logger) {
        super(initialState, null, 2, null);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(pollAttachPaymentAccount, "pollAttachPaymentAccount");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(getManifest, "getManifest");
        Intrinsics.checkNotNullParameter(goNext, "goNext");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        this.pollAttachPaymentAccount = pollAttachPaymentAccount;
        this.eventTracker = eventTracker;
        this.getManifest = getManifest;
        this.goNext = goNext;
        this.logger = logger;
        observeAsyncs();
        observeInputs();
        RN2.execute$default(this, new C188341(null), (SC0) null, (KProperty1) null, C188352.INSTANCE, 3, (Object) null);
    }

    private final void observeAsyncs() {
        RN2.onAsync$default(this, ManualEntryViewModel$observeAsyncs$1.INSTANCE, null, new ManualEntryViewModel$observeAsyncs$2(this, null), 2, null);
        RN2.onAsync$default(this, ManualEntryViewModel$observeAsyncs$3.INSTANCE, new ManualEntryViewModel$observeAsyncs$4(this, null), null, 4, null);
    }

    private final void observeInputs() {
        onEach(ManualEntryViewModel$observeInputs$1.INSTANCE, new ManualEntryViewModel$observeInputs$2(this, null));
        onEach(ManualEntryViewModel$observeInputs$3.INSTANCE, new ManualEntryViewModel$observeInputs$4(this, null));
        onEach(ManualEntryViewModel$observeInputs$5.INSTANCE, new ManualEntryViewModel$observeInputs$6(this, null));
    }

    public final void onAccountConfirmEntered(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        StringBuilder sb = new StringBuilder();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char charAt = input.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
        setState(new ManualEntryViewModel$onAccountConfirmEntered$1(sb2));
    }

    public final void onAccountEntered(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        StringBuilder sb = new StringBuilder();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char charAt = input.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
        setState(new ManualEntryViewModel$onAccountEntered$1(sb2));
    }

    public final void onRoutingEntered(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        StringBuilder sb = new StringBuilder();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char charAt = input.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
        setState(new ManualEntryViewModel$onRoutingEntered$1(sb2));
    }

    public final void onSubmit() {
        RN2.execute$default(this, new ManualEntryViewModel$onSubmit$1(this, null), (SC0) null, (KProperty1) null, ManualEntryViewModel$onSubmit$2.INSTANCE, 3, (Object) null);
    }
}
