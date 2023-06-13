package p000;
/* renamed from: J78 */
/* loaded from: classes5.dex */
public final class J78 implements InterfaceC38595bW7 {

    /* renamed from: a */
    public final /* synthetic */ Class f16877a;

    /* renamed from: b */
    public final /* synthetic */ Class f16878b;

    /* renamed from: c */
    public final /* synthetic */ NV7 f16879c;

    public J78(Class cls, Class cls2, NV7 nv7) {
        this.f16877a = cls;
        this.f16878b = cls2;
        this.f16879c = nv7;
    }

    public final String toString() {
        String name = this.f16877a.getName();
        String name2 = this.f16878b.getName();
        String obj = this.f16879c.toString();
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
