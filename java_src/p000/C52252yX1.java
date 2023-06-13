package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
/* renamed from: yX1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52252yX1 extends AbstractC27525qB {

    /* renamed from: D */
    public final Paint f119676D;

    /* renamed from: E */
    public final Rect f119677E;

    /* renamed from: F */
    public final Rect f119678F;

    /* renamed from: G */
    public final UD2 f119679G;

    /* renamed from: H */
    public AbstractC26856oB<ColorFilter, ColorFilter> f119680H;

    /* renamed from: I */
    public AbstractC26856oB<Bitmap, Bitmap> f119681I;

    public C52252yX1(RD2 rd2, C41135fm2 c41135fm2) {
        super(rd2, c41135fm2);
        this.f119676D = new C35224Pl2(3);
        this.f119677E = new Rect();
        this.f119678F = new Rect();
        this.f119679G = rd2.m87114O(c41135fm2.m40865m());
    }

    /* renamed from: O */
    public final Bitmap m3376O() {
        Bitmap mo21658h;
        AbstractC26856oB<Bitmap, Bitmap> abstractC26856oB = this.f119681I;
        if (abstractC26856oB != null && (mo21658h = abstractC26856oB.mo21658h()) != null) {
            return mo21658h;
        }
        Bitmap m87128H = this.f104852p.m87128H(this.f104853q.m40865m());
        if (m87128H != null) {
            return m87128H;
        }
        UD2 ud2 = this.f119679G;
        if (ud2 != null) {
            return ud2.m81819a();
        }
        return null;
    }

    @Override // p000.AbstractC27525qB, p000.InterfaceC46680p71
    /* renamed from: a */
    public void mo3375a(RectF rectF, Matrix matrix, boolean z) {
        super.mo3375a(rectF, matrix, z);
        if (this.f119679G != null) {
            float m104867e = C33095Gi6.m104867e();
            rectF.set(0.0f, 0.0f, this.f119679G.m81815e() * m104867e, this.f119679G.m81817c() * m104867e);
            this.f104851o.mapRect(rectF);
        }
    }

    @Override // p000.AbstractC27525qB, p000.InterfaceC32173Ck2
    /* renamed from: h */
    public <T> void mo3374h(T t, C41410gE2<T> c41410gE2) {
        super.mo3374h(t, c41410gE2);
        if (t == InterfaceC37835aE2.f50107K) {
            if (c41410gE2 == null) {
                this.f119680H = null;
            } else {
                this.f119680H = new C32168Cj6(c41410gE2);
            }
        } else if (t == InterfaceC37835aE2.f50110N) {
            if (c41410gE2 == null) {
                this.f119681I = null;
            } else {
                this.f119681I = new C32168Cj6(c41410gE2);
            }
        }
    }

    @Override // p000.AbstractC27525qB
    /* renamed from: t */
    public void mo3373t(Canvas canvas, Matrix matrix, int i) {
        Bitmap m3376O = m3376O();
        if (m3376O != null && !m3376O.isRecycled() && this.f119679G != null) {
            float m104867e = C33095Gi6.m104867e();
            this.f119676D.setAlpha(i);
            AbstractC26856oB<ColorFilter, ColorFilter> abstractC26856oB = this.f119680H;
            if (abstractC26856oB != null) {
                this.f119676D.setColorFilter(abstractC26856oB.mo21658h());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f119677E.set(0, 0, m3376O.getWidth(), m3376O.getHeight());
            if (this.f104852p.m87112P()) {
                this.f119678F.set(0, 0, (int) (this.f119679G.m81815e() * m104867e), (int) (this.f119679G.m81817c() * m104867e));
            } else {
                this.f119678F.set(0, 0, (int) (m3376O.getWidth() * m104867e), (int) (m3376O.getHeight() * m104867e));
            }
            canvas.drawBitmap(m3376O, this.f119677E, this.f119678F, this.f119676D);
            canvas.restore();
        }
    }
}
