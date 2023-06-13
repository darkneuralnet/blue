package p000;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
/* renamed from: nS3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class View$OnTouchListenerC45688nS3 implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* renamed from: A */
    public static float f99947A = 3.0f;

    /* renamed from: B */
    public static float f99948B = 1.75f;

    /* renamed from: C */
    public static float f99949C = 1.0f;

    /* renamed from: D */
    public static int f99950D = 200;

    /* renamed from: i */
    public ImageView f99958i;

    /* renamed from: j */
    public GestureDetector f99959j;

    /* renamed from: k */
    public C45568nF0 f99960k;

    /* renamed from: q */
    public InterfaceC38104ah3 f99966q;

    /* renamed from: r */
    public View.OnClickListener f99967r;

    /* renamed from: s */
    public View.OnLongClickListener f99968s;

    /* renamed from: t */
    public RunnableC26519f f99969t;

    /* renamed from: w */
    public float f99972w;

    /* renamed from: b */
    public Interpolator f99951b = new AccelerateDecelerateInterpolator();

    /* renamed from: c */
    public int f99952c = f99950D;

    /* renamed from: d */
    public float f99953d = f99949C;

    /* renamed from: e */
    public float f99954e = f99948B;

    /* renamed from: f */
    public float f99955f = f99947A;

    /* renamed from: g */
    public boolean f99956g = true;

    /* renamed from: h */
    public boolean f99957h = false;

    /* renamed from: l */
    public final Matrix f99961l = new Matrix();

    /* renamed from: m */
    public final Matrix f99962m = new Matrix();

    /* renamed from: n */
    public final Matrix f99963n = new Matrix();

    /* renamed from: o */
    public final RectF f99964o = new RectF();

    /* renamed from: p */
    public final float[] f99965p = new float[9];

    /* renamed from: u */
    public int f99970u = 2;

    /* renamed from: v */
    public int f99971v = 2;

    /* renamed from: x */
    public boolean f99973x = true;

    /* renamed from: y */
    public ImageView.ScaleType f99974y = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: z */
    public InterfaceC35414Qg3 f99975z = new C26514a();

    /* renamed from: nS3$a */
    /* loaded from: classes5.dex */
    public class C26514a implements InterfaceC35414Qg3 {
        public C26514a() {
        }

        @Override // p000.InterfaceC35414Qg3
        /* renamed from: a */
        public void mo23679a(float f, float f2, float f3, float f4) {
            View$OnTouchListenerC45688nS3 view$OnTouchListenerC45688nS3 = View$OnTouchListenerC45688nS3.this;
            view$OnTouchListenerC45688nS3.f99969t = new RunnableC26519f(view$OnTouchListenerC45688nS3.f99958i.getContext());
            RunnableC26519f runnableC26519f = View$OnTouchListenerC45688nS3.this.f99969t;
            View$OnTouchListenerC45688nS3 view$OnTouchListenerC45688nS32 = View$OnTouchListenerC45688nS3.this;
            int m23739G = view$OnTouchListenerC45688nS32.m23739G(view$OnTouchListenerC45688nS32.f99958i);
            View$OnTouchListenerC45688nS3 view$OnTouchListenerC45688nS33 = View$OnTouchListenerC45688nS3.this;
            runnableC26519f.m23674b(m23739G, view$OnTouchListenerC45688nS33.m23740F(view$OnTouchListenerC45688nS33.f99958i), (int) f3, (int) f4);
            View$OnTouchListenerC45688nS3.this.f99958i.post(View$OnTouchListenerC45688nS3.this.f99969t);
        }

        @Override // p000.InterfaceC35414Qg3
        /* renamed from: b */
        public void mo23678b(float f, float f2) {
            if (View$OnTouchListenerC45688nS3.this.f99960k.m24105e()) {
                return;
            }
            View$OnTouchListenerC45688nS3.this.getClass();
            View$OnTouchListenerC45688nS3.this.f99963n.postTranslate(f, f2);
            View$OnTouchListenerC45688nS3.this.m23680z();
            ViewParent parent = View$OnTouchListenerC45688nS3.this.f99958i.getParent();
            if (View$OnTouchListenerC45688nS3.this.f99956g && !View$OnTouchListenerC45688nS3.this.f99960k.m24105e() && !View$OnTouchListenerC45688nS3.this.f99957h) {
                if ((View$OnTouchListenerC45688nS3.this.f99970u == 2 || ((View$OnTouchListenerC45688nS3.this.f99970u == 0 && f >= 1.0f) || ((View$OnTouchListenerC45688nS3.this.f99970u == 1 && f <= -1.0f) || ((View$OnTouchListenerC45688nS3.this.f99971v == 0 && f2 >= 1.0f) || (View$OnTouchListenerC45688nS3.this.f99971v == 1 && f2 <= -1.0f))))) && parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            } else if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // p000.InterfaceC35414Qg3
        /* renamed from: c */
        public void mo23677c(float f, float f2, float f3) {
            if (View$OnTouchListenerC45688nS3.this.m23735K() < View$OnTouchListenerC45688nS3.this.f99955f || f < 1.0f) {
                View$OnTouchListenerC45688nS3.this.getClass();
                View$OnTouchListenerC45688nS3.this.f99963n.postScale(f, f, f2, f3);
                View$OnTouchListenerC45688nS3.this.m23680z();
            }
        }
    }

    /* renamed from: nS3$b */
    /* loaded from: classes5.dex */
    public class C26515b extends GestureDetector.SimpleOnGestureListener {
        public C26515b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            View$OnTouchListenerC45688nS3.this.getClass();
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (View$OnTouchListenerC45688nS3.this.f99968s != null) {
                View$OnTouchListenerC45688nS3.this.f99968s.onLongClick(View$OnTouchListenerC45688nS3.this.f99958i);
            }
        }
    }

    /* renamed from: nS3$c */
    /* loaded from: classes5.dex */
    public class GestureDetector$OnDoubleTapListenerC26516c implements GestureDetector.OnDoubleTapListener {
        public GestureDetector$OnDoubleTapListenerC26516c() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float m23735K = View$OnTouchListenerC45688nS3.this.m23735K();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (m23735K < View$OnTouchListenerC45688nS3.this.m23737I()) {
                    View$OnTouchListenerC45688nS3 view$OnTouchListenerC45688nS3 = View$OnTouchListenerC45688nS3.this;
                    view$OnTouchListenerC45688nS3.m23706g0(view$OnTouchListenerC45688nS3.m23737I(), x, y, true);
                } else if (m23735K >= View$OnTouchListenerC45688nS3.this.m23737I() && m23735K < View$OnTouchListenerC45688nS3.this.m23738H()) {
                    View$OnTouchListenerC45688nS3 view$OnTouchListenerC45688nS32 = View$OnTouchListenerC45688nS3.this;
                    view$OnTouchListenerC45688nS32.m23706g0(view$OnTouchListenerC45688nS32.m23738H(), x, y, true);
                } else {
                    View$OnTouchListenerC45688nS3 view$OnTouchListenerC45688nS33 = View$OnTouchListenerC45688nS3.this;
                    view$OnTouchListenerC45688nS33.m23706g0(view$OnTouchListenerC45688nS33.m23736J(), x, y, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (View$OnTouchListenerC45688nS3.this.f99967r != null) {
                View$OnTouchListenerC45688nS3.this.f99967r.onClick(View$OnTouchListenerC45688nS3.this.f99958i);
            }
            RectF m23744B = View$OnTouchListenerC45688nS3.this.m23744B();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            View$OnTouchListenerC45688nS3.this.getClass();
            if (m23744B != null) {
                if (m23744B.contains(x, y)) {
                    float width = (x - m23744B.left) / m23744B.width();
                    float height = (y - m23744B.top) / m23744B.height();
                    if (View$OnTouchListenerC45688nS3.this.f99966q != null) {
                        View$OnTouchListenerC45688nS3.this.f99966q.mo25606a(View$OnTouchListenerC45688nS3.this.f99958i, width, height);
                        return true;
                    }
                    return true;
                }
                View$OnTouchListenerC45688nS3.this.getClass();
                return false;
            }
            return false;
        }
    }

    /* renamed from: nS3$d */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C26517d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f99979a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f99979a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99979a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99979a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f99979a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: nS3$e */
    /* loaded from: classes5.dex */
    public class RunnableC26518e implements Runnable {

        /* renamed from: b */
        public final float f99980b;

        /* renamed from: c */
        public final float f99981c;

        /* renamed from: d */
        public final long f99982d = System.currentTimeMillis();

        /* renamed from: e */
        public final float f99983e;

        /* renamed from: f */
        public final float f99984f;

        public RunnableC26518e(float f, float f2, float f3, float f4) {
            this.f99980b = f3;
            this.f99981c = f4;
            this.f99983e = f;
            this.f99984f = f2;
        }

        /* renamed from: a */
        public final float m23676a() {
            return View$OnTouchListenerC45688nS3.this.f99951b.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f99982d)) * 1.0f) / View$OnTouchListenerC45688nS3.this.f99952c));
        }

        @Override // java.lang.Runnable
        public void run() {
            float m23676a = m23676a();
            float f = this.f99983e;
            View$OnTouchListenerC45688nS3.this.f99975z.mo23677c((f + ((this.f99984f - f) * m23676a)) / View$OnTouchListenerC45688nS3.this.m23735K(), this.f99980b, this.f99981c);
            if (m23676a < 1.0f) {
                C36428Up0.m80798a(View$OnTouchListenerC45688nS3.this.f99958i, this);
            }
        }
    }

    /* renamed from: nS3$f */
    /* loaded from: classes5.dex */
    public class RunnableC26519f implements Runnable {

        /* renamed from: b */
        public final OverScroller f99986b;

        /* renamed from: c */
        public int f99987c;

        /* renamed from: d */
        public int f99988d;

        public RunnableC26519f(Context context) {
            this.f99986b = new OverScroller(context);
        }

        /* renamed from: a */
        public void m23675a() {
            this.f99986b.forceFinished(true);
        }

        /* renamed from: b */
        public void m23674b(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            RectF m23744B = View$OnTouchListenerC45688nS3.this.m23744B();
            if (m23744B == null) {
                return;
            }
            int round = Math.round(-m23744B.left);
            float f = i;
            if (f < m23744B.width()) {
                i6 = Math.round(m23744B.width() - f);
                i5 = 0;
            } else {
                i5 = round;
                i6 = i5;
            }
            int round2 = Math.round(-m23744B.top);
            float f2 = i2;
            if (f2 < m23744B.height()) {
                i8 = Math.round(m23744B.height() - f2);
                i7 = 0;
            } else {
                i7 = round2;
                i8 = i7;
            }
            this.f99987c = round;
            this.f99988d = round2;
            if (round != i6 || round2 != i8) {
                this.f99986b.fling(round, round2, i3, i4, i5, i6, i7, i8, 0, 0);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f99986b.isFinished() && this.f99986b.computeScrollOffset()) {
                int currX = this.f99986b.getCurrX();
                int currY = this.f99986b.getCurrY();
                View$OnTouchListenerC45688nS3.this.f99963n.postTranslate(this.f99987c - currX, this.f99988d - currY);
                View$OnTouchListenerC45688nS3.this.m23680z();
                this.f99987c = currX;
                this.f99988d = currY;
                C36428Up0.m80798a(View$OnTouchListenerC45688nS3.this.f99958i, this);
            }
        }
    }

    public View$OnTouchListenerC45688nS3(ImageView imageView) {
        this.f99958i = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.f99972w = 0.0f;
        this.f99960k = new C45568nF0(imageView.getContext(), this.f99975z);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new C26515b());
        this.f99959j = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetector$OnDoubleTapListenerC26516c());
    }

    /* renamed from: A */
    public final boolean m23745A() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        RectF m23743C = m23743C(m23742D());
        if (m23743C == null) {
            return false;
        }
        float height = m23743C.height();
        float width = m23743C.width();
        float m23740F = m23740F(this.f99958i);
        float f6 = 0.0f;
        if (height <= m23740F) {
            int i = C26517d.f99979a[this.f99974y.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    f4 = (m23740F - height) / 2.0f;
                    f5 = m23743C.top;
                } else {
                    f4 = m23740F - height;
                    f5 = m23743C.top;
                }
                f = f4 - f5;
            } else {
                f = -m23743C.top;
            }
            this.f99971v = 2;
        } else {
            float f7 = m23743C.top;
            if (f7 > 0.0f) {
                this.f99971v = 0;
                f = -f7;
            } else {
                float f8 = m23743C.bottom;
                if (f8 < m23740F) {
                    this.f99971v = 1;
                    f = m23740F - f8;
                } else {
                    this.f99971v = -1;
                    f = 0.0f;
                }
            }
        }
        float m23739G = m23739G(this.f99958i);
        if (width <= m23739G) {
            int i2 = C26517d.f99979a[this.f99974y.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f2 = (m23739G - width) / 2.0f;
                    f3 = m23743C.left;
                } else {
                    f2 = m23739G - width;
                    f3 = m23743C.left;
                }
                f6 = f2 - f3;
            } else {
                f6 = -m23743C.left;
            }
            this.f99970u = 2;
        } else {
            float f9 = m23743C.left;
            if (f9 > 0.0f) {
                this.f99970u = 0;
                f6 = -f9;
            } else {
                float f10 = m23743C.right;
                if (f10 < m23739G) {
                    f6 = m23739G - f10;
                    this.f99970u = 1;
                } else {
                    this.f99970u = -1;
                }
            }
        }
        this.f99963n.postTranslate(f6, f);
        return true;
    }

    /* renamed from: B */
    public RectF m23744B() {
        m23745A();
        return m23743C(m23742D());
    }

    /* renamed from: C */
    public final RectF m23743C(Matrix matrix) {
        Drawable drawable = this.f99958i.getDrawable();
        if (drawable != null) {
            this.f99964o.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrix.mapRect(this.f99964o);
            return this.f99964o;
        }
        return null;
    }

    /* renamed from: D */
    public final Matrix m23742D() {
        this.f99962m.set(this.f99961l);
        this.f99962m.postConcat(this.f99963n);
        return this.f99962m;
    }

    /* renamed from: E */
    public Matrix m23741E() {
        return this.f99962m;
    }

    /* renamed from: F */
    public final int m23740F(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* renamed from: G */
    public final int m23739G(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: H */
    public float m23738H() {
        return this.f99955f;
    }

    /* renamed from: I */
    public float m23737I() {
        return this.f99954e;
    }

    /* renamed from: J */
    public float m23736J() {
        return this.f99953d;
    }

    /* renamed from: K */
    public float m23735K() {
        return (float) Math.sqrt(((float) Math.pow(m23733M(this.f99963n, 0), 2.0d)) + ((float) Math.pow(m23733M(this.f99963n, 3), 2.0d)));
    }

    /* renamed from: L */
    public ImageView.ScaleType m23734L() {
        return this.f99974y;
    }

    /* renamed from: M */
    public final float m23733M(Matrix matrix, int i) {
        matrix.getValues(this.f99965p);
        return this.f99965p[i];
    }

    /* renamed from: N */
    public final void m23732N() {
        this.f99963n.reset();
        m23712d0(this.f99972w);
        m23730P(m23742D());
        m23745A();
    }

    /* renamed from: O */
    public void m23731O(boolean z) {
        this.f99956g = z;
    }

    /* renamed from: P */
    public final void m23730P(Matrix matrix) {
        this.f99958i.setImageMatrix(matrix);
    }

    /* renamed from: Q */
    public void m23729Q(float f) {
        C47622qi6.m17207a(this.f99953d, this.f99954e, f);
        this.f99955f = f;
    }

    /* renamed from: R */
    public void m23728R(float f) {
        C47622qi6.m17207a(this.f99953d, f, this.f99955f);
        this.f99954e = f;
    }

    /* renamed from: S */
    public void m23727S(float f) {
        C47622qi6.m17207a(f, this.f99954e, this.f99955f);
        this.f99953d = f;
    }

    /* renamed from: T */
    public void m23726T(View.OnClickListener onClickListener) {
        this.f99967r = onClickListener;
    }

    /* renamed from: U */
    public void m23725U(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f99959j.setOnDoubleTapListener(onDoubleTapListener);
    }

    /* renamed from: V */
    public void m23724V(View.OnLongClickListener onLongClickListener) {
        this.f99968s = onLongClickListener;
    }

    /* renamed from: W */
    public void m23723W(InterfaceC36818Wg3 interfaceC36818Wg3) {
    }

    /* renamed from: X */
    public void m23722X(InterfaceC37286Yg3 interfaceC37286Yg3) {
    }

    /* renamed from: Y */
    public void m23721Y(InterfaceC38104ah3 interfaceC38104ah3) {
        this.f99966q = interfaceC38104ah3;
    }

    /* renamed from: Z */
    public void m23720Z(InterfaceC42865ih3 interfaceC42865ih3) {
    }

    /* renamed from: a0 */
    public void m23718a0(InterfaceC44051kh3 interfaceC44051kh3) {
    }

    /* renamed from: b0 */
    public void m23716b0(InterfaceC47609qh3 interfaceC47609qh3) {
    }

    /* renamed from: c0 */
    public void m23714c0(InterfaceC48202rh3 interfaceC48202rh3) {
    }

    /* renamed from: d0 */
    public void m23712d0(float f) {
        this.f99963n.postRotate(f % 360.0f);
        m23680z();
    }

    /* renamed from: e0 */
    public void m23710e0(float f) {
        this.f99963n.setRotate(f % 360.0f);
        m23680z();
    }

    /* renamed from: f0 */
    public void m23708f0(float f) {
        m23704h0(f, false);
    }

    /* renamed from: g0 */
    public void m23706g0(float f, float f2, float f3, boolean z) {
        if (f >= this.f99953d && f <= this.f99955f) {
            if (z) {
                this.f99958i.post(new RunnableC26518e(m23735K(), f, f2, f3));
                return;
            }
            this.f99963n.setScale(f, f, f2, f3);
            m23680z();
            return;
        }
        throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
    }

    /* renamed from: h0 */
    public void m23704h0(float f, boolean z) {
        m23706g0(f, this.f99958i.getRight() / 2, this.f99958i.getBottom() / 2, z);
    }

    /* renamed from: i0 */
    public void m23702i0(float f, float f2, float f3) {
        C47622qi6.m17207a(f, f2, f3);
        this.f99953d = f;
        this.f99954e = f2;
        this.f99955f = f3;
    }

    /* renamed from: j0 */
    public void m23700j0(ImageView.ScaleType scaleType) {
        if (C47622qi6.m17204d(scaleType) && scaleType != this.f99974y) {
            this.f99974y = scaleType;
            m23694m0();
        }
    }

    /* renamed from: k0 */
    public void m23698k0(int i) {
        this.f99952c = i;
    }

    /* renamed from: l0 */
    public void m23696l0(boolean z) {
        this.f99973x = z;
        m23694m0();
    }

    /* renamed from: m0 */
    public void m23694m0() {
        if (this.f99973x) {
            m23692n0(this.f99958i.getDrawable());
        } else {
            m23732N();
        }
    }

    /* renamed from: n0 */
    public final void m23692n0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float m23739G = m23739G(this.f99958i);
        float m23740F = m23740F(this.f99958i);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f99961l.reset();
        float f = intrinsicWidth;
        float f2 = m23739G / f;
        float f3 = intrinsicHeight;
        float f4 = m23740F / f3;
        ImageView.ScaleType scaleType = this.f99974y;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f99961l.postTranslate((m23739G - f) / 2.0f, (m23740F - f3) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f2, f4);
            this.f99961l.postScale(max, max);
            this.f99961l.postTranslate((m23739G - (f * max)) / 2.0f, (m23740F - (f3 * max)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f2, f4));
            this.f99961l.postScale(min, min);
            this.f99961l.postTranslate((m23739G - (f * min)) / 2.0f, (m23740F - (f3 * min)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, m23739G, m23740F);
            if (((int) this.f99972w) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f3, f);
            }
            int i = C26517d.f99979a[this.f99974y.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            this.f99961l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                        }
                    } else {
                        this.f99961l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                    }
                } else {
                    this.f99961l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                }
            } else {
                this.f99961l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            }
        }
        m23732N();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        m23692n0(this.f99958i.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C45568nF0 c45568nF0;
        boolean z2;
        GestureDetector gestureDetector;
        boolean z3;
        boolean z4;
        RectF m23744B;
        boolean z5 = false;
        if (!this.f99973x || !C47622qi6.m17205c((ImageView) view)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                if (m23735K() < this.f99953d) {
                    RectF m23744B2 = m23744B();
                    if (m23744B2 != null) {
                        view.post(new RunnableC26518e(m23735K(), this.f99953d, m23744B2.centerX(), m23744B2.centerY()));
                        z = true;
                    }
                } else if (m23735K() > this.f99955f && (m23744B = m23744B()) != null) {
                    view.post(new RunnableC26518e(m23735K(), this.f99955f, m23744B.centerX(), m23744B.centerY()));
                    z = true;
                }
                c45568nF0 = this.f99960k;
                if (c45568nF0 == null) {
                    boolean m24105e = c45568nF0.m24105e();
                    boolean m24106d = this.f99960k.m24106d();
                    boolean m24104f = this.f99960k.m24104f(motionEvent);
                    if (!m24105e && !this.f99960k.m24105e()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!m24106d && !this.f99960k.m24106d()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z3 && z4) {
                        z5 = true;
                    }
                    this.f99957h = z5;
                    z2 = m24104f;
                } else {
                    z2 = z;
                }
                gestureDetector = this.f99959j;
                if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                    return true;
                }
            }
        } else {
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            m23681y();
        }
        z = false;
        c45568nF0 = this.f99960k;
        if (c45568nF0 == null) {
        }
        gestureDetector = this.f99959j;
        return gestureDetector == null ? z2 : z2;
    }

    /* renamed from: y */
    public final void m23681y() {
        RunnableC26519f runnableC26519f = this.f99969t;
        if (runnableC26519f != null) {
            runnableC26519f.m23675a();
            this.f99969t = null;
        }
    }

    /* renamed from: z */
    public final void m23680z() {
        if (m23745A()) {
            m23730P(m23742D());
        }
    }
}
