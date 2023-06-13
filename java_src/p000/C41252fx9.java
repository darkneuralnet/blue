package p000;
/* renamed from: fx9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41252fx9 implements InterfaceC38260aw9 {

    /* renamed from: a */
    public final /* synthetic */ Class f81211a;

    /* renamed from: b */
    public final /* synthetic */ Zv9 f81212b;

    public C41252fx9(Class cls, Zv9 zv9) {
        this.f81211a = cls;
        this.f81212b = zv9;
    }

    public final String toString() {
        String name = this.f81211a.getName();
        String obj = this.f81212b.toString();
        StringBuilder sb = new StringBuilder(name.length() + 23 + obj.length());
        sb.append("Factory[type=");
        sb.append(name);
        sb.append(",adapter=");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }
}
