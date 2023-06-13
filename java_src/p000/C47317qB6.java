package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p000.DB6;
/* renamed from: qB6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47317qB6 {

    /* renamed from: a */
    public C27536e f104870a;

    /* renamed from: qB6$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC27528b {

        /* renamed from: b */
        public WindowInsets f104873b;

        /* renamed from: c */
        public final int f104874c;

        public AbstractC27528b(int i) {
            this.f104874c = i;
        }

        /* renamed from: b */
        public final int m17941b() {
            return this.f104874c;
        }

        /* renamed from: c */
        public void mo17940c(C47317qB6 c47317qB6) {
        }

        /* renamed from: d */
        public void mo17939d(C47317qB6 c47317qB6) {
        }

        /* renamed from: e */
        public abstract DB6 mo17938e(DB6 db6, List<C47317qB6> list);

        /* renamed from: f */
        public C27527a mo17937f(C47317qB6 c47317qB6, C27527a c27527a) {
            return c27527a;
        }
    }

    /* renamed from: qB6$c */
    /* loaded from: classes.dex */
    public static class C27529c extends C27536e {

        /* renamed from: qB6$c$a */
        /* loaded from: classes.dex */
        public static class View$OnApplyWindowInsetsListenerC27530a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public final AbstractC27528b f104875a;

            /* renamed from: b */
            public DB6 f104876b;

            /* renamed from: qB6$c$a$a */
            /* loaded from: classes.dex */
            public class C27531a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a */
                public final /* synthetic */ C47317qB6 f104877a;

                /* renamed from: b */
                public final /* synthetic */ DB6 f104878b;

                /* renamed from: c */
                public final /* synthetic */ DB6 f104879c;

                /* renamed from: d */
                public final /* synthetic */ int f104880d;

                /* renamed from: e */
                public final /* synthetic */ View f104881e;

                public C27531a(C47317qB6 c47317qB6, DB6 db6, DB6 db62, int i, View view) {
                    this.f104877a = c47317qB6;
                    this.f104878b = db6;
                    this.f104879c = db62;
                    this.f104880d = i;
                    this.f104881e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f104877a.m17947d(valueAnimator.getAnimatedFraction());
                    C27529c.m17931i(this.f104881e, C27529c.m17927m(this.f104878b, this.f104879c, this.f104877a.m17949b(), this.f104880d), Collections.singletonList(this.f104877a));
                }
            }

            /* renamed from: qB6$c$a$b */
            /* loaded from: classes.dex */
            public class C27532b extends AnimatorListenerAdapter {

                /* renamed from: a */
                public final /* synthetic */ C47317qB6 f104883a;

                /* renamed from: b */
                public final /* synthetic */ View f104884b;

                public C27532b(C47317qB6 c47317qB6, View view) {
                    this.f104883a = c47317qB6;
                    this.f104884b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f104883a.m17947d(1.0f);
                    C27529c.m17933g(this.f104884b, this.f104883a);
                }
            }

            /* renamed from: qB6$c$a$c */
            /* loaded from: classes.dex */
            public class RunnableC27533c implements Runnable {

                /* renamed from: b */
                public final /* synthetic */ View f104886b;

                /* renamed from: c */
                public final /* synthetic */ C47317qB6 f104887c;

                /* renamed from: d */
                public final /* synthetic */ C27527a f104888d;

                /* renamed from: e */
                public final /* synthetic */ ValueAnimator f104889e;

                public RunnableC27533c(View view, C47317qB6 c47317qB6, C27527a c27527a, ValueAnimator valueAnimator) {
                    this.f104886b = view;
                    this.f104887c = c47317qB6;
                    this.f104888d = c27527a;
                    this.f104889e = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C27529c.m17930j(this.f104886b, this.f104887c, this.f104888d);
                    this.f104889e.start();
                }
            }

            public View$OnApplyWindowInsetsListenerC27530a(View view, AbstractC27528b abstractC27528b) {
                DB6 db6;
                this.f104875a = abstractC27528b;
                DB6 m62534K = C38790bq6.m62534K(view);
                if (m62534K != null) {
                    db6 = new DB6.C1417b(m62534K).m110762a();
                } else {
                    db6 = null;
                }
                this.f104876b = db6;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f104876b = DB6.m110764z(windowInsets, view);
                    return C27529c.m17929k(view, windowInsets);
                }
                DB6 m110764z = DB6.m110764z(windowInsets, view);
                if (this.f104876b == null) {
                    this.f104876b = C38790bq6.m62534K(view);
                }
                if (this.f104876b == null) {
                    this.f104876b = m110764z;
                    return C27529c.m17929k(view, windowInsets);
                }
                AbstractC27528b m17928l = C27529c.m17928l(view);
                if (m17928l != null && Objects.equals(m17928l.f104873b, windowInsets)) {
                    return C27529c.m17929k(view, windowInsets);
                }
                int m17936d = C27529c.m17936d(m110764z, this.f104876b);
                if (m17936d == 0) {
                    return C27529c.m17929k(view, windowInsets);
                }
                DB6 db6 = this.f104876b;
                C47317qB6 c47317qB6 = new C47317qB6(m17936d, new DecelerateInterpolator(), 160L);
                c47317qB6.m17947d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c47317qB6.m17950a());
                C27527a m17935e = C27529c.m17935e(m110764z, db6, m17936d);
                C27529c.m17932h(view, c47317qB6, windowInsets, false);
                duration.addUpdateListener(new C27531a(c47317qB6, m110764z, db6, m17936d, view));
                duration.addListener(new C27532b(c47317qB6, view));
                ViewTreeObserver$OnPreDrawListenerC32615Eh3.m108576a(view, new RunnableC27533c(view, c47317qB6, m17935e, duration));
                this.f104876b = m110764z;
                return C27529c.m17929k(view, windowInsets);
            }
        }

        public C27529c(int i, Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: d */
        public static int m17936d(DB6 db6, DB6 db62) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!db6.m110784f(i2).equals(db62.m110784f(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        /* renamed from: e */
        public static C27527a m17935e(DB6 db6, DB6 db62, int i) {
            D32 m110784f = db6.m110784f(i);
            D32 m110784f2 = db62.m110784f(i);
            return new C27527a(D32.m111005b(Math.min(m110784f.f5126a, m110784f2.f5126a), Math.min(m110784f.f5127b, m110784f2.f5127b), Math.min(m110784f.f5128c, m110784f2.f5128c), Math.min(m110784f.f5129d, m110784f2.f5129d)), D32.m111005b(Math.max(m110784f.f5126a, m110784f2.f5126a), Math.max(m110784f.f5127b, m110784f2.f5127b), Math.max(m110784f.f5128c, m110784f2.f5128c), Math.max(m110784f.f5129d, m110784f2.f5129d)));
        }

        /* renamed from: f */
        public static View.OnApplyWindowInsetsListener m17934f(View view, AbstractC27528b abstractC27528b) {
            return new View$OnApplyWindowInsetsListenerC27530a(view, abstractC27528b);
        }

        /* renamed from: g */
        public static void m17933g(View view, C47317qB6 c47317qB6) {
            AbstractC27528b m17928l = m17928l(view);
            if (m17928l != null) {
                m17928l.mo17940c(c47317qB6);
                if (m17928l.m17941b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m17933g(viewGroup.getChildAt(i), c47317qB6);
                }
            }
        }

        /* renamed from: h */
        public static void m17932h(View view, C47317qB6 c47317qB6, WindowInsets windowInsets, boolean z) {
            AbstractC27528b m17928l = m17928l(view);
            if (m17928l != null) {
                m17928l.f104873b = windowInsets;
                if (!z) {
                    m17928l.mo17939d(c47317qB6);
                    if (m17928l.m17941b() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m17932h(viewGroup.getChildAt(i), c47317qB6, windowInsets, z);
                }
            }
        }

        /* renamed from: i */
        public static void m17931i(View view, DB6 db6, List<C47317qB6> list) {
            AbstractC27528b m17928l = m17928l(view);
            if (m17928l != null) {
                db6 = m17928l.mo17938e(db6, list);
                if (m17928l.m17941b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m17931i(viewGroup.getChildAt(i), db6, list);
                }
            }
        }

        /* renamed from: j */
        public static void m17930j(View view, C47317qB6 c47317qB6, C27527a c27527a) {
            AbstractC27528b m17928l = m17928l(view);
            if (m17928l != null) {
                m17928l.mo17937f(c47317qB6, c27527a);
                if (m17928l.m17941b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m17930j(viewGroup.getChildAt(i), c47317qB6, c27527a);
                }
            }
        }

        /* renamed from: k */
        public static WindowInsets m17929k(View view, WindowInsets windowInsets) {
            if (view.getTag(C34020Kh4.tag_on_apply_window_listener) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: l */
        public static AbstractC27528b m17928l(View view) {
            Object tag = view.getTag(C34020Kh4.tag_window_insets_animation_callback);
            if (tag instanceof View$OnApplyWindowInsetsListenerC27530a) {
                return ((View$OnApplyWindowInsetsListenerC27530a) tag).f104875a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: m */
        public static DB6 m17927m(DB6 db6, DB6 db62, float f, int i) {
            DB6.C1417b c1417b = new DB6.C1417b(db6);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    c1417b.m110761b(i2, db6.m110784f(i2));
                } else {
                    D32 m110784f = db6.m110784f(i2);
                    D32 m110784f2 = db62.m110784f(i2);
                    float f2 = 1.0f - f;
                    c1417b.m110761b(i2, DB6.m110774p(m110784f, (int) (((m110784f.f5126a - m110784f2.f5126a) * f2) + 0.5d), (int) (((m110784f.f5127b - m110784f2.f5127b) * f2) + 0.5d), (int) (((m110784f.f5128c - m110784f2.f5128c) * f2) + 0.5d), (int) (((m110784f.f5129d - m110784f2.f5129d) * f2) + 0.5d)));
                }
            }
            return c1417b.m110762a();
        }

        /* renamed from: n */
        public static void m17926n(View view, AbstractC27528b abstractC27528b) {
            Object tag = view.getTag(C34020Kh4.tag_on_apply_window_listener);
            if (abstractC27528b == null) {
                view.setTag(C34020Kh4.tag_window_insets_animation_callback, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener m17934f = m17934f(view, abstractC27528b);
            view.setTag(C34020Kh4.tag_window_insets_animation_callback, m17934f);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(m17934f);
            }
        }
    }

    /* renamed from: qB6$e */
    /* loaded from: classes.dex */
    public static class C27536e {

        /* renamed from: a */
        public final int f104896a;

        /* renamed from: b */
        public float f104897b;

        /* renamed from: c */
        public final Interpolator f104898c;

        /* renamed from: d */
        public final long f104899d;

        public C27536e(int i, Interpolator interpolator, long j) {
            this.f104896a = i;
            this.f104898c = interpolator;
            this.f104899d = j;
        }

        /* renamed from: a */
        public long mo17920a() {
            return this.f104899d;
        }

        /* renamed from: b */
        public float mo17919b() {
            Interpolator interpolator = this.f104898c;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.f104897b);
            }
            return this.f104897b;
        }

        /* renamed from: c */
        public void mo17918c(float f) {
            this.f104897b = f;
        }
    }

    public C47317qB6(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f104870a = new C27534d(i, interpolator, j);
        } else {
            this.f104870a = new C27529c(i, interpolator, j);
        }
    }

    /* renamed from: c */
    public static void m17948c(View view, AbstractC27528b abstractC27528b) {
        if (Build.VERSION.SDK_INT >= 30) {
            C27534d.m17922g(view, abstractC27528b);
        } else {
            C27529c.m17926n(view, abstractC27528b);
        }
    }

    /* renamed from: e */
    public static C47317qB6 m17946e(WindowInsetsAnimation windowInsetsAnimation) {
        return new C47317qB6(windowInsetsAnimation);
    }

    /* renamed from: a */
    public long m17950a() {
        return this.f104870a.mo17920a();
    }

    /* renamed from: b */
    public float m17949b() {
        return this.f104870a.mo17919b();
    }

    /* renamed from: d */
    public void m17947d(float f) {
        this.f104870a.mo17918c(f);
    }

    /* renamed from: qB6$d */
    /* loaded from: classes.dex */
    public static class C27534d extends C27536e {

        /* renamed from: e */
        public final WindowInsetsAnimation f104891e;

        /* renamed from: qB6$d$a */
        /* loaded from: classes.dex */
        public static class C27535a extends WindowInsetsAnimation.Callback {

            /* renamed from: a */
            public final AbstractC27528b f104892a;

            /* renamed from: b */
            public List<C47317qB6> f104893b;

            /* renamed from: c */
            public ArrayList<C47317qB6> f104894c;

            /* renamed from: d */
            public final HashMap<WindowInsetsAnimation, C47317qB6> f104895d;

            public C27535a(AbstractC27528b abstractC27528b) {
                super(abstractC27528b.m17941b());
                this.f104895d = new HashMap<>();
                this.f104892a = abstractC27528b;
            }

            /* renamed from: a */
            public final C47317qB6 m17921a(WindowInsetsAnimation windowInsetsAnimation) {
                C47317qB6 c47317qB6 = this.f104895d.get(windowInsetsAnimation);
                if (c47317qB6 == null) {
                    C47317qB6 m17946e = C47317qB6.m17946e(windowInsetsAnimation);
                    this.f104895d.put(windowInsetsAnimation, m17946e);
                    return m17946e;
                }
                return c47317qB6;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f104892a.mo17940c(m17921a(windowInsetsAnimation));
                this.f104895d.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f104892a.mo17939d(m17921a(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                float fraction;
                ArrayList<C47317qB6> arrayList = this.f104894c;
                if (arrayList == null) {
                    ArrayList<C47317qB6> arrayList2 = new ArrayList<>(list.size());
                    this.f104894c = arrayList2;
                    this.f104893b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation m114221a = BB6.m114221a(list.get(size));
                    C47317qB6 m17921a = m17921a(m114221a);
                    fraction = m114221a.getFraction();
                    m17921a.m17947d(fraction);
                    this.f104894c.add(m17921a);
                }
                return this.f104892a.mo17938e(DB6.m110765y(windowInsets), this.f104893b).m110766x();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f104892a.mo17937f(m17921a(windowInsetsAnimation), C27527a.m17942d(bounds)).m17943c();
            }
        }

        public C27534d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f104891e = windowInsetsAnimation;
        }

        /* renamed from: d */
        public static WindowInsetsAnimation.Bounds m17925d(C27527a c27527a) {
            C52059yB6.m3862a();
            return C51466xB6.m5722a(c27527a.m17945a().m111002e(), c27527a.m17944b().m111002e());
        }

        /* renamed from: e */
        public static D32 m17924e(WindowInsetsAnimation.Bounds bounds) {
            Insets upperBound;
            upperBound = bounds.getUpperBound();
            return D32.m111003d(upperBound);
        }

        /* renamed from: f */
        public static D32 m17923f(WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            lowerBound = bounds.getLowerBound();
            return D32.m111003d(lowerBound);
        }

        /* renamed from: g */
        public static void m17922g(View view, AbstractC27528b abstractC27528b) {
            C27535a c27535a;
            if (abstractC27528b != null) {
                c27535a = new C27535a(abstractC27528b);
            } else {
                c27535a = null;
            }
            view.setWindowInsetsAnimationCallback(c27535a);
        }

        @Override // p000.C47317qB6.C27536e
        /* renamed from: a */
        public long mo17920a() {
            long durationMillis;
            durationMillis = this.f104891e.getDurationMillis();
            return durationMillis;
        }

        @Override // p000.C47317qB6.C27536e
        /* renamed from: b */
        public float mo17919b() {
            float interpolatedFraction;
            interpolatedFraction = this.f104891e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // p000.C47317qB6.C27536e
        /* renamed from: c */
        public void mo17918c(float f) {
            this.f104891e.setFraction(f);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C27534d(int i, Interpolator interpolator, long j) {
            this(C50280vB6.m9030a(i, interpolator, j));
            C50873wB6.m7270a();
        }
    }

    /* renamed from: qB6$a */
    /* loaded from: classes.dex */
    public static final class C27527a {

        /* renamed from: a */
        public final D32 f104871a;

        /* renamed from: b */
        public final D32 f104872b;

        public C27527a(D32 d32, D32 d322) {
            this.f104871a = d32;
            this.f104872b = d322;
        }

        /* renamed from: d */
        public static C27527a m17942d(WindowInsetsAnimation.Bounds bounds) {
            return new C27527a(bounds);
        }

        /* renamed from: a */
        public D32 m17945a() {
            return this.f104871a;
        }

        /* renamed from: b */
        public D32 m17944b() {
            return this.f104872b;
        }

        /* renamed from: c */
        public WindowInsetsAnimation.Bounds m17943c() {
            return C27534d.m17925d(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f104871a + " upper=" + this.f104872b + "}";
        }

        public C27527a(WindowInsetsAnimation.Bounds bounds) {
            this.f104871a = C27534d.m17923f(bounds);
            this.f104872b = C27534d.m17924e(bounds);
        }
    }

    public C47317qB6(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f104870a = new C27534d(windowInsetsAnimation);
        }
    }
}
