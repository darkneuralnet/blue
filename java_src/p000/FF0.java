package p000;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
/* renamed from: FF0 */
/* loaded from: classes6.dex */
public class FF0 extends PM2 {

    /* renamed from: A */
    public final RectF f9075A;

    @TargetApi(18)
    /* renamed from: FF0$b */
    /* loaded from: classes6.dex */
    public static class C2213b extends FF0 {
        public C2213b(C43037iy5 c43037iy5) {
            super(c43037iy5);
        }

        @Override // p000.PM2
        /* renamed from: r */
        public void mo90385r(Canvas canvas) {
            if (this.f9075A.isEmpty()) {
                super.mo90385r(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f9075A);
            } else {
                canvas.clipRect(this.f9075A, Region.Op.DIFFERENCE);
            }
            super.mo90385r(canvas);
            canvas.restore();
        }
    }

    /* renamed from: p0 */
    public static FF0 m107387p0(C43037iy5 c43037iy5) {
        return new C2213b(c43037iy5);
    }

    /* renamed from: q0 */
    public boolean m107386q0() {
        return !this.f9075A.isEmpty();
    }

    /* renamed from: r0 */
    public void m107385r0() {
        m107384s0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: s0 */
    public void m107384s0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f9075A;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* renamed from: t0 */
    public void m107383t0(RectF rectF) {
        m107384s0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public FF0(C43037iy5 c43037iy5) {
        super(c43037iy5 == null ? new C43037iy5() : c43037iy5);
        this.f9075A = new RectF();
    }
}
