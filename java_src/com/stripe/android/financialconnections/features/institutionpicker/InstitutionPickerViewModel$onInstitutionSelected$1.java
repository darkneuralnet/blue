package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.UpdateLocalManifest;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.NavigationDirections;
import com.stripe.android.financialconnections.navigation.NavigationManager;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
@Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$onInstitutionSelected$1", m28418f = "InstitutionPickerViewModel.kt", m28417i = {}, m28416l = {130}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class InstitutionPickerViewModel$onInstitutionSelected$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $fromFeatured;
    final /* synthetic */ FinancialConnectionsInstitution $institution;
    int label;
    final /* synthetic */ InstitutionPickerViewModel this$0;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "it", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$onInstitutionSelected$1$1 */
    /* loaded from: classes7.dex */
    public static final class C188191 extends Lambda implements Function1<FinancialConnectionsSessionManifest, FinancialConnectionsSessionManifest> {
        final /* synthetic */ FinancialConnectionsInstitution $institution;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188191(FinancialConnectionsInstitution financialConnectionsInstitution) {
            super(1);
            this.$institution = financialConnectionsInstitution;
        }

        @Override // kotlin.jvm.functions.Function1
        public final FinancialConnectionsSessionManifest invoke(FinancialConnectionsSessionManifest it) {
            FinancialConnectionsSessionManifest copy;
            Intrinsics.checkNotNullParameter(it, "it");
            copy = it.copy((r60 & 1) != 0 ? it.allowManualEntry : false, (r60 & 2) != 0 ? it.consentRequired : false, (r60 & 4) != 0 ? it.customManualEntryHandling : false, (r60 & 8) != 0 ? it.disableLinkMoreAccounts : false, (r60 & 16) != 0 ? it.f75311id : null, (r60 & 32) != 0 ? it.instantVerificationDisabled : false, (r60 & 64) != 0 ? it.institutionSearchDisabled : false, (r60 & 128) != 0 ? it.livemode : false, (r60 & 256) != 0 ? it.manualEntryUsesMicrodeposits : false, (r60 & 512) != 0 ? it.mobileHandoffEnabled : false, (r60 & 1024) != 0 ? it.nextPane : null, (r60 & 2048) != 0 ? it.manualEntryMode : null, (r60 & 4096) != 0 ? it.permissions : null, (r60 & 8192) != 0 ? it.product : null, (r60 & 16384) != 0 ? it.singleAccount : false, (r60 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? it.useSingleSortSearch : false, (r60 & 65536) != 0 ? it.accountDisconnectionMethod : null, (r60 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? it.accountholderCustomerEmailAddress : null, (r60 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? it.accountholderIsLinkConsumer : null, (r60 & 524288) != 0 ? it.accountholderPhoneNumber : null, (r60 & 1048576) != 0 ? it.accountholderToken : null, (r60 & 2097152) != 0 ? it.activeAuthSession : null, (r60 & 4194304) != 0 ? it.activeInstitution : this.$institution, (r60 & 8388608) != 0 ? it.assignmentEventId : null, (r60 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? it.businessName : null, (r60 & 33554432) != 0 ? it.cancelUrl : null, (r60 & 67108864) != 0 ? it.connectPlatformName : null, (r60 & 134217728) != 0 ? it.connectedAccountName : null, (r60 & 268435456) != 0 ? it.experimentAssignments : null, (r60 & 536870912) != 0 ? it.features : null, (r60 & 1073741824) != 0 ? it.hostedAuthUrl : null, (r60 & Integer.MIN_VALUE) != 0 ? it.initialInstitution : null, (r61 & 1) != 0 ? it.isEndUserFacing : null, (r61 & 2) != 0 ? it.isLinkWithStripe : null, (r61 & 4) != 0 ? it.isNetworkingUserFlow : null, (r61 & 8) != 0 ? it.isStripeDirect : null, (r61 & 16) != 0 ? it.linkAccountSessionCancellationBehavior : null, (r61 & 32) != 0 ? it.modalCustomization : null, (r61 & 64) != 0 ? it.paymentMethodType : null, (r61 & 128) != 0 ? it.stepUpAuthenticationRequired : null, (r61 & 256) != 0 ? it.successUrl : null, (r61 & 512) != 0 ? it.skipSuccessPane : null);
            return copy;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionPickerViewModel$onInstitutionSelected$1(InstitutionPickerViewModel institutionPickerViewModel, boolean z, FinancialConnectionsInstitution financialConnectionsInstitution, Continuation<? super InstitutionPickerViewModel$onInstitutionSelected$1> continuation) {
        super(1, continuation);
        this.this$0 = institutionPickerViewModel;
        this.$fromFeatured = z;
        this.$institution = financialConnectionsInstitution;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InstitutionPickerViewModel$onInstitutionSelected$1(this.this$0, this.$fromFeatured, this.$institution, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker;
        UpdateLocalManifest updateLocalManifest;
        NavigationManager navigationManager;
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
            financialConnectionsAnalyticsTracker = this.this$0.eventTracker;
            FinancialConnectionsEvent.InstitutionSelected institutionSelected = new FinancialConnectionsEvent.InstitutionSelected(FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER, this.$fromFeatured, this.$institution.getId());
            this.label = 1;
            if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(institutionSelected, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        updateLocalManifest = this.this$0.updateLocalManifest;
        updateLocalManifest.invoke(new C188191(this.$institution));
        navigationManager = this.this$0.navigationManager;
        navigationManager.navigate(NavigationDirections.INSTANCE.getPartnerAuth());
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((InstitutionPickerViewModel$onInstitutionSelected$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
