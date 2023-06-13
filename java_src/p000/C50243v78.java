package p000;
/* renamed from: v78  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50243v78 implements InterfaceC38595bW7 {

    /* renamed from: a */
    public final /* synthetic */ Class f113553a;

    /* renamed from: b */
    public final /* synthetic */ Class f113554b;

    /* renamed from: c */
    public final /* synthetic */ NV7 f113555c;

    public C50243v78(Class cls, Class cls2, NV7 nv7) {
        this.f113553a = cls;
        this.f113554b = cls2;
        this.f113555c = nv7;
    }

    public final String toString() {
        String name = this.f113554b.getName();
        String name2 = this.f113553a.getName();
        String obj = this.f113555c.toString();
        StringBuilder sb = new StringBuilder(name.length() + 24 + name2.length() + obj.length());
        sb.append("Factory[type=");
        sb.append(name);
        sb.append("+");
        sb.append(name2);
        sb.append(",adapter=");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }
}
