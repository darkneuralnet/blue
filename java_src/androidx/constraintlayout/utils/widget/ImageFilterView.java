package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import androidx.appcompat.widget.AppCompatImageView;
/* loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {

    /* renamed from: b */
    public C11504c f53833b;

    /* renamed from: c */
    public boolean f53834c;

    /* renamed from: d */
    public Drawable f53835d;

    /* renamed from: e */
    public Drawable f53836e;

    /* renamed from: f */
    public float f53837f;

    /* renamed from: g */
    public float f53838g;

    /* renamed from: h */
    public float f53839h;

    /* renamed from: i */
    public Path f53840i;

    /* renamed from: j */
    public ViewOutlineProvider f53841j;

    /* renamed from: k */
    public RectF f53842k;

    /* renamed from: l */
    public Drawable[] f53843l;

    /* renamed from: m */
    public LayerDrawable f53844m;

    /* renamed from: n */
    public float f53845n;

    /* renamed from: o */
    public float f53846o;

    /* renamed from: p */
    public float f53847p;

    /* renamed from: q */
    public float f53848q;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$a */
    /* loaded from: classes.dex */
    public class C11502a extends ViewOutlineProvider {
        public C11502a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * ImageFilterView.this.f53838g) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$b */
    /* loaded from: classes.dex */
    public class C11503b extends ViewOutlineProvider {
        public C11503b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f53839h);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$c */
    /* loaded from: classes.dex */
    public static class C11504c {

        /* renamed from: a */
        public float[] f53851a = new float[20];

        /* renamed from: b */
        public ColorMatrix f53852b = new ColorMatrix();

        /* renamed from: c */
        public ColorMatrix f53853c = new ColorMatrix();

        /* renamed from: d */
        public float f53854d = 1.0f;

        /* renamed from: e */
        public float f53855e = 1.0f;

        /* renamed from: f */
        public float f53856f = 1.0f;

        /* renamed from: g */
        public float f53857g = 1.0f;

        /* renamed from: a */
        public final void m67928a(float f) {
            float[] fArr = this.f53851a;
            fArr[0] = f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: b */
        public final void m67927b(float f) {
            float f2 = 1.0f - f;
            float f3 = 0.2999f * f2;
            float f4 = 0.587f * f2;
            float f5 = f2 * 0.114f;
            float[] fArr = this.f53851a;
            fArr[0] = f3 + f;
            fArr[1] = f4;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = f4 + f;
            fArr[7] = f5;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[12] = f5 + f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: c */
        public void m67926c(ImageView imageView) {
            boolean z;
            this.f53852b.reset();
            float f = this.f53855e;
            boolean z2 = true;
            if (f != 1.0f) {
                m67927b(f);
                this.f53852b.set(this.f53851a);
                z = true;
            } else {
                z = false;
            }
            float f2 = this.f53856f;
            if (f2 != 1.0f) {
                this.f53853c.setScale(f2, f2, f2, 1.0f);
                this.f53852b.postConcat(this.f53853c);
                z = true;
            }
            float f3 = this.f53857g;
            if (f3 != 1.0f) {
                m67925d(f3);
                this.f53853c.set(this.f53851a);
                this.f53852b.postConcat(this.f53853c);
                z = true;
            }
            float f4 = this.f53854d;
            if (f4 != 1.0f) {
                m67928a(f4);
                this.f53853c.set(this.f53851a);
                this.f53852b.postConcat(this.f53853c);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f53852b));
            } else {
                imageView.clearColorFilter();
            }
        }

        /* renamed from: d */
        public final void m67925d(float f) {
            float log;
            float f2;
            float f3;
            if (f <= 0.0f) {
                f = 0.01f;
            }
            float f4 = (5000.0f / f) / 100.0f;
            if (f4 > 66.0f) {
                double d = f4 - 60.0f;
                f2 = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                log = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
            } else {
                log = (((float) Math.log(f4)) * 99.4708f) - 161.11957f;
                f2 = 255.0f;
            }
            if (f4 < 66.0f) {
                if (f4 > 19.0f) {
                    f3 = (((float) Math.log(f4 - 10.0f)) * 138.51773f) - 305.0448f;
                } else {
                    f3 = 0.0f;
                }
            } else {
                f3 = 255.0f;
            }
            float min = Math.min(255.0f, Math.max(f2, 0.0f));
            float min2 = Math.min(255.0f, Math.max(log, 0.0f));
            float min3 = Math.min(255.0f, Math.max(f3, 0.0f));
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max((((float) Math.log(50.0f)) * 99.4708f) - 161.11957f, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log(40.0f)) * 138.51773f) - 305.0448f, 0.0f));
            float[] fArr = this.f53851a;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        this.f53833b = new C11504c();
        this.f53834c = true;
        this.f53835d = null;
        this.f53836e = null;
        this.f53837f = 0.0f;
        this.f53838g = 0.0f;
        this.f53839h = Float.NaN;
        this.f53843l = new Drawable[2];
        this.f53845n = Float.NaN;
        this.f53846o = Float.NaN;
        this.f53847p = Float.NaN;
        this.f53848q = Float.NaN;
        m67932e(context, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: e */
    public final void m67932e(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39341cm4.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f53835d = obtainStyledAttributes.getDrawable(C39341cm4.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.ImageFilterView_crossfade) {
                    this.f53837f = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C39341cm4.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C39341cm4.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C39341cm4.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C39341cm4.ImageFilterView_brightness) {
                    setBrightness(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C39341cm4.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C39341cm4.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C39341cm4.ImageFilterView_overlay) {
                    m67930g(obtainStyledAttributes.getBoolean(index, this.f53834c));
                } else if (index == C39341cm4.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f53845n));
                } else if (index == C39341cm4.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f53846o));
                } else if (index == C39341cm4.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f53848q));
                } else if (index == C39341cm4.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f53847p));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f53836e = drawable;
            if (this.f53835d != null && drawable != null) {
                Drawable[] drawableArr = this.f53843l;
                Drawable mutate = getDrawable().mutate();
                this.f53836e = mutate;
                drawableArr[0] = mutate;
                this.f53843l[1] = this.f53835d.mutate();
                LayerDrawable layerDrawable = new LayerDrawable(this.f53843l);
                this.f53844m = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f53837f * 255.0f));
                if (!this.f53834c) {
                    this.f53844m.getDrawable(0).setAlpha((int) ((1.0f - this.f53837f) * 255.0f));
                }
                super.setImageDrawable(this.f53844m);
                return;
            }
            Drawable drawable2 = getDrawable();
            this.f53836e = drawable2;
            if (drawable2 != null) {
                Drawable[] drawableArr2 = this.f53843l;
                Drawable mutate2 = drawable2.mutate();
                this.f53836e = mutate2;
                drawableArr2[0] = mutate2;
            }
        }
    }

    /* renamed from: f */
    public final void m67931f() {
        float f;
        float f2;
        float f3;
        float f4;
        if (Float.isNaN(this.f53845n) && Float.isNaN(this.f53846o) && Float.isNaN(this.f53847p) && Float.isNaN(this.f53848q)) {
            return;
        }
        float f5 = 0.0f;
        if (Float.isNaN(this.f53845n)) {
            f = 0.0f;
        } else {
            f = this.f53845n;
        }
        if (Float.isNaN(this.f53846o)) {
            f2 = 0.0f;
        } else {
            f2 = this.f53846o;
        }
        if (Float.isNaN(this.f53847p)) {
            f3 = 1.0f;
        } else {
            f3 = this.f53847p;
        }
        if (!Float.isNaN(this.f53848q)) {
            f5 = this.f53848q;
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

    /* renamed from: g */
    public final void m67930g(boolean z) {
        this.f53834c = z;
    }

    /* renamed from: h */
    public final void m67929h() {
        if (Float.isNaN(this.f53845n) && Float.isNaN(this.f53846o) && Float.isNaN(this.f53847p) && Float.isNaN(this.f53848q)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            m67931f();
        }
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        m67931f();
    }

    public void setAltImageResource(int i) {
        Drawable mutate = C29611vi.m8248b(getContext(), i).mutate();
        this.f53835d = mutate;
        Drawable[] drawableArr = this.f53843l;
        drawableArr[0] = this.f53836e;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f53843l);
        this.f53844m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f53837f);
    }

    public void setBrightness(float f) {
        C11504c c11504c = this.f53833b;
        c11504c.f53854d = f;
        c11504c.m67926c(this);
    }

    public void setContrast(float f) {
        C11504c c11504c = this.f53833b;
        c11504c.f53856f = f;
        c11504c.m67926c(this);
    }

    public void setCrossfade(float f) {
        this.f53837f = f;
        if (this.f53843l != null) {
            if (!this.f53834c) {
                this.f53844m.getDrawable(0).setAlpha((int) ((1.0f - this.f53837f) * 255.0f));
            }
            this.f53844m.getDrawable(1).setAlpha((int) (this.f53837f * 255.0f));
            super.setImageDrawable(this.f53844m);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f53835d != null && drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f53836e = mutate;
            Drawable[] drawableArr = this.f53843l;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f53835d;
            LayerDrawable layerDrawable = new LayerDrawable(this.f53843l);
            this.f53844m = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f53837f);
            return;
        }
        super.setImageDrawable(drawable);
    }

    public void setImagePanX(float f) {
        this.f53845n = f;
        m67929h();
    }

    public void setImagePanY(float f) {
        this.f53846o = f;
        m67929h();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f53835d != null) {
            Drawable mutate = C29611vi.m8248b(getContext(), i).mutate();
            this.f53836e = mutate;
            Drawable[] drawableArr = this.f53843l;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f53835d;
            LayerDrawable layerDrawable = new LayerDrawable(this.f53843l);
            this.f53844m = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f53837f);
            return;
        }
        super.setImageResource(i);
    }

    public void setImageRotate(float f) {
        this.f53848q = f;
        m67929h();
    }

    public void setImageZoom(float f) {
        this.f53847p = f;
        m67929h();
    }

    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f53839h = f;
            float f2 = this.f53838g;
            this.f53838g = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f53839h != f) {
            z = true;
        } else {
            z = false;
        }
        this.f53839h = f;
        if (f != 0.0f) {
            if (this.f53840i == null) {
                this.f53840i = new Path();
            }
            if (this.f53842k == null) {
                this.f53842k = new RectF();
            }
            if (this.f53841j == null) {
                C11503b c11503b = new C11503b();
                this.f53841j = c11503b;
                setOutlineProvider(c11503b);
            }
            setClipToOutline(true);
            this.f53842k.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f53840i.reset();
            Path path = this.f53840i;
            RectF rectF = this.f53842k;
            float f3 = this.f53839h;
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
        if (this.f53838g != f) {
            z = true;
        } else {
            z = false;
        }
        this.f53838g = f;
        if (f != 0.0f) {
            if (this.f53840i == null) {
                this.f53840i = new Path();
            }
            if (this.f53842k == null) {
                this.f53842k = new RectF();
            }
            if (this.f53841j == null) {
                C11502a c11502a = new C11502a();
                this.f53841j = c11502a;
                setOutlineProvider(c11502a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f53838g) / 2.0f;
            this.f53842k.set(0.0f, 0.0f, width, height);
            this.f53840i.reset();
            this.f53840i.addRoundRect(this.f53842k, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        C11504c c11504c = this.f53833b;
        c11504c.f53855e = f;
        c11504c.m67926c(this);
    }

    public void setWarmth(float f) {
        C11504c c11504c = this.f53833b;
        c11504c.f53857g = f;
        c11504c.m67926c(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53833b = new C11504c();
        this.f53834c = true;
        this.f53835d = null;
        this.f53836e = null;
        this.f53837f = 0.0f;
        this.f53838g = 0.0f;
        this.f53839h = Float.NaN;
        this.f53843l = new Drawable[2];
        this.f53845n = Float.NaN;
        this.f53846o = Float.NaN;
        this.f53847p = Float.NaN;
        this.f53848q = Float.NaN;
        m67932e(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53833b = new C11504c();
        this.f53834c = true;
        this.f53835d = null;
        this.f53836e = null;
        this.f53837f = 0.0f;
        this.f53838g = 0.0f;
        this.f53839h = Float.NaN;
        this.f53843l = new Drawable[2];
        this.f53845n = Float.NaN;
        this.f53846o = Float.NaN;
        this.f53847p = Float.NaN;
        this.f53848q = Float.NaN;
        m67932e(context, attributeSet);
    }
}
