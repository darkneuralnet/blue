package p000;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Point;
import android.graphics.Shader;
import android.os.Build;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
/* renamed from: YO4 */
/* loaded from: classes6.dex */
public class YO4 extends ZO4 {

    /* renamed from: o */
    public Paint f45817o;

    /* renamed from: p */
    public LatLng f45818p;

    /* renamed from: q */
    public VO4 f45819q;

    /* renamed from: r */
    public VO4 f45820r;

    /* renamed from: s */
    public boolean f45821s;

    /* renamed from: t */
    public Point f45822t;

    /* renamed from: u */
    public Point f45823u;

    /* renamed from: v */
    public int f45824v;

    /* renamed from: w */
    public int f45825w;

    /* renamed from: x */
    public int f45826x;

    /* renamed from: y */
    public int f45827y;

    public YO4(int i, List<VO4> list, int i2, Paint.Cap cap, Paint.Join join, PathEffect pathEffect, MaskFilter maskFilter, Shader shader, boolean z, Integer num, boolean z2, boolean z3) {
        super(i, list, i2, cap, join, pathEffect, maskFilter, shader, z, num, z2, z3);
        this.f45817o = m75122j();
    }

    /* renamed from: h */
    public final void m75124h(Canvas canvas, Paint paint, U74 u74, VO4 vo4, VO4 vo42, int i, int i2, int i3, int i4) {
        this.f45822t = u74.m81933c(vo42.m79888c());
        Point m81933c = u74.m81933c(vo4.m79888c());
        this.f45823u = m81933c;
        int i5 = i3 / 2;
        int i6 = i / 2;
        int i7 = (m81933c.x + i5) - i6;
        this.f45824v = i7;
        int i8 = i4 / 2;
        int i9 = i2 / 2;
        int i10 = (m81933c.y + i8) - i9;
        this.f45825w = i10;
        Point point = this.f45822t;
        int i11 = (point.x + i5) - i6;
        this.f45826x = i11;
        int i12 = (point.y + i8) - i9;
        this.f45827y = i12;
        canvas.drawLine(i7, i10, i11, i12, paint);
    }

    /* renamed from: i */
    public void m75123i(Canvas canvas, U74 u74, List<VO4> list, int i, int i2, int i3, int i4) {
        VO4 vo4;
        VO4 vo42;
        this.f45819q = null;
        this.f45821s = true;
        this.f45820r = null;
        for (VO4 vo43 : list) {
            LatLng m79888c = vo43.m79888c();
            this.f45818p = m79888c;
            if (m79888c != null) {
                if (this.f45821s) {
                    this.f45819q = vo43;
                    this.f45821s = false;
                }
                VO4 vo44 = this.f45820r;
                if (vo44 != null) {
                    m75124h(canvas, this.f45817o, u74, vo44, vo43, i, i2, i3, i4);
                }
                this.f45820r = vo43;
            }
        }
        if (this.f48483m && (vo4 = this.f45819q) != null && (vo42 = this.f45820r) != null) {
            m75124h(canvas, this.f45817o, u74, vo42, vo4, i, i2, i3, i4);
        }
    }

    /* renamed from: j */
    public Paint m75122j() {
        BlendMode blendMode;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.f48480j.intValue());
        paint.setStrokeWidth(this.f48473c);
        paint.setAntiAlias(this.f48482l);
        paint.setStrokeCap(this.f48474d);
        paint.setStrokeJoin(this.f48475e);
        paint.setPathEffect(this.f48476f);
        paint.setMaskFilter(this.f48477g);
        if (Build.VERSION.SDK_INT >= 29) {
            blendMode = BlendMode.SRC;
            paint.setBlendMode(blendMode);
        }
        return paint;
    }
}
