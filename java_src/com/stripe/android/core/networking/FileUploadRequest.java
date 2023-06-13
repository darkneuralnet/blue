package com.stripe.android.core.networking;

import com.stripe.android.core.AppInfo;
import com.stripe.android.core.model.StripeFileParams;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.core.networking.StripeRequest;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.p053io.ByteStreamsKt;
import kotlin.p053io.CloseableKt;
import kotlin.random.Random;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 32\u00020\u0001:\u00013B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0004J\u0010\u0010.\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J\u0018\u0010/\u001a\u00020+2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\tH\u0004R\u0014\u0010\b\u001a\u00020\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR(\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010\fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\f¨\u00064"}, m28432d2 = {"Lcom/stripe/android/core/networking/FileUploadRequest;", "Lcom/stripe/android/core/networking/StripeRequest;", "fileParams", "Lcom/stripe/android/core/model/StripeFileParams;", "options", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "appInfo", "Lcom/stripe/android/core/AppInfo;", "boundary", "", "(Lcom/stripe/android/core/model/StripeFileParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/lang/String;)V", "getBoundary", "()Ljava/lang/String;", "fileMetadata", "getFileMetadata", "headers", "", "getHeaders", "()Ljava/util/Map;", "headersFactory", "Lcom/stripe/android/core/networking/RequestHeadersFactory;", "method", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "getMethod", "()Lcom/stripe/android/core/networking/StripeRequest$Method;", "mimeType", "Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getMimeType", "()Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "postHeaders", "getPostHeaders", "setPostHeaders", "(Ljava/util/Map;)V", "purposeContents", "getPurposeContents", "retryResponseCodes", "", "", "getRetryResponseCodes", "()Ljava/lang/Iterable;", "url", "getUrl", "writeFile", "", "outputStream", "Ljava/io/OutputStream;", "writePostBody", "writeString", "writer", "Ljava/io/PrintWriter;", "contents", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public class FileUploadRequest extends StripeRequest {
    protected static final Companion Companion = new Companion(null);
    private static final String HOST = "https://files.stripe.com/v1/files";
    public static final String LINE_BREAK = "\r\n";
    private final String boundary;
    private final StripeFileParams fileParams;
    private final Map<String, String> headers;
    private final RequestHeadersFactory headersFactory;
    private final StripeRequest.Method method;
    private final StripeRequest.MimeType mimeType;
    private Map<String, String> postHeaders;
    private final Iterable<Integer> retryResponseCodes;
    private final String url;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0085\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/core/networking/FileUploadRequest$Companion;", "", "()V", "HOST", "", "LINE_BREAK", "createBoundary", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String createBoundary() {
            return String.valueOf(Random.Default.nextLong(0L, LongCompanionObject.MAX_VALUE));
        }

        private Companion() {
        }
    }

    public /* synthetic */ FileUploadRequest(StripeFileParams stripeFileParams, ApiRequest.Options options, AppInfo appInfo, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeFileParams, options, (i & 4) != 0 ? null : appInfo, (i & 8) != 0 ? Companion.createBoundary() : str);
    }

    public final String getBoundary() {
        return this.boundary;
    }

    public final String getFileMetadata() {
        String trimIndent;
        String name = this.fileParams.getFile$stripe_core_release().getName();
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(name);
        String str = this.boundary;
        trimIndent = StringsKt__IndentKt.trimIndent("\n                --" + str + "\n                Content-Disposition: form-data; name=\"file\"; filename=\"" + name + "\"\n                Content-Type: " + guessContentTypeFromName + "\n                Content-Transfer-Encoding: binary\n\n\n            ");
        return trimIndent;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public StripeRequest.Method getMethod() {
        return this.method;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public StripeRequest.MimeType getMimeType() {
        return this.mimeType;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getPostHeaders() {
        return this.postHeaders;
    }

    public final String getPurposeContents() {
        String trimIndent;
        String str = this.boundary;
        String code = this.fileParams.getPurpose$stripe_core_release().getCode();
        trimIndent = StringsKt__IndentKt.trimIndent("\n                --" + str + "\n                Content-Disposition: form-data; name=\"purpose\"\n\n                " + code + "\n\n            ");
        return trimIndent;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Iterable<Integer> getRetryResponseCodes() {
        return this.retryResponseCodes;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public String getUrl() {
        return this.url;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public void setPostHeaders(Map<String, String> map) {
        this.postHeaders = map;
    }

    public final void writeFile(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        ByteStreamsKt.copyTo$default(new FileInputStream(this.fileParams.getFile$stripe_core_release()), outputStream, 0, 2, null);
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public void writePostBody(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charsets.UTF_8);
        try {
            PrintWriter printWriter = new PrintWriter((Writer) outputStreamWriter, true);
            writeString(printWriter, getPurposeContents());
            writeString(printWriter, getFileMetadata());
            writeFile(outputStream);
            printWriter.write(LINE_BREAK);
            String str = this.boundary;
            printWriter.write("--" + str + "--");
            printWriter.flush();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(printWriter, null);
            CloseableKt.closeFinally(outputStreamWriter, null);
        } finally {
        }
    }

    public final void writeString(PrintWriter writer, String contents) {
        String replace$default;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(contents, "contents");
        replace$default = StringsKt__StringsJVMKt.replace$default(contents, "\n", LINE_BREAK, false, 4, (Object) null);
        writer.write(replace$default);
        writer.flush();
    }

    public FileUploadRequest(StripeFileParams fileParams, ApiRequest.Options options, AppInfo appInfo, String boundary) {
        Intrinsics.checkNotNullParameter(fileParams, "fileParams");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        this.fileParams = fileParams;
        this.boundary = boundary;
        RequestHeadersFactory.FileUpload fileUpload = new RequestHeadersFactory.FileUpload(options, appInfo, null, null, null, boundary, 28, null);
        this.headersFactory = fileUpload;
        this.method = StripeRequest.Method.POST;
        this.mimeType = StripeRequest.MimeType.MultipartForm;
        this.url = HOST;
        this.retryResponseCodes = NetworkConstantsKt.getDEFAULT_RETRY_CODES();
        this.headers = fileUpload.create();
        this.postHeaders = fileUpload.createPostHeader();
    }
}
