package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import okhttp3.internal.http2.Settings;
/* loaded from: classes.dex */
public class MotionLabel extends View implements InterfaceC47144pu1 {

    /* renamed from: t0 */
    public static String f53876t0 = "MotionLabel";

    /* renamed from: A */
    public boolean f53877A;

    /* renamed from: B */
    public float f53878B;

    /* renamed from: C */
    public float f53879C;

    /* renamed from: D */
    public float f53880D;

    /* renamed from: E */
    public Drawable f53881E;

    /* renamed from: F */
    public Matrix f53882F;

    /* renamed from: G */
    public Bitmap f53883G;

    /* renamed from: H */
    public BitmapShader f53884H;

    /* renamed from: I */
    public Matrix f53885I;

    /* renamed from: J */
    public float f53886J;

    /* renamed from: K */
    public float f53887K;

    /* renamed from: P */
    public float f53888P;

    /* renamed from: Q */
    public float f53889Q;

    /* renamed from: R */
    public Paint f53890R;

    /* renamed from: S */
    public int f53891S;

    /* renamed from: T */
    public Rect f53892T;

    /* renamed from: U */
    public Paint f53893U;

    /* renamed from: W */
    public float f53894W;

    /* renamed from: b */
    public TextPaint f53895b;

    /* renamed from: c */
    public Path f53896c;

    /* renamed from: d */
    public int f53897d;

    /* renamed from: e */
    public int f53898e;

    /* renamed from: f */
    public boolean f53899f;

    /* renamed from: g */
    public float f53900g;

    /* renamed from: h */
    public float f53901h;

    /* renamed from: i */
    public ViewOutlineProvider f53902i;

    /* renamed from: j */
    public RectF f53903j;

    /* renamed from: k */
    public float f53904k;

    /* renamed from: l */
    public float f53905l;

    /* renamed from: m */
    public int f53906m;

    /* renamed from: n */
    public int f53907n;

    /* renamed from: o */
    public float f53908o;

    /* renamed from: p */
    public String f53909p;

    /* renamed from: p0 */
    public float f53910p0;

    /* renamed from: q */
    public boolean f53911q;

    /* renamed from: q0 */
    public float f53912q0;

    /* renamed from: r */
    public Rect f53913r;

    /* renamed from: r0 */
    public float f53914r0;

    /* renamed from: s */
    public int f53915s;

    /* renamed from: s0 */
    public float f53916s0;

    /* renamed from: t */
    public int f53917t;

    /* renamed from: u */
    public int f53918u;

    /* renamed from: v */
    public int f53919v;

    /* renamed from: w */
    public String f53920w;

    /* renamed from: x */
    public Layout f53921x;

    /* renamed from: y */
    public int f53922y;

    /* renamed from: z */
    public int f53923z;

    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$a */
    /* loaded from: classes.dex */
    public class C11507a extends ViewOutlineProvider {
        public C11507a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = MotionLabel.this.getWidth();
            int height = MotionLabel.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * MotionLabel.this.f53900g) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$b */
    /* loaded from: classes.dex */
    public class C11508b extends ViewOutlineProvider {
        public C11508b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f53901h);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        this.f53895b = new TextPaint();
        this.f53896c = new Path();
        this.f53897d = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f53898e = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f53899f = false;
        this.f53900g = 0.0f;
        this.f53901h = Float.NaN;
        this.f53904k = 48.0f;
        this.f53905l = Float.NaN;
        this.f53908o = 0.0f;
        this.f53909p = "Hello World";
        this.f53911q = true;
        this.f53913r = new Rect();
        this.f53915s = 1;
        this.f53917t = 1;
        this.f53918u = 1;
        this.f53919v = 1;
        this.f53922y = 8388659;
        this.f53923z = 0;
        this.f53877A = false;
        this.f53886J = Float.NaN;
        this.f53887K = Float.NaN;
        this.f53888P = 0.0f;
        this.f53889Q = 0.0f;
        this.f53890R = new Paint();
        this.f53891S = 0;
        this.f53910p0 = Float.NaN;
        this.f53912q0 = Float.NaN;
        this.f53914r0 = Float.NaN;
        this.f53916s0 = Float.NaN;
        m67913i(context, null);
    }

    @Override // p000.InterfaceC47144pu1
    /* renamed from: a */
    public void mo18445a(float f, float f2, float f3, float f4) {
        float f5;
        int i = (int) (f + 0.5f);
        this.f53878B = f - i;
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f6 = f3 - f;
        this.f53879C = f6;
        float f7 = f4 - f2;
        this.f53880D = f7;
        m67918d(f, f2, f3, f4);
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        }
        if (this.f53877A) {
            if (this.f53892T == null) {
                this.f53893U = new Paint();
                this.f53892T = new Rect();
                this.f53893U.set(this.f53895b);
                this.f53894W = this.f53893U.getTextSize();
            }
            this.f53879C = f6;
            this.f53880D = f7;
            Paint paint = this.f53893U;
            String str = this.f53909p;
            paint.getTextBounds(str, 0, str.length(), this.f53892T);
            float height = this.f53892T.height() * 1.3f;
            float f8 = (f6 - this.f53917t) - this.f53915s;
            float f9 = (f7 - this.f53919v) - this.f53918u;
            float width = this.f53892T.width();
            if (width * f9 > height * f8) {
                this.f53895b.setTextSize((this.f53894W * f8) / width);
            } else {
                this.f53895b.setTextSize((this.f53894W * f9) / height);
            }
            if (this.f53899f || !Float.isNaN(this.f53905l)) {
                if (Float.isNaN(this.f53905l)) {
                    f5 = 1.0f;
                } else {
                    f5 = this.f53904k / this.f53905l;
                }
                m67916f(f5);
            }
        }
    }

    /* renamed from: d */
    public final void m67918d(float f, float f2, float f3, float f4) {
        if (this.f53885I == null) {
            return;
        }
        this.f53879C = f3 - f;
        this.f53880D = f4 - f2;
        m67908n();
    }

    /* renamed from: e */
    public Bitmap m67917e(Bitmap bitmap, int i) {
        System.nanoTime();
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i2 = 0; i2 < i && width >= 32 && height >= 32; i2++) {
            width /= 2;
            height /= 2;
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
        }
        return createScaledBitmap;
    }

    /* renamed from: f */
    public void m67916f(float f) {
        if (!this.f53899f && f == 1.0f) {
            return;
        }
        this.f53896c.reset();
        String str = this.f53909p;
        int length = str.length();
        this.f53895b.getTextBounds(str, 0, length, this.f53913r);
        this.f53895b.getTextPath(str, 0, length, 0.0f, 0.0f, this.f53896c);
        if (f != 1.0f) {
            Log.v(f53876t0, FU0.m107120a() + " scale " + f);
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            this.f53896c.transform(matrix);
        }
        Rect rect = this.f53913r;
        rect.right--;
        rect.left++;
        rect.bottom++;
        rect.top--;
        RectF rectF = new RectF();
        rectF.bottom = getHeight();
        rectF.right = getWidth();
        this.f53911q = false;
    }

    /* renamed from: g */
    public final float m67915g() {
        float f;
        float f2;
        if (Float.isNaN(this.f53905l)) {
            f = 1.0f;
        } else {
            f = this.f53904k / this.f53905l;
        }
        TextPaint textPaint = this.f53895b;
        String str = this.f53909p;
        float measureText = f * textPaint.measureText(str, 0, str.length());
        if (Float.isNaN(this.f53879C)) {
            f2 = getMeasuredWidth();
        } else {
            f2 = this.f53879C;
        }
        return ((((f2 - getPaddingLeft()) - getPaddingRight()) - measureText) * (this.f53888P + 1.0f)) / 2.0f;
    }

    /* renamed from: h */
    public final float m67914h() {
        float f;
        float f2;
        if (Float.isNaN(this.f53905l)) {
            f = 1.0f;
        } else {
            f = this.f53904k / this.f53905l;
        }
        Paint.FontMetrics fontMetrics = this.f53895b.getFontMetrics();
        if (Float.isNaN(this.f53880D)) {
            f2 = getMeasuredHeight();
        } else {
            f2 = this.f53880D;
        }
        float paddingTop = (f2 - getPaddingTop()) - getPaddingBottom();
        float f3 = fontMetrics.descent;
        float f4 = fontMetrics.ascent;
        return (((paddingTop - ((f3 - f4) * f)) * (1.0f - this.f53889Q)) / 2.0f) - (f * f4);
    }

    /* renamed from: i */
    public final void m67913i(Context context, AttributeSet attributeSet) {
        m67911k(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39341cm4.MotionLabel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.MotionLabel_android_text) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == C39341cm4.MotionLabel_android_fontFamily) {
                    this.f53920w = obtainStyledAttributes.getString(index);
                } else if (index == C39341cm4.MotionLabel_scaleFromTextSize) {
                    this.f53905l = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f53905l);
                } else if (index == C39341cm4.MotionLabel_android_textSize) {
                    this.f53904k = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f53904k);
                } else if (index == C39341cm4.MotionLabel_android_textStyle) {
                    this.f53906m = obtainStyledAttributes.getInt(index, this.f53906m);
                } else if (index == C39341cm4.MotionLabel_android_typeface) {
                    this.f53907n = obtainStyledAttributes.getInt(index, this.f53907n);
                } else if (index == C39341cm4.MotionLabel_android_textColor) {
                    this.f53897d = obtainStyledAttributes.getColor(index, this.f53897d);
                } else if (index == C39341cm4.MotionLabel_borderRound) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.f53901h);
                    this.f53901h = dimension;
                    setRound(dimension);
                } else if (index == C39341cm4.MotionLabel_borderRoundPercent) {
                    float f = obtainStyledAttributes.getFloat(index, this.f53900g);
                    this.f53900g = f;
                    setRoundPercent(f);
                } else if (index == C39341cm4.MotionLabel_android_gravity) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == C39341cm4.MotionLabel_android_autoSizeTextType) {
                    this.f53923z = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C39341cm4.MotionLabel_textOutlineColor) {
                    this.f53898e = obtainStyledAttributes.getInt(index, this.f53898e);
                    this.f53899f = true;
                } else if (index == C39341cm4.MotionLabel_textOutlineThickness) {
                    this.f53908o = obtainStyledAttributes.getDimension(index, this.f53908o);
                    this.f53899f = true;
                } else if (index == C39341cm4.MotionLabel_textBackground) {
                    this.f53881E = obtainStyledAttributes.getDrawable(index);
                    this.f53899f = true;
                } else if (index == C39341cm4.MotionLabel_textBackgroundPanX) {
                    this.f53910p0 = obtainStyledAttributes.getFloat(index, this.f53910p0);
                } else if (index == C39341cm4.MotionLabel_textBackgroundPanY) {
                    this.f53912q0 = obtainStyledAttributes.getFloat(index, this.f53912q0);
                } else if (index == C39341cm4.MotionLabel_textPanX) {
                    this.f53888P = obtainStyledAttributes.getFloat(index, this.f53888P);
                } else if (index == C39341cm4.MotionLabel_textPanY) {
                    this.f53889Q = obtainStyledAttributes.getFloat(index, this.f53889Q);
                } else if (index == C39341cm4.MotionLabel_textBackgroundRotate) {
                    this.f53916s0 = obtainStyledAttributes.getFloat(index, this.f53916s0);
                } else if (index == C39341cm4.MotionLabel_textBackgroundZoom) {
                    this.f53914r0 = obtainStyledAttributes.getFloat(index, this.f53914r0);
                } else if (index == C39341cm4.MotionLabel_textureHeight) {
                    this.f53886J = obtainStyledAttributes.getDimension(index, this.f53886J);
                } else if (index == C39341cm4.MotionLabel_textureWidth) {
                    this.f53887K = obtainStyledAttributes.getDimension(index, this.f53887K);
                } else if (index == C39341cm4.MotionLabel_textureEffect) {
                    this.f53891S = obtainStyledAttributes.getInt(index, this.f53891S);
                }
            }
            obtainStyledAttributes.recycle();
        }
        m67909m();
        m67910l();
    }

    /* renamed from: j */
    public final void m67912j(String str, int i, int i2) {
        Typeface typeface;
        Typeface create;
        int i3;
        if (str != null) {
            typeface = Typeface.create(str, i2);
            if (typeface != null) {
                setTypeface(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        float f = 0.0f;
        if (i2 > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i2);
            } else {
                create = Typeface.create(typeface, i2);
            }
            setTypeface(create);
            if (create != null) {
                i3 = create.getStyle();
            } else {
                i3 = 0;
            }
            int i4 = (~i3) & i2;
            TextPaint textPaint = this.f53895b;
            if ((i4 & 1) == 0) {
                z = false;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f53895b;
            if ((i4 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f53895b.setFakeBoldText(false);
        this.f53895b.setTextSkewX(0.0f);
        setTypeface(typeface);
    }

    /* renamed from: k */
    public final void m67911k(Context context, AttributeSet attributeSet) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C50553vf4.colorPrimary, typedValue, true);
        TextPaint textPaint = this.f53895b;
        int i = typedValue.data;
        this.f53897d = i;
        textPaint.setColor(i);
    }

    /* renamed from: l */
    public void m67910l() {
        this.f53915s = getPaddingLeft();
        this.f53917t = getPaddingRight();
        this.f53918u = getPaddingTop();
        this.f53919v = getPaddingBottom();
        m67912j(this.f53920w, this.f53907n, this.f53906m);
        this.f53895b.setColor(this.f53897d);
        this.f53895b.setStrokeWidth(this.f53908o);
        this.f53895b.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f53895b.setFlags(128);
        setTextSize(this.f53904k);
        this.f53895b.setAntiAlias(true);
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        float f;
        super.layout(i, i2, i3, i4);
        boolean isNaN = Float.isNaN(this.f53905l);
        if (isNaN) {
            f = 1.0f;
        } else {
            f = this.f53904k / this.f53905l;
        }
        this.f53879C = i3 - i;
        this.f53880D = i4 - i2;
        if (this.f53877A) {
            if (this.f53892T == null) {
                this.f53893U = new Paint();
                this.f53892T = new Rect();
                this.f53893U.set(this.f53895b);
                this.f53894W = this.f53893U.getTextSize();
            }
            Paint paint = this.f53893U;
            String str = this.f53909p;
            paint.getTextBounds(str, 0, str.length(), this.f53892T);
            int width = this.f53892T.width();
            int height = (int) (this.f53892T.height() * 1.3f);
            float f2 = (this.f53879C - this.f53917t) - this.f53915s;
            float f3 = (this.f53880D - this.f53919v) - this.f53918u;
            if (isNaN) {
                float f4 = width;
                float f5 = height;
                if (f4 * f3 > f5 * f2) {
                    this.f53895b.setTextSize((this.f53894W * f2) / f4);
                } else {
                    this.f53895b.setTextSize((this.f53894W * f3) / f5);
                }
            } else {
                float f6 = width;
                float f7 = height;
                if (f6 * f3 > f7 * f2) {
                    f = f2 / f6;
                } else {
                    f = f3 / f7;
                }
            }
        }
        if (this.f53899f || !isNaN) {
            m67918d(i, i2, i3, i4);
            m67916f(f);
        }
    }

    /* renamed from: m */
    public final void m67909m() {
        if (this.f53881E != null) {
            this.f53885I = new Matrix();
            int intrinsicWidth = this.f53881E.getIntrinsicWidth();
            int intrinsicHeight = this.f53881E.getIntrinsicHeight();
            int i = 128;
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                if (Float.isNaN(this.f53887K)) {
                    intrinsicWidth = 128;
                } else {
                    intrinsicWidth = (int) this.f53887K;
                }
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                if (!Float.isNaN(this.f53886J)) {
                    i = (int) this.f53886J;
                }
                intrinsicHeight = i;
            }
            if (this.f53891S != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f53883G = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f53883G);
            this.f53881E.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f53881E.setFilterBitmap(true);
            this.f53881E.draw(canvas);
            if (this.f53891S != 0) {
                this.f53883G = m67917e(this.f53883G, 4);
            }
            Bitmap bitmap = this.f53883G;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f53884H = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    /* renamed from: n */
    public final void m67908n() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = 0.0f;
        if (Float.isNaN(this.f53910p0)) {
            f = 0.0f;
        } else {
            f = this.f53910p0;
        }
        if (Float.isNaN(this.f53912q0)) {
            f2 = 0.0f;
        } else {
            f2 = this.f53912q0;
        }
        if (Float.isNaN(this.f53914r0)) {
            f3 = 1.0f;
        } else {
            f3 = this.f53914r0;
        }
        if (!Float.isNaN(this.f53916s0)) {
            f7 = this.f53916s0;
        }
        this.f53885I.reset();
        float width = this.f53883G.getWidth();
        float height = this.f53883G.getHeight();
        if (Float.isNaN(this.f53887K)) {
            f4 = this.f53879C;
        } else {
            f4 = this.f53887K;
        }
        if (Float.isNaN(this.f53886J)) {
            f5 = this.f53880D;
        } else {
            f5 = this.f53886J;
        }
        if (width * f5 < height * f4) {
            f6 = f4 / width;
        } else {
            f6 = f5 / height;
        }
        float f8 = f3 * f6;
        this.f53885I.postScale(f8, f8);
        float f9 = width * f8;
        float f10 = f4 - f9;
        float f11 = f8 * height;
        float f12 = f5 - f11;
        if (!Float.isNaN(this.f53886J)) {
            f12 = this.f53886J / 2.0f;
        }
        if (!Float.isNaN(this.f53887K)) {
            f10 = this.f53887K / 2.0f;
        }
        this.f53885I.postTranslate((((f * f10) + f4) - f9) * 0.5f, (((f2 * f12) + f5) - f11) * 0.5f);
        this.f53885I.postRotate(f7, f4 / 2.0f, f5 / 2.0f);
        this.f53884H.setLocalMatrix(this.f53885I);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        if (Float.isNaN(this.f53905l)) {
            f = 1.0f;
        } else {
            f = this.f53904k / this.f53905l;
        }
        super.onDraw(canvas);
        if (!this.f53899f && f == 1.0f) {
            canvas.drawText(this.f53909p, this.f53878B + this.f53915s + m67915g(), this.f53918u + m67914h(), this.f53895b);
            return;
        }
        if (this.f53911q) {
            m67916f(f);
        }
        if (this.f53882F == null) {
            this.f53882F = new Matrix();
        }
        if (this.f53899f) {
            this.f53890R.set(this.f53895b);
            this.f53882F.reset();
            float m67915g = this.f53915s + m67915g();
            float m67914h = this.f53918u + m67914h();
            this.f53882F.postTranslate(m67915g, m67914h);
            this.f53882F.preScale(f, f);
            this.f53896c.transform(this.f53882F);
            if (this.f53884H != null) {
                this.f53895b.setFilterBitmap(true);
                this.f53895b.setShader(this.f53884H);
            } else {
                this.f53895b.setColor(this.f53897d);
            }
            this.f53895b.setStyle(Paint.Style.FILL);
            this.f53895b.setStrokeWidth(this.f53908o);
            canvas.drawPath(this.f53896c, this.f53895b);
            if (this.f53884H != null) {
                this.f53895b.setShader(null);
            }
            this.f53895b.setColor(this.f53898e);
            this.f53895b.setStyle(Paint.Style.STROKE);
            this.f53895b.setStrokeWidth(this.f53908o);
            canvas.drawPath(this.f53896c, this.f53895b);
            this.f53882F.reset();
            this.f53882F.postTranslate(-m67915g, -m67914h);
            this.f53896c.transform(this.f53882F);
            this.f53895b.set(this.f53890R);
            return;
        }
        float m67915g2 = this.f53915s + m67915g();
        float m67914h2 = this.f53918u + m67914h();
        this.f53882F.reset();
        this.f53882F.preTranslate(m67915g2, m67914h2);
        this.f53896c.transform(this.f53882F);
        this.f53895b.setColor(this.f53897d);
        this.f53895b.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f53895b.setStrokeWidth(this.f53908o);
        canvas.drawPath(this.f53896c, this.f53895b);
        this.f53882F.reset();
        this.f53882F.preTranslate(-m67915g2, -m67914h2);
        this.f53896c.transform(this.f53882F);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f53877A = false;
        this.f53915s = getPaddingLeft();
        this.f53917t = getPaddingRight();
        this.f53918u = getPaddingTop();
        this.f53919v = getPaddingBottom();
        if (mode == 1073741824 && mode2 == 1073741824) {
            if (this.f53923z != 0) {
                this.f53877A = true;
            }
        } else {
            TextPaint textPaint = this.f53895b;
            String str = this.f53909p;
            textPaint.getTextBounds(str, 0, str.length(), this.f53913r);
            if (mode != 1073741824) {
                size = (int) (this.f53913r.width() + 0.99999f);
            }
            size += this.f53915s + this.f53917t;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f53895b.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f53918u + this.f53919v + fontMetricsInt;
            }
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i) {
        if ((i & 8388615) == 0) {
            i |= 8388611;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.f53922y) {
            invalidate();
        }
        this.f53922y = i;
        int i2 = i & 112;
        if (i2 != 48) {
            if (i2 != 80) {
                this.f53889Q = 0.0f;
            } else {
                this.f53889Q = 1.0f;
            }
        } else {
            this.f53889Q = -1.0f;
        }
        int i3 = i & 8388615;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.f53888P = 0.0f;
                        return;
                    }
                }
            }
            this.f53888P = 1.0f;
            return;
        }
        this.f53888P = -1.0f;
    }

    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f53901h = f;
            float f2 = this.f53900g;
            this.f53900g = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f53901h != f) {
            z = true;
        } else {
            z = false;
        }
        this.f53901h = f;
        if (f != 0.0f) {
            if (this.f53896c == null) {
                this.f53896c = new Path();
            }
            if (this.f53903j == null) {
                this.f53903j = new RectF();
            }
            if (this.f53902i == null) {
                C11508b c11508b = new C11508b();
                this.f53902i = c11508b;
                setOutlineProvider(c11508b);
            }
            setClipToOutline(true);
            this.f53903j.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f53896c.reset();
            Path path = this.f53896c;
            RectF rectF = this.f53903j;
            float f3 = this.f53901h;
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
        if (this.f53900g != f) {
            z = true;
        } else {
            z = false;
        }
        this.f53900g = f;
        if (f != 0.0f) {
            if (this.f53896c == null) {
                this.f53896c = new Path();
            }
            if (this.f53903j == null) {
                this.f53903j = new RectF();
            }
            if (this.f53902i == null) {
                C11507a c11507a = new C11507a();
                this.f53902i = c11507a;
                setOutlineProvider(c11507a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f53900g) / 2.0f;
            this.f53903j.set(0.0f, 0.0f, width, height);
            this.f53896c.reset();
            this.f53896c.addRoundRect(this.f53903j, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.f53905l = f;
    }

    public void setText(CharSequence charSequence) {
        this.f53909p = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.f53910p0 = f;
        m67908n();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.f53912q0 = f;
        m67908n();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.f53916s0 = f;
        m67908n();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.f53914r0 = f;
        m67908n();
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.f53897d = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.f53898e = i;
        this.f53899f = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.f53908o = f;
        this.f53899f = true;
        if (Float.isNaN(f)) {
            this.f53908o = 1.0f;
            this.f53899f = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.f53888P = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.f53889Q = f;
        invalidate();
    }

    public void setTextSize(float f) {
        float f2;
        this.f53904k = f;
        String str = f53876t0;
        Log.v(str, FU0.m107120a() + "  " + f + " / " + this.f53905l);
        TextPaint textPaint = this.f53895b;
        if (!Float.isNaN(this.f53905l)) {
            f = this.f53905l;
        }
        textPaint.setTextSize(f);
        if (Float.isNaN(this.f53905l)) {
            f2 = 1.0f;
        } else {
            f2 = this.f53904k / this.f53905l;
        }
        m67916f(f2);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f) {
        this.f53886J = f;
        m67908n();
        invalidate();
    }

    public void setTextureWidth(float f) {
        this.f53887K = f;
        m67908n();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (this.f53895b.getTypeface() != typeface) {
            this.f53895b.setTypeface(typeface);
            if (this.f53921x != null) {
                this.f53921x = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53895b = new TextPaint();
        this.f53896c = new Path();
        this.f53897d = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f53898e = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f53899f = false;
        this.f53900g = 0.0f;
        this.f53901h = Float.NaN;
        this.f53904k = 48.0f;
        this.f53905l = Float.NaN;
        this.f53908o = 0.0f;
        this.f53909p = "Hello World";
        this.f53911q = true;
        this.f53913r = new Rect();
        this.f53915s = 1;
        this.f53917t = 1;
        this.f53918u = 1;
        this.f53919v = 1;
        this.f53922y = 8388659;
        this.f53923z = 0;
        this.f53877A = false;
        this.f53886J = Float.NaN;
        this.f53887K = Float.NaN;
        this.f53888P = 0.0f;
        this.f53889Q = 0.0f;
        this.f53890R = new Paint();
        this.f53891S = 0;
        this.f53910p0 = Float.NaN;
        this.f53912q0 = Float.NaN;
        this.f53914r0 = Float.NaN;
        this.f53916s0 = Float.NaN;
        m67913i(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53895b = new TextPaint();
        this.f53896c = new Path();
        this.f53897d = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f53898e = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f53899f = false;
        this.f53900g = 0.0f;
        this.f53901h = Float.NaN;
        this.f53904k = 48.0f;
        this.f53905l = Float.NaN;
        this.f53908o = 0.0f;
        this.f53909p = "Hello World";
        this.f53911q = true;
        this.f53913r = new Rect();
        this.f53915s = 1;
        this.f53917t = 1;
        this.f53918u = 1;
        this.f53919v = 1;
        this.f53922y = 8388659;
        this.f53923z = 0;
        this.f53877A = false;
        this.f53886J = Float.NaN;
        this.f53887K = Float.NaN;
        this.f53888P = 0.0f;
        this.f53889Q = 0.0f;
        this.f53890R = new Paint();
        this.f53891S = 0;
        this.f53910p0 = Float.NaN;
        this.f53912q0 = Float.NaN;
        this.f53914r0 = Float.NaN;
        this.f53916s0 = Float.NaN;
        m67913i(context, attributeSet);
    }
}
