package p000;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JsonPointer;
import com.nimbusds.jose.shaded.ow2asm.ClassTooLargeException;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Settings;
import p000.C28821tp;
/* renamed from: Oj0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34970Oj0 extends AbstractC34736Nj0 {

    /* renamed from: A */
    public int f27104A;

    /* renamed from: B */
    public O70 f27105B;

    /* renamed from: C */
    public int f27106C;

    /* renamed from: D */
    public O70 f27107D;

    /* renamed from: E */
    public C49498ts4 f27108E;

    /* renamed from: F */
    public C49498ts4 f27109F;

    /* renamed from: G */
    public C28821tp f27110G;

    /* renamed from: H */
    public int f27111H;

    /* renamed from: c */
    public int f27112c;

    /* renamed from: d */
    public final C52849zX5 f27113d;

    /* renamed from: e */
    public int f27114e;

    /* renamed from: f */
    public int f27115f;

    /* renamed from: g */
    public int f27116g;

    /* renamed from: h */
    public int f27117h;

    /* renamed from: i */
    public int[] f27118i;

    /* renamed from: j */
    public C39328cl1 f27119j;

    /* renamed from: k */
    public C39328cl1 f27120k;

    /* renamed from: l */
    public ZT2 f27121l;

    /* renamed from: m */
    public ZT2 f27122m;

    /* renamed from: n */
    public int f27123n;

    /* renamed from: o */
    public O70 f27124o;

    /* renamed from: p */
    public int f27125p;

    /* renamed from: q */
    public int f27126q;

    /* renamed from: r */
    public int f27127r;

    /* renamed from: s */
    public int f27128s;

    /* renamed from: t */
    public O70 f27129t;

    /* renamed from: u */
    public C3725If f27130u;

    /* renamed from: v */
    public C3725If f27131v;

    /* renamed from: w */
    public C3725If f27132w;

    /* renamed from: x */
    public C3725If f27133x;

    /* renamed from: y */
    public C49864uV2 f27134y;

    /* renamed from: z */
    public int f27135z;

    public C34970Oj0(int i) {
        this(null, i);
    }

    @Override // p000.AbstractC34736Nj0
    /* renamed from: a */
    public final void mo91630a(int i, int i2, String str, String str2, String str3, String[] strArr) {
        int i3;
        this.f27112c = i;
        this.f27114e = i2;
        C52849zX5 c52849zX5 = this.f27113d;
        int i4 = i & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f27115f = c52849zX5.m1207f0(i4, str);
        if (str2 != null) {
            this.f27127r = this.f27113d.m1241D(str2);
        }
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = this.f27113d.m1210e(str3).f114226a;
        }
        this.f27116g = i3;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f27117h = length;
            this.f27118i = new int[length];
            for (int i5 = 0; i5 < this.f27117h; i5++) {
                this.f27118i[i5] = this.f27113d.m1210e(strArr[i5]).f114226a;
            }
        }
        if (this.f27111H == 1 && i4 >= 51) {
            this.f27111H = 2;
        }
    }

    @Override // p000.AbstractC34736Nj0
    /* renamed from: b */
    public final AbstractC3201Hf mo91629b(String str, boolean z) {
        if (z) {
            C3725If m101833j = C3725If.m101833j(this.f27113d, str, this.f27130u);
            this.f27130u = m101833j;
            return m101833j;
        }
        C3725If m101833j2 = C3725If.m101833j(this.f27113d, str, this.f27131v);
        this.f27131v = m101833j2;
        return m101833j2;
    }

    @Override // p000.AbstractC34736Nj0
    /* renamed from: c */
    public final void mo91628c(C28821tp c28821tp) {
        c28821tp.f111062c = this.f27110G;
        this.f27110G = c28821tp;
    }

    @Override // p000.AbstractC34736Nj0
    /* renamed from: d */
    public final void mo91627d() {
    }

    @Override // p000.AbstractC34736Nj0
    /* renamed from: e */
    public final AbstractC38735bl1 mo91626e(int i, String str, String str2, String str3, Object obj) {
        C39328cl1 c39328cl1 = new C39328cl1(this.f27113d, i, str, str2, str3, obj);
        if (this.f27119j == null) {
            this.f27119j = c39328cl1;
        } else {
            this.f27120k.f58035b = c39328cl1;
        }
        this.f27120k = c39328cl1;
        return c39328cl1;
    }

    @Override // p000.AbstractC34736Nj0
    /* renamed from: f */
    public final void mo91625f(String str, String str2, String str3, int i) {
        int i2;
        if (this.f27124o == null) {
            this.f27124o = new O70();
        }
        AbstractC50477vX5 m1210e = this.f27113d.m1210e(str);
        if (m1210e.f114232g == 0) {
            this.f27123n++;
            this.f27124o.m92888k(m1210e.f114226a);
            O70 o70 = this.f27124o;
            int i3 = 0;
            if (str2 == null) {
                i2 = 0;
            } else {
                i2 = this.f27113d.m1210e(str2).f114226a;
            }
            o70.m92888k(i2);
            O70 o702 = this.f27124o;
            if (str3 != null) {
                i3 = this.f27113d.m1241D(str3);
            }
            o702.m92888k(i3);
            this.f27124o.m92888k(i);
            m1210e.f114232g = this.f27123n;
        }
    }

    @Override // p000.AbstractC34736Nj0
    /* renamed from: g */
    public final YT2 mo91624g(int i, String str, String str2, String str3, String[] strArr) {
        ZT2 zt2 = new ZT2(this.f27113d, i, str, str2, str3, strArr, this.f27111H);
        if (this.f27121l == null) {
            this.f27121l = zt2;
        } else {
            this.f27122m.f45910b = zt2;
        }
        this.f27122m = zt2;
        return zt2;
    }

    @Override // p000.AbstractC34736Nj0
    /* renamed from: h */
    public final AbstractC49271tV2 mo91623h(String str, int i, String str2) {
        int m1241D;
        C52849zX5 c52849zX5 = this.f27113d;
        int i2 = c52849zX5.m1188y(str).f114226a;
        if (str2 == null) {
            m1241D = 0;
        } else {
            m1241D = this.f27113d.m1241D(str2);
        }
        C49864uV2 c49864uV2 = new C49864uV2(c52849zX5, i2, i, m1241D);
        this.f27134y = c49864uV2;
        return c49864uV2;
    }

    @Override // p000.AbstractC34736Nj0
    /* renamed from: i */
    public final void mo91622i(String str) {
        this.f27135z = this.f27113d.m1210e(str).f114226a;
    }

    @Override // p000.AbstractC34736Nj0
    /* renamed from: j */
    public final void mo91621j(String str) {
        if (this.f27105B == null) {
            this.f27105B = new O70();
        }
        this.f27104A++;
        this.f27105B.m92888k(this.f27113d.m1210e(str).f114226a);
    }

    @Override // p000.AbstractC34736Nj0
    /* renamed from: k */
    public final void mo91620k(String str, String str2, String str3) {
        this.f27125p = this.f27113d.m1210e(str).f114226a;
        if (str2 != null && str3 != null) {
            this.f27126q = this.f27113d.m1187z(str2, str3);
        }
    }

    @Override // p000.AbstractC34736Nj0
    /* renamed from: l */
    public final void mo91619l(String str) {
        if (this.f27107D == null) {
            this.f27107D = new O70();
        }
        this.f27106C++;
        this.f27107D.m92888k(this.f27113d.m1210e(str).f114226a);
    }

    @Override // p000.AbstractC34736Nj0
    /* renamed from: m */
    public final AbstractC48905ss4 mo91618m(String str, String str2, String str3) {
        C49498ts4 c49498ts4 = new C49498ts4(this.f27113d, str, str2, str3);
        if (this.f27108E == null) {
            this.f27108E = c49498ts4;
        } else {
            this.f27109F.f109435b = c49498ts4;
        }
        this.f27109F = c49498ts4;
        return c49498ts4;
    }

    @Override // p000.AbstractC34736Nj0
    /* renamed from: n */
    public final void mo91617n(String str, String str2) {
        if (str != null) {
            this.f27128s = this.f27113d.m1241D(str);
        }
        if (str2 != null) {
            this.f27129t = new O70().m92898a(str2, 0, Integer.MAX_VALUE);
        }
    }

    @Override // p000.AbstractC34736Nj0
    /* renamed from: o */
    public final AbstractC3201Hf mo91616o(int i, C32330Db6 c32330Db6, String str, boolean z) {
        if (z) {
            C3725If m101834i = C3725If.m101834i(this.f27113d, i, c32330Db6, str, this.f27132w);
            this.f27132w = m101834i;
            return m101834i;
        }
        C3725If m101834i2 = C3725If.m101834i(this.f27113d, i, c32330Db6, str, this.f27133x);
        this.f27133x = m101834i2;
        return m101834i2;
    }

    /* renamed from: p */
    public final C28821tp[] m91615p() {
        C28821tp.C28822a c28822a = new C28821tp.C28822a();
        c28822a.m11733b(this.f27110G);
        for (C39328cl1 c39328cl1 = this.f27119j; c39328cl1 != null; c39328cl1 = (C39328cl1) c39328cl1.f58035b) {
            c39328cl1.m60934e(c28822a);
        }
        for (ZT2 zt2 = this.f27121l; zt2 != null; zt2 = (ZT2) zt2.f45910b) {
            zt2.m73064H(c28822a);
        }
        for (C49498ts4 c49498ts4 = this.f27108E; c49498ts4 != null; c49498ts4 = (C49498ts4) c49498ts4.f109435b) {
            c49498ts4.m11268e(c28822a);
        }
        return c28822a.m11731d();
    }

    /* renamed from: q */
    public ClassLoader m91614q() {
        return getClass().getClassLoader();
    }

    /* renamed from: r */
    public String m91613r(String str, String str2) {
        ClassLoader m91614q = m91614q();
        try {
            Class<?> cls = Class.forName(str.replace(JsonPointer.SEPARATOR, CoreConstants.DOT), false, m91614q);
            try {
                Class<?> cls2 = Class.forName(str2.replace(JsonPointer.SEPARATOR, CoreConstants.DOT), false, m91614q);
                if (cls.isAssignableFrom(cls2)) {
                    return str;
                }
                if (cls2.isAssignableFrom(cls)) {
                    return str2;
                }
                if (!cls.isInterface() && !cls2.isInterface()) {
                    do {
                        cls = cls.getSuperclass();
                    } while (!cls.isAssignableFrom(cls2));
                    return cls.getName().replace(CoreConstants.DOT, JsonPointer.SEPARATOR);
                }
                return "java/lang/Object";
            } catch (ClassNotFoundException e) {
                throw new TypeNotPresentException(str2, e);
            }
        } catch (ClassNotFoundException e2) {
            throw new TypeNotPresentException(str, e2);
        }
    }

    /* renamed from: s */
    public final byte[] m91612s(byte[] bArr, boolean z) {
        int i;
        C28821tp[] m91615p = m91615p();
        this.f27119j = null;
        this.f27120k = null;
        this.f27121l = null;
        this.f27122m = null;
        this.f27130u = null;
        this.f27131v = null;
        this.f27132w = null;
        this.f27133x = null;
        this.f27134y = null;
        int i2 = 0;
        this.f27135z = 0;
        this.f27104A = 0;
        this.f27105B = null;
        this.f27106C = 0;
        this.f27107D = null;
        this.f27108E = null;
        this.f27109F = null;
        this.f27110G = null;
        if (z) {
            i = 3;
        } else {
            i = 0;
        }
        this.f27111H = i;
        C34034Kj0 c34034Kj0 = new C34034Kj0(bArr, 0, false);
        if (z) {
            i2 = 8;
        }
        c34034Kj0.m98446a(this, m91615p, i2 | 256);
        return m91611t();
    }

    /* renamed from: t */
    public byte[] m91611t() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = (this.f27117h * 2) + 24;
        int i8 = 0;
        for (C39328cl1 c39328cl1 = this.f27119j; c39328cl1 != null; c39328cl1 = (C39328cl1) c39328cl1.f58035b) {
            i8++;
            i7 += c39328cl1.m60933f();
        }
        int i9 = 0;
        for (ZT2 zt2 = this.f27121l; zt2 != null; zt2 = (ZT2) zt2.f45910b) {
            i9++;
            i7 += zt2.m73061K();
        }
        O70 o70 = this.f27124o;
        if (o70 != null) {
            i7 += o70.f25908b + 8;
            this.f27113d.m1241D("InnerClasses");
            i = 1;
        } else {
            i = 0;
        }
        if (this.f27125p != 0) {
            i++;
            i7 += 10;
            this.f27113d.m1241D("EnclosingMethod");
        }
        if ((this.f27114e & 4096) != 0 && (this.f27112c & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 49) {
            i++;
            i7 += 6;
            this.f27113d.m1241D("Synthetic");
        }
        if (this.f27127r != 0) {
            i++;
            i7 += 8;
            this.f27113d.m1241D("Signature");
        }
        if (this.f27128s != 0) {
            i++;
            i7 += 8;
            this.f27113d.m1241D("SourceFile");
        }
        O70 o702 = this.f27129t;
        if (o702 != null) {
            i++;
            i7 += o702.f25908b + 6;
            this.f27113d.m1241D("SourceDebugExtension");
        }
        if ((this.f27114e & DateUtils.FORMAT_NUMERIC_DATE) != 0) {
            i++;
            i7 += 6;
            this.f27113d.m1241D("Deprecated");
        }
        C3725If c3725If = this.f27130u;
        if (c3725If != null) {
            i++;
            i7 += c3725If.m101836g("RuntimeVisibleAnnotations");
        }
        C3725If c3725If2 = this.f27131v;
        if (c3725If2 != null) {
            i++;
            i7 += c3725If2.m101836g("RuntimeInvisibleAnnotations");
        }
        C3725If c3725If3 = this.f27132w;
        if (c3725If3 != null) {
            i++;
            i7 += c3725If3.m101836g("RuntimeVisibleTypeAnnotations");
        }
        C3725If c3725If4 = this.f27133x;
        if (c3725If4 != null) {
            i++;
            i7 += c3725If4.m101836g("RuntimeInvisibleTypeAnnotations");
        }
        if (this.f27113d.m1233L() > 0) {
            i++;
            i7 += this.f27113d.m1233L();
        }
        C49864uV2 c49864uV2 = this.f27134y;
        if (c49864uV2 != null) {
            i += c49864uV2.m10212j();
            i7 += this.f27134y.m10213i();
        }
        if (this.f27135z != 0) {
            i++;
            i7 += 8;
            this.f27113d.m1241D("NestHost");
        }
        O70 o703 = this.f27105B;
        if (o703 != null) {
            i++;
            i7 += o703.f25908b + 8;
            this.f27113d.m1241D("NestMembers");
        }
        O70 o704 = this.f27107D;
        if (o704 != null) {
            i++;
            i7 += o704.f25908b + 8;
            this.f27113d.m1241D("PermittedSubclasses");
        }
        if ((this.f27114e & 65536) == 0 && this.f27108E == null) {
            i2 = 0;
            i3 = 0;
        } else {
            i2 = 0;
            i3 = 0;
            for (C49498ts4 c49498ts4 = this.f27108E; c49498ts4 != null; c49498ts4 = (C49498ts4) c49498ts4.f109435b) {
                i3++;
                i2 += c49498ts4.m11267f();
            }
            i++;
            i7 += i2 + 8;
            this.f27113d.m1241D("Record");
        }
        C28821tp c28821tp = this.f27110G;
        if (c28821tp != null) {
            int m11741d = i + c28821tp.m11741d();
            i7 += this.f27110G.m11744a(this.f27113d);
            i = m11741d;
        }
        int m1228Q = i7 + this.f27113d.m1228Q();
        int m1229P = this.f27113d.m1229P();
        if (m1229P <= 65535) {
            O70 o705 = new O70(m1228Q);
            o705.m92890i(-889275714).m92890i(this.f27112c);
            this.f27113d.m1209e0(o705);
            if ((this.f27112c & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 49) {
                i4 = 4096;
            } else {
                i4 = 0;
            }
            o705.m92888k((~i4) & this.f27114e).m92888k(this.f27115f).m92888k(this.f27116g);
            o705.m92888k(this.f27117h);
            for (int i10 = 0; i10 < this.f27117h; i10++) {
                o705.m92888k(this.f27118i[i10]);
            }
            o705.m92888k(i8);
            for (C39328cl1 c39328cl12 = this.f27119j; c39328cl12 != null; c39328cl12 = (C39328cl1) c39328cl12.f58035b) {
                c39328cl12.m60932g(o705);
            }
            o705.m92888k(i9);
            boolean z = false;
            boolean z2 = false;
            for (ZT2 zt22 = this.f27121l; zt22 != null; zt22 = (ZT2) zt22.f45910b) {
                z |= zt22.m73058N();
                z2 |= zt22.m73059M();
                zt22.m73054R(o705);
            }
            o705.m92888k(i);
            if (this.f27124o != null) {
                O70 m92888k = o705.m92888k(this.f27113d.m1241D("InnerClasses")).m92890i(this.f27124o.f25908b + 2).m92888k(this.f27123n);
                O70 o706 = this.f27124o;
                m92888k.m92891h(o706.f25907a, 0, o706.f25908b);
            }
            if (this.f27125p != 0) {
                o705.m92888k(this.f27113d.m1241D("EnclosingMethod")).m92890i(4).m92888k(this.f27125p).m92888k(this.f27126q);
            }
            if ((this.f27114e & 4096) != 0 && (this.f27112c & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 49) {
                o705.m92888k(this.f27113d.m1241D("Synthetic")).m92890i(0);
            }
            if (this.f27127r != 0) {
                i5 = 2;
                o705.m92888k(this.f27113d.m1241D("Signature")).m92890i(2).m92888k(this.f27127r);
            } else {
                i5 = 2;
            }
            if (this.f27128s != 0) {
                o705.m92888k(this.f27113d.m1241D("SourceFile")).m92890i(i5).m92888k(this.f27128s);
            }
            O70 o707 = this.f27129t;
            if (o707 != null) {
                int i11 = o707.f25908b;
                i6 = 0;
                o705.m92888k(this.f27113d.m1241D("SourceDebugExtension")).m92890i(i11).m92891h(this.f27129t.f25907a, 0, i11);
            } else {
                i6 = 0;
            }
            if ((this.f27114e & DateUtils.FORMAT_NUMERIC_DATE) != 0) {
                o705.m92888k(this.f27113d.m1241D("Deprecated")).m92890i(i6);
            }
            C3725If.m101831l(this.f27113d, this.f27130u, this.f27131v, this.f27132w, this.f27133x, o705);
            this.f27113d.m1211d0(o705);
            C49864uV2 c49864uV22 = this.f27134y;
            if (c49864uV22 != null) {
                c49864uV22.m10211k(o705);
            }
            if (this.f27135z != 0) {
                o705.m92888k(this.f27113d.m1241D("NestHost")).m92890i(2).m92888k(this.f27135z);
            }
            if (this.f27105B != null) {
                O70 m92888k2 = o705.m92888k(this.f27113d.m1241D("NestMembers")).m92890i(this.f27105B.f25908b + 2).m92888k(this.f27104A);
                O70 o708 = this.f27105B;
                m92888k2.m92891h(o708.f25907a, 0, o708.f25908b);
            }
            if (this.f27107D != null) {
                O70 m92888k3 = o705.m92888k(this.f27113d.m1241D("PermittedSubclasses")).m92890i(this.f27107D.f25908b + 2).m92888k(this.f27106C);
                O70 o709 = this.f27107D;
                m92888k3.m92891h(o709.f25907a, 0, o709.f25908b);
            }
            if ((this.f27114e & 65536) != 0 || this.f27108E != null) {
                o705.m92888k(this.f27113d.m1241D("Record")).m92890i(i2 + 2).m92888k(i3);
                for (C49498ts4 c49498ts42 = this.f27108E; c49498ts42 != null; c49498ts42 = (C49498ts4) c49498ts42.f109435b) {
                    c49498ts42.m11266g(o705);
                }
            }
            C28821tp c28821tp2 = this.f27110G;
            if (c28821tp2 != null) {
                c28821tp2.m11738g(this.f27113d, o705);
            }
            if (z2) {
                return m91612s(o705.f25907a, z);
            }
            return o705.f25907a;
        }
        throw new ClassTooLargeException(this.f27113d.m1230O(), m1229P);
    }

    public C34970Oj0(C34034Kj0 c34034Kj0, int i) {
        super(589824);
        this.f27113d = c34034Kj0 == null ? new C52849zX5(this) : new C52849zX5(this, c34034Kj0);
        if ((i & 2) != 0) {
            this.f27111H = 4;
        } else if ((i & 1) != 0) {
            this.f27111H = 1;
        } else {
            this.f27111H = 0;
        }
    }
}
