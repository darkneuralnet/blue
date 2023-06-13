package p000;
/* renamed from: bl1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC38735bl1 {

    /* renamed from: a */
    public final int f58034a;

    /* renamed from: b */
    public AbstractC38735bl1 f58035b;

    public AbstractC38735bl1(int i) {
        this(i, null);
    }

    /* renamed from: a */
    public abstract AbstractC3201Hf mo60938a(String str, boolean z);

    /* renamed from: b */
    public abstract void mo60937b(C28821tp c28821tp);

    /* renamed from: c */
    public abstract void mo60936c();

    /* renamed from: d */
    public abstract AbstractC3201Hf mo60935d(int i, C32330Db6 c32330Db6, String str, boolean z);

    public AbstractC38735bl1(int i, AbstractC38735bl1 abstractC38735bl1) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            C36743Vy0.m79040a(this);
        }
        this.f58034a = i;
        this.f58035b = abstractC38735bl1;
    }
}
