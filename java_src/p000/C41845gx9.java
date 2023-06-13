package p000;
/* renamed from: gx9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41845gx9 implements InterfaceC38260aw9 {

    /* renamed from: a */
    public final /* synthetic */ Class f84544a;

    /* renamed from: b */
    public final /* synthetic */ Class f84545b;

    /* renamed from: c */
    public final /* synthetic */ Zv9 f84546c;

    public C41845gx9(Class cls, Class cls2, Zv9 zv9) {
        this.f84544a = cls;
        this.f84545b = cls2;
        this.f84546c = zv9;
    }

    public final String toString() {
        String name = this.f84545b.getName();
        String name2 = this.f84544a.getName();
        String obj = this.f84546c.toString();
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
