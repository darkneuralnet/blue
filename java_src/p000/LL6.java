package p000;
/* renamed from: LL6 */
/* loaded from: classes6.dex */
public final class LL6 extends FL6 {

    /* renamed from: a */
    public final JL6 f21298a = new JL6();

    @Override // p000.FL6
    /* renamed from: a */
    public final void mo90446a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.f21298a.m100658a(th).add(th2);
    }
}
