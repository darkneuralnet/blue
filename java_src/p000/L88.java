package p000;
/* renamed from: L88 */
/* loaded from: classes6.dex */
public final class L88 {

    /* renamed from: h */
    public static final Object f20801h = new Object();

    /* renamed from: a */
    public final String f20802a;

    /* renamed from: b */
    public final Q78 f20803b;

    /* renamed from: c */
    public final Object f20804c;

    /* renamed from: d */
    public final Object f20805d;

    /* renamed from: e */
    public final Object f20806e = new Object();

    /* renamed from: f */
    public volatile Object f20807f = null;

    /* renamed from: g */
    public volatile Object f20808g = null;

    public /* synthetic */ L88(String str, Object obj, Object obj2, Q78 q78, C50253v88 c50253v88) {
        this.f20802a = str;
        this.f20804c = obj;
        this.f20805d = obj2;
        this.f20803b = q78;
    }

    /* renamed from: a */
    public final Object m97658a(Object obj) {
        Object obj2;
        synchronized (this.f20806e) {
        }
        if (obj != null) {
            return obj;
        }
        if (C41360g88.f81679a == null) {
            return this.f20804c;
        }
        synchronized (f20801h) {
            if (C32844Fg7.m106751a()) {
                if (this.f20808g == null) {
                    obj2 = this.f20804c;
                } else {
                    obj2 = this.f20808g;
                }
                return obj2;
            }
            try {
                for (L88 l88 : C37795a98.m71830b()) {
                    if (!C32844Fg7.m106751a()) {
                        Object obj3 = null;
                        try {
                            Q78 q78 = l88.f20803b;
                            if (q78 != null) {
                                obj3 = q78.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f20801h) {
                            l88.f20808g = obj3;
                        }
                    } else {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                }
            } catch (SecurityException unused2) {
            }
            Q78 q782 = this.f20803b;
            if (q782 == null) {
                return this.f20804c;
            }
            try {
                return q782.zza();
            } catch (IllegalStateException unused3) {
                return this.f20804c;
            } catch (SecurityException unused4) {
                return this.f20804c;
            }
        }
    }

    /* renamed from: b */
    public final String m97657b() {
        return this.f20802a;
    }
}
