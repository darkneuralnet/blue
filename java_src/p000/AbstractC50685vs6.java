package p000;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C11512a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: vs6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC50685vs6 extends AbstractC41708gk2 {

    /* renamed from: vs6$a */
    /* loaded from: classes.dex */
    public static class C29676a extends AbstractC50685vs6 {
        @Override // p000.AbstractC50685vs6
        /* renamed from: j */
        public void mo7875j(View view, float f) {
            view.setAlpha(m37771a(f));
        }
    }

    /* renamed from: vs6$b */
    /* loaded from: classes.dex */
    public static class C29677b extends AbstractC50685vs6 {

        /* renamed from: h */
        public float[] f114835h = new float[1];

        /* renamed from: i */
        public C11512a f114836i;

        @Override // p000.AbstractC41708gk2
        /* renamed from: c */
        public void mo7877c(Object obj) {
            this.f114836i = (C11512a) obj;
        }

        @Override // p000.AbstractC50685vs6
        /* renamed from: j */
        public void mo7875j(View view, float f) {
            this.f114835h[0] = m37771a(f);
            C46754pF0.m19738b(this.f114836i, view, this.f114835h);
        }
    }

    /* renamed from: vs6$c */
    /* loaded from: classes.dex */
    public static class C29678c extends AbstractC50685vs6 {
        @Override // p000.AbstractC50685vs6
        /* renamed from: j */
        public void mo7875j(View view, float f) {
            view.setElevation(m37771a(f));
        }
    }

    /* renamed from: vs6$d */
    /* loaded from: classes.dex */
    public static class C29679d extends AbstractC50685vs6 {
        @Override // p000.AbstractC50685vs6
        /* renamed from: j */
        public void mo7875j(View view, float f) {
        }

        /* renamed from: k */
        public void m7876k(View view, float f, double d, double d2) {
            view.setRotation(m37771a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: vs6$e */
    /* loaded from: classes.dex */
    public static class C29680e extends AbstractC50685vs6 {

        /* renamed from: h */
        public boolean f114837h = false;

        @Override // p000.AbstractC50685vs6
        /* renamed from: j */
        public void mo7875j(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m37771a(f));
            } else if (this.f114837h) {
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f114837h = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(m37771a(f)));
                    } catch (IllegalAccessException e) {
                        Log.e("ViewOscillator", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewOscillator", "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    /* renamed from: vs6$f */
    /* loaded from: classes.dex */
    public static class C29681f extends AbstractC50685vs6 {
        @Override // p000.AbstractC50685vs6
        /* renamed from: j */
        public void mo7875j(View view, float f) {
            view.setRotation(m37771a(f));
        }
    }

    /* renamed from: vs6$g */
    /* loaded from: classes.dex */
    public static class C29682g extends AbstractC50685vs6 {
        @Override // p000.AbstractC50685vs6
        /* renamed from: j */
        public void mo7875j(View view, float f) {
            view.setRotationX(m37771a(f));
        }
    }

    /* renamed from: vs6$h */
    /* loaded from: classes.dex */
    public static class C29683h extends AbstractC50685vs6 {
        @Override // p000.AbstractC50685vs6
        /* renamed from: j */
        public void mo7875j(View view, float f) {
            view.setRotationY(m37771a(f));
        }
    }

    /* renamed from: vs6$i */
    /* loaded from: classes.dex */
    public static class C29684i extends AbstractC50685vs6 {
        @Override // p000.AbstractC50685vs6
        /* renamed from: j */
        public void mo7875j(View view, float f) {
            view.setScaleX(m37771a(f));
        }
    }

    /* renamed from: vs6$j */
    /* loaded from: classes.dex */
    public static class C29685j extends AbstractC50685vs6 {
        @Override // p000.AbstractC50685vs6
        /* renamed from: j */
        public void mo7875j(View view, float f) {
            view.setScaleY(m37771a(f));
        }
    }

    /* renamed from: vs6$k */
    /* loaded from: classes.dex */
    public static class C29686k extends AbstractC50685vs6 {
        @Override // p000.AbstractC50685vs6
        /* renamed from: j */
        public void mo7875j(View view, float f) {
            view.setTranslationX(m37771a(f));
        }
    }

    /* renamed from: vs6$l */
    /* loaded from: classes.dex */
    public static class C29687l extends AbstractC50685vs6 {
        @Override // p000.AbstractC50685vs6
        /* renamed from: j */
        public void mo7875j(View view, float f) {
            view.setTranslationY(m37771a(f));
        }
    }

    /* renamed from: vs6$m */
    /* loaded from: classes.dex */
    public static class C29688m extends AbstractC50685vs6 {
        @Override // p000.AbstractC50685vs6
        /* renamed from: j */
        public void mo7875j(View view, float f) {
            view.setTranslationZ(m37771a(f));
        }
    }

    /* renamed from: i */
    public static AbstractC50685vs6 m7878i(String str) {
        if (str.startsWith("CUSTOM")) {
            return new C29677b();
        }
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
            case -40300674:
                if (str.equals("rotation")) {
                    c = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\n';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C29682g();
            case 1:
                return new C29683h();
            case 2:
                return new C29686k();
            case 3:
                return new C29687l();
            case 4:
                return new C29688m();
            case 5:
                return new C29680e();
            case 6:
                return new C29684i();
            case 7:
                return new C29685j();
            case '\b':
                return new C29676a();
            case '\t':
                return new C29681f();
            case '\n':
                return new C29678c();
            case 11:
                return new C29679d();
            case '\f':
                return new C29676a();
            case '\r':
                return new C29676a();
            default:
                return null;
        }
    }

    /* renamed from: j */
    public abstract void mo7875j(View view, float f);
}
