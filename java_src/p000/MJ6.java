package p000;

import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
/* renamed from: MJ6 */
/* loaded from: classes8.dex */
public class MJ6 implements RF2 {

    /* renamed from: b */
    public byte[] f22975b;

    /* renamed from: d */
    public Uri f22977d;

    /* renamed from: c */
    public String f22976c = null;

    /* renamed from: a */
    public final AN6 f22974a = m95443f();

    /* renamed from: e */
    public Map<String, String> f22978e = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    @Override // p000.RF2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo85729a(byte[] bArr) {
        HttpsURLConnection httpsURLConnection;
        BufferedInputStream bufferedInputStream;
        try {
            httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f22977d.toString()).openConnection()));
        } catch (Exception e) {
            e = e;
            httpsURLConnection = null;
            bufferedInputStream = null;
        } catch (Throwable th) {
            th = th;
            httpsURLConnection = null;
            bufferedInputStream = null;
        }
        try {
            httpsURLConnection.setReadTimeout(ZL6.HTTP_READ_TIMEOUT.m73250a());
            httpsURLConnection.setConnectTimeout(ZL6.HTTP_CONNECT_TIMEOUT.m73250a());
            httpsURLConnection.setRequestMethod(EnumC37911aM6.GET.toString());
            for (Map.Entry<String, String> entry : this.f22978e.entrySet()) {
                httpsURLConnection.setRequestProperty(entry.getKey().toString(), entry.getValue().toString());
            }
            int responseCode = httpsURLConnection.getResponseCode();
            this.f22976c = httpsURLConnection.getHeaderField("correlation-id");
            if (responseCode == 200) {
                bufferedInputStream = new BufferedInputStream(httpsURLConnection.getInputStream());
                try {
                    try {
                        byte[] bArr2 = new byte[ZL6.READ_BYTE.m73250a()];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int read = bufferedInputStream.read(bArr2);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, read);
                        }
                        this.f22975b = byteArrayOutputStream.toByteArray();
                    } catch (Exception e2) {
                        e = e2;
                        KJ6.m99011b(getClass(), 3, e);
                        int m64630a = EnumC38504bM6.HTTP_STATUS_FAILED.m64630a();
                        C52760zN6.m1466j(getClass(), bufferedInputStream);
                        C52760zN6.m1466j(getClass(), null);
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        return m64630a;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C52760zN6.m1466j(getClass(), bufferedInputStream);
                    C52760zN6.m1466j(getClass(), null);
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            } else {
                this.f22975b = new byte[0];
                bufferedInputStream = null;
            }
            C52760zN6.m1466j(getClass(), bufferedInputStream);
            C52760zN6.m1466j(getClass(), null);
            httpsURLConnection.disconnect();
            return responseCode;
        } catch (Exception e3) {
            e = e3;
            bufferedInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
            C52760zN6.m1466j(getClass(), bufferedInputStream);
            C52760zN6.m1466j(getClass(), null);
            if (httpsURLConnection != null) {
            }
            throw th;
        }
    }

    @Override // p000.RF2
    /* renamed from: b */
    public byte[] mo85728b() {
        return this.f22975b;
    }

    @Override // p000.RF2
    /* renamed from: c */
    public String mo85727c() {
        return this.f22976c;
    }

    @Override // p000.RF2
    /* renamed from: d */
    public void mo85726d(Map<String, String> map) {
        this.f22978e = map;
    }

    @Override // p000.RF2
    /* renamed from: e */
    public void mo85725e(Uri uri) {
        this.f22977d = uri;
    }

    /* renamed from: f */
    public AN6 m95443f() throws SSLException {
        return AN6.m115840a();
    }
}
