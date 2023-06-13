package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.C11488a;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C11515b;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.C43042iz0;
/* loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements L43 {

    /* renamed from: Y0 */
    public static boolean f53557Y0;

    /* renamed from: A */
    public boolean f53558A;

    /* renamed from: A0 */
    public int f53559A0;

    /* renamed from: B */
    public UQ5 f53560B;

    /* renamed from: B0 */
    public int f53561B0;

    /* renamed from: C */
    public C11480e f53562C;

    /* renamed from: C0 */
    public float f53563C0;

    /* renamed from: D */
    public boolean f53564D;

    /* renamed from: D0 */
    public C39930dk2 f53565D0;

    /* renamed from: E */
    public int f53566E;

    /* renamed from: E0 */
    public boolean f53567E0;

    /* renamed from: F */
    public int f53568F;

    /* renamed from: F0 */
    public C11485j f53569F0;

    /* renamed from: G */
    public int f53570G;

    /* renamed from: G0 */
    public Runnable f53571G0;

    /* renamed from: H */
    public int f53572H;

    /* renamed from: H0 */
    public int[] f53573H0;

    /* renamed from: I */
    public boolean f53574I;

    /* renamed from: I0 */
    public int f53575I0;

    /* renamed from: J */
    public float f53576J;

    /* renamed from: J0 */
    public boolean f53577J0;

    /* renamed from: K */
    public float f53578K;

    /* renamed from: K0 */
    public int f53579K0;

    /* renamed from: L0 */
    public HashMap<View, C33428Ht6> f53580L0;

    /* renamed from: M0 */
    public int f53581M0;

    /* renamed from: N0 */
    public int f53582N0;

    /* renamed from: O0 */
    public int f53583O0;

    /* renamed from: P */
    public long f53584P;

    /* renamed from: P0 */
    public Rect f53585P0;

    /* renamed from: Q */
    public float f53586Q;

    /* renamed from: Q0 */
    public boolean f53587Q0;

    /* renamed from: R */
    public boolean f53588R;

    /* renamed from: R0 */
    public EnumC11487l f53589R0;

    /* renamed from: S */
    public ArrayList<MotionHelper> f53590S;

    /* renamed from: S0 */
    public C11482g f53591S0;

    /* renamed from: T */
    public ArrayList<MotionHelper> f53592T;

    /* renamed from: T0 */
    public boolean f53593T0;

    /* renamed from: U */
    public ArrayList<MotionHelper> f53594U;

    /* renamed from: U0 */
    public RectF f53595U0;

    /* renamed from: V0 */
    public View f53596V0;

    /* renamed from: W */
    public CopyOnWriteArrayList<InterfaceC11486k> f53597W;

    /* renamed from: W0 */
    public Matrix f53598W0;

    /* renamed from: X0 */
    public ArrayList<Integer> f53599X0;

    /* renamed from: b */
    public C11488a f53600b;

    /* renamed from: c */
    public Interpolator f53601c;

    /* renamed from: d */
    public Interpolator f53602d;

    /* renamed from: e */
    public float f53603e;

    /* renamed from: f */
    public int f53604f;

    /* renamed from: g */
    public int f53605g;

    /* renamed from: h */
    public int f53606h;

    /* renamed from: i */
    public int f53607i;

    /* renamed from: j */
    public int f53608j;

    /* renamed from: k */
    public boolean f53609k;

    /* renamed from: l */
    public HashMap<View, OV2> f53610l;

    /* renamed from: m */
    public long f53611m;

    /* renamed from: n */
    public float f53612n;

    /* renamed from: o */
    public float f53613o;

    /* renamed from: p */
    public float f53614p;

    /* renamed from: p0 */
    public int f53615p0;

    /* renamed from: q */
    public long f53616q;

    /* renamed from: q0 */
    public long f53617q0;

    /* renamed from: r */
    public float f53618r;

    /* renamed from: r0 */
    public float f53619r0;

    /* renamed from: s */
    public boolean f53620s;

    /* renamed from: s0 */
    public int f53621s0;

    /* renamed from: t */
    public boolean f53622t;

    /* renamed from: t0 */
    public float f53623t0;

    /* renamed from: u */
    public boolean f53624u;

    /* renamed from: u0 */
    public boolean f53625u0;

    /* renamed from: v */
    public InterfaceC11486k f53626v;

    /* renamed from: v0 */
    public boolean f53627v0;

    /* renamed from: w */
    public float f53628w;

    /* renamed from: w0 */
    public int f53629w0;

    /* renamed from: x */
    public float f53630x;

    /* renamed from: x0 */
    public int f53631x0;

    /* renamed from: y */
    public int f53632y;

    /* renamed from: y0 */
    public int f53633y0;

    /* renamed from: z */
    public C11481f f53634z;

    /* renamed from: z0 */
    public int f53635z0;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$a */
    /* loaded from: classes.dex */
    public class RunnableC11476a implements Runnable {
        public RunnableC11476a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.f53569F0.m68099a();
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$b */
    /* loaded from: classes.dex */
    public class RunnableC11477b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f53637b;

        public RunnableC11477b(MotionLayout motionLayout, View view) {
            this.f53637b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f53637b.setNestedScrollingEnabled(true);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$c */
    /* loaded from: classes.dex */
    public class RunnableC11478c implements Runnable {
        public RunnableC11478c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.f53569F0.m68099a();
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$d */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11479d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53639a;

        static {
            int[] iArr = new int[EnumC11487l.values().length];
            f53639a = iArr;
            try {
                iArr[EnumC11487l.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53639a[EnumC11487l.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53639a[EnumC11487l.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53639a[EnumC11487l.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$e */
    /* loaded from: classes.dex */
    public class C11480e extends WV2 {

        /* renamed from: a */
        public float f53640a = 0.0f;

        /* renamed from: b */
        public float f53641b = 0.0f;

        /* renamed from: c */
        public float f53642c;

        public C11480e() {
        }

        @Override // p000.WV2
        /* renamed from: a */
        public float mo68129a() {
            return MotionLayout.this.f53603e;
        }

        /* renamed from: b */
        public void m68128b(float f, float f2, float f3) {
            this.f53640a = f;
            this.f53641b = f2;
            this.f53642c = f3;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.f53640a;
            if (f4 > 0.0f) {
                float f5 = this.f53642c;
                if (f4 / f5 < f) {
                    f = f4 / f5;
                }
                MotionLayout.this.f53603e = f4 - (f5 * f);
                f2 = (f4 * f) - (((f5 * f) * f) / 2.0f);
                f3 = this.f53641b;
            } else {
                float f6 = this.f53642c;
                if ((-f4) / f6 < f) {
                    f = (-f4) / f6;
                }
                MotionLayout.this.f53603e = (f6 * f) + f4;
                f2 = (f4 * f) + (((f6 * f) * f) / 2.0f);
                f3 = this.f53641b;
            }
            return f2 + f3;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$f */
    /* loaded from: classes.dex */
    public class C11481f {

        /* renamed from: a */
        public float[] f53644a;

        /* renamed from: b */
        public int[] f53645b;

        /* renamed from: c */
        public float[] f53646c;

        /* renamed from: d */
        public Path f53647d;

        /* renamed from: e */
        public Paint f53648e;

        /* renamed from: f */
        public Paint f53649f;

        /* renamed from: g */
        public Paint f53650g;

        /* renamed from: h */
        public Paint f53651h;

        /* renamed from: i */
        public Paint f53652i;

        /* renamed from: j */
        public float[] f53653j;

        /* renamed from: p */
        public DashPathEffect f53659p;

        /* renamed from: q */
        public int f53660q;

        /* renamed from: t */
        public int f53663t;

        /* renamed from: k */
        public final int f53654k = -21965;

        /* renamed from: l */
        public final int f53655l = -2067046;

        /* renamed from: m */
        public final int f53656m = -13391360;

        /* renamed from: n */
        public final int f53657n = 1996488704;

        /* renamed from: o */
        public final int f53658o = 10;

        /* renamed from: r */
        public Rect f53661r = new Rect();

        /* renamed from: s */
        public boolean f53662s = false;

        public C11481f() {
            this.f53663t = 1;
            Paint paint = new Paint();
            this.f53648e = paint;
            paint.setAntiAlias(true);
            this.f53648e.setColor(-21965);
            this.f53648e.setStrokeWidth(2.0f);
            this.f53648e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f53649f = paint2;
            paint2.setAntiAlias(true);
            this.f53649f.setColor(-2067046);
            this.f53649f.setStrokeWidth(2.0f);
            this.f53649f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f53650g = paint3;
            paint3.setAntiAlias(true);
            this.f53650g.setColor(-13391360);
            this.f53650g.setStrokeWidth(2.0f);
            this.f53650g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f53651h = paint4;
            paint4.setAntiAlias(true);
            this.f53651h.setColor(-13391360);
            this.f53651h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f53653j = new float[8];
            Paint paint5 = new Paint();
            this.f53652i = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f53659p = dashPathEffect;
            this.f53650g.setPathEffect(dashPathEffect);
            this.f53646c = new float[100];
            this.f53645b = new int[50];
            if (this.f53662s) {
                this.f53648e.setStrokeWidth(8.0f);
                this.f53652i.setStrokeWidth(8.0f);
                this.f53649f.setStrokeWidth(8.0f);
                this.f53663t = 4;
            }
        }

        /* renamed from: a */
        public void m68127a(Canvas canvas, HashMap<View, OV2> hashMap, int i, int i2) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f53606h) + ":" + MotionLayout.this.m68176X();
                    canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.f53651h);
                    canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.f53648e);
                }
                for (OV2 ov2 : hashMap.values()) {
                    int m92144m = ov2.m92144m();
                    if (i2 > 0 && m92144m == 0) {
                        m92144m = 1;
                    }
                    if (m92144m != 0) {
                        this.f53660q = ov2.m92154c(this.f53646c, this.f53645b);
                        if (m92144m >= 1) {
                            int i3 = i / 16;
                            float[] fArr = this.f53644a;
                            if (fArr == null || fArr.length != i3 * 2) {
                                this.f53644a = new float[i3 * 2];
                                this.f53647d = new Path();
                            }
                            int i4 = this.f53663t;
                            canvas.translate(i4, i4);
                            this.f53648e.setColor(1996488704);
                            this.f53652i.setColor(1996488704);
                            this.f53649f.setColor(1996488704);
                            this.f53650g.setColor(1996488704);
                            ov2.m92153d(this.f53644a, i3);
                            m68126b(canvas, m92144m, this.f53660q, ov2);
                            this.f53648e.setColor(-21965);
                            this.f53649f.setColor(-2067046);
                            this.f53652i.setColor(-2067046);
                            this.f53650g.setColor(-13391360);
                            int i5 = this.f53663t;
                            canvas.translate(-i5, -i5);
                            m68126b(canvas, m92144m, this.f53660q, ov2);
                            if (m92144m == 5) {
                                m68118j(canvas, ov2);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        /* renamed from: b */
        public void m68126b(Canvas canvas, int i, int i2, OV2 ov2) {
            if (i == 4) {
                m68124d(canvas);
            }
            if (i == 2) {
                m68121g(canvas);
            }
            if (i == 3) {
                m68123e(canvas);
            }
            m68125c(canvas);
            m68117k(canvas, i, i2, ov2);
        }

        /* renamed from: c */
        public final void m68125c(Canvas canvas) {
            canvas.drawLines(this.f53644a, this.f53648e);
        }

        /* renamed from: d */
        public final void m68124d(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.f53660q; i++) {
                int i2 = this.f53645b[i];
                if (i2 == 1) {
                    z = true;
                }
                if (i2 == 0) {
                    z2 = true;
                }
            }
            if (z) {
                m68121g(canvas);
            }
            if (z2) {
                m68123e(canvas);
            }
        }

        /* renamed from: e */
        public final void m68123e(Canvas canvas) {
            float[] fArr = this.f53644a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f53650g);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f53650g);
        }

        /* renamed from: f */
        public final void m68122f(Canvas canvas, float f, float f2) {
            float[] fArr = this.f53644a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f5 - f3)) + 0.5d)) / 100.0f);
            m68116l(str, this.f53651h);
            canvas.drawText(str, ((min2 / 2.0f) - (this.f53661r.width() / 2)) + min, f2 - 20.0f, this.f53651h);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f53650g);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
            m68116l(str2, this.f53651h);
            canvas.drawText(str2, f + 5.0f, max - ((max2 / 2.0f) - (this.f53661r.height() / 2)), this.f53651h);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f53650g);
        }

        /* renamed from: g */
        public final void m68121g(Canvas canvas) {
            float[] fArr = this.f53644a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f53650g);
        }

        /* renamed from: h */
        public final void m68120h(Canvas canvas, float f, float f2) {
            float[] fArr = this.f53644a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            m68116l(str, this.f53651h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.f53661r.width() / 2), -20.0f, this.f53651h);
            canvas.drawLine(f, f2, f10, f11, this.f53650g);
        }

        /* renamed from: i */
        public final void m68119i(Canvas canvas, float f, float f2, int i, int i2) {
            String str = "" + (((int) ((((f - (i / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i)) + 0.5d)) / 100.0f);
            m68116l(str, this.f53651h);
            canvas.drawText(str, ((f / 2.0f) - (this.f53661r.width() / 2)) + 0.0f, f2 - 20.0f, this.f53651h);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.f53650g);
            String str2 = "" + (((int) ((((f2 - (i2 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i2)) + 0.5d)) / 100.0f);
            m68116l(str2, this.f53651h);
            canvas.drawText(str2, f + 5.0f, 0.0f - ((f2 / 2.0f) - (this.f53661r.height() / 2)), this.f53651h);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.f53650g);
        }

        /* renamed from: j */
        public final void m68118j(Canvas canvas, OV2 ov2) {
            this.f53647d.reset();
            for (int i = 0; i <= 50; i++) {
                ov2.m92152e(i / 50, this.f53653j, 0);
                Path path = this.f53647d;
                float[] fArr = this.f53653j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f53647d;
                float[] fArr2 = this.f53653j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f53647d;
                float[] fArr3 = this.f53653j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f53647d;
                float[] fArr4 = this.f53653j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f53647d.close();
            }
            this.f53648e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f53647d, this.f53648e);
            canvas.translate(-2.0f, -2.0f);
            this.f53648e.setColor(-65536);
            canvas.drawPath(this.f53647d, this.f53648e);
        }

        /* renamed from: k */
        public final void m68117k(Canvas canvas, int i, int i2, OV2 ov2) {
            int i3;
            int i4;
            float f;
            float f2;
            View view = ov2.f26683b;
            if (view != null) {
                i3 = view.getWidth();
                i4 = ov2.f26683b.getHeight();
            } else {
                i3 = 0;
                i4 = 0;
            }
            for (int i5 = 1; i5 < i2 - 1; i5++) {
                if (i != 4 || this.f53645b[i5 - 1] != 0) {
                    float[] fArr = this.f53646c;
                    int i6 = i5 * 2;
                    float f3 = fArr[i6];
                    float f4 = fArr[i6 + 1];
                    this.f53647d.reset();
                    this.f53647d.moveTo(f3, f4 + 10.0f);
                    this.f53647d.lineTo(f3 + 10.0f, f4);
                    this.f53647d.lineTo(f3, f4 - 10.0f);
                    this.f53647d.lineTo(f3 - 10.0f, f4);
                    this.f53647d.close();
                    int i7 = i5 - 1;
                    ov2.m92140q(i7);
                    if (i == 4) {
                        int i8 = this.f53645b[i7];
                        if (i8 == 1) {
                            m68120h(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (i8 == 0) {
                            m68122f(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (i8 == 2) {
                            f = f4;
                            f2 = f3;
                            m68119i(canvas, f3 - 0.0f, f4 - 0.0f, i3, i4);
                            canvas.drawPath(this.f53647d, this.f53652i);
                        }
                        f = f4;
                        f2 = f3;
                        canvas.drawPath(this.f53647d, this.f53652i);
                    } else {
                        f = f4;
                        f2 = f3;
                    }
                    if (i == 2) {
                        m68120h(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 3) {
                        m68122f(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 6) {
                        m68119i(canvas, f2 - 0.0f, f - 0.0f, i3, i4);
                    }
                    canvas.drawPath(this.f53647d, this.f53652i);
                }
            }
            float[] fArr2 = this.f53644a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f53649f);
                float[] fArr3 = this.f53644a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f53649f);
            }
        }

        /* renamed from: l */
        public void m68116l(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f53661r);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$g */
    /* loaded from: classes.dex */
    public class C11482g {

        /* renamed from: a */
        public C43635jz0 f53665a = new C43635jz0();

        /* renamed from: b */
        public C43635jz0 f53666b = new C43635jz0();

        /* renamed from: c */
        public C11515b f53667c = null;

        /* renamed from: d */
        public C11515b f53668d = null;

        /* renamed from: e */
        public int f53669e;

        /* renamed from: f */
        public int f53670f;

        public C11482g() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x013d A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m68115a() {
            String str;
            SparseArray sparseArray;
            String str2;
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.f53610l.clear();
            SparseArray sparseArray2 = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i = 0; i < childCount; i++) {
                View childAt = MotionLayout.this.getChildAt(i);
                OV2 ov2 = new OV2(childAt);
                int id = childAt.getId();
                iArr[i] = id;
                sparseArray2.put(id, ov2);
                MotionLayout.this.f53610l.put(childAt, ov2);
            }
            int i2 = 0;
            while (i2 < childCount) {
                View childAt2 = MotionLayout.this.getChildAt(i2);
                OV2 ov22 = MotionLayout.this.f53610l.get(childAt2);
                if (ov22 == null) {
                    sparseArray = sparseArray2;
                } else {
                    if (this.f53667c != null) {
                        C43042iz0 m68112d = m68112d(this.f53665a, childAt2);
                        if (m68112d != null) {
                            ov22.m92160G(MotionLayout.this.m68154l0(m68112d), this.f53667c, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.f53632y != 0) {
                            Log.e("MotionLayout", FU0.m107119b() + "no widget for  " + FU0.m107117d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    } else if (MotionLayout.this.f53577J0) {
                        C33428Ht6 c33428Ht6 = MotionLayout.this.f53580L0.get(childAt2);
                        MotionLayout motionLayout = MotionLayout.this;
                        str = "MotionLayout";
                        sparseArray = sparseArray2;
                        str2 = "no widget for  ";
                        ov22.m92161F(c33428Ht6, childAt2, motionLayout.f53579K0, motionLayout.f53581M0, MotionLayout.this.f53582N0);
                        if (this.f53668d != null) {
                            C43042iz0 m68112d2 = m68112d(this.f53666b, childAt2);
                            if (m68112d2 != null) {
                                ov22.m92164C(MotionLayout.this.m68154l0(m68112d2), this.f53668d, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                            } else if (MotionLayout.this.f53632y != 0) {
                                Log.e(str, FU0.m107119b() + str2 + FU0.m107117d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                            }
                        }
                    }
                    sparseArray = sparseArray2;
                    str = "MotionLayout";
                    str2 = "no widget for  ";
                    if (this.f53668d != null) {
                    }
                }
                i2++;
                sparseArray2 = sparseArray;
            }
            SparseArray sparseArray3 = sparseArray2;
            int i3 = 0;
            while (i3 < childCount) {
                SparseArray sparseArray4 = sparseArray3;
                OV2 ov23 = (OV2) sparseArray4.get(iArr[i3]);
                int m92149h = ov23.m92149h();
                if (m92149h != -1) {
                    ov23.m92157J((OV2) sparseArray4.get(m92149h));
                }
                i3++;
                sparseArray3 = sparseArray4;
            }
        }

        /* renamed from: b */
        public final void m68114b(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.f53605g == motionLayout.m68175Y()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                C43635jz0 c43635jz0 = this.f53666b;
                C11515b c11515b = this.f53668d;
                if (c11515b != null && c11515b.f54078d != 0) {
                    i6 = i2;
                } else {
                    i6 = i;
                }
                if (c11515b != null && c11515b.f54078d != 0) {
                    i7 = i;
                } else {
                    i7 = i2;
                }
                motionLayout2.resolveSystem(c43635jz0, optimizationLevel, i6, i7);
                C11515b c11515b2 = this.f53667c;
                if (c11515b2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    C43635jz0 c43635jz02 = this.f53665a;
                    int i9 = c11515b2.f54078d;
                    if (i9 == 0) {
                        i8 = i;
                    } else {
                        i8 = i2;
                    }
                    if (i9 == 0) {
                        i = i2;
                    }
                    motionLayout3.resolveSystem(c43635jz02, optimizationLevel, i8, i);
                    return;
                }
                return;
            }
            C11515b c11515b3 = this.f53667c;
            if (c11515b3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                C43635jz0 c43635jz03 = this.f53665a;
                int i10 = c11515b3.f54078d;
                if (i10 == 0) {
                    i4 = i;
                } else {
                    i4 = i2;
                }
                if (i10 == 0) {
                    i5 = i2;
                } else {
                    i5 = i;
                }
                motionLayout4.resolveSystem(c43635jz03, optimizationLevel, i4, i5);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            C43635jz0 c43635jz04 = this.f53666b;
            C11515b c11515b4 = this.f53668d;
            if (c11515b4 != null && c11515b4.f54078d != 0) {
                i3 = i2;
            } else {
                i3 = i;
            }
            if (c11515b4 == null || c11515b4.f54078d == 0) {
                i = i2;
            }
            motionLayout5.resolveSystem(c43635jz04, optimizationLevel, i3, i);
        }

        /* renamed from: c */
        public void m68113c(C43635jz0 c43635jz0, C43635jz0 c43635jz02) {
            C43042iz0 c43042iz0;
            ArrayList<C43042iz0> m61757v1 = c43635jz0.m61757v1();
            HashMap<C43042iz0, C43042iz0> hashMap = new HashMap<>();
            hashMap.put(c43635jz0, c43635jz02);
            c43635jz02.m61757v1().clear();
            c43635jz02.mo7202n(c43635jz0, hashMap);
            Iterator<C43042iz0> it = m61757v1.iterator();
            while (it.hasNext()) {
                C43042iz0 next = it.next();
                if (next instanceof C1263Cy) {
                    c43042iz0 = new C1263Cy();
                } else if (next instanceof C50895wE1) {
                    c43042iz0 = new C50895wE1();
                } else if (next instanceof C32496Du1) {
                    c43042iz0 = new C32496Du1();
                } else if (next instanceof SU3) {
                    c43042iz0 = new SU3();
                } else if (next instanceof HL1) {
                    c43042iz0 = new JL1();
                } else {
                    c43042iz0 = new C43042iz0();
                }
                c43635jz02.m61758c(c43042iz0);
                hashMap.put(next, c43042iz0);
            }
            Iterator<C43042iz0> it2 = m61757v1.iterator();
            while (it2.hasNext()) {
                C43042iz0 next2 = it2.next();
                hashMap.get(next2).mo7202n(next2, hashMap);
            }
        }

        /* renamed from: d */
        public C43042iz0 m68112d(C43635jz0 c43635jz0, View view) {
            if (c43635jz0.m31337u() == view) {
                return c43635jz0;
            }
            ArrayList<C43042iz0> m61757v1 = c43635jz0.m61757v1();
            int size = m61757v1.size();
            for (int i = 0; i < size; i++) {
                C43042iz0 c43042iz0 = m61757v1.get(i);
                if (c43042iz0.m31337u() == view) {
                    return c43042iz0;
                }
            }
            return null;
        }

        /* renamed from: e */
        public void m68111e(C43635jz0 c43635jz0, C11515b c11515b, C11515b c11515b2) {
            this.f53667c = c11515b;
            this.f53668d = c11515b2;
            this.f53665a = new C43635jz0();
            this.f53666b = new C43635jz0();
            this.f53665a.m29534a2(((ConstraintLayout) MotionLayout.this).mLayoutWidget.m29548N1());
            this.f53666b.m29534a2(((ConstraintLayout) MotionLayout.this).mLayoutWidget.m29548N1());
            this.f53665a.m61755y1();
            this.f53666b.m61755y1();
            m68113c(((ConstraintLayout) MotionLayout.this).mLayoutWidget, this.f53665a);
            m68113c(((ConstraintLayout) MotionLayout.this).mLayoutWidget, this.f53666b);
            if (MotionLayout.this.f53614p > 0.5d) {
                if (c11515b != null) {
                    m68106j(this.f53665a, c11515b);
                }
                m68106j(this.f53666b, c11515b2);
            } else {
                m68106j(this.f53666b, c11515b2);
                if (c11515b != null) {
                    m68106j(this.f53665a, c11515b);
                }
            }
            this.f53665a.m29531d2(MotionLayout.this.isRtl());
            this.f53665a.m29529f2();
            this.f53666b.m29531d2(MotionLayout.this.isRtl());
            this.f53666b.m29529f2();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    C43635jz0 c43635jz02 = this.f53665a;
                    C43042iz0.EnumC24677b enumC24677b = C43042iz0.EnumC24677b.WRAP_CONTENT;
                    c43635jz02.m31400T0(enumC24677b);
                    this.f53666b.m31400T0(enumC24677b);
                }
                if (layoutParams.height == -2) {
                    C43635jz0 c43635jz03 = this.f53665a;
                    C43042iz0.EnumC24677b enumC24677b2 = C43042iz0.EnumC24677b.WRAP_CONTENT;
                    c43635jz03.m31360k1(enumC24677b2);
                    this.f53666b.m31360k1(enumC24677b2);
                }
            }
        }

        /* renamed from: f */
        public boolean m68110f(int i, int i2) {
            return (i == this.f53669e && i2 == this.f53670f) ? false : true;
        }

        /* renamed from: g */
        public void m68109g(int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.f53559A0 = mode;
            motionLayout.f53561B0 = mode2;
            motionLayout.getOptimizationLevel();
            m68114b(i, i2);
            if ((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                m68114b(i, i2);
                MotionLayout.this.f53629w0 = this.f53665a.m31391Y();
                MotionLayout.this.f53631x0 = this.f53665a.m31328z();
                MotionLayout.this.f53633y0 = this.f53666b.m31391Y();
                MotionLayout.this.f53635z0 = this.f53666b.m31328z();
                MotionLayout motionLayout2 = MotionLayout.this;
                if (motionLayout2.f53629w0 == motionLayout2.f53633y0 && motionLayout2.f53631x0 == motionLayout2.f53635z0) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                motionLayout2.f53627v0 = z4;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i3 = motionLayout3.f53629w0;
            int i4 = motionLayout3.f53631x0;
            int i5 = motionLayout3.f53559A0;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                i3 = (int) (i3 + (motionLayout3.f53563C0 * (motionLayout3.f53633y0 - i3)));
            }
            int i6 = i3;
            int i7 = motionLayout3.f53561B0;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i4 = (int) (i4 + (motionLayout3.f53563C0 * (motionLayout3.f53635z0 - i4)));
            }
            int i8 = i4;
            if (!this.f53665a.m29539V1() && !this.f53666b.m29539V1()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!this.f53665a.m29541T1() && !this.f53666b.m29541T1()) {
                z3 = false;
            } else {
                z3 = true;
            }
            MotionLayout.this.resolveMeasuredDimension(i, i2, i6, i8, z2, z3);
        }

        /* renamed from: h */
        public void m68108h() {
            m68109g(MotionLayout.this.f53607i, MotionLayout.this.f53608j);
            MotionLayout.this.m68156k0();
        }

        /* renamed from: i */
        public void m68107i(int i, int i2) {
            this.f53669e = i;
            this.f53670f = i2;
        }

        /* renamed from: j */
        public final void m68106j(C43635jz0 c43635jz0, C11515b c11515b) {
            SparseArray<C43042iz0> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, c43635jz0);
            sparseArray.put(MotionLayout.this.getId(), c43635jz0);
            if (c11515b != null && c11515b.f54078d != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.resolveSystem(this.f53666b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            Iterator<C43042iz0> it = c43635jz0.m61757v1().iterator();
            while (it.hasNext()) {
                C43042iz0 next = it.next();
                next.m31431D0(true);
                sparseArray.put(((View) next.m31337u()).getId(), next);
            }
            Iterator<C43042iz0> it2 = c43635jz0.m61757v1().iterator();
            while (it2.hasNext()) {
                C43042iz0 next2 = it2.next();
                View view = (View) next2.m31337u();
                c11515b.m67816l(view.getId(), layoutParams);
                next2.m31349o1(c11515b.m67846D(view.getId()));
                next2.m31407P0(c11515b.m67803y(view.getId()));
                if (view instanceof ConstraintHelper) {
                    c11515b.m67818j((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).m67901B();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view, next2, layoutParams, sparseArray);
                if (c11515b.m67847C(view.getId()) == 1) {
                    next2.m31352n1(view.getVisibility());
                } else {
                    next2.m31352n1(c11515b.m67848B(view.getId()));
                }
            }
            Iterator<C43042iz0> it3 = c43635jz0.m61757v1().iterator();
            while (it3.hasNext()) {
                C43042iz0 next3 = it3.next();
                if (next3 instanceof C53077zu6) {
                    HL1 hl1 = (HL1) next3;
                    ((ConstraintHelper) next3.m31337u()).mo67882z(c43635jz0, hl1, sparseArray);
                    ((C53077zu6) hl1).m120y1();
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$h */
    /* loaded from: classes.dex */
    public interface InterfaceC11483h {
        /* renamed from: a */
        void mo68105a(MotionEvent motionEvent);

        /* renamed from: b */
        void mo68104b();

        /* renamed from: c */
        float mo68103c();

        /* renamed from: d */
        void mo68102d(int i);

        /* renamed from: e */
        float mo68101e();
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$i */
    /* loaded from: classes.dex */
    public static class C11484i implements InterfaceC11483h {

        /* renamed from: b */
        public static C11484i f53672b = new C11484i();

        /* renamed from: a */
        public VelocityTracker f53673a;

        private C11484i() {
        }

        /* renamed from: f */
        public static C11484i m68100f() {
            f53672b.f53673a = VelocityTracker.obtain();
            return f53672b;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC11483h
        /* renamed from: a */
        public void mo68105a(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f53673a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC11483h
        /* renamed from: b */
        public void mo68104b() {
            VelocityTracker velocityTracker = this.f53673a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f53673a = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC11483h
        /* renamed from: c */
        public float mo68103c() {
            VelocityTracker velocityTracker = this.f53673a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC11483h
        /* renamed from: d */
        public void mo68102d(int i) {
            VelocityTracker velocityTracker = this.f53673a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC11483h
        /* renamed from: e */
        public float mo68101e() {
            VelocityTracker velocityTracker = this.f53673a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$j */
    /* loaded from: classes.dex */
    public class C11485j {

        /* renamed from: a */
        public float f53674a = Float.NaN;

        /* renamed from: b */
        public float f53675b = Float.NaN;

        /* renamed from: c */
        public int f53676c = -1;

        /* renamed from: d */
        public int f53677d = -1;

        /* renamed from: e */
        public final String f53678e = "motion.progress";

        /* renamed from: f */
        public final String f53679f = "motion.velocity";

        /* renamed from: g */
        public final String f53680g = "motion.StartState";

        /* renamed from: h */
        public final String f53681h = "motion.EndState";

        public C11485j() {
        }

        /* renamed from: a */
        public void m68099a() {
            int i = this.f53676c;
            if (i != -1 || this.f53677d != -1) {
                if (i == -1) {
                    MotionLayout.this.m68145q0(this.f53677d);
                } else {
                    int i2 = this.f53677d;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i, i2);
                    }
                }
                MotionLayout.this.m68160i0(EnumC11487l.SETUP);
            }
            if (Float.isNaN(this.f53675b)) {
                if (Float.isNaN(this.f53674a)) {
                    return;
                }
                MotionLayout.this.setProgress(this.f53674a);
                return;
            }
            MotionLayout.this.setProgress(this.f53674a, this.f53675b);
            this.f53674a = Float.NaN;
            this.f53675b = Float.NaN;
            this.f53676c = -1;
            this.f53677d = -1;
        }

        /* renamed from: b */
        public void m68098b(int i) {
            this.f53677d = i;
        }

        /* renamed from: c */
        public void m68097c(float f) {
            this.f53674a = f;
        }

        /* renamed from: d */
        public void m68096d(int i) {
            this.f53676c = i;
        }

        /* renamed from: e */
        public void m68095e(Bundle bundle) {
            this.f53674a = bundle.getFloat("motion.progress");
            this.f53675b = bundle.getFloat("motion.velocity");
            this.f53676c = bundle.getInt("motion.StartState");
            this.f53677d = bundle.getInt("motion.EndState");
        }

        /* renamed from: f */
        public void m68094f(float f) {
            this.f53675b = f;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$k */
    /* loaded from: classes.dex */
    public interface InterfaceC11486k {
        /* renamed from: a */
        void mo68093a(MotionLayout motionLayout, int i, int i2, float f);

        /* renamed from: b */
        void mo68092b(MotionLayout motionLayout, int i);

        /* renamed from: c */
        void mo68091c(MotionLayout motionLayout, int i, int i2);

        /* renamed from: d */
        void mo68090d(MotionLayout motionLayout, int i, boolean z, float f);
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$l */
    /* loaded from: classes.dex */
    public enum EnumC11487l {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(Context context) {
        super(context);
        this.f53602d = null;
        this.f53603e = 0.0f;
        this.f53604f = -1;
        this.f53605g = -1;
        this.f53606h = -1;
        this.f53607i = 0;
        this.f53608j = 0;
        this.f53609k = true;
        this.f53610l = new HashMap<>();
        this.f53611m = 0L;
        this.f53612n = 1.0f;
        this.f53613o = 0.0f;
        this.f53614p = 0.0f;
        this.f53618r = 0.0f;
        this.f53622t = false;
        this.f53624u = false;
        this.f53632y = 0;
        this.f53558A = false;
        this.f53560B = new UQ5();
        this.f53562C = new C11480e();
        this.f53564D = true;
        this.f53574I = false;
        this.f53588R = false;
        this.f53590S = null;
        this.f53592T = null;
        this.f53594U = null;
        this.f53597W = null;
        this.f53615p0 = 0;
        this.f53617q0 = -1L;
        this.f53619r0 = 0.0f;
        this.f53621s0 = 0;
        this.f53623t0 = 0.0f;
        this.f53625u0 = false;
        this.f53627v0 = false;
        this.f53565D0 = new C39930dk2();
        this.f53567E0 = false;
        this.f53571G0 = null;
        this.f53573H0 = null;
        this.f53575I0 = 0;
        this.f53577J0 = false;
        this.f53579K0 = 0;
        this.f53580L0 = new HashMap<>();
        this.f53585P0 = new Rect();
        this.f53587Q0 = false;
        this.f53589R0 = EnumC11487l.UNDEFINED;
        this.f53591S0 = new C11482g();
        this.f53593T0 = false;
        this.f53595U0 = new RectF();
        this.f53596V0 = null;
        this.f53598W0 = null;
        this.f53599X0 = new ArrayList<>();
        m68171c0(null);
    }

    /* renamed from: x0 */
    public static boolean m68132x0(float f, float f2, float f3) {
        if (f > 0.0f) {
            float f4 = f / f3;
            return f2 + ((f * f4) - (((f3 * f4) * f4) / 2.0f)) > 1.0f;
        }
        float f5 = (-f) / f3;
        return f2 + ((f * f5) + (((f3 * f5) * f5) / 2.0f)) < 0.0f;
    }

    /* renamed from: B */
    public void m68196B(float f) {
        C11488a c11488a = this.f53600b;
        if (c11488a == null) {
            return;
        }
        float f2 = this.f53614p;
        float f3 = this.f53613o;
        if (f2 != f3 && this.f53620s) {
            this.f53614p = f3;
        }
        float f4 = this.f53614p;
        if (f4 == f) {
            return;
        }
        this.f53558A = false;
        this.f53618r = f;
        this.f53612n = c11488a.m68044p() / 1000.0f;
        setProgress(this.f53618r);
        this.f53601c = null;
        this.f53602d = this.f53600b.m68041s();
        this.f53620s = false;
        this.f53611m = m68177W();
        this.f53622t = true;
        this.f53613o = f4;
        this.f53614p = f4;
        invalidate();
    }

    /* renamed from: C */
    public boolean m68195C(int i, OV2 ov2) {
        C11488a c11488a = this.f53600b;
        if (c11488a != null) {
            return c11488a.m68053g(i, ov2);
        }
        return false;
    }

    /* renamed from: D */
    public final boolean m68194D(View view, MotionEvent motionEvent, float f, float f2) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f, f2);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f, -f2);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f, f2);
        if (this.f53598W0 == null) {
            this.f53598W0 = new Matrix();
        }
        matrix.invert(this.f53598W0);
        obtain.transform(this.f53598W0);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    /* renamed from: E */
    public final void m68193E() {
        C11488a c11488a = this.f53600b;
        if (c11488a == null) {
            Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int m68083F = c11488a.m68083F();
        C11488a c11488a2 = this.f53600b;
        m68192F(m68083F, c11488a2.m68048l(c11488a2.m68083F()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<C11488a.C11490b> it = this.f53600b.m68045o().iterator();
        while (it.hasNext()) {
            C11488a.C11490b next = it.next();
            if (next == this.f53600b.f53690c) {
                Log.v("MotionLayout", "CHECK: CURRENT");
            }
            m68191H(next);
            int m68033A = next.m68033A();
            int m68001y = next.m68001y();
            String m107118c = FU0.m107118c(getContext(), m68033A);
            String m107118c2 = FU0.m107118c(getContext(), m68001y);
            if (sparseIntArray.get(m68033A) == m68001y) {
                Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + m107118c + "->" + m107118c2);
            }
            if (sparseIntArray2.get(m68001y) == m68033A) {
                Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + m107118c + "->" + m107118c2);
            }
            sparseIntArray.put(m68033A, m68001y);
            sparseIntArray2.put(m68001y, m68033A);
            if (this.f53600b.m68048l(m68033A) == null) {
                Log.e("MotionLayout", " no such constraintSetStart " + m107118c);
            }
            if (this.f53600b.m68048l(m68001y) == null) {
                Log.e("MotionLayout", " no such constraintSetEnd " + m107118c);
            }
        }
    }

    /* renamed from: F */
    public final void m68192F(int i, C11515b c11515b) {
        View childAt;
        String m107118c = FU0.m107118c(getContext(), i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int id = getChildAt(i2).getId();
            if (id == -1) {
                Log.w("MotionLayout", "CHECK: " + m107118c + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (c11515b.m67804x(id) == null) {
                Log.w("MotionLayout", "CHECK: " + m107118c + " NO CONSTRAINTS for " + FU0.m107117d(childAt));
            }
        }
        int[] m67802z = c11515b.m67802z();
        for (int i3 = 0; i3 < m67802z.length; i3++) {
            int i4 = m67802z[i3];
            String m107118c2 = FU0.m107118c(getContext(), i4);
            if (findViewById(m67802z[i3]) == null) {
                Log.w("MotionLayout", "CHECK: " + m107118c + " NO View matches id " + m107118c2);
            }
            if (c11515b.m67803y(i4) == -1) {
                Log.w("MotionLayout", "CHECK: " + m107118c + "(" + m107118c2 + ") no LAYOUT_HEIGHT");
            }
            if (c11515b.m67846D(i4) == -1) {
                Log.w("MotionLayout", "CHECK: " + m107118c + "(" + m107118c2 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    /* renamed from: H */
    public final void m68191H(C11488a.C11490b c11490b) {
        if (c11490b.m68033A() == c11490b.m68001y()) {
            Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
        }
    }

    /* renamed from: I */
    public final void m68190I() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            OV2 ov2 = this.f53610l.get(childAt);
            if (ov2 != null) {
                ov2.m92162E(childAt);
            }
        }
    }

    /* renamed from: J */
    public void m68189J(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            OV2 ov2 = this.f53610l.get(getChildAt(i));
            if (ov2 != null) {
                ov2.m92151f(z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016f  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m68188K(boolean z) {
        float f;
        boolean z2;
        boolean z3;
        int childCount;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i;
        boolean z4;
        int i2;
        if (this.f53616q == -1) {
            this.f53616q = m68177W();
        }
        float f2 = this.f53614p;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f53605g = -1;
        }
        boolean z5 = true;
        boolean z6 = false;
        if (this.f53588R || (this.f53622t && (z || this.f53618r != f2))) {
            float signum = Math.signum(this.f53618r - f2);
            long m68177W = m68177W();
            Interpolator interpolator3 = this.f53601c;
            if (!(interpolator3 instanceof WV2)) {
                f = ((((float) (m68177W - this.f53616q)) * signum) * 1.0E-9f) / this.f53612n;
            } else {
                f = 0.0f;
            }
            float f3 = this.f53614p + f;
            if (this.f53620s) {
                f3 = this.f53618r;
            }
            int i3 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i3 > 0 && f3 >= this.f53618r) || (signum <= 0.0f && f3 <= this.f53618r)) {
                f3 = this.f53618r;
                this.f53622t = false;
                z2 = true;
            } else {
                z2 = false;
            }
            this.f53614p = f3;
            this.f53613o = f3;
            this.f53616q = m68177W;
            if (interpolator3 != null && !z2) {
                if (this.f53558A) {
                    float interpolation2 = interpolator3.getInterpolation(((float) (m68177W - this.f53611m)) * 1.0E-9f);
                    Interpolator interpolator4 = this.f53601c;
                    UQ5 uq5 = this.f53560B;
                    if (interpolator4 == uq5) {
                        if (uq5.m81548c()) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                    } else {
                        z3 = false;
                    }
                    this.f53614p = interpolation2;
                    this.f53616q = m68177W;
                    Interpolator interpolator5 = this.f53601c;
                    if (interpolator5 instanceof WV2) {
                        float mo68129a = ((WV2) interpolator5).mo68129a();
                        this.f53603e = mo68129a;
                        if (Math.abs(mo68129a) * this.f53612n <= 1.0E-5f && z3) {
                            this.f53622t = false;
                        }
                        if (mo68129a > 0.0f && interpolation2 >= 1.0f) {
                            this.f53614p = 1.0f;
                            this.f53622t = false;
                            interpolation2 = 1.0f;
                        }
                        if (mo68129a < 0.0f && interpolation2 <= 0.0f) {
                            this.f53614p = 0.0f;
                            this.f53622t = false;
                            f3 = 0.0f;
                            if (Math.abs(this.f53603e) > 1.0E-5f) {
                                m68160i0(EnumC11487l.MOVING);
                            }
                            if (!z3) {
                                if ((i3 > 0 && f3 >= this.f53618r) || (signum <= 0.0f && f3 <= this.f53618r)) {
                                    f3 = this.f53618r;
                                    this.f53622t = false;
                                }
                                if (f3 >= 1.0f || f3 <= 0.0f) {
                                    this.f53622t = false;
                                    m68160i0(EnumC11487l.FINISHED);
                                }
                            }
                            childCount = getChildCount();
                            this.f53588R = false;
                            long m68177W2 = m68177W();
                            this.f53563C0 = f3;
                            interpolator = this.f53602d;
                            if (interpolator == null) {
                                interpolation = f3;
                            } else {
                                interpolation = interpolator.getInterpolation(f3);
                            }
                            interpolator2 = this.f53602d;
                            if (interpolator2 != null) {
                                float interpolation3 = interpolator2.getInterpolation((signum / this.f53612n) + f3);
                                this.f53603e = interpolation3;
                                this.f53603e = interpolation3 - this.f53602d.getInterpolation(f3);
                            }
                            for (i = 0; i < childCount; i++) {
                                View childAt = getChildAt(i);
                                OV2 ov2 = this.f53610l.get(childAt);
                                if (ov2 != null) {
                                    this.f53588R = ov2.m92133x(childAt, interpolation, m68177W2, this.f53565D0) | this.f53588R;
                                }
                            }
                            if ((i3 <= 0 && f3 >= this.f53618r) || (signum <= 0.0f && f3 <= this.f53618r)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!this.f53588R && !this.f53622t && z4) {
                                m68160i0(EnumC11487l.FINISHED);
                            }
                            if (this.f53627v0) {
                                requestLayout();
                            }
                            this.f53588R = (!z4) | this.f53588R;
                            if (f3 <= 0.0f && (i2 = this.f53604f) != -1 && this.f53605g != i2) {
                                this.f53605g = i2;
                                this.f53600b.m68048l(i2).m67821g(this);
                                m68160i0(EnumC11487l.FINISHED);
                                z6 = true;
                            }
                            if (f3 >= 1.0d) {
                                int i4 = this.f53605g;
                                int i5 = this.f53606h;
                                if (i4 != i5) {
                                    this.f53605g = i5;
                                    this.f53600b.m68048l(i5).m67821g(this);
                                    m68160i0(EnumC11487l.FINISHED);
                                    z6 = true;
                                }
                            }
                            if (this.f53588R && !this.f53622t) {
                                if ((i3 > 0 && f3 == 1.0f) || (signum < 0.0f && f3 == 0.0f)) {
                                    m68160i0(EnumC11487l.FINISHED);
                                }
                            } else {
                                invalidate();
                            }
                            if (!this.f53588R && !this.f53622t && ((i3 > 0 && f3 == 1.0f) || (signum < 0.0f && f3 == 0.0f))) {
                                m68166f0();
                            }
                        }
                    }
                    f3 = interpolation2;
                    if (Math.abs(this.f53603e) > 1.0E-5f) {
                    }
                    if (!z3) {
                    }
                    childCount = getChildCount();
                    this.f53588R = false;
                    long m68177W22 = m68177W();
                    this.f53563C0 = f3;
                    interpolator = this.f53602d;
                    if (interpolator == null) {
                    }
                    interpolator2 = this.f53602d;
                    if (interpolator2 != null) {
                    }
                    while (i < childCount) {
                    }
                    if (i3 <= 0) {
                    }
                    z4 = false;
                    if (!this.f53588R) {
                        m68160i0(EnumC11487l.FINISHED);
                    }
                    if (this.f53627v0) {
                    }
                    this.f53588R = (!z4) | this.f53588R;
                    if (f3 <= 0.0f) {
                        this.f53605g = i2;
                        this.f53600b.m68048l(i2).m67821g(this);
                        m68160i0(EnumC11487l.FINISHED);
                        z6 = true;
                    }
                    if (f3 >= 1.0d) {
                    }
                    if (this.f53588R) {
                    }
                    invalidate();
                    if (!this.f53588R) {
                        m68166f0();
                    }
                } else {
                    float interpolation4 = interpolator3.getInterpolation(f3);
                    Interpolator interpolator6 = this.f53601c;
                    if (interpolator6 instanceof WV2) {
                        this.f53603e = ((WV2) interpolator6).mo68129a();
                    } else {
                        this.f53603e = ((interpolator6.getInterpolation(f3 + f) - interpolation4) * signum) / f;
                    }
                    f3 = interpolation4;
                }
            } else {
                this.f53603e = f;
            }
            z3 = false;
            if (Math.abs(this.f53603e) > 1.0E-5f) {
            }
            if (!z3) {
            }
            childCount = getChildCount();
            this.f53588R = false;
            long m68177W222 = m68177W();
            this.f53563C0 = f3;
            interpolator = this.f53602d;
            if (interpolator == null) {
            }
            interpolator2 = this.f53602d;
            if (interpolator2 != null) {
            }
            while (i < childCount) {
            }
            if (i3 <= 0) {
            }
            z4 = false;
            if (!this.f53588R) {
            }
            if (this.f53627v0) {
            }
            this.f53588R = (!z4) | this.f53588R;
            if (f3 <= 0.0f) {
            }
            if (f3 >= 1.0d) {
            }
            if (this.f53588R) {
            }
            invalidate();
            if (!this.f53588R) {
            }
        }
        float f4 = this.f53614p;
        if (f4 >= 1.0f) {
            int i6 = this.f53605g;
            int i7 = this.f53606h;
            if (i6 == i7) {
                z5 = z6;
            }
            this.f53605g = i7;
        } else {
            if (f4 <= 0.0f) {
                int i8 = this.f53605g;
                int i9 = this.f53604f;
                if (i8 == i9) {
                    z5 = z6;
                }
                this.f53605g = i9;
            }
            this.f53593T0 |= z6;
            if (z6 && !this.f53567E0) {
                requestLayout();
            }
            this.f53613o = this.f53614p;
        }
        z6 = z5;
        this.f53593T0 |= z6;
        if (z6) {
            requestLayout();
        }
        this.f53613o = this.f53614p;
    }

    /* renamed from: L */
    public final void m68187L() {
        float f;
        boolean z;
        float signum = Math.signum(this.f53618r - this.f53614p);
        long m68177W = m68177W();
        Interpolator interpolator = this.f53601c;
        if (!(interpolator instanceof UQ5)) {
            f = ((((float) (m68177W - this.f53616q)) * signum) * 1.0E-9f) / this.f53612n;
        } else {
            f = 0.0f;
        }
        float f2 = this.f53614p + f;
        if (this.f53620s) {
            f2 = this.f53618r;
        }
        int i = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i > 0 && f2 >= this.f53618r) || (signum <= 0.0f && f2 <= this.f53618r)) {
            f2 = this.f53618r;
            z = true;
        } else {
            z = false;
        }
        if (interpolator != null && !z) {
            if (this.f53558A) {
                f2 = interpolator.getInterpolation(((float) (m68177W - this.f53611m)) * 1.0E-9f);
            } else {
                f2 = interpolator.getInterpolation(f2);
            }
        }
        if ((i > 0 && f2 >= this.f53618r) || (signum <= 0.0f && f2 <= this.f53618r)) {
            f2 = this.f53618r;
        }
        this.f53563C0 = f2;
        int childCount = getChildCount();
        long m68177W2 = m68177W();
        Interpolator interpolator2 = this.f53602d;
        if (interpolator2 != null) {
            f2 = interpolator2.getInterpolation(f2);
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            OV2 ov2 = this.f53610l.get(childAt);
            if (ov2 != null) {
                ov2.m92133x(childAt, f2, m68177W2, this.f53565D0);
            }
        }
        if (this.f53627v0) {
            requestLayout();
        }
    }

    /* renamed from: M */
    public final void m68186M() {
        CopyOnWriteArrayList<InterfaceC11486k> copyOnWriteArrayList;
        if ((this.f53626v != null || ((copyOnWriteArrayList = this.f53597W) != null && !copyOnWriteArrayList.isEmpty())) && this.f53623t0 != this.f53613o) {
            if (this.f53621s0 != -1) {
                InterfaceC11486k interfaceC11486k = this.f53626v;
                if (interfaceC11486k != null) {
                    interfaceC11486k.mo68091c(this, this.f53604f, this.f53606h);
                }
                CopyOnWriteArrayList<InterfaceC11486k> copyOnWriteArrayList2 = this.f53597W;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<InterfaceC11486k> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().mo68091c(this, this.f53604f, this.f53606h);
                    }
                }
                this.f53625u0 = true;
            }
            this.f53621s0 = -1;
            float f = this.f53613o;
            this.f53623t0 = f;
            InterfaceC11486k interfaceC11486k2 = this.f53626v;
            if (interfaceC11486k2 != null) {
                interfaceC11486k2.mo68093a(this, this.f53604f, this.f53606h, f);
            }
            CopyOnWriteArrayList<InterfaceC11486k> copyOnWriteArrayList3 = this.f53597W;
            if (copyOnWriteArrayList3 != null) {
                Iterator<InterfaceC11486k> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().mo68093a(this, this.f53604f, this.f53606h, this.f53613o);
                }
            }
            this.f53625u0 = true;
        }
    }

    /* renamed from: N */
    public void m68185N() {
        int i;
        CopyOnWriteArrayList<InterfaceC11486k> copyOnWriteArrayList;
        if ((this.f53626v != null || ((copyOnWriteArrayList = this.f53597W) != null && !copyOnWriteArrayList.isEmpty())) && this.f53621s0 == -1) {
            this.f53621s0 = this.f53605g;
            if (!this.f53599X0.isEmpty()) {
                ArrayList<Integer> arrayList = this.f53599X0;
                i = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i = -1;
            }
            int i2 = this.f53605g;
            if (i != i2 && i2 != -1) {
                this.f53599X0.add(Integer.valueOf(i2));
            }
        }
        m68164g0();
        Runnable runnable = this.f53571G0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f53573H0;
        if (iArr != null && this.f53575I0 > 0) {
            m68145q0(iArr[0]);
            int[] iArr2 = this.f53573H0;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.f53575I0--;
        }
    }

    /* renamed from: O */
    public void m68184O(int i, boolean z, float f) {
        InterfaceC11486k interfaceC11486k = this.f53626v;
        if (interfaceC11486k != null) {
            interfaceC11486k.mo68090d(this, i, z, f);
        }
        CopyOnWriteArrayList<InterfaceC11486k> copyOnWriteArrayList = this.f53597W;
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC11486k> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().mo68090d(this, i, z, f);
            }
        }
    }

    /* renamed from: P */
    public void m68183P(int i, float f, float f2, float f3, float[] fArr) {
        String resourceName;
        HashMap<View, OV2> hashMap = this.f53610l;
        View viewById = getViewById(i);
        OV2 ov2 = hashMap.get(viewById);
        if (ov2 != null) {
            ov2.m92145l(f, f2, f3, fArr);
            float y = viewById.getY();
            this.f53628w = f;
            this.f53630x = y;
            return;
        }
        if (viewById == null) {
            resourceName = "" + i;
        } else {
            resourceName = viewById.getContext().getResources().getResourceName(i);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + resourceName);
    }

    /* renamed from: Q */
    public C11515b m68182Q(int i) {
        C11488a c11488a = this.f53600b;
        if (c11488a == null) {
            return null;
        }
        return c11488a.m68048l(i);
    }

    /* renamed from: R */
    public int[] m68181R() {
        C11488a c11488a = this.f53600b;
        if (c11488a == null) {
            return null;
        }
        return c11488a.m68046n();
    }

    /* renamed from: S */
    public int m68180S() {
        return this.f53605g;
    }

    /* renamed from: U */
    public int m68179U() {
        return this.f53606h;
    }

    /* renamed from: V */
    public OV2 m68178V(int i) {
        return this.f53610l.get(findViewById(i));
    }

    /* renamed from: W */
    public long m68177W() {
        return System.nanoTime();
    }

    /* renamed from: X */
    public float m68176X() {
        return this.f53614p;
    }

    /* renamed from: Y */
    public int m68175Y() {
        return this.f53604f;
    }

    /* renamed from: Z */
    public C11488a.C11490b m68174Z(int i) {
        return this.f53600b.m68082G(i);
    }

    /* renamed from: a0 */
    public void m68173a0(View view, float f, float f2, float[] fArr, int i) {
        float f3;
        float f4 = this.f53603e;
        float f5 = this.f53614p;
        if (this.f53601c != null) {
            float signum = Math.signum(this.f53618r - f5);
            float interpolation = this.f53601c.getInterpolation(this.f53614p + 1.0E-5f);
            f3 = this.f53601c.getInterpolation(this.f53614p);
            f4 = (signum * ((interpolation - f3) / 1.0E-5f)) / this.f53612n;
        } else {
            f3 = f5;
        }
        Interpolator interpolator = this.f53601c;
        if (interpolator instanceof WV2) {
            f4 = ((WV2) interpolator).mo68129a();
        }
        OV2 ov2 = this.f53610l.get(view);
        if ((i & 1) == 0) {
            ov2.m92139r(f3, view.getWidth(), view.getHeight(), f, f2, fArr);
        } else {
            ov2.m92145l(f3, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * f4;
            fArr[1] = fArr[1] * f4;
        }
    }

    /* renamed from: b0 */
    public final boolean m68172b0(float f, float f2, View view, MotionEvent motionEvent) {
        boolean z;
        View childAt;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (m68172b0((childAt.getLeft() + f) - view.getScrollX(), (childAt.getTop() + f2) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            this.f53595U0.set(f, f2, (view.getRight() + f) - view.getLeft(), (view.getBottom() + f2) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.f53595U0.contains(motionEvent.getX(), motionEvent.getY())) && m68194D(view, motionEvent, -f, -f2)) {
                return true;
            }
        }
        return z;
    }

    /* renamed from: c0 */
    public final void m68171c0(AttributeSet attributeSet) {
        C11488a c11488a;
        int i;
        f53557Y0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39341cm4.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == C39341cm4.MotionLayout_layoutDescription) {
                    this.f53600b = new C11488a(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == C39341cm4.MotionLayout_currentState) {
                    this.f53605g = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == C39341cm4.MotionLayout_motionProgress) {
                    this.f53618r = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f53622t = true;
                } else if (index == C39341cm4.MotionLayout_applyMotionScene) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == C39341cm4.MotionLayout_showPaths) {
                    if (this.f53632y == 0) {
                        if (obtainStyledAttributes.getBoolean(index, false)) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        this.f53632y = i;
                    }
                } else if (index == C39341cm4.MotionLayout_motionDebug) {
                    this.f53632y = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.f53600b == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.f53600b = null;
            }
        }
        if (this.f53632y != 0) {
            m68193E();
        }
        if (this.f53605g == -1 && (c11488a = this.f53600b) != null) {
            this.f53605g = c11488a.m68083F();
            this.f53604f = this.f53600b.m68083F();
            this.f53606h = this.f53600b.m68043q();
        }
    }

    /* renamed from: d0 */
    public boolean m68170d0() {
        return this.f53609k;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        String m107116e;
        long j;
        C11498d c11498d;
        ArrayList<MotionHelper> arrayList = this.f53594U;
        if (arrayList != null) {
            Iterator<MotionHelper> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().m68199H(canvas);
            }
        }
        m68188K(false);
        C11488a c11488a = this.f53600b;
        if (c11488a != null && (c11498d = c11488a.f53706s) != null) {
            c11498d.m67948c();
        }
        super.dispatchDraw(canvas);
        if (this.f53600b == null) {
            return;
        }
        if ((this.f53632y & 1) == 1 && !isInEditMode()) {
            this.f53615p0++;
            long m68177W = m68177W();
            long j2 = this.f53617q0;
            if (j2 != -1) {
                if (m68177W - j2 > 200000000) {
                    this.f53619r0 = ((int) ((this.f53615p0 / (((float) j) * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f53615p0 = 0;
                    this.f53617q0 = m68177W;
                }
            } else {
                this.f53617q0 = m68177W;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f53619r0 + " fps " + FU0.m107116e(this, this.f53604f) + " -> ");
            sb.append(FU0.m107116e(this, this.f53606h));
            sb.append(" (progress: ");
            sb.append(((int) (m68176X() * 1000.0f)) / 10.0f);
            sb.append(" ) state=");
            int i = this.f53605g;
            if (i == -1) {
                m107116e = "undefined";
            } else {
                m107116e = FU0.m107116e(this, i);
            }
            sb.append(m107116e);
            String sb2 = sb.toString();
            paint.setColor(-16777216);
            canvas.drawText(sb2, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(sb2, 10.0f, getHeight() - 30, paint);
        }
        if (this.f53632y > 1) {
            if (this.f53634z == null) {
                this.f53634z = new C11481f();
            }
            this.f53634z.m68127a(canvas, this.f53610l, this.f53600b.m68044p(), this.f53632y);
        }
        ArrayList<MotionHelper> arrayList2 = this.f53594U;
        if (arrayList2 != null) {
            Iterator<MotionHelper> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().m68200G(canvas);
            }
        }
    }

    /* renamed from: e0 */
    public InterfaceC11483h m68168e0() {
        return C11484i.m68100f();
    }

    /* renamed from: f0 */
    public void m68166f0() {
        C11488a c11488a = this.f53600b;
        if (c11488a == null) {
            return;
        }
        if (c11488a.m68052h(this, this.f53605g)) {
            requestLayout();
            return;
        }
        int i = this.f53605g;
        if (i != -1) {
            this.f53600b.m68054f(this, i);
        }
        if (this.f53600b.m68059b0()) {
            this.f53600b.m68063Z();
        }
    }

    /* renamed from: g0 */
    public final void m68164g0() {
        CopyOnWriteArrayList<InterfaceC11486k> copyOnWriteArrayList;
        if (this.f53626v == null && ((copyOnWriteArrayList = this.f53597W) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.f53625u0 = false;
        Iterator<Integer> it = this.f53599X0.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            InterfaceC11486k interfaceC11486k = this.f53626v;
            if (interfaceC11486k != null) {
                interfaceC11486k.mo68092b(this, next.intValue());
            }
            CopyOnWriteArrayList<InterfaceC11486k> copyOnWriteArrayList2 = this.f53597W;
            if (copyOnWriteArrayList2 != null) {
                Iterator<InterfaceC11486k> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().mo68092b(this, next.intValue());
                }
            }
        }
        this.f53599X0.clear();
    }

    /* renamed from: h0 */
    public void m68162h0() {
        this.f53591S0.m68108h();
        invalidate();
    }

    /* renamed from: i0 */
    public void m68160i0(EnumC11487l enumC11487l) {
        EnumC11487l enumC11487l2 = EnumC11487l.FINISHED;
        if (enumC11487l == enumC11487l2 && this.f53605g == -1) {
            return;
        }
        EnumC11487l enumC11487l3 = this.f53589R0;
        this.f53589R0 = enumC11487l;
        EnumC11487l enumC11487l4 = EnumC11487l.MOVING;
        if (enumC11487l3 == enumC11487l4 && enumC11487l == enumC11487l4) {
            m68186M();
        }
        int i = C11479d.f53639a[enumC11487l3.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 && enumC11487l == enumC11487l2) {
                m68185N();
                return;
            }
            return;
        }
        if (enumC11487l == enumC11487l4) {
            m68186M();
        }
        if (enumC11487l == enumC11487l2) {
            m68185N();
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    /* renamed from: j0 */
    public void m68158j0(C11488a.C11490b c11490b) {
        long m68177W;
        this.f53600b.m68064Y(c11490b);
        m68160i0(EnumC11487l.SETUP);
        if (this.f53605g == this.f53600b.m68043q()) {
            this.f53614p = 1.0f;
            this.f53613o = 1.0f;
            this.f53618r = 1.0f;
        } else {
            this.f53614p = 0.0f;
            this.f53613o = 0.0f;
            this.f53618r = 0.0f;
        }
        if (c11490b.m68030D(1)) {
            m68177W = -1;
        } else {
            m68177W = m68177W();
        }
        this.f53616q = m68177W;
        int m68083F = this.f53600b.m68083F();
        int m68043q = this.f53600b.m68043q();
        if (m68083F == this.f53604f && m68043q == this.f53606h) {
            return;
        }
        this.f53604f = m68083F;
        this.f53606h = m68043q;
        this.f53600b.m68065X(m68083F, m68043q);
        this.f53591S0.m68111e(this.mLayoutWidget, this.f53600b.m68048l(this.f53604f), this.f53600b.m68048l(this.f53606h));
        this.f53591S0.m68107i(this.f53604f, this.f53606h);
        this.f53591S0.m68108h();
        m68162h0();
    }

    /* renamed from: k0 */
    public final void m68156k0() {
        boolean z;
        float f;
        float f2;
        int childCount = getChildCount();
        this.f53591S0.m68115a();
        boolean z2 = true;
        this.f53622t = true;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            sparseArray.put(childAt.getId(), this.f53610l.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int m68050j = this.f53600b.m68050j();
        if (m68050j != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                OV2 ov2 = this.f53610l.get(getChildAt(i3));
                if (ov2 != null) {
                    ov2.m92163D(m68050j);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.f53610l.size()];
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            OV2 ov22 = this.f53610l.get(getChildAt(i5));
            if (ov22.m92149h() != -1) {
                sparseBooleanArray.put(ov22.m92149h(), true);
                iArr[i4] = ov22.m92149h();
                i4++;
            }
        }
        if (this.f53594U != null) {
            for (int i6 = 0; i6 < i4; i6++) {
                OV2 ov23 = this.f53610l.get(findViewById(iArr[i6]));
                if (ov23 != null) {
                    this.f53600b.m68040t(ov23);
                }
            }
            Iterator<MotionHelper> it = this.f53594U.iterator();
            while (it.hasNext()) {
                it.next().mo68198I(this, this.f53610l);
            }
            for (int i7 = 0; i7 < i4; i7++) {
                OV2 ov24 = this.f53610l.get(findViewById(iArr[i7]));
                if (ov24 != null) {
                    ov24.m92158I(width, height, this.f53612n, m68177W());
                }
            }
        } else {
            for (int i8 = 0; i8 < i4; i8++) {
                OV2 ov25 = this.f53610l.get(findViewById(iArr[i8]));
                if (ov25 != null) {
                    this.f53600b.m68040t(ov25);
                    ov25.m92158I(width, height, this.f53612n, m68177W());
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            OV2 ov26 = this.f53610l.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && ov26 != null) {
                this.f53600b.m68040t(ov26);
                ov26.m92158I(width, height, this.f53612n, m68177W());
            }
        }
        float m68084E = this.f53600b.m68084E();
        if (m68084E != 0.0f) {
            if (m68084E < 0.0d) {
                z = true;
            } else {
                z = false;
            }
            float abs = Math.abs(m68084E);
            float f3 = -3.4028235E38f;
            float f4 = Float.MAX_VALUE;
            int i10 = 0;
            float f5 = -3.4028235E38f;
            float f6 = Float.MAX_VALUE;
            while (true) {
                if (i10 < childCount) {
                    OV2 ov27 = this.f53610l.get(getChildAt(i10));
                    if (!Float.isNaN(ov27.f26694m)) {
                        break;
                    }
                    float m92143n = ov27.m92143n();
                    float m92142o = ov27.m92142o();
                    if (z) {
                        f2 = m92142o - m92143n;
                    } else {
                        f2 = m92142o + m92143n;
                    }
                    f6 = Math.min(f6, f2);
                    f5 = Math.max(f5, f2);
                    i10++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                for (int i11 = 0; i11 < childCount; i11++) {
                    OV2 ov28 = this.f53610l.get(getChildAt(i11));
                    if (!Float.isNaN(ov28.f26694m)) {
                        f4 = Math.min(f4, ov28.f26694m);
                        f3 = Math.max(f3, ov28.f26694m);
                    }
                }
                while (i < childCount) {
                    OV2 ov29 = this.f53610l.get(getChildAt(i));
                    if (!Float.isNaN(ov29.f26694m)) {
                        ov29.f26696o = 1.0f / (1.0f - abs);
                        if (z) {
                            ov29.f26695n = abs - (((f3 - ov29.f26694m) / (f3 - f4)) * abs);
                        } else {
                            ov29.f26695n = abs - (((ov29.f26694m - f4) * abs) / (f3 - f4));
                        }
                    }
                    i++;
                }
                return;
            }
            while (i < childCount) {
                OV2 ov210 = this.f53610l.get(getChildAt(i));
                float m92143n2 = ov210.m92143n();
                float m92142o2 = ov210.m92142o();
                if (z) {
                    f = m92142o2 - m92143n2;
                } else {
                    f = m92142o2 + m92143n2;
                }
                ov210.f26696o = 1.0f / (1.0f - abs);
                ov210.f26695n = abs - (((f - f6) * abs) / (f5 - f6));
                i++;
            }
        }
    }

    /* renamed from: l0 */
    public final Rect m68154l0(C43042iz0 c43042iz0) {
        this.f53585P0.top = c43042iz0.m31387a0();
        this.f53585P0.left = c43042iz0.m31389Z();
        Rect rect = this.f53585P0;
        int m31391Y = c43042iz0.m31391Y();
        Rect rect2 = this.f53585P0;
        rect.right = m31391Y + rect2.left;
        int m31328z = c43042iz0.m31328z();
        Rect rect3 = this.f53585P0;
        rect2.bottom = m31328z + rect3.top;
        return rect3;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i) {
        int rotation;
        C11488a.C11490b c11490b;
        if (i != 0) {
            try {
                C11488a c11488a = new C11488a(getContext(), this, i);
                this.f53600b = c11488a;
                if (this.f53605g == -1) {
                    this.f53605g = c11488a.m68083F();
                    this.f53604f = this.f53600b.m68083F();
                    this.f53606h = this.f53600b.m68043q();
                }
                if (isAttachedToWindow()) {
                    try {
                        Display display = getDisplay();
                        if (display == null) {
                            rotation = 0;
                        } else {
                            rotation = display.getRotation();
                        }
                        this.f53583O0 = rotation;
                        C11488a c11488a2 = this.f53600b;
                        if (c11488a2 != null) {
                            C11515b m68048l = c11488a2.m68048l(this.f53605g);
                            this.f53600b.m68069T(this);
                            ArrayList<MotionHelper> arrayList = this.f53594U;
                            if (arrayList != null) {
                                Iterator<MotionHelper> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    it.next().m68201F(this);
                                }
                            }
                            if (m68048l != null) {
                                m68048l.m67819i(this);
                            }
                            this.f53604f = this.f53605g;
                        }
                        m68166f0();
                        C11485j c11485j = this.f53569F0;
                        if (c11485j != null) {
                            if (this.f53587Q0) {
                                post(new RunnableC11476a());
                                return;
                            } else {
                                c11485j.m68099a();
                                return;
                            }
                        }
                        C11488a c11488a3 = this.f53600b;
                        if (c11488a3 != null && (c11490b = c11488a3.f53690c) != null && c11490b.m68002x() == 4) {
                            m68150n0();
                            m68160i0(EnumC11487l.SETUP);
                            m68160i0(EnumC11487l.MOVING);
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        throw new IllegalArgumentException("unable to parse MotionScene file", e);
                    }
                }
                this.f53600b = null;
                return;
            } catch (Exception e2) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e2);
            }
        }
        this.f53600b = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r10 != 7) goto L18;
     */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m68152m0(int i, float f, float f2) {
        if (this.f53600b == null || this.f53614p == f) {
            return;
        }
        this.f53558A = true;
        this.f53611m = m68177W();
        this.f53612n = this.f53600b.m68044p() / 1000.0f;
        this.f53618r = f;
        this.f53622t = true;
        if (i != 0 && i != 1 && i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                    }
                } else if (m68132x0(f2, this.f53614p, this.f53600b.m68039u())) {
                    this.f53562C.m68128b(f2, this.f53614p, this.f53600b.m68039u());
                    this.f53601c = this.f53562C;
                } else {
                    this.f53560B.m81549b(this.f53614p, f, f2, this.f53612n, this.f53600b.m68039u(), this.f53600b.m68038v());
                    this.f53603e = 0.0f;
                    int i2 = this.f53605g;
                    this.f53618r = f;
                    this.f53605g = i2;
                    this.f53601c = this.f53560B;
                }
            } else {
                this.f53562C.m68128b(f2, this.f53614p, this.f53600b.m68039u());
                this.f53601c = this.f53562C;
            }
            this.f53620s = false;
            this.f53611m = m68177W();
            invalidate();
        }
        if (i != 1 && i != 7) {
            if (i == 2 || i == 6) {
                f = 1.0f;
            }
        } else {
            f = 0.0f;
        }
        if (this.f53600b.m68049k() == 0) {
            this.f53560B.m81549b(this.f53614p, f, f2, this.f53612n, this.f53600b.m68039u(), this.f53600b.m68038v());
        } else {
            this.f53560B.m81547d(this.f53614p, f, f2, this.f53600b.m68087B(), this.f53600b.m68086C(), this.f53600b.m68088A(), this.f53600b.m68085D(), this.f53600b.m68034z());
        }
        int i3 = this.f53605g;
        this.f53618r = f;
        this.f53605g = i3;
        this.f53601c = this.f53560B;
        this.f53620s = false;
        this.f53611m = m68177W();
        invalidate();
    }

    /* renamed from: n0 */
    public void m68150n0() {
        m68196B(1.0f);
        this.f53571G0 = null;
    }

    /* renamed from: o0 */
    public void m68148o0(Runnable runnable) {
        m68196B(1.0f);
        this.f53571G0 = runnable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        C11488a.C11490b c11490b;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f53583O0 = display.getRotation();
        }
        C11488a c11488a = this.f53600b;
        if (c11488a != null && (i = this.f53605g) != -1) {
            C11515b m68048l = c11488a.m68048l(i);
            this.f53600b.m68069T(this);
            ArrayList<MotionHelper> arrayList = this.f53594U;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().m68201F(this);
                }
            }
            if (m68048l != null) {
                m68048l.m67819i(this);
            }
            this.f53604f = this.f53605g;
        }
        m68166f0();
        C11485j c11485j = this.f53569F0;
        if (c11485j != null) {
            if (this.f53587Q0) {
                post(new RunnableC11478c());
                return;
            } else {
                c11485j.m68099a();
                return;
            }
        }
        C11488a c11488a2 = this.f53600b;
        if (c11488a2 != null && (c11490b = c11488a2.f53690c) != null && c11490b.m68002x() == 4) {
            m68150n0();
            m68160i0(EnumC11487l.SETUP);
            m68160i0(EnumC11487l.MOVING);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C11492b m68032B;
        int m67979q;
        RectF m67980p;
        C11488a c11488a = this.f53600b;
        if (c11488a != null && this.f53609k) {
            C11498d c11498d = c11488a.f53706s;
            if (c11498d != null) {
                c11498d.m67943h(motionEvent);
            }
            C11488a.C11490b c11490b = this.f53600b.f53690c;
            if (c11490b != null && c11490b.m68031C() && (m68032B = c11490b.m68032B()) != null && ((motionEvent.getAction() != 0 || (m67980p = m68032B.m67980p(this, new RectF())) == null || m67980p.contains(motionEvent.getX(), motionEvent.getY())) && (m67979q = m68032B.m67979q()) != -1)) {
                View view = this.f53596V0;
                if (view == null || view.getId() != m67979q) {
                    this.f53596V0 = findViewById(m67979q);
                }
                View view2 = this.f53596V0;
                if (view2 != null) {
                    this.f53595U0.set(view2.getLeft(), this.f53596V0.getTop(), this.f53596V0.getRight(), this.f53596V0.getBottom());
                    if (this.f53595U0.contains(motionEvent.getX(), motionEvent.getY()) && !m68172b0(this.f53596V0.getLeft(), this.f53596V0.getTop(), this.f53596V0, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f53567E0 = true;
        try {
            if (this.f53600b == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.f53570G != i5 || this.f53572H != i6) {
                m68162h0();
                m68188K(true);
            }
            this.f53570G = i5;
            this.f53572H = i6;
            this.f53566E = i5;
            this.f53568F = i6;
        } finally {
            this.f53567E0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        if (this.f53600b == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = false;
        if (this.f53607i == i && this.f53608j == i2) {
            z = false;
        } else {
            z = true;
        }
        if (this.f53593T0) {
            this.f53593T0 = false;
            m68166f0();
            m68164g0();
            z = true;
        }
        if (this.mDirtyHierarchy) {
            z = true;
        }
        this.f53607i = i;
        this.f53608j = i2;
        int m68083F = this.f53600b.m68083F();
        int m68043q = this.f53600b.m68043q();
        if ((z || this.f53591S0.m68110f(m68083F, m68043q)) && this.f53604f != -1) {
            super.onMeasure(i, i2);
            this.f53591S0.m68111e(this.mLayoutWidget, this.f53600b.m68048l(m68083F), this.f53600b.m68048l(m68043q));
            this.f53591S0.m68108h();
            this.f53591S0.m68107i(m68083F, m68043q);
        } else {
            if (z) {
                super.onMeasure(i, i2);
            }
            z2 = true;
        }
        if (this.f53627v0 || z2) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int m31391Y = this.mLayoutWidget.m31391Y() + getPaddingLeft() + getPaddingRight();
            int m31328z = this.mLayoutWidget.m31328z() + paddingTop;
            int i5 = this.f53559A0;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                m31391Y = (int) (this.f53629w0 + (this.f53563C0 * (this.f53633y0 - i3)));
                requestLayout();
            }
            int i6 = this.f53561B0;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                m31328z = (int) (this.f53631x0 + (this.f53563C0 * (this.f53635z0 - i4)));
                requestLayout();
            }
            setMeasuredDimension(m31391Y, m31328z);
        }
        m68187L();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // p000.K43
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        C11488a.C11490b c11490b;
        C11492b m68032B;
        int m67979q;
        C11488a c11488a = this.f53600b;
        if (c11488a != null && (c11490b = c11488a.f53690c) != null && c11490b.m68031C()) {
            int i4 = -1;
            if (c11490b.m68031C() && (m68032B = c11490b.m68032B()) != null && (m67979q = m68032B.m67979q()) != -1 && view.getId() != m67979q) {
                return;
            }
            if (c11488a.m68037w()) {
                C11492b m68032B2 = c11490b.m68032B();
                if (m68032B2 != null && (m68032B2.m67991e() & 4) != 0) {
                    i4 = i2;
                }
                float f = this.f53613o;
                if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(i4)) {
                    return;
                }
            }
            if (c11490b.m68032B() != null && (c11490b.m68032B().m67991e() & 1) != 0) {
                float m68036x = c11488a.m68036x(i, i2);
                float f2 = this.f53614p;
                if ((f2 <= 0.0f && m68036x < 0.0f) || (f2 >= 1.0f && m68036x > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new RunnableC11477b(this, view));
                    return;
                }
            }
            float f3 = this.f53613o;
            long m68177W = m68177W();
            float f4 = i;
            this.f53576J = f4;
            float f5 = i2;
            this.f53578K = f5;
            this.f53586Q = (float) ((m68177W - this.f53584P) * 1.0E-9d);
            this.f53584P = m68177W;
            c11488a.m68073P(f4, f5);
            if (f3 != this.f53613o) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            m68188K(false);
            if (iArr[0] != 0 || iArr[1] != 0) {
                this.f53574I = true;
            }
        }
    }

    @Override // p000.K43
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // p000.K43
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.f53584P = m68177W();
        this.f53586Q = 0.0f;
        this.f53576J = 0.0f;
        this.f53578K = 0.0f;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        C11488a c11488a = this.f53600b;
        if (c11488a != null) {
            c11488a.m68066W(isRtl());
        }
    }

    @Override // p000.K43
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        C11488a.C11490b c11490b;
        C11488a c11488a = this.f53600b;
        if (c11488a != null && (c11490b = c11488a.f53690c) != null && c11490b.m68032B() != null && (this.f53600b.f53690c.m68032B().m67991e() & 2) == 0) {
            return true;
        }
        return false;
    }

    @Override // p000.K43
    public void onStopNestedScroll(View view, int i) {
        C11488a c11488a = this.f53600b;
        if (c11488a != null) {
            float f = this.f53586Q;
            if (f != 0.0f) {
                c11488a.m68072Q(this.f53576J / f, this.f53578K / f);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C11488a c11488a = this.f53600b;
        if (c11488a != null && this.f53609k && c11488a.m68059b0()) {
            C11488a.C11490b c11490b = this.f53600b.f53690c;
            if (c11490b != null && !c11490b.m68031C()) {
                return super.onTouchEvent(motionEvent);
            }
            this.f53600b.m68071R(motionEvent, m68180S(), this);
            if (this.f53600b.f53690c.m68030D(4)) {
                return this.f53600b.f53690c.m68032B().m67978r();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f53597W == null) {
                this.f53597W = new CopyOnWriteArrayList<>();
            }
            this.f53597W.add(motionHelper);
            if (motionHelper.m68202E()) {
                if (this.f53590S == null) {
                    this.f53590S = new ArrayList<>();
                }
                this.f53590S.add(motionHelper);
            }
            if (motionHelper.m68203D()) {
                if (this.f53592T == null) {
                    this.f53592T = new ArrayList<>();
                }
                this.f53592T.add(motionHelper);
            }
            if (motionHelper.mo68204C()) {
                if (this.f53594U == null) {
                    this.f53594U = new ArrayList<>();
                }
                this.f53594U.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f53590S;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f53592T;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    /* renamed from: p0 */
    public void m68146p0() {
        m68196B(0.0f);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    /* renamed from: q0 */
    public void m68145q0(int i) {
        if (!isAttachedToWindow()) {
            if (this.f53569F0 == null) {
                this.f53569F0 = new C11485j();
            }
            this.f53569F0.m68098b(i);
            return;
        }
        m68143r0(i, -1, -1);
    }

    /* renamed from: r0 */
    public void m68143r0(int i, int i2, int i3) {
        m68141s0(i, i2, i3, -1);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        C11488a c11488a;
        C11488a.C11490b c11490b;
        if (!this.f53627v0 && this.f53605g == -1 && (c11488a = this.f53600b) != null && (c11490b = c11488a.f53690c) != null) {
            int m68000z = c11490b.m68000z();
            if (m68000z == 0) {
                return;
            }
            if (m68000z == 2) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    this.f53610l.get(getChildAt(i)).m92131z();
                }
                return;
            }
        }
        super.requestLayout();
    }

    /* renamed from: s0 */
    public void m68141s0(int i, int i2, int i3, int i4) {
        JP5 jp5;
        int m100509a;
        C11488a c11488a = this.f53600b;
        if (c11488a != null && (jp5 = c11488a.f53689b) != null && (m100509a = jp5.m100509a(this.f53605g, i, i2, i3)) != -1) {
            i = m100509a;
        }
        int i5 = this.f53605g;
        if (i5 == i) {
            return;
        }
        if (this.f53604f == i) {
            m68196B(0.0f);
            if (i4 > 0) {
                this.f53612n = i4 / 1000.0f;
            }
        } else if (this.f53606h == i) {
            m68196B(1.0f);
            if (i4 > 0) {
                this.f53612n = i4 / 1000.0f;
            }
        } else {
            this.f53606h = i;
            if (i5 != -1) {
                setTransition(i5, i);
                m68196B(1.0f);
                this.f53614p = 0.0f;
                m68150n0();
                if (i4 > 0) {
                    this.f53612n = i4 / 1000.0f;
                    return;
                }
                return;
            }
            this.f53558A = false;
            this.f53618r = 1.0f;
            this.f53613o = 0.0f;
            this.f53614p = 0.0f;
            this.f53616q = m68177W();
            this.f53611m = m68177W();
            this.f53620s = false;
            this.f53601c = null;
            if (i4 == -1) {
                this.f53612n = this.f53600b.m68044p() / 1000.0f;
            }
            this.f53604f = -1;
            this.f53600b.m68065X(-1, this.f53606h);
            SparseArray sparseArray = new SparseArray();
            if (i4 == 0) {
                this.f53612n = this.f53600b.m68044p() / 1000.0f;
            } else if (i4 > 0) {
                this.f53612n = i4 / 1000.0f;
            }
            int childCount = getChildCount();
            this.f53610l.clear();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                this.f53610l.put(childAt, new OV2(childAt));
                sparseArray.put(childAt.getId(), this.f53610l.get(childAt));
            }
            this.f53622t = true;
            this.f53591S0.m68111e(this.mLayoutWidget, null, this.f53600b.m68048l(i));
            m68162h0();
            this.f53591S0.m68115a();
            m68190I();
            int width = getWidth();
            int height = getHeight();
            if (this.f53594U != null) {
                for (int i7 = 0; i7 < childCount; i7++) {
                    OV2 ov2 = this.f53610l.get(getChildAt(i7));
                    if (ov2 != null) {
                        this.f53600b.m68040t(ov2);
                    }
                }
                Iterator<MotionHelper> it = this.f53594U.iterator();
                while (it.hasNext()) {
                    it.next().mo68198I(this, this.f53610l);
                }
                for (int i8 = 0; i8 < childCount; i8++) {
                    OV2 ov22 = this.f53610l.get(getChildAt(i8));
                    if (ov22 != null) {
                        ov22.m92158I(width, height, this.f53612n, m68177W());
                    }
                }
            } else {
                for (int i9 = 0; i9 < childCount; i9++) {
                    OV2 ov23 = this.f53610l.get(getChildAt(i9));
                    if (ov23 != null) {
                        this.f53600b.m68040t(ov23);
                        ov23.m92158I(width, height, this.f53612n, m68177W());
                    }
                }
            }
            float m68084E = this.f53600b.m68084E();
            if (m68084E != 0.0f) {
                float f = Float.MAX_VALUE;
                float f2 = -3.4028235E38f;
                for (int i10 = 0; i10 < childCount; i10++) {
                    OV2 ov24 = this.f53610l.get(getChildAt(i10));
                    float m92142o = ov24.m92142o() + ov24.m92143n();
                    f = Math.min(f, m92142o);
                    f2 = Math.max(f2, m92142o);
                }
                for (int i11 = 0; i11 < childCount; i11++) {
                    OV2 ov25 = this.f53610l.get(getChildAt(i11));
                    float m92143n = ov25.m92143n();
                    float m92142o2 = ov25.m92142o();
                    ov25.f26696o = 1.0f / (1.0f - m68084E);
                    ov25.f26695n = m68084E - ((((m92143n + m92142o2) - f) * m68084E) / (f2 - f));
                }
            }
            this.f53613o = 0.0f;
            this.f53614p = 0.0f;
            this.f53622t = true;
            invalidate();
        }
    }

    public void setDebugMode(int i) {
        this.f53632y = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.f53587Q0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.f53609k = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.f53600b != null) {
            m68160i0(EnumC11487l.MOVING);
            Interpolator m68041s = this.f53600b.m68041s();
            if (m68041s != null) {
                setProgress(m68041s.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.f53592T;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f53592T.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.f53590S;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f53590S.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.f53569F0 == null) {
                this.f53569F0 = new C11485j();
            }
            this.f53569F0.m68097c(f);
            this.f53569F0.m68094f(f2);
            return;
        }
        setProgress(f);
        m68160i0(EnumC11487l.MOVING);
        this.f53603e = f2;
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i != 0) {
            m68196B(i > 0 ? 1.0f : 0.0f);
        } else if (f == 0.0f || f == 1.0f) {
        } else {
            m68196B(f > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void setScene(C11488a c11488a) {
        this.f53600b = c11488a;
        c11488a.m68066W(isRtl());
        m68162h0();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i, int i2, int i3) {
        m68160i0(EnumC11487l.SETUP);
        this.f53605g = i;
        this.f53604f = -1;
        this.f53606h = -1;
        C38281az0 c38281az0 = this.mConstraintLayoutSpec;
        if (c38281az0 != null) {
            c38281az0.m65182d(i, i2, i3);
            return;
        }
        C11488a c11488a = this.f53600b;
        if (c11488a != null) {
            c11488a.m68048l(i).m67819i(this);
        }
    }

    public void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f53569F0 == null) {
                this.f53569F0 = new C11485j();
            }
            this.f53569F0.m68096d(i);
            this.f53569F0.m68098b(i2);
            return;
        }
        C11488a c11488a = this.f53600b;
        if (c11488a != null) {
            this.f53604f = i;
            this.f53606h = i2;
            c11488a.m68065X(i, i2);
            this.f53591S0.m68111e(this.mLayoutWidget, this.f53600b.m68048l(i), this.f53600b.m68048l(i2));
            m68162h0();
            this.f53614p = 0.0f;
            m68146p0();
        }
    }

    public void setTransitionDuration(int i) {
        C11488a c11488a = this.f53600b;
        if (c11488a == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            c11488a.m68067V(i);
        }
    }

    public void setTransitionListener(InterfaceC11486k interfaceC11486k) {
        this.f53626v = interfaceC11486k;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f53569F0 == null) {
            this.f53569F0 = new C11485j();
        }
        this.f53569F0.m68095e(bundle);
        if (isAttachedToWindow()) {
            this.f53569F0.m68099a();
        }
    }

    /* renamed from: t0 */
    public void m68139t0() {
        this.f53591S0.m68111e(this.mLayoutWidget, this.f53600b.m68048l(this.f53604f), this.f53600b.m68048l(this.f53606h));
        m68162h0();
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return FU0.m107118c(context, this.f53604f) + "->" + FU0.m107118c(context, this.f53606h) + " (pos:" + this.f53614p + " Dpos/Dt:" + this.f53603e;
    }

    /* renamed from: u0 */
    public void m68137u0(int i, C11515b c11515b) {
        C11488a c11488a = this.f53600b;
        if (c11488a != null) {
            c11488a.m68068U(i, c11515b);
        }
        m68139t0();
        if (this.f53605g == i) {
            c11515b.m67819i(this);
        }
    }

    /* renamed from: w0 */
    public void m68134w0(int i, View... viewArr) {
        C11488a c11488a = this.f53600b;
        if (c11488a != null) {
            c11488a.m68057c0(i, viewArr);
        } else {
            Log.e("MotionLayout", " no motionScene");
        }
    }

    @Override // p000.L43
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f53574I || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f53574I = false;
    }

    public void setProgress(float f) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i < 0 || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f53569F0 == null) {
                this.f53569F0 = new C11485j();
            }
            this.f53569F0.m68097c(f);
            return;
        }
        if (i <= 0) {
            if (this.f53614p == 1.0f && this.f53605g == this.f53606h) {
                m68160i0(EnumC11487l.MOVING);
            }
            this.f53605g = this.f53604f;
            if (this.f53614p == 0.0f) {
                m68160i0(EnumC11487l.FINISHED);
            }
        } else if (f >= 1.0f) {
            if (this.f53614p == 0.0f && this.f53605g == this.f53604f) {
                m68160i0(EnumC11487l.MOVING);
            }
            this.f53605g = this.f53606h;
            if (this.f53614p == 1.0f) {
                m68160i0(EnumC11487l.FINISHED);
            }
        } else {
            this.f53605g = -1;
            m68160i0(EnumC11487l.MOVING);
        }
        if (this.f53600b == null) {
            return;
        }
        this.f53620s = true;
        this.f53618r = f;
        this.f53613o = f;
        this.f53616q = -1L;
        this.f53611m = -1L;
        this.f53601c = null;
        this.f53622t = true;
        invalidate();
    }

    public void setTransition(int i) {
        float f;
        if (this.f53600b != null) {
            C11488a.C11490b m68174Z = m68174Z(i);
            this.f53604f = m68174Z.m68033A();
            this.f53606h = m68174Z.m68001y();
            if (!isAttachedToWindow()) {
                if (this.f53569F0 == null) {
                    this.f53569F0 = new C11485j();
                }
                this.f53569F0.m68096d(this.f53604f);
                this.f53569F0.m68098b(this.f53606h);
                return;
            }
            int i2 = this.f53605g;
            if (i2 == this.f53604f) {
                f = 0.0f;
            } else {
                f = i2 == this.f53606h ? 1.0f : Float.NaN;
            }
            this.f53600b.m68064Y(m68174Z);
            this.f53591S0.m68111e(this.mLayoutWidget, this.f53600b.m68048l(this.f53604f), this.f53600b.m68048l(this.f53606h));
            m68162h0();
            if (this.f53614p != f) {
                if (f == 0.0f) {
                    m68189J(true);
                    this.f53600b.m68048l(this.f53604f).m67819i(this);
                } else if (f == 1.0f) {
                    m68189J(false);
                    this.f53600b.m68048l(this.f53606h).m67819i(this);
                }
            }
            this.f53614p = Float.isNaN(f) ? 0.0f : f;
            if (Float.isNaN(f)) {
                Log.v("MotionLayout", FU0.m107119b() + " transitionToStart ");
                m68146p0();
                return;
            }
            setProgress(f);
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53602d = null;
        this.f53603e = 0.0f;
        this.f53604f = -1;
        this.f53605g = -1;
        this.f53606h = -1;
        this.f53607i = 0;
        this.f53608j = 0;
        this.f53609k = true;
        this.f53610l = new HashMap<>();
        this.f53611m = 0L;
        this.f53612n = 1.0f;
        this.f53613o = 0.0f;
        this.f53614p = 0.0f;
        this.f53618r = 0.0f;
        this.f53622t = false;
        this.f53624u = false;
        this.f53632y = 0;
        this.f53558A = false;
        this.f53560B = new UQ5();
        this.f53562C = new C11480e();
        this.f53564D = true;
        this.f53574I = false;
        this.f53588R = false;
        this.f53590S = null;
        this.f53592T = null;
        this.f53594U = null;
        this.f53597W = null;
        this.f53615p0 = 0;
        this.f53617q0 = -1L;
        this.f53619r0 = 0.0f;
        this.f53621s0 = 0;
        this.f53623t0 = 0.0f;
        this.f53625u0 = false;
        this.f53627v0 = false;
        this.f53565D0 = new C39930dk2();
        this.f53567E0 = false;
        this.f53571G0 = null;
        this.f53573H0 = null;
        this.f53575I0 = 0;
        this.f53577J0 = false;
        this.f53579K0 = 0;
        this.f53580L0 = new HashMap<>();
        this.f53585P0 = new Rect();
        this.f53587Q0 = false;
        this.f53589R0 = EnumC11487l.UNDEFINED;
        this.f53591S0 = new C11482g();
        this.f53593T0 = false;
        this.f53595U0 = new RectF();
        this.f53596V0 = null;
        this.f53598W0 = null;
        this.f53599X0 = new ArrayList<>();
        m68171c0(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53602d = null;
        this.f53603e = 0.0f;
        this.f53604f = -1;
        this.f53605g = -1;
        this.f53606h = -1;
        this.f53607i = 0;
        this.f53608j = 0;
        this.f53609k = true;
        this.f53610l = new HashMap<>();
        this.f53611m = 0L;
        this.f53612n = 1.0f;
        this.f53613o = 0.0f;
        this.f53614p = 0.0f;
        this.f53618r = 0.0f;
        this.f53622t = false;
        this.f53624u = false;
        this.f53632y = 0;
        this.f53558A = false;
        this.f53560B = new UQ5();
        this.f53562C = new C11480e();
        this.f53564D = true;
        this.f53574I = false;
        this.f53588R = false;
        this.f53590S = null;
        this.f53592T = null;
        this.f53594U = null;
        this.f53597W = null;
        this.f53615p0 = 0;
        this.f53617q0 = -1L;
        this.f53619r0 = 0.0f;
        this.f53621s0 = 0;
        this.f53623t0 = 0.0f;
        this.f53625u0 = false;
        this.f53627v0 = false;
        this.f53565D0 = new C39930dk2();
        this.f53567E0 = false;
        this.f53571G0 = null;
        this.f53573H0 = null;
        this.f53575I0 = 0;
        this.f53577J0 = false;
        this.f53579K0 = 0;
        this.f53580L0 = new HashMap<>();
        this.f53585P0 = new Rect();
        this.f53587Q0 = false;
        this.f53589R0 = EnumC11487l.UNDEFINED;
        this.f53591S0 = new C11482g();
        this.f53593T0 = false;
        this.f53595U0 = new RectF();
        this.f53596V0 = null;
        this.f53598W0 = null;
        this.f53599X0 = new ArrayList<>();
        m68171c0(attributeSet);
    }
}
