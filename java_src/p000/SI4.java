package p000;

import java.util.concurrent.TimeUnit;
/* renamed from: SI4 */
/* loaded from: classes6.dex */
public class SI4 {

    /* renamed from: d */
    public static final long f33444d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    public static final long f33445e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final C35201Pi6 f33446a = C35201Pi6.m89901c();

    /* renamed from: b */
    public long f33447b;

    /* renamed from: c */
    public int f33448c;

    /* renamed from: c */
    public static boolean m85766c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    /* renamed from: d */
    public static boolean m85765d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    /* renamed from: a */
    public final synchronized long m85768a(int i) {
        if (!m85766c(i)) {
            return f33444d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f33448c) + this.f33446a.m89899e(), f33445e);
    }

    /* renamed from: b */
    public synchronized boolean m85767b() {
        boolean z;
        if (this.f33448c != 0) {
            if (this.f33446a.m89903a() <= this.f33447b) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    /* renamed from: e */
    public final synchronized void m85764e() {
        this.f33448c = 0;
    }

    /* renamed from: f */
    public synchronized void m85763f(int i) {
        if (m85765d(i)) {
            m85764e();
            return;
        }
        this.f33448c++;
        this.f33447b = this.f33446a.m89903a() + m85768a(i);
    }
}
