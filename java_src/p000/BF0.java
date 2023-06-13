package p000;

import android.graphics.drawable.Drawable;
/* renamed from: BF0 */
/* loaded from: classes5.dex */
public abstract class BF0<T> implements LY5<T> {

    /* renamed from: b */
    public final int f2125b;

    /* renamed from: c */
    public final int f2126c;

    /* renamed from: d */
    public InterfaceC45599nI4 f2127d;

    public BF0() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p000.LY5
    public final InterfaceC45599nI4 getRequest() {
        return this.f2127d;
    }

    @Override // p000.LY5
    public final void getSize(FB5 fb5) {
        fb5.mo26185d(this.f2125b, this.f2126c);
    }

    @Override // p000.InterfaceC32227Cq2
    public void onDestroy() {
    }

    @Override // p000.LY5
    public void onLoadFailed(Drawable drawable) {
    }

    @Override // p000.LY5
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // p000.InterfaceC32227Cq2
    public void onStart() {
    }

    @Override // p000.InterfaceC32227Cq2
    public void onStop() {
    }

    @Override // p000.LY5
    public final void removeCallback(FB5 fb5) {
    }

    @Override // p000.LY5
    public final void setRequest(InterfaceC45599nI4 interfaceC45599nI4) {
        this.f2127d = interfaceC45599nI4;
    }

    public BF0(int i, int i2) {
        if (C47029pi6.m18906t(i, i2)) {
            this.f2125b = i;
            this.f2126c = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }
}
