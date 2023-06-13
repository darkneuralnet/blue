package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.features.consent.ConsentTextBuilder;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts$invoke$3", m28418f = "PollAuthorizationSessionAccounts.kt", m28417i = {}, m28416l = {38}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PollAuthorizationSessionAccounts$invoke$3 extends SuspendLambda implements Function1<Continuation<? super PartnerAccountsList>, Object> {
    final /* synthetic */ boolean $canRetry;
    final /* synthetic */ FinancialConnectionsSessionManifest $manifest;
    int label;
    final /* synthetic */ PollAuthorizationSessionAccounts this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollAuthorizationSessionAccounts$invoke$3(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, PollAuthorizationSessionAccounts pollAuthorizationSessionAccounts, boolean z, Continuation<? super PollAuthorizationSessionAccounts$invoke$3> continuation) {
        super(1, continuation);
        this.$manifest = financialConnectionsSessionManifest;
        this.this$0 = pollAuthorizationSessionAccounts;
        this.$canRetry = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PollAuthorizationSessionAccounts$invoke$3(this.$manifest, this.this$0, this.$canRetry, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        StripeException domainException;
        FinancialConnectionsAccountsRepository financialConnectionsAccountsRepository;
        FinancialConnectionsSheet.Configuration configuration;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = true;
        try {
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                FinancialConnectionsAuthorizationSession activeAuthSession = this.$manifest.getActiveAuthSession();
                if (activeAuthSession != null) {
                    financialConnectionsAccountsRepository = this.this$0.repository;
                    configuration = this.this$0.configuration;
                    String financialConnectionsSessionClientSecret = configuration.getFinancialConnectionsSessionClientSecret();
                    String id = activeAuthSession.getId();
                    this.label = 1;
                    obj = financialConnectionsAccountsRepository.postAuthorizationSessionAccounts(financialConnectionsSessionClientSecret, id, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            PartnerAccountsList partnerAccountsList = (PartnerAccountsList) obj;
            if (partnerAccountsList.getData().isEmpty()) {
                FinancialConnectionsInstitution activeInstitution = this.$manifest.getActiveInstitution();
                if (activeInstitution != null) {
                    boolean allowManualEntry = this.$manifest.getAllowManualEntry();
                    APIException aPIException = new APIException(null, null, 0, null, null, 31, null);
                    if (!allowManualEntry) {
                        z = false;
                    }
                    throw new AccountLoadError(z, this.$canRetry, activeInstitution, aPIException);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            return partnerAccountsList;
        } catch (StripeException e) {
            domainException = this.this$0.toDomainException(e, this.$manifest.getActiveInstitution(), ConsentTextBuilder.INSTANCE.getBusinessName(this.$manifest), this.$canRetry, this.$manifest.getAllowManualEntry());
            throw domainException;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super PartnerAccountsList> continuation) {
        return ((PollAuthorizationSessionAccounts$invoke$3) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
