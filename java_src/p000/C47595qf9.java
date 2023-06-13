package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
/* renamed from: qf9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47595qf9 {

    /* renamed from: a */
    public final C52250yW8 f105594a;

    /* renamed from: b */
    public C52023y79 f105595b = new C52023y79();

    /* renamed from: c */
    public final int f105596c;

    public C47595qf9(C52250yW8 c52250yW8, int i) {
        this.f105594a = c52250yW8;
        C40529ek9.m42590a();
        this.f105596c = i;
    }

    /* renamed from: d */
    public static C47595qf9 m17260d(C52250yW8 c52250yW8) {
        return new C47595qf9(c52250yW8, 0);
    }

    /* renamed from: e */
    public static C47595qf9 m17259e(C52250yW8 c52250yW8, int i) {
        return new C47595qf9(c52250yW8, 1);
    }

    /* renamed from: a */
    public final int m17263a() {
        return this.f105596c;
    }

    /* renamed from: b */
    public final String m17262b() {
        M79 m81390h = this.f105594a.m3383l().m81390h();
        if (m81390h != null && !C43159jA8.m31031b(m81390h.m95710k())) {
            return (String) Preconditions.checkNotNull(m81390h.m95710k());
        }
        return "NA";
    }

    /* renamed from: c */
    public final byte[] m17261c(int i, boolean z) {
        boolean z2;
        C52023y79 c52023y79 = this.f105595b;
        if (1 != (i ^ 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        c52023y79.m4102f(Boolean.valueOf(z2));
        this.f105595b.m4103e(Boolean.FALSE);
        this.f105594a.m3384k(this.f105595b.m4095m());
        try {
            C40529ek9.m42590a();
            if (i == 0) {
                return new C47618qi2().m17220j(C46232oM8.f101852a).m17219k(true).m17221i().encode(this.f105594a.m3383l()).getBytes("utf-8");
            }
            UW8 m3383l = this.f105594a.m3383l();
            C46285oS7 c46285oS7 = new C46285oS7();
            C46232oM8.f101852a.configure(c46285oS7);
            return c46285oS7.m21040b().m112225a(m3383l);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    /* renamed from: f */
    public final C47595qf9 m17258f(EnumC45136mW8 enumC45136mW8) {
        this.f105594a.m3389f(enumC45136mW8);
        return this;
    }

    /* renamed from: g */
    public final C47595qf9 m17257g(C52023y79 c52023y79) {
        this.f105595b = c52023y79;
        return this;
    }
}
