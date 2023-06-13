package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;", "", "financialConnectionsRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;)V", "invoke", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "clientSecret", "", NamedConstantsKt.APPLICATION_ID, "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class SynchronizeFinancialConnectionsSession {
    private final FinancialConnectionsManifestRepository financialConnectionsRepository;

    public SynchronizeFinancialConnectionsSession(FinancialConnectionsManifestRepository financialConnectionsRepository) {
        Intrinsics.checkNotNullParameter(financialConnectionsRepository, "financialConnectionsRepository");
        this.financialConnectionsRepository = financialConnectionsRepository;
    }

    public final Object invoke(String str, String str2, Continuation<? super SynchronizeSessionResponse> continuation) {
        return this.financialConnectionsRepository.synchronizeFinancialConnectionsSession(str, str2, continuation);
    }
}
