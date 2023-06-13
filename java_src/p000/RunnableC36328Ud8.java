package p000;

import com.amazonaws.services.p026s3.Headers;
import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTimeConstants;
/* renamed from: Ud8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36328Ud8 implements Runnable {

    /* renamed from: b */
    public final URL f37699b;

    /* renamed from: c */
    public final byte[] f37700c;

    /* renamed from: d */
    public final InterfaceC46981pd8 f37701d;

    /* renamed from: e */
    public final String f37702e;

    /* renamed from: f */
    public final Map f37703f;

    /* renamed from: g */
    public final /* synthetic */ C38682bf8 f37704g;

    public RunnableC36328Ud8(C38682bf8 c38682bf8, String str, URL url, byte[] bArr, Map map, InterfaceC46981pd8 interfaceC46981pd8) {
        this.f37704g = c38682bf8;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(interfaceC46981pd8);
        this.f37699b = url;
        this.f37700c = bArr;
        this.f37701d = interfaceC46981pd8;
        this.f37702e = str;
        this.f37703f = map;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00fc: MOVE  (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:42:0x00fa */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0102: MOVE  (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:44:0x00ff */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        int i;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException e;
        int i2;
        Map map2;
        RunnableC33052Gd8 runnableC33052Gd8;
        C39965dn8 c39965dn8;
        IOException iOException;
        C38682bf8 c38682bf8;
        URLConnection openConnection;
        int responseCode;
        Map map3;
        Map map4;
        InputStream inputStream;
        this.f37704g.mo22256d();
        OutputStream outputStream = null;
        try {
            c38682bf8 = this.f37704g;
            openConnection = this.f37699b.openConnection();
        } catch (IOException e2) {
            e = e2;
            i2 = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th2) {
            th = th2;
            i = 0;
            httpURLConnection = null;
            map = null;
        }
        if (openConnection instanceof HttpURLConnection) {
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            c38682bf8.f100966a.m89751w();
            httpURLConnection.setConnectTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
            c38682bf8.f100966a.m89751w();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map5 = this.f37703f;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (this.f37700c != null) {
                    byte[] m110330O = this.f37704g.f15489b.m36285g0().m110330O(this.f37700c);
                    C40448ec8 m106889s = this.f37704g.f100966a.mo22258a().m106889s();
                    int length = m110330O.length;
                    m106889s.m42707b("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty(Headers.CONTENT_ENCODING, "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(m110330O);
                        outputStream2.close();
                    } catch (IOException e3) {
                        e = e3;
                        i2 = 0;
                        map2 = null;
                        outputStream = outputStream2;
                        iOException = e;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e4) {
                                this.f37704g.f100966a.mo22258a().m106893o().m42706c("Error closing HTTP compressed POST connection output stream. appId", C32809Fc8.m106885w(this.f37702e), e4);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c39965dn8 = this.f37704g.f100966a.mo22257c();
                        runnableC33052Gd8 = new RunnableC33052Gd8(this.f37702e, this.f37701d, i2, iOException, null, map2, null);
                        c39965dn8.m43695w(runnableC33052Gd8);
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        i = 0;
                        map = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e5) {
                                this.f37704g.f100966a.mo22258a().m106893o().m42706c("Error closing HTTP compressed POST connection output stream. appId", C32809Fc8.m106885w(this.f37702e), e5);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f37704g.f100966a.mo22257c().m43695w(new RunnableC33052Gd8(this.f37702e, this.f37701d, i, null, null, map, null));
                        throw th;
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
            } catch (IOException e6) {
                i2 = 0;
                map2 = null;
                iOException = e6;
            } catch (Throwable th4) {
                i = 0;
                map = null;
                th = th4;
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
                                if (read <= 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            inputStream.close();
                            httpURLConnection.disconnect();
                            c39965dn8 = this.f37704g.f100966a.mo22257c();
                            runnableC33052Gd8 = new RunnableC33052Gd8(this.f37702e, this.f37701d, responseCode, null, byteArray, headerFields, null);
                        } catch (Throwable th5) {
                            th = th5;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        inputStream = null;
                    }
                } catch (IOException e7) {
                    map2 = null;
                    iOException = e7;
                    i2 = responseCode;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    c39965dn8 = this.f37704g.f100966a.mo22257c();
                    runnableC33052Gd8 = new RunnableC33052Gd8(this.f37702e, this.f37701d, i2, iOException, null, map2, null);
                    c39965dn8.m43695w(runnableC33052Gd8);
                    return;
                } catch (Throwable th7) {
                    th = th7;
                    map = null;
                    i = responseCode;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.f37704g.f100966a.mo22257c().m43695w(new RunnableC33052Gd8(this.f37702e, this.f37701d, i, null, null, map, null));
                    throw th;
                }
            } catch (IOException e8) {
                iOException = e8;
                i2 = responseCode;
                map2 = map4;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                c39965dn8 = this.f37704g.f100966a.mo22257c();
                runnableC33052Gd8 = new RunnableC33052Gd8(this.f37702e, this.f37701d, i2, iOException, null, map2, null);
                c39965dn8.m43695w(runnableC33052Gd8);
                return;
            } catch (Throwable th8) {
                th = th8;
                i = responseCode;
                map = map3;
                if (outputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                this.f37704g.f100966a.mo22257c().m43695w(new RunnableC33052Gd8(this.f37702e, this.f37701d, i, null, null, map, null));
                throw th;
            }
            c39965dn8.m43695w(runnableC33052Gd8);
            return;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }
}
