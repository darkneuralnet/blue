package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTimeConstants;
/* renamed from: BD8 */
/* loaded from: classes6.dex */
public final class BD8 implements Runnable {

    /* renamed from: b */
    public final URL f2109b;

    /* renamed from: c */
    public final String f2110c;

    /* renamed from: d */
    public final /* synthetic */ ND8 f2111d;

    /* renamed from: e */
    public final C47081pn8 f2112e;

    public BD8(ND8 nd8, String str, URL url, byte[] bArr, Map map, C47081pn8 c47081pn8) {
        this.f2111d = nd8;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(c47081pn8);
        this.f2109b = url;
        this.f2112e = c47081pn8;
        this.f2110c = str;
    }

    /* renamed from: a */
    public final /* synthetic */ void m114202a(int i, Exception exc, byte[] bArr, Map map) {
        C47081pn8 c47081pn8 = this.f2112e;
        c47081pn8.f104098a.m89769e(this.f2110c, i, exc, bArr, map);
    }

    /* renamed from: b */
    public final void m114201b(final int i, final Exception exc, final byte[] bArr, final Map map) {
        this.f2111d.f100966a.mo22257c().m43695w(new Runnable() { // from class: pD8
            @Override // java.lang.Runnable
            public final void run() {
                BD8.this.m114202a(i, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Type inference failed for: r10v0, types: [BD8] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HttpURLConnection httpURLConnection;
        ?? r4;
        ?? r42;
        int i;
        Throwable th;
        IOException e;
        InputStream inputStream;
        this.f2111d.mo22256d();
        try {
            ND8 nd8 = this.f2111d;
            URLConnection openConnection = this.f2109b.openConnection();
            if (openConnection instanceof HttpURLConnection) {
                httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setDefaultUseCaches(false);
                nd8.f100966a.m89751w();
                r4 = 60000;
                r42 = 60000;
                httpURLConnection.setConnectTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
                nd8.f100966a.m89751w();
                httpURLConnection.setReadTimeout(61000);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                try {
                    i = httpURLConnection.getResponseCode();
                } catch (IOException e2) {
                    e = e2;
                    r42 = 0;
                    IOException iOException = e;
                    i = 0;
                    e = iOException;
                    if (httpURLConnection != null) {
                    }
                    m114201b(i, e, null, r42);
                } catch (Throwable th2) {
                    th = th2;
                    r4 = 0;
                    Throwable th3 = th;
                    i = 0;
                    th = th3;
                    if (httpURLConnection != null) {
                    }
                    m114201b(i, null, null, r4);
                    throw th;
                }
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = inputStream.read(bArr);
                                    if (read > 0) {
                                        byteArrayOutputStream.write(bArr, 0, read);
                                    } else {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        m114201b(i, null, byteArray, headerFields);
                                        return;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            inputStream = null;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        r42 = 0;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        m114201b(i, e, null, r42);
                    } catch (Throwable th6) {
                        th = th6;
                        r4 = 0;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        m114201b(i, null, null, r4);
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                    if (httpURLConnection != null) {
                    }
                    m114201b(i, e, null, r42);
                } catch (Throwable th7) {
                    th = th7;
                    if (httpURLConnection != null) {
                    }
                    m114201b(i, null, null, r4);
                    throw th;
                }
            } else {
                throw new IOException("Failed to obtain HTTP connection");
            }
        } catch (IOException e5) {
            e = e5;
            httpURLConnection = null;
            r42 = 0;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            r4 = 0;
        }
    }
}
