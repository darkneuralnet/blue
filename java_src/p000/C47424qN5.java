package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
/* renamed from: qN5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47424qN5 extends AbstractC27525qB {

    /* renamed from: D */
    public final RectF f105218D;

    /* renamed from: E */
    public final Paint f105219E;

    /* renamed from: F */
    public final float[] f105220F;

    /* renamed from: G */
    public final Path f105221G;

    /* renamed from: H */
    public final C41135fm2 f105222H;

    /* renamed from: I */
    public AbstractC26856oB<ColorFilter, ColorFilter> f105223I;

    public C47424qN5(RD2 rd2, C41135fm2 c41135fm2) {
        super(rd2, c41135fm2);
        this.f105218D = new RectF();
        C35224Pl2 c35224Pl2 = new C35224Pl2();
        this.f105219E = c35224Pl2;
        this.f105220F = new float[8];
        this.f105221G = new Path();
        this.f105222H = c41135fm2;
        c35224Pl2.setAlpha(0);
        c35224Pl2.setStyle(Paint.Style.FILL);
        c35224Pl2.setColor(c41135fm2.m40863o());
    }

    @Override // p000.AbstractC27525qB, p000.InterfaceC46680p71
    /* renamed from: a */
    public void mo3375a(RectF rectF, Matrix matrix, boolean z) {
        super.mo3375a(rectF, matrix, z);
        this.f105218D.set(0.0f, 0.0f, this.f105222H.m40861q(), this.f105222H.m40862p());
        this.f104851o.mapRect(this.f105218D);
        rectF.set(this.f105218D);
    }

    @Override // p000.AbstractC27525qB, p000.InterfaceC32173Ck2
    /* renamed from: h */
    public <T> void mo3374h(T t, C41410gE2<T> c41410gE2) {
        super.mo3374h(t, c41410gE2);
        if (t == InterfaceC37835aE2.f50107K) {
            if (c41410gE2 == null) {
                this.f105223I = null;
            } else {
                this.f105223I = new C32168Cj6(c41410gE2);
            }
        }
    }

    @Override // p000.AbstractC27525qB
    /* renamed from: t */
    public void mo3373t(Canvas canvas, Matrix matrix, int i) {
        int intValue;
        int alpha = Color.alpha(this.f105222H.m40863o());
        if (alpha == 0) {
            return;
        }
        if (this.f104860x.m26230h() == null) {
            intValue = 100;
        } else {
            intValue = this.f104860x.m26230h().mo21658h().intValue();
        }
        int i2 = (int) ((i / 255.0f) * (((alpha / 255.0f) * intValue) / 100.0f) * 255.0f);
        this.f105219E.setAlpha(i2);
        AbstractC26856oB<ColorFilter, ColorFilter> abstractC26856oB = this.f105223I;
        if (abstractC26856oB != null) {
            this.f105219E.setColorFilter(abstractC26856oB.mo21658h());
        }
        if (i2 > 0) {
            float[] fArr = this.f105220F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f105222H.m40861q();
            float[] fArr2 = this.f105220F;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f105222H.m40861q();
            this.f105220F[5] = this.f105222H.m40862p();
            float[] fArr3 = this.f105220F;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f105222H.m40862p();
            matrix.mapPoints(this.f105220F);
            this.f105221G.reset();
            Path path = this.f105221G;
            float[] fArr4 = this.f105220F;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f105221G;
            float[] fArr5 = this.f105220F;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f105221G;
            float[] fArr6 = this.f105220F;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f105221G;
            float[] fArr7 = this.f105220F;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f105221G;
            float[] fArr8 = this.f105220F;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f105221G.close();
            canvas.drawPath(this.f105221G, this.f105219E);
        }
    }
}
