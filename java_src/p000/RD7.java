package p000;
/* renamed from: RD7 */
/* loaded from: classes5.dex */
public final class RD7 implements InterfaceC38424bD7 {

    /* renamed from: a */
    public volatile InterfaceC38424bD7 f31751a;

    public RD7(InterfaceC38424bD7 interfaceC38424bD7) {
        this.f31751a = interfaceC38424bD7;
    }

    public final String toString() {
        Object obj = this.f31751a;
        if (obj == null) {
            obj = "<supplier that returned null>";
        }
        String obj2 = obj.toString();
        StringBuilder sb = new StringBuilder(obj2.length() + 19);
        sb.append("Suppliers.memoize(");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }
}
