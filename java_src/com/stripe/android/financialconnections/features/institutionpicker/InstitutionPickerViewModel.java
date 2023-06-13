package com.stripe.android.financialconnections.features.institutionpicker;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.FeaturedInstitutions;
import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.domain.SearchInstitutions;
import com.stripe.android.financialconnections.domain.UpdateLocalManifest;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.navigation.NavigationDirections;
import com.stripe.android.financialconnections.navigation.NavigationManager;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.utils.ConflatedJob;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012BQ\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010/\u001a\u00020\u0002¢\u0006\u0004\b0\u00101J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\u0003J\u0006\u0010\u0012\u001a\u00020\u0003J\u0006\u0010\u0013\u001a\u00020\u0003R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00063"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;", "LRN2;", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;", "", "logErrors", "Ldp;", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "", "isCancellationError", "clearSearch", "", "query", "onQueryChanged", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "institution", "fromFeatured", "onInstitutionSelected", "onCancelSearchClick", "onSearchFocused", "onManualEntryClick", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "Lcom/stripe/android/financialconnections/domain/SearchInstitutions;", "searchInstitutions", "Lcom/stripe/android/financialconnections/domain/SearchInstitutions;", "Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;", "featuredInstitutions", "Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;", "Lcom/stripe/android/financialconnections/domain/GetManifest;", "getManifest", "Lcom/stripe/android/financialconnections/domain/GetManifest;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "Lcom/stripe/android/financialconnections/navigation/NavigationManager;", "navigationManager", "Lcom/stripe/android/financialconnections/navigation/NavigationManager;", "Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;", "updateLocalManifest", "Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "Lcom/stripe/android/financialconnections/utils/ConflatedJob;", "searchJob", "Lcom/stripe/android/financialconnections/utils/ConflatedJob;", "initialState", "<init>", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/financialconnections/domain/SearchInstitutions;Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;)V", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class InstitutionPickerViewModel extends RN2<InstitutionPickerState> {
    public static final Companion Companion = new Companion(null);
    private static final long SEARCH_DEBOUNCE_MS = 300;
    private final FinancialConnectionsSheet.Configuration configuration;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final FeaturedInstitutions featuredInstitutions;
    private final GetManifest getManifest;
    private final Logger logger;
    private final NavigationManager navigationManager;
    private final SearchInstitutions searchInstitutions;
    private ConflatedJob searchJob;
    private final UpdateLocalManifest updateLocalManifest;

    @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$1", m28418f = "InstitutionPickerViewModel.kt", m28417i = {1}, m28416l = {55, 57}, m28415m = "invokeSuspend", m28414n = {"manifest"}, m28413s = {"L$0"})
    @SourceDebugExtension({"SMAP\nInstitutionPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstitutionPickerViewModel.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n1#2:204\n*E\n"})
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C188171 extends SuspendLambda implements Function1<Continuation<? super InstitutionPickerState.Payload>, Object> {
        Object L$0;
        int label;

        public C188171(Continuation<? super C188171> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C188171(continuation);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(15:5|(3:6|7|8)|9|(1:11)|12|(1:14)|15|(1:31)|19|20|21|22|(1:24)|25|26) */
        /* JADX WARN: Can't wrap try/catch for region: R(7:1|(1:(1:(17:5|6|7|8|9|(1:11)|12|(1:14)|15|(1:31)|19|20|21|22|(1:24)|25|26)(2:35|36))(1:37))(2:47|(1:49))|38|39|40|(1:42)(16:43|8|9|(0)|12|(0)|15|(1:17)|31|19|20|21|22|(0)|25|26)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
            r0 = r7;
            r7 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
            r2 = kotlin.Result.Companion;
            r0 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r0));
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            Object m116783constructorimpl;
            InstitutionResponse institutionResponse;
            List<FinancialConnectionsInstitution> emptyList;
            Object m116783constructorimpl2;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            m116783constructorimpl = Result.m116783constructorimpl((InstitutionResponse) obj);
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            Result.Companion companion = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th2));
                            InstitutionPickerViewModel institutionPickerViewModel = InstitutionPickerViewModel.this;
                            if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) != null) {
                            }
                            if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                            }
                            institutionResponse = (InstitutionResponse) m116783constructorimpl;
                            if (institutionResponse != null) {
                            }
                            emptyList = CollectionsKt__CollectionsKt.emptyList();
                            boolean institutionSearchDisabled = financialConnectionsSessionManifest.getInstitutionSearchDisabled();
                            m116783constructorimpl2 = Result.m116783constructorimpl(Boxing.boxBoolean(financialConnectionsSessionManifest.getAllowManualEntry()));
                            if (Result.m116786exceptionOrNullimpl(m116783constructorimpl2) != null) {
                            }
                            return new InstitutionPickerState.Payload(emptyList, ((Boolean) m116783constructorimpl2).booleanValue(), institutionSearchDisabled);
                        }
                        InstitutionPickerViewModel institutionPickerViewModel2 = InstitutionPickerViewModel.this;
                        if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) != null) {
                            Logger.DefaultImpls.error$default(institutionPickerViewModel2.logger, "Error fetching featured institutions", null, 2, null);
                        }
                        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                            m116783constructorimpl = null;
                        }
                        institutionResponse = (InstitutionResponse) m116783constructorimpl;
                        if (institutionResponse != null || (emptyList = institutionResponse.getData()) == null) {
                            emptyList = CollectionsKt__CollectionsKt.emptyList();
                        }
                        boolean institutionSearchDisabled2 = financialConnectionsSessionManifest.getInstitutionSearchDisabled();
                        m116783constructorimpl2 = Result.m116783constructorimpl(Boxing.boxBoolean(financialConnectionsSessionManifest.getAllowManualEntry()));
                        if (Result.m116786exceptionOrNullimpl(m116783constructorimpl2) != null) {
                            m116783constructorimpl2 = Boxing.boxBoolean(false);
                        }
                        return new InstitutionPickerState.Payload(emptyList, ((Boolean) m116783constructorimpl2).booleanValue(), institutionSearchDisabled2);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                GetManifest getManifest = InstitutionPickerViewModel.this.getManifest;
                this.label = 1;
                obj = getManifest.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) obj;
            InstitutionPickerViewModel institutionPickerViewModel3 = InstitutionPickerViewModel.this;
            Result.Companion companion2 = Result.Companion;
            FeaturedInstitutions featuredInstitutions = institutionPickerViewModel3.featuredInstitutions;
            String financialConnectionsSessionClientSecret = institutionPickerViewModel3.configuration.getFinancialConnectionsSessionClientSecret();
            this.L$0 = financialConnectionsSessionManifest2;
            this.label = 2;
            Object invoke = featuredInstitutions.invoke(financialConnectionsSessionClientSecret, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsSessionManifest = financialConnectionsSessionManifest2;
            obj = invoke;
            m116783constructorimpl = Result.m116783constructorimpl((InstitutionResponse) obj);
            InstitutionPickerViewModel institutionPickerViewModel22 = InstitutionPickerViewModel.this;
            if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) != null) {
            }
            if (Result.m116789isFailureimpl(m116783constructorimpl)) {
            }
            institutionResponse = (InstitutionResponse) m116783constructorimpl;
            if (institutionResponse != null) {
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            boolean institutionSearchDisabled22 = financialConnectionsSessionManifest.getInstitutionSearchDisabled();
            m116783constructorimpl2 = Result.m116783constructorimpl(Boxing.boxBoolean(financialConnectionsSessionManifest.getAllowManualEntry()));
            if (Result.m116786exceptionOrNullimpl(m116783constructorimpl2) != null) {
            }
            return new InstitutionPickerState.Payload(emptyList, ((Boolean) m116783constructorimpl2).booleanValue(), institutionSearchDisabled22);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super InstitutionPickerState.Payload> continuation) {
            return ((C188171) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;", "Ldp;", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;", "it", "invoke", "(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;Ldp;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$2 */
    /* loaded from: classes7.dex */
    public static final class C188182 extends Lambda implements Function2<InstitutionPickerState, AbstractC19862dp<? extends InstitutionPickerState.Payload>, InstitutionPickerState> {
        public static final C188182 INSTANCE = new C188182();

        public C188182() {
            super(2);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InstitutionPickerState invoke2(InstitutionPickerState execute, AbstractC19862dp<InstitutionPickerState.Payload> it) {
            Intrinsics.checkNotNullParameter(execute, "$this$execute");
            Intrinsics.checkNotNullParameter(it, "it");
            return InstitutionPickerState.copy$default(execute, false, false, it, null, 11, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ InstitutionPickerState invoke(InstitutionPickerState institutionPickerState, AbstractC19862dp<? extends InstitutionPickerState.Payload> abstractC19862dp) {
            return invoke2(institutionPickerState, (AbstractC19862dp<InstitutionPickerState.Payload>) abstractC19862dp);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$Companion;", "LWN2;", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;", "LPr6;", "viewModelContext", TransferTable.COLUMN_STATE, "create", "", "SEARCH_DEBOUNCE_MS", "J", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion implements WN2<InstitutionPickerViewModel, InstitutionPickerState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public InstitutionPickerViewModel create(AbstractC35282Pr6 viewModelContext, InstitutionPickerState state) {
            Intrinsics.checkNotNullParameter(viewModelContext, "viewModelContext");
            Intrinsics.checkNotNullParameter(state, "state");
            return ((FinancialConnectionsSheetNativeActivity) viewModelContext.m89681a()).getViewModel().getActivityRetainedComponent().getInstitutionPickerBuilder().initialState(state).build().getViewModel();
        }

        public InstitutionPickerState initialState(AbstractC35282Pr6 abstractC35282Pr6) {
            return (InstitutionPickerState) WN2.C9011a.m78516a(this, abstractC35282Pr6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionPickerViewModel(FinancialConnectionsSheet.Configuration configuration, SearchInstitutions searchInstitutions, FeaturedInstitutions featuredInstitutions, GetManifest getManifest, FinancialConnectionsAnalyticsTracker eventTracker, NavigationManager navigationManager, UpdateLocalManifest updateLocalManifest, Logger logger, InstitutionPickerState initialState) {
        super(initialState, null, 2, null);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(searchInstitutions, "searchInstitutions");
        Intrinsics.checkNotNullParameter(featuredInstitutions, "featuredInstitutions");
        Intrinsics.checkNotNullParameter(getManifest, "getManifest");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(updateLocalManifest, "updateLocalManifest");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.configuration = configuration;
        this.searchInstitutions = searchInstitutions;
        this.featuredInstitutions = featuredInstitutions;
        this.getManifest = getManifest;
        this.eventTracker = eventTracker;
        this.navigationManager = navigationManager;
        this.updateLocalManifest = updateLocalManifest;
        this.logger = logger;
        this.searchJob = new ConflatedJob();
        logErrors();
        RN2.execute$default(this, new C188171(null), (SC0) null, (KProperty1) null, C188182.INSTANCE, 3, (Object) null);
    }

    private final void clearSearch() {
        setState(InstitutionPickerViewModel$clearSearch$1.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCancellationError(AbstractC19862dp<InstitutionResponse> abstractC19862dp) {
        if (!(abstractC19862dp instanceof C32163Cj1)) {
            return false;
        }
        C32163Cj1 c32163Cj1 = (C32163Cj1) abstractC19862dp;
        if (!(c32163Cj1.m111793b() instanceof CancellationException) && (!(c32163Cj1.m111793b() instanceof StripeException) || !(c32163Cj1.m111793b().getCause() instanceof CancellationException))) {
            return false;
        }
        return true;
    }

    private final void logErrors() {
        onAsync(InstitutionPickerViewModel$logErrors$1.INSTANCE, new InstitutionPickerViewModel$logErrors$2(this, null), new InstitutionPickerViewModel$logErrors$3(this, null));
        RN2.onAsync$default(this, InstitutionPickerViewModel$logErrors$4.INSTANCE, new InstitutionPickerViewModel$logErrors$5(this, null), null, 4, null);
    }

    public final void onCancelSearchClick() {
        clearSearch();
    }

    public final void onInstitutionSelected(FinancialConnectionsInstitution institution, boolean z) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        clearSearch();
        RN2.execute$default(this, new InstitutionPickerViewModel$onInstitutionSelected$1(this, z, institution, null), (SC0) null, (KProperty1) null, InstitutionPickerViewModel$onInstitutionSelected$2.INSTANCE, 3, (Object) null);
    }

    public final void onManualEntryClick() {
        this.navigationManager.navigate(NavigationDirections.INSTANCE.getManualEntry());
    }

    public final void onQueryChanged(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.searchJob.plusAssign(RN2.execute$default(this, new InstitutionPickerViewModel$onQueryChanged$1(query, this, null), (SC0) null, (KProperty1) null, new InstitutionPickerViewModel$onQueryChanged$2(this), 3, (Object) null));
    }

    public final void onSearchFocused() {
        setState(InstitutionPickerViewModel$onSearchFocused$1.INSTANCE);
    }
}
