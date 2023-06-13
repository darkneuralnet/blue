package com.stripe.android.financialconnections.features.consent;

import android.webkit.URLUtil;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.AcceptConsent;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.GoNext;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.model.VisualUpdate;
import com.stripe.android.financialconnections.navigation.NavigationDirections;
import com.stripe.android.financialconnections.navigation.NavigationManager;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.utils.Experiment;
import com.stripe.android.financialconnections.utils.ExperimentsKt;
import com.stripe.android.financialconnections.utils.UriUtils;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BI\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010\u0005\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0003R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;", "LRN2;", "Lcom/stripe/android/financialconnections/features/consent/ConsentState;", "", "logErrors", "onContinueClick", "", "uri", "onClickableTextClick", "onViewEffectLaunched", "Lcom/stripe/android/financialconnections/domain/AcceptConsent;", "acceptConsent", "Lcom/stripe/android/financialconnections/domain/AcceptConsent;", "Lcom/stripe/android/financialconnections/domain/GoNext;", "goNext", "Lcom/stripe/android/financialconnections/domain/GoNext;", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "Lcom/stripe/android/financialconnections/navigation/NavigationManager;", "navigationManager", "Lcom/stripe/android/financialconnections/navigation/NavigationManager;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "Lcom/stripe/android/financialconnections/utils/UriUtils;", "uriUtils", "Lcom/stripe/android/financialconnections/utils/UriUtils;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "initialState", "<init>", "(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/domain/AcceptConsent;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/core/Logger;)V", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConsentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentViewModel.kt\ncom/stripe/android/financialconnections/features/consent/ConsentViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,141:1\n1282#2,2:142\n*S KotlinDebug\n*F\n+ 1 ConsentViewModel.kt\ncom/stripe/android/financialconnections/features/consent/ConsentViewModel\n*L\n92#1:142,2\n*E\n"})
/* loaded from: classes7.dex */
public final class ConsentViewModel extends RN2<ConsentState> {
    public static final Companion Companion = new Companion(null);
    private final AcceptConsent acceptConsent;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final GetOrFetchSync getOrFetchSync;
    private final GoNext goNext;
    private final Logger logger;
    private final NavigationManager navigationManager;
    private final UriUtils uriUtils;

    @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$1", m28418f = "ConsentViewModel.kt", m28417i = {1, 1}, m28416l = {46, 50}, m28415m = "invokeSuspend", m28414n = {"sync", "shouldShowMerchantLogos"}, m28413s = {"L$0", "Z$0"})
    /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C187491 extends SuspendLambda implements Function1<Continuation<? super ConsentState.Payload>, Object> {
        Object L$0;
        boolean Z$0;
        int label;

        public C187491(Continuation<? super C187491> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C187491(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            SynchronizeSessionResponse synchronizeSessionResponse;
            boolean z;
            VisualUpdate visual;
            List<String> emptyList;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        z = this.Z$0;
                        synchronizeSessionResponse = (SynchronizeSessionResponse) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        TextUpdate text = synchronizeSessionResponse.getText();
                        Intrinsics.checkNotNull(text);
                        ConsentPane consent = text.getConsent();
                        Intrinsics.checkNotNull(consent);
                        visual = synchronizeSessionResponse.getVisual();
                        if (visual != null || (emptyList = visual.getMerchantLogos()) == null) {
                            emptyList = CollectionsKt__CollectionsKt.emptyList();
                        }
                        return new ConsentState.Payload(consent, emptyList, z);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                GetOrFetchSync getOrFetchSync = ConsentViewModel.this.getOrFetchSync;
                this.label = 1;
                obj = getOrFetchSync.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            synchronizeSessionResponse = (SynchronizeSessionResponse) obj;
            FinancialConnectionsSessionManifest manifest = synchronizeSessionResponse.getManifest();
            Experiment experiment = Experiment.CONNECTIONS_CONSENT_COMBINED_LOGO;
            boolean areEqual = Intrinsics.areEqual(ExperimentsKt.experimentAssignment(manifest, experiment), "treatment");
            FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker = ConsentViewModel.this.eventTracker;
            this.L$0 = synchronizeSessionResponse;
            this.Z$0 = areEqual;
            this.label = 2;
            if (ExperimentsKt.trackExposure(financialConnectionsAnalyticsTracker, experiment, manifest, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = areEqual;
            TextUpdate text2 = synchronizeSessionResponse.getText();
            Intrinsics.checkNotNull(text2);
            ConsentPane consent2 = text2.getConsent();
            Intrinsics.checkNotNull(consent2);
            visual = synchronizeSessionResponse.getVisual();
            if (visual != null) {
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return new ConsentState.Payload(consent2, emptyList, z);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ConsentState.Payload> continuation) {
            return ((C187491) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentState;", "Ldp;", "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;", "it", "invoke", "(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Ldp;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.financialconnections.features.consent.ConsentViewModel$2 */
    /* loaded from: classes7.dex */
    public static final class C187502 extends Lambda implements Function2<ConsentState, AbstractC19862dp<? extends ConsentState.Payload>, ConsentState> {
        public static final C187502 INSTANCE = new C187502();

        public C187502() {
            super(2);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final ConsentState invoke2(ConsentState execute, AbstractC19862dp<ConsentState.Payload> it) {
            Intrinsics.checkNotNullParameter(execute, "$this$execute");
            Intrinsics.checkNotNullParameter(it, "it");
            return ConsentState.copy$default(execute, it, null, null, null, null, 30, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ ConsentState invoke(ConsentState consentState, AbstractC19862dp<? extends ConsentState.Payload> abstractC19862dp) {
            return invoke2(consentState, (AbstractC19862dp<ConsentState.Payload>) abstractC19862dp);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion;", "LWN2;", "Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;", "Lcom/stripe/android/financialconnections/features/consent/ConsentState;", "LPr6;", "viewModelContext", TransferTable.COLUMN_STATE, "create", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion implements WN2<ConsentViewModel, ConsentState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public ConsentViewModel create(AbstractC35282Pr6 viewModelContext, ConsentState state) {
            Intrinsics.checkNotNullParameter(viewModelContext, "viewModelContext");
            Intrinsics.checkNotNullParameter(state, "state");
            return ((FinancialConnectionsSheetNativeActivity) viewModelContext.m89681a()).getViewModel().getActivityRetainedComponent().getConsentBuilder().initialState(state).build().getViewModel();
        }

        public ConsentState initialState(AbstractC35282Pr6 abstractC35282Pr6) {
            return (ConsentState) WN2.C9011a.m78516a(this, abstractC35282Pr6);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConsentClickableText.values().length];
            try {
                iArr[ConsentClickableText.DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConsentClickableText.MANUAL_ENTRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConsentClickableText.LEGAL_DETAILS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentViewModel(ConsentState initialState, AcceptConsent acceptConsent, GoNext goNext, GetOrFetchSync getOrFetchSync, NavigationManager navigationManager, FinancialConnectionsAnalyticsTracker eventTracker, UriUtils uriUtils, Logger logger) {
        super(initialState, null, 2, null);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(acceptConsent, "acceptConsent");
        Intrinsics.checkNotNullParameter(goNext, "goNext");
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(uriUtils, "uriUtils");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.acceptConsent = acceptConsent;
        this.goNext = goNext;
        this.getOrFetchSync = getOrFetchSync;
        this.navigationManager = navigationManager;
        this.eventTracker = eventTracker;
        this.uriUtils = uriUtils;
        this.logger = logger;
        logErrors();
        RN2.execute$default(this, new C187491(null), (SC0) null, (KProperty1) null, C187502.INSTANCE, 3, (Object) null);
    }

    private final void logErrors() {
        onAsync(ConsentViewModel$logErrors$1.INSTANCE, new ConsentViewModel$logErrors$2(this, null), new ConsentViewModel$logErrors$3(this, null));
        RN2.onAsync$default(this, ConsentViewModel$logErrors$4.INSTANCE, new ConsentViewModel$logErrors$5(this, null), null, 4, null);
    }

    public final void onClickableTextClick(String uri) {
        ConsentClickableText consentClickableText;
        int i;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Z30.m73800d(getViewModelScope(), null, null, new ConsentViewModel$onClickableTextClick$1(this, uri, null), 3, null);
        Date date = new Date();
        if (URLUtil.isNetworkUrl(uri)) {
            setState(new ConsentViewModel$onClickableTextClick$2(uri, date));
            return;
        }
        ConsentClickableText[] values = ConsentClickableText.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                consentClickableText = values[i2];
                if (this.uriUtils.compareSchemeAuthorityAndPath(consentClickableText.getValue(), uri)) {
                    break;
                }
                i2++;
            } else {
                consentClickableText = null;
                break;
            }
        }
        if (consentClickableText == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[consentClickableText.ordinal()];
        }
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        setState(new ConsentViewModel$onClickableTextClick$4(date));
                        return;
                    }
                    return;
                }
                this.navigationManager.navigate(NavigationDirections.INSTANCE.getManualEntry());
                return;
            }
            setState(new ConsentViewModel$onClickableTextClick$3(date));
            return;
        }
        Logger.DefaultImpls.error$default(this.logger, "Unrecognized clickable text: " + uri, null, 2, null);
    }

    public final void onContinueClick() {
        RN2.execute$default(this, new ConsentViewModel$onContinueClick$1(this, null), (SC0) null, (KProperty1) null, ConsentViewModel$onContinueClick$2.INSTANCE, 3, (Object) null);
    }

    public final void onViewEffectLaunched() {
        setState(ConsentViewModel$onViewEffectLaunched$1.INSTANCE);
    }
}
