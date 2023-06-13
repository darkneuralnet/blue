package p000;

import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
/* renamed from: SK6 */
/* loaded from: classes8.dex */
public class SK6 implements RF2 {

    /* renamed from: b */
    public byte[] f33481b;

    /* renamed from: d */
    public Uri f33483d;

    /* renamed from: c */
    public String f33482c = null;

    /* renamed from: a */
    public final AN6 f33480a = m85724f();

    /* renamed from: e */
    public Map<String, String> f33484e = new HashMap();

    @Override // p000.RF2
    /* renamed from: a */
    public int mo85729a(byte[] bArr) {
        HttpsURLConnection httpsURLConnection;
        OutputStream outputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f33483d.toString()).openConnection()));
                try {
                    httpsURLConnection.setReadTimeout(ZL6.HTTP_READ_TIMEOUT.m73250a());
                    httpsURLConnection.setConnectTimeout(ZL6.HTTP_CONNECT_TIMEOUT.m73250a());
                    httpsURLConnection.setRequestMethod(EnumC37911aM6.POST.toString());
                    httpsURLConnection.setSSLSocketFactory(this.f33480a);
                    httpsURLConnection.setDoOutput(true);
                    httpsURLConnection.setFixedLengthStreamingMode(bArr.length);
                    for (Map.Entry<String, String> entry : this.f33484e.entrySet()) {
                        httpsURLConnection.setRequestProperty(entry.getKey().toString(), entry.getValue().toString());
                    }
                    outputStream = httpsURLConnection.getOutputStream();
                    try {
                        outputStream.write(bArr);
                        outputStream.flush();
                        int responseCode = httpsURLConnection.getResponseCode();
                        this.f33482c = httpsURLConnection.getHeaderField("correlation-id");
                        if (responseCode == 200) {
                            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(httpsURLConnection.getInputStream());
                            try {
                                byte[] bArr2 = new byte[ZL6.READ_BYTE.m73250a()];
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                while (true) {
                                    int read = bufferedInputStream2.read(bArr2);
                                    if (read == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, read);
                                }
                                this.f33481b = byteArrayOutputStream.toByteArray();
                                bufferedInputStream = bufferedInputStream2;
                            } catch (Exception e) {
                                e = e;
                                bufferedInputStream = bufferedInputStream2;
                                KJ6.m99011b(getClass(), 3, e);
                                int m64630a = EnumC38504bM6.HTTP_STATUS_FAILED.m64630a();
                                C52760zN6.m1466j(getClass(), bufferedInputStream);
                                C52760zN6.m1466j(getClass(), outputStream);
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                }
                                return m64630a;
                            } catch (Throwable th) {
                                th = th;
                                bufferedInputStream = bufferedInputStream2;
                                C52760zN6.m1466j(getClass(), bufferedInputStream);
                                C52760zN6.m1466j(getClass(), outputStream);
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                }
                                throw th;
                            }
                        } else {
                            this.f33481b = new byte[0];
                        }
                        C52760zN6.m1466j(getClass(), bufferedInputStream);
                        C52760zN6.m1466j(getClass(), outputStream);
                        httpsURLConnection.disconnect();
                        return responseCode;
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    outputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e4) {
            e = e4;
            httpsURLConnection = null;
            outputStream = null;
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
            outputStream = null;
        }
    }

    @Override // p000.RF2
    /* renamed from: b */
    public byte[] mo85728b() {
        return this.f33481b;
    }

    @Override // p000.RF2
    /* renamed from: c */
    public String mo85727c() {
        return this.f33482c;
    }

    @Override // p000.RF2
    /* renamed from: d */
    public void mo85726d(Map<String, String> map) {
        this.f33484e = map;
    }

    @Override // p000.RF2
    /* renamed from: e */
    public void mo85725e(Uri uri) {
        this.f33483d = uri;
    }

    /* renamed from: f */
    public final AN6 m85724f() throws SSLException {
        return AN6.m115840a();
    }
}
