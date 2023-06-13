package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: androidx.constraintlayout.motion.widget.b */
/* loaded from: classes.dex */
public class C11492b {

    /* renamed from: G */
    public static final float[][] f53731G = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: H */
    public static final float[][] f53732H = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: r */
    public float f53756r;

    /* renamed from: s */
    public float f53757s;

    /* renamed from: t */
    public final MotionLayout f53758t;

    /* renamed from: a */
    public int f53739a = 0;

    /* renamed from: b */
    public int f53740b = 0;

    /* renamed from: c */
    public int f53741c = 0;

    /* renamed from: d */
    public int f53742d = -1;

    /* renamed from: e */
    public int f53743e = -1;

    /* renamed from: f */
    public int f53744f = -1;

    /* renamed from: g */
    public float f53745g = 0.5f;

    /* renamed from: h */
    public float f53746h = 0.5f;

    /* renamed from: i */
    public float f53747i = 0.5f;

    /* renamed from: j */
    public float f53748j = 0.5f;

    /* renamed from: k */
    public int f53749k = -1;

    /* renamed from: l */
    public boolean f53750l = false;

    /* renamed from: m */
    public float f53751m = 0.0f;

    /* renamed from: n */
    public float f53752n = 1.0f;

    /* renamed from: o */
    public boolean f53753o = false;

    /* renamed from: p */
    public float[] f53754p = new float[2];

    /* renamed from: q */
    public int[] f53755q = new int[2];

    /* renamed from: u */
    public float f53759u = 4.0f;

    /* renamed from: v */
    public float f53760v = 1.2f;

    /* renamed from: w */
    public boolean f53761w = true;

    /* renamed from: x */
    public float f53762x = 1.0f;

    /* renamed from: y */
    public int f53763y = 0;

    /* renamed from: z */
    public float f53764z = 10.0f;

    /* renamed from: A */
    public float f53733A = 10.0f;

    /* renamed from: B */
    public float f53734B = 1.0f;

    /* renamed from: C */
    public float f53735C = Float.NaN;

    /* renamed from: D */
    public float f53736D = Float.NaN;

    /* renamed from: E */
    public int f53737E = 0;

    /* renamed from: F */
    public int f53738F = 0;

    /* renamed from: androidx.constraintlayout.motion.widget.b$a */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC11493a implements View.OnTouchListener {
        public View$OnTouchListenerC11493a(C11492b c11492b) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.b$b */
    /* loaded from: classes.dex */
    public class C11494b implements NestedScrollView.InterfaceC11559c {
        public C11494b(C11492b c11492b) {
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC11559c
        /* renamed from: a */
        public void mo67618a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }

    public C11492b(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f53758t = motionLayout;
        m67993c(context, Xml.asAttributeSet(xmlPullParser));
    }

    /* renamed from: A */
    public void m67996A() {
        View view;
        int i = this.f53742d;
        if (i != -1) {
            view = this.f53758t.findViewById(i);
            if (view == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + FU0.m107118c(this.f53758t.getContext(), this.f53742d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new View$OnTouchListenerC11493a(this));
            nestedScrollView.setOnScrollChangeListener(new C11494b(this));
        }
    }

    /* renamed from: a */
    public float m67995a(float f, float f2) {
        return (f * this.f53751m) + (f2 * this.f53752n);
    }

    /* renamed from: b */
    public final void m67994b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == C39341cm4.OnSwipe_touchAnchorId) {
                this.f53742d = typedArray.getResourceId(index, this.f53742d);
            } else if (index == C39341cm4.OnSwipe_touchAnchorSide) {
                int i2 = typedArray.getInt(index, this.f53739a);
                this.f53739a = i2;
                float[] fArr = f53731G[i2];
                this.f53746h = fArr[0];
                this.f53745g = fArr[1];
            } else if (index == C39341cm4.OnSwipe_dragDirection) {
                int i3 = typedArray.getInt(index, this.f53740b);
                this.f53740b = i3;
                float[][] fArr2 = f53732H;
                if (i3 < fArr2.length) {
                    float[] fArr3 = fArr2[i3];
                    this.f53751m = fArr3[0];
                    this.f53752n = fArr3[1];
                } else {
                    this.f53752n = Float.NaN;
                    this.f53751m = Float.NaN;
                    this.f53750l = true;
                }
            } else if (index == C39341cm4.OnSwipe_maxVelocity) {
                this.f53759u = typedArray.getFloat(index, this.f53759u);
            } else if (index == C39341cm4.OnSwipe_maxAcceleration) {
                this.f53760v = typedArray.getFloat(index, this.f53760v);
            } else if (index == C39341cm4.OnSwipe_moveWhenScrollAtTop) {
                this.f53761w = typedArray.getBoolean(index, this.f53761w);
            } else if (index == C39341cm4.OnSwipe_dragScale) {
                this.f53762x = typedArray.getFloat(index, this.f53762x);
            } else if (index == C39341cm4.OnSwipe_dragThreshold) {
                this.f53764z = typedArray.getFloat(index, this.f53764z);
            } else if (index == C39341cm4.OnSwipe_touchRegionId) {
                this.f53743e = typedArray.getResourceId(index, this.f53743e);
            } else if (index == C39341cm4.OnSwipe_onTouchUp) {
                this.f53741c = typedArray.getInt(index, this.f53741c);
            } else if (index == C39341cm4.OnSwipe_nestedScrollFlags) {
                this.f53763y = typedArray.getInteger(index, 0);
            } else if (index == C39341cm4.OnSwipe_limitBoundsTo) {
                this.f53744f = typedArray.getResourceId(index, 0);
            } else if (index == C39341cm4.OnSwipe_rotationCenterId) {
                this.f53749k = typedArray.getResourceId(index, this.f53749k);
            } else if (index == C39341cm4.OnSwipe_springDamping) {
                this.f53733A = typedArray.getFloat(index, this.f53733A);
            } else if (index == C39341cm4.OnSwipe_springMass) {
                this.f53734B = typedArray.getFloat(index, this.f53734B);
            } else if (index == C39341cm4.OnSwipe_springStiffness) {
                this.f53735C = typedArray.getFloat(index, this.f53735C);
            } else if (index == C39341cm4.OnSwipe_springStopThreshold) {
                this.f53736D = typedArray.getFloat(index, this.f53736D);
            } else if (index == C39341cm4.OnSwipe_springBoundary) {
                this.f53737E = typedArray.getInt(index, this.f53737E);
            } else if (index == C39341cm4.OnSwipe_autoCompleteMode) {
                this.f53738F = typedArray.getInt(index, this.f53738F);
            }
        }
    }

    /* renamed from: c */
    public final void m67993c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39341cm4.OnSwipe);
        m67994b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public int m67992d() {
        return this.f53738F;
    }

    /* renamed from: e */
    public int m67991e() {
        return this.f53763y;
    }

    /* renamed from: f */
    public RectF m67990f(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f53744f;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    /* renamed from: g */
    public float m67989g() {
        return this.f53760v;
    }

    /* renamed from: h */
    public float m67988h() {
        return this.f53759u;
    }

    /* renamed from: i */
    public boolean m67987i() {
        return this.f53761w;
    }

    /* renamed from: j */
    public float m67986j(float f, float f2) {
        this.f53758t.m68183P(this.f53742d, this.f53758t.m68176X(), this.f53746h, this.f53745g, this.f53754p);
        float f3 = this.f53751m;
        if (f3 != 0.0f) {
            float[] fArr = this.f53754p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.f53754p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.f53752n) / fArr2[1];
    }

    /* renamed from: k */
    public int m67985k() {
        return this.f53737E;
    }

    /* renamed from: l */
    public float m67984l() {
        return this.f53733A;
    }

    /* renamed from: m */
    public float m67983m() {
        return this.f53734B;
    }

    /* renamed from: n */
    public float m67982n() {
        return this.f53735C;
    }

    /* renamed from: o */
    public float m67981o() {
        return this.f53736D;
    }

    /* renamed from: p */
    public RectF m67980p(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f53743e;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    /* renamed from: q */
    public int m67979q() {
        return this.f53743e;
    }

    /* renamed from: r */
    public boolean m67978r() {
        return this.f53753o;
    }

    /* renamed from: s */
    public void m67977s(MotionEvent motionEvent, MotionLayout.InterfaceC11483h interfaceC11483h, int i, C11488a c11488a) {
        float f;
        float f2;
        int i2;
        float f3;
        float f4;
        boolean z;
        float f5;
        if (this.f53750l) {
            m67976t(motionEvent, interfaceC11483h, i, c11488a);
            return;
        }
        interfaceC11483h.mo68105a(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float rawY = motionEvent.getRawY() - this.f53757s;
                    float rawX = motionEvent.getRawX() - this.f53756r;
                    if (Math.abs((this.f53751m * rawX) + (this.f53752n * rawY)) > this.f53764z || this.f53753o) {
                        float m68176X = this.f53758t.m68176X();
                        if (!this.f53753o) {
                            this.f53753o = true;
                            this.f53758t.setProgress(m68176X);
                        }
                        int i3 = this.f53742d;
                        if (i3 != -1) {
                            this.f53758t.m68183P(i3, m68176X, this.f53746h, this.f53745g, this.f53754p);
                        } else {
                            float min = Math.min(this.f53758t.getWidth(), this.f53758t.getHeight());
                            float[] fArr = this.f53754p;
                            fArr[1] = this.f53752n * min;
                            fArr[0] = min * this.f53751m;
                        }
                        float f6 = this.f53751m;
                        float[] fArr2 = this.f53754p;
                        if (Math.abs(((f6 * fArr2[0]) + (this.f53752n * fArr2[1])) * this.f53762x) < 0.01d) {
                            float[] fArr3 = this.f53754p;
                            fArr3[0] = 0.01f;
                            fArr3[1] = 0.01f;
                        }
                        if (this.f53751m != 0.0f) {
                            f4 = rawX / this.f53754p[0];
                        } else {
                            f4 = rawY / this.f53754p[1];
                        }
                        float max = Math.max(Math.min(m68176X + f4, 1.0f), 0.0f);
                        if (this.f53741c == 6) {
                            max = Math.max(max, 0.01f);
                        }
                        if (this.f53741c == 7) {
                            max = Math.min(max, 0.99f);
                        }
                        float m68176X2 = this.f53758t.m68176X();
                        if (max != m68176X2) {
                            int i4 = (m68176X2 > 0.0f ? 1 : (m68176X2 == 0.0f ? 0 : -1));
                            if (i4 == 0 || m68176X2 == 1.0f) {
                                MotionLayout motionLayout = this.f53758t;
                                if (i4 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                motionLayout.m68189J(z);
                            }
                            this.f53758t.setProgress(max);
                            interfaceC11483h.mo68102d(1000);
                            float mo68101e = interfaceC11483h.mo68101e();
                            float mo68103c = interfaceC11483h.mo68103c();
                            if (this.f53751m != 0.0f) {
                                f5 = mo68101e / this.f53754p[0];
                            } else {
                                f5 = mo68103c / this.f53754p[1];
                            }
                            this.f53758t.f53603e = f5;
                        } else {
                            this.f53758t.f53603e = 0.0f;
                        }
                        this.f53756r = motionEvent.getRawX();
                        this.f53757s = motionEvent.getRawY();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f53753o = false;
            interfaceC11483h.mo68102d(1000);
            float mo68101e2 = interfaceC11483h.mo68101e();
            float mo68103c2 = interfaceC11483h.mo68103c();
            float m68176X3 = this.f53758t.m68176X();
            int i5 = this.f53742d;
            if (i5 != -1) {
                this.f53758t.m68183P(i5, m68176X3, this.f53746h, this.f53745g, this.f53754p);
            } else {
                float min2 = Math.min(this.f53758t.getWidth(), this.f53758t.getHeight());
                float[] fArr4 = this.f53754p;
                fArr4[1] = this.f53752n * min2;
                fArr4[0] = min2 * this.f53751m;
            }
            float f7 = this.f53751m;
            float[] fArr5 = this.f53754p;
            float f8 = fArr5[0];
            float f9 = fArr5[1];
            if (f7 != 0.0f) {
                f = mo68101e2 / f8;
            } else {
                f = mo68103c2 / f9;
            }
            if (!Float.isNaN(f)) {
                f2 = (f / 3.0f) + m68176X3;
            } else {
                f2 = m68176X3;
            }
            if (f2 != 0.0f && f2 != 1.0f && (i2 = this.f53741c) != 3) {
                if (f2 < 0.5d) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                if (i2 == 6) {
                    if (m68176X3 + f < 0.0f) {
                        f = Math.abs(f);
                    }
                    f3 = 1.0f;
                }
                if (this.f53741c == 7) {
                    if (m68176X3 + f > 1.0f) {
                        f = -Math.abs(f);
                    }
                    f3 = 0.0f;
                }
                this.f53758t.m68152m0(this.f53741c, f3, f);
                if (0.0f >= m68176X3 || 1.0f <= m68176X3) {
                    this.f53758t.m68160i0(MotionLayout.EnumC11487l.FINISHED);
                    return;
                }
                return;
            } else if (0.0f >= f2 || 1.0f <= f2) {
                this.f53758t.m68160i0(MotionLayout.EnumC11487l.FINISHED);
                return;
            } else {
                return;
            }
        }
        this.f53756r = motionEvent.getRawX();
        this.f53757s = motionEvent.getRawY();
        this.f53753o = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02bd  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m67976t(MotionEvent motionEvent, MotionLayout.InterfaceC11483h interfaceC11483h, int i, C11488a c11488a) {
        float left;
        float f;
        int top;
        int bottom;
        float rawY;
        int i2;
        float degrees;
        float f2;
        int i3;
        float f3;
        float[] fArr;
        View findViewById;
        double atan2;
        float[] fArr2;
        interfaceC11483h.mo68105a(motionEvent);
        int action = motionEvent.getAction();
        boolean z = false;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    motionEvent.getRawY();
                    motionEvent.getRawX();
                    float width = this.f53758t.getWidth() / 2.0f;
                    float height = this.f53758t.getHeight() / 2.0f;
                    int i4 = this.f53749k;
                    if (i4 != -1) {
                        View findViewById2 = this.f53758t.findViewById(i4);
                        this.f53758t.getLocationOnScreen(this.f53755q);
                        height = ((findViewById2.getTop() + findViewById2.getBottom()) / 2.0f) + this.f53755q[1];
                        width = this.f53755q[0] + ((findViewById2.getLeft() + findViewById2.getRight()) / 2.0f);
                    } else {
                        int i5 = this.f53742d;
                        if (i5 != -1) {
                            if (this.f53758t.findViewById(this.f53758t.m68178V(i5).m92149h()) == null) {
                                Log.e("TouchResponse", "could not find view to animate to");
                            } else {
                                this.f53758t.getLocationOnScreen(this.f53755q);
                                width = this.f53755q[0] + ((findViewById.getLeft() + findViewById.getRight()) / 2.0f);
                                height = this.f53755q[1] + ((findViewById.getTop() + findViewById.getBottom()) / 2.0f);
                            }
                        }
                    }
                    float rawX = motionEvent.getRawX() - width;
                    float rawY2 = motionEvent.getRawY() - height;
                    float atan22 = (float) (((Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width) - Math.atan2(this.f53757s - height, this.f53756r - width)) * 180.0d) / 3.141592653589793d);
                    if (atan22 > 330.0f) {
                        atan22 -= 360.0f;
                    } else if (atan22 < -330.0f) {
                        atan22 += 360.0f;
                    }
                    if (Math.abs(atan22) > 0.01d || this.f53753o) {
                        float m68176X = this.f53758t.m68176X();
                        if (!this.f53753o) {
                            this.f53753o = true;
                            this.f53758t.setProgress(m68176X);
                        }
                        int i6 = this.f53742d;
                        if (i6 != -1) {
                            this.f53758t.m68183P(i6, m68176X, this.f53746h, this.f53745g, this.f53754p);
                            this.f53754p[1] = (float) Math.toDegrees(fArr2[1]);
                        } else {
                            this.f53754p[1] = 360.0f;
                        }
                        float max = Math.max(Math.min(m68176X + ((atan22 * this.f53762x) / this.f53754p[1]), 1.0f), 0.0f);
                        float m68176X2 = this.f53758t.m68176X();
                        if (max != m68176X2) {
                            int i7 = (m68176X2 > 0.0f ? 1 : (m68176X2 == 0.0f ? 0 : -1));
                            if (i7 == 0 || m68176X2 == 1.0f) {
                                MotionLayout motionLayout = this.f53758t;
                                if (i7 == 0) {
                                    z = true;
                                }
                                motionLayout.m68189J(z);
                            }
                            this.f53758t.setProgress(max);
                            interfaceC11483h.mo68102d(1000);
                            float mo68101e = interfaceC11483h.mo68101e();
                            double mo68103c = interfaceC11483h.mo68103c();
                            double d = mo68101e;
                            this.f53758t.f53603e = (float) Math.toDegrees((float) ((Math.hypot(mo68103c, d) * Math.sin(Math.atan2(mo68103c, d) - atan2)) / Math.hypot(rawX, rawY2)));
                        } else {
                            this.f53758t.f53603e = 0.0f;
                        }
                        this.f53756r = motionEvent.getRawX();
                        this.f53757s = motionEvent.getRawY();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f53753o = false;
            interfaceC11483h.mo68102d(16);
            float mo68101e2 = interfaceC11483h.mo68101e();
            float mo68103c2 = interfaceC11483h.mo68103c();
            float m68176X3 = this.f53758t.m68176X();
            float width2 = this.f53758t.getWidth() / 2.0f;
            float height2 = this.f53758t.getHeight() / 2.0f;
            int i8 = this.f53749k;
            if (i8 != -1) {
                View findViewById3 = this.f53758t.findViewById(i8);
                this.f53758t.getLocationOnScreen(this.f53755q);
                left = this.f53755q[0] + ((findViewById3.getLeft() + findViewById3.getRight()) / 2.0f);
                f = this.f53755q[1];
                top = findViewById3.getTop();
                bottom = findViewById3.getBottom();
            } else {
                int i9 = this.f53742d;
                if (i9 != -1) {
                    View findViewById4 = this.f53758t.findViewById(this.f53758t.m68178V(i9).m92149h());
                    this.f53758t.getLocationOnScreen(this.f53755q);
                    left = this.f53755q[0] + ((findViewById4.getLeft() + findViewById4.getRight()) / 2.0f);
                    f = this.f53755q[1];
                    top = findViewById4.getTop();
                    bottom = findViewById4.getBottom();
                }
                float rawX2 = motionEvent.getRawX() - width2;
                double degrees2 = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX2));
                i2 = this.f53742d;
                if (i2 == -1) {
                    this.f53758t.m68183P(i2, m68176X3, this.f53746h, this.f53745g, this.f53754p);
                    this.f53754p[1] = (float) Math.toDegrees(fArr[1]);
                } else {
                    this.f53754p[1] = 360.0f;
                }
                degrees = ((float) (Math.toDegrees(Math.atan2(mo68103c2 + rawY, mo68101e2 + rawX2)) - degrees2)) * 62.5f;
                if (Float.isNaN(degrees)) {
                    f2 = (((degrees * 3.0f) * this.f53762x) / this.f53754p[1]) + m68176X3;
                } else {
                    f2 = m68176X3;
                }
                if (f2 == 0.0f && f2 != 1.0f && (i3 = this.f53741c) != 3) {
                    float f4 = (degrees * this.f53762x) / this.f53754p[1];
                    if (f2 < 0.5d) {
                        f3 = 0.0f;
                    } else {
                        f3 = 1.0f;
                    }
                    if (i3 == 6) {
                        if (m68176X3 + f4 < 0.0f) {
                            f4 = Math.abs(f4);
                        }
                        f3 = 1.0f;
                    }
                    if (this.f53741c == 7) {
                        if (m68176X3 + f4 > 1.0f) {
                            f4 = -Math.abs(f4);
                        }
                        f3 = 0.0f;
                    }
                    this.f53758t.m68152m0(this.f53741c, f3, f4 * 3.0f);
                    if (0.0f >= m68176X3 || 1.0f <= m68176X3) {
                        this.f53758t.m68160i0(MotionLayout.EnumC11487l.FINISHED);
                        return;
                    }
                    return;
                } else if (0.0f < f2 || 1.0f <= f2) {
                    this.f53758t.m68160i0(MotionLayout.EnumC11487l.FINISHED);
                    return;
                } else {
                    return;
                }
            }
            height2 = f + ((top + bottom) / 2.0f);
            width2 = left;
            float rawX22 = motionEvent.getRawX() - width2;
            double degrees22 = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX22));
            i2 = this.f53742d;
            if (i2 == -1) {
            }
            degrees = ((float) (Math.toDegrees(Math.atan2(mo68103c2 + rawY, mo68101e2 + rawX22)) - degrees22)) * 62.5f;
            if (Float.isNaN(degrees)) {
            }
            if (f2 == 0.0f) {
            }
            if (0.0f < f2) {
            }
            this.f53758t.m68160i0(MotionLayout.EnumC11487l.FINISHED);
            return;
        }
        this.f53756r = motionEvent.getRawX();
        this.f53757s = motionEvent.getRawY();
        this.f53753o = false;
    }

    public String toString() {
        if (Float.isNaN(this.f53751m)) {
            return "rotation";
        }
        return this.f53751m + " , " + this.f53752n;
    }

    /* renamed from: u */
    public void m67975u(float f, float f2) {
        float f3;
        float m68176X = this.f53758t.m68176X();
        if (!this.f53753o) {
            this.f53753o = true;
            this.f53758t.setProgress(m68176X);
        }
        this.f53758t.m68183P(this.f53742d, m68176X, this.f53746h, this.f53745g, this.f53754p);
        float f4 = this.f53751m;
        float[] fArr = this.f53754p;
        if (Math.abs((f4 * fArr[0]) + (this.f53752n * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f53754p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f5 = this.f53751m;
        if (f5 != 0.0f) {
            f3 = (f * f5) / this.f53754p[0];
        } else {
            f3 = (f2 * this.f53752n) / this.f53754p[1];
        }
        float max = Math.max(Math.min(m68176X + f3, 1.0f), 0.0f);
        if (max != this.f53758t.m68176X()) {
            this.f53758t.setProgress(max);
        }
    }

    /* renamed from: v */
    public void m67974v(float f, float f2) {
        float f3;
        boolean z;
        boolean z2 = false;
        this.f53753o = false;
        float m68176X = this.f53758t.m68176X();
        this.f53758t.m68183P(this.f53742d, m68176X, this.f53746h, this.f53745g, this.f53754p);
        float f4 = this.f53751m;
        float[] fArr = this.f53754p;
        float f5 = fArr[0];
        float f6 = this.f53752n;
        float f7 = fArr[1];
        float f8 = 0.0f;
        if (f4 != 0.0f) {
            f3 = (f * f4) / f5;
        } else {
            f3 = (f2 * f6) / f7;
        }
        if (!Float.isNaN(f3)) {
            m68176X += f3 / 3.0f;
        }
        if (m68176X != 0.0f) {
            if (m68176X != 1.0f) {
                z = true;
            } else {
                z = false;
            }
            int i = this.f53741c;
            if (i != 3) {
                z2 = true;
            }
            if (z2 & z) {
                MotionLayout motionLayout = this.f53758t;
                if (m68176X >= 0.5d) {
                    f8 = 1.0f;
                }
                motionLayout.m68152m0(i, f8, f3);
            }
        }
    }

    /* renamed from: w */
    public void m67973w(float f, float f2) {
        this.f53756r = f;
        this.f53757s = f2;
    }

    /* renamed from: x */
    public void m67972x(boolean z) {
        if (z) {
            float[][] fArr = f53732H;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f53731G;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f53732H;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f53731G;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f53731G[this.f53739a];
        this.f53746h = fArr5[0];
        this.f53745g = fArr5[1];
        int i = this.f53740b;
        float[][] fArr6 = f53732H;
        if (i >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i];
        this.f53751m = fArr7[0];
        this.f53752n = fArr7[1];
    }

    /* renamed from: y */
    public void m67971y(int i) {
        this.f53741c = i;
    }

    /* renamed from: z */
    public void m67970z(float f, float f2) {
        this.f53756r = f;
        this.f53757s = f2;
        this.f53753o = false;
    }
}
