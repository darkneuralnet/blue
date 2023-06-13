package com.stripe.android.financialconnections.features.partnerauth;

import android.webkit.URLUtil;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.AuthSessionEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.CancelAuthorizationSession;
import com.stripe.android.financialconnections.domain.CompleteAuthorizationSession;
import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.domain.GoNext;
import com.stripe.android.financialconnections.domain.PollAuthorizationSessionOAuthResults;
import com.stripe.android.financialconnections.domain.PostAuthSessionEvent;
import com.stripe.android.financialconnections.domain.PostAuthorizationSession;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthState;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.MixedOAuthParams;
import com.stripe.android.financialconnections.navigation.NavigationCommand;
import com.stripe.android.financialconnections.navigation.NavigationDirections;
import com.stripe.android.financialconnections.navigation.NavigationManager;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.utils.UriUtils;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
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
import kotlin.text.StringsKt__StringsJVMKt;
import p000.WN2;
@Metadata(m28433d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=Bs\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\b\b\u0001\u0010#\u001a\u00020\u0011\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010:\u001a\u00020\u0002¢\u0006\u0004\b;\u0010<J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0013\u0010\u0006\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0007J\u0013\u0010\r\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u0003J\u0006\u0010\u000f\u001a\u00020\u0003J\u0014\u0010\u0013\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011J\u0006\u0010\u0017\u001a\u00020\u0003R\u0014\u0010\r\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;", "LRN2;", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;", "", "observePayload", "logErrors", "launchAuthInBrowser", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "error", "onAuthFailed", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAuthCancelled", "completeAuthorizationSession", "onLaunchAuthClick", "onSelectAnotherBank", "Ldp;", "", "webStatus", "onWebAuthFlowFinished", "onEnterDetailsManuallyClick", "uri", "onClickableTextClick", "onViewEffectLaunched", "Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;", "Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;", "Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;", "createAuthorizationSession", "Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;", "Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;", "cancelAuthorizationSession", "Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", NamedConstantsKt.APPLICATION_ID, "Ljava/lang/String;", "Lcom/stripe/android/financialconnections/utils/UriUtils;", "uriUtils", "Lcom/stripe/android/financialconnections/utils/UriUtils;", "Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;", "postAuthSessionEvent", "Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;", "Lcom/stripe/android/financialconnections/domain/GetManifest;", "getManifest", "Lcom/stripe/android/financialconnections/domain/GetManifest;", "Lcom/stripe/android/financialconnections/domain/GoNext;", "goNext", "Lcom/stripe/android/financialconnections/domain/GoNext;", "Lcom/stripe/android/financialconnections/navigation/NavigationManager;", "navigationManager", "Lcom/stripe/android/financialconnections/navigation/NavigationManager;", "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;", "pollAuthorizationSessionOAuthResults", "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "initialState", "<init>", "(Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;)V", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPartnerAuthViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartnerAuthViewModel.kt\ncom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,290:1\n1#2:291\n1282#3,2:292\n*S KotlinDebug\n*F\n+ 1 PartnerAuthViewModel.kt\ncom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel\n*L\n253#1:292,2\n*E\n"})
/* loaded from: classes7.dex */
public final class PartnerAuthViewModel extends RN2<PartnerAuthState> {
    public static final Companion Companion = new Companion(null);
    private final String applicationId;
    private final CancelAuthorizationSession cancelAuthorizationSession;
    private final CompleteAuthorizationSession completeAuthorizationSession;
    private final PostAuthorizationSession createAuthorizationSession;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final GetManifest getManifest;
    private final GoNext goNext;
    private final Logger logger;
    private final NavigationManager navigationManager;
    private final PollAuthorizationSessionOAuthResults pollAuthorizationSessionOAuthResults;
    private final PostAuthSessionEvent postAuthSessionEvent;
    private final UriUtils uriUtils;

    @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$1", m28418f = "PartnerAuthViewModel.kt", m28417i = {0, 1, 1}, m28416l = {64, 65, 76}, m28415m = "invokeSuspend", m28414n = {"launchedEvent", "launchedEvent", "manifest"}, m28413s = {"L$0", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nPartnerAuthViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartnerAuthViewModel.kt\ncom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
    /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C188621 extends SuspendLambda implements Function1<Continuation<? super PartnerAuthState.Payload>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public C188621(Continuation<? super C188621> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C188621(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            AuthSessionEvent.Launched launched;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            FinancialConnectionsInstitution activeInstitution;
            boolean z;
            List<? extends AuthSessionEvent> listOfNotNull;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            PartnerAuthState.Payload payload = (PartnerAuthState.Payload) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            ((Result) obj).m116792unboximpl();
                            return payload;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.L$1;
                    launched = (AuthSessionEvent.Launched) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) obj;
                    activeInstitution = financialConnectionsSessionManifest.getActiveInstitution();
                    if (activeInstitution == null) {
                        Boolean isStripeDirect = financialConnectionsSessionManifest.isStripeDirect();
                        if (isStripeDirect != null) {
                            z = isStripeDirect.booleanValue();
                        } else {
                            z = false;
                        }
                        PartnerAuthState.Payload payload2 = new PartnerAuthState.Payload(z, activeInstitution, financialConnectionsAuthorizationSession);
                        PartnerAuthViewModel partnerAuthViewModel = PartnerAuthViewModel.this;
                        AuthSessionEvent.Loaded loaded = new AuthSessionEvent.Loaded(new Date());
                        if (!financialConnectionsAuthorizationSession.isOAuth()) {
                            loaded = null;
                        }
                        PostAuthSessionEvent postAuthSessionEvent = partnerAuthViewModel.postAuthSessionEvent;
                        String id = financialConnectionsAuthorizationSession.getId();
                        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new AuthSessionEvent[]{launched, loaded});
                        this.L$0 = payload2;
                        this.L$1 = null;
                        this.label = 3;
                        if (postAuthSessionEvent.m116349invoke0E7RQCE(id, listOfNotNull, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return payload2;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                ResultKt.throwOnFailure(obj);
                launched = (AuthSessionEvent.Launched) this.L$0;
            } else {
                ResultKt.throwOnFailure(obj);
                AuthSessionEvent.Launched launched2 = new AuthSessionEvent.Launched(new Date());
                GetManifest getManifest = PartnerAuthViewModel.this.getManifest;
                this.L$0 = launched2;
                this.label = 1;
                Object invoke = getManifest.invoke(this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                launched = launched2;
                obj = invoke;
            }
            financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) obj;
            PostAuthorizationSession postAuthorizationSession = PartnerAuthViewModel.this.createAuthorizationSession;
            FinancialConnectionsInstitution activeInstitution2 = financialConnectionsSessionManifest.getActiveInstitution();
            if (activeInstitution2 != null) {
                boolean allowManualEntry = financialConnectionsSessionManifest.getAllowManualEntry();
                this.L$0 = launched;
                this.L$1 = financialConnectionsSessionManifest;
                this.label = 2;
                obj = postAuthorizationSession.invoke(activeInstitution2, allowManualEntry, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession2 = (FinancialConnectionsAuthorizationSession) obj;
                activeInstitution = financialConnectionsSessionManifest.getActiveInstitution();
                if (activeInstitution == null) {
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super PartnerAuthState.Payload> continuation) {
            return ((C188621) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;", "Ldp;", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;", "it", "invoke", "(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;Ldp;)Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$2 */
    /* loaded from: classes7.dex */
    public static final class C188632 extends Lambda implements Function2<PartnerAuthState, AbstractC19862dp<? extends PartnerAuthState.Payload>, PartnerAuthState> {
        public static final C188632 INSTANCE = new C188632();

        public C188632() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ PartnerAuthState invoke(PartnerAuthState partnerAuthState, AbstractC19862dp<? extends PartnerAuthState.Payload> abstractC19862dp) {
            return invoke2(partnerAuthState, (AbstractC19862dp<PartnerAuthState.Payload>) abstractC19862dp);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final PartnerAuthState invoke2(PartnerAuthState execute, AbstractC19862dp<PartnerAuthState.Payload> it) {
            Intrinsics.checkNotNullParameter(execute, "$this$execute");
            Intrinsics.checkNotNullParameter(it, "it");
            return PartnerAuthState.copy$default(execute, it, null, null, 6, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Companion;", "LWN2;", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;", "LPr6;", "viewModelContext", TransferTable.COLUMN_STATE, "create", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion implements WN2<PartnerAuthViewModel, PartnerAuthState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public PartnerAuthViewModel create(AbstractC35282Pr6 viewModelContext, PartnerAuthState state) {
            Intrinsics.checkNotNullParameter(viewModelContext, "viewModelContext");
            Intrinsics.checkNotNullParameter(state, "state");
            return ((FinancialConnectionsSheetNativeActivity) viewModelContext.m89681a()).getViewModel().getActivityRetainedComponent().getPartnerAuthSubcomponent().initialState(state).build().getViewModel();
        }

        public PartnerAuthState initialState(AbstractC35282Pr6 abstractC35282Pr6) {
            return (PartnerAuthState) WN2.C9011a.m78516a(this, abstractC35282Pr6);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PartnerAuthState.ClickableText.values().length];
            try {
                iArr[PartnerAuthState.ClickableText.DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerAuthViewModel(CompleteAuthorizationSession completeAuthorizationSession, PostAuthorizationSession createAuthorizationSession, CancelAuthorizationSession cancelAuthorizationSession, FinancialConnectionsAnalyticsTracker eventTracker, String applicationId, UriUtils uriUtils, PostAuthSessionEvent postAuthSessionEvent, GetManifest getManifest, GoNext goNext, NavigationManager navigationManager, PollAuthorizationSessionOAuthResults pollAuthorizationSessionOAuthResults, Logger logger, PartnerAuthState initialState) {
        super(initialState, null, 2, null);
        Intrinsics.checkNotNullParameter(completeAuthorizationSession, "completeAuthorizationSession");
        Intrinsics.checkNotNullParameter(createAuthorizationSession, "createAuthorizationSession");
        Intrinsics.checkNotNullParameter(cancelAuthorizationSession, "cancelAuthorizationSession");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(uriUtils, "uriUtils");
        Intrinsics.checkNotNullParameter(postAuthSessionEvent, "postAuthSessionEvent");
        Intrinsics.checkNotNullParameter(getManifest, "getManifest");
        Intrinsics.checkNotNullParameter(goNext, "goNext");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(pollAuthorizationSessionOAuthResults, "pollAuthorizationSessionOAuthResults");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.completeAuthorizationSession = completeAuthorizationSession;
        this.createAuthorizationSession = createAuthorizationSession;
        this.cancelAuthorizationSession = cancelAuthorizationSession;
        this.eventTracker = eventTracker;
        this.applicationId = applicationId;
        this.uriUtils = uriUtils;
        this.postAuthSessionEvent = postAuthSessionEvent;
        this.getManifest = getManifest;
        this.goNext = goNext;
        this.navigationManager = navigationManager;
        this.pollAuthorizationSessionOAuthResults = pollAuthorizationSessionOAuthResults;
        this.logger = logger;
        logErrors();
        observePayload();
        RN2.execute$default(this, new C188621(null), (SC0) null, (KProperty1) null, C188632.INSTANCE, 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a A[Catch: all -> 0x0076, TryCatch #2 {all -> 0x0076, blocks: (B:52:0x00d6, B:46:0x00b7, B:48:0x00bd, B:58:0x010b, B:32:0x0072, B:41:0x0092, B:43:0x009a, B:62:0x0119, B:63:0x0124), top: B:76:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd A[Catch: all -> 0x0076, TryCatch #2 {all -> 0x0076, blocks: (B:52:0x00d6, B:46:0x00b7, B:48:0x00bd, B:58:0x010b, B:32:0x0072, B:41:0x0092, B:43:0x009a, B:62:0x0119, B:63:0x0124), top: B:76:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b A[Catch: all -> 0x0076, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0076, blocks: (B:52:0x00d6, B:46:0x00b7, B:48:0x00bd, B:58:0x010b, B:32:0x0072, B:41:0x0092, B:43:0x009a, B:62:0x0119, B:63:0x0124), top: B:76:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119 A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #2 {all -> 0x0076, blocks: (B:52:0x00d6, B:46:0x00b7, B:48:0x00bd, B:58:0x010b, B:32:0x0072, B:41:0x0092, B:43:0x009a, B:62:0x0119, B:63:0x0124), top: B:76:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object completeAuthorizationSession(Continuation<? super Unit> continuation) {
        PartnerAuthViewModel$completeAuthorizationSession$1 partnerAuthViewModel$completeAuthorizationSession$1;
        Object coroutine_suspended;
        int i;
        PartnerAuthViewModel partnerAuthViewModel;
        PartnerAuthViewModel partnerAuthViewModel2;
        FinancialConnectionsAuthorizationSession activeAuthSession;
        NavigationCommand invoke$default;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession;
        Object m116783constructorimpl;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof PartnerAuthViewModel$completeAuthorizationSession$1) {
            partnerAuthViewModel$completeAuthorizationSession$1 = (PartnerAuthViewModel$completeAuthorizationSession$1) continuation;
            int i2 = partnerAuthViewModel$completeAuthorizationSession$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerAuthViewModel$completeAuthorizationSession$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnerAuthViewModel$completeAuthorizationSession$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = partnerAuthViewModel$completeAuthorizationSession$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    partnerAuthViewModel = (PartnerAuthViewModel) partnerAuthViewModel$completeAuthorizationSession$1.L$0;
                                    try {
                                        ResultKt.throwOnFailure(obj);
                                        partnerAuthViewModel.logger.debug("Session authorized!");
                                        invoke$default = GoNext.invoke$default(partnerAuthViewModel.goNext, ((FinancialConnectionsAuthorizationSession) obj).getNextPane(), null, 2, null);
                                        m116783constructorimpl = Result.m116783constructorimpl(invoke$default);
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                    m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                                    if (m116786exceptionOrNullimpl != null) {
                                        partnerAuthViewModel.logger.error("failed authorizing session", m116786exceptionOrNullimpl);
                                        partnerAuthViewModel.setState(new PartnerAuthViewModel$completeAuthorizationSession$3$1(m116786exceptionOrNullimpl));
                                    }
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession2 = (FinancialConnectionsAuthorizationSession) partnerAuthViewModel$completeAuthorizationSession$1.L$1;
                            PartnerAuthViewModel partnerAuthViewModel3 = (PartnerAuthViewModel) partnerAuthViewModel$completeAuthorizationSession$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                financialConnectionsAuthorizationSession = financialConnectionsAuthorizationSession2;
                                partnerAuthViewModel2 = partnerAuthViewModel3;
                                partnerAuthViewModel2.logger.debug("OAuth results received! completing session");
                                CompleteAuthorizationSession completeAuthorizationSession = partnerAuthViewModel2.completeAuthorizationSession;
                                String id = financialConnectionsAuthorizationSession.getId();
                                String publicToken = ((MixedOAuthParams) obj).getPublicToken();
                                partnerAuthViewModel$completeAuthorizationSession$1.L$0 = partnerAuthViewModel2;
                                partnerAuthViewModel$completeAuthorizationSession$1.L$1 = null;
                                partnerAuthViewModel$completeAuthorizationSession$1.label = 4;
                                obj = completeAuthorizationSession.invoke(id, publicToken, partnerAuthViewModel$completeAuthorizationSession$1);
                            } catch (Throwable th2) {
                                th = th2;
                                partnerAuthViewModel = partnerAuthViewModel3;
                            }
                            if (obj != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            partnerAuthViewModel = partnerAuthViewModel2;
                            partnerAuthViewModel.logger.debug("Session authorized!");
                            invoke$default = GoNext.invoke$default(partnerAuthViewModel.goNext, ((FinancialConnectionsAuthorizationSession) obj).getNextPane(), null, 2, null);
                            m116783constructorimpl = Result.m116783constructorimpl(invoke$default);
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession3 = (FinancialConnectionsAuthorizationSession) partnerAuthViewModel$completeAuthorizationSession$1.L$1;
                        PartnerAuthViewModel partnerAuthViewModel4 = (PartnerAuthViewModel) partnerAuthViewModel$completeAuthorizationSession$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            ((Result) obj).m116792unboximpl();
                            activeAuthSession = financialConnectionsAuthorizationSession3;
                            partnerAuthViewModel2 = partnerAuthViewModel4;
                        } catch (Throwable th3) {
                            th = th3;
                            partnerAuthViewModel = partnerAuthViewModel4;
                        }
                        if (!activeAuthSession.isOAuth()) {
                            partnerAuthViewModel2.logger.debug("Web AuthFlow completed! waiting for oauth results");
                            PollAuthorizationSessionOAuthResults pollAuthorizationSessionOAuthResults = partnerAuthViewModel2.pollAuthorizationSessionOAuthResults;
                            partnerAuthViewModel$completeAuthorizationSession$1.L$0 = partnerAuthViewModel2;
                            partnerAuthViewModel$completeAuthorizationSession$1.L$1 = activeAuthSession;
                            partnerAuthViewModel$completeAuthorizationSession$1.label = 3;
                            Object invoke = pollAuthorizationSessionOAuthResults.invoke(activeAuthSession, partnerAuthViewModel$completeAuthorizationSession$1);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            financialConnectionsAuthorizationSession = activeAuthSession;
                            obj = invoke;
                            partnerAuthViewModel2.logger.debug("OAuth results received! completing session");
                            CompleteAuthorizationSession completeAuthorizationSession2 = partnerAuthViewModel2.completeAuthorizationSession;
                            String id2 = financialConnectionsAuthorizationSession.getId();
                            String publicToken2 = ((MixedOAuthParams) obj).getPublicToken();
                            partnerAuthViewModel$completeAuthorizationSession$1.L$0 = partnerAuthViewModel2;
                            partnerAuthViewModel$completeAuthorizationSession$1.L$1 = null;
                            partnerAuthViewModel$completeAuthorizationSession$1.label = 4;
                            obj = completeAuthorizationSession2.invoke(id2, publicToken2, partnerAuthViewModel$completeAuthorizationSession$1);
                            if (obj != coroutine_suspended) {
                            }
                        } else {
                            invoke$default = GoNext.invoke$default(partnerAuthViewModel2.goNext, FinancialConnectionsSessionManifest.Pane.ACCOUNT_PICKER, null, 2, null);
                            partnerAuthViewModel = partnerAuthViewModel2;
                            m116783constructorimpl = Result.m116783constructorimpl(invoke$default);
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl != null) {
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        partnerAuthViewModel2 = (PartnerAuthViewModel) partnerAuthViewModel$completeAuthorizationSession$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            partnerAuthViewModel = partnerAuthViewModel2;
                        }
                    }
                    Result.Companion companion = Result.Companion;
                    m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                    m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                try {
                    Result.Companion companion2 = Result.Companion;
                    setState(PartnerAuthViewModel$completeAuthorizationSession$2$1.INSTANCE);
                    GetManifest getManifest = this.getManifest;
                    partnerAuthViewModel$completeAuthorizationSession$1.L$0 = this;
                    partnerAuthViewModel$completeAuthorizationSession$1.label = 1;
                    obj = getManifest.invoke(partnerAuthViewModel$completeAuthorizationSession$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    partnerAuthViewModel2 = this;
                } catch (Throwable th5) {
                    th = th5;
                    partnerAuthViewModel = this;
                }
                activeAuthSession = ((FinancialConnectionsSessionManifest) obj).getActiveAuthSession();
                if (activeAuthSession == null) {
                    PostAuthSessionEvent postAuthSessionEvent = partnerAuthViewModel2.postAuthSessionEvent;
                    String id3 = activeAuthSession.getId();
                    AuthSessionEvent.Success success = new AuthSessionEvent.Success(new Date());
                    partnerAuthViewModel$completeAuthorizationSession$1.L$0 = partnerAuthViewModel2;
                    partnerAuthViewModel$completeAuthorizationSession$1.L$1 = activeAuthSession;
                    partnerAuthViewModel$completeAuthorizationSession$1.label = 2;
                    if (postAuthSessionEvent.m116348invoke0E7RQCE(id3, success, partnerAuthViewModel$completeAuthorizationSession$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!activeAuthSession.isOAuth()) {
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
        }
        partnerAuthViewModel$completeAuthorizationSession$1 = new PartnerAuthViewModel$completeAuthorizationSession$1(this, continuation);
        Object obj2 = partnerAuthViewModel$completeAuthorizationSession$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = partnerAuthViewModel$completeAuthorizationSession$1.label;
        if (i == 0) {
        }
        activeAuthSession = ((FinancialConnectionsSessionManifest) obj2).getActiveAuthSession();
        if (activeAuthSession == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[Catch: all -> 0x004a, TryCatch #1 {all -> 0x004a, blocks: (B:16:0x0046, B:25:0x005f, B:27:0x0067, B:28:0x006c, B:29:0x0077), top: B:51:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x004a, TryCatch #1 {all -> 0x004a, blocks: (B:16:0x0046, B:25:0x005f, B:27:0x0067, B:28:0x006c, B:29:0x0077), top: B:51:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object launchAuthInBrowser(Continuation<? super Unit> continuation) {
        PartnerAuthViewModel$launchAuthInBrowser$1 partnerAuthViewModel$launchAuthInBrowser$1;
        Object coroutine_suspended;
        int i;
        PartnerAuthViewModel partnerAuthViewModel;
        Object m116783constructorimpl;
        Throwable m116786exceptionOrNullimpl;
        PartnerAuthViewModel partnerAuthViewModel2;
        Throwable th;
        String url;
        String replaceFirst$default;
        FinancialConnectionsAuthorizationSession activeAuthSession;
        if (continuation instanceof PartnerAuthViewModel$launchAuthInBrowser$1) {
            partnerAuthViewModel$launchAuthInBrowser$1 = (PartnerAuthViewModel$launchAuthInBrowser$1) continuation;
            int i2 = partnerAuthViewModel$launchAuthInBrowser$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerAuthViewModel$launchAuthInBrowser$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnerAuthViewModel$launchAuthInBrowser$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = partnerAuthViewModel$launchAuthInBrowser$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            th = (Throwable) partnerAuthViewModel$launchAuthInBrowser$1.L$2;
                            partnerAuthViewModel2 = (PartnerAuthViewModel) partnerAuthViewModel$launchAuthInBrowser$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            ((Result) obj).m116792unboximpl();
                            partnerAuthViewModel2.logger.error("failed retrieving active session from cache", th);
                            partnerAuthViewModel2.setState(new PartnerAuthViewModel$launchAuthInBrowser$4$1(th));
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    partnerAuthViewModel = (PartnerAuthViewModel) partnerAuthViewModel$launchAuthInBrowser$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
                        }
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion2 = Result.Companion;
                        GetManifest getManifest = this.getManifest;
                        partnerAuthViewModel$launchAuthInBrowser$1.L$0 = this;
                        partnerAuthViewModel$launchAuthInBrowser$1.label = 1;
                        obj = getManifest.invoke(partnerAuthViewModel$launchAuthInBrowser$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        partnerAuthViewModel = this;
                    } catch (Throwable th3) {
                        th = th3;
                        partnerAuthViewModel = this;
                        Result.Companion companion3 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
                            String str = partnerAuthViewModel.applicationId;
                            replaceFirst$default = StringsKt__StringsJVMKt.replaceFirst$default(url, "stripe-auth://native-redirect/" + str + "/", "", false, 4, (Object) null);
                            if (replaceFirst$default != null) {
                            }
                        }
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                activeAuthSession = ((FinancialConnectionsSessionManifest) obj).getActiveAuthSession();
                if (activeAuthSession == null) {
                    m116783constructorimpl = Result.m116783constructorimpl(activeAuthSession);
                    if (Result.m116790isSuccessimpl(m116783constructorimpl) && (url = ((FinancialConnectionsAuthorizationSession) m116783constructorimpl).getUrl()) != null) {
                        String str2 = partnerAuthViewModel.applicationId;
                        replaceFirst$default = StringsKt__StringsJVMKt.replaceFirst$default(url, "stripe-auth://native-redirect/" + str2 + "/", "", false, 4, (Object) null);
                        if (replaceFirst$default != null) {
                            partnerAuthViewModel.setState(new PartnerAuthViewModel$launchAuthInBrowser$3$1$1(replaceFirst$default));
                        }
                    }
                    m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl != null) {
                        FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker = partnerAuthViewModel.eventTracker;
                        FinancialConnectionsEvent.Error error = new FinancialConnectionsEvent.Error(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH, m116786exceptionOrNullimpl);
                        partnerAuthViewModel$launchAuthInBrowser$1.L$0 = partnerAuthViewModel;
                        partnerAuthViewModel$launchAuthInBrowser$1.L$1 = m116783constructorimpl;
                        partnerAuthViewModel$launchAuthInBrowser$1.L$2 = m116786exceptionOrNullimpl;
                        partnerAuthViewModel$launchAuthInBrowser$1.label = 2;
                        if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(error, partnerAuthViewModel$launchAuthInBrowser$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        partnerAuthViewModel2 = partnerAuthViewModel;
                        th = m116786exceptionOrNullimpl;
                        partnerAuthViewModel2.logger.error("failed retrieving active session from cache", th);
                        partnerAuthViewModel2.setState(new PartnerAuthViewModel$launchAuthInBrowser$4$1(th));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        partnerAuthViewModel$launchAuthInBrowser$1 = new PartnerAuthViewModel$launchAuthInBrowser$1(this, continuation);
        Object obj2 = partnerAuthViewModel$launchAuthInBrowser$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = partnerAuthViewModel$launchAuthInBrowser$1.label;
        if (i == 0) {
        }
        activeAuthSession = ((FinancialConnectionsSessionManifest) obj2).getActiveAuthSession();
        if (activeAuthSession == null) {
        }
    }

    private final void logErrors() {
        onAsync(PartnerAuthViewModel$logErrors$1.INSTANCE, new PartnerAuthViewModel$logErrors$2(this, null), new PartnerAuthViewModel$logErrors$3(this, null));
    }

    private final void observePayload() {
        RN2.onAsync$default(this, PartnerAuthViewModel$observePayload$1.INSTANCE, null, new PartnerAuthViewModel$observePayload$2(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|79|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:21:0x0051, B:55:0x00fc, B:57:0x0106, B:63:0x0124, B:64:0x012d, B:24:0x005a, B:52:0x00ee, B:47:0x00c1, B:49:0x00c9, B:65:0x012e, B:32:0x007b, B:41:0x00a3, B:43:0x00ab, B:72:0x015d, B:73:0x0166), top: B:86:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9 A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:21:0x0051, B:55:0x00fc, B:57:0x0106, B:63:0x0124, B:64:0x012d, B:24:0x005a, B:52:0x00ee, B:47:0x00c1, B:49:0x00c9, B:65:0x012e, B:32:0x007b, B:41:0x00a3, B:43:0x00ab, B:72:0x015d, B:73:0x0166), top: B:86:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0106 A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #3 {all -> 0x007f, blocks: (B:21:0x0051, B:55:0x00fc, B:57:0x0106, B:63:0x0124, B:64:0x012d, B:24:0x005a, B:52:0x00ee, B:47:0x00c1, B:49:0x00c9, B:65:0x012e, B:32:0x007b, B:41:0x00a3, B:43:0x00ab, B:72:0x015d, B:73:0x0166), top: B:86:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124 A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #3 {all -> 0x007f, blocks: (B:21:0x0051, B:55:0x00fc, B:57:0x0106, B:63:0x0124, B:64:0x012d, B:24:0x005a, B:52:0x00ee, B:47:0x00c1, B:49:0x00c9, B:65:0x012e, B:32:0x007b, B:41:0x00a3, B:43:0x00ab, B:72:0x015d, B:73:0x0166), top: B:86:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #3 {all -> 0x007f, blocks: (B:21:0x0051, B:55:0x00fc, B:57:0x0106, B:63:0x0124, B:64:0x012d, B:24:0x005a, B:52:0x00ee, B:47:0x00c1, B:49:0x00c9, B:65:0x012e, B:32:0x007b, B:41:0x00a3, B:43:0x00ab, B:72:0x015d, B:73:0x0166), top: B:86:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015d A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #3 {all -> 0x007f, blocks: (B:21:0x0051, B:55:0x00fc, B:57:0x0106, B:63:0x0124, B:64:0x012d, B:24:0x005a, B:52:0x00ee, B:47:0x00c1, B:49:0x00c9, B:65:0x012e, B:32:0x007b, B:41:0x00a3, B:43:0x00ab, B:72:0x015d, B:73:0x0166), top: B:86:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0179  */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onAuthCancelled(Continuation<? super Unit> continuation) {
        PartnerAuthViewModel$onAuthCancelled$1 partnerAuthViewModel$onAuthCancelled$1;
        Object coroutine_suspended;
        ?? r2;
        Object m116783constructorimpl;
        PartnerAuthViewModel partnerAuthViewModel;
        Throwable m116786exceptionOrNullimpl;
        PartnerAuthViewModel partnerAuthViewModel2;
        FinancialConnectionsAuthorizationSession activeAuthSession;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession2;
        PartnerAuthViewModel partnerAuthViewModel3;
        FinancialConnectionsInstitution activeInstitution;
        PartnerAuthViewModel partnerAuthViewModel4;
        NavigationCommand invoke$default;
        if (continuation instanceof PartnerAuthViewModel$onAuthCancelled$1) {
            PartnerAuthViewModel$onAuthCancelled$1 partnerAuthViewModel$onAuthCancelled$12 = (PartnerAuthViewModel$onAuthCancelled$1) continuation;
            int i = partnerAuthViewModel$onAuthCancelled$12.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                partnerAuthViewModel$onAuthCancelled$12.label = i - Integer.MIN_VALUE;
                partnerAuthViewModel$onAuthCancelled$1 = partnerAuthViewModel$onAuthCancelled$12;
                Object obj = partnerAuthViewModel$onAuthCancelled$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = partnerAuthViewModel$onAuthCancelled$1.label;
                switch (r2) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        try {
                            Result.Companion companion = Result.Companion;
                            this.logger.debug("Auth cancelled, cancelling AuthSession");
                            setState(PartnerAuthViewModel$onAuthCancelled$2$1.INSTANCE);
                            GetManifest getManifest = this.getManifest;
                            partnerAuthViewModel$onAuthCancelled$1.L$0 = this;
                            partnerAuthViewModel$onAuthCancelled$1.label = 1;
                            obj = getManifest.invoke(partnerAuthViewModel$onAuthCancelled$1);
                        } catch (Throwable th) {
                            th = th;
                            partnerAuthViewModel$onAuthCancelled$1 = this;
                            Result.Companion companion2 = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            partnerAuthViewModel = partnerAuthViewModel$onAuthCancelled$1;
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        partnerAuthViewModel2 = this;
                        activeAuthSession = ((FinancialConnectionsSessionManifest) obj).getActiveAuthSession();
                        if (activeAuthSession == null) {
                            CancelAuthorizationSession cancelAuthorizationSession = partnerAuthViewModel2.cancelAuthorizationSession;
                            String id = activeAuthSession.getId();
                            partnerAuthViewModel$onAuthCancelled$1.L$0 = partnerAuthViewModel2;
                            partnerAuthViewModel$onAuthCancelled$1.L$1 = activeAuthSession;
                            partnerAuthViewModel$onAuthCancelled$1.label = 2;
                            Object invoke = cancelAuthorizationSession.invoke(id, partnerAuthViewModel$onAuthCancelled$1);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            financialConnectionsAuthorizationSession = activeAuthSession;
                            obj = invoke;
                            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession3 = (FinancialConnectionsAuthorizationSession) obj;
                            if (!financialConnectionsAuthorizationSession.isOAuth()) {
                                partnerAuthViewModel2.logger.debug("Creating a new session for this OAuth institution");
                                PostAuthSessionEvent postAuthSessionEvent = partnerAuthViewModel2.postAuthSessionEvent;
                                String id2 = financialConnectionsAuthorizationSession.getId();
                                AuthSessionEvent.Retry retry = new AuthSessionEvent.Retry(new Date());
                                partnerAuthViewModel$onAuthCancelled$1.L$0 = partnerAuthViewModel2;
                                partnerAuthViewModel$onAuthCancelled$1.L$1 = null;
                                partnerAuthViewModel$onAuthCancelled$1.label = 3;
                                if (postAuthSessionEvent.m116348invoke0E7RQCE(id2, retry, partnerAuthViewModel$onAuthCancelled$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                GetManifest getManifest2 = partnerAuthViewModel2.getManifest;
                                partnerAuthViewModel$onAuthCancelled$1.L$0 = partnerAuthViewModel2;
                                partnerAuthViewModel$onAuthCancelled$1.label = 4;
                                obj = getManifest2.invoke(partnerAuthViewModel$onAuthCancelled$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                FinancialConnectionsSessionManifest financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) obj;
                                PostAuthorizationSession postAuthorizationSession = partnerAuthViewModel2.createAuthorizationSession;
                                activeInstitution = financialConnectionsSessionManifest.getActiveInstitution();
                                if (activeInstitution != null) {
                                    boolean allowManualEntry = financialConnectionsSessionManifest.getAllowManualEntry();
                                    partnerAuthViewModel$onAuthCancelled$1.L$0 = partnerAuthViewModel2;
                                    partnerAuthViewModel$onAuthCancelled$1.label = 5;
                                    obj = postAuthorizationSession.invoke(activeInstitution, allowManualEntry, partnerAuthViewModel$onAuthCancelled$1);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    partnerAuthViewModel4 = partnerAuthViewModel2;
                                    invoke$default = GoNext.invoke$default(partnerAuthViewModel4.goNext, ((FinancialConnectionsAuthorizationSession) obj).getNextPane(), null, 2, null);
                                    partnerAuthViewModel$onAuthCancelled$1 = partnerAuthViewModel4;
                                    m116783constructorimpl = Result.m116783constructorimpl(invoke$default);
                                    partnerAuthViewModel = partnerAuthViewModel$onAuthCancelled$1;
                                    m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                                    if (m116786exceptionOrNullimpl != null) {
                                        partnerAuthViewModel.logger.error("failed cancelling session after cancelled web flow", m116786exceptionOrNullimpl);
                                        partnerAuthViewModel.setState(new PartnerAuthViewModel$onAuthCancelled$3$1(m116786exceptionOrNullimpl));
                                    }
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            PostAuthSessionEvent postAuthSessionEvent2 = partnerAuthViewModel2.postAuthSessionEvent;
                            String id3 = financialConnectionsAuthorizationSession.getId();
                            AuthSessionEvent.Cancel cancel = new AuthSessionEvent.Cancel(new Date());
                            partnerAuthViewModel$onAuthCancelled$1.L$0 = partnerAuthViewModel2;
                            partnerAuthViewModel$onAuthCancelled$1.L$1 = financialConnectionsAuthorizationSession3;
                            partnerAuthViewModel$onAuthCancelled$1.label = 6;
                            if (postAuthSessionEvent2.m116348invoke0E7RQCE(id3, cancel, partnerAuthViewModel$onAuthCancelled$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            financialConnectionsAuthorizationSession2 = financialConnectionsAuthorizationSession3;
                            partnerAuthViewModel3 = partnerAuthViewModel2;
                            invoke$default = GoNext.invoke$default(partnerAuthViewModel3.goNext, financialConnectionsAuthorizationSession2.getNextPane(), null, 2, null);
                            partnerAuthViewModel$onAuthCancelled$1 = partnerAuthViewModel3;
                            m116783constructorimpl = Result.m116783constructorimpl(invoke$default);
                            partnerAuthViewModel = partnerAuthViewModel$onAuthCancelled$1;
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 1:
                        partnerAuthViewModel2 = (PartnerAuthViewModel) partnerAuthViewModel$onAuthCancelled$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        activeAuthSession = ((FinancialConnectionsSessionManifest) obj).getActiveAuthSession();
                        if (activeAuthSession == null) {
                        }
                        break;
                    case 2:
                        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession4 = (FinancialConnectionsAuthorizationSession) partnerAuthViewModel$onAuthCancelled$1.L$1;
                        PartnerAuthViewModel partnerAuthViewModel5 = (PartnerAuthViewModel) partnerAuthViewModel$onAuthCancelled$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            financialConnectionsAuthorizationSession = financialConnectionsAuthorizationSession4;
                            partnerAuthViewModel2 = partnerAuthViewModel5;
                            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession32 = (FinancialConnectionsAuthorizationSession) obj;
                            if (!financialConnectionsAuthorizationSession.isOAuth()) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            partnerAuthViewModel$onAuthCancelled$1 = partnerAuthViewModel5;
                            Result.Companion companion22 = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            partnerAuthViewModel = partnerAuthViewModel$onAuthCancelled$1;
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        break;
                    case 3:
                        partnerAuthViewModel2 = (PartnerAuthViewModel) partnerAuthViewModel$onAuthCancelled$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        ((Result) obj).m116792unboximpl();
                        GetManifest getManifest22 = partnerAuthViewModel2.getManifest;
                        partnerAuthViewModel$onAuthCancelled$1.L$0 = partnerAuthViewModel2;
                        partnerAuthViewModel$onAuthCancelled$1.label = 4;
                        obj = getManifest22.invoke(partnerAuthViewModel$onAuthCancelled$1);
                        if (obj == coroutine_suspended) {
                        }
                        FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) obj;
                        PostAuthorizationSession postAuthorizationSession2 = partnerAuthViewModel2.createAuthorizationSession;
                        activeInstitution = financialConnectionsSessionManifest2.getActiveInstitution();
                        if (activeInstitution != null) {
                        }
                        break;
                    case 4:
                        partnerAuthViewModel2 = (PartnerAuthViewModel) partnerAuthViewModel$onAuthCancelled$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        FinancialConnectionsSessionManifest financialConnectionsSessionManifest22 = (FinancialConnectionsSessionManifest) obj;
                        PostAuthorizationSession postAuthorizationSession22 = partnerAuthViewModel2.createAuthorizationSession;
                        activeInstitution = financialConnectionsSessionManifest22.getActiveInstitution();
                        if (activeInstitution != null) {
                        }
                        break;
                    case 5:
                        partnerAuthViewModel4 = (PartnerAuthViewModel) partnerAuthViewModel$onAuthCancelled$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        invoke$default = GoNext.invoke$default(partnerAuthViewModel4.goNext, ((FinancialConnectionsAuthorizationSession) obj).getNextPane(), null, 2, null);
                        partnerAuthViewModel$onAuthCancelled$1 = partnerAuthViewModel4;
                        m116783constructorimpl = Result.m116783constructorimpl(invoke$default);
                        partnerAuthViewModel = partnerAuthViewModel$onAuthCancelled$1;
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    case 6:
                        financialConnectionsAuthorizationSession2 = (FinancialConnectionsAuthorizationSession) partnerAuthViewModel$onAuthCancelled$1.L$1;
                        PartnerAuthViewModel partnerAuthViewModel6 = (PartnerAuthViewModel) partnerAuthViewModel$onAuthCancelled$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        ((Result) obj).m116792unboximpl();
                        partnerAuthViewModel3 = partnerAuthViewModel6;
                        invoke$default = GoNext.invoke$default(partnerAuthViewModel3.goNext, financialConnectionsAuthorizationSession2.getNextPane(), null, 2, null);
                        partnerAuthViewModel$onAuthCancelled$1 = partnerAuthViewModel3;
                        m116783constructorimpl = Result.m116783constructorimpl(invoke$default);
                        partnerAuthViewModel = partnerAuthViewModel$onAuthCancelled$1;
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        partnerAuthViewModel$onAuthCancelled$1 = new PartnerAuthViewModel$onAuthCancelled$1(this, continuation);
        Object obj2 = partnerAuthViewModel$onAuthCancelled$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = partnerAuthViewModel$onAuthCancelled$1.label;
        switch (r2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095 A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #1 {all -> 0x006a, blocks: (B:26:0x0066, B:35:0x0088, B:37:0x0095, B:45:0x00d0), top: B:59:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0 A[Catch: all -> 0x006a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x006a, blocks: (B:26:0x0066, B:35:0x0088, B:37:0x0095, B:45:0x00d0), top: B:59:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onAuthFailed(Throwable th, Continuation<? super Unit> continuation) {
        PartnerAuthViewModel$onAuthFailed$1 partnerAuthViewModel$onAuthFailed$1;
        Object coroutine_suspended;
        int i;
        PartnerAuthViewModel partnerAuthViewModel;
        PartnerAuthViewModel partnerAuthViewModel2;
        FinancialConnectionsAuthorizationSession activeAuthSession;
        PartnerAuthViewModel partnerAuthViewModel3;
        Throwable th2;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession;
        CancelAuthorizationSession cancelAuthorizationSession;
        String id;
        Object m116783constructorimpl;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof PartnerAuthViewModel$onAuthFailed$1) {
            partnerAuthViewModel$onAuthFailed$1 = (PartnerAuthViewModel$onAuthFailed$1) continuation;
            int i2 = partnerAuthViewModel$onAuthFailed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerAuthViewModel$onAuthFailed$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnerAuthViewModel$onAuthFailed$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = partnerAuthViewModel$onAuthFailed$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                th = (Throwable) partnerAuthViewModel$onAuthFailed$1.L$1;
                                partnerAuthViewModel = (PartnerAuthViewModel) partnerAuthViewModel$onAuthFailed$1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    partnerAuthViewModel.setState(new PartnerAuthViewModel$onAuthFailed$2$1(th));
                                    m116783constructorimpl = Result.m116783constructorimpl(Unit.INSTANCE);
                                } catch (Throwable th3) {
                                    th = th3;
                                    Result.Companion companion = Result.Companion;
                                    m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                                    m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                                    if (m116786exceptionOrNullimpl != null) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                                if (m116786exceptionOrNullimpl != null) {
                                    partnerAuthViewModel.logger.error("failed cancelling session after failed web flow", m116786exceptionOrNullimpl);
                                }
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) partnerAuthViewModel$onAuthFailed$1.L$2;
                        th2 = (Throwable) partnerAuthViewModel$onAuthFailed$1.L$1;
                        partnerAuthViewModel3 = (PartnerAuthViewModel) partnerAuthViewModel$onAuthFailed$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            ((Result) obj).m116792unboximpl();
                            cancelAuthorizationSession = partnerAuthViewModel3.cancelAuthorizationSession;
                            id = financialConnectionsAuthorizationSession.getId();
                            partnerAuthViewModel$onAuthFailed$1.L$0 = partnerAuthViewModel3;
                            partnerAuthViewModel$onAuthFailed$1.L$1 = th2;
                            partnerAuthViewModel$onAuthFailed$1.L$2 = null;
                            partnerAuthViewModel$onAuthFailed$1.label = 3;
                        } catch (Throwable th4) {
                            th = th4;
                            partnerAuthViewModel = partnerAuthViewModel3;
                            Result.Companion companion2 = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (cancelAuthorizationSession.invoke(id, partnerAuthViewModel$onAuthFailed$1) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        th = th2;
                        partnerAuthViewModel = partnerAuthViewModel3;
                        partnerAuthViewModel.setState(new PartnerAuthViewModel$onAuthFailed$2$1(th));
                        m116783constructorimpl = Result.m116783constructorimpl(Unit.INSTANCE);
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    th = (Throwable) partnerAuthViewModel$onAuthFailed$1.L$1;
                    partnerAuthViewModel2 = (PartnerAuthViewModel) partnerAuthViewModel$onAuthFailed$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        partnerAuthViewModel = partnerAuthViewModel2;
                        Result.Companion companion22 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion3 = Result.Companion;
                        this.logger.debug("Auth failed, cancelling AuthSession");
                        GetManifest getManifest = this.getManifest;
                        partnerAuthViewModel$onAuthFailed$1.L$0 = this;
                        partnerAuthViewModel$onAuthFailed$1.L$1 = th;
                        partnerAuthViewModel$onAuthFailed$1.label = 1;
                        obj = getManifest.invoke(partnerAuthViewModel$onAuthFailed$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        partnerAuthViewModel2 = this;
                    } catch (Throwable th6) {
                        th = th6;
                        partnerAuthViewModel = this;
                        Result.Companion companion222 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                activeAuthSession = ((FinancialConnectionsSessionManifest) obj).getActiveAuthSession();
                partnerAuthViewModel2.logger.error("Auth failed, cancelling AuthSession", th);
                if (activeAuthSession == null) {
                    PostAuthSessionEvent postAuthSessionEvent = partnerAuthViewModel2.postAuthSessionEvent;
                    String id2 = activeAuthSession.getId();
                    AuthSessionEvent.Failure failure = new AuthSessionEvent.Failure(new Date(), th);
                    partnerAuthViewModel$onAuthFailed$1.L$0 = partnerAuthViewModel2;
                    partnerAuthViewModel$onAuthFailed$1.L$1 = th;
                    partnerAuthViewModel$onAuthFailed$1.L$2 = activeAuthSession;
                    partnerAuthViewModel$onAuthFailed$1.label = 2;
                    if (postAuthSessionEvent.m116348invoke0E7RQCE(id2, failure, partnerAuthViewModel$onAuthFailed$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    partnerAuthViewModel3 = partnerAuthViewModel2;
                    th2 = th;
                    financialConnectionsAuthorizationSession = activeAuthSession;
                    cancelAuthorizationSession = partnerAuthViewModel3.cancelAuthorizationSession;
                    id = financialConnectionsAuthorizationSession.getId();
                    partnerAuthViewModel$onAuthFailed$1.L$0 = partnerAuthViewModel3;
                    partnerAuthViewModel$onAuthFailed$1.L$1 = th2;
                    partnerAuthViewModel$onAuthFailed$1.L$2 = null;
                    partnerAuthViewModel$onAuthFailed$1.label = 3;
                    if (cancelAuthorizationSession.invoke(id, partnerAuthViewModel$onAuthFailed$1) != coroutine_suspended) {
                    }
                } else {
                    partnerAuthViewModel2.logger.debug("Could not find AuthSession to cancel.");
                    partnerAuthViewModel = partnerAuthViewModel2;
                    partnerAuthViewModel.setState(new PartnerAuthViewModel$onAuthFailed$2$1(th));
                    m116783constructorimpl = Result.m116783constructorimpl(Unit.INSTANCE);
                    m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        partnerAuthViewModel$onAuthFailed$1 = new PartnerAuthViewModel$onAuthFailed$1(this, continuation);
        Object obj2 = partnerAuthViewModel$onAuthFailed$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = partnerAuthViewModel$onAuthFailed$1.label;
        if (i == 0) {
        }
        activeAuthSession = ((FinancialConnectionsSessionManifest) obj2).getActiveAuthSession();
        partnerAuthViewModel2.logger.error("Auth failed, cancelling AuthSession", th);
        if (activeAuthSession == null) {
        }
    }

    public final void onClickableTextClick(String uri) {
        PartnerAuthState.ClickableText clickableText;
        int i;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Z30.m73800d(getViewModelScope(), null, null, new PartnerAuthViewModel$onClickableTextClick$1(this, uri, null), 3, null);
        if (URLUtil.isNetworkUrl(uri)) {
            setState(new PartnerAuthViewModel$onClickableTextClick$2(uri));
            return;
        }
        PartnerAuthState.ClickableText[] values = PartnerAuthState.ClickableText.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                clickableText = values[i2];
                if (this.uriUtils.compareSchemeAuthorityAndPath(clickableText.getValue(), uri)) {
                    break;
                }
                i2++;
            } else {
                clickableText = null;
                break;
            }
        }
        if (clickableText == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[clickableText.ordinal()];
        }
        if (i != -1) {
            if (i == 1) {
                setState(PartnerAuthViewModel$onClickableTextClick$3.INSTANCE);
                return;
            }
            return;
        }
        Logger.DefaultImpls.error$default(this.logger, "Unrecognized clickable text: " + uri, null, 2, null);
    }

    public final void onEnterDetailsManuallyClick() {
        this.navigationManager.navigate(NavigationDirections.INSTANCE.getManualEntry());
    }

    public final void onLaunchAuthClick() {
        Z30.m73800d(getViewModelScope(), null, null, new PartnerAuthViewModel$onLaunchAuthClick$1(this, null), 3, null);
    }

    public final void onSelectAnotherBank() {
        this.navigationManager.navigate(NavigationDirections.INSTANCE.getReset());
    }

    public final void onViewEffectLaunched() {
        setState(PartnerAuthViewModel$onViewEffectLaunched$1.INSTANCE);
    }

    public final void onWebAuthFlowFinished(AbstractC19862dp<String> webStatus) {
        Intrinsics.checkNotNullParameter(webStatus, "webStatus");
        Logger logger = this.logger;
        logger.debug("Web AuthFlow status received " + webStatus);
        Z30.m73800d(getViewModelScope(), null, null, new PartnerAuthViewModel$onWebAuthFlowFinished$1(webStatus, this, null), 3, null);
    }
}
