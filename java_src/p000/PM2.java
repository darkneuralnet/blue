package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import kotlin.KotlinVersion;
import p000.C43037iy5;
import p000.C43630jy5;
import p000.C50744vy5;
/* renamed from: PM2 */
/* loaded from: classes6.dex */
public class PM2 extends Drawable implements InterfaceC32302Cy5 {

    /* renamed from: y */
    public static final String f28297y = "PM2";

    /* renamed from: z */
    public static final Paint f28298z;

    /* renamed from: b */
    public C6331c f28299b;

    /* renamed from: c */
    public final C50744vy5.AbstractC29718g[] f28300c;

    /* renamed from: d */
    public final C50744vy5.AbstractC29718g[] f28301d;

    /* renamed from: e */
    public final BitSet f28302e;

    /* renamed from: f */
    public boolean f28303f;

    /* renamed from: g */
    public final Matrix f28304g;

    /* renamed from: h */
    public final Path f28305h;

    /* renamed from: i */
    public final Path f28306i;

    /* renamed from: j */
    public final RectF f28307j;

    /* renamed from: k */
    public final RectF f28308k;

    /* renamed from: l */
    public final Region f28309l;

    /* renamed from: m */
    public final Region f28310m;

    /* renamed from: n */
    public C43037iy5 f28311n;

    /* renamed from: o */
    public final Paint f28312o;

    /* renamed from: p */
    public final Paint f28313p;

    /* renamed from: q */
    public final C36037Sx5 f28314q;

    /* renamed from: r */
    public final C43630jy5.InterfaceC25064b f28315r;

    /* renamed from: s */
    public final C43630jy5 f28316s;

    /* renamed from: t */
    public PorterDuffColorFilter f28317t;

    /* renamed from: u */
    public PorterDuffColorFilter f28318u;

    /* renamed from: v */
    public int f28319v;

    /* renamed from: w */
    public final RectF f28320w;

    /* renamed from: x */
    public boolean f28321x;

    /* renamed from: PM2$a */
    /* loaded from: classes6.dex */
    public class C6329a implements C43630jy5.InterfaceC25064b {
        public C6329a() {
        }

        @Override // p000.C43630jy5.InterfaceC25064b
        /* renamed from: a */
        public void mo29563a(C50744vy5 c50744vy5, Matrix matrix, int i) {
            PM2.this.f28302e.set(i + 4, c50744vy5.m7674e());
            PM2.this.f28301d[i] = c50744vy5.m7673f(matrix);
        }

        @Override // p000.C43630jy5.InterfaceC25064b
        /* renamed from: b */
        public void mo29562b(C50744vy5 c50744vy5, Matrix matrix, int i) {
            PM2.this.f28302e.set(i, c50744vy5.m7674e());
            PM2.this.f28300c[i] = c50744vy5.m7673f(matrix);
        }
    }

    /* renamed from: PM2$b */
    /* loaded from: classes6.dex */
    public class C6330b implements C43037iy5.InterfaceC24659c {

        /* renamed from: a */
        public final /* synthetic */ float f28323a;

        public C6330b(float f) {
            this.f28323a = f;
        }

        @Override // p000.C43037iy5.InterfaceC24659c
        /* renamed from: a */
        public NC0 mo31481a(NC0 nc0) {
            if (!(nc0 instanceof C37404Yt4)) {
                return new C25112k8(this.f28323a, nc0);
            }
            return nc0;
        }
    }

    static {
        Paint paint = new Paint(1);
        f28298z = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public /* synthetic */ PM2(C6331c c6331c, C6329a c6329a) {
        this(c6331c);
    }

    /* renamed from: U */
    public static int m90422U(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: m */
    public static PM2 m90393m(Context context, float f) {
        int m103953c = HM2.m103953c(context, C49961uf4.colorSurface, PM2.class.getSimpleName());
        PM2 pm2 = new PM2();
        pm2.m90427P(context);
        pm2.m90416a0(ColorStateList.valueOf(m103953c));
        pm2.m90417Z(f);
        return pm2;
    }

    /* renamed from: A */
    public int m90442A() {
        return this.f28319v;
    }

    /* renamed from: B */
    public int m90441B() {
        C6331c c6331c = this.f28299b;
        return (int) (c6331c.f28343s * Math.sin(Math.toRadians(c6331c.f28344t)));
    }

    /* renamed from: C */
    public int m90440C() {
        C6331c c6331c = this.f28299b;
        return (int) (c6331c.f28343s * Math.cos(Math.toRadians(c6331c.f28344t)));
    }

    /* renamed from: D */
    public int m90439D() {
        return this.f28299b.f28342r;
    }

    /* renamed from: E */
    public C43037iy5 m90438E() {
        return this.f28299b.f28325a;
    }

    /* renamed from: F */
    public ColorStateList m90437F() {
        return this.f28299b.f28329e;
    }

    /* renamed from: G */
    public final float m90436G() {
        if (m90428O()) {
            return this.f28313p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: H */
    public float m90435H() {
        return this.f28299b.f28336l;
    }

    /* renamed from: I */
    public float m90434I() {
        return this.f28299b.f28325a.m31527r().mo29259a(m90382u());
    }

    /* renamed from: J */
    public float m90433J() {
        return this.f28299b.f28325a.m31525t().mo29259a(m90382u());
    }

    /* renamed from: K */
    public float m90432K() {
        return this.f28299b.f28340p;
    }

    /* renamed from: L */
    public float m90431L() {
        return m90380w() + m90432K();
    }

    /* renamed from: M */
    public final boolean m90430M() {
        C6331c c6331c = this.f28299b;
        int i = c6331c.f28341q;
        if (i != 1 && c6331c.f28342r > 0 && (i == 2 || m90420W())) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final boolean m90429N() {
        Paint.Style style = this.f28299b.f28346v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: O */
    public final boolean m90428O() {
        Paint.Style style = this.f28299b.f28346v;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f28313p.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public void m90427P(Context context) {
        this.f28299b.f28326b = new C46351oa1(context);
        m90388o0();
    }

    /* renamed from: Q */
    public final void m90426Q() {
        super.invalidateSelf();
    }

    /* renamed from: R */
    public boolean m90425R() {
        C46351oa1 c46351oa1 = this.f28299b.f28326b;
        if (c46351oa1 != null && c46351oa1.m20830e()) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public boolean m90424S() {
        return this.f28299b.f28325a.m31524u(m90382u());
    }

    /* renamed from: T */
    public final void m90423T(Canvas canvas) {
        if (!m90430M()) {
            return;
        }
        canvas.save();
        m90421V(canvas);
        if (!this.f28321x) {
            m90391n(canvas);
            canvas.restore();
            return;
        }
        int width = (int) (this.f28320w.width() - getBounds().width());
        int height = (int) (this.f28320w.height() - getBounds().height());
        if (width >= 0 && height >= 0) {
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f28320w.width()) + (this.f28299b.f28342r * 2) + width, ((int) this.f28320w.height()) + (this.f28299b.f28342r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (getBounds().left - this.f28299b.f28342r) - width;
            float f2 = (getBounds().top - this.f28299b.f28342r) - height;
            canvas2.translate(-f, -f2);
            m90391n(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
            return;
        }
        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
    }

    /* renamed from: V */
    public final void m90421V(Canvas canvas) {
        canvas.translate(m90441B(), m90440C());
    }

    /* renamed from: W */
    public boolean m90420W() {
        int i = Build.VERSION.SDK_INT;
        if (!m90424S() && !this.f28305h.isConvex() && i < 29) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public void m90419X(float f) {
        setShapeAppearanceModel(this.f28299b.f28325a.m31522w(f));
    }

    /* renamed from: Y */
    public void m90418Y(NC0 nc0) {
        setShapeAppearanceModel(this.f28299b.f28325a.m31521x(nc0));
    }

    /* renamed from: Z */
    public void m90417Z(float f) {
        C6331c c6331c = this.f28299b;
        if (c6331c.f28339o != f) {
            c6331c.f28339o = f;
            m90388o0();
        }
    }

    /* renamed from: a0 */
    public void m90416a0(ColorStateList colorStateList) {
        C6331c c6331c = this.f28299b;
        if (c6331c.f28328d != colorStateList) {
            c6331c.f28328d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: b0 */
    public void m90414b0(float f) {
        C6331c c6331c = this.f28299b;
        if (c6331c.f28335k != f) {
            c6331c.f28335k = f;
            this.f28303f = true;
            invalidateSelf();
        }
    }

    /* renamed from: c0 */
    public void m90412c0(int i, int i2, int i3, int i4) {
        C6331c c6331c = this.f28299b;
        if (c6331c.f28333i == null) {
            c6331c.f28333i = new Rect();
        }
        this.f28299b.f28333i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: d0 */
    public void m90410d0(Paint.Style style) {
        this.f28299b.f28346v = style;
        m90426Q();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f28312o.setColorFilter(this.f28317t);
        int alpha = this.f28312o.getAlpha();
        this.f28312o.setAlpha(m90422U(alpha, this.f28299b.f28337m));
        this.f28313p.setColorFilter(this.f28318u);
        this.f28313p.setStrokeWidth(this.f28299b.f28336l);
        int alpha2 = this.f28313p.getAlpha();
        this.f28313p.setAlpha(m90422U(alpha2, this.f28299b.f28337m));
        if (this.f28303f) {
            m90401i();
            m90405g(m90382u(), this.f28305h);
            this.f28303f = false;
        }
        m90423T(canvas);
        if (m90429N()) {
            m90389o(canvas);
        }
        if (m90428O()) {
            mo90385r(canvas);
        }
        this.f28312o.setAlpha(alpha);
        this.f28313p.setAlpha(alpha2);
    }

    /* renamed from: e0 */
    public void m90408e0(float f) {
        C6331c c6331c = this.f28299b;
        if (c6331c.f28338n != f) {
            c6331c.f28338n = f;
            m90388o0();
        }
    }

    /* renamed from: f */
    public final PorterDuffColorFilter m90407f(Paint paint, boolean z) {
        if (z) {
            int color = paint.getColor();
            int m90395l = m90395l(color);
            this.f28319v = m90395l;
            if (m90395l != color) {
                return new PorterDuffColorFilter(m90395l, PorterDuff.Mode.SRC_IN);
            }
            return null;
        }
        return null;
    }

    /* renamed from: f0 */
    public void m90406f0(boolean z) {
        this.f28321x = z;
    }

    /* renamed from: g */
    public final void m90405g(RectF rectF, Path path) {
        m90403h(rectF, path);
        if (this.f28299b.f28334j != 1.0f) {
            this.f28304g.reset();
            Matrix matrix = this.f28304g;
            float f = this.f28299b.f28334j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f28304g);
        }
        path.computeBounds(this.f28320w, true);
    }

    /* renamed from: g0 */
    public void m90404g0(int i) {
        this.f28314q.m84570d(i);
        this.f28299b.f28345u = false;
        m90426Q();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f28299b.f28337m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f28299b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f28299b.f28341q == 2) {
            return;
        }
        if (m90424S()) {
            outline.setRoundRect(getBounds(), m90434I() * this.f28299b.f28335k);
            return;
        }
        m90405g(m90382u(), this.f28305h);
        C40750f71.m42011h(outline, this.f28305h);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f28299b.f28333i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f28309l.set(getBounds());
        m90405g(m90382u(), this.f28305h);
        this.f28310m.setPath(this.f28305h, this.f28309l);
        this.f28309l.op(this.f28310m, Region.Op.DIFFERENCE);
        return this.f28309l;
    }

    /* renamed from: h */
    public final void m90403h(RectF rectF, Path path) {
        C43630jy5 c43630jy5 = this.f28316s;
        C6331c c6331c = this.f28299b;
        c43630jy5.m29574d(c6331c.f28325a, c6331c.f28335k, rectF, this.f28315r, path);
    }

    /* renamed from: h0 */
    public void m90402h0(int i) {
        C6331c c6331c = this.f28299b;
        if (c6331c.f28341q != i) {
            c6331c.f28341q = i;
            m90426Q();
        }
    }

    /* renamed from: i */
    public final void m90401i() {
        C43037iy5 m31520y = m90438E().m31520y(new C6330b(-m90436G()));
        this.f28311n = m31520y;
        this.f28316s.m29573e(m31520y, this.f28299b.f28335k, m90381v(), this.f28306i);
    }

    /* renamed from: i0 */
    public void m90400i0(float f, int i) {
        m90394l0(f);
        m90396k0(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f28303f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.f28299b.f28331g) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f28299b.f28330f) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.f28299b.f28329e) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.f28299b.f28328d) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final PorterDuffColorFilter m90399j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m90395l(colorForState);
        }
        this.f28319v = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: j0 */
    public void m90398j0(float f, ColorStateList colorStateList) {
        m90394l0(f);
        m90396k0(colorStateList);
    }

    /* renamed from: k */
    public final PorterDuffColorFilter m90397k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            return m90399j(colorStateList, mode, z);
        }
        return m90407f(paint, z);
    }

    /* renamed from: k0 */
    public void m90396k0(ColorStateList colorStateList) {
        C6331c c6331c = this.f28299b;
        if (c6331c.f28329e != colorStateList) {
            c6331c.f28329e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: l */
    public int m90395l(int i) {
        float m90431L = m90431L() + m90377z();
        C46351oa1 c46351oa1 = this.f28299b.f28326b;
        if (c46351oa1 != null) {
            return c46351oa1.m20832c(i, m90431L);
        }
        return i;
    }

    /* renamed from: l0 */
    public void m90394l0(float f) {
        this.f28299b.f28336l = f;
        invalidateSelf();
    }

    /* renamed from: m0 */
    public final boolean m90392m0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f28299b.f28328d != null && color2 != (colorForState2 = this.f28299b.f28328d.getColorForState(iArr, (color2 = this.f28312o.getColor())))) {
            this.f28312o.setColor(colorForState2);
            z = true;
        } else {
            z = false;
        }
        if (this.f28299b.f28329e != null && color != (colorForState = this.f28299b.f28329e.getColorForState(iArr, (color = this.f28313p.getColor())))) {
            this.f28313p.setColor(colorForState);
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f28299b = new C6331c(this.f28299b);
        return this;
    }

    /* renamed from: n */
    public final void m90391n(Canvas canvas) {
        if (this.f28302e.cardinality() > 0) {
            Log.w(f28297y, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f28299b.f28343s != 0) {
            canvas.drawPath(this.f28305h, this.f28314q.m84571c());
        }
        for (int i = 0; i < 4; i++) {
            this.f28300c[i].m7631a(this.f28314q, this.f28299b.f28342r, canvas);
            this.f28301d[i].m7631a(this.f28314q, this.f28299b.f28342r, canvas);
        }
        if (this.f28321x) {
            int m90441B = m90441B();
            int m90440C = m90440C();
            canvas.translate(-m90441B, -m90440C);
            canvas.drawPath(this.f28305h, f28298z);
            canvas.translate(m90441B, m90440C);
        }
    }

    /* renamed from: n0 */
    public final boolean m90390n0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f28317t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f28318u;
        C6331c c6331c = this.f28299b;
        this.f28317t = m90397k(c6331c.f28331g, c6331c.f28332h, this.f28312o, true);
        C6331c c6331c2 = this.f28299b;
        this.f28318u = m90397k(c6331c2.f28330f, c6331c2.f28332h, this.f28313p, false);
        C6331c c6331c3 = this.f28299b;
        if (c6331c3.f28345u) {
            this.f28314q.m84570d(c6331c3.f28331g.getColorForState(getState(), 0));
        }
        if (!C37259Yd3.m74780a(porterDuffColorFilter, this.f28317t) || !C37259Yd3.m74780a(porterDuffColorFilter2, this.f28318u)) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final void m90389o(Canvas canvas) {
        m90387p(canvas, this.f28312o, this.f28305h, this.f28299b.f28325a, m90382u());
    }

    /* renamed from: o0 */
    public final void m90388o0() {
        float m90431L = m90431L();
        this.f28299b.f28342r = (int) Math.ceil(0.75f * m90431L);
        this.f28299b.f28343s = (int) Math.ceil(m90431L * 0.25f);
        m90390n0();
        m90426Q();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f28303f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, p000.C38306b16.InterfaceC12272b
    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean m90392m0 = m90392m0(iArr);
        boolean m90390n0 = m90390n0();
        if (!m90392m0 && !m90390n0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public final void m90387p(Canvas canvas, Paint paint, Path path, C43037iy5 c43037iy5, RectF rectF) {
        if (c43037iy5.m31524u(rectF)) {
            float mo29259a = c43037iy5.m31525t().mo29259a(rectF) * this.f28299b.f28335k;
            canvas.drawRoundRect(rectF, mo29259a, mo29259a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: q */
    public void m90386q(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m90387p(canvas, paint, path, this.f28299b.f28325a, rectF);
    }

    /* renamed from: r */
    public void mo90385r(Canvas canvas) {
        m90387p(canvas, this.f28313p, this.f28306i, this.f28311n, m90381v());
    }

    /* renamed from: s */
    public float m90384s() {
        return this.f28299b.f28325a.m31535j().mo29259a(m90382u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C6331c c6331c = this.f28299b;
        if (c6331c.f28337m != i) {
            c6331c.f28337m = i;
            m90426Q();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f28299b.f28327c = colorFilter;
        m90426Q();
    }

    @Override // p000.InterfaceC32302Cy5
    public void setShapeAppearanceModel(C43037iy5 c43037iy5) {
        this.f28299b.f28325a = c43037iy5;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f28299b.f28331g = colorStateList;
        m90390n0();
        m90426Q();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C6331c c6331c = this.f28299b;
        if (c6331c.f28332h != mode) {
            c6331c.f28332h = mode;
            m90390n0();
            m90426Q();
        }
    }

    /* renamed from: t */
    public float m90383t() {
        return this.f28299b.f28325a.m31533l().mo29259a(m90382u());
    }

    /* renamed from: u */
    public RectF m90382u() {
        this.f28307j.set(getBounds());
        return this.f28307j;
    }

    /* renamed from: v */
    public final RectF m90381v() {
        this.f28308k.set(m90382u());
        float m90436G = m90436G();
        this.f28308k.inset(m90436G, m90436G);
        return this.f28308k;
    }

    /* renamed from: w */
    public float m90380w() {
        return this.f28299b.f28339o;
    }

    /* renamed from: x */
    public ColorStateList m90379x() {
        return this.f28299b.f28328d;
    }

    /* renamed from: y */
    public float m90378y() {
        return this.f28299b.f28335k;
    }

    /* renamed from: z */
    public float m90377z() {
        return this.f28299b.f28338n;
    }

    public PM2() {
        this(new C43037iy5());
    }

    public PM2(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C43037iy5.m31540e(context, attributeSet, i, i2).m31495m());
    }

    public PM2(C43037iy5 c43037iy5) {
        this(new C6331c(c43037iy5, null));
    }

    public PM2(C6331c c6331c) {
        C43630jy5 c43630jy5;
        this.f28300c = new C50744vy5.AbstractC29718g[4];
        this.f28301d = new C50744vy5.AbstractC29718g[4];
        this.f28302e = new BitSet(8);
        this.f28304g = new Matrix();
        this.f28305h = new Path();
        this.f28306i = new Path();
        this.f28307j = new RectF();
        this.f28308k = new RectF();
        this.f28309l = new Region();
        this.f28310m = new Region();
        Paint paint = new Paint(1);
        this.f28312o = paint;
        Paint paint2 = new Paint(1);
        this.f28313p = paint2;
        this.f28314q = new C36037Sx5();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c43630jy5 = C43630jy5.m29567k();
        } else {
            c43630jy5 = new C43630jy5();
        }
        this.f28316s = c43630jy5;
        this.f28320w = new RectF();
        this.f28321x = true;
        this.f28299b = c6331c;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m90390n0();
        m90392m0(getState());
        this.f28315r = new C6329a();
    }

    /* renamed from: PM2$c */
    /* loaded from: classes6.dex */
    public static final class C6331c extends Drawable.ConstantState {

        /* renamed from: a */
        public C43037iy5 f28325a;

        /* renamed from: b */
        public C46351oa1 f28326b;

        /* renamed from: c */
        public ColorFilter f28327c;

        /* renamed from: d */
        public ColorStateList f28328d;

        /* renamed from: e */
        public ColorStateList f28329e;

        /* renamed from: f */
        public ColorStateList f28330f;

        /* renamed from: g */
        public ColorStateList f28331g;

        /* renamed from: h */
        public PorterDuff.Mode f28332h;

        /* renamed from: i */
        public Rect f28333i;

        /* renamed from: j */
        public float f28334j;

        /* renamed from: k */
        public float f28335k;

        /* renamed from: l */
        public float f28336l;

        /* renamed from: m */
        public int f28337m;

        /* renamed from: n */
        public float f28338n;

        /* renamed from: o */
        public float f28339o;

        /* renamed from: p */
        public float f28340p;

        /* renamed from: q */
        public int f28341q;

        /* renamed from: r */
        public int f28342r;

        /* renamed from: s */
        public int f28343s;

        /* renamed from: t */
        public int f28344t;

        /* renamed from: u */
        public boolean f28345u;

        /* renamed from: v */
        public Paint.Style f28346v;

        public C6331c(C43037iy5 c43037iy5, C46351oa1 c46351oa1) {
            this.f28328d = null;
            this.f28329e = null;
            this.f28330f = null;
            this.f28331g = null;
            this.f28332h = PorterDuff.Mode.SRC_IN;
            this.f28333i = null;
            this.f28334j = 1.0f;
            this.f28335k = 1.0f;
            this.f28337m = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f28338n = 0.0f;
            this.f28339o = 0.0f;
            this.f28340p = 0.0f;
            this.f28341q = 0;
            this.f28342r = 0;
            this.f28343s = 0;
            this.f28344t = 0;
            this.f28345u = false;
            this.f28346v = Paint.Style.FILL_AND_STROKE;
            this.f28325a = c43037iy5;
            this.f28326b = c46351oa1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            PM2 pm2 = new PM2(this, null);
            pm2.f28303f = true;
            return pm2;
        }

        public C6331c(C6331c c6331c) {
            this.f28328d = null;
            this.f28329e = null;
            this.f28330f = null;
            this.f28331g = null;
            this.f28332h = PorterDuff.Mode.SRC_IN;
            this.f28333i = null;
            this.f28334j = 1.0f;
            this.f28335k = 1.0f;
            this.f28337m = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f28338n = 0.0f;
            this.f28339o = 0.0f;
            this.f28340p = 0.0f;
            this.f28341q = 0;
            this.f28342r = 0;
            this.f28343s = 0;
            this.f28344t = 0;
            this.f28345u = false;
            this.f28346v = Paint.Style.FILL_AND_STROKE;
            this.f28325a = c6331c.f28325a;
            this.f28326b = c6331c.f28326b;
            this.f28336l = c6331c.f28336l;
            this.f28327c = c6331c.f28327c;
            this.f28328d = c6331c.f28328d;
            this.f28329e = c6331c.f28329e;
            this.f28332h = c6331c.f28332h;
            this.f28331g = c6331c.f28331g;
            this.f28337m = c6331c.f28337m;
            this.f28334j = c6331c.f28334j;
            this.f28343s = c6331c.f28343s;
            this.f28341q = c6331c.f28341q;
            this.f28345u = c6331c.f28345u;
            this.f28335k = c6331c.f28335k;
            this.f28338n = c6331c.f28338n;
            this.f28339o = c6331c.f28339o;
            this.f28340p = c6331c.f28340p;
            this.f28342r = c6331c.f28342r;
            this.f28344t = c6331c.f28344t;
            this.f28330f = c6331c.f28330f;
            this.f28346v = c6331c.f28346v;
            if (c6331c.f28333i != null) {
                this.f28333i = new Rect(c6331c.f28333i);
            }
        }
    }
}
