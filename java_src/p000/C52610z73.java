package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import zendesk.core.Constants;
/* renamed from: z73  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C52610z73 {

    /* renamed from: f */
    public static final String f120832f = "z73";

    /* renamed from: a */
    public final Context f120833a;

    /* renamed from: b */
    public final String f120834b;

    /* renamed from: c */
    public final String f120835c;

    /* renamed from: d */
    public final String f120836d;

    /* renamed from: e */
    public final X94<InterfaceC49746uI1> f120837e;

    public C52610z73(C31722Am1 c31722Am1) {
        this(c31722Am1.m115293j(), c31722Am1.m115290m(), ((C42172hX0) AbstractC31956Bm1.m113505d(c31722Am1)).m36238l());
    }

    /* renamed from: f */
    public static String m1773f(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangePlayIntegrityToken?key=%s";
                }
                throw new IllegalArgumentException("Unknown token type.");
            }
            return "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangeDebugToken?key=%s";
        }
        return "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangeSafetyNetToken?key=%s";
    }

    /* renamed from: g */
    public static final boolean m1772g(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: a */
    public HttpURLConnection m1778a(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: b */
    public C9439Xh m1777b(byte[] bArr, int i, PN4 pn4) throws FirebaseException, IOException, JSONException {
        if (pn4.m90358a()) {
            return C9439Xh.m76702a(m1771h(new URL(String.format(m1773f(i), this.f120836d, this.f120835c, this.f120834b)), bArr, pn4));
        }
        throw new FirebaseException("Too many attempts.");
    }

    /* renamed from: c */
    public String m1776c(byte[] bArr, PN4 pn4) throws FirebaseException, IOException, JSONException {
        if (pn4.m90358a()) {
            return m1771h(new URL(String.format("https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:generatePlayIntegrityChallenge?key=%s", this.f120836d, this.f120835c, this.f120834b)), bArr, pn4);
        }
        throw new FirebaseException("Too many attempts.");
    }

    /* renamed from: d */
    public final String m1775d() {
        try {
            Context context = this.f120833a;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                String str = f120832f;
                Log.e(str, "Could not get fingerprint hash for package: " + this.f120833a.getPackageName());
                return null;
            }
            return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException e) {
            String str2 = f120832f;
            Log.e(str2, "No such package: " + this.f120833a.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: e */
    public String m1774e() {
        InterfaceC49746uI1 interfaceC49746uI1 = this.f120837e.get();
        if (interfaceC49746uI1 != null) {
            try {
                return (String) Tasks.await(interfaceC49746uI1.mo10477b());
            } catch (Exception unused) {
                Log.w(f120832f, "Unable to get heartbeats!");
            }
        }
        return null;
    }

    /* renamed from: h */
    public final String m1771h(URL url, byte[] bArr, PN4 pn4) throws FirebaseException, IOException, JSONException {
        InputStream errorStream;
        HttpURLConnection m1778a = m1778a(url);
        try {
            m1778a.setDoOutput(true);
            m1778a.setFixedLengthStreamingMode(bArr.length);
            m1778a.setRequestProperty("Content-Type", Constants.APPLICATION_JSON);
            String m1774e = m1774e();
            if (m1774e != null) {
                m1778a.setRequestProperty("X-Firebase-Client", m1774e);
            }
            m1778a.setRequestProperty("X-Android-Package", this.f120833a.getPackageName());
            m1778a.setRequestProperty("X-Android-Cert", m1775d());
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(m1778a.getOutputStream(), bArr.length);
            bufferedOutputStream.write(bArr, 0, bArr.length);
            bufferedOutputStream.close();
            int responseCode = m1778a.getResponseCode();
            if (m1772g(responseCode)) {
                errorStream = m1778a.getInputStream();
            } else {
                errorStream = m1778a.getErrorStream();
            }
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, com.amazonaws.services.p026s3.internal.Constants.DEFAULT_ENCODING));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            String sb2 = sb.toString();
            if (m1772g(responseCode)) {
                pn4.m90356c();
                return sb2;
            }
            pn4.m90355d(responseCode);
            BN1 m114063a = BN1.m114063a(sb2);
            throw new FirebaseException("Error returned from API. code: " + m114063a.m114062b() + " body: " + m114063a.m114061c());
        } finally {
            m1778a.disconnect();
        }
    }

    public C52610z73(Context context, C47074pn1 c47074pn1, X94<InterfaceC49746uI1> x94) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(c47074pn1);
        Preconditions.checkNotNull(x94);
        this.f120833a = context;
        this.f120834b = c47074pn1.m18706b();
        this.f120835c = c47074pn1.m18705c();
        String m18703e = c47074pn1.m18703e();
        this.f120836d = m18703e;
        if (m18703e != null) {
            this.f120837e = x94;
            return;
        }
        throw new IllegalArgumentException("FirebaseOptions#getProjectId cannot be null.");
    }
}
