package okhttp3.internal.http;

import com.amazonaws.http.HttpHeader;
import com.amazonaws.services.p026s3.Headers;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "okhttp"}, m28431k = 1, m28430mv = {1, 6, 0}, m28428xi = 48)
/* loaded from: classes8.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int i) {
        if (i == 100) {
            return true;
        }
        return 102 <= i && i < 200;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0151, code lost:
        if (r0 != false) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[Catch: IOException -> 0x01a0, TryCatch #3 {IOException -> 0x01a0, blocks: (B:39:0x00a9, B:41:0x00b2, B:42:0x00b6, B:44:0x00e0, B:46:0x00e9, B:47:0x00ec, B:48:0x0110, B:52:0x011b, B:54:0x013a, B:56:0x0148, B:63:0x015e, B:69:0x0171, B:73:0x0194, B:74:0x019e, B:72:0x018c, B:66:0x0167, B:58:0x0153, B:53:0x012a), top: B:88:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0148 A[Catch: IOException -> 0x01a0, TryCatch #3 {IOException -> 0x01a0, blocks: (B:39:0x00a9, B:41:0x00b2, B:42:0x00b6, B:44:0x00e0, B:46:0x00e9, B:47:0x00ec, B:48:0x0110, B:52:0x011b, B:54:0x013a, B:56:0x0148, B:63:0x015e, B:69:0x0171, B:73:0x0194, B:74:0x019e, B:72:0x018c, B:66:0x0167, B:58:0x0153, B:53:0x012a), top: B:88:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167 A[Catch: IOException -> 0x01a0, TryCatch #3 {IOException -> 0x01a0, blocks: (B:39:0x00a9, B:41:0x00b2, B:42:0x00b6, B:44:0x00e0, B:46:0x00e9, B:47:0x00ec, B:48:0x0110, B:52:0x011b, B:54:0x013a, B:56:0x0148, B:63:0x015e, B:69:0x0171, B:73:0x0194, B:74:0x019e, B:72:0x018c, B:66:0x0167, B:58:0x0153, B:53:0x012a), top: B:88:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0171 A[Catch: IOException -> 0x01a0, TryCatch #3 {IOException -> 0x01a0, blocks: (B:39:0x00a9, B:41:0x00b2, B:42:0x00b6, B:44:0x00e0, B:46:0x00e9, B:47:0x00ec, B:48:0x0110, B:52:0x011b, B:54:0x013a, B:56:0x0148, B:63:0x015e, B:69:0x0171, B:73:0x0194, B:74:0x019e, B:72:0x018c, B:66:0x0167, B:58:0x0153, B:53:0x012a), top: B:88:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(Interceptor.Chain chain) throws IOException {
        boolean z;
        Response.Builder builder;
        Response.Builder builder2;
        Response build;
        int code;
        Response build2;
        boolean equals;
        ResponseBody body;
        long contentLength;
        boolean equals2;
        boolean equals3;
        Object obj;
        Intrinsics.checkNotNullParameter(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange$okhttp = realInterceptorChain.getExchange$okhttp();
        Intrinsics.checkNotNull(exchange$okhttp);
        Request request$okhttp = realInterceptorChain.getRequest$okhttp();
        RequestBody body2 = request$okhttp.body();
        long currentTimeMillis = System.currentTimeMillis();
        Long l = null;
        try {
            exchange$okhttp.writeRequestHeaders(request$okhttp);
            builder = HttpMethod.permitsRequestBody(request$okhttp.method());
            try {
                if (builder != 0 && body2 != null) {
                    equals3 = StringsKt__StringsJVMKt.equals("100-continue", request$okhttp.header(HttpHeader.EXPECT), true);
                    if (equals3) {
                        exchange$okhttp.flushRequest();
                        builder = exchange$okhttp.readResponseHeaders(true);
                        try {
                            exchange$okhttp.responseHeadersStart();
                            z = false;
                            obj = builder;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (!(e instanceof ConnectionShutdownException)) {
                                builder2 = builder;
                                if (!exchange$okhttp.getHasFailure$okhttp()) {
                                    throw e;
                                }
                                if (builder2 == null) {
                                }
                                build = builder2.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                                code = build.code();
                                if (shouldIgnoreAndWaitForRealResponse(code)) {
                                }
                                exchange$okhttp.responseHeadersEnd(build);
                                if (!this.forWebSocket) {
                                }
                                build2 = build.newBuilder().body(exchange$okhttp.openResponseBody(build)).build();
                                equals = StringsKt__StringsJVMKt.equals("close", build2.request().header(Headers.CONNECTION), true);
                                if (!equals) {
                                }
                                exchange$okhttp.noNewExchangesOnConnection();
                                if (code != 204) {
                                }
                                body = build2.body();
                                if (body != null) {
                                }
                                if (contentLength > 0) {
                                }
                                return build2;
                            }
                            throw e;
                        }
                    } else {
                        z = true;
                        obj = null;
                    }
                    if (obj == null) {
                        if (body2.isDuplex()) {
                            exchange$okhttp.flushRequest();
                            body2.writeTo(C34928Oe3.m91760c(exchange$okhttp.createRequestBody(request$okhttp, true)));
                            builder = obj;
                        } else {
                            InterfaceC45453n30 m91760c = C34928Oe3.m91760c(exchange$okhttp.createRequestBody(request$okhttp, false));
                            body2.writeTo(m91760c);
                            m91760c.close();
                            builder = obj;
                        }
                    } else {
                        exchange$okhttp.noRequestBody();
                        builder = obj;
                        if (!exchange$okhttp.getConnection$okhttp().isMultiplexed$okhttp()) {
                            exchange$okhttp.noNewExchangesOnConnection();
                            builder = obj;
                        }
                    }
                } else {
                    exchange$okhttp.noRequestBody();
                    z = true;
                    builder = 0;
                }
                if (body2 == null || !body2.isDuplex()) {
                    exchange$okhttp.finishRequest();
                }
                e = null;
                builder2 = builder;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            z = true;
            builder = null;
        }
        if (builder2 == null) {
            try {
                builder2 = exchange$okhttp.readResponseHeaders(false);
                Intrinsics.checkNotNull(builder2);
                if (z) {
                    exchange$okhttp.responseHeadersStart();
                    z = false;
                }
            } catch (IOException e4) {
                if (e != null) {
                    ExceptionsKt__ExceptionsKt.addSuppressed(e, e4);
                    throw e;
                }
                throw e4;
            }
        }
        build = builder2.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        code = build.code();
        if (shouldIgnoreAndWaitForRealResponse(code)) {
            Response.Builder readResponseHeaders = exchange$okhttp.readResponseHeaders(false);
            Intrinsics.checkNotNull(readResponseHeaders);
            if (z) {
                exchange$okhttp.responseHeadersStart();
            }
            build = readResponseHeaders.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = build.code();
        }
        exchange$okhttp.responseHeadersEnd(build);
        if (!this.forWebSocket && code == 101) {
            build2 = build.newBuilder().body(Util.EMPTY_RESPONSE).build();
        } else {
            build2 = build.newBuilder().body(exchange$okhttp.openResponseBody(build)).build();
        }
        equals = StringsKt__StringsJVMKt.equals("close", build2.request().header(Headers.CONNECTION), true);
        if (!equals) {
            equals2 = StringsKt__StringsJVMKt.equals("close", Response.header$default(build2, Headers.CONNECTION, null, 2, null), true);
        }
        exchange$okhttp.noNewExchangesOnConnection();
        if (code != 204 || code == 205) {
            body = build2.body();
            if (body != null) {
                contentLength = -1;
            } else {
                contentLength = body.contentLength();
            }
            if (contentLength > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(code);
                sb.append(" had non-zero Content-Length: ");
                ResponseBody body3 = build2.body();
                if (body3 != null) {
                    l = Long.valueOf(body3.contentLength());
                }
                sb.append(l);
                throw new ProtocolException(sb.toString());
            }
        }
        return build2;
    }
}
