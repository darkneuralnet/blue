package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
/* renamed from: jy5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C43630jy5 {

    /* renamed from: a */
    public final C50744vy5[] f93633a = new C50744vy5[4];

    /* renamed from: b */
    public final Matrix[] f93634b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f93635c = new Matrix[4];

    /* renamed from: d */
    public final PointF f93636d = new PointF();

    /* renamed from: e */
    public final Path f93637e = new Path();

    /* renamed from: f */
    public final Path f93638f = new Path();

    /* renamed from: g */
    public final C50744vy5 f93639g = new C50744vy5();

    /* renamed from: h */
    public final float[] f93640h = new float[2];

    /* renamed from: i */
    public final float[] f93641i = new float[2];

    /* renamed from: j */
    public final Path f93642j = new Path();

    /* renamed from: k */
    public final Path f93643k = new Path();

    /* renamed from: l */
    public boolean f93644l = true;

    /* renamed from: jy5$a */
    /* loaded from: classes6.dex */
    public static class C25063a {

        /* renamed from: a */
        public static final C43630jy5 f93645a = new C43630jy5();

        private C25063a() {
        }
    }

    /* renamed from: jy5$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC25064b {
        /* renamed from: a */
        void mo29563a(C50744vy5 c50744vy5, Matrix matrix, int i);

        /* renamed from: b */
        void mo29562b(C50744vy5 c50744vy5, Matrix matrix, int i);
    }

    /* renamed from: jy5$c */
    /* loaded from: classes6.dex */
    public static final class C25065c {

        /* renamed from: a */
        public final C43037iy5 f93646a;

        /* renamed from: b */
        public final Path f93647b;

        /* renamed from: c */
        public final RectF f93648c;

        /* renamed from: d */
        public final InterfaceC25064b f93649d;

        /* renamed from: e */
        public final float f93650e;

        public C25065c(C43037iy5 c43037iy5, float f, RectF rectF, InterfaceC25064b interfaceC25064b, Path path) {
            this.f93649d = interfaceC25064b;
            this.f93646a = c43037iy5;
            this.f93650e = f;
            this.f93648c = rectF;
            this.f93647b = path;
        }
    }

    public C43630jy5() {
        for (int i = 0; i < 4; i++) {
            this.f93633a[i] = new C50744vy5();
            this.f93634b[i] = new Matrix();
            this.f93635c[i] = new Matrix();
        }
    }

    /* renamed from: k */
    public static C43630jy5 m29567k() {
        return C25063a.f93645a;
    }

    /* renamed from: a */
    public final float m29577a(int i) {
        return ((i + 1) % 4) * 90;
    }

    /* renamed from: b */
    public final void m29576b(C25065c c25065c, int i) {
        this.f93640h[0] = this.f93633a[i].m7668k();
        this.f93640h[1] = this.f93633a[i].m7667l();
        this.f93634b[i].mapPoints(this.f93640h);
        if (i == 0) {
            Path path = c25065c.f93647b;
            float[] fArr = this.f93640h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = c25065c.f93647b;
            float[] fArr2 = this.f93640h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f93633a[i].m7675d(this.f93634b[i], c25065c.f93647b);
        InterfaceC25064b interfaceC25064b = c25065c.f93649d;
        if (interfaceC25064b != null) {
            interfaceC25064b.mo29562b(this.f93633a[i], this.f93634b[i], i);
        }
    }

    /* renamed from: c */
    public final void m29575c(C25065c c25065c, int i) {
        int i2 = (i + 1) % 4;
        this.f93640h[0] = this.f93633a[i].m7670i();
        this.f93640h[1] = this.f93633a[i].m7669j();
        this.f93634b[i].mapPoints(this.f93640h);
        this.f93641i[0] = this.f93633a[i2].m7668k();
        this.f93641i[1] = this.f93633a[i2].m7667l();
        this.f93634b[i2].mapPoints(this.f93641i);
        float[] fArr = this.f93640h;
        float f = fArr[0];
        float[] fArr2 = this.f93641i;
        float max = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float m29569i = m29569i(c25065c.f93648c, i);
        this.f93639g.m7665n(0.0f, 0.0f);
        L91 m29568j = m29568j(i, c25065c.f93646a);
        m29568j.mo19121e(max, m29569i, c25065c.f93650e, this.f93639g);
        this.f93642j.reset();
        this.f93639g.m7675d(this.f93635c[i], this.f93642j);
        if (this.f93644l && (m29568j.mo34134d() || m29566l(this.f93642j, i) || m29566l(this.f93642j, i2))) {
            Path path = this.f93642j;
            path.op(path, this.f93638f, Path.Op.DIFFERENCE);
            this.f93640h[0] = this.f93639g.m7668k();
            this.f93640h[1] = this.f93639g.m7667l();
            this.f93635c[i].mapPoints(this.f93640h);
            Path path2 = this.f93637e;
            float[] fArr3 = this.f93640h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f93639g.m7675d(this.f93635c[i], this.f93637e);
        } else {
            this.f93639g.m7675d(this.f93635c[i], c25065c.f93647b);
        }
        InterfaceC25064b interfaceC25064b = c25065c.f93649d;
        if (interfaceC25064b != null) {
            interfaceC25064b.mo29563a(this.f93639g, this.f93635c[i], i);
        }
    }

    /* renamed from: d */
    public void m29574d(C43037iy5 c43037iy5, float f, RectF rectF, InterfaceC25064b interfaceC25064b, Path path) {
        path.rewind();
        this.f93637e.rewind();
        this.f93638f.rewind();
        this.f93638f.addRect(rectF, Path.Direction.CW);
        C25065c c25065c = new C25065c(c43037iy5, f, rectF, interfaceC25064b, path);
        for (int i = 0; i < 4; i++) {
            m29565m(c25065c, i);
            m29564n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m29576b(c25065c, i2);
            m29575c(c25065c, i2);
        }
        path.close();
        this.f93637e.close();
        if (!this.f93637e.isEmpty()) {
            path.op(this.f93637e, Path.Op.UNION);
        }
    }

    /* renamed from: e */
    public void m29573e(C43037iy5 c43037iy5, float f, RectF rectF, Path path) {
        m29574d(c43037iy5, f, rectF, null, path);
    }

    /* renamed from: f */
    public final void m29572f(int i, RectF rectF, PointF pointF) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    pointF.set(rectF.right, rectF.top);
                    return;
                } else {
                    pointF.set(rectF.left, rectF.top);
                    return;
                }
            }
            pointF.set(rectF.left, rectF.bottom);
            return;
        }
        pointF.set(rectF.right, rectF.bottom);
    }

    /* renamed from: g */
    public final NC0 m29571g(int i, C43037iy5 c43037iy5) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return c43037iy5.m31525t();
                }
                return c43037iy5.m31527r();
            }
            return c43037iy5.m31535j();
        }
        return c43037iy5.m31533l();
    }

    /* renamed from: h */
    public final QC0 m29570h(int i, C43037iy5 c43037iy5) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return c43037iy5.m31526s();
                }
                return c43037iy5.m31528q();
            }
            return c43037iy5.m31536i();
        }
        return c43037iy5.m31534k();
    }

    /* renamed from: i */
    public final float m29569i(RectF rectF, int i) {
        float[] fArr = this.f93640h;
        C50744vy5 c50744vy5 = this.f93633a[i];
        fArr[0] = c50744vy5.f115030c;
        fArr[1] = c50744vy5.f115031d;
        this.f93634b[i].mapPoints(fArr);
        if (i != 1 && i != 3) {
            return Math.abs(rectF.centerY() - this.f93640h[1]);
        }
        return Math.abs(rectF.centerX() - this.f93640h[0]);
    }

    /* renamed from: j */
    public final L91 m29568j(int i, C43037iy5 c43037iy5) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return c43037iy5.m31530o();
                }
                return c43037iy5.m31529p();
            }
            return c43037iy5.m31531n();
        }
        return c43037iy5.m31537h();
    }

    /* renamed from: l */
    public final boolean m29566l(Path path, int i) {
        this.f93643k.reset();
        this.f93633a[i].m7675d(this.f93634b[i], this.f93643k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f93643k.computeBounds(rectF, true);
        path.op(this.f93643k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void m29565m(C25065c c25065c, int i) {
        m29570h(i, c25065c.f93646a).m88783c(this.f93633a[i], 90.0f, c25065c.f93650e, c25065c.f93648c, m29571g(i, c25065c.f93646a));
        float m29577a = m29577a(i);
        this.f93634b[i].reset();
        m29572f(i, c25065c.f93648c, this.f93636d);
        Matrix matrix = this.f93634b[i];
        PointF pointF = this.f93636d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f93634b[i].preRotate(m29577a);
    }

    /* renamed from: n */
    public final void m29564n(int i) {
        this.f93640h[0] = this.f93633a[i].m7670i();
        this.f93640h[1] = this.f93633a[i].m7669j();
        this.f93634b[i].mapPoints(this.f93640h);
        float m29577a = m29577a(i);
        this.f93635c[i].reset();
        Matrix matrix = this.f93635c[i];
        float[] fArr = this.f93640h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f93635c[i].preRotate(m29577a);
    }
}
