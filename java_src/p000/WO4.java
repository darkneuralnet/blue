package p000;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
/* renamed from: WO4 */
/* loaded from: classes6.dex */
public class WO4 extends YO4 {

    /* renamed from: A */
    public Paint.Style f40936A;

    /* renamed from: B */
    public Integer f40937B;

    /* renamed from: C */
    public List<List<VO4>> f40938C;

    /* renamed from: D */
    public Path f40939D;

    /* renamed from: E */
    public Paint f40940E;

    /* renamed from: F */
    public Point f40941F;

    /* renamed from: G */
    public LatLng f40942G;

    /* renamed from: H */
    public boolean f40943H;

    /* renamed from: I */
    public int f40944I;

    /* renamed from: J */
    public int f40945J;

    /* renamed from: K */
    public Path f40946K;

    /* renamed from: L */
    public Paint f40947L;

    /* renamed from: M */
    public LatLng f40948M;

    /* renamed from: N */
    public Point f40949N;

    /* renamed from: z */
    public Shader f40950z;

    public WO4(int i, List<VO4> list, List<List<VO4>> list2, int i2, Paint.Cap cap, Paint.Join join, PathEffect pathEffect, MaskFilter maskFilter, boolean z, Integer num, boolean z2, boolean z3, Shader shader, Shader shader2, Paint.Style style, Integer num2) {
        super(i, list, i2, cap, join, pathEffect, maskFilter, shader, z, num, z2, z3);
        this.f40936A = Paint.Style.FILL_AND_STROKE;
        this.f40937B = -1;
        this.f40938C = new ArrayList();
        this.f40939D = new Path();
        this.f40940E = m78496o();
        this.f40946K = new Path();
        this.f40947L = m78495p();
        this.f40950z = shader2;
        this.f40936A = style;
        this.f40937B = num2;
        this.f40940E.setColor(num2.intValue());
        if (list2 != null) {
            m78499l(list2);
        }
    }

    @Override // p000.ZO4
    /* renamed from: c */
    public void mo73215c(Canvas canvas, U74 u74, int i, int i2, int i3, int i4) {
        Paint.Style style = this.f40936A;
        if (style == Paint.Style.FILL || style == Paint.Style.FILL_AND_STROKE) {
            m78498m(canvas, u74, this.f48472b, i, i2, i3, i4);
            for (List<VO4> list : this.f40938C) {
                m78497n(canvas, u74, list, i, i2, i3, i4);
            }
        }
        Paint.Style style2 = this.f40936A;
        if (style2 == Paint.Style.STROKE || style2 == Paint.Style.FILL_AND_STROKE) {
            for (List<VO4> list2 : this.f40938C) {
                m75123i(canvas, u74, list2, i, i2, i3, i4);
            }
            if (!this.f48481k) {
                m75123i(canvas, u74, this.f48472b, i, i2, i3, i4);
            }
        }
    }

    /* renamed from: k */
    public void m78500k(List<VO4> list) {
        if (list != null) {
            this.f40938C.add(list);
        }
    }

    /* renamed from: l */
    public void m78499l(List<List<VO4>> list) {
        if (list != null) {
            for (List<VO4> list2 : list) {
                m78500k(list2);
            }
        }
    }

    /* renamed from: m */
    public void m78498m(Canvas canvas, U74 u74, List<VO4> list, int i, int i2, int i3, int i4) {
        this.f40939D.reset();
        this.f40943H = true;
        for (VO4 vo4 : list) {
            LatLng m79888c = vo4.m79888c();
            this.f40942G = m79888c;
            if (m79888c != null) {
                Point m81933c = u74.m81933c(m79888c);
                this.f40941F = m81933c;
                int i5 = m81933c.x;
                this.f40944I = i5;
                int i6 = (m81933c.y + (i4 / 2)) - (i2 / 2);
                this.f40945J = i6;
                if (this.f40943H) {
                    this.f40939D.moveTo(i5, i6);
                    this.f40943H = false;
                } else {
                    this.f40939D.lineTo(i5, i6);
                }
            }
        }
        canvas.drawPath(this.f40939D, this.f40940E);
    }

    /* renamed from: n */
    public void m78497n(Canvas canvas, U74 u74, List<VO4> list, int i, int i2, int i3, int i4) {
        this.f40946K.reset();
        this.f40943H = true;
        for (VO4 vo4 : list) {
            LatLng m79888c = vo4.m79888c();
            this.f40948M = m79888c;
            if (m79888c != null) {
                Point m81933c = u74.m81933c(m79888c);
                this.f40949N = m81933c;
                int i5 = m81933c.x;
                this.f40944I = i5;
                int i6 = (m81933c.y + (i4 / 2)) - (i2 / 2);
                this.f40945J = i6;
                if (this.f40943H) {
                    this.f40946K.moveTo(i5, i6);
                    this.f40943H = false;
                } else {
                    this.f40946K.lineTo(i5, i6);
                }
            }
        }
        canvas.drawPath(this.f40946K, this.f40947L);
    }

    /* renamed from: o */
    public final Paint m78496o() {
        BlendMode blendMode;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f40937B.intValue());
        paint.setAntiAlias(this.f48482l);
        if (Build.VERSION.SDK_INT >= 29) {
            blendMode = BlendMode.SRC;
            paint.setBlendMode(blendMode);
        }
        return paint;
    }

    /* renamed from: p */
    public final Paint m78495p() {
        Paint paint = new Paint();
        paint.setAlpha(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setAntiAlias(this.f48482l);
        return paint;
    }
}
