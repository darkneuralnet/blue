package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
/* renamed from: vy5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C50744vy5 {
    @Deprecated

    /* renamed from: a */
    public float f115028a;
    @Deprecated

    /* renamed from: b */
    public float f115029b;
    @Deprecated

    /* renamed from: c */
    public float f115030c;
    @Deprecated

    /* renamed from: d */
    public float f115031d;
    @Deprecated

    /* renamed from: e */
    public float f115032e;
    @Deprecated

    /* renamed from: f */
    public float f115033f;

    /* renamed from: g */
    public final List<AbstractC29717f> f115034g = new ArrayList();

    /* renamed from: h */
    public final List<AbstractC29718g> f115035h = new ArrayList();

    /* renamed from: i */
    public boolean f115036i;

    /* renamed from: vy5$a */
    /* loaded from: classes6.dex */
    public class C29712a extends AbstractC29718g {

        /* renamed from: c */
        public final /* synthetic */ List f115037c;

        /* renamed from: d */
        public final /* synthetic */ Matrix f115038d;

        public C29712a(List list, Matrix matrix) {
            this.f115037c = list;
            this.f115038d = matrix;
        }

        @Override // p000.C50744vy5.AbstractC29718g
        /* renamed from: b */
        public void mo7630b(Matrix matrix, C36037Sx5 c36037Sx5, int i, Canvas canvas) {
            for (AbstractC29718g abstractC29718g : this.f115037c) {
                abstractC29718g.mo7630b(this.f115038d, c36037Sx5, i, canvas);
            }
        }
    }

    /* renamed from: vy5$b */
    /* loaded from: classes6.dex */
    public static class C29713b extends AbstractC29718g {

        /* renamed from: c */
        public final C29715d f115040c;

        public C29713b(C29715d c29715d) {
            this.f115040c = c29715d;
        }

        @Override // p000.C50744vy5.AbstractC29718g
        /* renamed from: b */
        public void mo7630b(Matrix matrix, C36037Sx5 c36037Sx5, int i, Canvas canvas) {
            c36037Sx5.m84573a(canvas, matrix, new RectF(this.f115040c.m7647k(), this.f115040c.m7643o(), this.f115040c.m7646l(), this.f115040c.m7648j()), i, this.f115040c.m7645m(), this.f115040c.m7644n());
        }
    }

    /* renamed from: vy5$c */
    /* loaded from: classes6.dex */
    public static class C29714c extends AbstractC29718g {

        /* renamed from: c */
        public final C29716e f115041c;

        /* renamed from: d */
        public final float f115042d;

        /* renamed from: e */
        public final float f115043e;

        public C29714c(C29716e c29716e, float f, float f2) {
            this.f115041c = c29716e;
            this.f115042d = f;
            this.f115043e = f2;
        }

        @Override // p000.C50744vy5.AbstractC29718g
        /* renamed from: b */
        public void mo7630b(Matrix matrix, C36037Sx5 c36037Sx5, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f115041c.f115052c - this.f115043e, this.f115041c.f115051b - this.f115042d), 0.0f);
            this.f115055a.set(matrix);
            this.f115055a.preTranslate(this.f115042d, this.f115043e);
            this.f115055a.preRotate(m7657c());
            c36037Sx5.m84572b(canvas, this.f115055a, rectF, i);
        }

        /* renamed from: c */
        public float m7657c() {
            return (float) Math.toDegrees(Math.atan((this.f115041c.f115052c - this.f115043e) / (this.f115041c.f115051b - this.f115042d)));
        }
    }

    /* renamed from: vy5$d */
    /* loaded from: classes6.dex */
    public static class C29715d extends AbstractC29717f {

        /* renamed from: h */
        public static final RectF f115044h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f115045b;
        @Deprecated

        /* renamed from: c */
        public float f115046c;
        @Deprecated

        /* renamed from: d */
        public float f115047d;
        @Deprecated

        /* renamed from: e */
        public float f115048e;
        @Deprecated

        /* renamed from: f */
        public float f115049f;
        @Deprecated

        /* renamed from: g */
        public float f115050g;

        public C29715d(float f, float f2, float f3, float f4) {
            m7641q(f);
            m7637u(f2);
            m7640r(f3);
            m7642p(f4);
        }

        @Override // p000.C50744vy5.AbstractC29717f
        /* renamed from: a */
        public void mo7632a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f115053a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f115044h;
            rectF.set(m7647k(), m7643o(), m7646l(), m7648j());
            path.arcTo(rectF, m7645m(), m7644n(), false);
            path.transform(matrix);
        }

        /* renamed from: j */
        public final float m7648j() {
            return this.f115048e;
        }

        /* renamed from: k */
        public final float m7647k() {
            return this.f115045b;
        }

        /* renamed from: l */
        public final float m7646l() {
            return this.f115047d;
        }

        /* renamed from: m */
        public final float m7645m() {
            return this.f115049f;
        }

        /* renamed from: n */
        public final float m7644n() {
            return this.f115050g;
        }

        /* renamed from: o */
        public final float m7643o() {
            return this.f115046c;
        }

        /* renamed from: p */
        public final void m7642p(float f) {
            this.f115048e = f;
        }

        /* renamed from: q */
        public final void m7641q(float f) {
            this.f115045b = f;
        }

        /* renamed from: r */
        public final void m7640r(float f) {
            this.f115047d = f;
        }

        /* renamed from: s */
        public final void m7639s(float f) {
            this.f115049f = f;
        }

        /* renamed from: t */
        public final void m7638t(float f) {
            this.f115050g = f;
        }

        /* renamed from: u */
        public final void m7637u(float f) {
            this.f115046c = f;
        }
    }

    /* renamed from: vy5$e */
    /* loaded from: classes6.dex */
    public static class C29716e extends AbstractC29717f {

        /* renamed from: b */
        public float f115051b;

        /* renamed from: c */
        public float f115052c;

        @Override // p000.C50744vy5.AbstractC29717f
        /* renamed from: a */
        public void mo7632a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f115053a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f115051b, this.f115052c);
            path.transform(matrix);
        }
    }

    /* renamed from: vy5$f */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC29717f {

        /* renamed from: a */
        public final Matrix f115053a = new Matrix();

        /* renamed from: a */
        public abstract void mo7632a(Matrix matrix, Path path);
    }

    /* renamed from: vy5$g */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC29718g {

        /* renamed from: b */
        public static final Matrix f115054b = new Matrix();

        /* renamed from: a */
        public final Matrix f115055a = new Matrix();

        /* renamed from: a */
        public final void m7631a(C36037Sx5 c36037Sx5, int i, Canvas canvas) {
            mo7630b(f115054b, c36037Sx5, i, canvas);
        }

        /* renamed from: b */
        public abstract void mo7630b(Matrix matrix, C36037Sx5 c36037Sx5, int i, Canvas canvas);
    }

    public C50744vy5() {
        m7665n(0.0f, 0.0f);
    }

    /* renamed from: a */
    public void m7678a(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        float f7;
        C29715d c29715d = new C29715d(f, f2, f3, f4);
        c29715d.m7639s(f5);
        c29715d.m7638t(f6);
        this.f115034g.add(c29715d);
        C29713b c29713b = new C29713b(c29715d);
        float f8 = f5 + f6;
        if (f6 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        if (z) {
            f7 = (180.0f + f8) % 360.0f;
        } else {
            f7 = f8;
        }
        m7676c(c29713b, f5, f7);
        double d = f8;
        m7661r(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m7660s(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: b */
    public final void m7677b(float f) {
        if (m7672g() == f) {
            return;
        }
        float m7672g = ((f - m7672g()) + 360.0f) % 360.0f;
        if (m7672g > 180.0f) {
            return;
        }
        C29715d c29715d = new C29715d(m7670i(), m7669j(), m7670i(), m7669j());
        c29715d.m7639s(m7672g());
        c29715d.m7638t(m7672g);
        this.f115035h.add(new C29713b(c29715d));
        m7663p(f);
    }

    /* renamed from: c */
    public final void m7676c(AbstractC29718g abstractC29718g, float f, float f2) {
        m7677b(f);
        this.f115035h.add(abstractC29718g);
        m7663p(f2);
    }

    /* renamed from: d */
    public void m7675d(Matrix matrix, Path path) {
        int size = this.f115034g.size();
        for (int i = 0; i < size; i++) {
            this.f115034g.get(i).mo7632a(matrix, path);
        }
    }

    /* renamed from: e */
    public boolean m7674e() {
        return this.f115036i;
    }

    /* renamed from: f */
    public AbstractC29718g m7673f(Matrix matrix) {
        m7677b(m7671h());
        return new C29712a(new ArrayList(this.f115035h), new Matrix(matrix));
    }

    /* renamed from: g */
    public final float m7672g() {
        return this.f115032e;
    }

    /* renamed from: h */
    public final float m7671h() {
        return this.f115033f;
    }

    /* renamed from: i */
    public float m7670i() {
        return this.f115030c;
    }

    /* renamed from: j */
    public float m7669j() {
        return this.f115031d;
    }

    /* renamed from: k */
    public float m7668k() {
        return this.f115028a;
    }

    /* renamed from: l */
    public float m7667l() {
        return this.f115029b;
    }

    /* renamed from: m */
    public void m7666m(float f, float f2) {
        C29716e c29716e = new C29716e();
        c29716e.f115051b = f;
        c29716e.f115052c = f2;
        this.f115034g.add(c29716e);
        C29714c c29714c = new C29714c(c29716e, m7670i(), m7669j());
        m7676c(c29714c, c29714c.m7657c() + 270.0f, c29714c.m7657c() + 270.0f);
        m7661r(f);
        m7660s(f2);
    }

    /* renamed from: n */
    public void m7665n(float f, float f2) {
        m7664o(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: o */
    public void m7664o(float f, float f2, float f3, float f4) {
        m7659t(f);
        m7658u(f2);
        m7661r(f);
        m7660s(f2);
        m7663p(f3);
        m7662q((f3 + f4) % 360.0f);
        this.f115034g.clear();
        this.f115035h.clear();
        this.f115036i = false;
    }

    /* renamed from: p */
    public final void m7663p(float f) {
        this.f115032e = f;
    }

    /* renamed from: q */
    public final void m7662q(float f) {
        this.f115033f = f;
    }

    /* renamed from: r */
    public final void m7661r(float f) {
        this.f115030c = f;
    }

    /* renamed from: s */
    public final void m7660s(float f) {
        this.f115031d = f;
    }

    /* renamed from: t */
    public final void m7659t(float f) {
        this.f115028a = f;
    }

    /* renamed from: u */
    public final void m7658u(float f) {
        this.f115029b = f;
    }
}
