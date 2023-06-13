package p000;

import android.graphics.Canvas;
import android.graphics.Path;
/* renamed from: zr2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC53043zr2 extends AbstractC0361Ax {

    /* renamed from: h */
    public Path f122388h;

    public AbstractC53043zr2(C42279hi0 c42279hi0, C32951Fs6 c32951Fs6) {
        super(c42279hi0, c32951Fs6);
        this.f122388h = new Path();
    }

    /* renamed from: j */
    public void m222j(Canvas canvas, float f, float f2, OO1 oo1) {
        this.f32037d.setColor(oo1.mo90K0());
        this.f32037d.setStrokeWidth(oo1.mo2387r0());
        this.f32037d.setPathEffect(oo1.mo2389E0());
        if (oo1.mo2386v()) {
            this.f122388h.reset();
            this.f122388h.moveTo(f, this.f106125a.m106377j());
            this.f122388h.lineTo(f, this.f106125a.m106381f());
            canvas.drawPath(this.f122388h, this.f32037d);
        }
        if (oo1.mo2388O0()) {
            this.f122388h.reset();
            this.f122388h.moveTo(this.f106125a.m106379h(), f2);
            this.f122388h.lineTo(this.f106125a.m106378i(), f2);
            canvas.drawPath(this.f122388h, this.f32037d);
        }
    }
}
