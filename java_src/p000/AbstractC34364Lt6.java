package p000;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C11512a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: Lt6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC34364Lt6 extends AbstractC42504i46 {

    /* renamed from: Lt6$a */
    /* loaded from: classes.dex */
    public static class C5110a extends AbstractC34364Lt6 {
        @Override // p000.AbstractC34364Lt6
        /* renamed from: i */
        public boolean mo96235i(View view, float f, long j, C39930dk2 c39930dk2) {
            view.setAlpha(m96240f(f, j, view, c39930dk2));
            return this.f86700h;
        }
    }

    /* renamed from: Lt6$b */
    /* loaded from: classes.dex */
    public static class C5111b extends AbstractC34364Lt6 {

        /* renamed from: l */
        public String f22201l;

        /* renamed from: m */
        public SparseArray<C11512a> f22202m;

        /* renamed from: n */
        public SparseArray<float[]> f22203n = new SparseArray<>();

        /* renamed from: o */
        public float[] f22204o;

        /* renamed from: p */
        public float[] f22205p;

        public C5111b(String str, SparseArray<C11512a> sparseArray) {
            this.f22201l = str.split(",")[1];
            this.f22202m = sparseArray;
        }

        @Override // p000.AbstractC42504i46
        /* renamed from: b */
        public void mo34499b(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // p000.AbstractC42504i46
        /* renamed from: e */
        public void mo34496e(int i) {
            float[] fArr;
            int size = this.f22202m.size();
            int m67854h = this.f22202m.valueAt(0).m67854h();
            double[] dArr = new double[size];
            int i2 = m67854h + 2;
            this.f22204o = new float[i2];
            this.f22205p = new float[m67854h];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.f22202m.keyAt(i3);
                float[] valueAt = this.f22203n.valueAt(i3);
                dArr[i3] = keyAt * 0.01d;
                this.f22202m.valueAt(i3).m67856f(this.f22204o);
                int i4 = 0;
                while (true) {
                    if (i4 < this.f22204o.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[m67854h] = valueAt[0];
                dArr3[m67854h + 1] = valueAt[1];
            }
            this.f86693a = AbstractC42603iF0.m34285a(i, dArr, dArr2);
        }

        @Override // p000.AbstractC34364Lt6
        /* renamed from: i */
        public boolean mo96235i(View view, float f, long j, C39930dk2 c39930dk2) {
            boolean z;
            this.f86693a.mo34281e(f, this.f22204o);
            float[] fArr = this.f22204o;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.f86701i;
            if (Float.isNaN(this.f86702j)) {
                float m43818a = c39930dk2.m43818a(view, this.f22201l, 0);
                this.f86702j = m43818a;
                if (Float.isNaN(m43818a)) {
                    this.f86702j = 0.0f;
                }
            }
            float f4 = (float) ((this.f86702j + ((j2 * 1.0E-9d) * f2)) % 1.0d);
            this.f86702j = f4;
            this.f86701i = j;
            float m34500a = m34500a(f4);
            this.f86700h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f22205p;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z2 = this.f86700h;
                float f5 = this.f22204o[i];
                if (f5 != 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                this.f86700h = z2 | z;
                fArr2[i] = (f5 * m34500a) + f3;
                i++;
            }
            C46754pF0.m19738b(this.f22202m.valueAt(0), view, this.f22205p);
            if (f2 != 0.0f) {
                this.f86700h = true;
            }
            return this.f86700h;
        }

        /* renamed from: j */
        public void m96237j(int i, C11512a c11512a, float f, int i2, float f2) {
            this.f22202m.append(i, c11512a);
            this.f22203n.append(i, new float[]{f, f2});
            this.f86694b = Math.max(this.f86694b, i2);
        }
    }

    /* renamed from: Lt6$c */
    /* loaded from: classes.dex */
    public static class C5112c extends AbstractC34364Lt6 {
        @Override // p000.AbstractC34364Lt6
        /* renamed from: i */
        public boolean mo96235i(View view, float f, long j, C39930dk2 c39930dk2) {
            view.setElevation(m96240f(f, j, view, c39930dk2));
            return this.f86700h;
        }
    }

    /* renamed from: Lt6$d */
    /* loaded from: classes.dex */
    public static class C5113d extends AbstractC34364Lt6 {
        @Override // p000.AbstractC34364Lt6
        /* renamed from: i */
        public boolean mo96235i(View view, float f, long j, C39930dk2 c39930dk2) {
            return this.f86700h;
        }

        /* renamed from: j */
        public boolean m96236j(View view, C39930dk2 c39930dk2, float f, long j, double d, double d2) {
            view.setRotation(m96240f(f, j, view, c39930dk2) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.f86700h;
        }
    }

    /* renamed from: Lt6$e */
    /* loaded from: classes.dex */
    public static class C5114e extends AbstractC34364Lt6 {

        /* renamed from: l */
        public boolean f22206l = false;

        @Override // p000.AbstractC34364Lt6
        /* renamed from: i */
        public boolean mo96235i(View view, float f, long j, C39930dk2 c39930dk2) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m96240f(f, j, view, c39930dk2));
            } else if (this.f22206l) {
                return false;
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f22206l = true;
                    method = null;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(m96240f(f, j, view, c39930dk2)));
                    } catch (IllegalAccessException e) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e2);
                    }
                }
            }
            return this.f86700h;
        }
    }

    /* renamed from: Lt6$f */
    /* loaded from: classes.dex */
    public static class C5115f extends AbstractC34364Lt6 {
        @Override // p000.AbstractC34364Lt6
        /* renamed from: i */
        public boolean mo96235i(View view, float f, long j, C39930dk2 c39930dk2) {
            view.setRotation(m96240f(f, j, view, c39930dk2));
            return this.f86700h;
        }
    }

    /* renamed from: Lt6$g */
    /* loaded from: classes.dex */
    public static class C5116g extends AbstractC34364Lt6 {
        @Override // p000.AbstractC34364Lt6
        /* renamed from: i */
        public boolean mo96235i(View view, float f, long j, C39930dk2 c39930dk2) {
            view.setRotationX(m96240f(f, j, view, c39930dk2));
            return this.f86700h;
        }
    }

    /* renamed from: Lt6$h */
    /* loaded from: classes.dex */
    public static class C5117h extends AbstractC34364Lt6 {
        @Override // p000.AbstractC34364Lt6
        /* renamed from: i */
        public boolean mo96235i(View view, float f, long j, C39930dk2 c39930dk2) {
            view.setRotationY(m96240f(f, j, view, c39930dk2));
            return this.f86700h;
        }
    }

    /* renamed from: Lt6$i */
    /* loaded from: classes.dex */
    public static class C5118i extends AbstractC34364Lt6 {
        @Override // p000.AbstractC34364Lt6
        /* renamed from: i */
        public boolean mo96235i(View view, float f, long j, C39930dk2 c39930dk2) {
            view.setScaleX(m96240f(f, j, view, c39930dk2));
            return this.f86700h;
        }
    }

    /* renamed from: Lt6$j */
    /* loaded from: classes.dex */
    public static class C5119j extends AbstractC34364Lt6 {
        @Override // p000.AbstractC34364Lt6
        /* renamed from: i */
        public boolean mo96235i(View view, float f, long j, C39930dk2 c39930dk2) {
            view.setScaleY(m96240f(f, j, view, c39930dk2));
            return this.f86700h;
        }
    }

    /* renamed from: Lt6$k */
    /* loaded from: classes.dex */
    public static class C5120k extends AbstractC34364Lt6 {
        @Override // p000.AbstractC34364Lt6
        /* renamed from: i */
        public boolean mo96235i(View view, float f, long j, C39930dk2 c39930dk2) {
            view.setTranslationX(m96240f(f, j, view, c39930dk2));
            return this.f86700h;
        }
    }

    /* renamed from: Lt6$l */
    /* loaded from: classes.dex */
    public static class C5121l extends AbstractC34364Lt6 {
        @Override // p000.AbstractC34364Lt6
        /* renamed from: i */
        public boolean mo96235i(View view, float f, long j, C39930dk2 c39930dk2) {
            view.setTranslationY(m96240f(f, j, view, c39930dk2));
            return this.f86700h;
        }
    }

    /* renamed from: Lt6$m */
    /* loaded from: classes.dex */
    public static class C5122m extends AbstractC34364Lt6 {
        @Override // p000.AbstractC34364Lt6
        /* renamed from: i */
        public boolean mo96235i(View view, float f, long j, C39930dk2 c39930dk2) {
            view.setTranslationZ(m96240f(f, j, view, c39930dk2));
            return this.f86700h;
        }
    }

    /* renamed from: g */
    public static AbstractC34364Lt6 m96239g(String str, SparseArray<C11512a> sparseArray) {
        return new C5111b(str, sparseArray);
    }

    /* renamed from: h */
    public static AbstractC34364Lt6 m96238h(String str, long j) {
        AbstractC34364Lt6 c5116g;
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
            case -40300674:
                if (str.equals("rotation")) {
                    c = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                c5116g = new C5116g();
                break;
            case 1:
                c5116g = new C5117h();
                break;
            case 2:
                c5116g = new C5120k();
                break;
            case 3:
                c5116g = new C5121l();
                break;
            case 4:
                c5116g = new C5122m();
                break;
            case 5:
                c5116g = new C5114e();
                break;
            case 6:
                c5116g = new C5118i();
                break;
            case 7:
                c5116g = new C5119j();
                break;
            case '\b':
                c5116g = new C5115f();
                break;
            case '\t':
                c5116g = new C5112c();
                break;
            case '\n':
                c5116g = new C5113d();
                break;
            case 11:
                c5116g = new C5110a();
                break;
            default:
                return null;
        }
        c5116g.m34498c(j);
        return c5116g;
    }

    /* renamed from: f */
    public float m96240f(float f, long j, View view, C39930dk2 c39930dk2) {
        boolean z;
        this.f86693a.mo34281e(f, this.f86699g);
        float[] fArr = this.f86699g;
        float f2 = fArr[1];
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i == 0) {
            this.f86700h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f86702j)) {
            float m43818a = c39930dk2.m43818a(view, this.f86698f, 0);
            this.f86702j = m43818a;
            if (Float.isNaN(m43818a)) {
                this.f86702j = 0.0f;
            }
        }
        float f3 = (float) ((this.f86702j + (((j - this.f86701i) * 1.0E-9d) * f2)) % 1.0d);
        this.f86702j = f3;
        c39930dk2.m43817b(view, this.f86698f, 0, f3);
        this.f86701i = j;
        float f4 = this.f86699g[0];
        float m34500a = (m34500a(this.f86702j) * f4) + this.f86699g[2];
        if (f4 == 0.0f && i == 0) {
            z = false;
        } else {
            z = true;
        }
        this.f86700h = z;
        return m34500a;
    }

    /* renamed from: i */
    public abstract boolean mo96235i(View view, float f, long j, C39930dk2 c39930dk2);
}
