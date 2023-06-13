package p000;
/* renamed from: YT2 */
/* loaded from: classes6.dex */
public abstract class YT2 {

    /* renamed from: a */
    public final int f45909a;

    /* renamed from: b */
    public YT2 f45910b;

    public YT2(int i) {
        this(i, null);
    }

    /* renamed from: A */
    public abstract AbstractC3201Hf mo73071A(int i, C32330Db6 c32330Db6, String str, boolean z);

    /* renamed from: B */
    public abstract void mo73070B(C36160Tl2 c36160Tl2, C36160Tl2 c36160Tl22, C36160Tl2 c36160Tl23, String str);

    /* renamed from: C */
    public abstract AbstractC3201Hf mo73069C(int i, C32330Db6 c32330Db6, String str, boolean z);

    /* renamed from: D */
    public abstract void mo73068D(int i, String str);

    /* renamed from: E */
    public abstract void mo73067E(int i, int i2);

    /* renamed from: a */
    public abstract void mo73048a(int i, boolean z);

    /* renamed from: b */
    public abstract AbstractC3201Hf mo73047b(String str, boolean z);

    /* renamed from: c */
    public abstract AbstractC3201Hf mo73046c();

    /* renamed from: d */
    public abstract void mo73045d(C28821tp c28821tp);

    /* renamed from: e */
    public abstract void mo73044e();

    /* renamed from: f */
    public abstract void mo73043f();

    /* renamed from: g */
    public abstract void mo73042g(int i, String str, String str2, String str3);

    /* renamed from: h */
    public abstract void mo73041h(int i, int i2, Object[] objArr, int i3, Object[] objArr2);

    /* renamed from: i */
    public abstract void mo73040i(int i, int i2);

    /* renamed from: j */
    public abstract void mo73039j(int i);

    /* renamed from: k */
    public abstract AbstractC3201Hf mo73038k(int i, C32330Db6 c32330Db6, String str, boolean z);

    /* renamed from: l */
    public abstract void mo73037l(int i, int i2);

    /* renamed from: m */
    public abstract void mo73036m(String str, String str2, GE1 ge1, Object... objArr);

    /* renamed from: n */
    public abstract void mo73035n(int i, C36160Tl2 c36160Tl2);

    /* renamed from: o */
    public abstract void mo73034o(C36160Tl2 c36160Tl2);

    /* renamed from: p */
    public abstract void mo73033p(Object obj);

    /* renamed from: q */
    public abstract void mo73032q(int i, C36160Tl2 c36160Tl2);

    /* renamed from: r */
    public abstract void mo73031r(String str, String str2, String str3, C36160Tl2 c36160Tl2, C36160Tl2 c36160Tl22, int i);

    /* renamed from: s */
    public abstract AbstractC3201Hf mo73030s(int i, C32330Db6 c32330Db6, C36160Tl2[] c36160Tl2Arr, C36160Tl2[] c36160Tl2Arr2, int[] iArr, String str, boolean z);

    /* renamed from: t */
    public abstract void mo73029t(C36160Tl2 c36160Tl2, int[] iArr, C36160Tl2[] c36160Tl2Arr);

    /* renamed from: u */
    public abstract void mo73028u(int i, int i2);

    /* renamed from: v */
    public abstract void mo73027v(int i, String str, String str2, String str3, boolean z);

    /* renamed from: w */
    public abstract void mo73026w(String str, int i);

    /* renamed from: x */
    public abstract void mo73025x(String str, int i);

    /* renamed from: y */
    public abstract AbstractC3201Hf mo73024y(int i, String str, boolean z);

    /* renamed from: z */
    public abstract void mo73023z(int i, int i2, C36160Tl2 c36160Tl2, C36160Tl2... c36160Tl2Arr);

    public YT2(int i, YT2 yt2) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            C36743Vy0.m79040a(this);
        }
        this.f45909a = i;
        this.f45910b = yt2;
    }
}
