package p000;
/* renamed from: Tz5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC36289Tz5 {

    /* renamed from: a */
    public boolean f36586a = false;

    /* renamed from: a */
    public void m82200a(WB1 wb1) {
        for (int i = 0; i < wb1.mo77232f0() && !this.f36586a; i++) {
            WB1 mo77236d0 = wb1.mo77236d0(i);
            if (!(mo77236d0 instanceof XB1)) {
                mo11957c(mo77236d0);
                if (mo11958b()) {
                    this.f36586a = true;
                    return;
                }
            } else {
                m82200a(mo77236d0);
            }
        }
    }

    /* renamed from: b */
    public abstract boolean mo11958b();

    /* renamed from: c */
    public abstract void mo11957c(WB1 wb1);
}
