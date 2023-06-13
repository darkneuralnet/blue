package p000;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
/* renamed from: ar2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C38203ar2 extends AbstractC34817Ns0 {

    /* renamed from: g */
    public float f56417g;

    /* renamed from: h */
    public float f56418h = 2.0f;

    /* renamed from: i */
    public int f56419i = Color.rgb(237, 91, 91);

    /* renamed from: j */
    public Paint.Style f56420j = Paint.Style.FILL_AND_STROKE;

    /* renamed from: k */
    public String f56421k = "";

    /* renamed from: l */
    public DashPathEffect f56422l = null;

    /* renamed from: m */
    public EnumC12183a f56423m = EnumC12183a.RIGHT_TOP;

    /* renamed from: ar2$a */
    /* loaded from: classes5.dex */
    public enum EnumC12183a {
        LEFT_TOP,
        LEFT_BOTTOM,
        RIGHT_TOP,
        RIGHT_BOTTOM
    }

    public C38203ar2(float f) {
        this.f56417g = 0.0f;
        this.f56417g = f;
    }

    /* renamed from: i */
    public void m65389i(float f, float f2, float f3) {
        this.f56422l = new DashPathEffect(new float[]{f, f2}, f3);
    }

    /* renamed from: j */
    public DashPathEffect m65388j() {
        return this.f56422l;
    }

    /* renamed from: k */
    public String m65387k() {
        return this.f56421k;
    }

    /* renamed from: l */
    public EnumC12183a m65386l() {
        return this.f56423m;
    }

    /* renamed from: m */
    public float m65385m() {
        return this.f56417g;
    }

    /* renamed from: n */
    public int m65384n() {
        return this.f56419i;
    }

    /* renamed from: o */
    public float m65383o() {
        return this.f56418h;
    }

    /* renamed from: p */
    public Paint.Style m65382p() {
        return this.f56420j;
    }

    /* renamed from: q */
    public void m65381q(int i) {
        this.f56419i = i;
    }
}
