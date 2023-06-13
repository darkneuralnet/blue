package p000;
/* renamed from: g78  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41350g78 implements InterfaceC38595bW7 {

    /* renamed from: a */
    public final /* synthetic */ Class f81649a;

    /* renamed from: b */
    public final /* synthetic */ NV7 f81650b;

    public C41350g78(Class cls, NV7 nv7) {
        this.f81649a = cls;
        this.f81650b = nv7;
    }

    public final String toString() {
        String name = this.f81649a.getName();
        String obj = this.f81650b.toString();
        StringBuilder sb = new StringBuilder(name.length() + 23 + obj.length());
        sb.append("Factory[type=");
        sb.append(name);
        sb.append(",adapter=");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }
}
