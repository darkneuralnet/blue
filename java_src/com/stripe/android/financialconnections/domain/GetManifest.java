package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\r\u001a\u00020\u000eH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/GetManifest;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", NamedConstantsKt.APPLICATION_ID, "", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Ljava/lang/String;)V", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "getRepository", "()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "invoke", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class GetManifest {
    private final String applicationId;
    private final FinancialConnectionsSheet.Configuration configuration;
    private final FinancialConnectionsManifestRepository repository;

    public GetManifest(FinancialConnectionsManifestRepository repository, FinancialConnectionsSheet.Configuration configuration, String applicationId) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.repository = repository;
        this.configuration = configuration;
        this.applicationId = applicationId;
    }

    public final FinancialConnectionsSheet.Configuration getConfiguration() {
        return this.configuration;
    }

    public final FinancialConnectionsManifestRepository getRepository() {
        return this.repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Continuation<? super FinancialConnectionsSessionManifest> continuation) {
        GetManifest$invoke$1 getManifest$invoke$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof GetManifest$invoke$1) {
            getManifest$invoke$1 = (GetManifest$invoke$1) continuation;
            int i2 = getManifest$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getManifest$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getManifest$invoke$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getManifest$invoke$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    FinancialConnectionsManifestRepository financialConnectionsManifestRepository = this.repository;
                    String financialConnectionsSessionClientSecret = this.configuration.getFinancialConnectionsSessionClientSecret();
                    String str = this.applicationId;
                    getManifest$invoke$1.label = 1;
                    obj = financialConnectionsManifestRepository.getOrFetchSynchronizeFinancialConnectionsSession(financialConnectionsSessionClientSecret, str, getManifest$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return ((SynchronizeSessionResponse) obj).getManifest();
            }
        }
        getManifest$invoke$1 = new GetManifest$invoke$1(this, continuation);
        Object obj2 = getManifest$invoke$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getManifest$invoke$1.label;
        if (i == 0) {
        }
        return ((SynchronizeSessionResponse) obj2).getManifest();
    }
}
