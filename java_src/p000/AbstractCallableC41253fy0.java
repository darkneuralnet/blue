package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import zendesk.core.Constants;
/* renamed from: fy0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractCallableC41253fy0<T> implements Callable<T> {

    /* renamed from: d */
    public static final String f81214d = C50139ux2.m9434c();

    /* renamed from: e */
    public static final Map<String, String> f81215e = Collections.singletonMap("Content-Type", Constants.APPLICATION_JSON);

    /* renamed from: f */
    public static final Charset f81216f = StandardCharsets.UTF_8;

    /* renamed from: b */
    public HttpURLConnection f81217b;

    /* renamed from: c */
    public final String f81218c;

    /* renamed from: fy0$a */
    /* loaded from: classes.dex */
    public enum EnumC20668a {
        GET("GET", false),
        POST("POST", true);
        

        /* renamed from: b */
        public final String f81222b;

        /* renamed from: c */
        public final boolean f81223c;

        EnumC20668a(String str, boolean z) {
            this.f81222b = str;
            this.f81223c = z;
        }

        /* renamed from: a */
        public String m40404a() {
            return this.f81222b;
        }

        /* renamed from: b */
        public boolean m40403b() {
            return this.f81223c;
        }
    }

    public AbstractCallableC41253fy0(String str) {
        this.f81218c = str;
    }

    /* renamed from: a */
    public byte[] m40412a() throws IOException {
        return m40411b(Collections.emptyMap());
    }

    /* renamed from: b */
    public byte[] m40411b(Map<String, String> map) throws IOException {
        if (this.f81217b == null) {
            try {
                HttpURLConnection m40408e = m40408e(this.f81218c, map, EnumC20668a.GET);
                this.f81217b = m40408e;
                m40408e.connect();
                return m40407f(this.f81217b);
            } finally {
                HttpURLConnection httpURLConnection = this.f81217b;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
        throw new RuntimeException("Connection already initiated");
    }

    /* renamed from: c */
    public final byte[] m40410c(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        int read = inputStream.read(bArr);
        while (read > 0) {
            byteArrayOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: d */
    public String m40409d() {
        return this.f81218c;
    }

    /* renamed from: e */
    public final HttpURLConnection m40408e(String str, Map<String, String> map, EnumC20668a enumC20668a) throws IOException {
        HttpURLConnection m95648a = ON1.m92368c().m95648a(str);
        m95648a.setRequestMethod(enumC20668a.m40404a());
        m95648a.setUseCaches(false);
        m95648a.setDoInput(true);
        m95648a.setDoOutput(enumC20668a.m40403b());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            m95648a.addRequestProperty(entry.getKey(), entry.getValue());
        }
        return m95648a;
    }

    /* renamed from: f */
    public final byte[] m40407f(HttpURLConnection httpURLConnection) throws IOException {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                byte[] m40410c = m40410c(inputStream);
                if (m40410c != null) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return m40410c;
                } else if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (errorStream != null) {
                        try {
                            errorStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }
        throw m40406g(m40410c(errorStream));
    }

    /* renamed from: g */
    public final IOException m40406g(byte[] bArr) {
        String str;
        if (bArr != null) {
            str = new String(bArr, f81216f);
        } else {
            str = null;
        }
        return new IOException(str);
    }

    /* renamed from: h */
    public byte[] m40405h(Map<String, String> map, byte[] bArr) throws IOException {
        if (this.f81217b == null) {
            try {
                HttpURLConnection m40408e = m40408e(this.f81218c, map, EnumC20668a.POST);
                this.f81217b = m40408e;
                m40408e.connect();
                OutputStream outputStream = this.f81217b.getOutputStream();
                outputStream.write(bArr);
                outputStream.flush();
                outputStream.close();
                return m40407f(this.f81217b);
            } finally {
                HttpURLConnection httpURLConnection = this.f81217b;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
        throw new RuntimeException("Connection already initiated");
    }
}
