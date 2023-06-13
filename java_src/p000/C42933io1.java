package p000;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;
/* renamed from: io1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C42933io1 extends Scroller {

    /* renamed from: a */
    public int f91289a;

    /* renamed from: b */
    public boolean f91290b;

    public C42933io1(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.f91289a = 1000;
        this.f91290b = false;
    }

    /* renamed from: a */
    public void m31855a(int i) {
        this.f91289a = i;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.f91289a);
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.f91289a);
    }
}
