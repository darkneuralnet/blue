package p000;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C11512a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: Gt6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC33194Gt6 extends XN5 {

    /* renamed from: Gt6$a */
    /* loaded from: classes.dex */
    public static class C2970a extends AbstractC33194Gt6 {
        @Override // p000.AbstractC33194Gt6
        /* renamed from: h */
        public void mo104609h(View view, float f) {
            view.setAlpha(m77078a(f));
        }
    }

    /* renamed from: Gt6$b */
    /* loaded from: classes.dex */
    public static class C2971b extends AbstractC33194Gt6 {

        /* renamed from: f */
        public String f12587f;

        /* renamed from: g */
        public SparseArray<C11512a> f12588g;

        /* renamed from: h */
        public float[] f12589h;

        public C2971b(String str, SparseArray<C11512a> sparseArray) {
            this.f12587f = str.split(",")[1];
            this.f12588g = sparseArray;
        }

        @Override // p000.XN5
        /* renamed from: c */
        public void mo77076c(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // p000.XN5
        /* renamed from: e */
        public void mo77074e(int i) {
            float[] fArr;
            int size = this.f12588g.size();
            int m67854h = this.f12588g.valueAt(0).m67854h();
            double[] dArr = new double[size];
            this.f12589h = new float[m67854h];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, m67854h);
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = this.f12588g.keyAt(i2) * 0.01d;
                this.f12588g.valueAt(i2).m67856f(this.f12589h);
                int i3 = 0;
                while (true) {
                    if (i3 < this.f12589h.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.f43093a = AbstractC42603iF0.m34285a(i, dArr, dArr2);
        }

        @Override // p000.AbstractC33194Gt6
        /* renamed from: h */
        public void mo104609h(View view, float f) {
            this.f43093a.mo34281e(f, this.f12589h);
            C46754pF0.m19738b(this.f12588g.valueAt(0), view, this.f12589h);
        }

        /* renamed from: i */
        public void m104611i(int i, C11512a c11512a) {
            this.f12588g.append(i, c11512a);
        }
    }

    /* renamed from: Gt6$c */
    /* loaded from: classes.dex */
    public static class C2972c extends AbstractC33194Gt6 {
        @Override // p000.AbstractC33194Gt6
        /* renamed from: h */
        public void mo104609h(View view, float f) {
            view.setElevation(m77078a(f));
        }
    }

    /* renamed from: Gt6$d */
    /* loaded from: classes.dex */
    public static class C2973d extends AbstractC33194Gt6 {
        @Override // p000.AbstractC33194Gt6
        /* renamed from: h */
        public void mo104609h(View view, float f) {
        }

        /* renamed from: i */
        public void m104610i(View view, float f, double d, double d2) {
            view.setRotation(m77078a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: Gt6$e */
    /* loaded from: classes.dex */
    public static class C2974e extends AbstractC33194Gt6 {
        @Override // p000.AbstractC33194Gt6
        /* renamed from: h */
        public void mo104609h(View view, float f) {
            view.setPivotX(m77078a(f));
        }
    }

    /* renamed from: Gt6$f */
    /* loaded from: classes.dex */
    public static class C2975f extends AbstractC33194Gt6 {
        @Override // p000.AbstractC33194Gt6
        /* renamed from: h */
        public void mo104609h(View view, float f) {
            view.setPivotY(m77078a(f));
        }
    }

    /* renamed from: Gt6$g */
    /* loaded from: classes.dex */
    public static class C2976g extends AbstractC33194Gt6 {

        /* renamed from: f */
        public boolean f12590f = false;

        @Override // p000.AbstractC33194Gt6
        /* renamed from: h */
        public void mo104609h(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m77078a(f));
            } else if (this.f12590f) {
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f12590f = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(m77078a(f)));
                    } catch (IllegalAccessException e) {
                        Log.e("ViewSpline", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewSpline", "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    /* renamed from: Gt6$h */
    /* loaded from: classes.dex */
    public static class C2977h extends AbstractC33194Gt6 {
        @Override // p000.AbstractC33194Gt6
        /* renamed from: h */
        public void mo104609h(View view, float f) {
            view.setRotation(m77078a(f));
        }
    }

    /* renamed from: Gt6$i */
    /* loaded from: classes.dex */
    public static class C2978i extends AbstractC33194Gt6 {
        @Override // p000.AbstractC33194Gt6
        /* renamed from: h */
        public void mo104609h(View view, float f) {
            view.setRotationX(m77078a(f));
        }
    }

    /* renamed from: Gt6$j */
    /* loaded from: classes.dex */
    public static class C2979j extends AbstractC33194Gt6 {
        @Override // p000.AbstractC33194Gt6
        /* renamed from: h */
        public void mo104609h(View view, float f) {
            view.setRotationY(m77078a(f));
        }
    }

    /* renamed from: Gt6$k */
    /* loaded from: classes.dex */
    public static class C2980k extends AbstractC33194Gt6 {
        @Override // p000.AbstractC33194Gt6
        /* renamed from: h */
        public void mo104609h(View view, float f) {
            view.setScaleX(m77078a(f));
        }
    }

    /* renamed from: Gt6$l */
    /* loaded from: classes.dex */
    public static class C2981l extends AbstractC33194Gt6 {
        @Override // p000.AbstractC33194Gt6
        /* renamed from: h */
        public void mo104609h(View view, float f) {
            view.setScaleY(m77078a(f));
        }
    }

    /* renamed from: Gt6$m */
    /* loaded from: classes.dex */
    public static class C2982m extends AbstractC33194Gt6 {
        @Override // p000.AbstractC33194Gt6
        /* renamed from: h */
        public void mo104609h(View view, float f) {
            view.setTranslationX(m77078a(f));
        }
    }

    /* renamed from: Gt6$n */
    /* loaded from: classes.dex */
    public static class C2983n extends AbstractC33194Gt6 {
        @Override // p000.AbstractC33194Gt6
        /* renamed from: h */
        public void mo104609h(View view, float f) {
            view.setTranslationY(m77078a(f));
        }
    }

    /* renamed from: Gt6$o */
    /* loaded from: classes.dex */
    public static class C2984o extends AbstractC33194Gt6 {
        @Override // p000.AbstractC33194Gt6
        /* renamed from: h */
        public void mo104609h(View view, float f) {
            view.setTranslationZ(m77078a(f));
        }
    }

    /* renamed from: f */
    public static AbstractC33194Gt6 m104613f(String str, SparseArray<C11512a> sparseArray) {
        return new C2971b(str, sparseArray);
    }

    /* renamed from: g */
    public static AbstractC33194Gt6 m104612g(String str) {
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
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = '\r';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C2978i();
            case 1:
                return new C2979j();
            case 2:
                return new C2982m();
            case 3:
                return new C2983n();
            case 4:
                return new C2984o();
            case 5:
                return new C2976g();
            case 6:
                return new C2980k();
            case 7:
                return new C2981l();
            case '\b':
                return new C2970a();
            case '\t':
                return new C2974e();
            case '\n':
                return new C2975f();
            case 11:
                return new C2977h();
            case '\f':
                return new C2972c();
            case '\r':
                return new C2973d();
            case 14:
                return new C2970a();
            case 15:
                return new C2970a();
            default:
                return null;
        }
    }

    /* renamed from: h */
    public abstract void mo104609h(View view, float f);
}
