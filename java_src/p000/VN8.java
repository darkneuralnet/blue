package p000;

import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p000.C25919m8;
/* renamed from: VN8 */
/* loaded from: classes6.dex */
public final class VN8 extends TR8 {

    /* renamed from: d */
    public final Map f39034d;

    /* renamed from: e */
    public final C52939zg8 f39035e;

    /* renamed from: f */
    public final C52939zg8 f39036f;

    /* renamed from: g */
    public final C52939zg8 f39037g;

    /* renamed from: h */
    public final C52939zg8 f39038h;

    /* renamed from: i */
    public final C52939zg8 f39039i;

    public VN8(C42162hV8 c42162hV8) {
        super(c42162hV8);
        this.f39034d = new HashMap();
        C33556Ih8 m89784F = this.f100966a.m89784F();
        m89784F.getClass();
        this.f39035e = new C52939zg8(m89784F, "last_delete_stale", 0L);
        C33556Ih8 m89784F2 = this.f100966a.m89784F();
        m89784F2.getClass();
        this.f39036f = new C52939zg8(m89784F2, "backoff", 0L);
        C33556Ih8 m89784F3 = this.f100966a.m89784F();
        m89784F3.getClass();
        this.f39037g = new C52939zg8(m89784F3, "last_upload", 0L);
        C33556Ih8 m89784F4 = this.f100966a.m89784F();
        m89784F4.getClass();
        this.f39038h = new C52939zg8(m89784F4, "last_upload_attempt", 0L);
        C33556Ih8 m89784F5 = this.f100966a.m89784F();
        m89784F5.getClass();
        this.f39039i = new C52939zg8(m89784F5, "midnight_offset", 0L);
    }

    @Override // p000.TR8
    /* renamed from: i */
    public final boolean mo11655i() {
        return false;
    }

    @Deprecated
    /* renamed from: j */
    public final Pair m79907j(String str) {
        C39108cN8 c39108cN8;
        C25919m8.C25920a c25920a;
        mo19953e();
        long elapsedRealtime = this.f100966a.mo22260A().elapsedRealtime();
        C39108cN8 c39108cN82 = (C39108cN8) this.f39034d.get(str);
        if (c39108cN82 != null && elapsedRealtime < c39108cN82.f60488c) {
            return new Pair(c39108cN82.f60486a, Boolean.valueOf(c39108cN82.f60487b));
        }
        C25919m8.m26306b(true);
        long m37512o = this.f100966a.m89751w().m37512o(str, C37795a98.f49963c) + elapsedRealtime;
        try {
            long m37512o2 = this.f100966a.m89751w().m37512o(str, C37795a98.f49965d);
            if (m37512o2 > 0) {
                try {
                    c25920a = C25919m8.m26307a(this.f100966a.mo22255z());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (c39108cN82 != null && elapsedRealtime < c39108cN82.f60488c + m37512o2) {
                        return new Pair(c39108cN82.f60486a, Boolean.valueOf(c39108cN82.f60487b));
                    }
                    c25920a = null;
                }
            } else {
                c25920a = C25919m8.m26307a(this.f100966a.mo22255z());
            }
        } catch (Exception e) {
            this.f100966a.mo22258a().m106894n().m42707b("Unable to get advertising id", e);
            c39108cN8 = new C39108cN8("", false, m37512o);
        }
        if (c25920a == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String m26300a = c25920a.m26300a();
        if (m26300a != null) {
            c39108cN8 = new C39108cN8(m26300a, c25920a.m26299b(), m37512o);
        } else {
            c39108cN8 = new C39108cN8("", c25920a.m26299b(), m37512o);
        }
        this.f39034d.put(str, c39108cN8);
        C25919m8.m26306b(false);
        return new Pair(c39108cN8.f60486a, Boolean.valueOf(c39108cN8.f60487b));
    }

    /* renamed from: k */
    public final Pair m79906k(String str, C37110Xm7 c37110Xm7) {
        if (c37110Xm7.m76357i(EnumC39344cm7.AD_STORAGE)) {
            return m79907j(str);
        }
        return new Pair("", Boolean.FALSE);
    }

    @Deprecated
    /* renamed from: l */
    public final String m79905l(String str, boolean z) {
        String str2;
        mo19953e();
        if (z) {
            str2 = (String) m79907j(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest m92056q = OW8.m92056q();
        if (m92056q == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, m92056q.digest(str2.getBytes())));
    }
}
