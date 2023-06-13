package p000;
/* renamed from: tV2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC49271tV2 {

    /* renamed from: a */
    public final int f110547a;

    /* renamed from: b */
    public AbstractC49271tV2 f110548b;

    public AbstractC49271tV2(int i) {
        this(i, null);
    }

    /* renamed from: a */
    public abstract void mo10221a();

    /* renamed from: b */
    public abstract void mo10220b(String str, int i, String... strArr);

    /* renamed from: c */
    public abstract void mo10219c(String str);

    /* renamed from: d */
    public abstract void mo10218d(String str, int i, String... strArr);

    /* renamed from: e */
    public abstract void mo10217e(String str);

    /* renamed from: f */
    public abstract void mo10216f(String str, String... strArr);

    /* renamed from: g */
    public abstract void mo10215g(String str, int i, String str2);

    /* renamed from: h */
    public abstract void mo10214h(String str);

    public AbstractC49271tV2(int i, AbstractC49271tV2 abstractC49271tV2) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            C36743Vy0.m79040a(this);
        }
        this.f110547a = i;
        this.f110548b = abstractC49271tV2;
    }
}
