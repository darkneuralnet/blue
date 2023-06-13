package p000;

import android.annotation.SuppressLint;
import android.graphics.PointF;
/* renamed from: VE0 */
/* loaded from: classes2.dex */
public class VE0 {

    /* renamed from: a */
    public final PointF f38765a;

    /* renamed from: b */
    public final PointF f38766b;

    /* renamed from: c */
    public final PointF f38767c;

    public VE0() {
        this.f38765a = new PointF();
        this.f38766b = new PointF();
        this.f38767c = new PointF();
    }

    /* renamed from: a */
    public PointF m80181a() {
        return this.f38765a;
    }

    /* renamed from: b */
    public PointF m80180b() {
        return this.f38766b;
    }

    /* renamed from: c */
    public PointF m80179c() {
        return this.f38767c;
    }

    /* renamed from: d */
    public void m80178d(float f, float f2) {
        this.f38765a.set(f, f2);
    }

    /* renamed from: e */
    public void m80177e(float f, float f2) {
        this.f38766b.set(f, f2);
    }

    /* renamed from: f */
    public void m80176f(float f, float f2) {
        this.f38767c.set(f, f2);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f38767c.x), Float.valueOf(this.f38767c.y), Float.valueOf(this.f38765a.x), Float.valueOf(this.f38765a.y), Float.valueOf(this.f38766b.x), Float.valueOf(this.f38766b.y));
    }

    public VE0(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f38765a = pointF;
        this.f38766b = pointF2;
        this.f38767c = pointF3;
    }
}
