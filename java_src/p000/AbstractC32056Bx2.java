package p000;

import android.util.Log;
/* renamed from: Bx2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC32056Bx2 {

    /* renamed from: a */
    public static final Object f3092a = new Object();

    /* renamed from: b */
    public static volatile AbstractC32056Bx2 f3093b = null;

    /* renamed from: c */
    public static final int f3094c = 20;

    /* renamed from: Bx2$a */
    /* loaded from: classes.dex */
    public static class C0776a extends AbstractC32056Bx2 {

        /* renamed from: d */
        public final int f3095d;

        public C0776a(int i) {
            super(i);
            this.f3095d = i;
        }

        @Override // p000.AbstractC32056Bx2
        /* renamed from: a */
        public void mo113269a(String str, String str2) {
            if (this.f3095d <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // p000.AbstractC32056Bx2
        /* renamed from: b */
        public void mo113268b(String str, String str2, Throwable th) {
            if (this.f3095d <= 3) {
                Log.d(str, str2, th);
            }
        }

        @Override // p000.AbstractC32056Bx2
        /* renamed from: c */
        public void mo113267c(String str, String str2) {
            if (this.f3095d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // p000.AbstractC32056Bx2
        /* renamed from: d */
        public void mo113266d(String str, String str2, Throwable th) {
            if (this.f3095d <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // p000.AbstractC32056Bx2
        /* renamed from: f */
        public void mo113265f(String str, String str2) {
            if (this.f3095d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // p000.AbstractC32056Bx2
        /* renamed from: g */
        public void mo113264g(String str, String str2, Throwable th) {
            if (this.f3095d <= 4) {
                Log.i(str, str2, th);
            }
        }

        @Override // p000.AbstractC32056Bx2
        /* renamed from: j */
        public void mo113263j(String str, String str2) {
            if (this.f3095d <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // p000.AbstractC32056Bx2
        /* renamed from: k */
        public void mo113262k(String str, String str2) {
            if (this.f3095d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // p000.AbstractC32056Bx2
        /* renamed from: l */
        public void mo113261l(String str, String str2, Throwable th) {
            if (this.f3095d <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    public AbstractC32056Bx2(int i) {
    }

    /* renamed from: e */
    public static AbstractC32056Bx2 m113272e() {
        AbstractC32056Bx2 abstractC32056Bx2;
        synchronized (f3092a) {
            if (f3093b == null) {
                f3093b = new C0776a(3);
            }
            abstractC32056Bx2 = f3093b;
        }
        return abstractC32056Bx2;
    }

    /* renamed from: h */
    public static void m113271h(AbstractC32056Bx2 abstractC32056Bx2) {
        synchronized (f3092a) {
            f3093b = abstractC32056Bx2;
        }
    }

    /* renamed from: i */
    public static String m113270i(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = f3094c;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public abstract void mo113269a(String str, String str2);

    /* renamed from: b */
    public abstract void mo113268b(String str, String str2, Throwable th);

    /* renamed from: c */
    public abstract void mo113267c(String str, String str2);

    /* renamed from: d */
    public abstract void mo113266d(String str, String str2, Throwable th);

    /* renamed from: f */
    public abstract void mo113265f(String str, String str2);

    /* renamed from: g */
    public abstract void mo113264g(String str, String str2, Throwable th);

    /* renamed from: j */
    public abstract void mo113263j(String str, String str2);

    /* renamed from: k */
    public abstract void mo113262k(String str, String str2);

    /* renamed from: l */
    public abstract void mo113261l(String str, String str2, Throwable th);
}
