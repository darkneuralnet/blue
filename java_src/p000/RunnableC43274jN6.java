package p000;
/* renamed from: jN6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC43274jN6 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ XY5 f92621b;

    /* renamed from: c */
    public final /* synthetic */ C51574xN6 f92622c;

    public RunnableC43274jN6(C51574xN6 c51574xN6, XY5 xy5) {
        this.f92622c = c51574xN6;
        this.f92621b = xy5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC45830nh3 interfaceC45830nh3;
        InterfaceC45830nh3 interfaceC45830nh32;
        obj = this.f92622c.f117537b;
        synchronized (obj) {
            interfaceC45830nh3 = this.f92622c.f117538c;
            if (interfaceC45830nh3 != null) {
                interfaceC45830nh32 = this.f92622c.f117538c;
                interfaceC45830nh32.onSuccess(this.f92621b.mo1423e());
            }
        }
    }
}
