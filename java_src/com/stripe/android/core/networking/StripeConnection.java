package com.stripe.android.core.networking;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p053io.ByteStreamsKt;
import kotlin.p053io.CloseableKt;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u000f\u0010\u0011J\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rH&¢\u0006\u0002\u0010\u000eR\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/core/networking/StripeConnection;", "ResponseBodyType", "Ljava/io/Closeable;", "response", "Lcom/stripe/android/core/networking/StripeResponse;", "getResponse", "()Lcom/stripe/android/core/networking/StripeResponse;", "responseCode", "", "getResponseCode", "()I", "createBodyFromResponseStream", "responseStream", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)Ljava/lang/Object;", "AbstractConnection", "Default", "FileConnection", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public interface StripeConnection<ResponseBodyType> extends Closeable {

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u0014*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0014B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;", "ResponseBodyType", "Lcom/stripe/android/core/networking/StripeConnection;", "conn", "Ljava/net/HttpURLConnection;", "(Ljava/net/HttpURLConnection;)V", "response", "Lcom/stripe/android/core/networking/StripeResponse;", "getResponse", "()Lcom/stripe/android/core/networking/StripeResponse;", "responseCode", "", "getResponseCode", "()I", "responseStream", "Ljava/io/InputStream;", "getResponseStream", "()Ljava/io/InputStream;", "close", "", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class AbstractConnection<ResponseBodyType> implements StripeConnection<ResponseBodyType> {
        private final HttpURLConnection conn;
        public static final Companion Companion = new Companion(null);
        private static final String CHARSET = StandardCharsets.UTF_8.name();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection$Companion;", "", "()V", "CHARSET", "", "kotlin.jvm.PlatformType", "getCHARSET$stripe_core_release", "()Ljava/lang/String;", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String getCHARSET$stripe_core_release() {
                return AbstractConnection.CHARSET;
            }

            private Companion() {
            }
        }

        public AbstractConnection(HttpURLConnection conn) {
            Intrinsics.checkNotNullParameter(conn, "conn");
            this.conn = conn;
        }

        private final InputStream getResponseStream() throws IOException {
            int responseCode = getResponseCode();
            boolean z = false;
            if (200 <= responseCode && responseCode < 300) {
                z = true;
            }
            if (z) {
                return this.conn.getInputStream();
            }
            return this.conn.getErrorStream();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            InputStream responseStream = getResponseStream();
            if (responseStream != null) {
                responseStream.close();
            }
            this.conn.disconnect();
        }

        @Override // com.stripe.android.core.networking.StripeConnection
        public /* synthetic */ StripeResponse getResponse() throws IOException {
            int responseCode = getResponseCode();
            ResponseBodyType createBodyFromResponseStream = createBodyFromResponseStream(getResponseStream());
            Map<String, List<String>> headerFields = this.conn.getHeaderFields();
            Intrinsics.checkNotNullExpressionValue(headerFields, "conn.headerFields");
            return new StripeResponse(responseCode, createBodyFromResponseStream, headerFields);
        }

        @Override // com.stripe.android.core.networking.StripeConnection
        public /* synthetic */ int getResponseCode() {
            return this.conn.getResponseCode();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/core/networking/StripeConnection$Default;", "Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;", "", "conn", "Ljava/net/HttpURLConnection;", "(Ljava/net/HttpURLConnection;)V", "createBodyFromResponseStream", "responseStream", "Ljava/io/InputStream;", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Default extends AbstractConnection<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Default(HttpURLConnection conn) {
            super(conn);
            Intrinsics.checkNotNullParameter(conn, "conn");
        }

        @Override // com.stripe.android.core.networking.StripeConnection
        public String createBodyFromResponseStream(InputStream inputStream) throws IOException {
            if (inputStream == null) {
                return null;
            }
            try {
                Scanner useDelimiter = new Scanner(inputStream, AbstractConnection.Companion.getCHARSET$stripe_core_release()).useDelimiter("\\A");
                String next = useDelimiter.hasNext() ? useDelimiter.next() : null;
                CloseableKt.closeFinally(inputStream, null);
                return next;
            } finally {
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/core/networking/StripeConnection$FileConnection;", "Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;", "Ljava/io/File;", "conn", "Ljava/net/HttpURLConnection;", "outputFile", "(Ljava/net/HttpURLConnection;Ljava/io/File;)V", "createBodyFromResponseStream", "responseStream", "Ljava/io/InputStream;", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nStripeConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeConnection.kt\ncom/stripe/android/core/networking/StripeConnection$FileConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class FileConnection extends AbstractConnection<File> {
        private final File outputFile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileConnection(HttpURLConnection conn, File outputFile) {
            super(conn);
            Intrinsics.checkNotNullParameter(conn, "conn");
            Intrinsics.checkNotNullParameter(outputFile, "outputFile");
            this.outputFile = outputFile;
        }

        @Override // com.stripe.android.core.networking.StripeConnection
        public File createBodyFromResponseStream(InputStream inputStream) throws IOException {
            if (inputStream == null) {
                return null;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.outputFile);
                ByteStreamsKt.copyTo$default(inputStream, fileOutputStream, 0, 2, null);
                CloseableKt.closeFinally(fileOutputStream, null);
                CloseableKt.closeFinally(inputStream, null);
                return this.outputFile;
            } finally {
            }
        }
    }

    ResponseBodyType createBodyFromResponseStream(InputStream inputStream);

    StripeResponse<ResponseBodyType> getResponse();

    int getResponseCode();
}
