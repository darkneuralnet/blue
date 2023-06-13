package p000;

import java.util.List;
/* renamed from: HV0 */
/* loaded from: classes6.dex */
public final class HV0 {

    /* renamed from: a */
    public final byte[] f13452a;

    /* renamed from: b */
    public int f13453b;

    /* renamed from: c */
    public final String f13454c;

    /* renamed from: d */
    public final List<byte[]> f13455d;

    /* renamed from: e */
    public final String f13456e;

    /* renamed from: f */
    public Integer f13457f;

    /* renamed from: g */
    public Integer f13458g;

    /* renamed from: h */
    public Object f13459h;

    /* renamed from: i */
    public final int f13460i;

    /* renamed from: j */
    public final int f13461j;

    public HV0(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    /* renamed from: a */
    public List<byte[]> m103823a() {
        return this.f13455d;
    }

    /* renamed from: b */
    public String m103822b() {
        return this.f13456e;
    }

    /* renamed from: c */
    public int m103821c() {
        return this.f13453b;
    }

    /* renamed from: d */
    public Object m103820d() {
        return this.f13459h;
    }

    /* renamed from: e */
    public byte[] m103819e() {
        return this.f13452a;
    }

    /* renamed from: f */
    public int m103818f() {
        return this.f13460i;
    }

    /* renamed from: g */
    public int m103817g() {
        return this.f13461j;
    }

    /* renamed from: h */
    public String m103816h() {
        return this.f13454c;
    }

    /* renamed from: i */
    public boolean m103815i() {
        return this.f13460i >= 0 && this.f13461j >= 0;
    }

    /* renamed from: j */
    public void m103814j(Integer num) {
        this.f13458g = num;
    }

    /* renamed from: k */
    public void m103813k(Integer num) {
        this.f13457f = num;
    }

    /* renamed from: l */
    public void m103812l(int i) {
        this.f13453b = i;
    }

    /* renamed from: m */
    public void m103811m(Object obj) {
        this.f13459h = obj;
    }

    public HV0(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f13452a = bArr;
        this.f13453b = bArr == null ? 0 : bArr.length * 8;
        this.f13454c = str;
        this.f13455d = list;
        this.f13456e = str2;
        this.f13460i = i2;
        this.f13461j = i;
    }
}
