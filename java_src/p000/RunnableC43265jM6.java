package p000;
/* renamed from: jM6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC43265jM6 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ XY5 f92605b;

    /* renamed from: c */
    public final /* synthetic */ VM6 f92606c;

    public RunnableC43265jM6(VM6 vm6, XY5 xy5) {
        this.f92606c = vm6;
        this.f92605b = xy5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC34946Og3 interfaceC34946Og3;
        InterfaceC34946Og3 interfaceC34946Og32;
        obj = this.f92606c.f38907b;
        synchronized (obj) {
            interfaceC34946Og3 = this.f92606c.f38908c;
            if (interfaceC34946Og3 != null) {
                interfaceC34946Og32 = this.f92606c.f38908c;
                interfaceC34946Og32.onFailure(this.f92605b.mo1424d());
            }
        }
    }
}
