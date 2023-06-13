package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeErrorRequestExecutor;", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "httpClient", "Lcom/stripe/android/stripe3ds2/transaction/HttpClient;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/stripe3ds2/transaction/HttpClient;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "executeAsync", "", "errorData", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "Companion", "Factory", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeErrorRequestExecutor implements ErrorRequestExecutor {
    @Deprecated
    private static final String CONTENT_TYPE = "application/json; charset=utf-8";
    private static final Companion Companion = new Companion(null);
    private final ErrorReporter errorReporter;
    private final HttpClient httpClient;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeErrorRequestExecutor$Companion;", "", "()V", "CONTENT_TYPE", "", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeErrorRequestExecutor$Factory;", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "create", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "acsUrl", "", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Factory implements ErrorRequestExecutor.Factory {
        private final CoroutineContext workContext;

        public Factory(CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            this.workContext = workContext;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor.Factory
        public ErrorRequestExecutor create(String acsUrl, ErrorReporter errorReporter) {
            Intrinsics.checkNotNullParameter(acsUrl, "acsUrl");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            return new StripeErrorRequestExecutor(new StripeHttpClient(acsUrl, null, errorReporter, this.workContext, 2, null), errorReporter, T41.m84377b());
        }
    }

    public StripeErrorRequestExecutor(HttpClient httpClient, ErrorReporter errorReporter, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.httpClient = httpClient;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor
    public void executeAsync(ErrorData errorData) {
        Object m116783constructorimpl;
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(errorData.toJson$3ds2sdk_release().toString());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
            this.errorReporter.reportError(new RuntimeException("Could not convert ErrorData to JSON.\n$" + errorData, m116786exceptionOrNullimpl));
        }
        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
            m116783constructorimpl = null;
        }
        String str = (String) m116783constructorimpl;
        if (str != null) {
            Z30.m73800d(C37824aD0.m71790a(this.workContext), null, null, new StripeErrorRequestExecutor$executeAsync$3$1(this, str, null), 3, null);
        }
    }
}
