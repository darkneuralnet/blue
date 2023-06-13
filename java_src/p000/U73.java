package p000;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.ClientError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;
import p000.Y70;
/* renamed from: U73 */
/* loaded from: classes.dex */
public final class U73 {

    /* renamed from: U73$b */
    /* loaded from: classes.dex */
    public static class C8200b {

        /* renamed from: a */
        public final String f36878a;

        /* renamed from: b */
        public final VolleyError f36879b;

        public C8200b(String str, VolleyError volleyError) {
            this.f36878a = str;
            this.f36879b = volleyError;
        }
    }

    private U73() {
    }

    /* renamed from: a */
    public static void m81942a(AbstractC45006mI4<?> abstractC45006mI4, C8200b c8200b) throws VolleyError {
        QN4 retryPolicy = abstractC45006mI4.getRetryPolicy();
        int timeoutMs = abstractC45006mI4.getTimeoutMs();
        try {
            retryPolicy.mo10095b(c8200b.f36879b);
            abstractC45006mI4.addMarker(String.format("%s-retry [timeout=%s]", c8200b.f36878a, Integer.valueOf(timeoutMs)));
        } catch (VolleyError e) {
            abstractC45006mI4.addMarker(String.format("%s-timeout-giveup [timeout=%s]", c8200b.f36878a, Integer.valueOf(timeoutMs)));
            throw e;
        }
    }

    /* renamed from: b */
    public static O73 m81941b(AbstractC45006mI4<?> abstractC45006mI4, long j, List<AH1> list) {
        Y70.C9639a cacheEntry = abstractC45006mI4.getCacheEntry();
        if (cacheEntry == null) {
            return new O73(304, (byte[]) null, true, j, list);
        }
        return new O73(304, cacheEntry.f44574a, true, j, EN1.m109105a(list, cacheEntry));
    }

    /* renamed from: c */
    public static byte[] m81940c(InputStream inputStream, int i, C47272q70 c47272q70) throws IOException {
        byte[] bArr;
        C39202cY3 c39202cY3 = new C39202cY3(c47272q70, i);
        try {
            bArr = c47272q70.m18157a(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    c39202cY3.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            C34841Nu6.m93202e("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    c47272q70.m18156b(bArr);
                    c39202cY3.close();
                    throw th;
                }
            }
            byte[] byteArray = c39202cY3.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                C34841Nu6.m93202e("Error occurred when closing InputStream", new Object[0]);
            }
            c47272q70.m18156b(bArr);
            c39202cY3.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }

    /* renamed from: d */
    public static void m81939d(long j, AbstractC45006mI4<?> abstractC45006mI4, byte[] bArr, int i) {
        Object obj;
        if (C34841Nu6.f25359b || j > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = abstractC45006mI4;
            objArr[1] = Long.valueOf(j);
            if (bArr != null) {
                obj = Integer.valueOf(bArr.length);
            } else {
                obj = "null";
            }
            objArr[2] = obj;
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Integer.valueOf(abstractC45006mI4.getRetryPolicy().mo10096a());
            C34841Nu6.m93205b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* renamed from: e */
    public static C8200b m81938e(AbstractC45006mI4<?> abstractC45006mI4, IOException iOException, long j, GN1 gn1, byte[] bArr) throws VolleyError {
        if (iOException instanceof SocketTimeoutException) {
            return new C8200b("socket", new TimeoutError());
        }
        if (!(iOException instanceof MalformedURLException)) {
            if (gn1 != null) {
                int m105187d = gn1.m105187d();
                C34841Nu6.m93204c("Unexpected response code %d for %s", Integer.valueOf(m105187d), abstractC45006mI4.getUrl());
                if (bArr != null) {
                    O73 o73 = new O73(m105187d, bArr, false, SystemClock.elapsedRealtime() - j, gn1.m105188c());
                    if (m105187d != 401 && m105187d != 403) {
                        if (m105187d >= 400 && m105187d <= 499) {
                            throw new ClientError(o73);
                        }
                        if (m105187d >= 500 && m105187d <= 599 && abstractC45006mI4.shouldRetryServerErrors()) {
                            return new C8200b("server", new ServerError(o73));
                        }
                        throw new ServerError(o73);
                    }
                    return new C8200b("auth", new AuthFailureError(o73));
                }
                return new C8200b("network", new NetworkError());
            } else if (abstractC45006mI4.shouldRetryConnectionErrors()) {
                return new C8200b("connection", new NoConnectionError());
            } else {
                throw new NoConnectionError(iOException);
            }
        }
        throw new RuntimeException("Bad URL " + abstractC45006mI4.getUrl(), iOException);
    }
}
