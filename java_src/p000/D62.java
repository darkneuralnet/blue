package p000;

import android.view.animation.Interpolator;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: D62 */
/* loaded from: classes4.dex */
public abstract class D62 {

    /* renamed from: b */
    public static final D62 f5245b = new C1386a("LINEAR", 0);

    /* renamed from: c */
    public static final D62 f5246c = new C1387b("OVERSHOOT", 1);

    /* renamed from: d */
    public static final D62 f5247d = new C1388c("ACCELERATE", 2);

    /* renamed from: e */
    public static final D62 f5248e = new C1389d("DECELERATE", 3);

    /* renamed from: f */
    public static final D62 f5249f = new C1390e("ACCELERATE_DECELERATE", 4);

    /* renamed from: g */
    public static final D62 f5250g = new C1391f("HESITATE", 5);

    /* renamed from: h */
    public static final D62 f5251h = new C1392g("FAST_SLOW", 6);

    /* renamed from: i */
    public static final D62 f5252i = new C1393h("ELASTIC", 7);

    /* renamed from: j */
    public static final /* synthetic */ D62[] f5253j = m110911a();

    /* renamed from: D62$a */
    /* loaded from: classes4.dex */
    public enum C1386a extends D62 {
        @Override // p000.D62
        /* renamed from: b */
        public Interpolator mo110910b() {
            return ZX3.f48723a;
        }

        public C1386a(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: D62$b */
    /* loaded from: classes4.dex */
    public enum C1387b extends D62 {
        @Override // p000.D62
        /* renamed from: b */
        public Interpolator mo110910b() {
            return ZX3.f48724b;
        }

        public C1387b(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: D62$c */
    /* loaded from: classes4.dex */
    public enum C1388c extends D62 {
        @Override // p000.D62
        /* renamed from: b */
        public Interpolator mo110910b() {
            return ZX3.f48726d;
        }

        public C1388c(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: D62$d */
    /* loaded from: classes4.dex */
    public enum C1389d extends D62 {
        @Override // p000.D62
        /* renamed from: b */
        public Interpolator mo110910b() {
            return ZX3.f48725c;
        }

        public C1389d(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: D62$e */
    /* loaded from: classes4.dex */
    public enum C1390e extends D62 {
        @Override // p000.D62
        /* renamed from: b */
        public Interpolator mo110910b() {
            return ZX3.f48727e;
        }

        public C1390e(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: D62$f */
    /* loaded from: classes4.dex */
    public enum C1391f extends D62 {
        @Override // p000.D62
        /* renamed from: b */
        public Interpolator mo110910b() {
            return ZX3.f48728f;
        }

        public C1391f(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: D62$g */
    /* loaded from: classes4.dex */
    public enum C1392g extends D62 {
        @Override // p000.D62
        /* renamed from: b */
        public Interpolator mo110910b() {
            return ZX3.f48729g;
        }

        public C1392g(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: D62$h */
    /* loaded from: classes4.dex */
    public enum C1393h extends D62 {
        @Override // p000.D62
        /* renamed from: b */
        public Interpolator mo110910b() {
            return ZX3.f48730h;
        }

        public C1393h(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ D62[] m110911a() {
        return new D62[]{f5245b, f5246c, f5247d, f5248e, f5249f, f5250g, f5251h, f5252i};
    }

    public static D62 valueOf(String str) {
        return (D62) Enum.valueOf(D62.class, str);
    }

    public static D62[] values() {
        return (D62[]) f5253j.clone();
    }

    /* renamed from: b */
    public abstract Interpolator mo110910b();

    public D62(String str, int i) {
    }
}
