package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
/* loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: e */
    public ImageFilterView.C11504c f53815e;

    /* renamed from: f */
    public float f53816f;

    /* renamed from: g */
    public float f53817g;

    /* renamed from: h */
    public float f53818h;

    /* renamed from: i */
    public Path f53819i;

    /* renamed from: j */
    public ViewOutlineProvider f53820j;

    /* renamed from: k */
    public RectF f53821k;

    /* renamed from: l */
    public Drawable[] f53822l;

    /* renamed from: m */
    public LayerDrawable f53823m;

    /* renamed from: n */
    public boolean f53824n;

    /* renamed from: o */
    public Drawable f53825o;

    /* renamed from: p */
    public Drawable f53826p;

    /* renamed from: q */
    public float f53827q;

    /* renamed from: r */
    public float f53828r;

    /* renamed from: s */
    public float f53829s;

    /* renamed from: t */
    public float f53830t;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$a */
    /* loaded from: classes.dex */
    public class C11500a extends ViewOutlineProvider {
        public C11500a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = ImageFilterButton.this.getWidth();
            int height = ImageFilterButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * ImageFilterButton.this.f53817g) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$b */
    /* loaded from: classes.dex */
    public class C11501b extends ViewOutlineProvider {
        public C11501b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f53818h);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        this.f53815e = new ImageFilterView.C11504c();
        this.f53816f = 0.0f;
        this.f53817g = 0.0f;
        this.f53818h = Float.NaN;
        this.f53822l = new Drawable[2];
        this.f53824n = true;
        this.f53825o = null;
        this.f53826p = null;
        this.f53827q = Float.NaN;
        this.f53828r = Float.NaN;
        this.f53829s = Float.NaN;
        this.f53830t = Float.NaN;
        m67938c(context, null);
    }

    /* renamed from: c */
    public final void m67938c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39341cm4.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f53825o = obtainStyledAttributes.getDrawable(C39341cm4.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.ImageFilterView_crossfade) {
                    this.f53816f = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C39341cm4.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C39341cm4.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C39341cm4.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C39341cm4.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C39341cm4.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C39341cm4.ImageFilterView_overlay) {
                    m67936e(obtainStyledAttributes.getBoolean(index, this.f53824n));
                } else if (index == C39341cm4.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f53827q));
                } else if (index == C39341cm4.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f53828r));
                } else if (index == C39341cm4.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f53830t));
                } else if (index == C39341cm4.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f53829s));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f53826p = drawable;
            if (this.f53825o != null && drawable != null) {
                Drawable[] drawableArr = this.f53822l;
                Drawable mutate = getDrawable().mutate();
                this.f53826p = mutate;
                drawableArr[0] = mutate;
                this.f53822l[1] = this.f53825o.mutate();
                LayerDrawable layerDrawable = new LayerDrawable(this.f53822l);
                this.f53823m = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f53816f * 255.0f));
                if (!this.f53824n) {
                    this.f53823m.getDrawable(0).setAlpha((int) ((1.0f - this.f53816f) * 255.0f));
                }
                super.setImageDrawable(this.f53823m);
                return;
            }
            Drawable drawable2 = getDrawable();
            this.f53826p = drawable2;
            if (drawable2 != null) {
                Drawable[] drawableArr2 = this.f53822l;
                Drawable mutate2 = drawable2.mutate();
                this.f53826p = mutate2;
                drawableArr2[0] = mutate2;
            }
        }
    }

    /* renamed from: d */
    public final void m67937d() {
        float f;
        float f2;
        float f3;
        float f4;
        if (Float.isNaN(this.f53827q) && Float.isNaN(this.f53828r) && Float.isNaN(this.f53829s) && Float.isNaN(this.f53830t)) {
            return;
        }
        float f5 = 0.0f;
        if (Float.isNaN(this.f53827q)) {
            f = 0.0f;
        } else {
            f = this.f53827q;
        }
        if (Float.isNaN(this.f53828r)) {
            f2 = 0.0f;
        } else {
            f2 = this.f53828r;
        }
        if (Float.isNaN(this.f53829s)) {
            f3 = 1.0f;
        } else {
            f3 = this.f53829s;
        }
        if (!Float.isNaN(this.f53830t)) {
            f5 = this.f53830t;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        if (intrinsicWidth * height < intrinsicHeight * width) {
            f4 = width / intrinsicWidth;
        } else {
            f4 = height / intrinsicHeight;
        }
        float f6 = f3 * f4;
        matrix.postScale(f6, f6);
        float f7 = intrinsicWidth * f6;
        float f8 = f6 * intrinsicHeight;
        matrix.postTranslate((((f * (width - f7)) + width) - f7) * 0.5f, (((f2 * (height - f8)) + height) - f8) * 0.5f);
        matrix.postRotate(f5, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: e */
    public final void m67936e(boolean z) {
        this.f53824n = z;
    }

    /* renamed from: f */
    public final void m67935f() {
        if (Float.isNaN(this.f53827q) && Float.isNaN(this.f53828r) && Float.isNaN(this.f53829s) && Float.isNaN(this.f53830t)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            m67937d();
        }
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        m67937d();
    }

    public void setAltImageResource(int i) {
        Drawable mutate = C29611vi.m8248b(getContext(), i).mutate();
        this.f53825o = mutate;
        Drawable[] drawableArr = this.f53822l;
        drawableArr[0] = this.f53826p;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f53822l);
        this.f53823m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f53816f);
    }

    public void setBrightness(float f) {
        ImageFilterView.C11504c c11504c = this.f53815e;
        c11504c.f53854d = f;
        c11504c.m67926c(this);
    }

    public void setContrast(float f) {
        ImageFilterView.C11504c c11504c = this.f53815e;
        c11504c.f53856f = f;
        c11504c.m67926c(this);
    }

    public void setCrossfade(float f) {
        this.f53816f = f;
        if (this.f53822l != null) {
            if (!this.f53824n) {
                this.f53823m.getDrawable(0).setAlpha((int) ((1.0f - this.f53816f) * 255.0f));
            }
            this.f53823m.getDrawable(1).setAlpha((int) (this.f53816f * 255.0f));
            super.setImageDrawable(this.f53823m);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f53825o != null && drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f53826p = mutate;
            Drawable[] drawableArr = this.f53822l;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f53825o;
            LayerDrawable layerDrawable = new LayerDrawable(this.f53822l);
            this.f53823m = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f53816f);
            return;
        }
        super.setImageDrawable(drawable);
    }

    public void setImagePanX(float f) {
        this.f53827q = f;
        m67935f();
    }

    public void setImagePanY(float f) {
        this.f53828r = f;
        m67935f();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f53825o != null) {
            Drawable mutate = C29611vi.m8248b(getContext(), i).mutate();
            this.f53826p = mutate;
            Drawable[] drawableArr = this.f53822l;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f53825o;
            LayerDrawable layerDrawable = new LayerDrawable(this.f53822l);
            this.f53823m = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f53816f);
            return;
        }
        super.setImageResource(i);
    }

    public void setImageRotate(float f) {
        this.f53830t = f;
        m67935f();
    }

    public void setImageZoom(float f) {
        this.f53829s = f;
        m67935f();
    }

    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f53818h = f;
            float f2 = this.f53817g;
            this.f53817g = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f53818h != f) {
            z = true;
        } else {
            z = false;
        }
        this.f53818h = f;
        if (f != 0.0f) {
            if (this.f53819i == null) {
                this.f53819i = new Path();
            }
            if (this.f53821k == null) {
                this.f53821k = new RectF();
            }
            if (this.f53820j == null) {
                C11501b c11501b = new C11501b();
                this.f53820j = c11501b;
                setOutlineProvider(c11501b);
            }
            setClipToOutline(true);
            this.f53821k.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f53819i.reset();
            Path path = this.f53819i;
            RectF rectF = this.f53821k;
            float f3 = this.f53818h;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z;
        if (this.f53817g != f) {
            z = true;
        } else {
            z = false;
        }
        this.f53817g = f;
        if (f != 0.0f) {
            if (this.f53819i == null) {
                this.f53819i = new Path();
            }
            if (this.f53821k == null) {
                this.f53821k = new RectF();
            }
            if (this.f53820j == null) {
                C11500a c11500a = new C11500a();
                this.f53820j = c11500a;
                setOutlineProvider(c11500a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f53817g) / 2.0f;
            this.f53821k.set(0.0f, 0.0f, width, height);
            this.f53819i.reset();
            this.f53819i.addRoundRect(this.f53821k, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        ImageFilterView.C11504c c11504c = this.f53815e;
        c11504c.f53855e = f;
        c11504c.m67926c(this);
    }

    public void setWarmth(float f) {
        ImageFilterView.C11504c c11504c = this.f53815e;
        c11504c.f53857g = f;
        c11504c.m67926c(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53815e = new ImageFilterView.C11504c();
        this.f53816f = 0.0f;
        this.f53817g = 0.0f;
        this.f53818h = Float.NaN;
        this.f53822l = new Drawable[2];
        this.f53824n = true;
        this.f53825o = null;
        this.f53826p = null;
        this.f53827q = Float.NaN;
        this.f53828r = Float.NaN;
        this.f53829s = Float.NaN;
        this.f53830t = Float.NaN;
        m67938c(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53815e = new ImageFilterView.C11504c();
        this.f53816f = 0.0f;
        this.f53817g = 0.0f;
        this.f53818h = Float.NaN;
        this.f53822l = new Drawable[2];
        this.f53824n = true;
        this.f53825o = null;
        this.f53826p = null;
        this.f53827q = Float.NaN;
        this.f53828r = Float.NaN;
        this.f53829s = Float.NaN;
        this.f53830t = Float.NaN;
        m67938c(context, attributeSet);
    }
}
