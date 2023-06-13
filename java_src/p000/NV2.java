package p000;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C11512a;
import androidx.constraintlayout.widget.C11515b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import p000.AbstractC33194Gt6;
/* renamed from: NV2 */
/* loaded from: classes.dex */
public class NV2 implements Comparable<NV2> {

    /* renamed from: E */
    public static String[] f24653E = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: d */
    public int f24660d;

    /* renamed from: q */
    public C41363g91 f24673q;

    /* renamed from: s */
    public float f24675s;

    /* renamed from: t */
    public float f24676t;

    /* renamed from: u */
    public float f24677u;

    /* renamed from: v */
    public float f24678v;

    /* renamed from: w */
    public float f24679w;

    /* renamed from: b */
    public float f24658b = 1.0f;

    /* renamed from: c */
    public int f24659c = 0;

    /* renamed from: e */
    public boolean f24661e = false;

    /* renamed from: f */
    public float f24662f = 0.0f;

    /* renamed from: g */
    public float f24663g = 0.0f;

    /* renamed from: h */
    public float f24664h = 0.0f;

    /* renamed from: i */
    public float f24665i = 0.0f;

    /* renamed from: j */
    public float f24666j = 1.0f;

    /* renamed from: k */
    public float f24667k = 1.0f;

    /* renamed from: l */
    public float f24668l = Float.NaN;

    /* renamed from: m */
    public float f24669m = Float.NaN;

    /* renamed from: n */
    public float f24670n = 0.0f;

    /* renamed from: o */
    public float f24671o = 0.0f;

    /* renamed from: p */
    public float f24672p = 0.0f;

    /* renamed from: r */
    public int f24674r = 0;

    /* renamed from: x */
    public float f24680x = Float.NaN;

    /* renamed from: y */
    public float f24681y = Float.NaN;

    /* renamed from: z */
    public int f24682z = -1;

    /* renamed from: A */
    public LinkedHashMap<String, C11512a> f24654A = new LinkedHashMap<>();

    /* renamed from: B */
    public int f24655B = 0;

    /* renamed from: C */
    public double[] f24656C = new double[18];

    /* renamed from: D */
    public double[] f24657D = new double[18];

    /* renamed from: a */
    public void m93852a(HashMap<String, AbstractC33194Gt6> hashMap, int i) {
        for (String str : hashMap.keySet()) {
            AbstractC33194Gt6 abstractC33194Gt6 = hashMap.get(str);
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = '\r';
                        break;
                    }
                    break;
            }
            float f = 1.0f;
            float f2 = 0.0f;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.f24664h)) {
                        f2 = this.f24664h;
                    }
                    abstractC33194Gt6.mo77076c(i, f2);
                    break;
                case 1:
                    if (!Float.isNaN(this.f24665i)) {
                        f2 = this.f24665i;
                    }
                    abstractC33194Gt6.mo77076c(i, f2);
                    break;
                case 2:
                    if (!Float.isNaN(this.f24670n)) {
                        f2 = this.f24670n;
                    }
                    abstractC33194Gt6.mo77076c(i, f2);
                    break;
                case 3:
                    if (!Float.isNaN(this.f24671o)) {
                        f2 = this.f24671o;
                    }
                    abstractC33194Gt6.mo77076c(i, f2);
                    break;
                case 4:
                    if (!Float.isNaN(this.f24672p)) {
                        f2 = this.f24672p;
                    }
                    abstractC33194Gt6.mo77076c(i, f2);
                    break;
                case 5:
                    if (!Float.isNaN(this.f24681y)) {
                        f2 = this.f24681y;
                    }
                    abstractC33194Gt6.mo77076c(i, f2);
                    break;
                case 6:
                    if (!Float.isNaN(this.f24666j)) {
                        f = this.f24666j;
                    }
                    abstractC33194Gt6.mo77076c(i, f);
                    break;
                case 7:
                    if (!Float.isNaN(this.f24667k)) {
                        f = this.f24667k;
                    }
                    abstractC33194Gt6.mo77076c(i, f);
                    break;
                case '\b':
                    if (!Float.isNaN(this.f24668l)) {
                        f2 = this.f24668l;
                    }
                    abstractC33194Gt6.mo77076c(i, f2);
                    break;
                case '\t':
                    if (!Float.isNaN(this.f24669m)) {
                        f2 = this.f24669m;
                    }
                    abstractC33194Gt6.mo77076c(i, f2);
                    break;
                case '\n':
                    if (!Float.isNaN(this.f24663g)) {
                        f2 = this.f24663g;
                    }
                    abstractC33194Gt6.mo77076c(i, f2);
                    break;
                case 11:
                    if (!Float.isNaN(this.f24662f)) {
                        f2 = this.f24662f;
                    }
                    abstractC33194Gt6.mo77076c(i, f2);
                    break;
                case '\f':
                    if (!Float.isNaN(this.f24680x)) {
                        f2 = this.f24680x;
                    }
                    abstractC33194Gt6.mo77076c(i, f2);
                    break;
                case '\r':
                    if (!Float.isNaN(this.f24658b)) {
                        f = this.f24658b;
                    }
                    abstractC33194Gt6.mo77076c(i, f);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f24654A.containsKey(str2)) {
                            C11512a c11512a = this.f24654A.get(str2);
                            if (abstractC33194Gt6 instanceof AbstractC33194Gt6.C2971b) {
                                ((AbstractC33194Gt6.C2971b) abstractC33194Gt6).m104611i(i, c11512a);
                                break;
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + c11512a.m67857e() + abstractC33194Gt6);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    }
            }
        }
    }

    /* renamed from: b */
    public void m93851b(View view) {
        float alpha;
        this.f24660d = view.getVisibility();
        if (view.getVisibility() != 0) {
            alpha = 0.0f;
        } else {
            alpha = view.getAlpha();
        }
        this.f24658b = alpha;
        this.f24661e = false;
        this.f24662f = view.getElevation();
        this.f24663g = view.getRotation();
        this.f24664h = view.getRotationX();
        this.f24665i = view.getRotationY();
        this.f24666j = view.getScaleX();
        this.f24667k = view.getScaleY();
        this.f24668l = view.getPivotX();
        this.f24669m = view.getPivotY();
        this.f24670n = view.getTranslationX();
        this.f24671o = view.getTranslationY();
        this.f24672p = view.getTranslationZ();
    }

    /* renamed from: c */
    public void m93850c(C11515b.C11516a c11516a) {
        float f;
        C11515b.C11520d c11520d = c11516a.f54084c;
        int i = c11520d.f54189c;
        this.f24659c = i;
        int i2 = c11520d.f54188b;
        this.f24660d = i2;
        if (i2 != 0 && i == 0) {
            f = 0.0f;
        } else {
            f = c11520d.f54190d;
        }
        this.f24658b = f;
        C11515b.C11521e c11521e = c11516a.f54087f;
        this.f24661e = c11521e.f54205m;
        this.f24662f = c11521e.f54206n;
        this.f24663g = c11521e.f54194b;
        this.f24664h = c11521e.f54195c;
        this.f24665i = c11521e.f54196d;
        this.f24666j = c11521e.f54197e;
        this.f24667k = c11521e.f54198f;
        this.f24668l = c11521e.f54199g;
        this.f24669m = c11521e.f54200h;
        this.f24670n = c11521e.f54202j;
        this.f24671o = c11521e.f54203k;
        this.f24672p = c11521e.f54204l;
        this.f24673q = C41363g91.m39970c(c11516a.f54085d.f54176d);
        C11515b.C11519c c11519c = c11516a.f54085d;
        this.f24680x = c11519c.f54181i;
        this.f24674r = c11519c.f54178f;
        this.f24682z = c11519c.f54174b;
        this.f24681y = c11516a.f54084c.f54191e;
        for (String str : c11516a.f54088g.keySet()) {
            C11512a c11512a = c11516a.f54088g.get(str);
            if (c11512a.m67855g()) {
                this.f24654A.put(str, c11512a);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(NV2 nv2) {
        return Float.compare(this.f24675s, nv2.f24675s);
    }

    /* renamed from: e */
    public final boolean m93848e(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            if (Math.abs(f - f2) > 1.0E-6f) {
                return true;
            }
            return false;
        } else if (Float.isNaN(f) != Float.isNaN(f2)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    public void m93847f(NV2 nv2, HashSet<String> hashSet) {
        if (m93848e(this.f24658b, nv2.f24658b)) {
            hashSet.add("alpha");
        }
        if (m93848e(this.f24662f, nv2.f24662f)) {
            hashSet.add("elevation");
        }
        int i = this.f24660d;
        int i2 = nv2.f24660d;
        if (i != i2 && this.f24659c == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (m93848e(this.f24663g, nv2.f24663g)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f24680x) || !Float.isNaN(nv2.f24680x)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f24681y) || !Float.isNaN(nv2.f24681y)) {
            hashSet.add("progress");
        }
        if (m93848e(this.f24664h, nv2.f24664h)) {
            hashSet.add("rotationX");
        }
        if (m93848e(this.f24665i, nv2.f24665i)) {
            hashSet.add("rotationY");
        }
        if (m93848e(this.f24668l, nv2.f24668l)) {
            hashSet.add("transformPivotX");
        }
        if (m93848e(this.f24669m, nv2.f24669m)) {
            hashSet.add("transformPivotY");
        }
        if (m93848e(this.f24666j, nv2.f24666j)) {
            hashSet.add("scaleX");
        }
        if (m93848e(this.f24667k, nv2.f24667k)) {
            hashSet.add("scaleY");
        }
        if (m93848e(this.f24670n, nv2.f24670n)) {
            hashSet.add("translationX");
        }
        if (m93848e(this.f24671o, nv2.f24671o)) {
            hashSet.add("translationY");
        }
        if (m93848e(this.f24672p, nv2.f24672p)) {
            hashSet.add("translationZ");
        }
    }

    /* renamed from: g */
    public void m93846g(float f, float f2, float f3, float f4) {
        this.f24676t = f;
        this.f24677u = f2;
        this.f24678v = f3;
        this.f24679w = f4;
    }

    /* renamed from: h */
    public void m93845h(Rect rect, View view, int i, float f) {
        m93846g(rect.left, rect.top, rect.width(), rect.height());
        m93851b(view);
        this.f24668l = Float.NaN;
        this.f24669m = Float.NaN;
        if (i != 1) {
            if (i == 2) {
                this.f24663g = f + 90.0f;
                return;
            }
            return;
        }
        this.f24663g = f - 90.0f;
    }

    /* renamed from: i */
    public void m93844i(Rect rect, C11515b c11515b, int i, int i2) {
        m93846g(rect.left, rect.top, rect.width(), rect.height());
        m93850c(c11515b.m67849A(i2));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.f24663g + 90.0f;
            this.f24663g = f;
            if (f > 180.0f) {
                this.f24663g = f - 360.0f;
                return;
            }
            return;
        }
        this.f24663g -= 90.0f;
    }

    /* renamed from: j */
    public void m93843j(View view) {
        m93846g(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        m93851b(view);
    }
}
