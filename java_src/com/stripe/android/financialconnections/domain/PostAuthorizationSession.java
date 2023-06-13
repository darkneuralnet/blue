package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.exception.InstitutionPlannedDowntimeError;
import com.stripe.android.financialconnections.exception.InstitutionUnplannedDowntimeError;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ!\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", NamedConstantsKt.APPLICATION_ID, "", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Ljava/lang/String;)V", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "getRepository", "()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "invoke", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "allowManualEntry", "", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toDomainException", "Lcom/stripe/android/core/exception/StripeException;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PostAuthorizationSession {
    private final String applicationId;
    private final FinancialConnectionsSheet.Configuration configuration;
    private final FinancialConnectionsManifestRepository repository;

    public PostAuthorizationSession(FinancialConnectionsManifestRepository repository, FinancialConnectionsSheet.Configuration configuration, String applicationId) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.repository = repository;
        this.configuration = configuration;
        this.applicationId = applicationId;
    }

    private final StripeException toDomainException(StripeException stripeException, boolean z, FinancialConnectionsInstitution financialConnectionsInstitution) {
        String str;
        boolean z2;
        StripeException institutionPlannedDowntimeError;
        StripeError stripeError = stripeException.getStripeError();
        if (stripeError != null) {
            Map<String, String> extraFields = stripeError.getExtraFields();
            String str2 = null;
            if (extraFields != null) {
                str = extraFields.get("institution_unavailable");
            } else {
                str = null;
            }
            Map<String, String> extraFields2 = stripeError.getExtraFields();
            if (extraFields2 != null) {
                str2 = extraFields2.get("expected_to_be_available_at");
            }
            if (Intrinsics.areEqual(str, "true")) {
                if (str2 != null && str2.length() != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    institutionPlannedDowntimeError = new InstitutionUnplannedDowntimeError(financialConnectionsInstitution, z, stripeException);
                } else {
                    Duration.Companion companion = Duration.Companion;
                    institutionPlannedDowntimeError = new InstitutionPlannedDowntimeError(financialConnectionsInstitution, z, true, Duration.m118158getInWholeMillisecondsimpl(DurationKt.toDuration(Long.parseLong(str2), DurationUnit.SECONDS)), stripeException);
                }
                return institutionPlannedDowntimeError;
            }
            return stripeException;
        }
        return stripeException;
    }

    public final FinancialConnectionsSheet.Configuration getConfiguration() {
        return this.configuration;
    }

    public final FinancialConnectionsManifestRepository getRepository() {
        return this.repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(FinancialConnectionsInstitution financialConnectionsInstitution, boolean z, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) {
        PostAuthorizationSession$invoke$1 postAuthorizationSession$invoke$1;
        Object coroutine_suspended;
        int i;
        PostAuthorizationSession postAuthorizationSession;
        if (continuation instanceof PostAuthorizationSession$invoke$1) {
            postAuthorizationSession$invoke$1 = (PostAuthorizationSession$invoke$1) continuation;
            int i2 = postAuthorizationSession$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                postAuthorizationSession$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = postAuthorizationSession$invoke$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = postAuthorizationSession$invoke$1.label;
                if (i == 0) {
                    if (i == 1) {
                        z = postAuthorizationSession$invoke$1.Z$0;
                        financialConnectionsInstitution = (FinancialConnectionsInstitution) postAuthorizationSession$invoke$1.L$1;
                        postAuthorizationSession = (PostAuthorizationSession) postAuthorizationSession$invoke$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (StripeException e) {
                            e = e;
                            throw postAuthorizationSession.toDomainException(e, z, financialConnectionsInstitution);
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                        FinancialConnectionsManifestRepository financialConnectionsManifestRepository = this.repository;
                        String financialConnectionsSessionClientSecret = this.configuration.getFinancialConnectionsSessionClientSecret();
                        String str = this.applicationId;
                        postAuthorizationSession$invoke$1.L$0 = this;
                        postAuthorizationSession$invoke$1.L$1 = financialConnectionsInstitution;
                        postAuthorizationSession$invoke$1.Z$0 = z;
                        postAuthorizationSession$invoke$1.label = 1;
                        obj = financialConnectionsManifestRepository.postAuthorizationSession(financialConnectionsSessionClientSecret, str, financialConnectionsInstitution, postAuthorizationSession$invoke$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        postAuthorizationSession = this;
                    } catch (StripeException e2) {
                        e = e2;
                        postAuthorizationSession = this;
                        throw postAuthorizationSession.toDomainException(e, z, financialConnectionsInstitution);
                    }
                }
                return (FinancialConnectionsAuthorizationSession) obj;
            }
        }
        postAuthorizationSession$invoke$1 = new PostAuthorizationSession$invoke$1(this, continuation);
        Object obj2 = postAuthorizationSession$invoke$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = postAuthorizationSession$invoke$1.label;
        if (i == 0) {
        }
        return (FinancialConnectionsAuthorizationSession) obj2;
    }
}
