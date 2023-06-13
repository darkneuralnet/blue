package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* loaded from: classes6.dex */
public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    /* renamed from: a */
    public static void m47059a(Response response, M73 m73, long j, long j2) throws IOException {
        Request request = response.request();
        if (request == null) {
            return;
        }
        m73.m95772u(request.url().url().toString());
        m73.m95782k(request.method());
        if (request.body() != null) {
            long contentLength = request.body().contentLength();
            if (contentLength != -1) {
                m73.m95779n(contentLength);
            }
        }
        ResponseBody body = response.body();
        if (body != null) {
            long contentLength2 = body.contentLength();
            if (contentLength2 != -1) {
                m73.m95776q(contentLength2);
            }
            MediaType contentType = body.contentType();
            if (contentType != null) {
                m73.m95777p(contentType.toString());
            }
        }
        m73.m95781l(response.code());
        m73.m95778o(j);
        m73.m95774s(j2);
        m73.m95790b();
    }

    @Keep
    public static void enqueue(Call call, Callback callback) {
        Timer timer = new Timer();
        call.enqueue(new C48439s52(callback, C41612ga6.m39128k(), timer, timer.m47034e()));
    }

    @Keep
    public static Response execute(Call call) throws IOException {
        M73 m95789c = M73.m95789c(C41612ga6.m39128k());
        Timer timer = new Timer();
        long m47034e = timer.m47034e();
        try {
            Response execute = call.execute();
            m47059a(execute, m95789c, m47034e, timer.m47036c());
            return execute;
        } catch (IOException e) {
            Request request = call.request();
            if (request != null) {
                HttpUrl url = request.url();
                if (url != null) {
                    m95789c.m95772u(url.url().toString());
                }
                if (request.method() != null) {
                    m95789c.m95782k(request.method());
                }
            }
            m95789c.m95778o(m47034e);
            m95789c.m95774s(timer.m47036c());
            N73.m94350d(m95789c);
            throw e;
        }
    }
}
