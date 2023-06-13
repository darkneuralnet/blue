package p000;
/* renamed from: Hf */
/* loaded from: classes6.dex */
public abstract class AbstractC3201Hf {

    /* renamed from: a */
    public final int f13717a;

    /* renamed from: b */
    public AbstractC3201Hf f13718b;

    public AbstractC3201Hf(int i) {
        this(i, null);
    }

    /* renamed from: a */
    public abstract void mo101842a(String str, Object obj);

    /* renamed from: b */
    public abstract AbstractC3201Hf mo101841b(String str, String str2);

    /* renamed from: c */
    public abstract AbstractC3201Hf mo101840c(String str);

    /* renamed from: d */
    public abstract void mo101839d();

    /* renamed from: e */
    public abstract void mo101838e(String str, String str2, String str3);

    public AbstractC3201Hf(int i, AbstractC3201Hf abstractC3201Hf) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i);
        }
        if (i == 17432576) {
            C36743Vy0.m79040a(this);
        }
        this.f13717a = i;
        this.f13718b = abstractC3201Hf;
    }
}
