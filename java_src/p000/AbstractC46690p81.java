package p000;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;
import p000.AbstractC46690p81;
import p000.C22398gf;
/* renamed from: p81  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC46690p81<T extends AbstractC46690p81<T>> implements C22398gf.InterfaceC22400b {

    /* renamed from: m */
    public static final AbstractC27170r f103155m = new C27158f("translationX");

    /* renamed from: n */
    public static final AbstractC27170r f103156n = new C27159g("translationY");

    /* renamed from: o */
    public static final AbstractC27170r f103157o = new C27160h("translationZ");

    /* renamed from: p */
    public static final AbstractC27170r f103158p = new C27161i("scaleX");

    /* renamed from: q */
    public static final AbstractC27170r f103159q = new C27162j("scaleY");

    /* renamed from: r */
    public static final AbstractC27170r f103160r = new C27163k("rotation");

    /* renamed from: s */
    public static final AbstractC27170r f103161s = new C27164l("rotationX");

    /* renamed from: t */
    public static final AbstractC27170r f103162t = new C27165m("rotationY");

    /* renamed from: u */
    public static final AbstractC27170r f103163u = new C27166n("x");

    /* renamed from: v */
    public static final AbstractC27170r f103164v = new C27153a("y");

    /* renamed from: w */
    public static final AbstractC27170r f103165w = new C27154b("z");

    /* renamed from: x */
    public static final AbstractC27170r f103166x = new C27155c("alpha");

    /* renamed from: y */
    public static final AbstractC27170r f103167y = new C27156d("scrollX");

    /* renamed from: z */
    public static final AbstractC27170r f103168z = new C27157e("scrollY");

    /* renamed from: d */
    public final Object f103172d;

    /* renamed from: e */
    public final AbstractC48330ru1 f103173e;

    /* renamed from: j */
    public float f103178j;

    /* renamed from: a */
    public float f103169a = 0.0f;

    /* renamed from: b */
    public float f103170b = Float.MAX_VALUE;

    /* renamed from: c */
    public boolean f103171c = false;

    /* renamed from: f */
    public boolean f103174f = false;

    /* renamed from: g */
    public float f103175g = Float.MAX_VALUE;

    /* renamed from: h */
    public float f103176h = -Float.MAX_VALUE;

    /* renamed from: i */
    public long f103177i = 0;

    /* renamed from: k */
    public final ArrayList<InterfaceC27168p> f103179k = new ArrayList<>();

    /* renamed from: l */
    public final ArrayList<InterfaceC27169q> f103180l = new ArrayList<>();

    /* renamed from: p81$a */
    /* loaded from: classes.dex */
    public static class C27153a extends AbstractC27170r {
        public C27153a(String str) {
            super(str, null);
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: c */
        public float mo15090a(View view) {
            return view.getY();
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: d */
        public void mo15089b(View view, float f) {
            view.setY(f);
        }
    }

    /* renamed from: p81$b */
    /* loaded from: classes.dex */
    public static class C27154b extends AbstractC27170r {
        public C27154b(String str) {
            super(str, null);
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: c */
        public float mo15090a(View view) {
            return C38790bq6.m62518S(view);
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: d */
        public void mo15089b(View view, float f) {
            C38790bq6.m62488e1(view, f);
        }
    }

    /* renamed from: p81$c */
    /* loaded from: classes.dex */
    public static class C27155c extends AbstractC27170r {
        public C27155c(String str) {
            super(str, null);
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: c */
        public float mo15090a(View view) {
            return view.getAlpha();
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: d */
        public void mo15089b(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* renamed from: p81$d */
    /* loaded from: classes.dex */
    public static class C27156d extends AbstractC27170r {
        public C27156d(String str) {
            super(str, null);
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: c */
        public float mo15090a(View view) {
            return view.getScrollX();
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: d */
        public void mo15089b(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* renamed from: p81$e */
    /* loaded from: classes.dex */
    public static class C27157e extends AbstractC27170r {
        public C27157e(String str) {
            super(str, null);
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: c */
        public float mo15090a(View view) {
            return view.getScrollY();
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: d */
        public void mo15089b(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* renamed from: p81$f */
    /* loaded from: classes.dex */
    public static class C27158f extends AbstractC27170r {
        public C27158f(String str) {
            super(str, null);
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: c */
        public float mo15090a(View view) {
            return view.getTranslationX();
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: d */
        public void mo15089b(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* renamed from: p81$g */
    /* loaded from: classes.dex */
    public static class C27159g extends AbstractC27170r {
        public C27159g(String str) {
            super(str, null);
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: c */
        public float mo15090a(View view) {
            return view.getTranslationY();
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: d */
        public void mo15089b(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* renamed from: p81$h */
    /* loaded from: classes.dex */
    public static class C27160h extends AbstractC27170r {
        public C27160h(String str) {
            super(str, null);
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: c */
        public float mo15090a(View view) {
            return C38790bq6.m62524P(view);
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: d */
        public void mo15089b(View view, float f) {
            C38790bq6.m62497b1(view, f);
        }
    }

    /* renamed from: p81$i */
    /* loaded from: classes.dex */
    public static class C27161i extends AbstractC27170r {
        public C27161i(String str) {
            super(str, null);
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: c */
        public float mo15090a(View view) {
            return view.getScaleX();
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: d */
        public void mo15089b(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* renamed from: p81$j */
    /* loaded from: classes.dex */
    public static class C27162j extends AbstractC27170r {
        public C27162j(String str) {
            super(str, null);
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: c */
        public float mo15090a(View view) {
            return view.getScaleY();
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: d */
        public void mo15089b(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* renamed from: p81$k */
    /* loaded from: classes.dex */
    public static class C27163k extends AbstractC27170r {
        public C27163k(String str) {
            super(str, null);
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: c */
        public float mo15090a(View view) {
            return view.getRotation();
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: d */
        public void mo15089b(View view, float f) {
            view.setRotation(f);
        }
    }

    /* renamed from: p81$l */
    /* loaded from: classes.dex */
    public static class C27164l extends AbstractC27170r {
        public C27164l(String str) {
            super(str, null);
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: c */
        public float mo15090a(View view) {
            return view.getRotationX();
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: d */
        public void mo15089b(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* renamed from: p81$m */
    /* loaded from: classes.dex */
    public static class C27165m extends AbstractC27170r {
        public C27165m(String str) {
            super(str, null);
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: c */
        public float mo15090a(View view) {
            return view.getRotationY();
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: d */
        public void mo15089b(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* renamed from: p81$n */
    /* loaded from: classes.dex */
    public static class C27166n extends AbstractC27170r {
        public C27166n(String str) {
            super(str, null);
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: c */
        public float mo15090a(View view) {
            return view.getX();
        }

        @Override // p000.AbstractC48330ru1
        /* renamed from: d */
        public void mo15089b(View view, float f) {
            view.setX(f);
        }
    }

    /* renamed from: p81$o */
    /* loaded from: classes.dex */
    public static class C27167o {

        /* renamed from: a */
        public float f103181a;

        /* renamed from: b */
        public float f103182b;
    }

    /* renamed from: p81$p */
    /* loaded from: classes.dex */
    public interface InterfaceC27168p {
        /* renamed from: a */
        void m19890a(AbstractC46690p81 abstractC46690p81, boolean z, float f, float f2);
    }

    /* renamed from: p81$q */
    /* loaded from: classes.dex */
    public interface InterfaceC27169q {
        /* renamed from: a */
        void m19889a(AbstractC46690p81 abstractC46690p81, float f, float f2);
    }

    /* renamed from: p81$r */
    /* loaded from: classes.dex */
    public static abstract class AbstractC27170r extends AbstractC48330ru1<View> {
        public /* synthetic */ AbstractC27170r(String str, C27158f c27158f) {
            this(str);
        }

        public AbstractC27170r(String str) {
            super(str);
        }
    }

    public <K> AbstractC46690p81(K k, AbstractC48330ru1<K> abstractC48330ru1) {
        this.f103172d = k;
        this.f103173e = abstractC48330ru1;
        if (abstractC48330ru1 != f103160r && abstractC48330ru1 != f103161s && abstractC48330ru1 != f103162t) {
            if (abstractC48330ru1 == f103166x) {
                this.f103178j = 0.00390625f;
                return;
            } else if (abstractC48330ru1 != f103158p && abstractC48330ru1 != f103159q) {
                this.f103178j = 1.0f;
                return;
            } else {
                this.f103178j = 0.00390625f;
                return;
            }
        }
        this.f103178j = 0.1f;
    }

    /* renamed from: f */
    public static <T> void m19924f(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // p000.C22398gf.InterfaceC22400b
    /* renamed from: a */
    public boolean mo19929a(long j) {
        long j2 = this.f103177i;
        if (j2 == 0) {
            this.f103177i = j;
            m19923g(this.f103170b);
            return false;
        }
        this.f103177i = j;
        boolean mo19919k = mo19919k(j - j2);
        float min = Math.min(this.f103170b, this.f103175g);
        this.f103170b = min;
        float max = Math.max(min, this.f103176h);
        this.f103170b = max;
        m19923g(max);
        if (mo19919k) {
            m19928b(false);
        }
        return mo19919k;
    }

    /* renamed from: b */
    public final void m19928b(boolean z) {
        this.f103174f = false;
        C22398gf.m37932d().m37929g(this);
        this.f103177i = 0L;
        this.f103171c = false;
        for (int i = 0; i < this.f103179k.size(); i++) {
            if (this.f103179k.get(i) != null) {
                this.f103179k.get(i).m19890a(this, z, this.f103170b, this.f103169a);
            }
        }
        m19924f(this.f103179k);
    }

    /* renamed from: c */
    public final float m19927c() {
        return this.f103173e.mo15090a(this.f103172d);
    }

    /* renamed from: d */
    public float m19926d() {
        return this.f103178j * 0.75f;
    }

    /* renamed from: e */
    public boolean m19925e() {
        return this.f103174f;
    }

    /* renamed from: g */
    public void m19923g(float f) {
        this.f103173e.mo15089b(this.f103172d, f);
        for (int i = 0; i < this.f103180l.size(); i++) {
            if (this.f103180l.get(i) != null) {
                this.f103180l.get(i).m19889a(this, this.f103170b, this.f103169a);
            }
        }
        m19924f(this.f103180l);
    }

    /* renamed from: h */
    public T m19922h(float f) {
        this.f103170b = f;
        this.f103171c = true;
        return this;
    }

    /* renamed from: i */
    public void mo19921i() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!this.f103174f) {
                m19920j();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    /* renamed from: j */
    public final void m19920j() {
        if (!this.f103174f) {
            this.f103174f = true;
            if (!this.f103171c) {
                this.f103170b = m19927c();
            }
            float f = this.f103170b;
            if (f <= this.f103175g && f >= this.f103176h) {
                C22398gf.m37932d().m37935a(this, 0L);
                return;
            }
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
    }

    /* renamed from: k */
    public abstract boolean mo19919k(long j);
}
