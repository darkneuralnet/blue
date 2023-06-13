package p000;
/* renamed from: ix9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43031ix9 implements InterfaceC38260aw9 {

    /* renamed from: a */
    public final /* synthetic */ Class f91773a;

    /* renamed from: b */
    public final /* synthetic */ Zv9 f91774b;

    public C43031ix9(Class cls, Zv9 zv9) {
        this.f91773a = cls;
        this.f91774b = zv9;
    }

    public final String toString() {
        String name = this.f91773a.getName();
        String obj = this.f91774b.toString();
        StringBuilder sb = new StringBuilder(name.length() + 32 + obj.length());
        sb.append("Factory[typeHierarchy=");
        sb.append(name);
        sb.append(",adapter=");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }
}
