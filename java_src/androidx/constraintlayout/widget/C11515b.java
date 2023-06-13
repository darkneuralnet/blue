package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: classes.dex */
public class C11515b {

    /* renamed from: h */
    public static final int[] f54072h = {0, 4, 8};

    /* renamed from: i */
    public static SparseIntArray f54073i = new SparseIntArray();

    /* renamed from: j */
    public static SparseIntArray f54074j = new SparseIntArray();

    /* renamed from: a */
    public boolean f54075a;

    /* renamed from: b */
    public String f54076b;

    /* renamed from: c */
    public String f54077c = "";

    /* renamed from: d */
    public int f54078d = 0;

    /* renamed from: e */
    public HashMap<String, C11512a> f54079e = new HashMap<>();

    /* renamed from: f */
    public boolean f54080f = true;

    /* renamed from: g */
    public HashMap<Integer, C11516a> f54081g = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.b$a */
    /* loaded from: classes.dex */
    public static class C11516a {

        /* renamed from: a */
        public int f54082a;

        /* renamed from: b */
        public String f54083b;

        /* renamed from: c */
        public final C11520d f54084c = new C11520d();

        /* renamed from: d */
        public final C11519c f54085d = new C11519c();

        /* renamed from: e */
        public final C11518b f54086e = new C11518b();

        /* renamed from: f */
        public final C11521e f54087f = new C11521e();

        /* renamed from: g */
        public HashMap<String, C11512a> f54088g = new HashMap<>();

        /* renamed from: h */
        public C11517a f54089h;

        /* renamed from: androidx.constraintlayout.widget.b$a$a */
        /* loaded from: classes.dex */
        public static class C11517a {

            /* renamed from: a */
            public int[] f54090a = new int[10];

            /* renamed from: b */
            public int[] f54091b = new int[10];

            /* renamed from: c */
            public int f54092c = 0;

            /* renamed from: d */
            public int[] f54093d = new int[10];

            /* renamed from: e */
            public float[] f54094e = new float[10];

            /* renamed from: f */
            public int f54095f = 0;

            /* renamed from: g */
            public int[] f54096g = new int[5];

            /* renamed from: h */
            public String[] f54097h = new String[5];

            /* renamed from: i */
            public int f54098i = 0;

            /* renamed from: j */
            public int[] f54099j = new int[4];

            /* renamed from: k */
            public boolean[] f54100k = new boolean[4];

            /* renamed from: l */
            public int f54101l = 0;

            /* renamed from: a */
            public void m67792a(int i, float f) {
                int i2 = this.f54095f;
                int[] iArr = this.f54093d;
                if (i2 >= iArr.length) {
                    this.f54093d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f54094e;
                    this.f54094e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f54093d;
                int i3 = this.f54095f;
                iArr2[i3] = i;
                float[] fArr2 = this.f54094e;
                this.f54095f = i3 + 1;
                fArr2[i3] = f;
            }

            /* renamed from: b */
            public void m67791b(int i, int i2) {
                int i3 = this.f54092c;
                int[] iArr = this.f54090a;
                if (i3 >= iArr.length) {
                    this.f54090a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f54091b;
                    this.f54091b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f54090a;
                int i4 = this.f54092c;
                iArr3[i4] = i;
                int[] iArr4 = this.f54091b;
                this.f54092c = i4 + 1;
                iArr4[i4] = i2;
            }

            /* renamed from: c */
            public void m67790c(int i, String str) {
                int i2 = this.f54098i;
                int[] iArr = this.f54096g;
                if (i2 >= iArr.length) {
                    this.f54096g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f54097h;
                    this.f54097h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f54096g;
                int i3 = this.f54098i;
                iArr2[i3] = i;
                String[] strArr2 = this.f54097h;
                this.f54098i = i3 + 1;
                strArr2[i3] = str;
            }

            /* renamed from: d */
            public void m67789d(int i, boolean z) {
                int i2 = this.f54101l;
                int[] iArr = this.f54099j;
                if (i2 >= iArr.length) {
                    this.f54099j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f54100k;
                    this.f54100k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f54099j;
                int i3 = this.f54101l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f54100k;
                this.f54101l = i3 + 1;
                zArr2[i3] = z;
            }

            /* renamed from: e */
            public void m67788e(C11516a c11516a) {
                for (int i = 0; i < this.f54092c; i++) {
                    C11515b.m67834P(c11516a, this.f54090a[i], this.f54091b[i]);
                }
                for (int i2 = 0; i2 < this.f54095f; i2++) {
                    C11515b.m67835O(c11516a, this.f54093d[i2], this.f54094e[i2]);
                }
                for (int i3 = 0; i3 < this.f54098i; i3++) {
                    C11515b.m67833Q(c11516a, this.f54096g[i3], this.f54097h[i3]);
                }
                for (int i4 = 0; i4 < this.f54101l; i4++) {
                    C11515b.m67832R(c11516a, this.f54099j[i4], this.f54100k[i4]);
                }
            }
        }

        /* renamed from: d */
        public void m67798d(C11516a c11516a) {
            C11517a c11517a = this.f54089h;
            if (c11517a != null) {
                c11517a.m67788e(c11516a);
            }
        }

        /* renamed from: e */
        public void m67797e(ConstraintLayout.LayoutParams layoutParams) {
            C11518b c11518b = this.f54086e;
            layoutParams.f53979e = c11518b.f54147j;
            layoutParams.f53981f = c11518b.f54149k;
            layoutParams.f53983g = c11518b.f54151l;
            layoutParams.f53985h = c11518b.f54153m;
            layoutParams.f53987i = c11518b.f54155n;
            layoutParams.f53989j = c11518b.f54157o;
            layoutParams.f53991k = c11518b.f54159p;
            layoutParams.f53993l = c11518b.f54161q;
            layoutParams.f53995m = c11518b.f54163r;
            layoutParams.f53997n = c11518b.f54164s;
            layoutParams.f53999o = c11518b.f54165t;
            layoutParams.f54007s = c11518b.f54166u;
            layoutParams.f54009t = c11518b.f54167v;
            layoutParams.f54011u = c11518b.f54168w;
            layoutParams.f54013v = c11518b.f54169x;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = c11518b.f54110H;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = c11518b.f54111I;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = c11518b.f54112J;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c11518b.f54113K;
            layoutParams.f53945A = c11518b.f54122T;
            layoutParams.f53946B = c11518b.f54121S;
            layoutParams.f54017x = c11518b.f54118P;
            layoutParams.f54019z = c11518b.f54120R;
            layoutParams.f53951G = c11518b.f54170y;
            layoutParams.f53952H = c11518b.f54171z;
            layoutParams.f54001p = c11518b.f54104B;
            layoutParams.f54003q = c11518b.f54105C;
            layoutParams.f54005r = c11518b.f54106D;
            layoutParams.f53953I = c11518b.f54103A;
            layoutParams.f53968X = c11518b.f54107E;
            layoutParams.f53969Y = c11518b.f54108F;
            layoutParams.f53957M = c11518b.f54124V;
            layoutParams.f53956L = c11518b.f54125W;
            layoutParams.f53959O = c11518b.f54127Y;
            layoutParams.f53958N = c11518b.f54126X;
            layoutParams.f53972a0 = c11518b.f54156n0;
            layoutParams.f53974b0 = c11518b.f54158o0;
            layoutParams.f53960P = c11518b.f54128Z;
            layoutParams.f53961Q = c11518b.f54130a0;
            layoutParams.f53964T = c11518b.f54132b0;
            layoutParams.f53965U = c11518b.f54134c0;
            layoutParams.f53962R = c11518b.f54136d0;
            layoutParams.f53963S = c11518b.f54138e0;
            layoutParams.f53966V = c11518b.f54140f0;
            layoutParams.f53967W = c11518b.f54142g0;
            layoutParams.f53970Z = c11518b.f54109G;
            layoutParams.f53975c = c11518b.f54143h;
            layoutParams.f53971a = c11518b.f54139f;
            layoutParams.f53973b = c11518b.f54141g;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = c11518b.f54135d;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = c11518b.f54137e;
            String str = c11518b.f54154m0;
            if (str != null) {
                layoutParams.f53976c0 = str;
            }
            layoutParams.f53978d0 = c11518b.f54162q0;
            layoutParams.setMarginStart(c11518b.f54115M);
            layoutParams.setMarginEnd(this.f54086e.f54114L);
            layoutParams.m67879c();
        }

        /* renamed from: f */
        public C11516a clone() {
            C11516a c11516a = new C11516a();
            c11516a.f54086e.m67787a(this.f54086e);
            c11516a.f54085d.m67785a(this.f54085d);
            c11516a.f54084c.m67783a(this.f54084c);
            c11516a.f54087f.m67781a(this.f54087f);
            c11516a.f54082a = this.f54082a;
            c11516a.f54089h = this.f54089h;
            return c11516a;
        }

        /* renamed from: g */
        public final void m67795g(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f54082a = i;
            C11518b c11518b = this.f54086e;
            c11518b.f54147j = layoutParams.f53979e;
            c11518b.f54149k = layoutParams.f53981f;
            c11518b.f54151l = layoutParams.f53983g;
            c11518b.f54153m = layoutParams.f53985h;
            c11518b.f54155n = layoutParams.f53987i;
            c11518b.f54157o = layoutParams.f53989j;
            c11518b.f54159p = layoutParams.f53991k;
            c11518b.f54161q = layoutParams.f53993l;
            c11518b.f54163r = layoutParams.f53995m;
            c11518b.f54164s = layoutParams.f53997n;
            c11518b.f54165t = layoutParams.f53999o;
            c11518b.f54166u = layoutParams.f54007s;
            c11518b.f54167v = layoutParams.f54009t;
            c11518b.f54168w = layoutParams.f54011u;
            c11518b.f54169x = layoutParams.f54013v;
            c11518b.f54170y = layoutParams.f53951G;
            c11518b.f54171z = layoutParams.f53952H;
            c11518b.f54103A = layoutParams.f53953I;
            c11518b.f54104B = layoutParams.f54001p;
            c11518b.f54105C = layoutParams.f54003q;
            c11518b.f54106D = layoutParams.f54005r;
            c11518b.f54107E = layoutParams.f53968X;
            c11518b.f54108F = layoutParams.f53969Y;
            c11518b.f54109G = layoutParams.f53970Z;
            c11518b.f54143h = layoutParams.f53975c;
            c11518b.f54139f = layoutParams.f53971a;
            c11518b.f54141g = layoutParams.f53973b;
            c11518b.f54135d = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            c11518b.f54137e = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            c11518b.f54110H = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            c11518b.f54111I = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            c11518b.f54112J = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            c11518b.f54113K = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            c11518b.f54116N = layoutParams.f53948D;
            c11518b.f54124V = layoutParams.f53957M;
            c11518b.f54125W = layoutParams.f53956L;
            c11518b.f54127Y = layoutParams.f53959O;
            c11518b.f54126X = layoutParams.f53958N;
            c11518b.f54156n0 = layoutParams.f53972a0;
            c11518b.f54158o0 = layoutParams.f53974b0;
            c11518b.f54128Z = layoutParams.f53960P;
            c11518b.f54130a0 = layoutParams.f53961Q;
            c11518b.f54132b0 = layoutParams.f53964T;
            c11518b.f54134c0 = layoutParams.f53965U;
            c11518b.f54136d0 = layoutParams.f53962R;
            c11518b.f54138e0 = layoutParams.f53963S;
            c11518b.f54140f0 = layoutParams.f53966V;
            c11518b.f54142g0 = layoutParams.f53967W;
            c11518b.f54154m0 = layoutParams.f53976c0;
            c11518b.f54118P = layoutParams.f54017x;
            c11518b.f54120R = layoutParams.f54019z;
            c11518b.f54117O = layoutParams.f54015w;
            c11518b.f54119Q = layoutParams.f54018y;
            c11518b.f54122T = layoutParams.f53945A;
            c11518b.f54121S = layoutParams.f53946B;
            c11518b.f54123U = layoutParams.f53947C;
            c11518b.f54162q0 = layoutParams.f53978d0;
            c11518b.f54114L = layoutParams.getMarginEnd();
            this.f54086e.f54115M = layoutParams.getMarginStart();
        }

        /* renamed from: h */
        public final void m67794h(int i, Constraints.LayoutParams layoutParams) {
            m67795g(i, layoutParams);
            this.f54084c.f54190d = layoutParams.f54041x0;
            C11521e c11521e = this.f54087f;
            c11521e.f54194b = layoutParams.f54031A0;
            c11521e.f54195c = layoutParams.f54032B0;
            c11521e.f54196d = layoutParams.f54033C0;
            c11521e.f54197e = layoutParams.f54034D0;
            c11521e.f54198f = layoutParams.f54035E0;
            c11521e.f54199g = layoutParams.f54036F0;
            c11521e.f54200h = layoutParams.f54037G0;
            c11521e.f54202j = layoutParams.f54038H0;
            c11521e.f54203k = layoutParams.f54039I0;
            c11521e.f54204l = layoutParams.f54040J0;
            c11521e.f54206n = layoutParams.f54043z0;
            c11521e.f54205m = layoutParams.f54042y0;
        }

        /* renamed from: i */
        public final void m67793i(ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            m67794h(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                C11518b c11518b = this.f54086e;
                c11518b.f54148j0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                c11518b.f54144h0 = barrier.m67904E();
                this.f54086e.f54150k0 = barrier.m67891o();
                this.f54086e.f54146i0 = barrier.m67905D();
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b */
    /* loaded from: classes.dex */
    public static class C11518b {

        /* renamed from: r0 */
        public static SparseIntArray f54102r0;

        /* renamed from: d */
        public int f54135d;

        /* renamed from: e */
        public int f54137e;

        /* renamed from: k0 */
        public int[] f54150k0;

        /* renamed from: l0 */
        public String f54152l0;

        /* renamed from: m0 */
        public String f54154m0;

        /* renamed from: a */
        public boolean f54129a = false;

        /* renamed from: b */
        public boolean f54131b = false;

        /* renamed from: c */
        public boolean f54133c = false;

        /* renamed from: f */
        public int f54139f = -1;

        /* renamed from: g */
        public int f54141g = -1;

        /* renamed from: h */
        public float f54143h = -1.0f;

        /* renamed from: i */
        public boolean f54145i = true;

        /* renamed from: j */
        public int f54147j = -1;

        /* renamed from: k */
        public int f54149k = -1;

        /* renamed from: l */
        public int f54151l = -1;

        /* renamed from: m */
        public int f54153m = -1;

        /* renamed from: n */
        public int f54155n = -1;

        /* renamed from: o */
        public int f54157o = -1;

        /* renamed from: p */
        public int f54159p = -1;

        /* renamed from: q */
        public int f54161q = -1;

        /* renamed from: r */
        public int f54163r = -1;

        /* renamed from: s */
        public int f54164s = -1;

        /* renamed from: t */
        public int f54165t = -1;

        /* renamed from: u */
        public int f54166u = -1;

        /* renamed from: v */
        public int f54167v = -1;

        /* renamed from: w */
        public int f54168w = -1;

        /* renamed from: x */
        public int f54169x = -1;

        /* renamed from: y */
        public float f54170y = 0.5f;

        /* renamed from: z */
        public float f54171z = 0.5f;

        /* renamed from: A */
        public String f54103A = null;

        /* renamed from: B */
        public int f54104B = -1;

        /* renamed from: C */
        public int f54105C = 0;

        /* renamed from: D */
        public float f54106D = 0.0f;

        /* renamed from: E */
        public int f54107E = -1;

        /* renamed from: F */
        public int f54108F = -1;

        /* renamed from: G */
        public int f54109G = -1;

        /* renamed from: H */
        public int f54110H = 0;

        /* renamed from: I */
        public int f54111I = 0;

        /* renamed from: J */
        public int f54112J = 0;

        /* renamed from: K */
        public int f54113K = 0;

        /* renamed from: L */
        public int f54114L = 0;

        /* renamed from: M */
        public int f54115M = 0;

        /* renamed from: N */
        public int f54116N = 0;

        /* renamed from: O */
        public int f54117O = Integer.MIN_VALUE;

        /* renamed from: P */
        public int f54118P = Integer.MIN_VALUE;

        /* renamed from: Q */
        public int f54119Q = Integer.MIN_VALUE;

        /* renamed from: R */
        public int f54120R = Integer.MIN_VALUE;

        /* renamed from: S */
        public int f54121S = Integer.MIN_VALUE;

        /* renamed from: T */
        public int f54122T = Integer.MIN_VALUE;

        /* renamed from: U */
        public int f54123U = Integer.MIN_VALUE;

        /* renamed from: V */
        public float f54124V = -1.0f;

        /* renamed from: W */
        public float f54125W = -1.0f;

        /* renamed from: X */
        public int f54126X = 0;

        /* renamed from: Y */
        public int f54127Y = 0;

        /* renamed from: Z */
        public int f54128Z = 0;

        /* renamed from: a0 */
        public int f54130a0 = 0;

        /* renamed from: b0 */
        public int f54132b0 = 0;

        /* renamed from: c0 */
        public int f54134c0 = 0;

        /* renamed from: d0 */
        public int f54136d0 = 0;

        /* renamed from: e0 */
        public int f54138e0 = 0;

        /* renamed from: f0 */
        public float f54140f0 = 1.0f;

        /* renamed from: g0 */
        public float f54142g0 = 1.0f;

        /* renamed from: h0 */
        public int f54144h0 = -1;

        /* renamed from: i0 */
        public int f54146i0 = 0;

        /* renamed from: j0 */
        public int f54148j0 = -1;

        /* renamed from: n0 */
        public boolean f54156n0 = false;

        /* renamed from: o0 */
        public boolean f54158o0 = false;

        /* renamed from: p0 */
        public boolean f54160p0 = true;

        /* renamed from: q0 */
        public int f54162q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f54102r0 = sparseIntArray;
            sparseIntArray.append(C39341cm4.Layout_layout_constraintLeft_toLeftOf, 24);
            f54102r0.append(C39341cm4.Layout_layout_constraintLeft_toRightOf, 25);
            f54102r0.append(C39341cm4.Layout_layout_constraintRight_toLeftOf, 28);
            f54102r0.append(C39341cm4.Layout_layout_constraintRight_toRightOf, 29);
            f54102r0.append(C39341cm4.Layout_layout_constraintTop_toTopOf, 35);
            f54102r0.append(C39341cm4.Layout_layout_constraintTop_toBottomOf, 34);
            f54102r0.append(C39341cm4.Layout_layout_constraintBottom_toTopOf, 4);
            f54102r0.append(C39341cm4.Layout_layout_constraintBottom_toBottomOf, 3);
            f54102r0.append(C39341cm4.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f54102r0.append(C39341cm4.Layout_layout_editor_absoluteX, 6);
            f54102r0.append(C39341cm4.Layout_layout_editor_absoluteY, 7);
            f54102r0.append(C39341cm4.Layout_layout_constraintGuide_begin, 17);
            f54102r0.append(C39341cm4.Layout_layout_constraintGuide_end, 18);
            f54102r0.append(C39341cm4.Layout_layout_constraintGuide_percent, 19);
            f54102r0.append(C39341cm4.Layout_guidelineUseRtl, 90);
            f54102r0.append(C39341cm4.Layout_android_orientation, 26);
            f54102r0.append(C39341cm4.Layout_layout_constraintStart_toEndOf, 31);
            f54102r0.append(C39341cm4.Layout_layout_constraintStart_toStartOf, 32);
            f54102r0.append(C39341cm4.Layout_layout_constraintEnd_toStartOf, 10);
            f54102r0.append(C39341cm4.Layout_layout_constraintEnd_toEndOf, 9);
            f54102r0.append(C39341cm4.Layout_layout_goneMarginLeft, 13);
            f54102r0.append(C39341cm4.Layout_layout_goneMarginTop, 16);
            f54102r0.append(C39341cm4.Layout_layout_goneMarginRight, 14);
            f54102r0.append(C39341cm4.Layout_layout_goneMarginBottom, 11);
            f54102r0.append(C39341cm4.Layout_layout_goneMarginStart, 15);
            f54102r0.append(C39341cm4.Layout_layout_goneMarginEnd, 12);
            f54102r0.append(C39341cm4.Layout_layout_constraintVertical_weight, 38);
            f54102r0.append(C39341cm4.Layout_layout_constraintHorizontal_weight, 37);
            f54102r0.append(C39341cm4.Layout_layout_constraintHorizontal_chainStyle, 39);
            f54102r0.append(C39341cm4.Layout_layout_constraintVertical_chainStyle, 40);
            f54102r0.append(C39341cm4.Layout_layout_constraintHorizontal_bias, 20);
            f54102r0.append(C39341cm4.Layout_layout_constraintVertical_bias, 36);
            f54102r0.append(C39341cm4.Layout_layout_constraintDimensionRatio, 5);
            f54102r0.append(C39341cm4.Layout_layout_constraintLeft_creator, 91);
            f54102r0.append(C39341cm4.Layout_layout_constraintTop_creator, 91);
            f54102r0.append(C39341cm4.Layout_layout_constraintRight_creator, 91);
            f54102r0.append(C39341cm4.Layout_layout_constraintBottom_creator, 91);
            f54102r0.append(C39341cm4.Layout_layout_constraintBaseline_creator, 91);
            f54102r0.append(C39341cm4.Layout_android_layout_marginLeft, 23);
            f54102r0.append(C39341cm4.Layout_android_layout_marginRight, 27);
            f54102r0.append(C39341cm4.Layout_android_layout_marginStart, 30);
            f54102r0.append(C39341cm4.Layout_android_layout_marginEnd, 8);
            f54102r0.append(C39341cm4.Layout_android_layout_marginTop, 33);
            f54102r0.append(C39341cm4.Layout_android_layout_marginBottom, 2);
            f54102r0.append(C39341cm4.Layout_android_layout_width, 22);
            f54102r0.append(C39341cm4.Layout_android_layout_height, 21);
            f54102r0.append(C39341cm4.Layout_layout_constraintWidth, 41);
            f54102r0.append(C39341cm4.Layout_layout_constraintHeight, 42);
            f54102r0.append(C39341cm4.Layout_layout_constrainedWidth, 41);
            f54102r0.append(C39341cm4.Layout_layout_constrainedHeight, 42);
            f54102r0.append(C39341cm4.Layout_layout_wrapBehaviorInParent, 76);
            f54102r0.append(C39341cm4.Layout_layout_constraintCircle, 61);
            f54102r0.append(C39341cm4.Layout_layout_constraintCircleRadius, 62);
            f54102r0.append(C39341cm4.Layout_layout_constraintCircleAngle, 63);
            f54102r0.append(C39341cm4.Layout_layout_constraintWidth_percent, 69);
            f54102r0.append(C39341cm4.Layout_layout_constraintHeight_percent, 70);
            f54102r0.append(C39341cm4.Layout_chainUseRtl, 71);
            f54102r0.append(C39341cm4.Layout_barrierDirection, 72);
            f54102r0.append(C39341cm4.Layout_barrierMargin, 73);
            f54102r0.append(C39341cm4.Layout_constraint_referenced_ids, 74);
            f54102r0.append(C39341cm4.Layout_barrierAllowsGoneWidgets, 75);
        }

        /* renamed from: a */
        public void m67787a(C11518b c11518b) {
            this.f54129a = c11518b.f54129a;
            this.f54135d = c11518b.f54135d;
            this.f54131b = c11518b.f54131b;
            this.f54137e = c11518b.f54137e;
            this.f54139f = c11518b.f54139f;
            this.f54141g = c11518b.f54141g;
            this.f54143h = c11518b.f54143h;
            this.f54145i = c11518b.f54145i;
            this.f54147j = c11518b.f54147j;
            this.f54149k = c11518b.f54149k;
            this.f54151l = c11518b.f54151l;
            this.f54153m = c11518b.f54153m;
            this.f54155n = c11518b.f54155n;
            this.f54157o = c11518b.f54157o;
            this.f54159p = c11518b.f54159p;
            this.f54161q = c11518b.f54161q;
            this.f54163r = c11518b.f54163r;
            this.f54164s = c11518b.f54164s;
            this.f54165t = c11518b.f54165t;
            this.f54166u = c11518b.f54166u;
            this.f54167v = c11518b.f54167v;
            this.f54168w = c11518b.f54168w;
            this.f54169x = c11518b.f54169x;
            this.f54170y = c11518b.f54170y;
            this.f54171z = c11518b.f54171z;
            this.f54103A = c11518b.f54103A;
            this.f54104B = c11518b.f54104B;
            this.f54105C = c11518b.f54105C;
            this.f54106D = c11518b.f54106D;
            this.f54107E = c11518b.f54107E;
            this.f54108F = c11518b.f54108F;
            this.f54109G = c11518b.f54109G;
            this.f54110H = c11518b.f54110H;
            this.f54111I = c11518b.f54111I;
            this.f54112J = c11518b.f54112J;
            this.f54113K = c11518b.f54113K;
            this.f54114L = c11518b.f54114L;
            this.f54115M = c11518b.f54115M;
            this.f54116N = c11518b.f54116N;
            this.f54117O = c11518b.f54117O;
            this.f54118P = c11518b.f54118P;
            this.f54119Q = c11518b.f54119Q;
            this.f54120R = c11518b.f54120R;
            this.f54121S = c11518b.f54121S;
            this.f54122T = c11518b.f54122T;
            this.f54123U = c11518b.f54123U;
            this.f54124V = c11518b.f54124V;
            this.f54125W = c11518b.f54125W;
            this.f54126X = c11518b.f54126X;
            this.f54127Y = c11518b.f54127Y;
            this.f54128Z = c11518b.f54128Z;
            this.f54130a0 = c11518b.f54130a0;
            this.f54132b0 = c11518b.f54132b0;
            this.f54134c0 = c11518b.f54134c0;
            this.f54136d0 = c11518b.f54136d0;
            this.f54138e0 = c11518b.f54138e0;
            this.f54140f0 = c11518b.f54140f0;
            this.f54142g0 = c11518b.f54142g0;
            this.f54144h0 = c11518b.f54144h0;
            this.f54146i0 = c11518b.f54146i0;
            this.f54148j0 = c11518b.f54148j0;
            this.f54154m0 = c11518b.f54154m0;
            int[] iArr = c11518b.f54150k0;
            if (iArr != null && c11518b.f54152l0 == null) {
                this.f54150k0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f54150k0 = null;
            }
            this.f54152l0 = c11518b.f54152l0;
            this.f54156n0 = c11518b.f54156n0;
            this.f54158o0 = c11518b.f54158o0;
            this.f54160p0 = c11518b.f54160p0;
            this.f54162q0 = c11518b.f54162q0;
        }

        /* renamed from: b */
        public void m67786b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39341cm4.Layout);
            this.f54131b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f54102r0.get(index);
                switch (i2) {
                    case 1:
                        this.f54163r = C11515b.m67843G(obtainStyledAttributes, index, this.f54163r);
                        break;
                    case 2:
                        this.f54113K = obtainStyledAttributes.getDimensionPixelSize(index, this.f54113K);
                        break;
                    case 3:
                        this.f54161q = C11515b.m67843G(obtainStyledAttributes, index, this.f54161q);
                        break;
                    case 4:
                        this.f54159p = C11515b.m67843G(obtainStyledAttributes, index, this.f54159p);
                        break;
                    case 5:
                        this.f54103A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f54107E = obtainStyledAttributes.getDimensionPixelOffset(index, this.f54107E);
                        break;
                    case 7:
                        this.f54108F = obtainStyledAttributes.getDimensionPixelOffset(index, this.f54108F);
                        break;
                    case 8:
                        this.f54114L = obtainStyledAttributes.getDimensionPixelSize(index, this.f54114L);
                        break;
                    case 9:
                        this.f54169x = C11515b.m67843G(obtainStyledAttributes, index, this.f54169x);
                        break;
                    case 10:
                        this.f54168w = C11515b.m67843G(obtainStyledAttributes, index, this.f54168w);
                        break;
                    case 11:
                        this.f54120R = obtainStyledAttributes.getDimensionPixelSize(index, this.f54120R);
                        break;
                    case 12:
                        this.f54121S = obtainStyledAttributes.getDimensionPixelSize(index, this.f54121S);
                        break;
                    case 13:
                        this.f54117O = obtainStyledAttributes.getDimensionPixelSize(index, this.f54117O);
                        break;
                    case 14:
                        this.f54119Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f54119Q);
                        break;
                    case 15:
                        this.f54122T = obtainStyledAttributes.getDimensionPixelSize(index, this.f54122T);
                        break;
                    case 16:
                        this.f54118P = obtainStyledAttributes.getDimensionPixelSize(index, this.f54118P);
                        break;
                    case 17:
                        this.f54139f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f54139f);
                        break;
                    case 18:
                        this.f54141g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f54141g);
                        break;
                    case 19:
                        this.f54143h = obtainStyledAttributes.getFloat(index, this.f54143h);
                        break;
                    case 20:
                        this.f54170y = obtainStyledAttributes.getFloat(index, this.f54170y);
                        break;
                    case 21:
                        this.f54137e = obtainStyledAttributes.getLayoutDimension(index, this.f54137e);
                        break;
                    case 22:
                        this.f54135d = obtainStyledAttributes.getLayoutDimension(index, this.f54135d);
                        break;
                    case 23:
                        this.f54110H = obtainStyledAttributes.getDimensionPixelSize(index, this.f54110H);
                        break;
                    case 24:
                        this.f54147j = C11515b.m67843G(obtainStyledAttributes, index, this.f54147j);
                        break;
                    case 25:
                        this.f54149k = C11515b.m67843G(obtainStyledAttributes, index, this.f54149k);
                        break;
                    case 26:
                        this.f54109G = obtainStyledAttributes.getInt(index, this.f54109G);
                        break;
                    case 27:
                        this.f54111I = obtainStyledAttributes.getDimensionPixelSize(index, this.f54111I);
                        break;
                    case 28:
                        this.f54151l = C11515b.m67843G(obtainStyledAttributes, index, this.f54151l);
                        break;
                    case 29:
                        this.f54153m = C11515b.m67843G(obtainStyledAttributes, index, this.f54153m);
                        break;
                    case 30:
                        this.f54115M = obtainStyledAttributes.getDimensionPixelSize(index, this.f54115M);
                        break;
                    case 31:
                        this.f54166u = C11515b.m67843G(obtainStyledAttributes, index, this.f54166u);
                        break;
                    case 32:
                        this.f54167v = C11515b.m67843G(obtainStyledAttributes, index, this.f54167v);
                        break;
                    case 33:
                        this.f54112J = obtainStyledAttributes.getDimensionPixelSize(index, this.f54112J);
                        break;
                    case 34:
                        this.f54157o = C11515b.m67843G(obtainStyledAttributes, index, this.f54157o);
                        break;
                    case 35:
                        this.f54155n = C11515b.m67843G(obtainStyledAttributes, index, this.f54155n);
                        break;
                    case 36:
                        this.f54171z = obtainStyledAttributes.getFloat(index, this.f54171z);
                        break;
                    case 37:
                        this.f54125W = obtainStyledAttributes.getFloat(index, this.f54125W);
                        break;
                    case 38:
                        this.f54124V = obtainStyledAttributes.getFloat(index, this.f54124V);
                        break;
                    case 39:
                        this.f54126X = obtainStyledAttributes.getInt(index, this.f54126X);
                        break;
                    case 40:
                        this.f54127Y = obtainStyledAttributes.getInt(index, this.f54127Y);
                        break;
                    case 41:
                        C11515b.m67842H(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        C11515b.m67842H(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.f54104B = C11515b.m67843G(obtainStyledAttributes, index, this.f54104B);
                                continue;
                            case 62:
                                this.f54105C = obtainStyledAttributes.getDimensionPixelSize(index, this.f54105C);
                                continue;
                            case 63:
                                this.f54106D = obtainStyledAttributes.getFloat(index, this.f54106D);
                                continue;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f54140f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.f54142g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.f54144h0 = obtainStyledAttributes.getInt(index, this.f54144h0);
                                        continue;
                                    case 73:
                                        this.f54146i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f54146i0);
                                        continue;
                                    case 74:
                                        this.f54152l0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.f54160p0 = obtainStyledAttributes.getBoolean(index, this.f54160p0);
                                        continue;
                                    case 76:
                                        this.f54162q0 = obtainStyledAttributes.getInt(index, this.f54162q0);
                                        continue;
                                    case 77:
                                        this.f54164s = C11515b.m67843G(obtainStyledAttributes, index, this.f54164s);
                                        continue;
                                    case 78:
                                        this.f54165t = C11515b.m67843G(obtainStyledAttributes, index, this.f54165t);
                                        continue;
                                    case 79:
                                        this.f54123U = obtainStyledAttributes.getDimensionPixelSize(index, this.f54123U);
                                        continue;
                                    case 80:
                                        this.f54116N = obtainStyledAttributes.getDimensionPixelSize(index, this.f54116N);
                                        continue;
                                    case 81:
                                        this.f54128Z = obtainStyledAttributes.getInt(index, this.f54128Z);
                                        continue;
                                    case 82:
                                        this.f54130a0 = obtainStyledAttributes.getInt(index, this.f54130a0);
                                        continue;
                                    case 83:
                                        this.f54134c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f54134c0);
                                        continue;
                                    case 84:
                                        this.f54132b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f54132b0);
                                        continue;
                                    case 85:
                                        this.f54138e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f54138e0);
                                        continue;
                                    case 86:
                                        this.f54136d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f54136d0);
                                        continue;
                                    case 87:
                                        this.f54156n0 = obtainStyledAttributes.getBoolean(index, this.f54156n0);
                                        continue;
                                    case 88:
                                        this.f54158o0 = obtainStyledAttributes.getBoolean(index, this.f54158o0);
                                        continue;
                                    case 89:
                                        this.f54154m0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.f54145i = obtainStyledAttributes.getBoolean(index, this.f54145i);
                                        continue;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f54102r0.get(index));
                                        continue;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f54102r0.get(index));
                                        continue;
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$c */
    /* loaded from: classes.dex */
    public static class C11519c {

        /* renamed from: o */
        public static SparseIntArray f54172o;

        /* renamed from: a */
        public boolean f54173a = false;

        /* renamed from: b */
        public int f54174b = -1;

        /* renamed from: c */
        public int f54175c = 0;

        /* renamed from: d */
        public String f54176d = null;

        /* renamed from: e */
        public int f54177e = -1;

        /* renamed from: f */
        public int f54178f = 0;

        /* renamed from: g */
        public float f54179g = Float.NaN;

        /* renamed from: h */
        public int f54180h = -1;

        /* renamed from: i */
        public float f54181i = Float.NaN;

        /* renamed from: j */
        public float f54182j = Float.NaN;

        /* renamed from: k */
        public int f54183k = -1;

        /* renamed from: l */
        public String f54184l = null;

        /* renamed from: m */
        public int f54185m = -3;

        /* renamed from: n */
        public int f54186n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f54172o = sparseIntArray;
            sparseIntArray.append(C39341cm4.Motion_motionPathRotate, 1);
            f54172o.append(C39341cm4.Motion_pathMotionArc, 2);
            f54172o.append(C39341cm4.Motion_transitionEasing, 3);
            f54172o.append(C39341cm4.Motion_drawPath, 4);
            f54172o.append(C39341cm4.Motion_animateRelativeTo, 5);
            f54172o.append(C39341cm4.Motion_animateCircleAngleTo, 6);
            f54172o.append(C39341cm4.Motion_motionStagger, 7);
            f54172o.append(C39341cm4.Motion_quantizeMotionSteps, 8);
            f54172o.append(C39341cm4.Motion_quantizeMotionPhase, 9);
            f54172o.append(C39341cm4.Motion_quantizeMotionInterpolator, 10);
        }

        /* renamed from: a */
        public void m67785a(C11519c c11519c) {
            this.f54173a = c11519c.f54173a;
            this.f54174b = c11519c.f54174b;
            this.f54176d = c11519c.f54176d;
            this.f54177e = c11519c.f54177e;
            this.f54178f = c11519c.f54178f;
            this.f54181i = c11519c.f54181i;
            this.f54179g = c11519c.f54179g;
            this.f54180h = c11519c.f54180h;
        }

        /* renamed from: b */
        public void m67784b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39341cm4.Motion);
            this.f54173a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f54172o.get(index)) {
                    case 1:
                        this.f54181i = obtainStyledAttributes.getFloat(index, this.f54181i);
                        break;
                    case 2:
                        this.f54177e = obtainStyledAttributes.getInt(index, this.f54177e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f54176d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f54176d = C41363g91.f81686c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f54178f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f54174b = C11515b.m67843G(obtainStyledAttributes, index, this.f54174b);
                        break;
                    case 6:
                        this.f54175c = obtainStyledAttributes.getInteger(index, this.f54175c);
                        break;
                    case 7:
                        this.f54179g = obtainStyledAttributes.getFloat(index, this.f54179g);
                        break;
                    case 8:
                        this.f54183k = obtainStyledAttributes.getInteger(index, this.f54183k);
                        break;
                    case 9:
                        this.f54182j = obtainStyledAttributes.getFloat(index, this.f54182j);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f54186n = resourceId;
                            if (resourceId != -1) {
                                this.f54185m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i2 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f54184l = string;
                            if (string.indexOf("/") > 0) {
                                this.f54186n = obtainStyledAttributes.getResourceId(index, -1);
                                this.f54185m = -2;
                                break;
                            } else {
                                this.f54185m = -1;
                                break;
                            }
                        } else {
                            this.f54185m = obtainStyledAttributes.getInteger(index, this.f54186n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$d */
    /* loaded from: classes.dex */
    public static class C11520d {

        /* renamed from: a */
        public boolean f54187a = false;

        /* renamed from: b */
        public int f54188b = 0;

        /* renamed from: c */
        public int f54189c = 0;

        /* renamed from: d */
        public float f54190d = 1.0f;

        /* renamed from: e */
        public float f54191e = Float.NaN;

        /* renamed from: a */
        public void m67783a(C11520d c11520d) {
            this.f54187a = c11520d.f54187a;
            this.f54188b = c11520d.f54188b;
            this.f54190d = c11520d.f54190d;
            this.f54191e = c11520d.f54191e;
            this.f54189c = c11520d.f54189c;
        }

        /* renamed from: b */
        public void m67782b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39341cm4.PropertySet);
            this.f54187a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.PropertySet_android_alpha) {
                    this.f54190d = obtainStyledAttributes.getFloat(index, this.f54190d);
                } else if (index == C39341cm4.PropertySet_android_visibility) {
                    this.f54188b = obtainStyledAttributes.getInt(index, this.f54188b);
                    this.f54188b = C11515b.f54072h[this.f54188b];
                } else if (index == C39341cm4.PropertySet_visibilityMode) {
                    this.f54189c = obtainStyledAttributes.getInt(index, this.f54189c);
                } else if (index == C39341cm4.PropertySet_motionProgress) {
                    this.f54191e = obtainStyledAttributes.getFloat(index, this.f54191e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$e */
    /* loaded from: classes.dex */
    public static class C11521e {

        /* renamed from: o */
        public static SparseIntArray f54192o;

        /* renamed from: a */
        public boolean f54193a = false;

        /* renamed from: b */
        public float f54194b = 0.0f;

        /* renamed from: c */
        public float f54195c = 0.0f;

        /* renamed from: d */
        public float f54196d = 0.0f;

        /* renamed from: e */
        public float f54197e = 1.0f;

        /* renamed from: f */
        public float f54198f = 1.0f;

        /* renamed from: g */
        public float f54199g = Float.NaN;

        /* renamed from: h */
        public float f54200h = Float.NaN;

        /* renamed from: i */
        public int f54201i = -1;

        /* renamed from: j */
        public float f54202j = 0.0f;

        /* renamed from: k */
        public float f54203k = 0.0f;

        /* renamed from: l */
        public float f54204l = 0.0f;

        /* renamed from: m */
        public boolean f54205m = false;

        /* renamed from: n */
        public float f54206n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f54192o = sparseIntArray;
            sparseIntArray.append(C39341cm4.Transform_android_rotation, 1);
            f54192o.append(C39341cm4.Transform_android_rotationX, 2);
            f54192o.append(C39341cm4.Transform_android_rotationY, 3);
            f54192o.append(C39341cm4.Transform_android_scaleX, 4);
            f54192o.append(C39341cm4.Transform_android_scaleY, 5);
            f54192o.append(C39341cm4.Transform_android_transformPivotX, 6);
            f54192o.append(C39341cm4.Transform_android_transformPivotY, 7);
            f54192o.append(C39341cm4.Transform_android_translationX, 8);
            f54192o.append(C39341cm4.Transform_android_translationY, 9);
            f54192o.append(C39341cm4.Transform_android_translationZ, 10);
            f54192o.append(C39341cm4.Transform_android_elevation, 11);
            f54192o.append(C39341cm4.Transform_transformPivotTarget, 12);
        }

        /* renamed from: a */
        public void m67781a(C11521e c11521e) {
            this.f54193a = c11521e.f54193a;
            this.f54194b = c11521e.f54194b;
            this.f54195c = c11521e.f54195c;
            this.f54196d = c11521e.f54196d;
            this.f54197e = c11521e.f54197e;
            this.f54198f = c11521e.f54198f;
            this.f54199g = c11521e.f54199g;
            this.f54200h = c11521e.f54200h;
            this.f54201i = c11521e.f54201i;
            this.f54202j = c11521e.f54202j;
            this.f54203k = c11521e.f54203k;
            this.f54204l = c11521e.f54204l;
            this.f54205m = c11521e.f54205m;
            this.f54206n = c11521e.f54206n;
        }

        /* renamed from: b */
        public void m67780b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39341cm4.Transform);
            this.f54193a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f54192o.get(index)) {
                    case 1:
                        this.f54194b = obtainStyledAttributes.getFloat(index, this.f54194b);
                        break;
                    case 2:
                        this.f54195c = obtainStyledAttributes.getFloat(index, this.f54195c);
                        break;
                    case 3:
                        this.f54196d = obtainStyledAttributes.getFloat(index, this.f54196d);
                        break;
                    case 4:
                        this.f54197e = obtainStyledAttributes.getFloat(index, this.f54197e);
                        break;
                    case 5:
                        this.f54198f = obtainStyledAttributes.getFloat(index, this.f54198f);
                        break;
                    case 6:
                        this.f54199g = obtainStyledAttributes.getDimension(index, this.f54199g);
                        break;
                    case 7:
                        this.f54200h = obtainStyledAttributes.getDimension(index, this.f54200h);
                        break;
                    case 8:
                        this.f54202j = obtainStyledAttributes.getDimension(index, this.f54202j);
                        break;
                    case 9:
                        this.f54203k = obtainStyledAttributes.getDimension(index, this.f54203k);
                        break;
                    case 10:
                        this.f54204l = obtainStyledAttributes.getDimension(index, this.f54204l);
                        break;
                    case 11:
                        this.f54205m = true;
                        this.f54206n = obtainStyledAttributes.getDimension(index, this.f54206n);
                        break;
                    case 12:
                        this.f54201i = C11515b.m67843G(obtainStyledAttributes, index, this.f54201i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f54073i.append(C39341cm4.Constraint_layout_constraintLeft_toLeftOf, 25);
        f54073i.append(C39341cm4.Constraint_layout_constraintLeft_toRightOf, 26);
        f54073i.append(C39341cm4.Constraint_layout_constraintRight_toLeftOf, 29);
        f54073i.append(C39341cm4.Constraint_layout_constraintRight_toRightOf, 30);
        f54073i.append(C39341cm4.Constraint_layout_constraintTop_toTopOf, 36);
        f54073i.append(C39341cm4.Constraint_layout_constraintTop_toBottomOf, 35);
        f54073i.append(C39341cm4.Constraint_layout_constraintBottom_toTopOf, 4);
        f54073i.append(C39341cm4.Constraint_layout_constraintBottom_toBottomOf, 3);
        f54073i.append(C39341cm4.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f54073i.append(C39341cm4.Constraint_layout_constraintBaseline_toTopOf, 91);
        f54073i.append(C39341cm4.Constraint_layout_constraintBaseline_toBottomOf, 92);
        f54073i.append(C39341cm4.Constraint_layout_editor_absoluteX, 6);
        f54073i.append(C39341cm4.Constraint_layout_editor_absoluteY, 7);
        f54073i.append(C39341cm4.Constraint_layout_constraintGuide_begin, 17);
        f54073i.append(C39341cm4.Constraint_layout_constraintGuide_end, 18);
        f54073i.append(C39341cm4.Constraint_layout_constraintGuide_percent, 19);
        f54073i.append(C39341cm4.Constraint_guidelineUseRtl, 99);
        f54073i.append(C39341cm4.Constraint_android_orientation, 27);
        f54073i.append(C39341cm4.Constraint_layout_constraintStart_toEndOf, 32);
        f54073i.append(C39341cm4.Constraint_layout_constraintStart_toStartOf, 33);
        f54073i.append(C39341cm4.Constraint_layout_constraintEnd_toStartOf, 10);
        f54073i.append(C39341cm4.Constraint_layout_constraintEnd_toEndOf, 9);
        f54073i.append(C39341cm4.Constraint_layout_goneMarginLeft, 13);
        f54073i.append(C39341cm4.Constraint_layout_goneMarginTop, 16);
        f54073i.append(C39341cm4.Constraint_layout_goneMarginRight, 14);
        f54073i.append(C39341cm4.Constraint_layout_goneMarginBottom, 11);
        f54073i.append(C39341cm4.Constraint_layout_goneMarginStart, 15);
        f54073i.append(C39341cm4.Constraint_layout_goneMarginEnd, 12);
        f54073i.append(C39341cm4.Constraint_layout_constraintVertical_weight, 40);
        f54073i.append(C39341cm4.Constraint_layout_constraintHorizontal_weight, 39);
        f54073i.append(C39341cm4.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f54073i.append(C39341cm4.Constraint_layout_constraintVertical_chainStyle, 42);
        f54073i.append(C39341cm4.Constraint_layout_constraintHorizontal_bias, 20);
        f54073i.append(C39341cm4.Constraint_layout_constraintVertical_bias, 37);
        f54073i.append(C39341cm4.Constraint_layout_constraintDimensionRatio, 5);
        f54073i.append(C39341cm4.Constraint_layout_constraintLeft_creator, 87);
        f54073i.append(C39341cm4.Constraint_layout_constraintTop_creator, 87);
        f54073i.append(C39341cm4.Constraint_layout_constraintRight_creator, 87);
        f54073i.append(C39341cm4.Constraint_layout_constraintBottom_creator, 87);
        f54073i.append(C39341cm4.Constraint_layout_constraintBaseline_creator, 87);
        f54073i.append(C39341cm4.Constraint_android_layout_marginLeft, 24);
        f54073i.append(C39341cm4.Constraint_android_layout_marginRight, 28);
        f54073i.append(C39341cm4.Constraint_android_layout_marginStart, 31);
        f54073i.append(C39341cm4.Constraint_android_layout_marginEnd, 8);
        f54073i.append(C39341cm4.Constraint_android_layout_marginTop, 34);
        f54073i.append(C39341cm4.Constraint_android_layout_marginBottom, 2);
        f54073i.append(C39341cm4.Constraint_android_layout_width, 23);
        f54073i.append(C39341cm4.Constraint_android_layout_height, 21);
        f54073i.append(C39341cm4.Constraint_layout_constraintWidth, 95);
        f54073i.append(C39341cm4.Constraint_layout_constraintHeight, 96);
        f54073i.append(C39341cm4.Constraint_android_visibility, 22);
        f54073i.append(C39341cm4.Constraint_android_alpha, 43);
        f54073i.append(C39341cm4.Constraint_android_elevation, 44);
        f54073i.append(C39341cm4.Constraint_android_rotationX, 45);
        f54073i.append(C39341cm4.Constraint_android_rotationY, 46);
        f54073i.append(C39341cm4.Constraint_android_rotation, 60);
        f54073i.append(C39341cm4.Constraint_android_scaleX, 47);
        f54073i.append(C39341cm4.Constraint_android_scaleY, 48);
        f54073i.append(C39341cm4.Constraint_android_transformPivotX, 49);
        f54073i.append(C39341cm4.Constraint_android_transformPivotY, 50);
        f54073i.append(C39341cm4.Constraint_android_translationX, 51);
        f54073i.append(C39341cm4.Constraint_android_translationY, 52);
        f54073i.append(C39341cm4.Constraint_android_translationZ, 53);
        f54073i.append(C39341cm4.Constraint_layout_constraintWidth_default, 54);
        f54073i.append(C39341cm4.Constraint_layout_constraintHeight_default, 55);
        f54073i.append(C39341cm4.Constraint_layout_constraintWidth_max, 56);
        f54073i.append(C39341cm4.Constraint_layout_constraintHeight_max, 57);
        f54073i.append(C39341cm4.Constraint_layout_constraintWidth_min, 58);
        f54073i.append(C39341cm4.Constraint_layout_constraintHeight_min, 59);
        f54073i.append(C39341cm4.Constraint_layout_constraintCircle, 61);
        f54073i.append(C39341cm4.Constraint_layout_constraintCircleRadius, 62);
        f54073i.append(C39341cm4.Constraint_layout_constraintCircleAngle, 63);
        f54073i.append(C39341cm4.Constraint_animateRelativeTo, 64);
        f54073i.append(C39341cm4.Constraint_transitionEasing, 65);
        f54073i.append(C39341cm4.Constraint_drawPath, 66);
        f54073i.append(C39341cm4.Constraint_transitionPathRotate, 67);
        f54073i.append(C39341cm4.Constraint_motionStagger, 79);
        f54073i.append(C39341cm4.Constraint_android_id, 38);
        f54073i.append(C39341cm4.Constraint_motionProgress, 68);
        f54073i.append(C39341cm4.Constraint_layout_constraintWidth_percent, 69);
        f54073i.append(C39341cm4.Constraint_layout_constraintHeight_percent, 70);
        f54073i.append(C39341cm4.Constraint_layout_wrapBehaviorInParent, 97);
        f54073i.append(C39341cm4.Constraint_chainUseRtl, 71);
        f54073i.append(C39341cm4.Constraint_barrierDirection, 72);
        f54073i.append(C39341cm4.Constraint_barrierMargin, 73);
        f54073i.append(C39341cm4.Constraint_constraint_referenced_ids, 74);
        f54073i.append(C39341cm4.Constraint_barrierAllowsGoneWidgets, 75);
        f54073i.append(C39341cm4.Constraint_pathMotionArc, 76);
        f54073i.append(C39341cm4.Constraint_layout_constraintTag, 77);
        f54073i.append(C39341cm4.Constraint_visibilityMode, 78);
        f54073i.append(C39341cm4.Constraint_layout_constrainedWidth, 80);
        f54073i.append(C39341cm4.Constraint_layout_constrainedHeight, 81);
        f54073i.append(C39341cm4.Constraint_polarRelativeTo, 82);
        f54073i.append(C39341cm4.Constraint_transformPivotTarget, 83);
        f54073i.append(C39341cm4.Constraint_quantizeMotionSteps, 84);
        f54073i.append(C39341cm4.Constraint_quantizeMotionPhase, 85);
        f54073i.append(C39341cm4.Constraint_quantizeMotionInterpolator, 86);
        SparseIntArray sparseIntArray = f54074j;
        int i = C39341cm4.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(i, 6);
        f54074j.append(i, 7);
        f54074j.append(C39341cm4.ConstraintOverride_android_orientation, 27);
        f54074j.append(C39341cm4.ConstraintOverride_layout_goneMarginLeft, 13);
        f54074j.append(C39341cm4.ConstraintOverride_layout_goneMarginTop, 16);
        f54074j.append(C39341cm4.ConstraintOverride_layout_goneMarginRight, 14);
        f54074j.append(C39341cm4.ConstraintOverride_layout_goneMarginBottom, 11);
        f54074j.append(C39341cm4.ConstraintOverride_layout_goneMarginStart, 15);
        f54074j.append(C39341cm4.ConstraintOverride_layout_goneMarginEnd, 12);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintVertical_weight, 40);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintVertical_bias, 37);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintDimensionRatio, 5);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintLeft_creator, 87);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintTop_creator, 87);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintRight_creator, 87);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintBottom_creator, 87);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintBaseline_creator, 87);
        f54074j.append(C39341cm4.ConstraintOverride_android_layout_marginLeft, 24);
        f54074j.append(C39341cm4.ConstraintOverride_android_layout_marginRight, 28);
        f54074j.append(C39341cm4.ConstraintOverride_android_layout_marginStart, 31);
        f54074j.append(C39341cm4.ConstraintOverride_android_layout_marginEnd, 8);
        f54074j.append(C39341cm4.ConstraintOverride_android_layout_marginTop, 34);
        f54074j.append(C39341cm4.ConstraintOverride_android_layout_marginBottom, 2);
        f54074j.append(C39341cm4.ConstraintOverride_android_layout_width, 23);
        f54074j.append(C39341cm4.ConstraintOverride_android_layout_height, 21);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintWidth, 95);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintHeight, 96);
        f54074j.append(C39341cm4.ConstraintOverride_android_visibility, 22);
        f54074j.append(C39341cm4.ConstraintOverride_android_alpha, 43);
        f54074j.append(C39341cm4.ConstraintOverride_android_elevation, 44);
        f54074j.append(C39341cm4.ConstraintOverride_android_rotationX, 45);
        f54074j.append(C39341cm4.ConstraintOverride_android_rotationY, 46);
        f54074j.append(C39341cm4.ConstraintOverride_android_rotation, 60);
        f54074j.append(C39341cm4.ConstraintOverride_android_scaleX, 47);
        f54074j.append(C39341cm4.ConstraintOverride_android_scaleY, 48);
        f54074j.append(C39341cm4.ConstraintOverride_android_transformPivotX, 49);
        f54074j.append(C39341cm4.ConstraintOverride_android_transformPivotY, 50);
        f54074j.append(C39341cm4.ConstraintOverride_android_translationX, 51);
        f54074j.append(C39341cm4.ConstraintOverride_android_translationY, 52);
        f54074j.append(C39341cm4.ConstraintOverride_android_translationZ, 53);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintWidth_default, 54);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintHeight_default, 55);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintWidth_max, 56);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintHeight_max, 57);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintWidth_min, 58);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintHeight_min, 59);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintCircleRadius, 62);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintCircleAngle, 63);
        f54074j.append(C39341cm4.ConstraintOverride_animateRelativeTo, 64);
        f54074j.append(C39341cm4.ConstraintOverride_transitionEasing, 65);
        f54074j.append(C39341cm4.ConstraintOverride_drawPath, 66);
        f54074j.append(C39341cm4.ConstraintOverride_transitionPathRotate, 67);
        f54074j.append(C39341cm4.ConstraintOverride_motionStagger, 79);
        f54074j.append(C39341cm4.ConstraintOverride_android_id, 38);
        f54074j.append(C39341cm4.ConstraintOverride_motionTarget, 98);
        f54074j.append(C39341cm4.ConstraintOverride_motionProgress, 68);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintWidth_percent, 69);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintHeight_percent, 70);
        f54074j.append(C39341cm4.ConstraintOverride_chainUseRtl, 71);
        f54074j.append(C39341cm4.ConstraintOverride_barrierDirection, 72);
        f54074j.append(C39341cm4.ConstraintOverride_barrierMargin, 73);
        f54074j.append(C39341cm4.ConstraintOverride_constraint_referenced_ids, 74);
        f54074j.append(C39341cm4.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        f54074j.append(C39341cm4.ConstraintOverride_pathMotionArc, 76);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constraintTag, 77);
        f54074j.append(C39341cm4.ConstraintOverride_visibilityMode, 78);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constrainedWidth, 80);
        f54074j.append(C39341cm4.ConstraintOverride_layout_constrainedHeight, 81);
        f54074j.append(C39341cm4.ConstraintOverride_polarRelativeTo, 82);
        f54074j.append(C39341cm4.ConstraintOverride_transformPivotTarget, 83);
        f54074j.append(C39341cm4.ConstraintOverride_quantizeMotionSteps, 84);
        f54074j.append(C39341cm4.ConstraintOverride_quantizeMotionPhase, 85);
        f54074j.append(C39341cm4.ConstraintOverride_quantizeMotionInterpolator, 86);
        f54074j.append(C39341cm4.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    /* renamed from: G */
    public static int m67843G(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m67842H(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        boolean z;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        if (i3 != 3) {
            int i4 = 0;
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize != -4) {
                    if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                        z = false;
                    }
                } else {
                    z = true;
                    i4 = -2;
                }
                if (!(obj instanceof ConstraintLayout.LayoutParams)) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = i4;
                        layoutParams.f53972a0 = z;
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = i4;
                    layoutParams.f53974b0 = z;
                    return;
                } else if (obj instanceof C11518b) {
                    C11518b c11518b = (C11518b) obj;
                    if (i2 == 0) {
                        c11518b.f54135d = i4;
                        c11518b.f54156n0 = z;
                        return;
                    }
                    c11518b.f54137e = i4;
                    c11518b.f54158o0 = z;
                    return;
                } else if (obj instanceof C11516a.C11517a) {
                    C11516a.C11517a c11517a = (C11516a.C11517a) obj;
                    if (i2 == 0) {
                        c11517a.m67791b(23, i4);
                        c11517a.m67789d(80, z);
                        return;
                    }
                    c11517a.m67791b(21, i4);
                    c11517a.m67789d(81, z);
                    return;
                } else {
                    return;
                }
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            i4 = dimensionPixelSize;
            z = false;
            if (!(obj instanceof ConstraintLayout.LayoutParams)) {
            }
        } else {
            m67841I(obj, typedArray.getString(i), i2);
        }
    }

    /* renamed from: I */
    public static void m67841I(Object obj, String str, int i) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + 1);
            if (substring2.length() > 0) {
                String trim = substring.trim();
                String trim2 = substring2.trim();
                if ("ratio".equalsIgnoreCase(trim)) {
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                        if (i == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                        }
                        m67840J(layoutParams, trim2);
                        return;
                    } else if (obj instanceof C11518b) {
                        ((C11518b) obj).f54103A = trim2;
                        return;
                    } else if (obj instanceof C11516a.C11517a) {
                        ((C11516a.C11517a) obj).m67790c(5, trim2);
                        return;
                    } else {
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                            if (i == 0) {
                                ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                                layoutParams2.f53956L = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                                layoutParams2.f53957M = parseFloat;
                            }
                        } else if (obj instanceof C11518b) {
                            C11518b c11518b = (C11518b) obj;
                            if (i == 0) {
                                c11518b.f54135d = 0;
                                c11518b.f54125W = parseFloat;
                            } else {
                                c11518b.f54137e = 0;
                                c11518b.f54124V = parseFloat;
                            }
                        } else if (obj instanceof C11516a.C11517a) {
                            C11516a.C11517a c11517a = (C11516a.C11517a) obj;
                            if (i == 0) {
                                c11517a.m67791b(23, 0);
                                c11517a.m67792a(39, parseFloat);
                            } else {
                                c11517a.m67791b(21, 0);
                                c11517a.m67792a(40, parseFloat);
                            }
                        }
                    } else if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                            if (i == 0) {
                                ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                                layoutParams3.f53966V = max;
                                layoutParams3.f53960P = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                                layoutParams3.f53967W = max;
                                layoutParams3.f53961Q = 2;
                            }
                        } else if (obj instanceof C11518b) {
                            C11518b c11518b2 = (C11518b) obj;
                            if (i == 0) {
                                c11518b2.f54135d = 0;
                                c11518b2.f54140f0 = max;
                                c11518b2.f54128Z = 2;
                            } else {
                                c11518b2.f54137e = 0;
                                c11518b2.f54142g0 = max;
                                c11518b2.f54130a0 = 2;
                            }
                        } else if (obj instanceof C11516a.C11517a) {
                            C11516a.C11517a c11517a2 = (C11516a.C11517a) obj;
                            if (i == 0) {
                                c11517a2.m67791b(23, 0);
                                c11517a2.m67791b(54, 2);
                            } else {
                                c11517a2.m67791b(21, 0);
                                c11517a2.m67791b(55, 2);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
    }

    /* renamed from: J */
    public static void m67840J(ConstraintLayout.LayoutParams layoutParams, String str) {
        float f = Float.NaN;
        int i = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i2, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f = i == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                } else {
                    String substring4 = str.substring(i2);
                    if (substring4.length() > 0) {
                        f = Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.f53953I = str;
        layoutParams.f53954J = f;
        layoutParams.f53955K = i;
    }

    /* renamed from: L */
    public static void m67838L(Context context, C11516a c11516a, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        C11516a.C11517a c11517a = new C11516a.C11517a();
        c11516a.f54089h = c11517a;
        c11516a.f54085d.f54173a = false;
        c11516a.f54086e.f54131b = false;
        c11516a.f54084c.f54187a = false;
        c11516a.f54087f.f54193a = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (f54074j.get(index)) {
                case 2:
                    c11517a.m67791b(2, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54113K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f54073i.get(index));
                    break;
                case 5:
                    c11517a.m67790c(5, typedArray.getString(index));
                    break;
                case 6:
                    c11517a.m67791b(6, typedArray.getDimensionPixelOffset(index, c11516a.f54086e.f54107E));
                    break;
                case 7:
                    c11517a.m67791b(7, typedArray.getDimensionPixelOffset(index, c11516a.f54086e.f54108F));
                    break;
                case 8:
                    c11517a.m67791b(8, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54114L));
                    break;
                case 11:
                    c11517a.m67791b(11, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54120R));
                    break;
                case 12:
                    c11517a.m67791b(12, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54121S));
                    break;
                case 13:
                    c11517a.m67791b(13, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54117O));
                    break;
                case 14:
                    c11517a.m67791b(14, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54119Q));
                    break;
                case 15:
                    c11517a.m67791b(15, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54122T));
                    break;
                case 16:
                    c11517a.m67791b(16, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54118P));
                    break;
                case 17:
                    c11517a.m67791b(17, typedArray.getDimensionPixelOffset(index, c11516a.f54086e.f54139f));
                    break;
                case 18:
                    c11517a.m67791b(18, typedArray.getDimensionPixelOffset(index, c11516a.f54086e.f54141g));
                    break;
                case 19:
                    c11517a.m67792a(19, typedArray.getFloat(index, c11516a.f54086e.f54143h));
                    break;
                case 20:
                    c11517a.m67792a(20, typedArray.getFloat(index, c11516a.f54086e.f54170y));
                    break;
                case 21:
                    c11517a.m67791b(21, typedArray.getLayoutDimension(index, c11516a.f54086e.f54137e));
                    break;
                case 22:
                    c11517a.m67791b(22, f54072h[typedArray.getInt(index, c11516a.f54084c.f54188b)]);
                    break;
                case 23:
                    c11517a.m67791b(23, typedArray.getLayoutDimension(index, c11516a.f54086e.f54135d));
                    break;
                case 24:
                    c11517a.m67791b(24, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54110H));
                    break;
                case 27:
                    c11517a.m67791b(27, typedArray.getInt(index, c11516a.f54086e.f54109G));
                    break;
                case 28:
                    c11517a.m67791b(28, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54111I));
                    break;
                case 31:
                    c11517a.m67791b(31, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54115M));
                    break;
                case 34:
                    c11517a.m67791b(34, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54112J));
                    break;
                case 37:
                    c11517a.m67792a(37, typedArray.getFloat(index, c11516a.f54086e.f54171z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, c11516a.f54082a);
                    c11516a.f54082a = resourceId;
                    c11517a.m67791b(38, resourceId);
                    break;
                case 39:
                    c11517a.m67792a(39, typedArray.getFloat(index, c11516a.f54086e.f54125W));
                    break;
                case 40:
                    c11517a.m67792a(40, typedArray.getFloat(index, c11516a.f54086e.f54124V));
                    break;
                case 41:
                    c11517a.m67791b(41, typedArray.getInt(index, c11516a.f54086e.f54126X));
                    break;
                case 42:
                    c11517a.m67791b(42, typedArray.getInt(index, c11516a.f54086e.f54127Y));
                    break;
                case 43:
                    c11517a.m67792a(43, typedArray.getFloat(index, c11516a.f54084c.f54190d));
                    break;
                case 44:
                    c11517a.m67789d(44, true);
                    c11517a.m67792a(44, typedArray.getDimension(index, c11516a.f54087f.f54206n));
                    break;
                case 45:
                    c11517a.m67792a(45, typedArray.getFloat(index, c11516a.f54087f.f54195c));
                    break;
                case 46:
                    c11517a.m67792a(46, typedArray.getFloat(index, c11516a.f54087f.f54196d));
                    break;
                case 47:
                    c11517a.m67792a(47, typedArray.getFloat(index, c11516a.f54087f.f54197e));
                    break;
                case 48:
                    c11517a.m67792a(48, typedArray.getFloat(index, c11516a.f54087f.f54198f));
                    break;
                case 49:
                    c11517a.m67792a(49, typedArray.getDimension(index, c11516a.f54087f.f54199g));
                    break;
                case 50:
                    c11517a.m67792a(50, typedArray.getDimension(index, c11516a.f54087f.f54200h));
                    break;
                case 51:
                    c11517a.m67792a(51, typedArray.getDimension(index, c11516a.f54087f.f54202j));
                    break;
                case 52:
                    c11517a.m67792a(52, typedArray.getDimension(index, c11516a.f54087f.f54203k));
                    break;
                case 53:
                    c11517a.m67792a(53, typedArray.getDimension(index, c11516a.f54087f.f54204l));
                    break;
                case 54:
                    c11517a.m67791b(54, typedArray.getInt(index, c11516a.f54086e.f54128Z));
                    break;
                case 55:
                    c11517a.m67791b(55, typedArray.getInt(index, c11516a.f54086e.f54130a0));
                    break;
                case 56:
                    c11517a.m67791b(56, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54132b0));
                    break;
                case 57:
                    c11517a.m67791b(57, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54134c0));
                    break;
                case 58:
                    c11517a.m67791b(58, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54136d0));
                    break;
                case 59:
                    c11517a.m67791b(59, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54138e0));
                    break;
                case 60:
                    c11517a.m67792a(60, typedArray.getFloat(index, c11516a.f54087f.f54194b));
                    break;
                case 62:
                    c11517a.m67791b(62, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54105C));
                    break;
                case 63:
                    c11517a.m67792a(63, typedArray.getFloat(index, c11516a.f54086e.f54106D));
                    break;
                case 64:
                    c11517a.m67791b(64, m67843G(typedArray, index, c11516a.f54085d.f54174b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c11517a.m67790c(65, typedArray.getString(index));
                        break;
                    } else {
                        c11517a.m67790c(65, C41363g91.f81686c[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c11517a.m67791b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c11517a.m67792a(67, typedArray.getFloat(index, c11516a.f54085d.f54181i));
                    break;
                case 68:
                    c11517a.m67792a(68, typedArray.getFloat(index, c11516a.f54084c.f54191e));
                    break;
                case 69:
                    c11517a.m67792a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c11517a.m67792a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c11517a.m67791b(72, typedArray.getInt(index, c11516a.f54086e.f54144h0));
                    break;
                case 73:
                    c11517a.m67791b(73, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54146i0));
                    break;
                case 74:
                    c11517a.m67790c(74, typedArray.getString(index));
                    break;
                case 75:
                    c11517a.m67789d(75, typedArray.getBoolean(index, c11516a.f54086e.f54160p0));
                    break;
                case 76:
                    c11517a.m67791b(76, typedArray.getInt(index, c11516a.f54085d.f54177e));
                    break;
                case 77:
                    c11517a.m67790c(77, typedArray.getString(index));
                    break;
                case 78:
                    c11517a.m67791b(78, typedArray.getInt(index, c11516a.f54084c.f54189c));
                    break;
                case 79:
                    c11517a.m67792a(79, typedArray.getFloat(index, c11516a.f54085d.f54179g));
                    break;
                case 80:
                    c11517a.m67789d(80, typedArray.getBoolean(index, c11516a.f54086e.f54156n0));
                    break;
                case 81:
                    c11517a.m67789d(81, typedArray.getBoolean(index, c11516a.f54086e.f54158o0));
                    break;
                case 82:
                    c11517a.m67791b(82, typedArray.getInteger(index, c11516a.f54085d.f54175c));
                    break;
                case 83:
                    c11517a.m67791b(83, m67843G(typedArray, index, c11516a.f54087f.f54201i));
                    break;
                case 84:
                    c11517a.m67791b(84, typedArray.getInteger(index, c11516a.f54085d.f54183k));
                    break;
                case 85:
                    c11517a.m67792a(85, typedArray.getFloat(index, c11516a.f54085d.f54182j));
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        c11516a.f54085d.f54186n = typedArray.getResourceId(index, -1);
                        c11517a.m67791b(89, c11516a.f54085d.f54186n);
                        C11519c c11519c = c11516a.f54085d;
                        if (c11519c.f54186n != -1) {
                            c11519c.f54185m = -2;
                            c11517a.m67791b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i2 == 3) {
                        c11516a.f54085d.f54184l = typedArray.getString(index);
                        c11517a.m67790c(90, c11516a.f54085d.f54184l);
                        if (c11516a.f54085d.f54184l.indexOf("/") > 0) {
                            c11516a.f54085d.f54186n = typedArray.getResourceId(index, -1);
                            c11517a.m67791b(89, c11516a.f54085d.f54186n);
                            c11516a.f54085d.f54185m = -2;
                            c11517a.m67791b(88, -2);
                            break;
                        } else {
                            c11516a.f54085d.f54185m = -1;
                            c11517a.m67791b(88, -1);
                            break;
                        }
                    } else {
                        C11519c c11519c2 = c11516a.f54085d;
                        c11519c2.f54185m = typedArray.getInteger(index, c11519c2.f54186n);
                        c11517a.m67791b(88, c11516a.f54085d.f54185m);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f54073i.get(index));
                    break;
                case 93:
                    c11517a.m67791b(93, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54116N));
                    break;
                case 94:
                    c11517a.m67791b(94, typedArray.getDimensionPixelSize(index, c11516a.f54086e.f54123U));
                    break;
                case 95:
                    m67842H(c11517a, typedArray, index, 0);
                    break;
                case 96:
                    m67842H(c11517a, typedArray, index, 1);
                    break;
                case 97:
                    c11517a.m67791b(97, typedArray.getInt(index, c11516a.f54086e.f54162q0));
                    break;
                case 98:
                    if (MotionLayout.f53557Y0) {
                        int resourceId2 = typedArray.getResourceId(index, c11516a.f54082a);
                        c11516a.f54082a = resourceId2;
                        if (resourceId2 == -1) {
                            c11516a.f54083b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c11516a.f54083b = typedArray.getString(index);
                        break;
                    } else {
                        c11516a.f54082a = typedArray.getResourceId(index, c11516a.f54082a);
                        break;
                    }
                case 99:
                    c11517a.m67789d(99, typedArray.getBoolean(index, c11516a.f54086e.f54145i));
                    break;
            }
        }
    }

    /* renamed from: O */
    public static void m67835O(C11516a c11516a, int i, float f) {
        if (i != 19) {
            if (i != 20) {
                if (i != 37) {
                    if (i != 60) {
                        if (i != 63) {
                            if (i != 79) {
                                if (i != 85) {
                                    if (i != 87) {
                                        if (i != 39) {
                                            if (i != 40) {
                                                switch (i) {
                                                    case 43:
                                                        c11516a.f54084c.f54190d = f;
                                                        return;
                                                    case 44:
                                                        C11521e c11521e = c11516a.f54087f;
                                                        c11521e.f54206n = f;
                                                        c11521e.f54205m = true;
                                                        return;
                                                    case 45:
                                                        c11516a.f54087f.f54195c = f;
                                                        return;
                                                    case 46:
                                                        c11516a.f54087f.f54196d = f;
                                                        return;
                                                    case 47:
                                                        c11516a.f54087f.f54197e = f;
                                                        return;
                                                    case 48:
                                                        c11516a.f54087f.f54198f = f;
                                                        return;
                                                    case 49:
                                                        c11516a.f54087f.f54199g = f;
                                                        return;
                                                    case 50:
                                                        c11516a.f54087f.f54200h = f;
                                                        return;
                                                    case 51:
                                                        c11516a.f54087f.f54202j = f;
                                                        return;
                                                    case 52:
                                                        c11516a.f54087f.f54203k = f;
                                                        return;
                                                    case 53:
                                                        c11516a.f54087f.f54204l = f;
                                                        return;
                                                    default:
                                                        switch (i) {
                                                            case 67:
                                                                c11516a.f54085d.f54181i = f;
                                                                return;
                                                            case 68:
                                                                c11516a.f54084c.f54191e = f;
                                                                return;
                                                            case 69:
                                                                c11516a.f54086e.f54140f0 = f;
                                                                return;
                                                            case 70:
                                                                c11516a.f54086e.f54142g0 = f;
                                                                return;
                                                            default:
                                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                return;
                                                        }
                                                }
                                            }
                                            c11516a.f54086e.f54124V = f;
                                            return;
                                        }
                                        c11516a.f54086e.f54125W = f;
                                        return;
                                    }
                                    return;
                                }
                                c11516a.f54085d.f54182j = f;
                                return;
                            }
                            c11516a.f54085d.f54179g = f;
                            return;
                        }
                        c11516a.f54086e.f54106D = f;
                        return;
                    }
                    c11516a.f54087f.f54194b = f;
                    return;
                }
                c11516a.f54086e.f54171z = f;
                return;
            }
            c11516a.f54086e.f54170y = f;
            return;
        }
        c11516a.f54086e.f54143h = f;
    }

    /* renamed from: P */
    public static void m67834P(C11516a c11516a, int i, int i2) {
        if (i != 6) {
            if (i != 7) {
                if (i != 8) {
                    if (i != 27) {
                        if (i != 28) {
                            if (i != 41) {
                                if (i != 42) {
                                    if (i != 61) {
                                        if (i != 62) {
                                            if (i != 72) {
                                                if (i != 73) {
                                                    switch (i) {
                                                        case 2:
                                                            c11516a.f54086e.f54113K = i2;
                                                            return;
                                                        case 11:
                                                            c11516a.f54086e.f54120R = i2;
                                                            return;
                                                        case 12:
                                                            c11516a.f54086e.f54121S = i2;
                                                            return;
                                                        case 13:
                                                            c11516a.f54086e.f54117O = i2;
                                                            return;
                                                        case 14:
                                                            c11516a.f54086e.f54119Q = i2;
                                                            return;
                                                        case 15:
                                                            c11516a.f54086e.f54122T = i2;
                                                            return;
                                                        case 16:
                                                            c11516a.f54086e.f54118P = i2;
                                                            return;
                                                        case 17:
                                                            c11516a.f54086e.f54139f = i2;
                                                            return;
                                                        case 18:
                                                            c11516a.f54086e.f54141g = i2;
                                                            return;
                                                        case 31:
                                                            c11516a.f54086e.f54115M = i2;
                                                            return;
                                                        case 34:
                                                            c11516a.f54086e.f54112J = i2;
                                                            return;
                                                        case 38:
                                                            c11516a.f54082a = i2;
                                                            return;
                                                        case 64:
                                                            c11516a.f54085d.f54174b = i2;
                                                            return;
                                                        case 66:
                                                            c11516a.f54085d.f54178f = i2;
                                                            return;
                                                        case 76:
                                                            c11516a.f54085d.f54177e = i2;
                                                            return;
                                                        case 78:
                                                            c11516a.f54084c.f54189c = i2;
                                                            return;
                                                        case 93:
                                                            c11516a.f54086e.f54116N = i2;
                                                            return;
                                                        case 94:
                                                            c11516a.f54086e.f54123U = i2;
                                                            return;
                                                        case 97:
                                                            c11516a.f54086e.f54162q0 = i2;
                                                            return;
                                                        default:
                                                            switch (i) {
                                                                case 21:
                                                                    c11516a.f54086e.f54137e = i2;
                                                                    return;
                                                                case 22:
                                                                    c11516a.f54084c.f54188b = i2;
                                                                    return;
                                                                case 23:
                                                                    c11516a.f54086e.f54135d = i2;
                                                                    return;
                                                                case 24:
                                                                    c11516a.f54086e.f54110H = i2;
                                                                    return;
                                                                default:
                                                                    switch (i) {
                                                                        case 54:
                                                                            c11516a.f54086e.f54128Z = i2;
                                                                            return;
                                                                        case 55:
                                                                            c11516a.f54086e.f54130a0 = i2;
                                                                            return;
                                                                        case 56:
                                                                            c11516a.f54086e.f54132b0 = i2;
                                                                            return;
                                                                        case 57:
                                                                            c11516a.f54086e.f54134c0 = i2;
                                                                            return;
                                                                        case 58:
                                                                            c11516a.f54086e.f54136d0 = i2;
                                                                            return;
                                                                        case 59:
                                                                            c11516a.f54086e.f54138e0 = i2;
                                                                            return;
                                                                        default:
                                                                            switch (i) {
                                                                                case 82:
                                                                                    c11516a.f54085d.f54175c = i2;
                                                                                    return;
                                                                                case 83:
                                                                                    c11516a.f54087f.f54201i = i2;
                                                                                    return;
                                                                                case 84:
                                                                                    c11516a.f54085d.f54183k = i2;
                                                                                    return;
                                                                                default:
                                                                                    switch (i) {
                                                                                        case 87:
                                                                                            return;
                                                                                        case 88:
                                                                                            c11516a.f54085d.f54185m = i2;
                                                                                            return;
                                                                                        case 89:
                                                                                            c11516a.f54085d.f54186n = i2;
                                                                                            return;
                                                                                        default:
                                                                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                                            return;
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                }
                                                c11516a.f54086e.f54146i0 = i2;
                                                return;
                                            }
                                            c11516a.f54086e.f54144h0 = i2;
                                            return;
                                        }
                                        c11516a.f54086e.f54105C = i2;
                                        return;
                                    }
                                    c11516a.f54086e.f54104B = i2;
                                    return;
                                }
                                c11516a.f54086e.f54127Y = i2;
                                return;
                            }
                            c11516a.f54086e.f54126X = i2;
                            return;
                        }
                        c11516a.f54086e.f54111I = i2;
                        return;
                    }
                    c11516a.f54086e.f54109G = i2;
                    return;
                }
                c11516a.f54086e.f54114L = i2;
                return;
            }
            c11516a.f54086e.f54108F = i2;
            return;
        }
        c11516a.f54086e.f54107E = i2;
    }

    /* renamed from: Q */
    public static void m67833Q(C11516a c11516a, int i, String str) {
        if (i != 5) {
            if (i != 65) {
                if (i != 74) {
                    if (i != 77) {
                        if (i != 87) {
                            if (i != 90) {
                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                return;
                            } else {
                                c11516a.f54085d.f54184l = str;
                                return;
                            }
                        }
                        return;
                    }
                    c11516a.f54086e.f54154m0 = str;
                    return;
                }
                C11518b c11518b = c11516a.f54086e;
                c11518b.f54152l0 = str;
                c11518b.f54150k0 = null;
                return;
            }
            c11516a.f54085d.f54176d = str;
            return;
        }
        c11516a.f54086e.f54103A = str;
    }

    /* renamed from: R */
    public static void m67832R(C11516a c11516a, int i, boolean z) {
        if (i != 44) {
            if (i != 75) {
                if (i != 87) {
                    if (i != 80) {
                        if (i != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                            return;
                        } else {
                            c11516a.f54086e.f54158o0 = z;
                            return;
                        }
                    }
                    c11516a.f54086e.f54156n0 = z;
                    return;
                }
                return;
            }
            c11516a.f54086e.f54160p0 = z;
            return;
        }
        c11516a.f54087f.f54205m = z;
    }

    /* renamed from: m */
    public static C11516a m67815m(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        C11516a c11516a = new C11516a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, C39341cm4.ConstraintOverride);
        m67838L(context, c11516a, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return c11516a;
    }

    /* renamed from: A */
    public C11516a m67849A(int i) {
        return m67805w(i);
    }

    /* renamed from: B */
    public int m67848B(int i) {
        return m67805w(i).f54084c.f54188b;
    }

    /* renamed from: C */
    public int m67847C(int i) {
        return m67805w(i).f54084c.f54189c;
    }

    /* renamed from: D */
    public int m67846D(int i) {
        return m67805w(i).f54086e.f54135d;
    }

    /* renamed from: E */
    public void m67845E(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType != 2) {
                        continue;
                    } else {
                        String name = xml.getName();
                        C11516a m67806v = m67806v(context, Xml.asAttributeSet(xml), false);
                        if (name.equalsIgnoreCase("Guideline")) {
                            m67806v.f54086e.f54129a = true;
                        }
                        this.f54081g.put(Integer.valueOf(m67806v.f54082a), m67806v);
                        continue;
                    }
                } else {
                    xml.getName();
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cb, code lost:
        continue;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m67844F(Context context, XmlPullParser xmlPullParser) {
        C11516a m67806v;
        try {
            int eventType = xmlPullParser.getEventType();
            C11516a c11516a = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    char c = 65535;
                    if (eventType != 2) {
                        if (eventType == 3) {
                            String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c = 3;
                                        break;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                            }
                            if (c != 0) {
                                if (c == 1 || c == 2 || c == 3) {
                                    this.f54081g.put(Integer.valueOf(c11516a.f54082a), c11516a);
                                    c11516a = null;
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    c = 6;
                                    break;
                                }
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    c = 7;
                                    break;
                                }
                                break;
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    c = 5;
                                    break;
                                }
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 366511058:
                                if (name.equals("CustomMethod")) {
                                    c = '\t';
                                    break;
                                }
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    c = '\b';
                                    break;
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c = 0;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                                m67806v = m67806v(context, Xml.asAttributeSet(xmlPullParser), false);
                                c11516a = m67806v;
                                break;
                            case 1:
                                m67806v = m67806v(context, Xml.asAttributeSet(xmlPullParser), true);
                                c11516a = m67806v;
                                break;
                            case 2:
                                m67806v = m67806v(context, Xml.asAttributeSet(xmlPullParser), false);
                                C11518b c11518b = m67806v.f54086e;
                                c11518b.f54129a = true;
                                c11518b.f54131b = true;
                                c11516a = m67806v;
                                break;
                            case 3:
                                m67806v = m67806v(context, Xml.asAttributeSet(xmlPullParser), false);
                                m67806v.f54086e.f54148j0 = 1;
                                c11516a = m67806v;
                                break;
                            case 4:
                                if (c11516a != null) {
                                    c11516a.f54084c.m67782b(context, Xml.asAttributeSet(xmlPullParser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case 5:
                                if (c11516a != null) {
                                    c11516a.f54087f.m67780b(context, Xml.asAttributeSet(xmlPullParser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case 6:
                                if (c11516a != null) {
                                    c11516a.f54086e.m67786b(context, Xml.asAttributeSet(xmlPullParser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case 7:
                                if (c11516a != null) {
                                    c11516a.f54085d.m67784b(context, Xml.asAttributeSet(xmlPullParser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case '\b':
                            case '\t':
                                if (c11516a != null) {
                                    C11512a.m67853i(context, xmlPullParser, c11516a.f54088g);
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: K */
    public final void m67839K(Context context, C11516a c11516a, TypedArray typedArray, boolean z) {
        if (z) {
            m67838L(context, c11516a, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != C39341cm4.Constraint_android_id && C39341cm4.Constraint_android_layout_marginStart != index && C39341cm4.Constraint_android_layout_marginEnd != index) {
                c11516a.f54085d.f54173a = true;
                c11516a.f54086e.f54131b = true;
                c11516a.f54084c.f54187a = true;
                c11516a.f54087f.f54193a = true;
            }
            switch (f54073i.get(index)) {
                case 1:
                    C11518b c11518b = c11516a.f54086e;
                    c11518b.f54163r = m67843G(typedArray, index, c11518b.f54163r);
                    break;
                case 2:
                    C11518b c11518b2 = c11516a.f54086e;
                    c11518b2.f54113K = typedArray.getDimensionPixelSize(index, c11518b2.f54113K);
                    break;
                case 3:
                    C11518b c11518b3 = c11516a.f54086e;
                    c11518b3.f54161q = m67843G(typedArray, index, c11518b3.f54161q);
                    break;
                case 4:
                    C11518b c11518b4 = c11516a.f54086e;
                    c11518b4.f54159p = m67843G(typedArray, index, c11518b4.f54159p);
                    break;
                case 5:
                    c11516a.f54086e.f54103A = typedArray.getString(index);
                    break;
                case 6:
                    C11518b c11518b5 = c11516a.f54086e;
                    c11518b5.f54107E = typedArray.getDimensionPixelOffset(index, c11518b5.f54107E);
                    break;
                case 7:
                    C11518b c11518b6 = c11516a.f54086e;
                    c11518b6.f54108F = typedArray.getDimensionPixelOffset(index, c11518b6.f54108F);
                    break;
                case 8:
                    C11518b c11518b7 = c11516a.f54086e;
                    c11518b7.f54114L = typedArray.getDimensionPixelSize(index, c11518b7.f54114L);
                    break;
                case 9:
                    C11518b c11518b8 = c11516a.f54086e;
                    c11518b8.f54169x = m67843G(typedArray, index, c11518b8.f54169x);
                    break;
                case 10:
                    C11518b c11518b9 = c11516a.f54086e;
                    c11518b9.f54168w = m67843G(typedArray, index, c11518b9.f54168w);
                    break;
                case 11:
                    C11518b c11518b10 = c11516a.f54086e;
                    c11518b10.f54120R = typedArray.getDimensionPixelSize(index, c11518b10.f54120R);
                    break;
                case 12:
                    C11518b c11518b11 = c11516a.f54086e;
                    c11518b11.f54121S = typedArray.getDimensionPixelSize(index, c11518b11.f54121S);
                    break;
                case 13:
                    C11518b c11518b12 = c11516a.f54086e;
                    c11518b12.f54117O = typedArray.getDimensionPixelSize(index, c11518b12.f54117O);
                    break;
                case 14:
                    C11518b c11518b13 = c11516a.f54086e;
                    c11518b13.f54119Q = typedArray.getDimensionPixelSize(index, c11518b13.f54119Q);
                    break;
                case 15:
                    C11518b c11518b14 = c11516a.f54086e;
                    c11518b14.f54122T = typedArray.getDimensionPixelSize(index, c11518b14.f54122T);
                    break;
                case 16:
                    C11518b c11518b15 = c11516a.f54086e;
                    c11518b15.f54118P = typedArray.getDimensionPixelSize(index, c11518b15.f54118P);
                    break;
                case 17:
                    C11518b c11518b16 = c11516a.f54086e;
                    c11518b16.f54139f = typedArray.getDimensionPixelOffset(index, c11518b16.f54139f);
                    break;
                case 18:
                    C11518b c11518b17 = c11516a.f54086e;
                    c11518b17.f54141g = typedArray.getDimensionPixelOffset(index, c11518b17.f54141g);
                    break;
                case 19:
                    C11518b c11518b18 = c11516a.f54086e;
                    c11518b18.f54143h = typedArray.getFloat(index, c11518b18.f54143h);
                    break;
                case 20:
                    C11518b c11518b19 = c11516a.f54086e;
                    c11518b19.f54170y = typedArray.getFloat(index, c11518b19.f54170y);
                    break;
                case 21:
                    C11518b c11518b20 = c11516a.f54086e;
                    c11518b20.f54137e = typedArray.getLayoutDimension(index, c11518b20.f54137e);
                    break;
                case 22:
                    C11520d c11520d = c11516a.f54084c;
                    c11520d.f54188b = typedArray.getInt(index, c11520d.f54188b);
                    C11520d c11520d2 = c11516a.f54084c;
                    c11520d2.f54188b = f54072h[c11520d2.f54188b];
                    break;
                case 23:
                    C11518b c11518b21 = c11516a.f54086e;
                    c11518b21.f54135d = typedArray.getLayoutDimension(index, c11518b21.f54135d);
                    break;
                case 24:
                    C11518b c11518b22 = c11516a.f54086e;
                    c11518b22.f54110H = typedArray.getDimensionPixelSize(index, c11518b22.f54110H);
                    break;
                case 25:
                    C11518b c11518b23 = c11516a.f54086e;
                    c11518b23.f54147j = m67843G(typedArray, index, c11518b23.f54147j);
                    break;
                case 26:
                    C11518b c11518b24 = c11516a.f54086e;
                    c11518b24.f54149k = m67843G(typedArray, index, c11518b24.f54149k);
                    break;
                case 27:
                    C11518b c11518b25 = c11516a.f54086e;
                    c11518b25.f54109G = typedArray.getInt(index, c11518b25.f54109G);
                    break;
                case 28:
                    C11518b c11518b26 = c11516a.f54086e;
                    c11518b26.f54111I = typedArray.getDimensionPixelSize(index, c11518b26.f54111I);
                    break;
                case 29:
                    C11518b c11518b27 = c11516a.f54086e;
                    c11518b27.f54151l = m67843G(typedArray, index, c11518b27.f54151l);
                    break;
                case 30:
                    C11518b c11518b28 = c11516a.f54086e;
                    c11518b28.f54153m = m67843G(typedArray, index, c11518b28.f54153m);
                    break;
                case 31:
                    C11518b c11518b29 = c11516a.f54086e;
                    c11518b29.f54115M = typedArray.getDimensionPixelSize(index, c11518b29.f54115M);
                    break;
                case 32:
                    C11518b c11518b30 = c11516a.f54086e;
                    c11518b30.f54166u = m67843G(typedArray, index, c11518b30.f54166u);
                    break;
                case 33:
                    C11518b c11518b31 = c11516a.f54086e;
                    c11518b31.f54167v = m67843G(typedArray, index, c11518b31.f54167v);
                    break;
                case 34:
                    C11518b c11518b32 = c11516a.f54086e;
                    c11518b32.f54112J = typedArray.getDimensionPixelSize(index, c11518b32.f54112J);
                    break;
                case 35:
                    C11518b c11518b33 = c11516a.f54086e;
                    c11518b33.f54157o = m67843G(typedArray, index, c11518b33.f54157o);
                    break;
                case 36:
                    C11518b c11518b34 = c11516a.f54086e;
                    c11518b34.f54155n = m67843G(typedArray, index, c11518b34.f54155n);
                    break;
                case 37:
                    C11518b c11518b35 = c11516a.f54086e;
                    c11518b35.f54171z = typedArray.getFloat(index, c11518b35.f54171z);
                    break;
                case 38:
                    c11516a.f54082a = typedArray.getResourceId(index, c11516a.f54082a);
                    break;
                case 39:
                    C11518b c11518b36 = c11516a.f54086e;
                    c11518b36.f54125W = typedArray.getFloat(index, c11518b36.f54125W);
                    break;
                case 40:
                    C11518b c11518b37 = c11516a.f54086e;
                    c11518b37.f54124V = typedArray.getFloat(index, c11518b37.f54124V);
                    break;
                case 41:
                    C11518b c11518b38 = c11516a.f54086e;
                    c11518b38.f54126X = typedArray.getInt(index, c11518b38.f54126X);
                    break;
                case 42:
                    C11518b c11518b39 = c11516a.f54086e;
                    c11518b39.f54127Y = typedArray.getInt(index, c11518b39.f54127Y);
                    break;
                case 43:
                    C11520d c11520d3 = c11516a.f54084c;
                    c11520d3.f54190d = typedArray.getFloat(index, c11520d3.f54190d);
                    break;
                case 44:
                    C11521e c11521e = c11516a.f54087f;
                    c11521e.f54205m = true;
                    c11521e.f54206n = typedArray.getDimension(index, c11521e.f54206n);
                    break;
                case 45:
                    C11521e c11521e2 = c11516a.f54087f;
                    c11521e2.f54195c = typedArray.getFloat(index, c11521e2.f54195c);
                    break;
                case 46:
                    C11521e c11521e3 = c11516a.f54087f;
                    c11521e3.f54196d = typedArray.getFloat(index, c11521e3.f54196d);
                    break;
                case 47:
                    C11521e c11521e4 = c11516a.f54087f;
                    c11521e4.f54197e = typedArray.getFloat(index, c11521e4.f54197e);
                    break;
                case 48:
                    C11521e c11521e5 = c11516a.f54087f;
                    c11521e5.f54198f = typedArray.getFloat(index, c11521e5.f54198f);
                    break;
                case 49:
                    C11521e c11521e6 = c11516a.f54087f;
                    c11521e6.f54199g = typedArray.getDimension(index, c11521e6.f54199g);
                    break;
                case 50:
                    C11521e c11521e7 = c11516a.f54087f;
                    c11521e7.f54200h = typedArray.getDimension(index, c11521e7.f54200h);
                    break;
                case 51:
                    C11521e c11521e8 = c11516a.f54087f;
                    c11521e8.f54202j = typedArray.getDimension(index, c11521e8.f54202j);
                    break;
                case 52:
                    C11521e c11521e9 = c11516a.f54087f;
                    c11521e9.f54203k = typedArray.getDimension(index, c11521e9.f54203k);
                    break;
                case 53:
                    C11521e c11521e10 = c11516a.f54087f;
                    c11521e10.f54204l = typedArray.getDimension(index, c11521e10.f54204l);
                    break;
                case 54:
                    C11518b c11518b40 = c11516a.f54086e;
                    c11518b40.f54128Z = typedArray.getInt(index, c11518b40.f54128Z);
                    break;
                case 55:
                    C11518b c11518b41 = c11516a.f54086e;
                    c11518b41.f54130a0 = typedArray.getInt(index, c11518b41.f54130a0);
                    break;
                case 56:
                    C11518b c11518b42 = c11516a.f54086e;
                    c11518b42.f54132b0 = typedArray.getDimensionPixelSize(index, c11518b42.f54132b0);
                    break;
                case 57:
                    C11518b c11518b43 = c11516a.f54086e;
                    c11518b43.f54134c0 = typedArray.getDimensionPixelSize(index, c11518b43.f54134c0);
                    break;
                case 58:
                    C11518b c11518b44 = c11516a.f54086e;
                    c11518b44.f54136d0 = typedArray.getDimensionPixelSize(index, c11518b44.f54136d0);
                    break;
                case 59:
                    C11518b c11518b45 = c11516a.f54086e;
                    c11518b45.f54138e0 = typedArray.getDimensionPixelSize(index, c11518b45.f54138e0);
                    break;
                case 60:
                    C11521e c11521e11 = c11516a.f54087f;
                    c11521e11.f54194b = typedArray.getFloat(index, c11521e11.f54194b);
                    break;
                case 61:
                    C11518b c11518b46 = c11516a.f54086e;
                    c11518b46.f54104B = m67843G(typedArray, index, c11518b46.f54104B);
                    break;
                case 62:
                    C11518b c11518b47 = c11516a.f54086e;
                    c11518b47.f54105C = typedArray.getDimensionPixelSize(index, c11518b47.f54105C);
                    break;
                case 63:
                    C11518b c11518b48 = c11516a.f54086e;
                    c11518b48.f54106D = typedArray.getFloat(index, c11518b48.f54106D);
                    break;
                case 64:
                    C11519c c11519c = c11516a.f54085d;
                    c11519c.f54174b = m67843G(typedArray, index, c11519c.f54174b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c11516a.f54085d.f54176d = typedArray.getString(index);
                        break;
                    } else {
                        c11516a.f54085d.f54176d = C41363g91.f81686c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    c11516a.f54085d.f54178f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C11519c c11519c2 = c11516a.f54085d;
                    c11519c2.f54181i = typedArray.getFloat(index, c11519c2.f54181i);
                    break;
                case 68:
                    C11520d c11520d4 = c11516a.f54084c;
                    c11520d4.f54191e = typedArray.getFloat(index, c11520d4.f54191e);
                    break;
                case 69:
                    c11516a.f54086e.f54140f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    c11516a.f54086e.f54142g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    C11518b c11518b49 = c11516a.f54086e;
                    c11518b49.f54144h0 = typedArray.getInt(index, c11518b49.f54144h0);
                    break;
                case 73:
                    C11518b c11518b50 = c11516a.f54086e;
                    c11518b50.f54146i0 = typedArray.getDimensionPixelSize(index, c11518b50.f54146i0);
                    break;
                case 74:
                    c11516a.f54086e.f54152l0 = typedArray.getString(index);
                    break;
                case 75:
                    C11518b c11518b51 = c11516a.f54086e;
                    c11518b51.f54160p0 = typedArray.getBoolean(index, c11518b51.f54160p0);
                    break;
                case 76:
                    C11519c c11519c3 = c11516a.f54085d;
                    c11519c3.f54177e = typedArray.getInt(index, c11519c3.f54177e);
                    break;
                case 77:
                    c11516a.f54086e.f54154m0 = typedArray.getString(index);
                    break;
                case 78:
                    C11520d c11520d5 = c11516a.f54084c;
                    c11520d5.f54189c = typedArray.getInt(index, c11520d5.f54189c);
                    break;
                case 79:
                    C11519c c11519c4 = c11516a.f54085d;
                    c11519c4.f54179g = typedArray.getFloat(index, c11519c4.f54179g);
                    break;
                case 80:
                    C11518b c11518b52 = c11516a.f54086e;
                    c11518b52.f54156n0 = typedArray.getBoolean(index, c11518b52.f54156n0);
                    break;
                case 81:
                    C11518b c11518b53 = c11516a.f54086e;
                    c11518b53.f54158o0 = typedArray.getBoolean(index, c11518b53.f54158o0);
                    break;
                case 82:
                    C11519c c11519c5 = c11516a.f54085d;
                    c11519c5.f54175c = typedArray.getInteger(index, c11519c5.f54175c);
                    break;
                case 83:
                    C11521e c11521e12 = c11516a.f54087f;
                    c11521e12.f54201i = m67843G(typedArray, index, c11521e12.f54201i);
                    break;
                case 84:
                    C11519c c11519c6 = c11516a.f54085d;
                    c11519c6.f54183k = typedArray.getInteger(index, c11519c6.f54183k);
                    break;
                case 85:
                    C11519c c11519c7 = c11516a.f54085d;
                    c11519c7.f54182j = typedArray.getFloat(index, c11519c7.f54182j);
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        c11516a.f54085d.f54186n = typedArray.getResourceId(index, -1);
                        C11519c c11519c8 = c11516a.f54085d;
                        if (c11519c8.f54186n != -1) {
                            c11519c8.f54185m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i2 == 3) {
                        c11516a.f54085d.f54184l = typedArray.getString(index);
                        if (c11516a.f54085d.f54184l.indexOf("/") > 0) {
                            c11516a.f54085d.f54186n = typedArray.getResourceId(index, -1);
                            c11516a.f54085d.f54185m = -2;
                            break;
                        } else {
                            c11516a.f54085d.f54185m = -1;
                            break;
                        }
                    } else {
                        C11519c c11519c9 = c11516a.f54085d;
                        c11519c9.f54185m = typedArray.getInteger(index, c11519c9.f54186n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f54073i.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f54073i.get(index));
                    break;
                case 91:
                    C11518b c11518b54 = c11516a.f54086e;
                    c11518b54.f54164s = m67843G(typedArray, index, c11518b54.f54164s);
                    break;
                case 92:
                    C11518b c11518b55 = c11516a.f54086e;
                    c11518b55.f54165t = m67843G(typedArray, index, c11518b55.f54165t);
                    break;
                case 93:
                    C11518b c11518b56 = c11516a.f54086e;
                    c11518b56.f54116N = typedArray.getDimensionPixelSize(index, c11518b56.f54116N);
                    break;
                case 94:
                    C11518b c11518b57 = c11516a.f54086e;
                    c11518b57.f54123U = typedArray.getDimensionPixelSize(index, c11518b57.f54123U);
                    break;
                case 95:
                    m67842H(c11516a.f54086e, typedArray, index, 0);
                    break;
                case 96:
                    m67842H(c11516a.f54086e, typedArray, index, 1);
                    break;
                case 97:
                    C11518b c11518b58 = c11516a.f54086e;
                    c11518b58.f54162q0 = typedArray.getInt(index, c11518b58.f54162q0);
                    break;
            }
        }
        C11518b c11518b59 = c11516a.f54086e;
        if (c11518b59.f54152l0 != null) {
            c11518b59.f54150k0 = null;
        }
    }

    /* renamed from: M */
    public void m67837M(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f54080f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f54081g.containsKey(Integer.valueOf(id))) {
                this.f54081g.put(Integer.valueOf(id), new C11516a());
            }
            C11516a c11516a = this.f54081g.get(Integer.valueOf(id));
            if (c11516a != null) {
                if (!c11516a.f54086e.f54131b) {
                    c11516a.m67795g(id, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        c11516a.f54086e.f54150k0 = ((ConstraintHelper) childAt).m67891o();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            c11516a.f54086e.f54160p0 = barrier.m67906C();
                            c11516a.f54086e.f54144h0 = barrier.m67904E();
                            c11516a.f54086e.f54146i0 = barrier.m67905D();
                        }
                    }
                    c11516a.f54086e.f54131b = true;
                }
                C11520d c11520d = c11516a.f54084c;
                if (!c11520d.f54187a) {
                    c11520d.f54188b = childAt.getVisibility();
                    c11516a.f54084c.f54190d = childAt.getAlpha();
                    c11516a.f54084c.f54187a = true;
                }
                C11521e c11521e = c11516a.f54087f;
                if (!c11521e.f54193a) {
                    c11521e.f54193a = true;
                    c11521e.f54194b = childAt.getRotation();
                    c11516a.f54087f.f54195c = childAt.getRotationX();
                    c11516a.f54087f.f54196d = childAt.getRotationY();
                    c11516a.f54087f.f54197e = childAt.getScaleX();
                    c11516a.f54087f.f54198f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        C11521e c11521e2 = c11516a.f54087f;
                        c11521e2.f54199g = pivotX;
                        c11521e2.f54200h = pivotY;
                    }
                    c11516a.f54087f.f54202j = childAt.getTranslationX();
                    c11516a.f54087f.f54203k = childAt.getTranslationY();
                    c11516a.f54087f.f54204l = childAt.getTranslationZ();
                    C11521e c11521e3 = c11516a.f54087f;
                    if (c11521e3.f54205m) {
                        c11521e3.f54206n = childAt.getElevation();
                    }
                }
            }
        }
    }

    /* renamed from: N */
    public void m67836N(C11515b c11515b) {
        for (Integer num : c11515b.f54081g.keySet()) {
            int intValue = num.intValue();
            C11516a c11516a = c11515b.f54081g.get(num);
            if (!this.f54081g.containsKey(Integer.valueOf(intValue))) {
                this.f54081g.put(Integer.valueOf(intValue), new C11516a());
            }
            C11516a c11516a2 = this.f54081g.get(Integer.valueOf(intValue));
            if (c11516a2 != null) {
                C11518b c11518b = c11516a2.f54086e;
                if (!c11518b.f54131b) {
                    c11518b.m67787a(c11516a.f54086e);
                }
                C11520d c11520d = c11516a2.f54084c;
                if (!c11520d.f54187a) {
                    c11520d.m67783a(c11516a.f54084c);
                }
                C11521e c11521e = c11516a2.f54087f;
                if (!c11521e.f54193a) {
                    c11521e.m67781a(c11516a.f54087f);
                }
                C11519c c11519c = c11516a2.f54085d;
                if (!c11519c.f54173a) {
                    c11519c.m67785a(c11516a.f54085d);
                }
                for (String str : c11516a.f54088g.keySet()) {
                    if (!c11516a2.f54088g.containsKey(str)) {
                        c11516a2.f54088g.put(str, c11516a.f54088g.get(str));
                    }
                }
            }
        }
    }

    /* renamed from: S */
    public void m67831S(boolean z) {
        this.f54080f = z;
    }

    /* renamed from: T */
    public void m67830T(boolean z) {
        this.f54075a = z;
    }

    /* renamed from: U */
    public void m67829U(int i, int i2) {
        m67805w(i).f54084c.f54188b = i2;
    }

    /* renamed from: V */
    public final String m67828V(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* renamed from: g */
    public void m67821g(ConstraintLayout constraintLayout) {
        C11516a c11516a;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f54081g.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + FU0.m107117d(childAt));
            } else if (this.f54080f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (this.f54081g.containsKey(Integer.valueOf(id)) && (c11516a = this.f54081g.get(Integer.valueOf(id))) != null) {
                    C11512a.m67852j(childAt, c11516a.f54088g);
                }
            }
        }
    }

    /* renamed from: h */
    public void m67820h(C11515b c11515b) {
        for (C11516a c11516a : c11515b.f54081g.values()) {
            if (c11516a.f54089h != null) {
                if (c11516a.f54083b != null) {
                    for (Integer num : this.f54081g.keySet()) {
                        C11516a m67804x = m67804x(num.intValue());
                        String str = m67804x.f54086e.f54154m0;
                        if (str != null && c11516a.f54083b.matches(str)) {
                            c11516a.f54089h.m67788e(m67804x);
                            m67804x.f54088g.putAll((HashMap) c11516a.f54088g.clone());
                        }
                    }
                } else {
                    c11516a.f54089h.m67788e(m67804x(c11516a.f54082a));
                }
            }
        }
    }

    /* renamed from: i */
    public void m67819i(ConstraintLayout constraintLayout) {
        m67817k(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* renamed from: j */
    public void m67818j(ConstraintHelper constraintHelper, C43042iz0 c43042iz0, ConstraintLayout.LayoutParams layoutParams, SparseArray<C43042iz0> sparseArray) {
        C11516a c11516a;
        int id = constraintHelper.getId();
        if (this.f54081g.containsKey(Integer.valueOf(id)) && (c11516a = this.f54081g.get(Integer.valueOf(id))) != null && (c43042iz0 instanceof JL1)) {
            constraintHelper.mo67889r(c11516a, (JL1) c43042iz0, layoutParams, sparseArray);
        }
    }

    /* renamed from: k */
    public void m67817k(ConstraintLayout constraintLayout, boolean z) {
        View findViewById;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f54081g.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f54081g.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + FU0.m107117d(childAt));
            } else if (this.f54080f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1) {
                    if (this.f54081g.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C11516a c11516a = this.f54081g.get(Integer.valueOf(id));
                        if (c11516a != null) {
                            if (childAt instanceof Barrier) {
                                c11516a.f54086e.f54148j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(c11516a.f54086e.f54144h0);
                                barrier.setMargin(c11516a.f54086e.f54146i0);
                                barrier.setAllowsGoneWidget(c11516a.f54086e.f54160p0);
                                C11518b c11518b = c11516a.f54086e;
                                int[] iArr = c11518b.f54150k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = c11518b.f54152l0;
                                    if (str != null) {
                                        c11518b.f54150k0 = m67807u(barrier, str);
                                        barrier.setReferencedIds(c11516a.f54086e.f54150k0);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.m67879c();
                            c11516a.m67797e(layoutParams);
                            if (z) {
                                C11512a.m67852j(childAt, c11516a.f54088g);
                            }
                            childAt.setLayoutParams(layoutParams);
                            C11520d c11520d = c11516a.f54084c;
                            if (c11520d.f54189c == 0) {
                                childAt.setVisibility(c11520d.f54188b);
                            }
                            childAt.setAlpha(c11516a.f54084c.f54190d);
                            childAt.setRotation(c11516a.f54087f.f54194b);
                            childAt.setRotationX(c11516a.f54087f.f54195c);
                            childAt.setRotationY(c11516a.f54087f.f54196d);
                            childAt.setScaleX(c11516a.f54087f.f54197e);
                            childAt.setScaleY(c11516a.f54087f.f54198f);
                            C11521e c11521e = c11516a.f54087f;
                            if (c11521e.f54201i != -1) {
                                if (((View) childAt.getParent()).findViewById(c11516a.f54087f.f54201i) != null) {
                                    float top = (findViewById.getTop() + findViewById.getBottom()) / 2.0f;
                                    float left = (findViewById.getLeft() + findViewById.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c11521e.f54199g)) {
                                    childAt.setPivotX(c11516a.f54087f.f54199g);
                                }
                                if (!Float.isNaN(c11516a.f54087f.f54200h)) {
                                    childAt.setPivotY(c11516a.f54087f.f54200h);
                                }
                            }
                            childAt.setTranslationX(c11516a.f54087f.f54202j);
                            childAt.setTranslationY(c11516a.f54087f.f54203k);
                            childAt.setTranslationZ(c11516a.f54087f.f54204l);
                            C11521e c11521e2 = c11516a.f54087f;
                            if (c11521e2.f54205m) {
                                childAt.setElevation(c11521e2.f54206n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C11516a c11516a2 = this.f54081g.get(num);
            if (c11516a2 != null) {
                if (c11516a2.f54086e.f54148j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    C11518b c11518b2 = c11516a2.f54086e;
                    int[] iArr2 = c11518b2.f54150k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = c11518b2.f54152l0;
                        if (str2 != null) {
                            c11518b2.f54150k0 = m67807u(barrier2, str2);
                            barrier2.setReferencedIds(c11516a2.f54086e.f54150k0);
                        }
                    }
                    barrier2.setType(c11516a2.f54086e.f54144h0);
                    barrier2.setMargin(c11516a2.f54086e.f54146i0);
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.m67901B();
                    c11516a2.m67797e(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (c11516a2.f54086e.f54129a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    c11516a2.m67797e(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).mo67863k(constraintLayout);
            }
        }
    }

    /* renamed from: l */
    public void m67816l(int i, ConstraintLayout.LayoutParams layoutParams) {
        C11516a c11516a;
        if (this.f54081g.containsKey(Integer.valueOf(i)) && (c11516a = this.f54081g.get(Integer.valueOf(i))) != null) {
            c11516a.m67797e(layoutParams);
        }
    }

    /* renamed from: n */
    public void m67814n(int i, int i2) {
        C11516a c11516a;
        if (!this.f54081g.containsKey(Integer.valueOf(i)) || (c11516a = this.f54081g.get(Integer.valueOf(i))) == null) {
            return;
        }
        switch (i2) {
            case 1:
                C11518b c11518b = c11516a.f54086e;
                c11518b.f54149k = -1;
                c11518b.f54147j = -1;
                c11518b.f54110H = -1;
                c11518b.f54117O = Integer.MIN_VALUE;
                return;
            case 2:
                C11518b c11518b2 = c11516a.f54086e;
                c11518b2.f54153m = -1;
                c11518b2.f54151l = -1;
                c11518b2.f54111I = -1;
                c11518b2.f54119Q = Integer.MIN_VALUE;
                return;
            case 3:
                C11518b c11518b3 = c11516a.f54086e;
                c11518b3.f54157o = -1;
                c11518b3.f54155n = -1;
                c11518b3.f54112J = 0;
                c11518b3.f54118P = Integer.MIN_VALUE;
                return;
            case 4:
                C11518b c11518b4 = c11516a.f54086e;
                c11518b4.f54159p = -1;
                c11518b4.f54161q = -1;
                c11518b4.f54113K = 0;
                c11518b4.f54120R = Integer.MIN_VALUE;
                return;
            case 5:
                C11518b c11518b5 = c11516a.f54086e;
                c11518b5.f54163r = -1;
                c11518b5.f54164s = -1;
                c11518b5.f54165t = -1;
                c11518b5.f54116N = 0;
                c11518b5.f54123U = Integer.MIN_VALUE;
                return;
            case 6:
                C11518b c11518b6 = c11516a.f54086e;
                c11518b6.f54166u = -1;
                c11518b6.f54167v = -1;
                c11518b6.f54115M = 0;
                c11518b6.f54122T = Integer.MIN_VALUE;
                return;
            case 7:
                C11518b c11518b7 = c11516a.f54086e;
                c11518b7.f54168w = -1;
                c11518b7.f54169x = -1;
                c11518b7.f54114L = 0;
                c11518b7.f54121S = Integer.MIN_VALUE;
                return;
            case 8:
                C11518b c11518b8 = c11516a.f54086e;
                c11518b8.f54106D = -1.0f;
                c11518b8.f54105C = -1;
                c11518b8.f54104B = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* renamed from: o */
    public void m67813o(Context context, int i) {
        m67812p((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: p */
    public void m67812p(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f54081g.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f54080f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f54081g.containsKey(Integer.valueOf(id))) {
                this.f54081g.put(Integer.valueOf(id), new C11516a());
            }
            C11516a c11516a = this.f54081g.get(Integer.valueOf(id));
            if (c11516a != null) {
                c11516a.f54088g = C11512a.m67860b(this.f54079e, childAt);
                c11516a.m67795g(id, layoutParams);
                c11516a.f54084c.f54188b = childAt.getVisibility();
                c11516a.f54084c.f54190d = childAt.getAlpha();
                c11516a.f54087f.f54194b = childAt.getRotation();
                c11516a.f54087f.f54195c = childAt.getRotationX();
                c11516a.f54087f.f54196d = childAt.getRotationY();
                c11516a.f54087f.f54197e = childAt.getScaleX();
                c11516a.f54087f.f54198f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    C11521e c11521e = c11516a.f54087f;
                    c11521e.f54199g = pivotX;
                    c11521e.f54200h = pivotY;
                }
                c11516a.f54087f.f54202j = childAt.getTranslationX();
                c11516a.f54087f.f54203k = childAt.getTranslationY();
                c11516a.f54087f.f54204l = childAt.getTranslationZ();
                C11521e c11521e2 = c11516a.f54087f;
                if (c11521e2.f54205m) {
                    c11521e2.f54206n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    c11516a.f54086e.f54160p0 = barrier.m67906C();
                    c11516a.f54086e.f54150k0 = barrier.m67891o();
                    c11516a.f54086e.f54144h0 = barrier.m67904E();
                    c11516a.f54086e.f54146i0 = barrier.m67905D();
                }
            }
        }
    }

    /* renamed from: q */
    public void m67811q(C11515b c11515b) {
        this.f54081g.clear();
        for (Integer num : c11515b.f54081g.keySet()) {
            C11516a c11516a = c11515b.f54081g.get(num);
            if (c11516a != null) {
                this.f54081g.put(num, c11516a.clone());
            }
        }
    }

    /* renamed from: r */
    public void m67810r(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f54081g.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraints.getChildAt(i);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f54080f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f54081g.containsKey(Integer.valueOf(id))) {
                this.f54081g.put(Integer.valueOf(id), new C11516a());
            }
            C11516a c11516a = this.f54081g.get(Integer.valueOf(id));
            if (c11516a != null) {
                if (childAt instanceof ConstraintHelper) {
                    c11516a.m67793i((ConstraintHelper) childAt, id, layoutParams);
                }
                c11516a.m67794h(id, layoutParams);
            }
        }
    }

    /* renamed from: s */
    public void m67809s(int i, int i2, int i3, int i4) {
        if (!this.f54081g.containsKey(Integer.valueOf(i))) {
            this.f54081g.put(Integer.valueOf(i), new C11516a());
        }
        C11516a c11516a = this.f54081g.get(Integer.valueOf(i));
        if (c11516a == null) {
            return;
        }
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    C11518b c11518b = c11516a.f54086e;
                    c11518b.f54147j = i3;
                    c11518b.f54149k = -1;
                    return;
                } else if (i4 == 2) {
                    C11518b c11518b2 = c11516a.f54086e;
                    c11518b2.f54149k = i3;
                    c11518b2.f54147j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + m67828V(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    C11518b c11518b3 = c11516a.f54086e;
                    c11518b3.f54151l = i3;
                    c11518b3.f54153m = -1;
                    return;
                } else if (i4 == 2) {
                    C11518b c11518b4 = c11516a.f54086e;
                    c11518b4.f54153m = i3;
                    c11518b4.f54151l = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m67828V(i4) + " undefined");
                }
            case 3:
                if (i4 == 3) {
                    C11518b c11518b5 = c11516a.f54086e;
                    c11518b5.f54155n = i3;
                    c11518b5.f54157o = -1;
                    c11518b5.f54163r = -1;
                    c11518b5.f54164s = -1;
                    c11518b5.f54165t = -1;
                    return;
                } else if (i4 == 4) {
                    C11518b c11518b6 = c11516a.f54086e;
                    c11518b6.f54157o = i3;
                    c11518b6.f54155n = -1;
                    c11518b6.f54163r = -1;
                    c11518b6.f54164s = -1;
                    c11518b6.f54165t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m67828V(i4) + " undefined");
                }
            case 4:
                if (i4 == 4) {
                    C11518b c11518b7 = c11516a.f54086e;
                    c11518b7.f54161q = i3;
                    c11518b7.f54159p = -1;
                    c11518b7.f54163r = -1;
                    c11518b7.f54164s = -1;
                    c11518b7.f54165t = -1;
                    return;
                } else if (i4 == 3) {
                    C11518b c11518b8 = c11516a.f54086e;
                    c11518b8.f54159p = i3;
                    c11518b8.f54161q = -1;
                    c11518b8.f54163r = -1;
                    c11518b8.f54164s = -1;
                    c11518b8.f54165t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m67828V(i4) + " undefined");
                }
            case 5:
                if (i4 == 5) {
                    C11518b c11518b9 = c11516a.f54086e;
                    c11518b9.f54163r = i3;
                    c11518b9.f54161q = -1;
                    c11518b9.f54159p = -1;
                    c11518b9.f54155n = -1;
                    c11518b9.f54157o = -1;
                    return;
                } else if (i4 == 3) {
                    C11518b c11518b10 = c11516a.f54086e;
                    c11518b10.f54164s = i3;
                    c11518b10.f54161q = -1;
                    c11518b10.f54159p = -1;
                    c11518b10.f54155n = -1;
                    c11518b10.f54157o = -1;
                    return;
                } else if (i4 == 4) {
                    C11518b c11518b11 = c11516a.f54086e;
                    c11518b11.f54165t = i3;
                    c11518b11.f54161q = -1;
                    c11518b11.f54159p = -1;
                    c11518b11.f54155n = -1;
                    c11518b11.f54157o = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m67828V(i4) + " undefined");
                }
            case 6:
                if (i4 == 6) {
                    C11518b c11518b12 = c11516a.f54086e;
                    c11518b12.f54167v = i3;
                    c11518b12.f54166u = -1;
                    return;
                } else if (i4 == 7) {
                    C11518b c11518b13 = c11516a.f54086e;
                    c11518b13.f54166u = i3;
                    c11518b13.f54167v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m67828V(i4) + " undefined");
                }
            case 7:
                if (i4 == 7) {
                    C11518b c11518b14 = c11516a.f54086e;
                    c11518b14.f54169x = i3;
                    c11518b14.f54168w = -1;
                    return;
                } else if (i4 == 6) {
                    C11518b c11518b15 = c11516a.f54086e;
                    c11518b15.f54168w = i3;
                    c11518b15.f54169x = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m67828V(i4) + " undefined");
                }
            default:
                throw new IllegalArgumentException(m67828V(i2) + " to " + m67828V(i4) + " unknown");
        }
    }

    /* renamed from: t */
    public void m67808t(int i, int i2, int i3, float f) {
        C11518b c11518b = m67805w(i).f54086e;
        c11518b.f54104B = i2;
        c11518b.f54105C = i3;
        c11518b.f54106D = f;
    }

    /* renamed from: u */
    public final int[] m67807u(View view, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C52945zh4.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    /* renamed from: v */
    public final C11516a m67806v(Context context, AttributeSet attributeSet, boolean z) {
        int[] iArr;
        C11516a c11516a = new C11516a();
        if (z) {
            iArr = C39341cm4.ConstraintOverride;
        } else {
            iArr = C39341cm4.Constraint;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        m67839K(context, c11516a, obtainStyledAttributes, z);
        obtainStyledAttributes.recycle();
        return c11516a;
    }

    /* renamed from: w */
    public final C11516a m67805w(int i) {
        if (!this.f54081g.containsKey(Integer.valueOf(i))) {
            this.f54081g.put(Integer.valueOf(i), new C11516a());
        }
        return this.f54081g.get(Integer.valueOf(i));
    }

    /* renamed from: x */
    public C11516a m67804x(int i) {
        if (this.f54081g.containsKey(Integer.valueOf(i))) {
            return this.f54081g.get(Integer.valueOf(i));
        }
        return null;
    }

    /* renamed from: y */
    public int m67803y(int i) {
        return m67805w(i).f54086e.f54137e;
    }

    /* renamed from: z */
    public int[] m67802z() {
        Integer[] numArr = (Integer[]) this.f54081g.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }
}
