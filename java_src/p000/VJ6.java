package p000;
/* renamed from: VJ6 */
/* loaded from: classes6.dex */
public final class VJ6 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ XY5 f38869b;

    /* renamed from: c */
    public final /* synthetic */ YK6 f38870c;

    public VJ6(YK6 yk6, XY5 xy5) {
        this.f38870c = yk6;
        this.f38869b = xy5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC44031kf3 interfaceC44031kf3;
        InterfaceC44031kf3 interfaceC44031kf32;
        obj = this.f38870c.f45002b;
        synchronized (obj) {
            interfaceC44031kf3 = this.f38870c.f45003c;
            if (interfaceC44031kf3 != null) {
                interfaceC44031kf32 = this.f38870c.f45003c;
                interfaceC44031kf32.mo17508a(this.f38869b);
            }
        }
    }
}
