package p000;
@Deprecated
/* renamed from: VA5 */
/* loaded from: classes5.dex */
public abstract class VA5<Z> extends AbstractC28661tE<Z> {

    /* renamed from: c */
    public final int f38707c;

    /* renamed from: d */
    public final int f38708d;

    public VA5() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p000.LY5
    public final void getSize(FB5 fb5) {
        if (C47029pi6.m18906t(this.f38707c, this.f38708d)) {
            fb5.mo26185d(this.f38707c, this.f38708d);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f38707c + " and height: " + this.f38708d + ", either provide dimensions in the constructor or call override()");
    }

    @Override // p000.LY5
    public void removeCallback(FB5 fb5) {
    }

    public VA5(int i, int i2) {
        this.f38707c = i;
        this.f38708d = i2;
    }
}
