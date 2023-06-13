package p000;
/* renamed from: TX5 */
/* loaded from: classes6.dex */
public class TX5 implements InterfaceC37553Zk0 {

    /* renamed from: a */
    public static TX5 f35640a;

    private TX5() {
    }

    /* renamed from: a */
    public static TX5 m83426a() {
        if (f35640a == null) {
            f35640a = new TX5();
        }
        return f35640a;
    }

    @Override // p000.InterfaceC37553Zk0
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
