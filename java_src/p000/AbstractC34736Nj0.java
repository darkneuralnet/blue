package p000;
/* renamed from: Nj0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34736Nj0 {

    /* renamed from: a */
    public final int f25024a;

    /* renamed from: b */
    public AbstractC34736Nj0 f25025b;

    public AbstractC34736Nj0(int i) {
        this(i, null);
    }

    /* renamed from: a */
    public abstract void mo91630a(int i, int i2, String str, String str2, String str3, String[] strArr);

    /* renamed from: b */
    public abstract AbstractC3201Hf mo91629b(String str, boolean z);

    /* renamed from: c */
    public abstract void mo91628c(C28821tp c28821tp);

    /* renamed from: d */
    public abstract void mo91627d();

    /* renamed from: e */
    public abstract AbstractC38735bl1 mo91626e(int i, String str, String str2, String str3, Object obj);

    /* renamed from: f */
    public abstract void mo91625f(String str, String str2, String str3, int i);

    /* renamed from: g */
    public abstract YT2 mo91624g(int i, String str, String str2, String str3, String[] strArr);

    /* renamed from: h */
    public abstract AbstractC49271tV2 mo91623h(String str, int i, String str2);

    /* renamed from: i */
    public abstract void mo91622i(String str);

    /* renamed from: j */
    public abstract void mo91621j(String str);

    /* renamed from: k */
    public abstract void mo91620k(String str, String str2, String str3);

    /* renamed from: l */
    public abstract void mo91619l(String str);

    /* renamed from: m */
    public abstract AbstractC48905ss4 mo91618m(String str, String str2, String str3);

    /* renamed from: n */
    public abstract void mo91617n(String str, String str2);

    /* renamed from: o */
    public abstract AbstractC3201Hf mo91616o(int i, C32330Db6 c32330Db6, String str, boolean z);

    public AbstractC34736Nj0(int i, AbstractC34736Nj0 abstractC34736Nj0) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            C36743Vy0.m79040a(this);
        }
        this.f25024a = i;
        this.f25025b = abstractC34736Nj0;
    }
}
