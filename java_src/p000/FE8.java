package p000;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.WeakHashMap;
/* renamed from: FE8 */
/* loaded from: classes6.dex */
public final class FE8 {

    /* renamed from: a */
    public static final J38 f9066a = new J38("tiktok_systrace");

    /* renamed from: b */
    public static final WeakHashMap<Thread, C39036cF8> f9067b = new WeakHashMap<>();

    /* renamed from: c */
    public static final ThreadLocal<C39036cF8> f9068c = new C48531sE8();

    /* renamed from: d */
    public static final Deque<Object> f9069d = new ArrayDeque();

    /* renamed from: e */
    public static final Deque<PC8> f9070e = new ArrayDeque();

    /* renamed from: f */
    public static final Object f9071f = new Object();

    /* renamed from: g */
    public static final Runnable f9072g = WD8.f40589b;

    /* renamed from: h */
    public static final Runnable f9073h = RunnableC42009hE8.f84911b;

    /* renamed from: a */
    public static PC8 m107402a() {
        return f9068c.get().f60337b;
    }

    /* renamed from: b */
    public static PC8 m107401b() {
        PC8 m107402a = m107402a();
        if (m107402a == null) {
            return new C43761kB8();
        }
        return m107402a;
    }

    /* renamed from: c */
    public static PC8 m107400c(PC8 pc8) {
        return m107392k(f9068c.get(), pc8);
    }

    /* renamed from: d */
    public static String m107399d(PC8 pc8) {
        if (pc8.zza() == null) {
            return pc8.zzb();
        }
        String m107399d = m107399d(pc8.zza());
        String zzb = pc8.zzb();
        StringBuilder sb = new StringBuilder(String.valueOf(m107399d).length() + 4 + String.valueOf(zzb).length());
        sb.append(m107399d);
        sb.append(" -> ");
        sb.append(zzb);
        return sb.toString();
    }

    /* renamed from: f */
    public static void m107397f(PC8 pc8) {
        pc8.getClass();
        C39036cF8 c39036cF8 = f9068c.get();
        PC8 pc82 = c39036cF8.f60337b;
        String zzb = pc82.zzb();
        String zzb2 = pc8.zzb();
        if (pc8 == pc82) {
            m107392k(c39036cF8, pc82.zza());
            return;
        }
        throw new IllegalStateException(C40302eM8.m42992b("Wrong trace, expected %s but got %s", zzb, zzb2));
    }

    /* renamed from: g */
    public static /* synthetic */ void m107396g() {
        Object remove = f9069d.remove();
        if (remove == f9071f) {
            f9070e.pop();
        } else {
            f9070e.push((PC8) remove);
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m107395h() {
        m107400c(null);
        f9069d.clear();
        Q48.m88952a().removeCallbacks(f9072g);
        f9070e.clear();
    }

    /* renamed from: i */
    public static UB8 m107394i(String str, int i) {
        return m107393j(str, 1, C48513sC8.f108449c, true);
    }

    /* renamed from: j */
    public static UB8 m107393j(String str, int i, EC8 ec8, boolean z) {
        PC8 mo7268D2;
        PC8 m107402a = m107402a();
        if (m107402a == null) {
            mo7268D2 = new C50875wB8(str, ec8, z);
        } else if (m107402a instanceof InterfaceC41864gz8) {
            mo7268D2 = ((InterfaceC41864gz8) m107402a).mo7267T0(str, ec8, z);
        } else {
            mo7268D2 = m107402a.mo7268D2(str, ec8);
        }
        m107400c(mo7268D2);
        return new UB8(mo7268D2);
    }

    /* renamed from: k */
    public static PC8 m107392k(C39036cF8 c39036cF8, PC8 pc8) {
        boolean m26385a;
        PC8 pc82 = c39036cF8.f60337b;
        if (pc82 == pc8) {
            return pc8;
        }
        if (pc82 == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                m26385a = C49717uE8.m10520a();
            } else {
                m26385a = C44878m48.m26385a(f9066a);
            }
            c39036cF8.f60336a = m26385a;
        }
        if (c39036cF8.f60336a) {
            m107388o(pc82, pc8);
        }
        c39036cF8.f60337b = pc8;
        return pc82;
    }

    @TargetApi(18)
    /* renamed from: l */
    public static void m107391l(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    @TargetApi(18)
    /* renamed from: m */
    public static void m107390m(PC8 pc8) {
        if (pc8.zza() != null) {
            m107390m(pc8.zza());
        }
        m107391l(pc8.zzb());
    }

    @TargetApi(18)
    /* renamed from: n */
    public static void m107389n(PC8 pc8) {
        Trace.endSection();
        if (pc8.zza() != null) {
            m107389n(pc8.zza());
        }
    }

    @TargetApi(18)
    /* renamed from: o */
    public static void m107388o(PC8 pc8, PC8 pc82) {
        if (pc8 != null) {
            if (pc82 != null) {
                if (pc8.zza() == pc82) {
                    Trace.endSection();
                    return;
                } else if (pc8 == pc82.zza()) {
                    m107391l(pc82.zzb());
                    return;
                }
            }
            m107389n(pc8);
        }
        if (pc82 != null) {
            m107390m(pc82);
        }
    }
}
