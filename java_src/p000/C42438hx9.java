package p000;
/* renamed from: hx9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42438hx9 implements InterfaceC38260aw9 {

    /* renamed from: a */
    public final /* synthetic */ Class f86231a;

    /* renamed from: b */
    public final /* synthetic */ Class f86232b;

    /* renamed from: c */
    public final /* synthetic */ Zv9 f86233c;

    public C42438hx9(Class cls, Class cls2, Zv9 zv9) {
        this.f86231a = cls;
        this.f86232b = cls2;
        this.f86233c = zv9;
    }

    public final String toString() {
        String name = this.f86231a.getName();
        String name2 = this.f86232b.getName();
        String obj = this.f86233c.toString();
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
