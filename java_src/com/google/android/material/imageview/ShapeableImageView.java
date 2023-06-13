package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
/* loaded from: classes6.dex */
public class ShapeableImageView extends AppCompatImageView implements InterfaceC32302Cy5 {

    /* renamed from: t */
    public static final int f72954t = C50021ul4.Widget_MaterialComponents_ShapeableImageView;

    /* renamed from: b */
    public final C43630jy5 f72955b;

    /* renamed from: c */
    public final RectF f72956c;

    /* renamed from: d */
    public final RectF f72957d;

    /* renamed from: e */
    public final Paint f72958e;

    /* renamed from: f */
    public final Paint f72959f;

    /* renamed from: g */
    public final Path f72960g;

    /* renamed from: h */
    public ColorStateList f72961h;

    /* renamed from: i */
    public PM2 f72962i;

    /* renamed from: j */
    public C43037iy5 f72963j;

    /* renamed from: k */
    public float f72964k;

    /* renamed from: l */
    public Path f72965l;

    /* renamed from: m */
    public int f72966m;

    /* renamed from: n */
    public int f72967n;

    /* renamed from: o */
    public int f72968o;

    /* renamed from: p */
    public int f72969p;

    /* renamed from: q */
    public int f72970q;

    /* renamed from: r */
    public int f72971r;

    /* renamed from: s */
    public boolean f72972s;

    @TargetApi(21)
    /* renamed from: com.google.android.material.imageview.ShapeableImageView$a */
    /* loaded from: classes6.dex */
    public class C17828a extends ViewOutlineProvider {

        /* renamed from: a */
        public final Rect f72973a = new Rect();

        public C17828a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f72963j == null) {
                return;
            }
            if (ShapeableImageView.this.f72962i == null) {
                ShapeableImageView.this.f72962i = new PM2(ShapeableImageView.this.f72963j);
            }
            ShapeableImageView.this.f72956c.round(this.f72973a);
            ShapeableImageView.this.f72962i.setBounds(this.f72973a);
            ShapeableImageView.this.f72962i.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    /* renamed from: g */
    public final void m49431g(Canvas canvas) {
        if (this.f72961h == null) {
            return;
        }
        this.f72958e.setStrokeWidth(this.f72964k);
        int colorForState = this.f72961h.getColorForState(getDrawableState(), this.f72961h.getDefaultColor());
        if (this.f72964k > 0.0f && colorForState != 0) {
            this.f72958e.setColor(colorForState);
            canvas.drawPath(this.f72960g, this.f72958e);
        }
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - m49430h();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - m49429i();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - m49428j();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - m49427k();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - m49426l();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - m49425m();
    }

    /* renamed from: h */
    public int m49430h() {
        return this.f72969p;
    }

    /* renamed from: i */
    public final int m49429i() {
        int i = this.f72971r;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (m49423o()) {
            return this.f72966m;
        }
        return this.f72968o;
    }

    /* renamed from: j */
    public int m49428j() {
        int i;
        int i2;
        if (m49424n()) {
            if (m49423o() && (i2 = this.f72971r) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!m49423o() && (i = this.f72970q) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f72966m;
    }

    /* renamed from: k */
    public int m49427k() {
        int i;
        int i2;
        if (m49424n()) {
            if (m49423o() && (i2 = this.f72970q) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!m49423o() && (i = this.f72971r) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f72968o;
    }

    /* renamed from: l */
    public final int m49426l() {
        int i = this.f72970q;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (m49423o()) {
            return this.f72968o;
        }
        return this.f72966m;
    }

    /* renamed from: m */
    public int m49425m() {
        return this.f72967n;
    }

    /* renamed from: n */
    public final boolean m49424n() {
        return (this.f72970q == Integer.MIN_VALUE && this.f72971r == Integer.MIN_VALUE) ? false : true;
    }

    /* renamed from: o */
    public final boolean m49423o() {
        return getLayoutDirection() == 1;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f72965l, this.f72959f);
        m49431g(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f72972s || !isLayoutDirectionResolved()) {
            return;
        }
        this.f72972s = true;
        if (!isPaddingRelative() && !m49424n()) {
            setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
        } else {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m49422p(i, i2);
    }

    /* renamed from: p */
    public final void m49422p(int i, int i2) {
        this.f72956c.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        this.f72955b.m29573e(this.f72963j, 1.0f, this.f72956c, this.f72960g);
        this.f72965l.rewind();
        this.f72965l.addPath(this.f72960g);
        this.f72957d.set(0.0f, 0.0f, i, i2);
        this.f72965l.addRect(this.f72957d, Path.Direction.CCW);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.f72970q = Integer.MIN_VALUE;
        this.f72971r = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.f72966m) + i, (super.getPaddingTop() - this.f72967n) + i2, (super.getPaddingRight() - this.f72968o) + i3, (super.getPaddingBottom() - this.f72969p) + i4);
        this.f72966m = i;
        this.f72967n = i2;
        this.f72968o = i3;
        this.f72969p = i4;
    }

    public void setContentPaddingRelative(int i, int i2, int i3, int i4) {
        int i5;
        super.setPaddingRelative((super.getPaddingStart() - m49426l()) + i, (super.getPaddingTop() - this.f72967n) + i2, (super.getPaddingEnd() - m49429i()) + i3, (super.getPaddingBottom() - this.f72969p) + i4);
        if (m49423o()) {
            i5 = i3;
        } else {
            i5 = i;
        }
        this.f72966m = i5;
        this.f72967n = i2;
        if (!m49423o()) {
            i = i3;
        }
        this.f72968o = i;
        this.f72969p = i4;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i + m49428j(), i2 + m49425m(), i3 + m49427k(), i4 + m49430h());
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i + m49426l(), i2 + m49425m(), i3 + m49429i(), i4 + m49430h());
    }

    @Override // p000.InterfaceC32302Cy5
    public void setShapeAppearanceModel(C43037iy5 c43037iy5) {
        this.f72963j = c43037iy5;
        PM2 pm2 = this.f72962i;
        if (pm2 != null) {
            pm2.setShapeAppearanceModel(c43037iy5);
        }
        m49422p(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f72961h = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(C29611vi.m8249a(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.f72964k != f) {
            this.f72964k = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r0), attributeSet, i);
        int i2 = f72954t;
        this.f72955b = C43630jy5.m29567k();
        this.f72960g = new Path();
        this.f72972s = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f72959f = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f72956c = new RectF();
        this.f72957d = new RectF();
        this.f72965l = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C37098Xl4.ShapeableImageView, i, i2);
        setLayerType(2, null);
        this.f72961h = NM2.m94029b(context2, obtainStyledAttributes, C37098Xl4.ShapeableImageView_strokeColor);
        this.f72964k = obtainStyledAttributes.getDimensionPixelSize(C37098Xl4.ShapeableImageView_strokeWidth, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C37098Xl4.ShapeableImageView_contentPadding, 0);
        this.f72966m = dimensionPixelSize;
        this.f72967n = dimensionPixelSize;
        this.f72968o = dimensionPixelSize;
        this.f72969p = dimensionPixelSize;
        this.f72966m = obtainStyledAttributes.getDimensionPixelSize(C37098Xl4.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
        this.f72967n = obtainStyledAttributes.getDimensionPixelSize(C37098Xl4.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
        this.f72968o = obtainStyledAttributes.getDimensionPixelSize(C37098Xl4.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
        this.f72969p = obtainStyledAttributes.getDimensionPixelSize(C37098Xl4.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
        this.f72970q = obtainStyledAttributes.getDimensionPixelSize(C37098Xl4.ShapeableImageView_contentPaddingStart, Integer.MIN_VALUE);
        this.f72971r = obtainStyledAttributes.getDimensionPixelSize(C37098Xl4.ShapeableImageView_contentPaddingEnd, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f72958e = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f72963j = C43037iy5.m31540e(context2, attributeSet, i, i2).m31495m();
        setOutlineProvider(new C17828a());
    }
}
