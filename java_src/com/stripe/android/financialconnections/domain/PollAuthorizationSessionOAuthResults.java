package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.MixedOAuthParams;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V", "invoke", "Lcom/stripe/android/financialconnections/model/MixedOAuthParams;", "session", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PollAuthorizationSessionOAuthResults {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final int MAX_TRIES = 300;
    @Deprecated
    private static final long POLLING_TIME_MS = 2000;
    private final FinancialConnectionsSheet.Configuration configuration;
    private final FinancialConnectionsRepository repository;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults$Companion;", "", "()V", "MAX_TRIES", "", "POLLING_TIME_MS", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PollAuthorizationSessionOAuthResults(FinancialConnectionsRepository repository, FinancialConnectionsSheet.Configuration configuration) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.repository = repository;
        this.configuration = configuration;
    }

    public final Object invoke(FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, Continuation<? super MixedOAuthParams> continuation) {
        Object retryOnException;
        retryOnException = ErrorsKt.retryOnException((r17 & 1) != 0 ? Integer.MAX_VALUE : MAX_TRIES, (r17 & 2) != 0 ? 0L : 0L, (r17 & 4) != 0 ? 100L : POLLING_TIME_MS, new PollAuthorizationSessionOAuthResults$invoke$2(null), new PollAuthorizationSessionOAuthResults$invoke$3(this, financialConnectionsAuthorizationSession, null), continuation);
        return retryOnException;
    }
}
