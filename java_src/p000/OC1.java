package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
/* renamed from: OC1 */
/* loaded from: classes5.dex */
public class OC1 implements InterfaceC38133ak2 {

    /* renamed from: b */
    public final JH1 f26158b;

    /* renamed from: c */
    public final URL f26159c;

    /* renamed from: d */
    public final String f26160d;

    /* renamed from: e */
    public String f26161e;

    /* renamed from: f */
    public URL f26162f;

    /* renamed from: g */
    public volatile byte[] f26163g;

    /* renamed from: h */
    public int f26164h;

    public OC1(URL url) {
        this(url, JH1.f17276b);
    }

    @Override // p000.InterfaceC38133ak2
    /* renamed from: a */
    public void mo3854a(MessageDigest messageDigest) {
        messageDigest.update(m92632d());
    }

    /* renamed from: c */
    public String m92633c() {
        String str = this.f26160d;
        return str != null ? str : ((URL) C52865zZ3.m1111d(this.f26159c)).toString();
    }

    /* renamed from: d */
    public final byte[] m92632d() {
        if (this.f26163g == null) {
            this.f26163g = m92633c().getBytes(InterfaceC38133ak2.f51105a);
        }
        return this.f26163g;
    }

    /* renamed from: e */
    public Map<String, String> m92631e() {
        return this.f26158b.getHeaders();
    }

    @Override // p000.InterfaceC38133ak2
    public boolean equals(Object obj) {
        if (!(obj instanceof OC1)) {
            return false;
        }
        OC1 oc1 = (OC1) obj;
        if (!m92633c().equals(oc1.m92633c()) || !this.f26158b.equals(oc1.f26158b)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String m92630f() {
        if (TextUtils.isEmpty(this.f26161e)) {
            String str = this.f26160d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) C52865zZ3.m1111d(this.f26159c)).toString();
            }
            this.f26161e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f26161e;
    }

    /* renamed from: g */
    public final URL m92629g() throws MalformedURLException {
        if (this.f26162f == null) {
            this.f26162f = new URL(m92630f());
        }
        return this.f26162f;
    }

    /* renamed from: h */
    public URL m92628h() throws MalformedURLException {
        return m92629g();
    }

    @Override // p000.InterfaceC38133ak2
    public int hashCode() {
        if (this.f26164h == 0) {
            int hashCode = m92633c().hashCode();
            this.f26164h = hashCode;
            this.f26164h = (hashCode * 31) + this.f26158b.hashCode();
        }
        return this.f26164h;
    }

    public String toString() {
        return m92633c();
    }

    public OC1(String str) {
        this(str, JH1.f17276b);
    }

    public OC1(URL url, JH1 jh1) {
        this.f26159c = (URL) C52865zZ3.m1111d(url);
        this.f26160d = null;
        this.f26158b = (JH1) C52865zZ3.m1111d(jh1);
    }

    public OC1(String str, JH1 jh1) {
        this.f26159c = null;
        this.f26160d = C52865zZ3.m1113b(str);
        this.f26158b = (JH1) C52865zZ3.m1111d(jh1);
    }
}
