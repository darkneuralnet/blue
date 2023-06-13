package p000;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
/* renamed from: YX0 */
/* loaded from: classes2.dex */
public class YX0 implements YD2 {
    @Override // p000.YD2
    /* renamed from: a */
    public SD2 mo74934a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new XX0(httpURLConnection);
    }
}
