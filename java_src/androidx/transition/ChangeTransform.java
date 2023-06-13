package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class ChangeTransform extends Transition {

    /* renamed from: S */
    public static final String[] f55851S = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: T */
    public static final Property<C12025e, float[]> f55852T = new C12021a(float[].class, "nonTranslations");

    /* renamed from: U */
    public static final Property<C12025e, PointF> f55853U = new C12022b(PointF.class, "translations");

    /* renamed from: W */
    public static final boolean f55854W = true;

    /* renamed from: P */
    public boolean f55855P;

    /* renamed from: Q */
    public boolean f55856Q;

    /* renamed from: R */
    public Matrix f55857R;

    /* renamed from: androidx.transition.ChangeTransform$a */
    /* loaded from: classes.dex */
    public static class C12021a extends Property<C12025e, float[]> {
        public C12021a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public float[] get(C12025e c12025e) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C12025e c12025e, float[] fArr) {
            c12025e.m65922d(fArr);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$b */
    /* loaded from: classes.dex */
    public static class C12022b extends Property<C12025e, PointF> {
        public C12022b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C12025e c12025e) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C12025e c12025e, PointF pointF) {
            c12025e.m65923c(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$c */
    /* loaded from: classes.dex */
    public class C12023c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f55858a;

        /* renamed from: b */
        public Matrix f55859b = new Matrix();

        /* renamed from: c */
        public final /* synthetic */ boolean f55860c;

        /* renamed from: d */
        public final /* synthetic */ Matrix f55861d;

        /* renamed from: e */
        public final /* synthetic */ View f55862e;

        /* renamed from: f */
        public final /* synthetic */ C12026f f55863f;

        /* renamed from: g */
        public final /* synthetic */ C12025e f55864g;

        public C12023c(boolean z, Matrix matrix, View view, C12026f c12026f, C12025e c12025e) {
            this.f55860c = z;
            this.f55861d = matrix;
            this.f55862e = view;
            this.f55863f = c12026f;
            this.f55864g = c12025e;
        }

        /* renamed from: a */
        public final void m65926a(Matrix matrix) {
            this.f55859b.set(matrix);
            this.f55862e.setTag(C36351Ug4.transition_transform, this.f55859b);
            this.f55863f.m65921a(this.f55862e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f55858a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f55858a) {
                if (this.f55860c && ChangeTransform.this.f55855P) {
                    m65926a(this.f55861d);
                } else {
                    this.f55862e.setTag(C36351Ug4.transition_transform, null);
                    this.f55862e.setTag(C36351Ug4.parent_matrix, null);
                }
            }
            C37172Xt6.m76166f(this.f55862e, null);
            this.f55863f.m65921a(this.f55862e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            m65926a(this.f55864g.m65925a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            ChangeTransform.m65933G0(this.f55862e);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$d */
    /* loaded from: classes.dex */
    public static class C12024d extends C12054b {

        /* renamed from: a */
        public View f55866a;

        /* renamed from: b */
        public InterfaceC45542nC1 f55867b;

        public C12024d(View view, InterfaceC45542nC1 interfaceC45542nC1) {
            this.f55866a = view;
            this.f55867b = interfaceC45542nC1;
        }

        @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
        public void onTransitionEnd(Transition transition) {
            transition.mo65854h0(this);
            C47914rC1.m16266b(this.f55866a);
            this.f55866a.setTag(C36351Ug4.transition_transform, null);
            this.f55866a.setTag(C36351Ug4.parent_matrix, null);
        }

        @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
        public void onTransitionPause(Transition transition) {
            this.f55867b.setVisibility(4);
        }

        @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
        public void onTransitionResume(Transition transition) {
            this.f55867b.setVisibility(0);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$e */
    /* loaded from: classes.dex */
    public static class C12025e {

        /* renamed from: a */
        public final Matrix f55868a = new Matrix();

        /* renamed from: b */
        public final View f55869b;

        /* renamed from: c */
        public final float[] f55870c;

        /* renamed from: d */
        public float f55871d;

        /* renamed from: e */
        public float f55872e;

        public C12025e(View view, float[] fArr) {
            this.f55869b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f55870c = fArr2;
            this.f55871d = fArr2[2];
            this.f55872e = fArr2[5];
            m65924b();
        }

        /* renamed from: a */
        public Matrix m65925a() {
            return this.f55868a;
        }

        /* renamed from: b */
        public final void m65924b() {
            float[] fArr = this.f55870c;
            fArr[2] = this.f55871d;
            fArr[5] = this.f55872e;
            this.f55868a.setValues(fArr);
            C37172Xt6.m76166f(this.f55869b, this.f55868a);
        }

        /* renamed from: c */
        public void m65923c(PointF pointF) {
            this.f55871d = pointF.x;
            this.f55872e = pointF.y;
            m65924b();
        }

        /* renamed from: d */
        public void m65922d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f55870c, 0, fArr.length);
            m65924b();
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$f */
    /* loaded from: classes.dex */
    public static class C12026f {

        /* renamed from: a */
        public final float f55873a;

        /* renamed from: b */
        public final float f55874b;

        /* renamed from: c */
        public final float f55875c;

        /* renamed from: d */
        public final float f55876d;

        /* renamed from: e */
        public final float f55877e;

        /* renamed from: f */
        public final float f55878f;

        /* renamed from: g */
        public final float f55879g;

        /* renamed from: h */
        public final float f55880h;

        public C12026f(View view) {
            this.f55873a = view.getTranslationX();
            this.f55874b = view.getTranslationY();
            this.f55875c = C38790bq6.m62524P(view);
            this.f55876d = view.getScaleX();
            this.f55877e = view.getScaleY();
            this.f55878f = view.getRotationX();
            this.f55879g = view.getRotationY();
            this.f55880h = view.getRotation();
        }

        /* renamed from: a */
        public void m65921a(View view) {
            ChangeTransform.m65931I0(view, this.f55873a, this.f55874b, this.f55875c, this.f55876d, this.f55877e, this.f55878f, this.f55879g, this.f55880h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12026f)) {
                return false;
            }
            C12026f c12026f = (C12026f) obj;
            if (c12026f.f55873a != this.f55873a || c12026f.f55874b != this.f55874b || c12026f.f55875c != this.f55875c || c12026f.f55876d != this.f55876d || c12026f.f55877e != this.f55877e || c12026f.f55878f != this.f55878f || c12026f.f55879g != this.f55879g || c12026f.f55880h != this.f55880h) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            float f = this.f55873a;
            int i8 = 0;
            if (f != 0.0f) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i9 = i * 31;
            float f2 = this.f55874b;
            if (f2 != 0.0f) {
                i2 = Float.floatToIntBits(f2);
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 31;
            float f3 = this.f55875c;
            if (f3 != 0.0f) {
                i3 = Float.floatToIntBits(f3);
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 31;
            float f4 = this.f55876d;
            if (f4 != 0.0f) {
                i4 = Float.floatToIntBits(f4);
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 31;
            float f5 = this.f55877e;
            if (f5 != 0.0f) {
                i5 = Float.floatToIntBits(f5);
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 31;
            float f6 = this.f55878f;
            if (f6 != 0.0f) {
                i6 = Float.floatToIntBits(f6);
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 31;
            float f7 = this.f55879g;
            if (f7 != 0.0f) {
                i7 = Float.floatToIntBits(f7);
            } else {
                i7 = 0;
            }
            int i15 = (i14 + i7) * 31;
            float f8 = this.f55880h;
            if (f8 != 0.0f) {
                i8 = Float.floatToIntBits(f8);
            }
            return i15 + i8;
        }
    }

    public ChangeTransform() {
        this.f55855P = true;
        this.f55856Q = true;
        this.f55857R = new Matrix();
    }

    /* renamed from: G0 */
    public static void m65933G0(View view) {
        m65931I0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: I0 */
    public static void m65931I0(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        C38790bq6.m62497b1(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    /* renamed from: A0 */
    public final void m65937A0(N96 n96) {
        Matrix matrix;
        View view = n96.f24200b;
        if (view.getVisibility() == 8) {
            return;
        }
        n96.f24199a.put("android:changeTransform:parent", view.getParent());
        n96.f24199a.put("android:changeTransform:transforms", new C12026f(view));
        Matrix matrix2 = view.getMatrix();
        if (matrix2 != null && !matrix2.isIdentity()) {
            matrix = new Matrix(matrix2);
        } else {
            matrix = null;
        }
        n96.f24199a.put("android:changeTransform:matrix", matrix);
        if (this.f55856Q) {
            Matrix matrix3 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            C37172Xt6.m76162j(viewGroup, matrix3);
            matrix3.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            n96.f24199a.put("android:changeTransform:parentMatrix", matrix3);
            n96.f24199a.put("android:changeTransform:intermediateMatrix", view.getTag(C36351Ug4.transition_transform));
            n96.f24199a.put("android:changeTransform:intermediateParentMatrix", view.getTag(C36351Ug4.parent_matrix));
        }
    }

    /* renamed from: B0 */
    public final void m65936B0(ViewGroup viewGroup, N96 n96, N96 n962) {
        View view = n962.f24200b;
        Matrix matrix = new Matrix((Matrix) n962.f24199a.get("android:changeTransform:parentMatrix"));
        C37172Xt6.m76161k(viewGroup, matrix);
        InterfaceC45542nC1 m16267a = C47914rC1.m16267a(view, viewGroup, matrix);
        if (m16267a == null) {
            return;
        }
        m16267a.mo17916a((ViewGroup) n96.f24199a.get("android:changeTransform:parent"), n96.f24200b);
        Transition transition = this;
        while (true) {
            Transition transition2 = transition.f55929s;
            if (transition2 == null) {
                break;
            }
            transition = transition2;
        }
        transition.mo65857d(new C12024d(view, m16267a));
        if (f55854W) {
            View view2 = n96.f24200b;
            if (view2 != n962.f24200b) {
                C37172Xt6.m76164h(view2, 0.0f);
            }
            C37172Xt6.m76164h(view, 1.0f);
        }
    }

    /* renamed from: C0 */
    public final ObjectAnimator m65935C0(N96 n96, N96 n962, boolean z) {
        Matrix matrix = (Matrix) n96.f24199a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) n962.f24199a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = C47421qN2.f105198a;
        }
        if (matrix2 == null) {
            matrix2 = C47421qN2.f105198a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        C12026f c12026f = (C12026f) n962.f24199a.get("android:changeTransform:transforms");
        View view = n962.f24200b;
        m65933G0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        C12025e c12025e = new C12025e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c12025e, PropertyValuesHolder.ofObject(f55852T, new C44772lu1(new float[9]), fArr, fArr2), B94.m114320a(f55853U, m65903H().mo65872a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        C12023c c12023c = new C12023c(z, matrix3, view, c12026f, c12025e);
        ofPropertyValuesHolder.addListener(c12023c);
        C1112Cf.m111928a(ofPropertyValuesHolder, c12023c);
        return ofPropertyValuesHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r5 == r4.f24200b) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (r4 == r5) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001f, code lost:
        return r1;
     */
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m65934F0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        boolean z = true;
        if (m65893X(viewGroup) && m65893X(viewGroup2)) {
            N96 m65905D = m65905D(viewGroup, true);
            if (m65905D == null) {
                return false;
            }
        }
    }

    /* renamed from: H0 */
    public final void m65932H0(N96 n96, N96 n962) {
        Matrix matrix = (Matrix) n962.f24199a.get("android:changeTransform:parentMatrix");
        n962.f24200b.setTag(C36351Ug4.parent_matrix, matrix);
        Matrix matrix2 = this.f55857R;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) n96.f24199a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            n96.f24199a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) n96.f24199a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    @Override // androidx.transition.Transition
    /* renamed from: S */
    public String[] mo65829S() {
        return f55851S;
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    public void mo65827k(N96 n96) {
        m65937A0(n96);
    }

    @Override // androidx.transition.Transition
    /* renamed from: n */
    public void mo65826n(N96 n96) {
        m65937A0(n96);
        if (!f55854W) {
            ((ViewGroup) n96.f24200b.getParent()).startViewTransition(n96.f24200b);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: r */
    public Animator mo65825r(ViewGroup viewGroup, N96 n96, N96 n962) {
        boolean z;
        if (n96 != null && n962 != null && n96.f24199a.containsKey("android:changeTransform:parent") && n962.f24199a.containsKey("android:changeTransform:parent")) {
            ViewGroup viewGroup2 = (ViewGroup) n96.f24199a.get("android:changeTransform:parent");
            ViewGroup viewGroup3 = (ViewGroup) n962.f24199a.get("android:changeTransform:parent");
            if (this.f55856Q && !m65934F0(viewGroup2, viewGroup3)) {
                z = true;
            } else {
                z = false;
            }
            Matrix matrix = (Matrix) n96.f24199a.get("android:changeTransform:intermediateMatrix");
            if (matrix != null) {
                n96.f24199a.put("android:changeTransform:matrix", matrix);
            }
            Matrix matrix2 = (Matrix) n96.f24199a.get("android:changeTransform:intermediateParentMatrix");
            if (matrix2 != null) {
                n96.f24199a.put("android:changeTransform:parentMatrix", matrix2);
            }
            if (z) {
                m65932H0(n96, n962);
            }
            ObjectAnimator m65935C0 = m65935C0(n96, n962, z);
            if (z && m65935C0 != null && this.f55855P) {
                m65936B0(viewGroup, n96, n962);
            } else if (!f55854W) {
                viewGroup2.endViewTransition(n96.f24200b);
            }
            return m65935C0;
        }
        return null;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55855P = true;
        this.f55856Q = true;
        this.f55857R = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SS5.f33753g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f55855P = C33266Hb6.m103675a(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f55856Q = C33266Hb6.m103675a(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
}
