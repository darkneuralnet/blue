package zendesk.core;

import androidx.recyclerview.widget.C11925l;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class CachingInterceptor implements Interceptor {
    private static final String LOG_TAG = "CachingInterceptor";
    private final BaseStorage cache;
    private final Map<String, Lock> locks = new HashMap();

    public CachingInterceptor(BaseStorage baseStorage) {
        this.cache = baseStorage;
    }

    private Response createResponse(int i, Request request, ResponseBody responseBody) {
        Response.Builder builder = new Response.Builder();
        if (responseBody != null) {
            builder.body(responseBody);
        } else {
            C33694Ix2.m101447l(LOG_TAG, "Response body is null", new Object[0]);
        }
        return builder.code(i).message(request.method()).request(request).protocol(Protocol.HTTP_1_1).build();
    }

    private Response loadData(String str, Interceptor.Chain chain) throws IOException {
        int i;
        ResponseBody body;
        ResponseBody responseBody = (ResponseBody) this.cache.get(str, ResponseBody.class);
        if (responseBody == null) {
            C33694Ix2.m101457b(LOG_TAG, "Response not cached, loading it from the network. | %s", str);
            Response proceed = chain.proceed(chain.request());
            if (proceed.isSuccessful()) {
                MediaType contentType = proceed.body().contentType();
                byte[] bytes = proceed.body().bytes();
                this.cache.put(str, ResponseBody.create(contentType, bytes));
                body = ResponseBody.create(contentType, bytes);
            } else {
                C33694Ix2.m101457b(LOG_TAG, "Unable to load data from network. | %s", str);
                body = proceed.body();
            }
            responseBody = body;
            i = proceed.code();
        } else {
            i = C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION;
        }
        return createResponse(i, chain.request(), responseBody);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Lock reentrantLock;
        String httpUrl = chain.request().url().toString();
        synchronized (this.locks) {
            if (this.locks.containsKey(httpUrl)) {
                reentrantLock = this.locks.get(httpUrl);
            } else {
                reentrantLock = new ReentrantLock();
                this.locks.put(httpUrl, reentrantLock);
            }
        }
        try {
            reentrantLock.lock();
            return loadData(httpUrl, chain);
        } finally {
            reentrantLock.unlock();
        }
    }
}
