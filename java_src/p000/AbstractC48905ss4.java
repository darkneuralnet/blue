package p000;
/* renamed from: ss4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC48905ss4 {

    /* renamed from: a */
    public final int f109434a;

    /* renamed from: b */
    public AbstractC48905ss4 f109435b;

    public AbstractC48905ss4(int i) {
        this(i, null);
    }

    /* renamed from: a */
    public abstract AbstractC3201Hf mo11272a(String str, boolean z);

    /* renamed from: b */
    public abstract void mo11271b(C28821tp c28821tp);

    /* renamed from: c */
    public abstract void mo11270c();

    /* renamed from: d */
    public abstract AbstractC3201Hf mo11269d(int i, C32330Db6 c32330Db6, String str, boolean z);

    public AbstractC48905ss4(int i, AbstractC48905ss4 abstractC48905ss4) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            C36743Vy0.m79040a(this);
        }
        this.f109434a = i;
        this.f109435b = abstractC48905ss4;
    }
}
