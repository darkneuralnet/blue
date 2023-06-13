package co.bird.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.C11925l;
import java.lang.Number;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import kotlin.KotlinVersion;
/* loaded from: classes4.dex */
public class RangeSeekBar<T extends Number> extends AppCompatImageView {

    /* renamed from: v0 */
    public static final int f67546v0 = Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, 51, 181, 229);

    /* renamed from: w0 */
    public static final DecimalFormat f67547w0 = new DecimalFormat("#.##");

    /* renamed from: x0 */
    public static final Integer f67548x0 = 0;

    /* renamed from: y0 */
    public static final Integer f67549y0 = 100;

    /* renamed from: z0 */
    public static final Integer f67550z0 = 1;

    /* renamed from: A */
    public int f67551A;

    /* renamed from: B */
    public boolean f67552B;

    /* renamed from: C */
    public int f67553C;

    /* renamed from: D */
    public int f67554D;

    /* renamed from: E */
    public int f67555E;

    /* renamed from: F */
    public RectF f67556F;

    /* renamed from: G */
    public EnumC16571d f67557G;

    /* renamed from: H */
    public boolean f67558H;

    /* renamed from: I */
    public boolean f67559I;

    /* renamed from: J */
    public boolean f67560J;

    /* renamed from: K */
    public boolean f67561K;

    /* renamed from: P */
    public boolean f67562P;

    /* renamed from: Q */
    public int f67563Q;

    /* renamed from: R */
    public int f67564R;

    /* renamed from: S */
    public int f67565S;

    /* renamed from: T */
    public int f67566T;

    /* renamed from: U */
    public boolean f67567U;

    /* renamed from: W */
    public int f67568W;

    /* renamed from: b */
    public final Paint f67569b;

    /* renamed from: c */
    public final Paint f67570c;

    /* renamed from: d */
    public boolean f67571d;

    /* renamed from: e */
    public Bitmap f67572e;

    /* renamed from: f */
    public Bitmap f67573f;

    /* renamed from: g */
    public Bitmap f67574g;

    /* renamed from: h */
    public float f67575h;

    /* renamed from: i */
    public float f67576i;

    /* renamed from: j */
    public float f67577j;

    /* renamed from: k */
    public float f67578k;

    /* renamed from: l */
    public T f67579l;

    /* renamed from: m */
    public T f67580m;

    /* renamed from: n */
    public T f67581n;

    /* renamed from: o */
    public EnumC16569b f67582o;

    /* renamed from: p */
    public double f67583p;

    /* renamed from: p0 */
    public int f67584p0;

    /* renamed from: q */
    public double f67585q;

    /* renamed from: q0 */
    public int f67586q0;

    /* renamed from: r */
    public double f67587r;

    /* renamed from: r0 */
    public Path f67588r0;

    /* renamed from: s */
    public double f67589s;

    /* renamed from: s0 */
    public Path f67590s0;

    /* renamed from: t */
    public double f67591t;

    /* renamed from: t0 */
    public Matrix f67592t0;

    /* renamed from: u */
    public double f67593u;

    /* renamed from: u0 */
    public boolean f67594u0;

    /* renamed from: v */
    public EnumC16572e f67595v;

    /* renamed from: w */
    public boolean f67596w;

    /* renamed from: x */
    public InterfaceC16570c<T> f67597x;

    /* renamed from: y */
    public float f67598y;

    /* renamed from: z */
    public int f67599z;

    /* renamed from: co.bird.android.widget.RangeSeekBar$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C16568a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f67600a;

        static {
            int[] iArr = new int[EnumC16569b.values().length];
            f67600a = iArr;
            try {
                iArr[EnumC16569b.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67600a[EnumC16569b.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67600a[EnumC16569b.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67600a[EnumC16569b.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67600a[EnumC16569b.SHORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67600a[EnumC16569b.BYTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67600a[EnumC16569b.BIG_DECIMAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: co.bird.android.widget.RangeSeekBar$b */
    /* loaded from: classes4.dex */
    public enum EnumC16569b {
        LONG,
        DOUBLE,
        INTEGER,
        FLOAT,
        SHORT,
        BYTE,
        BIG_DECIMAL;

        /* renamed from: b */
        public static <E extends Number> EnumC16569b m54412b(E e) throws IllegalArgumentException {
            if (e instanceof Long) {
                return LONG;
            }
            if (e instanceof Double) {
                return DOUBLE;
            }
            if (e instanceof Integer) {
                return INTEGER;
            }
            if (e instanceof Float) {
                return FLOAT;
            }
            if (e instanceof Short) {
                return SHORT;
            }
            if (e instanceof Byte) {
                return BYTE;
            }
            if (e instanceof BigDecimal) {
                return BIG_DECIMAL;
            }
            throw new IllegalArgumentException("Number class '" + e.getClass().getName() + "' is not supported");
        }

        /* renamed from: c */
        public Number m54411c(double d, boolean z) {
            double d2 = 0.5d;
            switch (C16568a.f67600a[ordinal()]) {
                case 1:
                    if (!z) {
                        d2 = 0.0d;
                    }
                    return Long.valueOf((long) (d + d2));
                case 2:
                    return Double.valueOf(d);
                case 3:
                    if (!z) {
                        d2 = 0.0d;
                    }
                    return Integer.valueOf((int) (d + d2));
                case 4:
                    return Float.valueOf((float) d);
                case 5:
                    if (!z) {
                        d2 = 0.0d;
                    }
                    return Short.valueOf((short) (d + d2));
                case 6:
                    return Byte.valueOf((byte) d);
                case 7:
                    return BigDecimal.valueOf(d);
                default:
                    throw new InstantiationError("can't convert " + this + " to a Number object");
            }
        }

        /* renamed from: d */
        public <E extends Number> String m54410d(E e) throws IllegalArgumentException {
            switch (C16568a.f67600a[ordinal()]) {
                case 1:
                    return String.valueOf(e);
                case 2:
                    return RangeSeekBar.f67547w0.format(e);
                case 3:
                    return String.valueOf(e);
                case 4:
                    return RangeSeekBar.f67547w0.format(e);
                case 5:
                    return String.valueOf(e);
                case 6:
                    return String.valueOf(e);
                case 7:
                    return RangeSeekBar.f67547w0.format(e);
                default:
                    throw new IllegalArgumentException("Number class '" + e.getClass().getName() + "' is not supported");
            }
        }
    }

    /* renamed from: co.bird.android.widget.RangeSeekBar$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC16570c<T extends Number> {
        /* renamed from: a */
        void mo33485a(RangeSeekBar<T> rangeSeekBar, T t, T t2);
    }

    /* renamed from: co.bird.android.widget.RangeSeekBar$d */
    /* loaded from: classes4.dex */
    public enum EnumC16571d {
        NEVER,
        ON_RELEASE,
        WHILE_DRAGGING
    }

    /* renamed from: co.bird.android.widget.RangeSeekBar$e */
    /* loaded from: classes4.dex */
    public enum EnumC16572e {
        LEFT,
        RIGHT
    }

    public RangeSeekBar(Context context) {
        super(context);
        this.f67569b = new Paint(1);
        this.f67570c = new Paint();
        this.f67589s = 0.0d;
        this.f67591t = 1.0d;
        this.f67593u = 0.0d;
        this.f67595v = null;
        this.f67596w = false;
        this.f67599z = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f67590s0 = new Path();
        this.f67592t0 = new Matrix();
        m54423q(context, null);
    }

    /* renamed from: f */
    public static double m54434f(double d, double d2, double d3) {
        return d2 < d3 ? d < d2 ? d2 : d > d3 ? d3 : d : d > d2 ? d2 : d < d3 ? d3 : d;
    }

    /* renamed from: A */
    public final double m54445A(float f) {
        float width;
        float f2;
        float f3;
        if (getWidth() <= this.f67577j + this.f67578k) {
            return 0.0d;
        }
        return Math.min(1.0d, Math.max(0.0d, (f - f2) / (width - (f2 + f3))));
    }

    /* renamed from: B */
    public final void m54444B(double d) {
        this.f67589s = Math.max(0.0d, Math.min(1.0d, Math.min(d, this.f67591t)));
        if (this.f67557G == EnumC16571d.WHILE_DRAGGING) {
            this.f67589s = m54438H(m54427m());
        }
        invalidate();
    }

    /* renamed from: C */
    public final void m54443C(double d) {
        this.f67591t = Math.max(0.0d, Math.min(1.0d, Math.max(d, this.f67589s)));
        if (this.f67557G == EnumC16571d.WHILE_DRAGGING) {
            this.f67591t = m54438H(m54424p());
        }
        invalidate();
    }

    /* renamed from: D */
    public final void m54442D() {
        setRangeValues(f67548x0, f67549y0, f67550z0);
        m54441E();
    }

    /* renamed from: E */
    public final void m54441E() {
        this.f67583p = this.f67579l.doubleValue();
        this.f67585q = this.f67580m.doubleValue();
        this.f67587r = this.f67581n.doubleValue();
        this.f67582o = EnumC16569b.m54412b(this.f67579l);
    }

    /* renamed from: F */
    public final boolean m54440F() {
        return this.f67557G != EnumC16571d.NEVER;
    }

    /* renamed from: G */
    public final void m54439G(MotionEvent motionEvent) {
        double m54445A = m54445A(motionEvent.getX(motionEvent.findPointerIndex(this.f67599z)));
        EnumC16572e enumC16572e = EnumC16572e.LEFT;
        if (enumC16572e.equals(this.f67595v) && !this.f67560J) {
            if (this.f67559I) {
                double d = this.f67591t;
                if (m54445A > d) {
                    this.f67595v = EnumC16572e.RIGHT;
                    m54444B(d);
                    m54443C(m54445A);
                }
            }
            m54444B(m54445A);
        } else if (EnumC16572e.RIGHT.equals(this.f67595v)) {
            if (this.f67559I) {
                double d2 = this.f67589s;
                if (m54445A < d2) {
                    this.f67595v = enumC16572e;
                    m54443C(d2);
                    m54444B(m54445A);
                }
            }
            m54443C(m54445A);
        }
        InterfaceC16570c<T> interfaceC16570c = this.f67597x;
        if (interfaceC16570c != null) {
            interfaceC16570c.mo33485a(this, m54427m(), m54424p());
        }
    }

    /* renamed from: H */
    public double m54438H(T t) {
        if (0.0d == this.f67585q - this.f67583p) {
            return 0.0d;
        }
        double doubleValue = t.doubleValue();
        double d = this.f67583p;
        return (doubleValue - d) / (this.f67585q - d);
    }

    /* renamed from: d */
    public final void m54436d() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: e */
    public final void m54435e() {
        if (this.f67571d != m54421s()) {
            T m54428l = m54428l();
            T m54429k = m54429k();
            T m54425o = m54425o();
            T m54426n = m54426n();
            this.f67571d = !this.f67571d;
            setRangeValues(m54428l, m54429k);
            setSelectedMinValue(m54425o);
            setSelectedMaxValue(m54426n);
        }
    }

    /* renamed from: g */
    public final void m54433g(float f, boolean z, Canvas canvas, boolean z2) {
        Bitmap bitmap;
        if (!this.f67594u0 && z2) {
            bitmap = this.f67574g;
        } else if (z) {
            bitmap = this.f67573f;
        } else {
            bitmap = this.f67572e;
        }
        canvas.drawBitmap(bitmap, f - this.f67575h, this.f67553C + getPaddingTop(), this.f67569b);
    }

    /* renamed from: h */
    public final void m54432h(float f, Canvas canvas) {
        this.f67592t0.setTranslate(f + this.f67568W, this.f67553C + this.f67576i + this.f67584p0 + getPaddingTop());
        this.f67590s0.set(this.f67588r0);
        this.f67590s0.transform(this.f67592t0);
        canvas.drawPath(this.f67590s0, this.f67570c);
    }

    /* renamed from: i */
    public final EnumC16572e m54431i(float f) {
        boolean m54422r = m54422r(f, this.f67589s);
        boolean m54422r2 = m54422r(f, this.f67591t);
        if (m54422r && m54422r2) {
            if (f / getWidth() > 0.5f) {
                return EnumC16572e.LEFT;
            }
            return EnumC16572e.RIGHT;
        } else if (m54422r) {
            return EnumC16572e.LEFT;
        } else {
            if (m54422r2) {
                return EnumC16572e.RIGHT;
            }
            return null;
        }
    }

    /* renamed from: j */
    public final T m54430j(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return Integer.valueOf(i2);
        }
        if (peekValue.type == 4) {
            return Float.valueOf(typedArray.getFloat(i, i2));
        }
        return Integer.valueOf(typedArray.getInteger(i, i2));
    }

    /* renamed from: k */
    public T m54429k() {
        return this.f67571d ? this.f67579l : this.f67580m;
    }

    /* renamed from: l */
    public T m54428l() {
        return this.f67571d ? this.f67580m : this.f67579l;
    }

    /* renamed from: m */
    public final T m54427m() {
        return m54414z(m54419u(this.f67589s));
    }

    /* renamed from: n */
    public T m54426n() {
        return this.f67571d ? m54427m() : m54424p();
    }

    /* renamed from: o */
    public T m54425o() {
        return this.f67571d ? m54424p() : m54427m();
    }

    @Override // android.widget.ImageView, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        m54435e();
        this.f67569b.setTextSize(this.f67554D);
        this.f67569b.setStyle(Paint.Style.FILL);
        this.f67569b.setColor(this.f67565S);
        boolean z = true;
        this.f67569b.setAntiAlias(true);
        this.f67577j = getPaddingLeft() + this.f67575h;
        this.f67578k = getPaddingRight() + this.f67575h;
        RectF rectF = this.f67556F;
        rectF.left = this.f67577j;
        rectF.right = getWidth() - this.f67578k;
        canvas.drawRect(this.f67556F, this.f67569b);
        double d = this.f67589s;
        double d2 = this.f67593u;
        if (d > d2 || this.f67591t < 1.0d - d2) {
            z = false;
        }
        if (!this.f67561K && !this.f67594u0 && z) {
            i = this.f67565S;
        } else {
            i = this.f67564R;
        }
        this.f67556F.left = m54420t(d);
        this.f67556F.right = m54420t(this.f67591t);
        this.f67569b.setColor(i);
        canvas.drawRect(this.f67556F, this.f67569b);
        if (!this.f67560J) {
            if (this.f67567U) {
                m54432h(m54420t(this.f67589s), canvas);
            }
            m54433g(m54420t(this.f67589s), EnumC16572e.LEFT.equals(this.f67595v), canvas, z);
        }
        if (this.f67567U) {
            m54432h(m54420t(this.f67591t), canvas);
        }
        m54433g(m54420t(this.f67591t), EnumC16572e.RIGHT.equals(this.f67595v), canvas, z);
        if (this.f67562P && (this.f67594u0 || !z)) {
            this.f67569b.setTextSize(this.f67554D);
            this.f67569b.setColor(this.f67566T);
            String m54410d = this.f67582o.m54410d(m54427m());
            String m54410d2 = this.f67582o.m54410d(m54424p());
            float measureText = this.f67569b.measureText(m54410d);
            float measureText2 = this.f67569b.measureText(m54410d2);
            float max = Math.max(0.0f, m54420t(this.f67589s) - (measureText * 0.5f));
            float min = Math.min(getWidth() - measureText2, m54420t(this.f67591t) - (measureText2 * 0.5f));
            if (!this.f67560J) {
                float f = ((measureText + max) - min) + this.f67563Q;
                if (f > 0.0f) {
                    double d3 = f;
                    double d4 = this.f67589s;
                    double d5 = this.f67591t;
                    max = (float) (max - ((d3 * d4) / ((d4 + 1.0d) - d5)));
                    min = (float) (min + ((d3 * (1.0d - d5)) / ((d4 + 1.0d) - d5)));
                }
                canvas.drawText(m54410d, max, this.f67555E + this.f67554D + getPaddingTop(), this.f67569b);
            }
            canvas.drawText(m54410d2, min, this.f67555E + this.f67554D + getPaddingTop(), this.f67569b);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (View.MeasureSpec.getMode(i) != 0) {
            i3 = View.MeasureSpec.getSize(i);
        } else {
            i3 = C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION;
        }
        int height = this.f67572e.getHeight() + this.f67553C + getPaddingTop() + getPaddingBottom();
        if (this.f67567U) {
            i4 = this.f67584p0 + this.f67586q0;
        } else {
            i4 = 0;
        }
        int i5 = height + i4;
        if (View.MeasureSpec.getMode(i2) != 0) {
            i5 = Math.min(i5, View.MeasureSpec.getSize(i2));
        }
        setMeasuredDimension(i3, i5);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("SUPER"));
        this.f67589s = bundle.getDouble("LEFT");
        this.f67591t = bundle.getDouble("RIGHT");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER", super.onSaveInstanceState());
        bundle.putDouble("LEFT", this.f67589s);
        bundle.putDouble("RIGHT", this.f67591t);
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC16570c<T> interfaceC16570c;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                m54418v(motionEvent);
                                invalidate();
                            }
                        } else {
                            int pointerCount = motionEvent.getPointerCount() - 1;
                            this.f67598y = motionEvent.getX(pointerCount);
                            this.f67599z = motionEvent.getPointerId(pointerCount);
                            invalidate();
                        }
                    } else {
                        if (this.f67552B) {
                            m54416x();
                            setPressed(false);
                        }
                        invalidate();
                    }
                } else if (this.f67595v != null) {
                    if (this.f67552B) {
                        m54439G(motionEvent);
                    } else if (Math.abs(motionEvent.getX(motionEvent.findPointerIndex(this.f67599z)) - this.f67598y) > this.f67551A) {
                        setPressed(true);
                        invalidate();
                        m54417w();
                        m54439G(motionEvent);
                        m54436d();
                    }
                    if (this.f67596w && (interfaceC16570c = this.f67597x) != null) {
                        interfaceC16570c.mo33485a(this, m54427m(), m54424p());
                    }
                }
            } else {
                if (this.f67552B) {
                    m54439G(motionEvent);
                    m54416x();
                    setPressed(false);
                } else {
                    m54417w();
                    m54439G(motionEvent);
                    m54416x();
                }
                if (this.f67557G == EnumC16571d.ON_RELEASE) {
                    this.f67589s = m54438H(m54427m());
                    this.f67591t = m54438H(m54424p());
                }
                this.f67595v = null;
                invalidate();
                InterfaceC16570c<T> interfaceC16570c2 = this.f67597x;
                if (interfaceC16570c2 != null) {
                    interfaceC16570c2.mo33485a(this, m54427m(), m54424p());
                }
            }
        } else {
            int pointerId = motionEvent.getPointerId(motionEvent.getPointerCount() - 1);
            this.f67599z = pointerId;
            float x = motionEvent.getX(motionEvent.findPointerIndex(pointerId));
            this.f67598y = x;
            EnumC16572e m54431i = m54431i(x);
            this.f67595v = m54431i;
            if (m54431i == null) {
                return super.onTouchEvent(motionEvent);
            }
            setPressed(true);
            invalidate();
            m54417w();
            m54439G(motionEvent);
            m54436d();
        }
        return true;
    }

    /* renamed from: p */
    public T m54424p() {
        return m54414z(m54419u(this.f67591t));
    }

    /* renamed from: q */
    public final void m54423q(Context context, AttributeSet attributeSet) {
        int i = C48785sg4.seek_thumb_normal;
        int i2 = C48785sg4.seek_thumb_disabled;
        int i3 = 0;
        int argb = Color.argb(75, 0, 0, 0);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C37512Zf4.range_seek_bar_deafult_shadow_y_offset);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(C37512Zf4.range_seek_bar_deafult_shadow_x_offset);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(C37512Zf4.range_seek_bar_deafult_shadow_blur);
        this.f67557G = EnumC16571d.NEVER;
        this.f67558H = false;
        this.f67559I = true;
        this.f67560J = false;
        this.f67561K = false;
        this.f67562P = true;
        this.f67563Q = context.getResources().getDimensionPixelOffset(C37512Zf4.range_seek_bar_text_lateral_padding);
        float dimension = context.getResources().getDimension(C37512Zf4.range_seek_bar_line_height);
        this.f67566T = NA0.m94301c(context, C32364Df4.colorPrimary);
        this.f67564R = f67546v0;
        this.f67565S = -7829368;
        this.f67594u0 = true;
        if (attributeSet == null) {
            m54442D();
            this.f67568W = dimensionPixelOffset2;
            this.f67584p0 = dimensionPixelOffset;
            this.f67586q0 = dimensionPixelOffset3;
        } else {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34758Nl4.RangeSeekBar, 0, 0);
            try {
                setRangeValues(m54430j(obtainStyledAttributes, C34758Nl4.RangeSeekBar_absoluteMinValue, f67548x0.intValue()), m54430j(obtainStyledAttributes, C34758Nl4.RangeSeekBar_absoluteMaxValue, f67549y0.intValue()), m54430j(obtainStyledAttributes, C34758Nl4.RangeSeekBar_step, f67550z0.intValue()));
                this.f67557G = EnumC16571d.values()[obtainStyledAttributes.getInt(C34758Nl4.RangeSeekBar_snapThumb, this.f67557G.ordinal())];
                this.f67559I = obtainStyledAttributes.getBoolean(C34758Nl4.RangeSeekBar_allowCrossover, this.f67559I);
                this.f67562P = obtainStyledAttributes.getBoolean(C34758Nl4.RangeSeekBar_valuesAboveThumbs, this.f67562P);
                this.f67566T = obtainStyledAttributes.getColor(C34758Nl4.RangeSeekBar_textAboveThumbsColor, this.f67566T);
                this.f67560J = obtainStyledAttributes.getBoolean(C34758Nl4.RangeSeekBar_singleThumb, this.f67560J);
                dimension = obtainStyledAttributes.getDimension(C34758Nl4.RangeSeekBar_barHeight, dimension);
                this.f67564R = obtainStyledAttributes.getColor(C34758Nl4.RangeSeekBar_activeColor, this.f67564R);
                this.f67565S = obtainStyledAttributes.getColor(C34758Nl4.RangeSeekBar_defaultColor, this.f67565S);
                this.f67561K = obtainStyledAttributes.getBoolean(C34758Nl4.RangeSeekBar_alwaysActive, this.f67561K);
                Drawable drawable = obtainStyledAttributes.getDrawable(C34758Nl4.RangeSeekBar_thumbNormal);
                if (drawable != null) {
                    this.f67572e = C25167kU.m28923a(drawable);
                }
                Drawable drawable2 = obtainStyledAttributes.getDrawable(C34758Nl4.RangeSeekBar_thumbDisabled);
                if (drawable2 != null) {
                    this.f67574g = C25167kU.m28923a(drawable2);
                }
                Drawable drawable3 = obtainStyledAttributes.getDrawable(C34758Nl4.RangeSeekBar_thumbPressed);
                if (drawable3 != null) {
                    this.f67573f = C25167kU.m28923a(drawable3);
                }
                this.f67567U = obtainStyledAttributes.getBoolean(C34758Nl4.RangeSeekBar_thumbShadow, false);
                argb = obtainStyledAttributes.getColor(C34758Nl4.RangeSeekBar_thumbShadowColor, argb);
                this.f67568W = obtainStyledAttributes.getDimensionPixelSize(C34758Nl4.RangeSeekBar_thumbShadowXOffset, dimensionPixelOffset2);
                this.f67584p0 = obtainStyledAttributes.getDimensionPixelSize(C34758Nl4.RangeSeekBar_thumbShadowYOffset, dimensionPixelOffset);
                this.f67586q0 = obtainStyledAttributes.getDimensionPixelSize(C34758Nl4.RangeSeekBar_thumbShadowBlur, dimensionPixelOffset3);
                this.f67594u0 = obtainStyledAttributes.getBoolean(C34758Nl4.RangeSeekBar_activateOnDefaultValues, this.f67594u0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        if (this.f67572e == null) {
            this.f67572e = C25167kU.m28923a(NA0.m94299e(context, i));
        }
        if (this.f67573f == null) {
            this.f67573f = C25167kU.m28923a(NA0.m94299e(context, i));
        }
        if (this.f67574g == null) {
            this.f67574g = C25167kU.m28923a(NA0.m94299e(context, i2));
        }
        this.f67575h = this.f67572e.getWidth() * 0.5f;
        this.f67576i = this.f67572e.getHeight() * 0.5f;
        m54441E();
        this.f67554D = context.getResources().getDimensionPixelSize(C37512Zf4.range_seek_bar_text_default_size);
        this.f67555E = context.getResources().getDimensionPixelOffset(C37512Zf4.range_seek_bar_text_distance_to_top);
        if (this.f67562P) {
            i3 = this.f67554D + context.getResources().getDimensionPixelOffset(C37512Zf4.range_seek_bar_text_distance_to_button) + this.f67555E;
        }
        this.f67553C = i3;
        float f = dimension / 2.0f;
        this.f67556F = new RectF(this.f67577j, ((this.f67553C + this.f67576i) - f) + getPaddingTop(), getWidth() - this.f67578k, this.f67553C + this.f67576i + f + getPaddingTop());
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f67551A = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (this.f67567U) {
            setLayerType(1, null);
            this.f67570c.setColor(argb);
            this.f67570c.setMaskFilter(new BlurMaskFilter(this.f67586q0, BlurMaskFilter.Blur.NORMAL));
            Path path = new Path();
            this.f67588r0 = path;
            path.addCircle(0.0f, 0.0f, this.f67576i, Path.Direction.CW);
        }
    }

    /* renamed from: r */
    public final boolean m54422r(float f, double d) {
        return Math.abs(f - m54420t(d)) <= this.f67575h;
    }

    /* renamed from: s */
    public final boolean m54421s() {
        return getLayoutDirection() == 1;
    }

    public void setNotifyWhileDragging(boolean z) {
        this.f67596w = z;
    }

    public void setOnRangeSeekBarChangeListener(InterfaceC16570c<T> interfaceC16570c) {
        this.f67597x = interfaceC16570c;
    }

    public void setRangeValues(T t, T t2) {
        boolean z = this.f67571d;
        this.f67579l = z ? t2 : t;
        if (!z) {
            t = t2;
        }
        this.f67580m = t;
        m54441E();
    }

    public void setSelectedMaxValue(T t) {
        if (0.0d == this.f67585q - this.f67583p) {
            if (this.f67571d) {
                m54444B(1.0d);
            } else {
                m54443C(1.0d);
            }
        } else if (this.f67571d) {
            m54444B(m54438H(t));
        } else {
            m54443C(m54438H(t));
        }
    }

    public void setSelectedMinValue(T t) {
        if (0.0d == this.f67585q - this.f67583p) {
            if (this.f67571d) {
                m54443C(0.0d);
            } else {
                m54444B(0.0d);
            }
        } else if (this.f67571d) {
            m54443C(m54438H(t));
        } else {
            m54444B(m54438H(t));
        }
    }

    public void setTextAboveThumbsColor(int i) {
        this.f67566T = i;
        invalidate();
    }

    public void setTextAboveThumbsColorResource(int i) {
        setTextAboveThumbsColor(getResources().getColor(i));
    }

    public void setThumbShadowPath(Path path) {
        this.f67588r0 = path;
    }

    /* renamed from: t */
    public final float m54420t(double d) {
        return (float) (this.f67577j + (d * (getWidth() - (this.f67577j + this.f67578k))));
    }

    /* renamed from: u */
    public final double m54419u(double d) {
        double d2 = this.f67583p;
        return d2 + (d * (this.f67585q - d2));
    }

    /* renamed from: v */
    public final void m54418v(MotionEvent motionEvent) {
        int i;
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.f67599z) {
            if (action == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f67598y = motionEvent.getX(i);
            this.f67599z = motionEvent.getPointerId(i);
        }
    }

    /* renamed from: w */
    public void m54417w() {
        this.f67552B = true;
    }

    /* renamed from: x */
    public void m54416x() {
        this.f67552B = false;
    }

    /* renamed from: y */
    public final long m54415y(double d) {
        return (long) (d + (m54440F() ? 0.5d : 0.0d));
    }

    /* renamed from: z */
    public final T m54414z(double d) {
        return (T) this.f67582o.m54411c(m54434f(m54415y(d / this.f67587r) * this.f67587r, this.f67583p, this.f67585q), m54440F());
    }

    public void setRangeValues(T t, T t2, T t3) {
        this.f67581n = t3;
        setRangeValues(t, t2);
    }

    public RangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67569b = new Paint(1);
        this.f67570c = new Paint();
        this.f67589s = 0.0d;
        this.f67591t = 1.0d;
        this.f67593u = 0.0d;
        this.f67595v = null;
        this.f67596w = false;
        this.f67599z = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f67590s0 = new Path();
        this.f67592t0 = new Matrix();
        m54423q(context, attributeSet);
    }

    public RangeSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f67569b = new Paint(1);
        this.f67570c = new Paint();
        this.f67589s = 0.0d;
        this.f67591t = 1.0d;
        this.f67593u = 0.0d;
        this.f67595v = null;
        this.f67596w = false;
        this.f67599z = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f67590s0 = new Path();
        this.f67592t0 = new Matrix();
        m54423q(context, attributeSet);
    }
}
