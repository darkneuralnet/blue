package com.stripe.android.core.networking;

import com.amazonaws.services.p026s3.internal.Constants;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.networking.ConnectionFactory;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B9\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJI\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000e\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u000e0\u0014H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J,\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000e\"\u0004\b\u0000\u0010\u000f2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u000f0$2\b\u0010%\u001a\u0004\u0018\u00010\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, m28432d2 = {"Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "connectionFactory", "Lcom/stripe/android/core/networking/ConnectionFactory;", "retryDelaySupplier", "Lcom/stripe/android/core/networking/RetryDelaySupplier;", "maxRetries", "", "logger", "Lcom/stripe/android/core/Logger;", "(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;)V", "executeInternal", "Lcom/stripe/android/core/networking/StripeResponse;", "BodyType", "remainingRetries", "retryResponseCodes", "", Constants.REQUESTER_PAYS, "Lkotlin/Function0;", "executeInternal$stripe_core_release", "(ILjava/lang/Iterable;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRequest", "", "request", "Lcom/stripe/android/core/networking/StripeRequest;", "(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRequestForFile", "Ljava/io/File;", "outputFile", "(Lcom/stripe/android/core/networking/StripeRequest;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeRequest", "makeRequestForFile", "parseResponse", "connection", "Lcom/stripe/android/core/networking/StripeConnection;", "baseUrl", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class DefaultStripeNetworkClient implements StripeNetworkClient {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final int DEFAULT_MAX_RETRIES = 3;
    private final ConnectionFactory connectionFactory;
    private final Logger logger;
    private final int maxRetries;
    private final RetryDelaySupplier retryDelaySupplier;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$Companion;", "", "()V", "DEFAULT_MAX_RETRIES", "", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @JvmOverloads
    public DefaultStripeNetworkClient() {
        this(null, null, null, 0, null, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StripeResponse<String> makeRequest(StripeRequest stripeRequest) {
        return parseResponse(this.connectionFactory.create(stripeRequest), stripeRequest.getUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StripeResponse<File> makeRequestForFile(StripeRequest stripeRequest, File file) {
        return parseResponse(this.connectionFactory.createForFile(stripeRequest, file), stripeRequest.getUrl());
    }

    private final <BodyType> StripeResponse<BodyType> parseResponse(StripeConnection<BodyType> stripeConnection, String str) {
        Object m116783constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            StripeResponse<BodyType> response = stripeConnection.getResponse();
            this.logger.info(response.toString());
            m116783constructorimpl = Result.m116783constructorimpl(response);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl == null) {
            return (StripeResponse) m116783constructorimpl;
        }
        this.logger.error("Exception while making Stripe API request", m116786exceptionOrNullimpl);
        if (m116786exceptionOrNullimpl instanceof IOException) {
            throw APIConnectionException.Companion.create((IOException) m116786exceptionOrNullimpl, str);
        }
        throw m116786exceptionOrNullimpl;
    }

    public final <BodyType> Object executeInternal$stripe_core_release(int i, Iterable<Integer> iterable, Function0<StripeResponse<BodyType>> function0, Continuation<? super StripeResponse<BodyType>> continuation) {
        return X30.m77504g(this.workContext, new DefaultStripeNetworkClient$executeInternal$2(function0, iterable, i, this, null), continuation);
    }

    @Override // com.stripe.android.core.networking.StripeNetworkClient
    public Object executeRequest(StripeRequest stripeRequest, Continuation<? super StripeResponse<String>> continuation) {
        return executeInternal$stripe_core_release(this.maxRetries, stripeRequest.getRetryResponseCodes(), new DefaultStripeNetworkClient$executeRequest$2(this, stripeRequest), continuation);
    }

    @Override // com.stripe.android.core.networking.StripeNetworkClient
    public Object executeRequestForFile(StripeRequest stripeRequest, File file, Continuation<? super StripeResponse<File>> continuation) {
        return executeInternal$stripe_core_release(this.maxRetries, stripeRequest.getRetryResponseCodes(), new DefaultStripeNetworkClient$executeRequestForFile$2(this, stripeRequest, file), continuation);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DefaultStripeNetworkClient(CoroutineContext workContext) {
        this(workContext, null, null, 0, null, 30, null);
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DefaultStripeNetworkClient(CoroutineContext workContext, ConnectionFactory connectionFactory) {
        this(workContext, connectionFactory, null, 0, null, 28, null);
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DefaultStripeNetworkClient(CoroutineContext workContext, ConnectionFactory connectionFactory, RetryDelaySupplier retryDelaySupplier) {
        this(workContext, connectionFactory, retryDelaySupplier, 0, null, 24, null);
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        Intrinsics.checkNotNullParameter(retryDelaySupplier, "retryDelaySupplier");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DefaultStripeNetworkClient(CoroutineContext workContext, ConnectionFactory connectionFactory, RetryDelaySupplier retryDelaySupplier, int i) {
        this(workContext, connectionFactory, retryDelaySupplier, i, null, 16, null);
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        Intrinsics.checkNotNullParameter(retryDelaySupplier, "retryDelaySupplier");
    }

    @JvmOverloads
    public DefaultStripeNetworkClient(CoroutineContext workContext, ConnectionFactory connectionFactory, RetryDelaySupplier retryDelaySupplier, int i, Logger logger) {
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        Intrinsics.checkNotNullParameter(retryDelaySupplier, "retryDelaySupplier");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.workContext = workContext;
        this.connectionFactory = connectionFactory;
        this.retryDelaySupplier = retryDelaySupplier;
        this.maxRetries = i;
        this.logger = logger;
    }

    public /* synthetic */ DefaultStripeNetworkClient(CoroutineContext coroutineContext, ConnectionFactory connectionFactory, RetryDelaySupplier retryDelaySupplier, int i, Logger logger, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? T41.m84377b() : coroutineContext, (i2 & 2) != 0 ? ConnectionFactory.Default.INSTANCE : connectionFactory, (i2 & 4) != 0 ? new RetryDelaySupplier() : retryDelaySupplier, (i2 & 8) != 0 ? 3 : i, (i2 & 16) != 0 ? Logger.Companion.noop() : logger);
    }
}
