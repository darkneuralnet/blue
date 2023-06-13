package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.analytics.AuthSessionEvent;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ2\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u0086Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0014J8\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u0082@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "logger", "Lcom/stripe/android/core/Logger;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V", "invoke", "Lkotlin/Result;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "sessionId", "", "event", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", "invoke-0E7RQCE", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "events", "", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postEvent", "postEvent-0E7RQCE", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PostAuthSessionEvent {
    private final FinancialConnectionsSheet.Configuration configuration;
    private final Logger logger;
    private final FinancialConnectionsManifestRepository repository;

    public PostAuthSessionEvent(FinancialConnectionsManifestRepository repository, Logger logger, FinancialConnectionsSheet.Configuration configuration) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.repository = repository;
        this.logger = logger;
        this.configuration = configuration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* renamed from: postEvent-0E7RQCE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116347postEvent0E7RQCE(String str, List<? extends AuthSessionEvent> list, Continuation<? super Result<FinancialConnectionsAuthorizationSession>> continuation) {
        PostAuthSessionEvent$postEvent$1 postAuthSessionEvent$postEvent$1;
        Object coroutine_suspended;
        int i;
        PostAuthSessionEvent postAuthSessionEvent;
        Object m116783constructorimpl;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof PostAuthSessionEvent$postEvent$1) {
            postAuthSessionEvent$postEvent$1 = (PostAuthSessionEvent$postEvent$1) continuation;
            int i2 = postAuthSessionEvent$postEvent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                postAuthSessionEvent$postEvent$1.label = i2 - Integer.MIN_VALUE;
                PostAuthSessionEvent$postEvent$1 postAuthSessionEvent$postEvent$12 = postAuthSessionEvent$postEvent$1;
                Object obj = postAuthSessionEvent$postEvent$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = postAuthSessionEvent$postEvent$12.label;
                if (i == 0) {
                    if (i == 1) {
                        postAuthSessionEvent = (PostAuthSessionEvent) postAuthSessionEvent$postEvent$12.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th) {
                            th = th;
                            Result.Companion companion = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl != null) {
                            }
                            return m116783constructorimpl;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion2 = Result.Companion;
                        FinancialConnectionsManifestRepository financialConnectionsManifestRepository = this.repository;
                        Date date = new Date();
                        String financialConnectionsSessionClientSecret = this.configuration.getFinancialConnectionsSessionClientSecret();
                        postAuthSessionEvent$postEvent$12.L$0 = this;
                        postAuthSessionEvent$postEvent$12.label = 1;
                        obj = financialConnectionsManifestRepository.postAuthorizationSessionEvent(financialConnectionsSessionClientSecret, date, str, list, postAuthSessionEvent$postEvent$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        postAuthSessionEvent = this;
                    } catch (Throwable th2) {
                        th = th2;
                        postAuthSessionEvent = this;
                        Result.Companion companion3 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        return m116783constructorimpl;
                    }
                }
                m116783constructorimpl = Result.m116783constructorimpl((FinancialConnectionsAuthorizationSession) obj);
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                    postAuthSessionEvent.logger.error("error posting auth session event", m116786exceptionOrNullimpl);
                }
                return m116783constructorimpl;
            }
        }
        postAuthSessionEvent$postEvent$1 = new PostAuthSessionEvent$postEvent$1(this, continuation);
        PostAuthSessionEvent$postEvent$1 postAuthSessionEvent$postEvent$122 = postAuthSessionEvent$postEvent$1;
        Object obj2 = postAuthSessionEvent$postEvent$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = postAuthSessionEvent$postEvent$122.label;
        if (i == 0) {
        }
        m116783constructorimpl = Result.m116783constructorimpl((FinancialConnectionsAuthorizationSession) obj2);
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
        }
        return m116783constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: invoke-0E7RQCE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116349invoke0E7RQCE(String str, List<? extends AuthSessionEvent> list, Continuation<? super Result<FinancialConnectionsAuthorizationSession>> continuation) {
        PostAuthSessionEvent$invoke$1 postAuthSessionEvent$invoke$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof PostAuthSessionEvent$invoke$1) {
            postAuthSessionEvent$invoke$1 = (PostAuthSessionEvent$invoke$1) continuation;
            int i2 = postAuthSessionEvent$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                postAuthSessionEvent$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = postAuthSessionEvent$invoke$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = postAuthSessionEvent$invoke$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).m116792unboximpl();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                postAuthSessionEvent$invoke$1.label = 1;
                Object m116347postEvent0E7RQCE = m116347postEvent0E7RQCE(str, list, postAuthSessionEvent$invoke$1);
                return m116347postEvent0E7RQCE == coroutine_suspended ? coroutine_suspended : m116347postEvent0E7RQCE;
            }
        }
        postAuthSessionEvent$invoke$1 = new PostAuthSessionEvent$invoke$1(this, continuation);
        Object obj2 = postAuthSessionEvent$invoke$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = postAuthSessionEvent$invoke$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: invoke-0E7RQCE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116348invoke0E7RQCE(String str, AuthSessionEvent authSessionEvent, Continuation<? super Result<FinancialConnectionsAuthorizationSession>> continuation) {
        PostAuthSessionEvent$invoke$2 postAuthSessionEvent$invoke$2;
        Object coroutine_suspended;
        int i;
        List<? extends AuthSessionEvent> listOf;
        if (continuation instanceof PostAuthSessionEvent$invoke$2) {
            postAuthSessionEvent$invoke$2 = (PostAuthSessionEvent$invoke$2) continuation;
            int i2 = postAuthSessionEvent$invoke$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                postAuthSessionEvent$invoke$2.label = i2 - Integer.MIN_VALUE;
                Object obj = postAuthSessionEvent$invoke$2.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = postAuthSessionEvent$invoke$2.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).m116792unboximpl();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                listOf = CollectionsKt__CollectionsJVMKt.listOf(authSessionEvent);
                postAuthSessionEvent$invoke$2.label = 1;
                Object m116347postEvent0E7RQCE = m116347postEvent0E7RQCE(str, listOf, postAuthSessionEvent$invoke$2);
                return m116347postEvent0E7RQCE == coroutine_suspended ? coroutine_suspended : m116347postEvent0E7RQCE;
            }
        }
        postAuthSessionEvent$invoke$2 = new PostAuthSessionEvent$invoke$2(this, continuation);
        Object obj2 = postAuthSessionEvent$invoke$2.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = postAuthSessionEvent$invoke$2.label;
        if (i == 0) {
        }
    }
}
