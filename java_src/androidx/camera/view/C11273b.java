package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.camera.core.C11243o;
import androidx.camera.view.PreviewView;
/* renamed from: androidx.camera.view.b */
/* loaded from: classes.dex */
public final class C11273b {

    /* renamed from: h */
    public static final PreviewView.EnumC11268g f52874h = PreviewView.EnumC11268g.FILL_CENTER;

    /* renamed from: a */
    public Size f52875a;

    /* renamed from: b */
    public Rect f52876b;

    /* renamed from: c */
    public int f52877c;

    /* renamed from: d */
    public int f52878d;

    /* renamed from: e */
    public boolean f52879e;

    /* renamed from: f */
    public boolean f52880f;

    /* renamed from: g */
    public PreviewView.EnumC11268g f52881g = f52874h;

    /* renamed from: androidx.camera.view.b$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11274a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52882a;

        static {
            int[] iArr = new int[PreviewView.EnumC11268g.values().length];
            f52882a = iArr;
            try {
                iArr[PreviewView.EnumC11268g.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52882a[PreviewView.EnumC11268g.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52882a[PreviewView.EnumC11268g.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52882a[PreviewView.EnumC11268g.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52882a[PreviewView.EnumC11268g.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f52882a[PreviewView.EnumC11268g.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: a */
    public static RectF m68949a(RectF rectF, float f) {
        float f2 = f + f;
        return new RectF(f2 - rectF.right, rectF.top, f2 - rectF.left, rectF.bottom);
    }

    /* renamed from: n */
    public static void m68936n(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.EnumC11268g enumC11268g) {
        Matrix.ScaleToFit scaleToFit;
        boolean z;
        switch (C11274a.f52882a[enumC11268g.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                C33928Jx2.m99531c("PreviewTransform", "Unexpected crop rect: " + enumC11268g);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (enumC11268g != PreviewView.EnumC11268g.FIT_CENTER && enumC11268g != PreviewView.EnumC11268g.FIT_START && enumC11268g != PreviewView.EnumC11268g.FIT_END) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            return;
        }
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        matrix.invert(matrix);
    }

    /* renamed from: b */
    public Matrix m68948b(Size size, int i) {
        if (!m68939k()) {
            return null;
        }
        Matrix matrix = new Matrix();
        m68942h(size, i).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, this.f52875a.getWidth(), this.f52875a.getHeight()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    /* renamed from: c */
    public RectF m68947c(Size size, int i) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size m68945e = m68945e();
        RectF rectF2 = new RectF(0.0f, 0.0f, m68945e.getWidth(), m68945e.getHeight());
        Matrix matrix = new Matrix();
        m68936n(matrix, rectF2, rectF, this.f52881g);
        matrix.mapRect(rectF2);
        if (i == 1) {
            return m68949a(rectF2, size.getWidth() / 2.0f);
        }
        return rectF2;
    }

    /* renamed from: d */
    public final int m68946d() {
        int i = this.f52878d;
        if (i == -1 && !this.f52880f) {
            return this.f52877c;
        }
        if (this.f52880f && i != -1) {
            return -C38051ac0.m71099b(i);
        }
        throw new IllegalStateException("Target rotation must be specified. Target rotation: " + this.f52878d + " hasCameraTransform " + this.f52880f);
    }

    /* renamed from: e */
    public final Size m68945e() {
        if (C46705p96.m19868g(this.f52877c)) {
            return new Size(this.f52876b.height(), this.f52876b.width());
        }
        return new Size(this.f52876b.width(), this.f52876b.height());
    }

    /* renamed from: f */
    public PreviewView.EnumC11268g m68944f() {
        return this.f52881g;
    }

    /* renamed from: g */
    public Rect m68943g() {
        return this.f52876b;
    }

    /* renamed from: h */
    public Matrix m68942h(Size size, int i) {
        RectF m68947c;
        HZ3.m103729i(m68939k());
        if (m68938l(size)) {
            m68947c = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            m68947c = m68947c(size, i);
        }
        Matrix m19872c = C46705p96.m19872c(new RectF(this.f52876b), m68947c, this.f52877c);
        if (this.f52879e) {
            if (C46705p96.m19868g(this.f52877c)) {
                m19872c.preScale(1.0f, -1.0f, this.f52876b.centerX(), this.f52876b.centerY());
            } else {
                m19872c.preScale(-1.0f, 1.0f, this.f52876b.centerX(), this.f52876b.centerY());
            }
        }
        return m19872c;
    }

    /* renamed from: i */
    public Matrix m68941i() {
        HZ3.m103729i(m68939k());
        RectF rectF = new RectF(0.0f, 0.0f, this.f52875a.getWidth(), this.f52875a.getHeight());
        return C46705p96.m19872c(rectF, rectF, m68946d());
    }

    /* renamed from: j */
    public final RectF m68940j(Size size, int i) {
        HZ3.m103729i(m68939k());
        Matrix m68942h = m68942h(size, i);
        RectF rectF = new RectF(0.0f, 0.0f, this.f52875a.getWidth(), this.f52875a.getHeight());
        m68942h.mapRect(rectF);
        return rectF;
    }

    /* renamed from: k */
    public final boolean m68939k() {
        boolean z;
        if (this.f52880f && this.f52878d == -1) {
            z = false;
        } else {
            z = true;
        }
        if (this.f52876b == null || this.f52875a == null || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean m68938l(Size size) {
        return C46705p96.m19866i(size, true, m68945e(), false);
    }

    /* renamed from: m */
    public void m68937m(int i, int i2) {
        if (!this.f52880f) {
            return;
        }
        this.f52877c = i;
        this.f52878d = i2;
    }

    /* renamed from: o */
    public void m68935o(PreviewView.EnumC11268g enumC11268g) {
        this.f52881g = enumC11268g;
    }

    /* renamed from: p */
    public void m68934p(C11243o.AbstractC11251h abstractC11251h, Size size, boolean z) {
        C33928Jx2.m99533a("PreviewTransform", "Transformation info set: " + abstractC11251h + " " + size + " " + z);
        this.f52876b = abstractC11251h.mo69085a();
        this.f52877c = abstractC11251h.mo69084b();
        this.f52878d = abstractC11251h.mo69083c();
        this.f52875a = size;
        this.f52879e = z;
        this.f52880f = abstractC11251h.mo69082d();
    }

    /* renamed from: q */
    public void m68933q(Size size, int i, View view) {
        boolean z;
        if (size.getHeight() != 0 && size.getWidth() != 0) {
            if (!m68939k()) {
                return;
            }
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(m68941i());
            } else {
                Display display = view.getDisplay();
                boolean z2 = true;
                if (this.f52880f && display != null && display.getRotation() != this.f52878d) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f52880f || m68946d() == 0) {
                    z2 = false;
                }
                if (z || z2) {
                    C33928Jx2.m99531c("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF m68940j = m68940j(size, i);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(m68940j.width() / this.f52875a.getWidth());
            view.setScaleY(m68940j.height() / this.f52875a.getHeight());
            view.setTranslationX(m68940j.left - view.getLeft());
            view.setTranslationY(m68940j.top - view.getTop());
            return;
        }
        C33928Jx2.m99522l("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
    }
}
