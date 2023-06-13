package p000;
/* renamed from: a88  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37785a88 implements InterfaceC38595bW7 {

    /* renamed from: a */
    public final /* synthetic */ Class f49896a;

    /* renamed from: b */
    public final /* synthetic */ NV7 f49897b;

    public C37785a88(Class cls, NV7 nv7) {
        this.f49896a = cls;
        this.f49897b = nv7;
    }

    public final String toString() {
        String name = this.f49896a.getName();
        String obj = this.f49897b.toString();
        StringBuilder sb = new StringBuilder(name.length() + 32 + obj.length());
        sb.append("Factory[typeHierarchy=");
        sb.append(name);
        sb.append(",adapter=");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }
}
