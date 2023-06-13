package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
/* renamed from: XX0 */
/* loaded from: classes2.dex */
public class XX0 implements SD2 {

    /* renamed from: b */
    public final HttpURLConnection f43360b;

    public XX0(HttpURLConnection httpURLConnection) {
        this.f43360b = httpURLConnection;
    }

    @Override // p000.SD2
    /* renamed from: Z1 */
    public String mo76912Z1() {
        return this.f43360b.getContentType();
    }

    /* renamed from: a */
    public final String m76911a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43360b.disconnect();
    }

    @Override // p000.SD2
    /* renamed from: f2 */
    public InputStream mo76910f2() throws IOException {
        return this.f43360b.getInputStream();
    }

    @Override // p000.SD2
    public boolean isSuccessful() {
        try {
            return this.f43360b.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p000.SD2
    /* renamed from: j */
    public String mo76909j() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f43360b.getURL() + ". Failed with " + this.f43360b.getResponseCode() + "\n" + m76911a(this.f43360b);
        } catch (IOException e) {
            C32524Dx2.m109585d("get error failed ", e);
            return e.getMessage();
        }
    }
}
