package com.stripe.android.core.networking;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.networking.StripeConnection;
import com.stripe.android.core.networking.StripeRequest;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p053io.CloseableKt;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bJ\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/core/networking/ConnectionFactory;", "", "create", "Lcom/stripe/android/core/networking/StripeConnection;", "", "request", "Lcom/stripe/android/core/networking/StripeRequest;", "createForFile", "Ljava/io/File;", "outputFile", "Companion", "Default", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public interface ConnectionFactory {
    public static final /* synthetic */ Companion Companion = Companion.$$INSTANCE;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/core/networking/ConnectionFactory$Companion;", "", "()V", "CONNECT_TIMEOUT", "", "READ_TIMEOUT", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int CONNECT_TIMEOUT;
        private static final int READ_TIMEOUT;

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            CONNECT_TIMEOUT = (int) timeUnit.toMillis(30L);
            READ_TIMEOUT = (int) timeUnit.toMillis(80L);
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/core/networking/ConnectionFactory$Default;", "Lcom/stripe/android/core/networking/ConnectionFactory;", "()V", "testConnectionCustomization", "Lkotlin/Function1;", "Ljava/net/HttpURLConnection;", "", "getTestConnectionCustomization", "()Lkotlin/jvm/functions/Function1;", "setTestConnectionCustomization", "(Lkotlin/jvm/functions/Function1;)V", "create", "Lcom/stripe/android/core/networking/StripeConnection;", "", "request", "Lcom/stripe/android/core/networking/StripeRequest;", "createForFile", "Ljava/io/File;", "outputFile", "openConnectionAndApplyFields", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nConnectionFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionFactory.kt\ncom/stripe/android/core/networking/ConnectionFactory$Default\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n215#2,2:80\n215#2,2:82\n1#3:84\n*S KotlinDebug\n*F\n+ 1 ConnectionFactory.kt\ncom/stripe/android/core/networking/ConnectionFactory$Default\n*L\n59#1:80,2\n65#1:82,2\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class Default implements ConnectionFactory {
        public static final Default INSTANCE = new Default();
        private static volatile Function1<? super HttpURLConnection, Unit> testConnectionCustomization;

        private Default() {
        }

        private final HttpURLConnection openConnectionAndApplyFields(StripeRequest stripeRequest) {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(stripeRequest.getUrl()).openConnection());
            Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            Function1<? super HttpURLConnection, Unit> function1 = testConnectionCustomization;
            if (function1 != null) {
                function1.invoke(httpURLConnection);
            }
            httpURLConnection.setConnectTimeout(Companion.CONNECT_TIMEOUT);
            httpURLConnection.setReadTimeout(Companion.READ_TIMEOUT);
            httpURLConnection.setUseCaches(stripeRequest.getShouldCache());
            httpURLConnection.setRequestMethod(stripeRequest.getMethod().getCode());
            for (Map.Entry<String, String> entry : stripeRequest.getHeaders().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            if (StripeRequest.Method.POST == stripeRequest.getMethod()) {
                httpURLConnection.setDoOutput(true);
                Map<String, String> postHeaders = stripeRequest.getPostHeaders();
                if (postHeaders != null) {
                    for (Map.Entry<String, String> entry2 : postHeaders.entrySet()) {
                        httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                }
                OutputStream output = httpURLConnection.getOutputStream();
                try {
                    Intrinsics.checkNotNullExpressionValue(output, "output");
                    stripeRequest.writePostBody(output);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(output, null);
                } finally {
                }
            }
            return httpURLConnection;
        }

        @Override // com.stripe.android.core.networking.ConnectionFactory
        public /* synthetic */ StripeConnection create(StripeRequest request) throws IOException, InvalidRequestException {
            Intrinsics.checkNotNullParameter(request, "request");
            return new StripeConnection.Default(openConnectionAndApplyFields(request));
        }

        @Override // com.stripe.android.core.networking.ConnectionFactory
        public StripeConnection<File> createForFile(StripeRequest request, File outputFile) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(outputFile, "outputFile");
            return new StripeConnection.FileConnection(openConnectionAndApplyFields(request), outputFile);
        }

        public final Function1<HttpURLConnection, Unit> getTestConnectionCustomization() {
            return testConnectionCustomization;
        }

        public final void setTestConnectionCustomization(Function1<? super HttpURLConnection, Unit> function1) {
            testConnectionCustomization = function1;
        }
    }

    StripeConnection<String> create(StripeRequest stripeRequest) throws IOException, InvalidRequestException;

    StripeConnection<File> createForFile(StripeRequest stripeRequest, File file) throws IOException, InvalidRequestException;
}
