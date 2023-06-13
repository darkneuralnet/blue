package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.C11488a;
import androidx.constraintlayout.motion.widget.C11495c;
import androidx.constraintlayout.widget.C11512a;
import androidx.constraintlayout.widget.C11515b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: androidx.constraintlayout.motion.widget.c */
/* loaded from: classes.dex */
public class C11495c {

    /* renamed from: w */
    public static String f53765w = "ViewTransition";

    /* renamed from: a */
    public int f53766a;

    /* renamed from: e */
    public int f53770e;

    /* renamed from: f */
    public C45859nk2 f53771f;

    /* renamed from: g */
    public C11515b.C11516a f53772g;

    /* renamed from: j */
    public int f53775j;

    /* renamed from: k */
    public String f53776k;

    /* renamed from: o */
    public Context f53780o;

    /* renamed from: b */
    public int f53767b = -1;

    /* renamed from: c */
    public boolean f53768c = false;

    /* renamed from: d */
    public int f53769d = 0;

    /* renamed from: h */
    public int f53773h = -1;

    /* renamed from: i */
    public int f53774i = -1;

    /* renamed from: l */
    public int f53777l = 0;

    /* renamed from: m */
    public String f53778m = null;

    /* renamed from: n */
    public int f53779n = -1;

    /* renamed from: p */
    public int f53781p = -1;

    /* renamed from: q */
    public int f53782q = -1;

    /* renamed from: r */
    public int f53783r = -1;

    /* renamed from: s */
    public int f53784s = -1;

    /* renamed from: t */
    public int f53785t = -1;

    /* renamed from: u */
    public int f53786u = -1;

    /* renamed from: v */
    public int f53787v = -1;

    /* renamed from: androidx.constraintlayout.motion.widget.c$a  reason: invalid class name */
    /* loaded from: classes.dex */
    public class animationInterpolatorC11496a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ C41363g91 f53788a;

        public animationInterpolatorC11496a(C11495c c11495c, C41363g91 c41363g91) {
            this.f53788a = c41363g91;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f53788a.mo39969a(f);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.c$b */
    /* loaded from: classes.dex */
    public static class C11497b {

        /* renamed from: a */
        public final int f53789a;

        /* renamed from: b */
        public final int f53790b;

        /* renamed from: c */
        public long f53791c;

        /* renamed from: d */
        public OV2 f53792d;

        /* renamed from: e */
        public int f53793e;

        /* renamed from: f */
        public int f53794f;

        /* renamed from: h */
        public C11498d f53796h;

        /* renamed from: i */
        public Interpolator f53797i;

        /* renamed from: k */
        public float f53799k;

        /* renamed from: l */
        public float f53800l;

        /* renamed from: m */
        public long f53801m;

        /* renamed from: o */
        public boolean f53803o;

        /* renamed from: g */
        public C39930dk2 f53795g = new C39930dk2();

        /* renamed from: j */
        public boolean f53798j = false;

        /* renamed from: n */
        public Rect f53802n = new Rect();

        public C11497b(C11498d c11498d, OV2 ov2, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            float f;
            this.f53803o = false;
            this.f53796h = c11498d;
            this.f53792d = ov2;
            this.f53793e = i;
            this.f53794f = i2;
            long nanoTime = System.nanoTime();
            this.f53791c = nanoTime;
            this.f53801m = nanoTime;
            this.f53796h.m67949b(this);
            this.f53797i = interpolator;
            this.f53789a = i4;
            this.f53790b = i5;
            if (i3 == 3) {
                this.f53803o = true;
            }
            if (i == 0) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f / i;
            }
            this.f53800l = f;
            m67955a();
        }

        /* renamed from: a */
        public void m67955a() {
            if (this.f53798j) {
                m67953c();
            } else {
                m67954b();
            }
        }

        /* renamed from: b */
        public void m67954b() {
            float interpolation;
            long nanoTime = System.nanoTime();
            this.f53801m = nanoTime;
            float f = this.f53799k + (((float) ((nanoTime - this.f53801m) * 1.0E-6d)) * this.f53800l);
            this.f53799k = f;
            if (f >= 1.0f) {
                this.f53799k = 1.0f;
            }
            Interpolator interpolator = this.f53797i;
            if (interpolator == null) {
                interpolation = this.f53799k;
            } else {
                interpolation = interpolator.getInterpolation(this.f53799k);
            }
            float f2 = interpolation;
            OV2 ov2 = this.f53792d;
            boolean m92133x = ov2.m92133x(ov2.f26683b, f2, nanoTime, this.f53795g);
            if (this.f53799k >= 1.0f) {
                if (this.f53789a != -1) {
                    this.f53792d.m92135v().setTag(this.f53789a, Long.valueOf(System.nanoTime()));
                }
                if (this.f53790b != -1) {
                    this.f53792d.m92135v().setTag(this.f53790b, null);
                }
                if (!this.f53803o) {
                    this.f53796h.m67944g(this);
                }
            }
            if (this.f53799k < 1.0f || m92133x) {
                this.f53796h.m67946e();
            }
        }

        /* renamed from: c */
        public void m67953c() {
            float interpolation;
            long nanoTime = System.nanoTime();
            this.f53801m = nanoTime;
            float f = this.f53799k - (((float) ((nanoTime - this.f53801m) * 1.0E-6d)) * this.f53800l);
            this.f53799k = f;
            if (f < 0.0f) {
                this.f53799k = 0.0f;
            }
            Interpolator interpolator = this.f53797i;
            if (interpolator == null) {
                interpolation = this.f53799k;
            } else {
                interpolation = interpolator.getInterpolation(this.f53799k);
            }
            float f2 = interpolation;
            OV2 ov2 = this.f53792d;
            boolean m92133x = ov2.m92133x(ov2.f26683b, f2, nanoTime, this.f53795g);
            if (this.f53799k <= 0.0f) {
                if (this.f53789a != -1) {
                    this.f53792d.m92135v().setTag(this.f53789a, Long.valueOf(System.nanoTime()));
                }
                if (this.f53790b != -1) {
                    this.f53792d.m92135v().setTag(this.f53790b, null);
                }
                this.f53796h.m67944g(this);
            }
            if (this.f53799k > 0.0f || m92133x) {
                this.f53796h.m67946e();
            }
        }

        /* renamed from: d */
        public void m67952d(int i, float f, float f2) {
            if (i != 1) {
                if (i == 2) {
                    this.f53792d.m92135v().getHitRect(this.f53802n);
                    if (!this.f53802n.contains((int) f, (int) f2) && !this.f53798j) {
                        m67951e(true);
                    }
                }
            } else if (!this.f53798j) {
                m67951e(true);
            }
        }

        /* renamed from: e */
        public void m67951e(boolean z) {
            int i;
            float f;
            this.f53798j = z;
            if (z && (i = this.f53794f) != -1) {
                if (i == 0) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f / i;
                }
                this.f53800l = f;
            }
            this.f53796h.m67946e();
            this.f53801m = System.nanoTime();
        }
    }

    public C11495c(Context context, XmlPullParser xmlPullParser) {
        boolean z;
        this.f53780o = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType != 3) {
                        continue;
                    } else if ("ViewTransition".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                z = false;
                                break;
                            }
                            z = true;
                            break;
                        case 366511058:
                            if (name.equals("CustomMethod")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        default:
                            z = true;
                            break;
                    }
                    if (z) {
                        if (!z) {
                            if (!z) {
                                if (!z && !z) {
                                    Log.e(f53765w, FU0.m107120a() + " unknown tag " + name);
                                    Log.e(f53765w, ".xml:" + xmlPullParser.getLineNumber());
                                } else {
                                    C11512a.m67853i(context, xmlPullParser, this.f53772g.f54088g);
                                }
                            } else {
                                this.f53772g = C11515b.m67815m(context, xmlPullParser);
                            }
                        } else {
                            this.f53771f = new C45859nk2(context, xmlPullParser);
                        }
                    } else {
                        m67958l(context, xmlPullParser);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m67960j(View[] viewArr) {
        if (this.f53781p != -1) {
            for (View view : viewArr) {
                view.setTag(this.f53781p, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.f53782q != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.f53782q, null);
            }
        }
    }

    /* renamed from: b */
    public void m67968b(C11498d c11498d, MotionLayout motionLayout, View view) {
        OV2 ov2 = new OV2(view);
        ov2.m92165B(view);
        this.f53771f.m23244a(ov2);
        ov2.m92158I(motionLayout.getWidth(), motionLayout.getHeight(), this.f53773h, System.nanoTime());
        new C11497b(c11498d, ov2, this.f53773h, this.f53774i, this.f53767b, m67964f(motionLayout.getContext()), this.f53781p, this.f53782q);
    }

    /* renamed from: c */
    public void m67967c(C11498d c11498d, MotionLayout motionLayout, int i, C11515b c11515b, final View... viewArr) {
        int[] m68181R;
        if (this.f53768c) {
            return;
        }
        int i2 = this.f53770e;
        if (i2 == 2) {
            m67968b(c11498d, motionLayout, viewArr[0]);
            return;
        }
        if (i2 == 1) {
            for (int i3 : motionLayout.m68181R()) {
                if (i3 != i) {
                    C11515b m68182Q = motionLayout.m68182Q(i3);
                    for (View view : viewArr) {
                        C11515b.C11516a m67804x = m68182Q.m67804x(view.getId());
                        C11515b.C11516a c11516a = this.f53772g;
                        if (c11516a != null) {
                            c11516a.m67798d(m67804x);
                            m67804x.f54088g.putAll(this.f53772g.f54088g);
                        }
                    }
                }
            }
        }
        C11515b c11515b2 = new C11515b();
        c11515b2.m67811q(c11515b);
        for (View view2 : viewArr) {
            C11515b.C11516a m67804x2 = c11515b2.m67804x(view2.getId());
            C11515b.C11516a c11516a2 = this.f53772g;
            if (c11516a2 != null) {
                c11516a2.m67798d(m67804x2);
                m67804x2.f54088g.putAll(this.f53772g.f54088g);
            }
        }
        motionLayout.m68137u0(i, c11515b2);
        int i4 = C52945zh4.view_transition;
        motionLayout.m68137u0(i4, c11515b);
        motionLayout.setState(i4, -1, -1);
        C11488a.C11490b c11490b = new C11488a.C11490b(-1, motionLayout.f53600b, i4, i);
        for (View view3 : viewArr) {
            m67956n(c11490b, view3);
        }
        motionLayout.m68158j0(c11490b);
        motionLayout.m68148o0(new Runnable() { // from class: Ot6
            @Override // java.lang.Runnable
            public final void run() {
                C11495c.this.m67960j(viewArr);
            }
        });
    }

    /* renamed from: d */
    public boolean m67966d(View view) {
        boolean z;
        boolean z2;
        int i = this.f53783r;
        if (i == -1 || view.getTag(i) != null) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.f53784s;
        if (i2 == -1 || view.getTag(i2) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public int m67965e() {
        return this.f53766a;
    }

    /* renamed from: f */
    public Interpolator m67964f(Context context) {
        int i = this.f53777l;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new animationInterpolatorC11496a(this, C41363g91.m39970c(this.f53778m));
        }
        return AnimationUtils.loadInterpolator(context, this.f53779n);
    }

    /* renamed from: g */
    public int m67963g() {
        return this.f53785t;
    }

    /* renamed from: h */
    public int m67962h() {
        return this.f53786u;
    }

    /* renamed from: i */
    public int m67961i() {
        return this.f53767b;
    }

    /* renamed from: k */
    public boolean m67959k(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f53775j == -1 && this.f53776k == null) || !m67966d(view)) {
            return false;
        }
        if (view.getId() == this.f53775j) {
            return true;
        }
        if (this.f53776k == null || !(view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) || (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).f53976c0) == null || !str.matches(this.f53776k)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final void m67958l(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C39341cm4.ViewTransition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C39341cm4.ViewTransition_android_id) {
                this.f53766a = obtainStyledAttributes.getResourceId(index, this.f53766a);
            } else if (index == C39341cm4.ViewTransition_motionTarget) {
                if (MotionLayout.f53557Y0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f53775j);
                    this.f53775j = resourceId;
                    if (resourceId == -1) {
                        this.f53776k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f53776k = obtainStyledAttributes.getString(index);
                } else {
                    this.f53775j = obtainStyledAttributes.getResourceId(index, this.f53775j);
                }
            } else if (index == C39341cm4.ViewTransition_onStateTransition) {
                this.f53767b = obtainStyledAttributes.getInt(index, this.f53767b);
            } else if (index == C39341cm4.ViewTransition_transitionDisable) {
                this.f53768c = obtainStyledAttributes.getBoolean(index, this.f53768c);
            } else if (index == C39341cm4.ViewTransition_pathMotionArc) {
                this.f53769d = obtainStyledAttributes.getInt(index, this.f53769d);
            } else if (index == C39341cm4.ViewTransition_duration) {
                this.f53773h = obtainStyledAttributes.getInt(index, this.f53773h);
            } else if (index == C39341cm4.ViewTransition_upDuration) {
                this.f53774i = obtainStyledAttributes.getInt(index, this.f53774i);
            } else if (index == C39341cm4.ViewTransition_viewTransitionMode) {
                this.f53770e = obtainStyledAttributes.getInt(index, this.f53770e);
            } else if (index == C39341cm4.ViewTransition_motionInterpolator) {
                int i2 = obtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f53779n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f53777l = -2;
                    }
                } else if (i2 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f53778m = string;
                    if (string != null && string.indexOf("/") > 0) {
                        this.f53779n = obtainStyledAttributes.getResourceId(index, -1);
                        this.f53777l = -2;
                    } else {
                        this.f53777l = -1;
                    }
                } else {
                    this.f53777l = obtainStyledAttributes.getInteger(index, this.f53777l);
                }
            } else if (index == C39341cm4.ViewTransition_setsTag) {
                this.f53781p = obtainStyledAttributes.getResourceId(index, this.f53781p);
            } else if (index == C39341cm4.ViewTransition_clearsTag) {
                this.f53782q = obtainStyledAttributes.getResourceId(index, this.f53782q);
            } else if (index == C39341cm4.ViewTransition_ifTagSet) {
                this.f53783r = obtainStyledAttributes.getResourceId(index, this.f53783r);
            } else if (index == C39341cm4.ViewTransition_ifTagNotSet) {
                this.f53784s = obtainStyledAttributes.getResourceId(index, this.f53784s);
            } else if (index == C39341cm4.ViewTransition_SharedValueId) {
                this.f53786u = obtainStyledAttributes.getResourceId(index, this.f53786u);
            } else if (index == C39341cm4.ViewTransition_SharedValue) {
                this.f53785t = obtainStyledAttributes.getInteger(index, this.f53785t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: m */
    public boolean m67957m(int i) {
        int i2 = this.f53767b;
        return i2 == 1 ? i == 0 : i2 == 2 ? i == 1 : i2 == 3 && i == 0;
    }

    /* renamed from: n */
    public final void m67956n(C11488a.C11490b c11490b, View view) {
        int i = this.f53773h;
        if (i != -1) {
            c11490b.m68029E(i);
        }
        c11490b.m68026H(this.f53769d);
        c11490b.m68028F(this.f53777l, this.f53778m, this.f53779n);
        int id = view.getId();
        C45859nk2 c45859nk2 = this.f53771f;
        if (c45859nk2 != null) {
            ArrayList<AbstractC37078Xj2> m23241d = c45859nk2.m23241d(-1);
            C45859nk2 c45859nk22 = new C45859nk2();
            Iterator<AbstractC37078Xj2> it = m23241d.iterator();
            while (it.hasNext()) {
                c45859nk22.m23242c(it.next().clone().m76529i(id));
            }
            c11490b.m68006t(c45859nk22);
        }
    }

    public String toString() {
        return "ViewTransition(" + FU0.m107118c(this.f53780o, this.f53766a) + ")";
    }
}
